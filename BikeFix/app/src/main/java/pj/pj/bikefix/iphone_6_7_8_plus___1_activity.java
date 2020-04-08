
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_6_7_8_plus___1
	 *	@date 		0
	 *	@title 		iPhone 6/7/8 Plus  1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.2.9.xd
	 *
	 */
	

package pj.pj.bikefix;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

	public class iphone_6_7_8_plus___1_activity extends Activity {

	
	private View _bg__iphone_6_7_8_plus___1;
	private ImageView line;
	private View rectangle_4;
	private ImageView password;
	private TextView password_ek1;
	private View rectangle_3;
	private ImageView username;
	private TextView email_or_phone;
	private View rectangle_5;
	private TextView login;
	private TextView bikefix;
	private ImageView _2_copy;
	private TextView not_a_member_yet_;
	private TextView register;
	private View rectangle_6;
	private TextView sign_up_with_facebook;
	private TextView or;
	private View group_2;
	private View group_3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_6_7_8_plus___1);

		
		_bg__iphone_6_7_8_plus___1 = (View) findViewById(R.id._bg__iphone_6_7_8_plus___1);
		line = (ImageView) findViewById(R.id.line);
		rectangle_4 = (View) findViewById(R.id.rectangle_4);
		password = (ImageView) findViewById(R.id.password);
		password_ek1 = (TextView) findViewById(R.id.password_ek1);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		username = (ImageView) findViewById(R.id.username);
		email_or_phone = (TextView) findViewById(R.id.email_or_phone);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		login = (TextView) findViewById(R.id.login);
		bikefix = (TextView) findViewById(R.id.bikefix);
		_2_copy = (ImageView) findViewById(R.id._2_copy);
		not_a_member_yet_ = (TextView) findViewById(R.id.not_a_member_yet_);
		register = (TextView) findViewById(R.id.register);
		rectangle_6 = (View) findViewById(R.id.rectangle_6);
		sign_up_with_facebook = (TextView) findViewById(R.id.sign_up_with_facebook);
		or = (TextView) findViewById(R.id.or);
		group_2 = findViewById(R.id.group_2);
		group_3 = findViewById(R.id.group_3);

		
		//custom code goes here

		//login
		group_2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___1_activity.this,
								iphone_6_7_8_plus___5_activity.class);
				startActivity(intent);
				finish();
			}
		});

		//sign w fb
		group_3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___1_activity.this,
								iphone_6_7_8_plus___2_activity.class);
				startActivity(intent);
				finish();
			}
		});

		//sign up
		register.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent =
						new Intent(iphone_6_7_8_plus___1_activity.this,
								iphone_6_7_8_plus___6_activity.class);
				startActivity(intent);
				finish();
			}
		});


	
	}


}
	
	