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
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    TextView TxtToLogin, TxtCrear;
    MaterialButton BtnCrear;
    ImageView ImgLogoR;
    EditText InputNombre, InputEmail, InputPasswd, InputPasswdConfirm;
    MaterialButton inicioSesion;
    private FirebaseAuth mAuth;

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
        InputPasswd = findViewById(R.id.InputPasswd);
        InputPasswdConfirm = findViewById(R.id.InputPasswdConfirm);
        inicioSesion = findViewById(R.id.BtnEntrar);

        mAuth = FirebaseAuth.getInstance();

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
                    return;
                }
                else{
                    InputEmail.setError(null);
                }

                if(password.isEmpty() || password.length() < 8){
                    InputPasswd.setError("Se necesitan al menos 8 carácteres");
                    return;
                }
                else{
                    InputPasswd.setError(null);
                }

                if(!confirmPassword.equals(password)){
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
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(Register.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Register.this, Login.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(Register.this, "Error en registrarse", Toast.LENGTH_SHORT).show();
                }
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