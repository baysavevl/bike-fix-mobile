
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_6_7_8_plus___2
	 *	@date 		0
	 *	@title 		iPhone 6/7/8 Plus  2
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

import androidx.appcompat.app.AppCompatActivity;

	public class iphone_6_7_8_plus___2_activity extends AppCompatActivity {

	
	private View _bg__iphone_6_7_8_plus___2;
	private View rectangle_31;
	private ImageView staticmap;
	private View pin_bg_copy_2;
	private View pin_bg_copy;
	private View pin_bg;
	private View pin_bg_ek1;
	private View pin_white;
	private View pin_copy;
	private View pin_bg_ek2;
	private View pin_white_ek1;
	private ImageView machenic_2;
	private ImageView machenic_2_ek1;
	private View rectangle_36;
	private TextView _56_l__v_n_vi_t__t_ng_nh_n_ph___qu_n_9__h__ch__minh;
	private ImageView my_place;
	private View rectangle_12;
	private View group_46;
	private ImageView group_2;
	private ImageView group_4;
	private ImageView req;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_6_7_8_plus___2);

		
		_bg__iphone_6_7_8_plus___2 = (View) findViewById(R.id._bg__iphone_6_7_8_plus___2);
		rectangle_31 = (View) findViewById(R.id.rectangle_31);
		staticmap = (ImageView) findViewById(R.id.staticmap);
		pin_bg_copy_2 = (View) findViewById(R.id.pin_bg_copy_2);
		pin_bg_copy = (View) findViewById(R.id.pin_bg_copy);
		pin_bg = (View) findViewById(R.id.pin_bg);
		pin_bg_ek1 = (View) findViewById(R.id.pin_bg_ek1);
		pin_white = (View) findViewById(R.id.pin_white);
		pin_bg_ek2 = (View) findViewById(R.id.pin_bg_ek2);
		pin_white_ek1 = (View) findViewById(R.id.pin_white_ek1);
		machenic_2 = (ImageView) findViewById(R.id.machenic_2);
		machenic_2_ek1 = (ImageView) findViewById(R.id.machenic_2_ek1);
		rectangle_36 = (View) findViewById(R.id.rectangle_36);
		_56_l__v_n_vi_t__t_ng_nh_n_ph___qu_n_9__h__ch__minh = (TextView) findViewById(R.id._56_l__v_n_vi_t__t_ng_nh_n_ph___qu_n_9__h__ch__minh);
		my_place = (ImageView) findViewById(R.id.my_place);
		rectangle_12 = (View) findViewById(R.id.rectangle_12);
		group_2 = (ImageView) findViewById(R.id.group_2);
		group_4 = (ImageView) findViewById(R.id.group_4);
		req = (ImageView) findViewById(R.id.req);
		group_46 = (View) findViewById(R.id.group_46);
		pin_copy = (View) findViewById(R.id.pin_copy);

		
		//custom code goes here
		// select location
		group_46.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___2_activity.this,
								iphone_6_7_8_plus___12_activity.class);
				startActivity(intent);
			}
		});
		// select online mechanic
		machenic_2_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___2_activity.this,
								iphone_6_7_8_plus___9_activity.class);
				startActivity(intent);
			}
		});
		// select offline mechanic
		pin_copy.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___2_activity.this,
								iphone_6_7_8_plus___20_activity.class);
				startActivity(intent);
			}
		});
		// vehicle
		group_4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___2_activity.this,
								iphone_6_7_8_plus___10_activity.class);
				startActivity(intent);
			}
		});
		// request
		req.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___2_activity.this,
								iphone_6_7_8_plus___11_activity.class);
				startActivity(intent);
			}
		});
		// account
		group_2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___2_activity.this,
								iphone_6_7_8_plus___3_activity.class);
				startActivity(intent);
				finish();
			}
		});
	}
}
	
	