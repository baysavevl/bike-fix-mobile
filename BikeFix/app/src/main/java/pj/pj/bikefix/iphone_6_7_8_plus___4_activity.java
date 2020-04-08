
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_6_7_8_plus___4
	 *	@date 		0
	 *	@title 		iPhone 6/7/8 Plus  4
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.2.9.xd
	 *
	 */
	

package pj.pj.bikefix;
import android.content.Intent;
import android.os.Bundle;


import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

	public class iphone_6_7_8_plus___4_activity extends AppCompatActivity {

	
	private View _bg__iphone_6_7_8_plus___4;
	private ImageView staticmap;
	private View pin_bg_copy_2;
	private View pin_bg_copy;
	private View pin_bg;
	private View pin_bg_ek1;
	private View pin_white;
	private View pin_bg_ek2;
	private View pin_white_ek1;
	private ImageView machenic_23;
	private ImageView machenic_2;
	private ImageView map_ek2;
	private View pin_bg_copy_2_ek1;
	private View pin_bg_copy_ek1;
	private View pin_bg_ek3;
	private View pin_bg_ek4;
	private View pin_white_ek2;
	private View pin_bg_ek5;
	private View pin_white_ek3;
	private ImageView mechanic2;
	private ImageView mechanic;
	private View rectangle_42;
	private TextView cancel;
	private View rectangle_36;
	private View group_133;
	private TextView _56_l__v_n_vi_t__t_ng_nh_n_ph___qu_n_9__h__ch__minh;
	private ImageView icons8_place_marker_52px;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_6_7_8_plus___4);

		
		_bg__iphone_6_7_8_plus___4 = (View) findViewById(R.id._bg__iphone_6_7_8_plus___4);
		staticmap = (ImageView) findViewById(R.id.staticmap);
		pin_bg_copy_2 = (View) findViewById(R.id.pin_bg_copy_2);
		pin_bg_copy = (View) findViewById(R.id.pin_bg_copy);
		pin_bg = (View) findViewById(R.id.pin_bg);
		pin_bg_ek1 = (View) findViewById(R.id.pin_bg_ek1);
		pin_white = (View) findViewById(R.id.pin_white);
		pin_bg_ek2 = (View) findViewById(R.id.pin_bg_ek2);
		pin_white_ek1 = (View) findViewById(R.id.pin_white_ek1);
		machenic_23 = (ImageView) findViewById(R.id.machenic_23);
		machenic_2 = (ImageView) findViewById(R.id.machenic_2);
		map_ek2 = (ImageView) findViewById(R.id.map_ek2);
		pin_bg_copy_2_ek1 = (View) findViewById(R.id.pin_bg_copy_2_ek1);
		pin_bg_copy_ek1 = (View) findViewById(R.id.pin_bg_copy_ek1);
		pin_bg_ek3 = (View) findViewById(R.id.pin_bg_ek3);
		pin_bg_ek4 = (View) findViewById(R.id.pin_bg_ek4);
		pin_white_ek2 = (View) findViewById(R.id.pin_white_ek2);
		pin_bg_ek5 = (View) findViewById(R.id.pin_bg_ek5);
		pin_white_ek3 = (View) findViewById(R.id.pin_white_ek3);
		mechanic2 = (ImageView) findViewById(R.id.mechanic2);
		mechanic = (ImageView) findViewById(R.id.mechanic);
		rectangle_42 = (View) findViewById(R.id.rectangle_42);
		cancel = (TextView) findViewById(R.id.cancel);
		rectangle_36 = (View) findViewById(R.id.rectangle_36);
		group_133 = (View) findViewById(R.id.group_133);
		_56_l__v_n_vi_t__t_ng_nh_n_ph___qu_n_9__h__ch__minh = (TextView) findViewById(R.id._56_l__v_n_vi_t__t_ng_nh_n_ph___qu_n_9__h__ch__minh);
		icons8_place_marker_52px = (ImageView) findViewById(R.id.icons8_place_marker_52px);
	
		
		//custom code goes here

		// cancel
		group_133.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___4_activity.this,
								iphone_6_7_8_plus___2_activity.class);
				startActivity(intent);
				finish();
			}
		});
		// found
		final Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				// TODO: Your application init goes here.
				Intent intent = new Intent(iphone_6_7_8_plus___4_activity.this,
						iphone_6_7_8_plus___14_activity.class);
				startActivity(intent);
				finish();
			}
		}, 10000);
	}
}
	
	