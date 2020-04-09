
	 
	/*
     *	This content is generated from the API File Info.
     *	(Alt+Shift+Ctrl+I).
     *
     *	@desc
     *	@file 		iphone_6_7_8_plus___5
     *	@date 		0
     *	@title 		iPhone 6/7/8 Plus  5
     *	@author
     *	@keywords
     *	@generator 	Export Kit v1.2.9.xd
     *
     */


    package pj.pj.bikefix;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.ImageView;
    import android.widget.TextView;

    import androidx.appcompat.app.AppCompatActivity;

    public class iphone_6_7_8_plus___5_activity extends AppCompatActivity {


        private View _bg__iphone_6_7_8_plus___5;
        private ImageView bg_wait;
        private View rectangle_53;
        private View rectangle_87;
        private TextView login_as_customer;
        private ImageView moto2_no;
        private View rectangle_86;
        private View group_98;
        private View group_135;
        private TextView login_as_mechanic;
        private ImageView machenic_2;

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.iphone_6_7_8_plus___5);


            _bg__iphone_6_7_8_plus___5 = (View) findViewById(R.id._bg__iphone_6_7_8_plus___5);
            bg_wait = (ImageView) findViewById(R.id.bg_wait);
            rectangle_53 = (View) findViewById(R.id.rectangle_53);
            rectangle_87 = (View) findViewById(R.id.rectangle_87);
            login_as_customer = (TextView) findViewById(R.id.login_as_customer);
            moto2_no = (ImageView) findViewById(R.id.moto2_no);
            rectangle_86 = (View) findViewById(R.id.rectangle_86);
            group_98 = (View) findViewById(R.id.group_98);
            group_135 = (View) findViewById(R.id.group_135);
            login_as_mechanic = (TextView) findViewById(R.id.login_as_mechanic);
            machenic_2 = (ImageView) findViewById(R.id.machenic_2);


            //custom code goes here

            // as customer
            group_98.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent =
                            new Intent(iphone_6_7_8_plus___5_activity.this,
                                    iphone_6_7_8_plus___2_activity.class);
                    startActivity(intent);
                    AppCore.isCus=true;
                    finish();
                }
            });
            // as mechanic
            group_135.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent =
                            new Intent(iphone_6_7_8_plus___5_activity.this,
                                    iphone_6_7_8_plus___41_activity.class);
                    startActivity(intent);
                    AppCore.isCus=false;
                    finish();
                }
            });
        }
    }
	
	