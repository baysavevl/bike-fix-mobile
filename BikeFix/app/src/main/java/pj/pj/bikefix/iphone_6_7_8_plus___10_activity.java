
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_6_7_8_plus___10
	 *	@date 		0
	 *	@title 		iPhone 6/7/8 Plus  10
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.2.9.xd
	 *
	 */
	

package pj.pj.bikefix;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class iphone_6_7_8_plus___10_activity extends AppCompatActivity {

	
	private View _bg__iphone_6_7_8_plus___10;
	private View rectangle_49;
	private View rectangle_34;
	private ImageView line_5;
	private TextView honda_wave_rsx;
	private ImageView nopath___copy__3_;
	private TextView my_dad;
	private View rectangle_34_ek1;
	private ImageView line_5_ek1;
	private ImageView nopath___copy__5_;
	private TextView my_brother;
	private TextView yamaha_sirius_;
	private View rectangle_12;
	private ImageView group_2;
	private ImageView group_4_2;
	private ImageView req_un;
	private View rectangle_37;
	private ImageView line_6;
	private ImageView path_1;
	private TextView my_vehicles;
	private ImageView icons8_add_60px;
	private View rectangle_34_ek2;
	private View group_48;
	private View group_43;
	private ImageView path_12;
	private ImageView nopath___copy__5__ek1;
	private TextView me;
	private TextView yamaha_sirius__ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_6_7_8_plus___10);

		
		_bg__iphone_6_7_8_plus___10 = (View) findViewById(R.id._bg__iphone_6_7_8_plus___10);
		rectangle_49 = (View) findViewById(R.id.rectangle_49);
		rectangle_34 = (View) findViewById(R.id.rectangle_34);
		line_5 = (ImageView) findViewById(R.id.line_5);
		honda_wave_rsx = (TextView) findViewById(R.id.honda_wave_rsx);
		nopath___copy__3_ = (ImageView) findViewById(R.id.nopath___copy__3_);
		my_dad = (TextView) findViewById(R.id.my_dad);
		rectangle_34_ek1 = (View) findViewById(R.id.rectangle_34_ek1);
		line_5_ek1 = (ImageView) findViewById(R.id.line_5_ek1);
		nopath___copy__5_ = (ImageView) findViewById(R.id.nopath___copy__5_);
		my_brother = (TextView) findViewById(R.id.my_brother);
		yamaha_sirius_ = (TextView) findViewById(R.id.yamaha_sirius_);
		rectangle_12 = (View) findViewById(R.id.rectangle_12);
		group_2 = (ImageView) findViewById(R.id.group_2);
		group_4_2 = (ImageView) findViewById(R.id.group_4_2);
		req_un = (ImageView) findViewById(R.id.req_un);
		rectangle_37 = (View) findViewById(R.id.rectangle_37);
		line_6 = (ImageView) findViewById(R.id.line_6);
		path_1 = (ImageView) findViewById(R.id.path_1);
		my_vehicles = (TextView) findViewById(R.id.my_vehicles);
		icons8_add_60px = (ImageView) findViewById(R.id.icons8_add_60px);
		rectangle_34_ek2 = (View) findViewById(R.id.rectangle_34_ek2);
		group_48 = (View) findViewById(R.id.group_48);
		group_43 = (View) findViewById(R.id.group_43);
		path_12 = (ImageView) findViewById(R.id.path_12);
		nopath___copy__5__ek1 = (ImageView) findViewById(R.id.nopath___copy__5__ek1);
		me = (TextView) findViewById(R.id.me);
		yamaha_sirius__ek1 = (TextView) findViewById(R.id.yamaha_sirius__ek1);
	
		
		//custom code goes here

		// back
		group_48.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		// detail vehicle
		group_43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___10_activity.this,
								iphone_6_7_8_plus___16_activity.class);
				startActivity(intent);
			}
		});
		// request
		req_un.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___10_activity.this,
								iphone_6_7_8_plus___2_activity.class);
				startActivity(intent);
			}
		});
		// add vehicle
		icons8_add_60px.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___10_activity.this,
								iphone_6_7_8_plus___18_activity.class);
				startActivity(intent);
			}
		});
		// account
		group_2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___10_activity.this,
								iphone_6_7_8_plus___3_activity.class);
				startActivity(intent);
			}
		});
	}
}
	
	