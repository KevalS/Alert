package com.example.firstapp;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;
import android.annotation.SuppressLint;
import android.content.Intent;

import com.example.firstapp.R;
import com.google.android.maps.*;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener;
import com.google.android.gms.maps.model.*;

import java.util.Timer;
import java.util.TimerTask;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;


//@SuppressLint("NewApi")
public class FindLoc extends android.support.v4.app.FragmentActivity implements GooglePlayServicesClient.ConnectionCallbacks,
GooglePlayServicesClient.OnConnectionFailedListener, LocationListener, OnMyLocationChangeListener  {
//	TextView mTextview;
	GoogleMap map;
	//Location currentLocation;
	//LocationClient locClient;
//	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_find_loc);
		map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                .getMap();
		//locClient = new LocationClient(this, this, this);
		//currentLocation = locClient.getLastLocation();
	//	LatLng myLoc = new LatLng(currentLocation.getLatitude(), currentLocation.getLongitude());

		//LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
	//	locationManager.requestLocationUpdates(
	//	     LocationManager.NETWORK_PROVIDER, 1000, 1000, this);
		//LatLng sydney = new LatLng(-33.867, 151.206);

        map.setMyLocationEnabled(true);
        map.setOnMyLocationChangeListener(this);

     /*   map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));

        map.addMarker(new MarkerOptions()
                .title("Sydney")
                .snippet("I am here!!")
                .position(sydney));*/
       
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.find_loc, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_find_loc,
					container, false);
			return rootView;
		}
	}

	@Override
	public void onConnectionFailed(ConnectionResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onConnected(Bundle arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDisconnected() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLocationChanged(Location arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderDisabled(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderEnabled(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMyLocationChange(Location location) {
		// TODO Auto-generated method stub
		double latitude=location.getLatitude();
		double longitude=location.getLongitude();
		LatLng latLng=new LatLng(latitude,longitude);
		map.moveCamera(CameraUpdateFactory.newLatLng(latLng));
		map.animateCamera(CameraUpdateFactory.zoomTo(15));
		map.addMarker(new MarkerOptions()
        .title("MyLoc")
        .snippet("I am here!!")
        .position(latLng));
		//tvLocation.setText("Latitude:"+latitude+", Longitude:"+longitude);
	}

}

