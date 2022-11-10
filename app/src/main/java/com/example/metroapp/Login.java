package com.example.metroapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
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
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

    TextView ToRegister;
    EditText InputLoginEmail, InputLoginPasswd;
    MaterialButton BtnEntrar;
    ImageView ImgLogo;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ToRegister = findViewById(R.id.TxtToRegister);
        InputLoginEmail = findViewById(R.id.InputLoginEmail);
        InputLoginPasswd = findViewById(R.id.InputLoginPasswd);
        BtnEntrar = findViewById(R.id.BtnEntrar);
        ImgLogo = findViewById(R.id.ImgLogo);

        firebaseAuth = FirebaseAuth.getInstance();

        //abrir activity de registro
        ToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Register.class);

                Pair[] pairs = new Pair[9];
                pairs[0] = new Pair<View, String>(ImgLogo,"logoImageTrans2");
                pairs[1] = new Pair<View, String>(ImgLogo,"textTrans2");
                pairs[2] = new Pair<View, String>(InputLoginEmail,"inputNameTrans2");
                pairs[3] = new Pair<View, String>(InputLoginEmail,"inputEmailTrans2");
                pairs[4] = new Pair<View, String>(InputLoginPasswd,"inputPasswdTrans2");
                pairs[5] = new Pair<View, String>(InputLoginPasswd,"inputPasswdTrans3");
                pairs[6] = new Pair<View, String>(BtnEntrar,"btnTrans2");
                pairs[7] = new Pair<View, String>(ToRegister,"textTrans3");
                pairs[8] = new Pair<View, String>(ToRegister,"btnTrans3");

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login.this, pairs);
                    startActivity(intent, options.toBundle());
                } else {
                    startActivity(intent);
                    finish();
                }
            }
        });

        BtnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = InputLoginEmail.getText().toString().trim();
                String password = InputLoginPasswd.getText().toString().trim();

                if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    InputLoginEmail.setError("Correo inválido");
                    InputLoginEmail.setFocusable(true);

                }else if (password.isEmpty()) {
                    InputLoginPasswd.setError("El campo no puede quedar vacío");
                    InputLoginPasswd.setFocusable(true);
                } else {
                    iniciarSesion(email, password);
                }
            }

        });
    }

    public void iniciarSesion(String email, String password){

        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent intent = new Intent(Login.this, Menu.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(Login.this, "Información incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}