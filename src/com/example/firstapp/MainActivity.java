package com.example.firstapp;

//import com.example.alertme.R;
//import com.example.alertme.MainActivity.PlaceholderFragment;
import com.example.firstapp.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.EditText;
import android.widget.Button;
import android.widget.PopupWindow;
//import com.google.android.gms.maps.*;
//import com.google.android.gms.maps.model.*;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity {
	public final static String PREFS_NAME = "MyPreferencesFile";
	Button btnStartAnotherActivity;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        final Button btnOpenPopup = (Button)findViewById(R.id.openpopup);
        btnOpenPopup.setOnClickListener(new Button.OnClickListener(){

   @Override
   public void onClick(View arg0) {
	   Intent intent = new Intent();//getApplicationContext(), PlotLoc.class);
  	 intent.setClassName("com.example.firstapp", "com.example.firstapp.LoginActivity");
  	 startActivity(intent);
  /*  LayoutInflater layoutInflater 
     = (LayoutInflater)getBaseContext()
      .getSystemService(LAYOUT_INFLATER_SERVICE);  
    View popupView = layoutInflater.inflate(R.layout.popup, null);  
             final PopupWindow popupWindow = new PopupWindow(
               popupView, 
               LayoutParams.WRAP_CONTENT,  
                     LayoutParams.WRAP_CONTENT);  
             
             Button btnDismiss = (Button)popupView.findViewById(R.id.addDealBtn);
             btnDismiss.setOnClickListener(new Button.OnClickListener(){

     @Override
     public void onClick(View v) {
      // TODO Auto-generated method stub
    	 Intent intent = new Intent();//getApplicationContext(), PlotLoc.class);
    	 intent.setClassName("com.example.firstapp", "com.example.firstapp.LoginActivity");
    	 startActivity(intent);
      //popupWindow.dismiss();
     }});
               
             popupWindow.showAsDropDown(btnOpenPopup, 0, 30);*/
         
   }});
	/*	final EditText check1 = (EditText)findViewById(R.id.checkBox1);
		final EditText check2 = (EditText)findViewById(R.id.checkBox2);
		final EditText check3 = (EditText)findViewById(R.id.checkBox3);
		final EditText check4 = (EditText)findViewById(R.id.checkBox4);
		Button btn = (Button)findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
				SharedPreferences.Editor editor = settings.edit();
				editor.putString("check1", check1.getText().toString());
				editor.putString("check2", check2.getText().toString());
				editor.putString("check3", check3.getText().toString());
				editor.putString("check4", check4.getText().toString());
				editor.commit();
				
				
			}
		});*/
		//btnStartAnotherActivity = (Button) findViewById(R.id.button1);
		 
     //   btnStartAnotherActivity.setOnClickListener((OnClickListener) this);//setOnClickListener(this);
	/*	if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onNextClicked(View view) {
		
	//	Intent intent = new Intent("com.example.firstapp.FINDLOC");
		 
        // 2. put key/value data
      //  intent.putExtra("message", "Hello From MainActivity");
 
        // 3. or you can add data to a bundle
        //Bundle extras = new Bundle();
//        extras.putString("status", "Data Received!");
 
        // 4. add bundle to intent
  //      intent.putExtras(extras);
 
        // 5. start the activity
    //    startActivity(intent);
	/*	System.out.println("...Entered event...");*/
		Intent intent = new Intent(this, FindLoc.class);
	//	System.out.println("...Hi...");
	//    EditText editText = (EditText) findViewById(R.id.checkBox2);
	//    EditText editText1 = (EditText) findViewById(R.id.checkBox3);
	  //  System.out.println("...Hello...");
	//    String message = editText.getText().toString();//.concat(editText1.getText().toString());
	 //   System.out.println("...Hiiii...");
	//    System.out.println("..."+message+"...");
	  //  intent.putExtra("mytext", message);
	 //   System.out.println("...uhuhuHi...");
	    startActivity(intent);
	  /*  System.out.println("...67bhkhji...");
	    System.out.println("..."+message+"...");*/
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
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
		
	}

}

