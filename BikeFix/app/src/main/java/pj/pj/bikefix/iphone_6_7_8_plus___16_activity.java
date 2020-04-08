
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_6_7_8_plus___16
	 *	@date 		0
	 *	@title 		iPhone 6/7/8 Plus  16
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

public class iphone_6_7_8_plus___16_activity extends AppCompatActivity {

	private TextView remove;
	private View rectangle_19;
	private TextView update;
	private View rectangle_24;
	private TextView name__my_dad;
	private ImageView line_3;
	private ImageView line_4;
	private TextView license_plate__59h1___12345;
	private View rectangle_37;
	private ImageView line_6;
	private ImageView path_1;
	private TextView detail;
	private ImageView nopath___copy__3_;
	private TextView brand__honda_wave_rsx;
	private TextView year_of_manufacture__2016;
	private TextView color__cyan;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_6_7_8_plus___16);


		remove = (TextView) findViewById(R.id.remove);
		rectangle_19 = (View) findViewById(R.id.rectangle_19);
		update = (TextView) findViewById(R.id.update);
		rectangle_24 = (View) findViewById(R.id.rectangle_24);
		name__my_dad = (TextView) findViewById(R.id.name__my_dad);
		line_3 = (ImageView) findViewById(R.id.line_3);
		line_4 = (ImageView) findViewById(R.id.line_4);
		license_plate__59h1___12345 = (TextView) findViewById(R.id.license_plate__59h1___12345);
		rectangle_37 = (View) findViewById(R.id.rectangle_37);
		line_6 = (ImageView) findViewById(R.id.line_6);
		path_1 = (ImageView) findViewById(R.id.path_1);
		nopath___copy__3_ = (ImageView) findViewById(R.id.nopath___copy__3_);
		brand__honda_wave_rsx = (TextView) findViewById(R.id.brand__honda_wave_rsx);
		year_of_manufacture__2016 = (TextView) findViewById(R.id.year_of_manufacture__2016);
		color__cyan = (TextView) findViewById(R.id.color__cyan);
	
		
		//custom code goes here
	
	}

	public void clickUpdate(View view) {
	}

	public void clickRemove(View view) {
		Intent intent =new Intent(this,iphone_6_7_8_plus___10_activity.class);
		startActivity(intent);
	}
}
	
	