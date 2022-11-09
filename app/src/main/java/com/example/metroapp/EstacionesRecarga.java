package com.example.metroapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.metroapp.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class EstacionesRecarga extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estaciones_recarga);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapEstacionesRecarga);
        mapFragment.getMapAsync(this);
    }

    public void onClickBackMenuRutas (View view){
        startActivity(new Intent(EstacionesRecarga.this, Menu.class));
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        //Posicion inicial del mapa
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(7.119601006008948, -73.12275359828378), 15));

        LatLng parada2 = new LatLng(7.143772846172851, -73.13022373593887);
        googleMap.addMarker(new MarkerOptions()
                .position(parada2)
                .title("Hábil, sábados, domingos y festivos: 7:00 a 22:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada3 = new LatLng(7.144875039704088, -73.1243329485919);
        googleMap.addMarker(new MarkerOptions()
                .position(parada3)
                .title("Hábil y sábados: 8:15 a 12:30 y 15:30 a 21:00, domingos y festivos: 9:30 a 16:30")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada4 = new LatLng(7.13428493965344, -73.11803898098937);
        googleMap.addMarker(new MarkerOptions()
                .position(parada4)
                .title("Hábil y sábados: 9:00 a 23:00, domingos y festivos: 3:40 a 18:00 y de 19:00 a 23:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada5 = new LatLng(7.132347175591828, -73.12004112352498);
        googleMap.addMarker(new MarkerOptions()
                .position(parada5)
                .title("Hábil, sábados: 7:30 a 12:00 y 14:30 a 19:30")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada6 = new LatLng(7.13095240988251, -73.12395969047542);
        googleMap.addMarker(new MarkerOptions()
                .position(parada6)
                .title("Hábiles, sábados, domingos y festivos: 7:30 a 19:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada7 = new LatLng(7.1280232955901885, -73.12344084534254);
        googleMap.addMarker(new MarkerOptions()
                .position(parada7)
                .title("Lunes a sábados: 8:00 - 20:00, domingos y festivos: 10:00 a 13:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada8 = new LatLng(7.129003214168047, -73.11241417832068);
        googleMap.addMarker(new MarkerOptions()
                .position(parada8)
                .title("Lunes a sábado: 7:00 - 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada9 = new LatLng(7.126540070556354, -73.11205551536668);
        googleMap.addMarker(new MarkerOptions()
                .position(parada9)
                .title("Hábiles y sábados: 7:30 - 19:00, domingos y festivos : 8:00 a 13:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada10 = new LatLng(7.12328046941563, -73.11731559861367);
        googleMap.addMarker(new MarkerOptions()
                .position(parada10)
                .title("Hábil y sábados: 9:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada11 = new LatLng(7.121584649466309, -73.11598452212166);
        googleMap.addMarker(new MarkerOptions()
                .position(parada11)
                .title("Hábil y sábados de 8:00 a 21:00, domingos y festivos de 8:00 a 20:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada12 = new LatLng(7.121903712808787, -73.11147476646508);
        googleMap.addMarker(new MarkerOptions()
                .position(parada12)
                .title("Hábiles: 8:00 a 12:00 y 14:30 a 18:00, sábados: 8:30 a 13:00, domingos y festivos: NO OPERA")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada13 = new LatLng(7.1179405061391074, -73.11979010581638);
        googleMap.addMarker(new MarkerOptions()
                .position(parada13)
                .title("Hábiles: 8:30 a 19:00, sábados: 8:00 a 12:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada14 = new LatLng(7.1166824752436835, -73.11596106046036);
        googleMap.addMarker(new MarkerOptions()
                .position(parada14)
                .title("Hábiles y sábados de 6:00 a 23:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada15 = new LatLng(7.1171672934414065, -73.1112830362166);
        googleMap.addMarker(new MarkerOptions()
                .position(parada15)
                .title("Lunes a sábado de 9:00 a 19:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada16 = new LatLng(7.111332828915807, -73.11013177340998);
        googleMap.addMarker(new MarkerOptions()
                .position(parada16)
                .title("Hábiles y sábados de 8:30 a 21:30")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada17 = new LatLng(7.104197027459888, -73.1242079953529);
        googleMap.addMarker(new MarkerOptions()
                .position(parada17)
                .title("Hábiles y sábados de 7:00 a 19:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada18 = new LatLng(7.104054585236122, -73.12733584974355);
        googleMap.addMarker(new MarkerOptions()
                .position(parada18)
                .title("Hábiles,sábados, domingos y festivos de 7:00 a 22:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada19 = new LatLng(7.103051647294575, -73.12396883177969);
        googleMap.addMarker(new MarkerOptions()
                .position(parada19)
                .title("Hábiles y sábados: 8:00 a 12:30 y de 14:00 a 19:00, domingos y festivos: no laboran")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada20 = new LatLng(7.099680336037507, -73.12905552918309);
        googleMap.addMarker(new MarkerOptions()
                .position(parada20)
                .title("Hábiles: 7:30 a 21:00, sábados, domingos y festivos: 8:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada21 = new LatLng(7.0877477235875395, -73.1296673495636);
        googleMap.addMarker(new MarkerOptions()
                .position(parada21)
                .title("Hábiles y sábados 6:00 a 22:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada22 = new LatLng(7.0877477235875395, -73.1296673495636);
        googleMap.addMarker(new MarkerOptions()
                .position(parada22)
                .title("Hábiles y sábados 6:00 a 22:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada23 = new LatLng(7.083979232969716, -73.1298274413473);
        googleMap.addMarker(new MarkerOptions()
                .position(parada23)
                .title("Hábiles y sábados 7:30 a 20:30, domingos y festivos no laburan")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada24 = new LatLng(7.087174456874759, -73.12278281284905);
        googleMap.addMarker(new MarkerOptions()
                .position(parada24)
                .title("Hábiles y sábados 8:30 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada25 = new LatLng(7.085489688020761, -73.11746084645529);
        googleMap.addMarker(new MarkerOptions()
                .position(parada25)
                .title("Hábiles y sábados 10:00 a 22:00, domingos y festivos: 12:00 a 19:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada26 = new LatLng(7.084113595298856, -73.12152965771449);
        googleMap.addMarker(new MarkerOptions()
                .position(parada26)
                .title("Hábiles y sábados 8:30 a 21:00, domingos y festivos: 8:30 a 19:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada27 = new LatLng(7.081875344679728, -73.12304397551333);
        googleMap.addMarker(new MarkerOptions()
                .position(parada27)
                .title("Lunes a domingo: 8:00 a 21:30")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada28 = new LatLng(7.07796551880143, -73.12469377008347);
        googleMap.addMarker(new MarkerOptions()
                .position(parada28)
                .title("Hábiles y sábados: 7:00 a 12:00 y de 14:00 a 21:00, domingos y festivos de 8:00 a 12:00 y de 14:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada29 = new LatLng(7.079475812379417, -73.11596904031109);
        googleMap.addMarker(new MarkerOptions()
                .position(parada29)
                .title("Hábiles y sábados: 7:00 a 13:30 y de 15:30 a 22:00, domingos y festivos de 7:30 a 13:30 y de 17:00 a 22:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada30 = new LatLng(7.0779932192812005, -73.11757532284516);
        googleMap.addMarker(new MarkerOptions()
                .position(parada30)
                .title("Hábiles y sábados: 8:00 a 12:00 y de 14:30 a 21:00, domingos y festivos de 9:00 a 13:00 y de 16:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada31 = new LatLng(7.091356367355385, -73.10556923804717);
        googleMap.addMarker(new MarkerOptions()
                .position(parada31)
                .title("Hábiles, sábados, domingos y festivos: 7:30 a 22:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada32 = new LatLng(7.0919123157354775, -73.10132373462957);
        googleMap.addMarker(new MarkerOptions()
                .position(parada32)
                .title("Hábiles y sábados de 8:00 a 20:30, domingos y festivos: 7:00 a 12:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada33 = new LatLng(7.093232766778399, -73.09805077815253);
        googleMap.addMarker(new MarkerOptions()
                .position(parada33)
                .title("Hábiles y sábados de 8:00 a 21:00, domingos y festivos: 10:00 a 13:00 y de 16:00 a 20:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada34 = new LatLng(7.092195441662949, -73.09241556967788);
        googleMap.addMarker(new MarkerOptions()
                .position(parada34)
                .title("Hábiles y sábados de 7:00 a 20:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada35 = new LatLng(7.087925375843773, -73.09479324271283);
        googleMap.addMarker(new MarkerOptions()
                .position(parada35)
                .title("Hábiles y sábados de 8:00 a 20:00, domingos y festivos: 8:00 a 12:00 y de 16:00 a 20:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada36 = new LatLng(7.083031743801686, -73.1005474715453);
        googleMap.addMarker(new MarkerOptions()
                .position(parada36)
                .title("Lunes a viernes de 7:30 a 12:00 y de 14:00 a 18:00,sábados de 8:00 a 16:00, domingos y festivos no opera")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada37 = new LatLng(7.079784733014934, -73.10106797405884);
        googleMap.addMarker(new MarkerOptions()
                .position(parada37)
                .title("Hábiles y sábados de 7:30 a 21:30, domingos y festivos de 11:00 a 22:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada38 = new LatLng(7.079716192730369, -73.1010445047302);
        googleMap.addMarker(new MarkerOptions()
                .position(parada38)
                .title("Hábiles y sábados de 8:00 a 19:00, domingos y festivos de 8:00 a 13:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada39 = new LatLng(7.076904234411717, -73.101386920247);
        googleMap.addMarker(new MarkerOptions()
                .position(parada39)
                .title("Hábiles, sábados y domingo de 7:00 a 12:00 y de 14:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada40 = new LatLng(7.0759088992850385, -73.10400293116915);
        googleMap.addMarker(new MarkerOptions()
                .position(parada40)
                .title("Lunes a viernes de 8:00 a 12:30 y de 14:00 a 20:00, sábados 9:00 a 12:30, domingos y festivos 10:00 a 13:00 y de 16:00 a 20:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada41 = new LatLng(7.078557880878917, -73.10830990620455);
        googleMap.addMarker(new MarkerOptions()
                .position(parada41)
                .title("Hábiles y sábados de 6:30 a 21:00, domingos y festivos de 6:30 a 12:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada42 = new LatLng(7.078718702259335, -73.09489124649751);
        googleMap.addMarker(new MarkerOptions()
                .position(parada42)
                .title("Hábiles y sábados de 8:00 a 14:00, domingos y festivos de 9:00 a 13:00 y de 17:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada43 = new LatLng(7.083988937745668, -73.08558063322783);
        googleMap.addMarker(new MarkerOptions()
                .position(parada43)
                .title("Hábiles y sábados de 8:00 a 12:00 y de 14:00 a 18:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada44 = new LatLng(7.07737937213478, -73.08780249832273);
        googleMap.addMarker(new MarkerOptions()
                .position(parada44)
                .title("Lunes a sábados de 8:30 a 12:30 y de 14:30 a 22:30, domingos y festivos de 8:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada45 = new LatLng(7.0762505435052185, -73.08824361705813);
        googleMap.addMarker(new MarkerOptions()
                .position(parada45)
                .title("Hábiles y sábados de 7:00 a 12:30 y de 15:00 a 21:00, domingos y festivos de 8:30 a 19:30")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada46 = new LatLng(7.075562927673213, -73.08974967431827);
        googleMap.addMarker(new MarkerOptions()
                .position(parada46)
                .title("Hábiles de 7:00 a 17:00, sábados de 8:00 a 16:00, domingos y festivos no laburan")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada47 = new LatLng(7.069297554651994, -73.09776184418075);
        googleMap.addMarker(new MarkerOptions()
                .position(parada47)
                .title("Hábiles y sábados de 6:30 a 21:30, domingos y festivos de 7:00 a 14:00 y de 19:00 a 21:30")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada48 = new LatLng(7.061354276624994, -73.10558067637383);
        googleMap.addMarker(new MarkerOptions()
                .position(parada48)
                .title("Hábiles y sábados de 7:00 a 11:00 y de 15:00 a 21:00, domingos y festivos de 7:00 a 11:00 y de 15:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada49= new LatLng(7.061510939894388, -73.09769349529942);
        googleMap.addMarker(new MarkerOptions()
                .position(parada49)
                .title("Hábiles y sábados de 7:30 a 12:30 y de 14:00 a 20:00, domingos y festivos no operan")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada50 = new LatLng(7.066076387398238, -73.09533523330568);
        googleMap.addMarker(new MarkerOptions()
                .position(parada50)
                .title("Hábiles y sábados de 7:00 a 18:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada51 = new LatLng(7.0686676417494505, -73.09261258694804);
        googleMap.addMarker(new MarkerOptions()
                .position(parada51)
                .title("Hábiles y sábados de 7:00 a 21:00, domingos y festivos de 8:00 a 13:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada52 = new LatLng(7.068864747978518, -73.08789374058263);
        googleMap.addMarker(new MarkerOptions()
                .position(parada52)
                .title("Hábiles, sábados, domingos y festivos de 8:00 a 13:00 y de 15:00 a 24:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada53 = new LatLng(7.070363910760487, -73.0821360536091);
        googleMap.addMarker(new MarkerOptions()
                .position(parada53)
                .title("Hábiles, sábados y domingos de 7:00 a 13:00 y de 16:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada54 = new LatLng(7.070196588439858, -73.081195611134);
        googleMap.addMarker(new MarkerOptions()
                .position(parada54)
                .title("Hábiles y sábados de 6:00 a 12:30 y de 14:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada55 = new LatLng(7.067171551329106, -73.08269033465639);
        googleMap.addMarker(new MarkerOptions()
                .position(parada55)
                .title("Lunes a viernes: 8:30 a 21:00, sábados: 9:30 a 13:00 y de 15:00 a 19:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada56 = new LatLng(7.065385391590937, -73.07833039567736);
        googleMap.addMarker(new MarkerOptions()
                .position(parada56)
                .title("Hábiles y sábados de 8:00 a 12:15 y de 12:45 a 20:45, domingos y festivos de 9:00 a 20:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada57 = new LatLng(7.061818152599954, -73.08676705216914);
        googleMap.addMarker(new MarkerOptions()
                .position(parada57)
                .title("Hábiles y sábados de 7:30 a 19:00, domingos y festivos de 8:00 a 12:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada58 = new LatLng(7.036356733540664, -73.06840465230843);
        googleMap.addMarker(new MarkerOptions()
                .position(parada58)
                .title("Hábiles y sábados de 9:30 a 12:00 y de 15:00 a 18:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada59 = new LatLng(6.999760594899461, -73.05894753198764);
        googleMap.addMarker(new MarkerOptions()
                .position(parada59)
                .title("Hábiles y sábados de 8:30 a 22:00, domingos y festivos de 8:30 a 22:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada60 = new LatLng(6.999294012331562, -73.05180743970428);
        googleMap.addMarker(new MarkerOptions()
                .position(parada60)
                .title("Lunes a sábados de 8:00 a 12:30 y de 15:30 a 20:30, domingos y festivos de 9:00 a 13:00 y de 17:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada61 = new LatLng(6.997179091946758, -73.05000116917829);
        googleMap.addMarker(new MarkerOptions()
                .position(parada61)
                .title("Hábiles a sábados de 8:00 a 21:00, domingos y festivos de 9:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada62 = new LatLng(6.9916010047881905, -73.05568327111594);
        googleMap.addMarker(new MarkerOptions()
                .position(parada62)
                .title("Hábiles a sábados de 7:00 a 22:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada63 = new LatLng(6.9921837813976735, -73.0468775321332);
        googleMap.addMarker(new MarkerOptions()
                .position(parada63)
                .title("Hábiles de 7:00 a 21:00, sábados de 8:00 a 12:30 y de 14:30 a 20:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada64 = new LatLng(6.987930639744675, -73.05334231429578);
        googleMap.addMarker(new MarkerOptions()
                .position(parada64)
                .title("Hábiles y sábados de 8:00 a 18:30, domingos y festivos no laboran")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada65 = new LatLng(6.99022413603995, -73.04498132006749);
        googleMap.addMarker(new MarkerOptions()
                .position(parada65)
                .title("Hábiles, sábados, domingos y festivos de 8:00 a 23:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada66 = new LatLng(6.987061464184747, -73.04617356597689);
        googleMap.addMarker(new MarkerOptions()
                .position(parada66)
                .title("Hábiles, sábados, domingos y festivos de 5:40 a 22:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada67 = new LatLng(6.986423548712259, -73.04135391870851);
        googleMap.addMarker(new MarkerOptions()
                .position(parada67)
                .title("Hábiles de 8:00 a 12:00 y de 13:00 a 19:45, sábados de 17:00 a 20:00 y domingos de 8:00 a 13:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada68 = new LatLng(6.977648721871105, -73.04852921385606);
        googleMap.addMarker(new MarkerOptions()
                .position(parada68)
                .title("Hábiles de 8:00 a 12:30 y de 14:30 a 22:00, sábados de 15:00 a 22:00, domingos y festivos de 10:00 a 12:30 y de 14:30 a 22:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada69 = new LatLng(6.975624167003978, -73.05344398800166);
        googleMap.addMarker(new MarkerOptions()
                .position(parada69)
                .title("Hábiles, sábados, domingos y festivos de 7:30 a 12:00 y de 14:00 a 20:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada70 = new LatLng(6.974639114135461, -73.05021589216977);
        googleMap.addMarker(new MarkerOptions()
                .position(parada70)
                .title("Lunes a sábado de 6:30 a 13:00 y de 15:00 a 22:00, domingos y festivos de 9:00 a 13:00 y de 15:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada71 = new LatLng(6.97155646433491, -73.05075871956036);
        googleMap.addMarker(new MarkerOptions()
                .position(parada71)
                .title("Lunes, sábados, domingos y festivos de 7:00 a 12:00 y de 14:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng parada72 = new LatLng(6.971429335760358, -73.05059242260506);
        googleMap.addMarker(new MarkerOptions()
                .position(parada72)
                .title("Hábiles sábados de 8:30 a 21:00, domingos y festivos de 15:00 a 21:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

    }
}
