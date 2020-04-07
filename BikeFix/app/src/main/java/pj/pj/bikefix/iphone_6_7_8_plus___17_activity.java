
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_6_7_8_plus___17
	 *	@date 		0
	 *	@title 		iPhone 6/7/8 Plus  17
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.2.9.xd
	 *
	 */
	

package pj.pj.bikefix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class iphone_6_7_8_plus___17_activity extends Activity {

	
	private View _bg__iphone_6_7_8_plus___17;
	private View rectangle_50;
	private TextView bikefix;
	private ImageView _2_copy;
	private ImageView bg_wait;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_6_7_8_plus___17);

		
		_bg__iphone_6_7_8_plus___17 = (View) findViewById(R.id._bg__iphone_6_7_8_plus___17);
		rectangle_50 = (View) findViewById(R.id.rectangle_50);
		bikefix = (TextView) findViewById(R.id.bikefix);
		_2_copy = (ImageView) findViewById(R.id._2_copy);
		bg_wait = (ImageView) findViewById(R.id.bg_wait);
	
		
		//custom code goes here
		final Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				// TODO: Your application init goes here.
				Intent intent = new Intent(iphone_6_7_8_plus___17_activity.this,
						iphone_6_7_8_plus___1_activity.class);
				startActivity(intent);
				finish();
			}
		}, 2000);
	
	}
}
	
	