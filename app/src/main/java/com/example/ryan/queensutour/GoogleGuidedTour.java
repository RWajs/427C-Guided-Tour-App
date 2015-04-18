package com.example.ryan.queensutour;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.PopupWindow;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.HashMap;

public class GoogleGuidedTour extends FragmentActivity {




    private GoogleMap mMap; // Might be null if Google Play services APK is not available.
    private HashMap<String, String> markerMap = new HashMap<String, String>();
    PolylineOptions rectOptions = new PolylineOptions()

            .add(new LatLng(44.22782, -76.49290))
            .add(new LatLng(44.22779, -76.49242))
            .add(new LatLng(44.22774, -76.49164))
            .add(new LatLng(44.22758, -76.49165))
            .add(new LatLng(44.22763, -76.49273))
            .add(new LatLng(44.22768, -76.49348))
            .add(new LatLng(44.22751, -76.49349))
            .add(new LatLng(44.22692, -76.49349))
            .add(new LatLng(44.22595, -76.49348))
            .add(new LatLng(44.22591, -76.49400))
            .add(new LatLng(44.22555, -76.49448))
            .add(new LatLng(44.22540, -76.49449))
            .add(new LatLng(44.22535, -76.49484))
            .add(new LatLng(44.22533, -76.49551))
            .add(new LatLng(44.22421, -76.49553))
            .add(new LatLng(44.22417, -76.49569))
            .add(new LatLng(44.22481, -76.49571))
            .add(new LatLng(44.22493, -76.49597))
            .add(new LatLng(44.22487, -76.49673))
            .add(new LatLng(44.22491, -76.49717))
            .add(new LatLng(44.22496, -76.49740))
            .add(new LatLng(44.22499, -76.49768))
            .add(new LatLng(44.22499, -76.49790))
            .add(new LatLng(44.22497, -76.49810))
            .add(new LatLng(44.22488, -76.49854))
            .add(new LatLng(44.22478, -76.49885))
            .add(new LatLng(44.22455, -76.49932))
            .add(new LatLng(44.22430, -76.49972))
            .add(new LatLng(44.22421, -76.49972))
            .add(new LatLng(44.22422, -76.49984))
            .add(new LatLng(44.22426, -76.49990))
            .add(new LatLng(44.22421, -76.50037))
            .add(new LatLng(44.22434, -76.50038))
            .add(new LatLng(44.22451, -76.49966))
            .add(new LatLng(44.22472, -76.49922))
            .add(new LatLng(44.22494, -76.49882))
            .add(new LatLng(44.22500, -76.49858))
            .add(new LatLng(44.22508, -76.49822))
            .add(new LatLng(44.22522, -76.49801))
            .add(new LatLng(44.22533, -76.49774))
            .add(new LatLng(44.22536, -76.49745))
            .add(new LatLng(44.22555, -76.49700))
            .add(new LatLng(44.22576, -76.49698))
            .add(new LatLng(44.22576, -76.49679))
            .add(new LatLng(44.22564, -76.49678))
            .add(new LatLng(44.22565, -76.49613))
            .add(new LatLng(44.22565, -76.49571))
            .add(new LatLng(44.22587, -76.49571))
            .add(new LatLng(44.22623, -76.49571))
            .add(new LatLng(44.22782, -76.49572))
            .add(new LatLng(44.22802, -76.49574))
            .add(new LatLng(44.22800, -76.49547))
            .add(new LatLng(44.22796, -76.49499))
            .add(new LatLng(44.22783, -76.49317))
            .add(new LatLng(44.22785, -76.49309))
            .add(new LatLng(44.22857, -76.49313))
            ;

