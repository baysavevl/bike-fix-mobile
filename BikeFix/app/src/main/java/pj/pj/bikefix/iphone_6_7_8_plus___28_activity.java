
package pj.pj.bikefix;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class iphone_6_7_8_plus___28_activity extends AppCompatActivity {

	
	private ImageView staticmap;
	private ImageView path_11;
	private View pin_bg_copy_2;
	private View pin_bg_copy;
	private View pin_bg;
	private TextView _1_3km;
	private ImageView moto;
	private View rectangle_37;
	private ImageView line_6;
	private ImageView path_1;
	private TextView new_request;
	private ImageView path_7;
	private View rectangle_58;
	private TextView accept;
	private View rectangle_57;
	private View group_130;
	private View group_129;
	private TextView ignore;
	private ImageView nopath___copy__6_;
	private TextView _51a___1256;
	private ImageView nopath___copy__4_;
	private ImageView nopath___copy__7_;
	private TextView th_ng_b_nh_xe;
	private TextView honda_dream;
	private TextView ph_m_th__ng_c_h_;
	private TextView b__c_n_v_o__inh__c_n_thay_to_n_b___ru_t_b_nh_xe;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_6_7_8_plus___28);

		staticmap = (ImageView) findViewById(R.id.staticmap);
		path_11 = (ImageView) findViewById(R.id.path_11);
		pin_bg_copy_2 = (View) findViewById(R.id.pin_bg_copy_2);
		pin_bg_copy = (View) findViewById(R.id.pin_bg_copy);
		pin_bg = (View) findViewById(R.id.pin_bg);
		_1_3km = (TextView) findViewById(R.id._1_3km);
		moto = (ImageView) findViewById(R.id.moto);
		rectangle_37 = (View) findViewById(R.id.rectangle_37);
		line_6 = (ImageView) findViewById(R.id.line_6);
		path_1 = (ImageView) findViewById(R.id.path_1);
		new_request = (TextView) findViewById(R.id.new_request);
		path_7 = (ImageView) findViewById(R.id.path_7);
		rectangle_58 = (View) findViewById(R.id.rectangle_58);
		accept = (TextView) findViewById(R.id.accept);
		rectangle_57 = (View) findViewById(R.id.rectangle_57);
		group_130 = (View) findViewById(R.id.group_130);
		group_129 = (View) findViewById(R.id.group_129);
		rectangle_57 = (View) findViewById(R.id.rectangle_57);
		ignore = (TextView) findViewById(R.id.ignore);
		nopath___copy__6_ = (ImageView) findViewById(R.id.nopath___copy__6_);
		_51a___1256 = (TextView) findViewById(R.id._51a___1256);
		nopath___copy__4_ = (ImageView) findViewById(R.id.nopath___copy__4_);
		nopath___copy__7_ = (ImageView) findViewById(R.id.nopath___copy__7_);
		th_ng_b_nh_xe = (TextView) findViewById(R.id.th_ng_b_nh_xe);
		honda_dream = (TextView) findViewById(R.id.honda_dream);
		ph_m_th__ng_c_h_ = (TextView) findViewById(R.id.ph_m_th__ng_c_h_);
		b__c_n_v_o__inh__c_n_thay_to_n_b___ru_t_b_nh_xe = (TextView) findViewById(R.id.b__c_n_v_o__inh__c_n_thay_to_n_b___ru_t_b_nh_xe);
	
		
		//custom code goes here
		// img1
		nopath___copy__6_.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___28_activity.this,
								iphone_6_7_8_plus___29_activity.class);
				intent.putExtra("img", 1);
				startActivity(intent);
			}
		});
		// img2
		nopath___copy__7_.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___28_activity.this,
								iphone_6_7_8_plus___29_activity.class);
				intent.putExtra("img", 1);
				startActivity(intent);
			}
		});
		// ignore
		group_130.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___28_activity.this,
								iphone_6_7_8_plus___40_activity.class);
				startActivity(intent);
				finish();
			}
		});
		// accept
		group_129.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___28_activity.this,
								iphone_6_7_8_plus___33_activity.class);
				startActivity(intent);
				finish();
			}
		});
	}
}
	
	