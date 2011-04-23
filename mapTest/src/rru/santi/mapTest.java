package rru.santi;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

import android.widget.LinearLayout;
import android.widget.ZoomControls;

import android.app.Activity;
import android.os.Bundle;

public class mapTest extends MapActivity {
	MapView mapView;
	LinearLayout linearLayout;
	ZoomControls mZoom;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mapView=(MapView) findViewById(R.id.mapview);
        
        linearLayout=(LinearLayout) findViewById(R.id.zoomview);
        mZoom=(ZoomControls) mapView.getZoomControls();
        linearLayout.addView(mZoom);
    }
    protected boolean isRouteDisplayed(){
    	
    	return false;
    }
}