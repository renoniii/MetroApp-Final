package com.example.metroapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MapsPreTroncales extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_pre_troncales);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapPreTroncales);
        mapFragment.getMapAsync(this);

    }

    //Volver al menu de rutas
    public void onClickBackMenuRutas (View view){
        startActivity(new Intent(MapsPreTroncales.this, MenuRutas.class));
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        //Posicion inicial del mapa
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(7.119601006008948, -73.12275359828378), 13));

        FloatingActionButton buttonShow = findViewById(R.id.buttonShowPreTroncales);
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                        MapsPreTroncales.this, R.style.BottomSheetDialogTheme
                );
                View bottomSheetView = LayoutInflater.from(getApplicationContext())
                        .inflate(
                                R.layout.layout_bottom_sheet_pre_troncales,
                                (LinearLayout)findViewById(R.id.bottomSheetContainer)
                        );

                //Ruta P3
                bottomSheetView.findViewById(R.id.btnRutaP3).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mMap.clear();

                        //Ruta ida
                        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                                .clickable(true)
                                .add(
                                        new LatLng(7.066717451687734, -73.09897570131827),

                                        new LatLng(7.061261989523097, -73.10943598315332))
                                .color(Color.BLUE));

                        //Ruta regreso
                        Polyline polyline2 = googleMap.addPolyline(new PolylineOptions()
                                .clickable(true)
                                .add(

                                        new LatLng(7.06150189211704, -73.10976949561856))
                                .color(Color.RED));

                        bottomSheetDialog.dismiss();
                    }
                });

                //Ruta P5
                bottomSheetView.findViewById(R.id.btnRutaP5).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mMap.clear();

                        //Ruta ida
                        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                                .clickable(true)
                                .add(
                                        new LatLng(7.066717451687734, -73.09897570131827),

                                        new LatLng(7.061261989523097, -73.10943598315332))
                                .color(Color.BLUE));

                        //Ruta regreso
                        Polyline polyline2 = googleMap.addPolyline(new PolylineOptions()
                                .clickable(true)
                                .add(

                                        new LatLng(7.06150189211704, -73.10976949561856))
                                .color(Color.RED));

                        bottomSheetDialog.dismiss();
                    }
                });

                //Ruta P6
                bottomSheetView.findViewById(R.id.btnRutaP6).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mMap.clear();

                        //Ruta ida
                        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                                .clickable(true)
                                .add(
                                        new LatLng(7.066717451687734, -73.09897570131827),

                                        new LatLng(7.061261989523097, -73.10943598315332))
                                .color(Color.BLUE));

                        //Ruta regreso
                        Polyline polyline2 = googleMap.addPolyline(new PolylineOptions()
                                .clickable(true)
                                .add(

                                        new LatLng(7.06150189211704, -73.10976949561856))
                                .color(Color.RED));

                        bottomSheetDialog.dismiss();
                    }
                });

                //Ruta P7
                bottomSheetView.findViewById(R.id.btnRutaP7).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mMap.clear();

                        //Ruta ida
                        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                                .clickable(true)
                                .add(
                                        new LatLng(7.066717451687734, -73.09897570131827),

                                        new LatLng(7.061261989523097, -73.10943598315332))
                                .color(Color.BLUE));

                        //Ruta regreso
                        Polyline polyline2 = googleMap.addPolyline(new PolylineOptions()
                                .clickable(true)
                                .add(

                                        new LatLng(7.06150189211704, -73.10976949561856))
                                .color(Color.RED));

                        bottomSheetDialog.dismiss();
                    }
                });

                //Ruta P13
                bottomSheetView.findViewById(R.id.btnRutaP13).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mMap.clear();

                        //Ruta ida
                        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                                .clickable(true)
                                .add(
                                        new LatLng(7.066717451687734, -73.09897570131827),

                                        new LatLng(7.061261989523097, -73.10943598315332))
                                .color(Color.BLUE));

                        //Ruta regreso
                        Polyline polyline2 = googleMap.addPolyline(new PolylineOptions()
                                .clickable(true)
                                .add(

                                        new LatLng(7.06150189211704, -73.10976949561856))
                                .color(Color.RED));

                        bottomSheetDialog.dismiss();
                    }
                });

                //Ruta P15
                bottomSheetView.findViewById(R.id.btnRutaP15).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mMap.clear();

                        //Ruta ida
                        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                                .clickable(true)
                                .add(
                                        new LatLng(7.066717451687734, -73.09897570131827),

                                        new LatLng(7.061261989523097, -73.10943598315332))
                                .color(Color.BLUE));

                        //Ruta regreso
                        Polyline polyline2 = googleMap.addPolyline(new PolylineOptions()
                                .clickable(true)
                                .add(

                                        new LatLng(7.06150189211704, -73.10976949561856))
                                .color(Color.RED));

                        bottomSheetDialog.dismiss();
                    }
                });

                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();

            }
        });

    }
}