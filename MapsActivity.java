package com.example.gwcchi11a.mapsn;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;

import android.graphics.Color;
import android.graphics.Point;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
//import gms.drive.*;
import android.support.v4.app.FragmentActivity;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected  void onCreate (Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Blue Line
        LatLng chicago = new LatLng(41.878114, -87.629798);
        LatLng O_Hare = new LatLng(41.977984, -87.906486);
        LatLng Rosemount = new LatLng(41.984146, -87.860275);
        LatLng Cumberland = new LatLng(41.983786, -87.836502);
        LatLng Harlem_Ohare = new LatLng(41.982341, -87.807532);
        LatLng Jefferson_Park = new LatLng(41.970374, -87.762968);
        LatLng Montrose = new LatLng(41.960837, -87.743566);
        LatLng Irving_Park = new LatLng(41.953625, -87.729538);
        LatLng Addison = new LatLng(41.946512, -87.718528);
        LatLng Belmont = new LatLng(41.939117, -87.712212);
        LatLng Logan_Square = new LatLng(41.929250, -87.708227);
        LatLng California = new LatLng(41.922191, -87.697135);
        LatLng Western_Ohare = new LatLng(41.915888, -87.687743);
        LatLng Damen = new LatLng(41.909919, -87.677622);
        LatLng Division = new LatLng(41.903347, -87.666466);
        LatLng Chicago = new LatLng(41.896425, -87.655953);
        LatLng Grand = new LatLng(41.891253, -87.647738);
        LatLng Clark_Lake = new LatLng(41.885749, -87.630376);
        LatLng Washington = new LatLng(41.882603, -87.629423);
        LatLng Monroe = new LatLng(41.880467, -87.629398);
        LatLng Jackson = new LatLng(41.877333, -87.629301);
        LatLng LaSalle = new LatLng(41.875762, -87.633061);
        LatLng Clinton = new LatLng(41.876018, -87.641299);
        LatLng UIC_Halsted = new LatLng(41.875897, -87.657015);
        LatLng Racine = new LatLng(41.875807, -87.647296);
        LatLng IllinoisMedicalDistrict = new LatLng(41.875807, -87.647296);
        LatLng Western_ForestPark = new LatLng(41.875075, -87.689147);
        LatLng Kedzie_Homan = new LatLng(41.874188, -87.705940);
        LatLng Pulaski = new LatLng(41.873946, -87.725443);
        LatLng Cicero = new LatLng(41.871367, -87.744957);
        LatLng Austin = new LatLng(41.866785, -87.774188);
        LatLng Oak_Park = new LatLng(41.871042, -87.793926);
        LatLng Harlem_ForestPark = new LatLng(41.873357, -87.804476);
        LatLng Forest_Park = new LatLng(41.873527, -87.817001);

        ///Yellow Line_
        LatLng Dempster_Skokie = new LatLng(42.0404119, -87.7518374);
        LatLng Oakton_Skokie = new LatLng(42.026466, -87.74755390000001);
        LatLng Howard = new LatLng(42.0184516, -87.67299049999997);

        ///PINK Line

        LatLng fivefourCermak = new LatLng(41.852077, -87.759034);
        LatLng Cicero_Pink = new LatLng(41.851853, -87.744297);
        LatLng Kostner = new LatLng(41.854114, -87.734583);
        LatLng Pulaski_Pink = new LatLng(41.854032, -87.724797);
        LatLng Central_Park = new LatLng(41.854105, -87.715040);
        LatLng Kedzie = new LatLng(41.854084, -87.705326);
        LatLng California_Pink = new LatLng(41.854376, -87.695489);
        LatLng Western = new LatLng(41.854302, -87.685662);
        LatLng Eigthteen = new LatLng(41.857761, -87.669167);
        LatLng Polk = new LatLng(41.871574, -87.669564);
        LatLng Ashland = new LatLng(41.885323, -87.666937);
        LatLng Morgan = new LatLng(41.885592, -87.651972);
        LatLng Clinton_Pink = new LatLng(41.885719, -87.641290);
        LatLng Clark_Lake_PINK = new LatLng(41.885749, -87.630376);
        LatLng State_Lake = new LatLng(41.885762, -87.628037);
        LatLng Randolph_Wabash = new LatLng(41.884595, -87.626205);
        LatLng Adams_Wabash = new LatLng(41.879482, -87.626108);
        LatLng State_VanBuren = new LatLng(41.876927, -87.628621);
        LatLng LaSalle_VanBuren = new LatLng(41.876865, -87.631527);
        LatLng Quincy = new LatLng(41.878781, -87.633783);
        LatLng Washington_Wells = new LatLng(41.883233, -87.633895);
        ///PURPLE Line
        LatLng Linden = new LatLng(42.073676, -87.691356);
        LatLng Central = new LatLng (42.064071, -87.685778);
        LatLng Noyes = new LatLng(42.058469, -87.68426);
        LatLng Foster = new LatLng (42.053910, -87.683214);
        LatLng Davis= new LatLng(42.047526, -87.683552);
        LatLng Dempster = new LatLng(42.041845, -87.682641) ;
        LatLng Main = new LatLng(42.033341, -87.679488) ;
        LatLng South_Boulevard = new LatLng(42.027753, -87.679073) ;
        LatLng Howard_Purple = new LatLng(42.018452, -87.67299) ;
        LatLng Wilson = new LatLng(41.965630, -87.65762) ;
        LatLng Sheridan = new LatLng(41.954141, -87.654552) ;
        LatLng Belmont_Purple = new LatLng(41.939721, -87.653466);
        LatLng Wellingon = new LatLng(41.936159, -87.653308);
        LatLng Diversey = new LatLng(41.932634, -87.652937);
        LatLng Fullerton = new LatLng(41.925298, -87.652775);
        LatLng Armitage = new LatLng(41.918114, -87.652733);
        LatLng Sedgwick = new LatLng(41.910403, -87.638889);
        LatLng Chicago_Purple = new LatLng(41.896601, -87.635717);
        LatLng MerchandiseMart = new LatLng(41.888461, -87.634014);




        ArrayList<LatLng> stops_blue_line = new ArrayList<LatLng>(Arrays.asList(Harlem_ForestPark, O_Hare, Rosemount, Cumberland, Harlem_Ohare, Jefferson_Park, Montrose, Irving_Park, Addison, Belmont, Logan_Square, California, Western_Ohare, Damen, Division, Chicago, Grand, Clark_Lake, Washington, Monroe, Jackson, LaSalle, Clinton, UIC_Halsted, Racine, IllinoisMedicalDistrict, Western_ForestPark, Kedzie_Homan, Pulaski, Cicero, Austin, Oak_Park, Harlem_Ohare, Forest_Park));
        ArrayList<LatLng> stops_yellow_line = new ArrayList<LatLng>(Arrays.asList(Dempster_Skokie, Oakton_Skokie, Howard));
        ArrayList<LatLng> stops_pink_line = new ArrayList<LatLng>(Arrays.asList(fivefourCermak, Cicero_Pink, Kostner, Pulaski_Pink, Central_Park, Kedzie, California_Pink, Western, Eigthteen, Polk, Ashland, Morgan, Clinton_Pink, Clark_Lake_PINK, State_Lake, Randolph_Wabash, Adams_Wabash, State_VanBuren, LaSalle_VanBuren, Quincy, Washington_Wells));
        ArrayList<LatLng> stops_purple_line = new ArrayList<LatLng>(Arrays.asList(Linden,Central,Noyes,Foster,Davis,Dempster, Main,South_Boulevard,Howard_Purple,Wilson,Sheridan,Belmont_Purple,Wellingon,Diversey,Fullerton,Armitage,Sedgwick,Chicago_Purple,MerchandiseMart));

        mMap.addMarker(new MarkerOptions().position(chicago).title("Marker in Chicago"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chicago));
        for (LatLng place : stops_blue_line) {
            mMap.addCircle(new CircleOptions()
                    .center(place)
                    .radius(100)
                    .strokeColor(Color.RED)
                    .fillColor(Color.BLUE));
        }
        for (LatLng placeY : stops_yellow_line) {
            mMap.addCircle(new CircleOptions()
                    .center(placeY)
                    .radius(100)
                    .strokeColor(Color.RED)
                    .fillColor(Color.YELLOW));
        }
        for (LatLng placeP : stops_pink_line) {
            mMap.addCircle(new CircleOptions()
                    .center(placeP)
                    .radius(100)
                    .strokeColor(Color.RED)
                    .fillColor(Color.MAGENTA));

        }

        for (LatLng placePu : stops_purple_line) {
            mMap.addCircle(new CircleOptions()
                    .center(placePu)
                    .radius(100)
                    .strokeColor(Color.RED)
                    .fillColor(Color.LTGRAY));
        }

    }
}