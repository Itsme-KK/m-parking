package com.example.iam.finalproject;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.IBinder;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.security.Provider;
import java.util.List;
import java.util.Map;

public class MapsActivity extends FragmentActivity {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();
        changeType();
    }

    private void changeType() {

        if(mMap.getMapType() == GoogleMap.MAP_TYPE_NORMAL)
            {
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
            }
            else
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        }


    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    private void setUpMapIfNeeded() {
        if (mMap == null) {
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            if (mMap != null) {
                setUpMap();
                }
        }
    }

    public void setUpMap() {

        mMap.addMarker(new MarkerOptions().position(new LatLng(19.141168, 73.008487)).title("Parking for Dhirubhai Ambani Life Science Centre"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.107835, 73.020817)).title("Parking Lot, Sector3, MBP"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.105117, 73.010243)).title("Koparkhairne Parking"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.104887, 73.017809)).title("Parking 2 in front of driver's canteen"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.078671, 72.997848)).title("Car Parking"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.066465, 72.996710)).title("Navi Mumbai car Scotter Parking Area"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.064882, 73.008977)).title("Parking Space"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.054711, 73.005482)).title("Parking of Sai Pride"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.041637, 73.023166)).title("DY Patil Hospital Parking Space"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.032544, 73.017420)).title("Pay Park"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.022936, 73.040436)).title("CBD Belapur Highway Parking Lot"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.020992, 73.039802)).title("Railway Station Car Parking"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.020246, 73.040315)).title("Parking Lot"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.018585, 73.085647)).title("Maharaja Auto Garage"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(18.998288, 73.122396)).title("Parking Lot"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(18.998039, 73.122728)).title("Cidco Parking"));

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //public void onRequestPermissionsResult(int requestCode, String[] permissions,int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
    }
}