
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_6_7_8_plus___38
	 *	@date 		0
	 *	@title 		iPhone 6/7/8 Plus  38
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.2.9.xd
	 *
	 */
	

package pj.pj.bikefix;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;


import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class iphone_6_7_8_plus___38_activity extends AppCompatActivity {

	
	private View _bg__iphone_6_7_8_plus___38;
	private View group_127;
	private ImageView staticmap;
	private View pin_bg_copy_2;
	private View pin_bg_copy;
	private View pin_bg;
	private ImageView path_11;
	private ImageView moto;
	private TextView _1_3km;
	private View rectangle_37;
	private ImageView line_6;
	private ImageView path_1;
	private TextView ph_m_th__ng_c_h_;
	private ImageView path_7;
	private View rectangle_58;
	private TextView i_m_here;
	private ImageView nopath___copy__6_;
	private TextView _51a___1256;
	private ImageView nopath___copy__4_;
	private ImageView nopath___copy__7_;
	private TextView th_ng_b_nh_xe;
	private TextView honda_dream;
	private TextView ph_m_th__ng_c_h__ek1;
	private TextView b__c_n_v_o__inh__c_n_thay_to_n_b___ru_t_b_nh_xe;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_6_7_8_plus___38);

		
		_bg__iphone_6_7_8_plus___38 = (View) findViewById(R.id._bg__iphone_6_7_8_plus___38);
		group_127 = (View) findViewById(R.id.group_127);
		staticmap = (ImageView) findViewById(R.id.staticmap);
		pin_bg_copy_2 = (View) findViewById(R.id.pin_bg_copy_2);
		pin_bg_copy = (View) findViewById(R.id.pin_bg_copy);
		pin_bg = (View) findViewById(R.id.pin_bg);
		path_11 = (ImageView) findViewById(R.id.path_11);
		moto = (ImageView) findViewById(R.id.moto);
		_1_3km = (TextView) findViewById(R.id._1_3km);
		rectangle_37 = (View) findViewById(R.id.rectangle_37);
		line_6 = (ImageView) findViewById(R.id.line_6);
		path_1 = (ImageView) findViewById(R.id.path_1);
		ph_m_th__ng_c_h_ = (TextView) findViewById(R.id.ph_m_th__ng_c_h_);
		path_7 = (ImageView) findViewById(R.id.path_7);
		rectangle_58 = (View) findViewById(R.id.rectangle_58);
		i_m_here = (TextView) findViewById(R.id.i_m_here);
		nopath___copy__6_ = (ImageView) findViewById(R.id.nopath___copy__6_);
		_51a___1256 = (TextView) findViewById(R.id._51a___1256);
		nopath___copy__4_ = (ImageView) findViewById(R.id.nopath___copy__4_);
		nopath___copy__7_ = (ImageView) findViewById(R.id.nopath___copy__7_);
		th_ng_b_nh_xe = (TextView) findViewById(R.id.th_ng_b_nh_xe);
		honda_dream = (TextView) findViewById(R.id.honda_dream);
		ph_m_th__ng_c_h__ek1 = (TextView) findViewById(R.id.ph_m_th__ng_c_h__ek1);
		b__c_n_v_o__inh__c_n_thay_to_n_b___ru_t_b_nh_xe = (TextView) findViewById(R.id.b__c_n_v_o__inh__c_n_thay_to_n_b___ru_t_b_nh_xe);


		//custom code goes here

		// im here
		group_127.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___38_activity.this,
								iphone_6_7_8_plus___39_activity.class);
				startActivity(intent);
				finish();
			}
		});

	}
}
	
	