
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_6_7_8_plus___39
	 *	@date 		0
	 *	@title 		iPhone 6/7/8 Plus  39
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

public class iphone_6_7_8_plus___39_activity extends AppCompatActivity {

	
	private View _bg__iphone_6_7_8_plus___39;
	private View group_127;
	private ImageView path_14;
	private TextView fixing_done;
	private View rectangle_37;
	private TextView in_processing;
	private ImageView path_7;
	private TextView th_ng_b_nh_xe;
	private TextView honda_dream;
	private ImageView nopath___copy__6_;
	private ImageView nopath___copy__4_;
	private TextView _51a___1256;
	private ImageView nopath___copy__7_;
	private TextView b__c_n_v_o__inh__c_n_thay_to_n_b___ru_t_b_nh_xe;
	private TextView ph_m_th__ng_c_h_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_6_7_8_plus___39);

		
		_bg__iphone_6_7_8_plus___39 = (View) findViewById(R.id._bg__iphone_6_7_8_plus___39);
		group_127 = (View) findViewById(R.id.group_127);
		path_14 = (ImageView) findViewById(R.id.path_14);
		fixing_done = (TextView) findViewById(R.id.fixing_done);
		rectangle_37 = (View) findViewById(R.id.rectangle_37);
		in_processing = (TextView) findViewById(R.id.in_processing);
		path_7 = (ImageView) findViewById(R.id.path_7);
		th_ng_b_nh_xe = (TextView) findViewById(R.id.th_ng_b_nh_xe);
		honda_dream = (TextView) findViewById(R.id.honda_dream);
		nopath___copy__6_ = (ImageView) findViewById(R.id.nopath___copy__6_);
		nopath___copy__4_ = (ImageView) findViewById(R.id.nopath___copy__4_);
		_51a___1256 = (TextView) findViewById(R.id._51a___1256);
		nopath___copy__7_ = (ImageView) findViewById(R.id.nopath___copy__7_);
		b__c_n_v_o__inh__c_n_thay_to_n_b___ru_t_b_nh_xe = (TextView) findViewById(R.id.b__c_n_v_o__inh__c_n_thay_to_n_b___ru_t_b_nh_xe);
		ph_m_th__ng_c_h_ = (TextView) findViewById(R.id.ph_m_th__ng_c_h_);
	
		
		//custom code goes here

		// done
		group_127.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___39_activity.this,
								iphone_6_7_8_plus___40_activity.class);
				startActivity(intent);
				finish();
			}
		});
	}
}
	
	