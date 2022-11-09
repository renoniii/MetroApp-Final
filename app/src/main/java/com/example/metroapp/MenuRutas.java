package com.example.metroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuRutas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_rutas);
    }

    public void onClickBackMenu (View view){
        startActivity(new Intent(MenuRutas.this, Menu.class));
    }

    public void onClickAlimentadoras (View view){
        startActivity(new Intent(MenuRutas.this, MapsActivity.class));
    }

    public void onClickPreTroncales (View view){
        startActivity(new Intent(MenuRutas.this, MapsPreTroncales.class));
    }

    public void onClickTroncales (View view){
        startActivity(new Intent(MenuRutas.this, MapsTroncales.class));
    }

    public void onClickComplementarias (View view){
        startActivity(new Intent(MenuRutas.this, MapsComplementarias.class));
    }

}