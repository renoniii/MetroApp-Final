package com.example.metroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class Tarjeta extends AppCompatActivity {

    Button btnFondos;
    TextView txtSaldoint;
    CheckBox rbSaldo1;
    CheckBox rbSaldo2;
    CheckBox rbSaldo3;
    CheckBox rbSaldo4;
    int valor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarjeta);

        btnFondos = findViewById(R.id.btnFondos);
        txtSaldoint = findViewById(R.id.txtSaldoint);
        rbSaldo1 = findViewById(R.id.rbSaldo1);
        rbSaldo2 = findViewById(R.id.rbSaldo2);
        rbSaldo3 = findViewById(R.id.rbSaldo3);
        rbSaldo4 = findViewById(R.id.rbSaldo4);


        btnFondos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int r = 0;

                if (rbSaldo1.isChecked()){

                    int resultado1 = valor1+2500;
                    r+=resultado1;

                }if (rbSaldo2.isChecked()){
                    int resultado2 = valor1+5000;
                    r+=resultado2;

                }if (rbSaldo3.isChecked()){
                    int resultado3 = valor1+10000;
                    r+=resultado3;

                }if (rbSaldo4.isChecked()){
                    int resultado4 = valor1+20000;
                    r+=resultado4;
                }
                txtSaldoint.setText(r);
            }
        });

        /*rbSaldo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFondos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int resultado1 = valor1 + 2500;
                        txtSaldo.setText("Saldo: $ " + resultado1);
                    }
                });
            }
        });

        rbSaldo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFondos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int resultado2 = valor1 + 5000;
                        txtSaldo.setText("Saldo: $ " + resultado2);
                    }
                });
            }
        });

        rbSaldo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFondos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int resultado3 = valor1 + 10000;
                        txtSaldo.setText("Saldo: $ " + resultado3);
                    }
                });
            }
        });

        rbSaldo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFondos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int resultado4 = valor1 + 20000;
                        txtSaldo.setText("Saldo: $ " + resultado4);
                    }
                });
            }
        });*/

    }


}