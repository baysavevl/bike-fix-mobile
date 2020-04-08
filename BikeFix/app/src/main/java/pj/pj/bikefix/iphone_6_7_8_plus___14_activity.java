package pj.pj.bikefix;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class iphone_6_7_8_plus___14_activity extends AppCompatActivity {


    private View _bg__iphone_6_7_8_plus___14;
    private ImageView staticmap;
    private ImageView path_11;
    private View pin_bg_copy_2;
    private View pin_bg_copy;
    private View pin_bg;
    private ImageView machenic_2;
    private View rectangle_32;
    private View rectangle_33;
    private TextView store_staff_is_coming;
    private TextView honda_vi_t_th_i;
    private TextView license_plate__59h1__12345;
    private TextView found_;
    private TextView about_1_5_km;
    private View rectangle_35;
    private TextView damaged_wheel;
    private ImageView icons8_high_importance_52px;
    private View rectangle_36;
    private TextView _56_l__v_n_vi_t__t_ng_nh_n_ph___qu_n_9__h__ch__minh;
    private ImageView icons8_place_marker_52px;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.iphone_6_7_8_plus___14);


        _bg__iphone_6_7_8_plus___14 = (View) findViewById(R.id._bg__iphone_6_7_8_plus___14);
        staticmap = (ImageView) findViewById(R.id.staticmap);
        path_11 = (ImageView) findViewById(R.id.path_11);
        pin_bg_copy_2 = (View) findViewById(R.id.pin_bg_copy_2);
        pin_bg_copy = (View) findViewById(R.id.pin_bg_copy);
        pin_bg = (View) findViewById(R.id.pin_bg);
        machenic_2 = (ImageView) findViewById(R.id.machenic_2);
        rectangle_32 = (View) findViewById(R.id.rectangle_32);
        rectangle_33 = (View) findViewById(R.id.rectangle_33);
        store_staff_is_coming = (TextView) findViewById(R.id.store_staff_is_coming);
        honda_vi_t_th_i = (TextView) findViewById(R.id.honda_vi_t_th_i);
        license_plate__59h1__12345 = (TextView) findViewById(R.id.license_plate__59h1__12345);
        found_ = (TextView) findViewById(R.id.found_);
        about_1_5_km = (TextView) findViewById(R.id.about_1_5_km);
        rectangle_35 = (View) findViewById(R.id.rectangle_35);
        damaged_wheel = (TextView) findViewById(R.id.damaged_wheel);
        icons8_high_importance_52px = (ImageView) findViewById(R.id.icons8_high_importance_52px);
        rectangle_36 = (View) findViewById(R.id.rectangle_36);
        _56_l__v_n_vi_t__t_ng_nh_n_ph___qu_n_9__h__ch__minh = (TextView) findViewById(R.id._56_l__v_n_vi_t__t_ng_nh_n_ph___qu_n_9__h__ch__minh);
        icons8_place_marker_52px = (ImageView) findViewById(R.id.icons8_place_marker_52px);


        //custom code goes here

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // TODO: Your application init goes here.
                Intent intent = new Intent(iphone_6_7_8_plus___14_activity.this,
                        iphone_6_7_8_plus___21_activity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
            }
        }, 1000);
    }
}
	
	