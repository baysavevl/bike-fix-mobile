package pj.pj.bikefix;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class iphone_6_7_8_plus___7_2_activity extends AppCompatActivity {


	private View rectangle_copy_2;
	private TextView emily_daniels;
	private TextView pozna___poland;
	private ImageView istockphoto_1003393752_170667a;
	private TextView phone__;
	private TextView __84_963_192_405;
	private TextView email_;
	private TextView my_google_gmail_com;
	private TextView address_;
	private TextView s__12_____ng_d1__ph__ng_8___g__v_p__tp_h__ch__minh_;
	private View rectangle_37;
	private ImageView line_6;
	private ImageView path_1;
	private TextView account;
	private TextView edit;
	private View rectangle_12;
	private View group_48;
	private ImageView group_4;
	private ImageView layer_0_copy_2;
	private ImageView req_un;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_6_7_8_plus___7);

		rectangle_copy_2 = (View) findViewById(R.id.rectangle_copy_2);
		emily_daniels = (TextView) findViewById(R.id.emily_daniels);
		pozna___poland = (TextView) findViewById(R.id.pozna___poland);
		istockphoto_1003393752_170667a = (ImageView) findViewById(R.id.istockphoto_1003393752_170667a);
		phone__ = (TextView) findViewById(R.id.phone__);
		__84_963_192_405 = (TextView) findViewById(R.id.__84_963_192_405);
		email_ = (TextView) findViewById(R.id.email_);
		my_google_gmail_com = (TextView) findViewById(R.id.my_google_gmail_com);
		address_ = (TextView) findViewById(R.id.address_);
		s__12_____ng_d1__ph__ng_8___g__v_p__tp_h__ch__minh_ = (TextView) findViewById(R.id.s__12_____ng_d1__ph__ng_8___g__v_p__tp_h__ch__minh_);
		rectangle_37 = (View) findViewById(R.id.rectangle_37);
		line_6 = (ImageView) findViewById(R.id.line_6);
		path_1 = (ImageView) findViewById(R.id.path_1);
		account = (TextView) findViewById(R.id.account);
		rectangle_12 = (View) findViewById(R.id.rectangle_12);
		group_48 = (View) findViewById(R.id.group_48);
		group_4 = (ImageView) findViewById(R.id.group_4);
		layer_0_copy_2 = (ImageView) findViewById(R.id.layer_0_copy_2);
		req_un = (ImageView) findViewById(R.id.req_un);
	
		
		//custom code goes here

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.m_7, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(@NonNull MenuItem item) {
		Intent intent=null;
		switch (item.getItemId()) {
			case R.id.mnu_change_password:
				intent=new Intent(this,iphone_6_7_8_plus___46_activity.class);
				startActivity(intent);
				return true;
			case R.id.mnu_edit_acc:
				intent=new Intent(this,iphone_6_7_8_plus___45_activity.class);
				startActivity(intent);
				return true;

			case R.id.mnu_change_store:
				intent=new Intent(this,iphone_6_7_8_plus___47_activity.class);
				startActivity(intent);
				return true;


			default:
				return super.onOptionsItemSelected(item);
		}
	}

	public void clickVerhicle(View view) {
		Intent intent =
				new Intent(iphone_6_7_8_plus___7_2_activity.this,
						iphone_6_7_8_plus___10_activity.class);
		startActivity(intent);
		finish();
	}

	public void clickAccount(View view) {
		finish();
	}

	public void clickRequest(View view) {
		Intent intent =
				new Intent(iphone_6_7_8_plus___7_2_activity.this,
						iphone_6_7_8_plus___2_activity.class);
		startActivity(intent);
		finish();
	}
}
	
	