    //DO NOT DELETE!!!!!!
    //ENCODED POLYLINE
    // {f}lGr_{qMD_BH{C^@IvEItC`@@tB?`EAFfBfA~A\@HdABdC~EBF^_CBWr@JvCGvAIl@Ev@?j@Bf@PvAR|@l@|Ap@nAP?AVGJH|AY@a@oCi@wAk@oAKo@OgA[i@Uu@Ey@e@yAi@C?e@VAAaC?sAk@?gA?}H@g@BBu@F_BXkJCOoCF
    //ENCODED LEVELS
    // BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
    // https://developers.google.com/maps/documentation/utilities/polylineutility


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_guided_tour);
        setUpMapIfNeeded();
        mMap.setMyLocationEnabled(true);
        Polyline polyline = mMap.addPolyline(rectOptions);


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

    private void setUpMap() {

        markerMap.put("stauffer", mMap.addMarker(new MarkerOptions().position(new LatLng(44.228376, -76.496233)).title("Stauffer Library").snippet("Non-Engineering")).getId());
        markerMap.put("ellis",  mMap.addMarker(new MarkerOptions().position(new LatLng(44.226322, -76.496284)).title("Ellis Hall").snippet("Engineering").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("chernoff",  mMap.addMarker(new MarkerOptions().position(new LatLng(44.224224, -76.498866)).title("Chernoff Hall").snippet("Engineering").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("stirling",  mMap.addMarker(new MarkerOptions().position(new LatLng(44.224597, -76.497744)).title("Stirling Hall").snippet("Engineering").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("lazy",  mMap.addMarker(new MarkerOptions().position(new LatLng(44.225492, -76.498651)).title("The Lazy Scholar").snippet("Cafeteria").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))).getId());

        markerMap.put("banrigh",mMap.addMarker(new MarkerOptions().position(new LatLng(44.224670, -76.496226)).title("Ban Righ Hall").snippet("Cafeteria").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))).getId());
        markerMap.put("mclaughlin",mMap.addMarker(new MarkerOptions().position(new LatLng(44.223728, -76.495389)).title("McLaughlin Hall").snippet("Engineering").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("jeffery",mMap.addMarker(new MarkerOptions().position(new LatLng(44.225900, -76.496135)).title("Jeffery Hall").snippet("Engineering").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("maccory",mMap.addMarker(new MarkerOptions().position(new LatLng(44.226469, -76.497036)).title("Mackintosh-Corry Hall").snippet("Non-Engineering")).getId());
        markerMap.put("granthall",mMap.addMarker(new MarkerOptions().position(new LatLng(44.225897, -76.495180)).title("Grant Hall").snippet("Historical").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))).getId());
        markerMap.put("kingstonhall",mMap.addMarker(new MarkerOptions().position(new LatLng(44.225635, -76.494852)).title("Kingston Hall").snippet("Historical").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))).getId());
        markerMap.put("jduc",mMap.addMarker(new MarkerOptions().position(new LatLng(44.228439, -76.494598)).title("John Deutsch University Centre").snippet("Non-Engineering")).getId());
        markerMap.put("arc", mMap.addMarker(new MarkerOptions().position(new LatLng(44.229154, -76.494340)).title("Queen's Athletics and Recreational Centre").snippet("Non-Engineering")).getId());
        markerMap.put("dupuis", mMap.addMarker(new MarkerOptions().position(new LatLng(44.228543, -76.492694)).title("Dupuis Hall").snippet("Engineering").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("walterlight", mMap.addMarker(new MarkerOptions().position(new LatLng(44.227966, -76.491782)).title("Walter Light Hall").snippet("Engineering").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("gordon",mMap.addMarker(new MarkerOptions().position(new LatLng(44.227305, -76.494507)).title("Gordon Hall").snippet("Non-Engineering")).getId());
        markerMap.put("theological", mMap.addMarker(new MarkerOptions().position(new LatLng(44.225614, -76.493520)).title("Theological Hall").snippet("Historical").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))).getId());
        markerMap.put("nicol",mMap.addMarker(new MarkerOptions().position(new LatLng(44.227332, -76.493836)).title("Nicol Hall").snippet("Historical").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))).getId());
        markerMap.put("miller", mMap.addMarker(new MarkerOptions().position(new LatLng(44.227351, -76.492838)).title("Miller Hall").snippet("Engineering").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("summerhill",  mMap.addMarker(new MarkerOptions().position(new LatLng(44.225960, -76.492500)).title("Summerhill").snippet("Historical").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))).getId());
        markerMap.put("ilc",mMap.addMarker(new MarkerOptions().position(new LatLng(44.228139, -76.492774)).title("Integrated Learning Centre").snippet("Engineering").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("goodwin",  mMap.addMarker(new MarkerOptions().position(new LatLng(44.227950, -76.492399)).title("Goodwin Hall").snippet("Engineering").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))).getId());
        markerMap.put("clark",mMap.addMarker(new MarkerOptions().position(new LatLng(44.226693, -76.493850)).title("Clark Hall").snippet("Engineering")).getId());
        markerMap.put("douglas",mMap.addMarker(new MarkerOptions().position(new LatLng(44.227359, -76.495118)).title("Douglas Library").snippet("Non-Engineering")).getId());
        markerMap.put("tindall", mMap.addMarker(new MarkerOptions().position(new LatLng(44.226679, -76.498171)).title("Tindall Field").snippet("Non-Engineering")).getId());
        markerMap.put("nixon", mMap.addMarker(new MarkerOptions().position(new LatLng(44.224907, -76.494683)).title("Nixon Field").snippet("Non-Engineering")).getId());
        markerMap.put("leonard",mMap.addMarker(new MarkerOptions().position(new LatLng(44.224292, -76.500763)).title("Leonard Hall").snippet("Cafeteria").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))).getId());
        markerMap.put("anges",mMap.addMarker(new MarkerOptions().position(new LatLng(44.226081, -76.494213)).title("Anges Benidickson Field").snippet("Historical").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))).getId());



        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                Intent intent = null;
                if (marker.getId().equals(markerMap.get("stauffer"))){
                    intent = new Intent(GoogleGuidedTour.this,StaufferBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("ellis"))){
                    intent = new Intent(GoogleGuidedTour.this,EllisHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("chernoff"))){
                    intent = new Intent(GoogleGuidedTour.this,ChernoffHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("stirling"))){
                    intent = new Intent(GoogleGuidedTour.this,StirlingHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("lazy"))){
                    intent = new Intent(GoogleGuidedTour.this,LazyBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("banrigh"))){
                    intent = new Intent(GoogleGuidedTour.this,BanBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("mclaughlin"))){
                    intent = new Intent(GoogleGuidedTour.this,MclaughlinHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("maccory"))){
                    intent = new Intent(GoogleGuidedTour.this,MacCorryBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("granthall"))){
                    intent = new Intent(GoogleGuidedTour.this,GrantHallBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("kingstonhall"))){
                    intent = new Intent(GoogleGuidedTour.this,KingstonHallBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("jduc"))){
                    intent = new Intent(GoogleGuidedTour.this,JDUCBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("arc"))){
                    intent = new Intent(GoogleGuidedTour.this,ARCBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("dupuis"))){
                    intent = new Intent(GoogleGuidedTour.this,DupuisHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("walterlight"))){
                    intent = new Intent(GoogleGuidedTour.this,WalterLightBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("gordon"))){
                    intent = new Intent(GoogleGuidedTour.this,GordonBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("theological"))){
                    intent = new Intent(GoogleGuidedTour.this,TheologicalHallBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("nicol"))){
                    intent = new Intent(GoogleGuidedTour.this,NicolHallBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("miller"))){
                    intent = new Intent(GoogleGuidedTour.this,MillerHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("summerhill"))){
                    intent = new Intent(GoogleGuidedTour.this,SummerhillBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("ilc"))){
                    intent = new Intent(GoogleGuidedTour.this,ILCBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("goodwin"))){
                    intent = new Intent(GoogleGuidedTour.this,GoodwinHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("clark"))){
                    intent = new Intent(GoogleGuidedTour.this,ClarkHallBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("douglas"))){
                    intent = new Intent(GoogleGuidedTour.this,DouglasBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("tindall"))){
                    intent = new Intent(GoogleGuidedTour.this,TindallBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("nixon"))){
                    intent = new Intent(GoogleGuidedTour.this,NixonFieldBldg.class);
                }
                else if (marker.getId().equals(markerMap.get("leonard"))){
                    intent = new Intent(GoogleGuidedTour.this,LeonardBuilding.class);
                }
                else if (marker.getId().equals(markerMap.get("jeffery"))){
                    intent = new Intent(GoogleGuidedTour.this,JefferyHallBldg.class);
                }
                else{
                    intent = new Intent(GoogleGuidedTour.this,BenidicksonBldg.class);
                }
                startActivity(intent);
                System.out.println(marker.getId());

            }
        });



    }
}
