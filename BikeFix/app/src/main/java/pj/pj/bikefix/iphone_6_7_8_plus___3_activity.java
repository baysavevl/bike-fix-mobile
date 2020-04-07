
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_6_7_8_plus___3
	 *	@date 		0
	 *	@title 		iPhone 6/7/8 Plus  3
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.2.9.xd
	 *
	 */
	

package pj.pj.bikefix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class iphone_6_7_8_plus___3_activity extends Activity {

	
	private View _bg__iphone_6_7_8_plus___3;
	private ImageView line_7;
	private TextView emily_daniels;
	private TextView emily_daniels_gmail_;
	private ImageView istockphoto_1003393752_170667a;
	private ImageView line_8;
	private TextView location;
	private ImageView line_8_ek1;
	private TextView location_ek1;
	private ImageView line_8_ek2;
	private TextView location_ek2;
	private View rectangle_12;
	private View group_8;
	private ImageView group_4;
	private ImageView layer_0_copy_2;
	private ImageView req_un;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_6_7_8_plus___3);

		
		_bg__iphone_6_7_8_plus___3 = (View) findViewById(R.id._bg__iphone_6_7_8_plus___3);
		line_7 = (ImageView) findViewById(R.id.line_7);
		emily_daniels = (TextView) findViewById(R.id.emily_daniels);
		emily_daniels_gmail_ = (TextView) findViewById(R.id.emily_daniels_gmail_);
		istockphoto_1003393752_170667a = (ImageView) findViewById(R.id.istockphoto_1003393752_170667a);
		line_8 = (ImageView) findViewById(R.id.line_8);
		location = (TextView) findViewById(R.id.location);
		line_8_ek1 = (ImageView) findViewById(R.id.line_8_ek1);
		location_ek1 = (TextView) findViewById(R.id.location_ek1);
		line_8_ek2 = (ImageView) findViewById(R.id.line_8_ek2);
		location_ek2 = (TextView) findViewById(R.id.location_ek2);
		rectangle_12 = (View) findViewById(R.id.rectangle_12);
		group_4 = (ImageView) findViewById(R.id.group_4);
		layer_0_copy_2 = (ImageView) findViewById(R.id.layer_0_copy_2);
		req_un = (ImageView) findViewById(R.id.req_un);
		group_8 = (View) findViewById(R.id.group_8);

		
		//custom code goes here

		// detail account
		group_8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___3_activity.this,
								iphone_6_7_8_plus___7_activity.class);
				startActivity(intent);
			}
		});
		// history
		location_ek2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___3_activity.this,
								iphone_6_7_8_plus___15_activity.class);
				startActivity(intent);
			}
		});
		// log out
		location.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___3_activity.this,
								iphone_6_7_8_plus___1_activity.class);
				startActivity(intent);
				finish();
			}
		});
		// vehicle
		group_4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___3_activity.this,
								iphone_6_7_8_plus___10_activity.class);
				startActivity(intent);
			}
		});
		// request
		req_un.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___3_activity.this,
								iphone_6_7_8_plus___11_activity.class);
				startActivity(intent);
				finish();
			}
		});
	}
}
	
	