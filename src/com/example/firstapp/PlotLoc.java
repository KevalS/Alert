package com.example.firstapp;

import com.example.firstapp.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class PlotLoc extends android.support.v4.app.FragmentActivity {
	
	GoogleMap map;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_plot_loc);
		map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                .getMap();
		LatLng sydney = new LatLng(-33.867, 151.206);
		
		map.animateCamera(CameraUpdateFactory.zoomTo(15));
	    map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));
	    
	    MarkerOptions options = new MarkerOptions();
    	options.title("Some marker");
    	options.snippet("The deal has been added!");
    	options.position(sydney);
    	Marker marker = map.addMarker(options);
    	
    	map.setInfoWindowAdapter(new InfoWindowAdapter(){

			@Override
			public View getInfoContents(Marker marker) {
				View v = getLayoutInflater().inflate(R.layout.info_window_layout, null);
				TextView title = (TextView) v.findViewById(R.id.title);
				TextView link = (TextView) v.findViewById(R.id.link);
				title.setText(marker.getTitle());
				link.setText(Html.fromHtml("<a href=\"http://www.google.com\">Click Here</a>"));
				link.setMovementMethod(LinkMovementMethod.getInstance());
				return v;
			}

			@Override
			public View getInfoWindow(Marker marker11) {
				return null;
			}
    		
    	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.plot_loc, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_plot_loc,
					container, false);
			return rootView;
		}
	}

}
