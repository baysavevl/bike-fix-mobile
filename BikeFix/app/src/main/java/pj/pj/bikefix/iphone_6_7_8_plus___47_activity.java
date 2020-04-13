
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_6_7_8_plus___47
	 *	@date 		0
	 *	@title 		iPhone 6/7/8 Plus  47
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.2.8.xd
	 *
	 */
	

package pj.pj.bikefix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class iphone_6_7_8_plus___47_activity extends Activity {

	
	private View _bg__iphone_6_7_8_plus___47;
	private View rectangle_37;
	private ImageView line_6;
	private ImageView path_1;
	private TextView store_information;
	private View rectangle_19;
	private TextView submit;
	private TextView store_image__;
	private ImageView icons8_add_camera_128px_1;
	private View rectangle_88;
	private ImageView nopath___copy__2_;
	private View ellipse_9;
	private ImageView line_19;
	private ImageView line_20;
	private TextView services_;
	private ImageView path_18;
	private View rectangle_91;
	private View ellipse_9_ek1;
	private ImageView line_19_ek1;
	private ImageView line_20_ek1;
	private TextView flat_tire_repair;
	private View rectangle_92;
	private View rectangle_93;
	private View rectangle_91_ek1;
	private View ellipse_9_ek2;
	private ImageView line_19_ek2;
	private ImageView line_20_ek2;
	private TextView replace_broken_spoke_s_;
	private View rectangle_91_ek2;
	private View ellipse_9_ek3;
	private ImageView line_19_ek3;
	private ImageView line_20_ek3;
	private TextView replace_broken_spoke_s__ek1;
	private View rectangle_91_ek3;
	private View ellipse_9_ek4;
	private ImageView line_19_ek4;
	private ImageView line_20_ek4;
	private TextView replace_tire_s_;
	private TextView add;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_6_7_8_plus___47);

		
		_bg__iphone_6_7_8_plus___47 = (View) findViewById(R.id._bg__iphone_6_7_8_plus___47);
		rectangle_37 = (View) findViewById(R.id.rectangle_37);
		line_6 = (ImageView) findViewById(R.id.line_6);
		path_1 = (ImageView) findViewById(R.id.path_1);
		store_information = (TextView) findViewById(R.id.store_information);
		rectangle_19 = (View) findViewById(R.id.rectangle_19);
		submit = (TextView) findViewById(R.id.submit);
		store_image__ = (TextView) findViewById(R.id.store_image__);
		icons8_add_camera_128px_1 = (ImageView) findViewById(R.id.icons8_add_camera_128px_1);
		rectangle_88 = (View) findViewById(R.id.rectangle_88);
		nopath___copy__2_ = (ImageView) findViewById(R.id.nopath___copy__2_);
		ellipse_9 = (View) findViewById(R.id.ellipse_9);
		line_19 = (ImageView) findViewById(R.id.line_19);
		line_20 = (ImageView) findViewById(R.id.line_20);
		services_ = (TextView) findViewById(R.id.services_);
		path_18 = (ImageView) findViewById(R.id.path_18);
		rectangle_91 = (View) findViewById(R.id.rectangle_91);
		ellipse_9_ek1 = (View) findViewById(R.id.ellipse_9_ek1);
		line_19_ek1 = (ImageView) findViewById(R.id.line_19_ek1);
		line_20_ek1 = (ImageView) findViewById(R.id.line_20_ek1);
		flat_tire_repair = (TextView) findViewById(R.id.flat_tire_repair);
		rectangle_91_ek1 = (View) findViewById(R.id.rectangle_91_ek1);
		ellipse_9_ek2 = (View) findViewById(R.id.ellipse_9_ek2);
		line_19_ek2 = (ImageView) findViewById(R.id.line_19_ek2);
		line_20_ek2 = (ImageView) findViewById(R.id.line_20_ek2);
		replace_broken_spoke_s_ = (TextView) findViewById(R.id.replace_broken_spoke_s_);
		rectangle_91_ek2 = (View) findViewById(R.id.rectangle_91_ek2);
		ellipse_9_ek3 = (View) findViewById(R.id.ellipse_9_ek3);
		line_19_ek3 = (ImageView) findViewById(R.id.line_19_ek3);
		replace_broken_spoke_s__ek1 = (TextView) findViewById(R.id.replace_broken_spoke_s__ek1);
		rectangle_91_ek3 = (View) findViewById(R.id.rectangle_91_ek3);
		ellipse_9_ek4 = (View) findViewById(R.id.ellipse_9_ek4);
		line_19_ek4 = (ImageView) findViewById(R.id.line_19_ek4);
		line_20_ek4 = (ImageView) findViewById(R.id.line_20_ek4);
		replace_tire_s_ = (TextView) findViewById(R.id.replace_tire_s_);
		add = (TextView) findViewById(R.id.txtAdd);
		
		//custom code goes here
	
	}

	public void clickToAddService(View view) {
		Intent intent = new Intent(this, iphone_6_7_8_plus___48_activity.class);
		startActivity(intent);
    }


	public void clickBack(View view) {
		finish();
	}

	public void ckickRemoveService(View view) {
	findViewById(R.id.group_200).setVisibility(View.GONE);
	}
}
	
	