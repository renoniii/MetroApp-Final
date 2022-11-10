package com.example.metroapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Random;

public class Register extends AppCompatActivity {

    TextView TxtToLogin, TxtCrear, txtIDTarjeta, txtSaldoInicial;
    MaterialButton BtnCrear;
    ImageView ImgLogoR;
    EditText InputNombre, InputEmail, InputPasswd, InputPasswdConfirm, InputTelefono;
    MaterialButton inicioSesion;

    FirebaseAuth firebaseAuth;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TxtToLogin = findViewById(R.id.TxtToLogin);
        TxtCrear = findViewById(R.id.TxtCrear);
        BtnCrear = findViewById(R.id.BtnCrear);
        ImgLogoR = findViewById(R.id.ImgLogoR);
        InputNombre = findViewById(R.id.InputNombre);
        InputEmail = findViewById(R.id.InputEmail);
        InputTelefono = findViewById(R.id.inputTelefono);
        InputPasswd = findViewById(R.id.InputPasswd);
        InputPasswdConfirm = findViewById(R.id.InputPasswdConfirm);
        inicioSesion = findViewById(R.id.BtnEntrar);
        txtIDTarjeta = findViewById(R.id.txtIDTarjeta);
        txtSaldoInicial = findViewById(R.id.txtSaldoInicial);

        firebaseAuth = FirebaseAuth.getInstance();

        TxtToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transitionBack();
            }
        });


        BtnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = InputEmail.getText().toString().trim();
                String password = InputPasswd.getText().toString().trim();
                String confirmPassword = InputPasswdConfirm.getText().toString().trim();

                if(email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    InputEmail.setError("Correo inválido");
                    InputEmail.setFocusable(true);
                }else if(password.isEmpty() || password.length() < 8){
                    InputPasswd.setError("Se necesitan al menos 8 carácteres");
                    InputEmail.setFocusable(true);
                }
                else if(!confirmPassword.equals(password)){
                    InputPasswdConfirm.setError("Las contraseñas deben ser iguales");
                    return;
                }
                else{
                    registrar(email, password);
                }

            }

        });

    }

    public void registrar(String email, String password){
        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){

                    Random random = new Random();
                    int nroTarjeta = random.nextInt(1000000000);
                    txtIDTarjeta.setText(Integer.toString(nroTarjeta));

                    int valorSaldoInicial = 0;
                    txtSaldoInicial.setText(Integer.toString(valorSaldoInicial));

                    FirebaseUser user = firebaseAuth.getCurrentUser();

                    assert user != null;
                    String uid = user.getUid();
                    String email = InputEmail.getText().toString().trim();
                    String password = InputPasswd.getText().toString().trim();
                    String confirmPassword = InputPasswdConfirm.getText().toString().trim();
                    String name = InputNombre.getText().toString().trim();
                    String telefono = InputTelefono.getText().toString().trim();
                    String idTarjeta = txtIDTarjeta.getText().toString();
                    String saldoInicial = txtSaldoInicial.getText().toString();

                    HashMap<Object,String> DatosUsuario = new HashMap<>();

                    DatosUsuario.put("uid", uid);
                    DatosUsuario.put("correo", email);
                    DatosUsuario.put("password", password);
                    DatosUsuario.put("name", name);
                    DatosUsuario.put("telefono", telefono);
                    DatosUsuario.put("idtarjeta", idTarjeta);
                    DatosUsuario.put("saldoInicial", saldoInicial);

                    FirebaseDatabase database = FirebaseDatabase.getInstance();

                    DatabaseReference reference = database.getReference("USUARIOSS_DE_APP");

                    reference.child(uid).setValue(DatosUsuario);

                    Toast.makeText(Register.this, "Se registró exitosamente", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Register.this, Menu.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(Register.this, "Error al registrarse", Toast.LENGTH_SHORT).show();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Register.this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onBackPressed(){
        transitionBack();
    }

    //metodo para animacion de elementos
    public void transitionBack() {
        Intent intent = new Intent(Register.this, Login.class);

        Pair[] pairs = new Pair[8];
        pairs[0] = new Pair<View, String>(ImgLogoR,"logoImageTrans");
        pairs[1] = new Pair<View, String>(TxtCrear,"logoImageTrans");
        pairs[2] = new Pair<View, String>(InputNombre,"inputEmailTrans");
        pairs[3] = new Pair<View, String>(InputEmail,"inputEmailTrans");
        pairs[4] = new Pair<View, String>(InputPasswd,"inputPasswdTrans");
        pairs[5] = new Pair<View, String>(InputPasswdConfirm,"inputPasswdTrans");
        pairs[6] = new Pair<View, String>(BtnCrear,"btnTrans");
        pairs[7] = new Pair<View, String>(TxtToLogin,"textTrans");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Register.this, pairs);
            startActivity(intent, options.toBundle());
        } else {
            startActivity(intent);
            finish();
        }
    }

}