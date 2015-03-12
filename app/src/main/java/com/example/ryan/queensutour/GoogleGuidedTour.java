package com.example.ryan.queensutour;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleGuidedTour extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_guided_tour);
        setUpMapIfNeeded();
        mMap.setMyLocationEnabled(true);

    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.GuidedTourMap))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.226322, -76.496284)).title("Ellis Hall"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.228376, -76.496233)).title("Stauffer Library"));

        mMap.addMarker(new MarkerOptions().position(new LatLng(44.224224, -76.498866)).title("Chernoff Hall"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.224597, -76.497744)).title("Stirling Hall"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.225492, -76.498651)).title("Victoria Hall"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.224670, -76.496226)).title("Ban Righ Hall"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.223728, -76.495389)).title("McLaughlin Hall"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.225900, -76.496135)).title("Jeffry Hall"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.226469, -76.497036)).title("Mackintosh-Corry Hall"));



        mMap.addMarker(new MarkerOptions().position(new LatLng(44.225883, -76.495150)).title("Grant Hall/Kingston Hall"));

        mMap.addMarker(new MarkerOptions().position(new LatLng(44.228439, -76.494598)).title("John Deutsch University Centre"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.229154, -76.494340)).title("Queen's Athletics and Recreational Centre"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.228543, -76.492694)).title("Dupuis Hall"));

        mMap.addMarker(new MarkerOptions().position(new LatLng(44.227966, -76.491782)).title("Walter Light Hall"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.227305, -76.494507)).title("Gordon Hall"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.225614, -76.493520)).title("Theological Hall"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.227332, -76.493836)).title("Nicol Hall"));

        mMap.addMarker(new MarkerOptions().position(new LatLng(44.227351, -76.492838)).title("Miller Hall"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.225960, -76.492500)).title("Summerhill"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.228139, -76.492774)).title("Integrated Learning Centre"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.227950, -76.492399)).title("Goodwin Hall"));

        mMap.addMarker(new MarkerOptions().position(new LatLng(44.226693, -76.493850)).title("Clark Hall"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.227359, -76.495118)).title("Douglas Library"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.226679, -76.498171)).title("Tindall Field"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(44.224907, -76.494683)).title("Nixon Field"));

    }
}
