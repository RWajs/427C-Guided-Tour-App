package com.example.ryan.queensutour;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;

public class GoogleMapOfCampus extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.
    private HashMap<String, String> markerMap = new HashMap<String, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_map_of_campus);
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
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.MapOfCampus))
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

        markerMap.put("stauffer", mMap.addMarker(new MarkerOptions().position(new LatLng(44.228376, -76.496233)).title("Stauffer Library")).getId());
        markerMap.put("ellis",  mMap.addMarker(new MarkerOptions().position(new LatLng(44.226322, -76.496284)).title("Ellis Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("chernoff",  mMap.addMarker(new MarkerOptions().position(new LatLng(44.224224, -76.498866)).title("Chernoff Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("stirling",  mMap.addMarker(new MarkerOptions().position(new LatLng(44.224597, -76.497744)).title("Stirling Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("lazy",  mMap.addMarker(new MarkerOptions().position(new LatLng(44.225492, -76.498651)).title("The Lazy Scholar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))).getId());

        markerMap.put("banrigh",mMap.addMarker(new MarkerOptions().position(new LatLng(44.224670, -76.496226)).title("Ban Righ Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))).getId());
        markerMap.put("mclaughlin",mMap.addMarker(new MarkerOptions().position(new LatLng(44.223728, -76.495389)).title("McLaughlin Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("jeffery",mMap.addMarker(new MarkerOptions().position(new LatLng(44.225900, -76.496135)).title("Jeffery Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("maccory",mMap.addMarker(new MarkerOptions().position(new LatLng(44.226469, -76.497036)).title("Mackintosh-Corry Hall")).getId());
        markerMap.put("granthall",mMap.addMarker(new MarkerOptions().position(new LatLng(44.225897, -76.495180)).title("Grant Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))).getId());
        markerMap.put("kingstonhall",mMap.addMarker(new MarkerOptions().position(new LatLng(44.225635, -76.494852)).title("Kingston Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))).getId());
        markerMap.put("jduc",mMap.addMarker(new MarkerOptions().position(new LatLng(44.228439, -76.494598)).title("John Deutsch University Centre")).getId());
        markerMap.put("arc", mMap.addMarker(new MarkerOptions().position(new LatLng(44.229154, -76.494340)).title("Queen's Athletics and Recreational Centre")).getId());
        markerMap.put("dupuis", mMap.addMarker(new MarkerOptions().position(new LatLng(44.228543, -76.492694)).title("Dupuis Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("walterlight", mMap.addMarker(new MarkerOptions().position(new LatLng(44.227966, -76.491782)).title("Walter Light Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("gordon",mMap.addMarker(new MarkerOptions().position(new LatLng(44.227305, -76.494507)).title("Gordon Hall")).getId());
        markerMap.put("theological", mMap.addMarker(new MarkerOptions().position(new LatLng(44.225614, -76.493520)).title("Theological Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))).getId());
        markerMap.put("nicol",mMap.addMarker(new MarkerOptions().position(new LatLng(44.227332, -76.493836)).title("Nicol Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))).getId());
        markerMap.put("miller", mMap.addMarker(new MarkerOptions().position(new LatLng(44.227351, -76.492838)).title("Miller Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("summerhill",  mMap.addMarker(new MarkerOptions().position(new LatLng(44.225960, -76.492500)).title("Summerhill").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))).getId());
        markerMap.put("ilc",mMap.addMarker(new MarkerOptions().position(new LatLng(44.228139, -76.492774)).title("Integrated Learning Centre").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("goodwin",  mMap.addMarker(new MarkerOptions().position(new LatLng(44.227950, -76.492399)).title("Goodwin Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("clark",mMap.addMarker(new MarkerOptions().position(new LatLng(44.226693, -76.493850)).title("Clark Hall")).getId());
        markerMap.put("douglas",mMap.addMarker(new MarkerOptions().position(new LatLng(44.227359, -76.495118)).title("Douglas Library")).getId());
        markerMap.put("tindall", mMap.addMarker(new MarkerOptions().position(new LatLng(44.226679, -76.498171)).title("Tindall Field")).getId());
        markerMap.put("nixon", mMap.addMarker(new MarkerOptions().position(new LatLng(44.224907, -76.494683)).title("Nixon Field")).getId());
        markerMap.put("leonard",mMap.addMarker(new MarkerOptions().position(new LatLng(44.224292, -76.500763)).title("Leonard Hall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet("Cafeteria")).getId());
        markerMap.put("anges",mMap.addMarker(new MarkerOptions().position(new LatLng(44.226081, -76.494213)).title("Anges Benidickson Field").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))).getId());



        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                Intent intent = null;
                if (marker.getId().equals(markerMap.get("stauffer"))){
                    intent = new Intent(GoogleMapOfCampus.this,StaufferBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("ellis"))){
                    intent = new Intent(GoogleMapOfCampus.this,EllisHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("chernoff"))){
                    intent = new Intent(GoogleMapOfCampus.this,ChernoffHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("stirling"))){
                    intent = new Intent(GoogleMapOfCampus.this,StirlingHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("lazy"))){
                    intent = new Intent(GoogleMapOfCampus.this,LazyBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("banrigh"))){
                    intent = new Intent(GoogleMapOfCampus.this,BanBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("mclaughlin"))){
                    intent = new Intent(GoogleMapOfCampus.this,MclaughlinHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("maccory"))){
                    intent = new Intent(GoogleMapOfCampus.this,MacCorryBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("granthall"))){
                    intent = new Intent(GoogleMapOfCampus.this,GrantHallBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("kingstonhall"))){
                    intent = new Intent(GoogleMapOfCampus.this,KingstonHallBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("jduc"))){
                    intent = new Intent(GoogleMapOfCampus.this,JDUCBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("arc"))){
                    intent = new Intent(GoogleMapOfCampus.this,ARCBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("dupuis"))){
                    intent = new Intent(GoogleMapOfCampus.this,DupuisHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("walterlight"))){
                    intent = new Intent(GoogleMapOfCampus.this,WalterLightBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("gordon"))){
                    intent = new Intent(GoogleMapOfCampus.this,GordonBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("theological"))){
                    intent = new Intent(GoogleMapOfCampus.this,TheologicalHallBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("nicol"))){
                    intent = new Intent(GoogleMapOfCampus.this,NicolHallBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("miller"))){
                    intent = new Intent(GoogleMapOfCampus.this,MillerHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("summerhill"))){
                    intent = new Intent(GoogleMapOfCampus.this,SummerhillBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("ilc"))){
                    intent = new Intent(GoogleMapOfCampus.this,ILCBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("goodwin"))){
                    intent = new Intent(GoogleMapOfCampus.this,GoodwinHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("clark"))){
                    intent = new Intent(GoogleMapOfCampus.this,ClarkHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("douglas"))){
                    intent = new Intent(GoogleMapOfCampus.this,DouglasBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("tindall"))){
                    intent = new Intent(GoogleMapOfCampus.this,TindallBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("nixon"))){
                    intent = new Intent(GoogleMapOfCampus.this,NixonFieldBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("leonard"))){
                    intent = new Intent(GoogleMapOfCampus.this,LeonardBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("jeffery"))){
                    intent = new Intent(GoogleMapOfCampus.this,JefferyHallBldg.class);
                }
                else{
                    intent = new Intent(GoogleMapOfCampus.this,BenidicksonBldg.class);
                }
                startActivity(intent);
                System.out.println(marker.getId());

            }
        });




    }
}
