package com.example.metroapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class Tarjeta extends AppCompatActivity {

    Button btnFondos;
    TextView txtSaldoint, txtNroTarjeta, txtNombre;
    CheckBox rbSaldo1;
    CheckBox rbSaldo2;
    CheckBox rbSaldo3;
    CheckBox rbSaldo4;
    int valor1;
    int r;

    FirebaseAuth firebaseAuth;
    FirebaseUser user;

    DatabaseReference BASE_DE_DATOS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarjeta);

        btnFondos = findViewById(R.id.btnFondos);
        txtSaldoint = findViewById(R.id.txtSaldoint);
        txtNroTarjeta = findViewById(R.id.txtNroTarjeta);
        txtNombre = findViewById(R.id.txtNombre);

        rbSaldo1 = findViewById(R.id.rbSaldo1);
        rbSaldo2 = findViewById(R.id.rbSaldo2);
        rbSaldo3 = findViewById(R.id.rbSaldo3);
        rbSaldo4 = findViewById(R.id.rbSaldo4);

        firebaseAuth = FirebaseAuth.getInstance();
        user = firebaseAuth.getCurrentUser();



        BASE_DE_DATOS = FirebaseDatabase.getInstance().getReference("USUARIOSS_DE_APP");

        //obtenemos datos del usuario
        BASE_DE_DATOS.child(user.getUid()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                //si el usuario existe
                if(snapshot.exists()){

                    //obtener datos
                    String uid = ""+snapshot.child("uid").getValue();
                    String name = ""+snapshot.child("name").getValue();
                    String idTarjeta = ""+snapshot.child("idtarjeta").getValue();
                    String saldoInicial = ""+snapshot.child("saldoInicial").child("saldoInicial").getValue();

                    //colocar datos
                    txtSaldoint.setText(saldoInicial);
                    txtNroTarjeta.setText(idTarjeta);
                    txtNombre.setText("Hola, "+name);


                }

            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        btnFondos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               int acomulado=Integer.parseInt(txtSaldoint.getText().toString());



                if (rbSaldo1.isChecked()){



                    int resultado1 = acomulado+2500;
                    r=resultado1;

                }if (rbSaldo2.isChecked()){

                    int resultado2 = acomulado+5000;
                    r=resultado2;

                }if (rbSaldo3.isChecked()){

                    int resultado3 = acomulado+10000;
                    r=resultado3;

                }if (rbSaldo4.isChecked()){

                    int resultado4 = acomulado+20000;
                    r=resultado4;
                }
                txtSaldoint.setText(Integer.toString(r));

                FirebaseUser user = firebaseAuth.getCurrentUser();

                String uid = user.getUid();
                String saldoInicial = txtSaldoint.getText().toString();

                HashMap<String,Object> DatosUsuario = new HashMap<>();

                DatosUsuario.put("saldoInicial", saldoInicial);

                FirebaseDatabase database = FirebaseDatabase.getInstance();

                DatabaseReference reference = database.getReference("USUARIOSS_DE_APP");

                reference.child(uid).child("saldoInicial").updateChildren(DatosUsuario);

            }
        });

    }

    //metodo para volver al menu"
    public void onClickMenu(View view){
        startActivity(new Intent(Tarjeta.this, Menu.class));
    }


}