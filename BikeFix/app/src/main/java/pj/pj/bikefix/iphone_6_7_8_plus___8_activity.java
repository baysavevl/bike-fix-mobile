
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_6_7_8_plus___8
	 *	@date 		0
	 *	@title 		iPhone 6/7/8 Plus  8
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
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class iphone_6_7_8_plus___8_activity extends AppCompatActivity {

	
	private View _bg__iphone_6_7_8_plus___8;
	private ImageView icons8_process_200px;
	private TextView during_repair_your_vehicle___;
	private ImageView background__2_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_6_7_8_plus___8);

		
		_bg__iphone_6_7_8_plus___8 = (View) findViewById(R.id._bg__iphone_6_7_8_plus___8);
		icons8_process_200px = (ImageView) findViewById(R.id.icons8_process_200px);
		during_repair_your_vehicle___ = (TextView) findViewById(R.id.during_repair_your_vehicle___);
		background__2_ = (ImageView) findViewById(R.id.background__2_);
	
		
		//custom code goes here
		// rotate icon
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				icons8_process_200px.animate().rotationBy(360).withEndAction(this)
						.setDuration(3000).setInterpolator(new LinearInterpolator()).start();
			}
		};
		icons8_process_200px.animate().rotationBy(360).withEndAction(runnable)
				.setDuration(3000).setInterpolator(new LinearInterpolator()).start();

		// rating
		final Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				// TODO: Your application init goes here.
				Intent intent = new Intent(iphone_6_7_8_plus___8_activity.this,
						iphone_6_7_8_plus___13_activity.class);
				startActivity(intent);
				finish();
			}
		}, 10000);


	}
}
	
	