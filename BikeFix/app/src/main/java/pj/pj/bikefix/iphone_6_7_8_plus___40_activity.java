package pj.pj.bikefix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class iphone_6_7_8_plus___40_activity extends AppCompatActivity {


    private View group_136;
    private View group_132;
    private View group_131;
    private ImageView staticmap;
    private View pin_bg_copy_2;
    private View pin_bg_copy;
    private View pin_bg;
    private View rectangle_82;
    private View rectangle_84;
    private TextView status;
    private View rectangle_85;
    private View ellipse_8;
    private View rectangle_83;
    private TextView account;
    private ImageView icons8_user_male_60px;
    private View rectangle_83_ek1;
    private View myself;
    private TextView history;
    private ImageView icons8_time_machine_60px;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.iphone_6_7_8_plus___40);


        group_136 = (View) findViewById(R.id.group_136);
        group_132 = (View) findViewById(R.id.group_132);
        group_131 = (View) findViewById(R.id.group_131);
        staticmap = (ImageView) findViewById(R.id.staticmap);
        pin_bg_copy_2 = (View) findViewById(R.id.pin_bg_copy_2);
        pin_bg_copy = (View) findViewById(R.id.pin_bg_copy);
        pin_bg = (View) findViewById(R.id.pin_bg);
        rectangle_82 = (View) findViewById(R.id.rectangle_82);
        rectangle_84 = (View) findViewById(R.id.rectangle_84);
        status = (TextView) findViewById(R.id.status);
        rectangle_85 = (View) findViewById(R.id.rectangle_85);
        ellipse_8 = (View) findViewById(R.id.ellipse_8);
        rectangle_83 = (View) findViewById(R.id.rectangle_83);
        account = (TextView) findViewById(R.id.account);
        icons8_user_male_60px = (ImageView) findViewById(R.id.icons8_user_male_60px);
        rectangle_83_ek1 = (View) findViewById(R.id.rectangle_83_ek1);
        myself = (View) findViewById(R.id.myself);
        history = (TextView) findViewById(R.id.history);
        icons8_time_machine_60px = (ImageView) findViewById(R.id.icons8_time_machine_60px);


        //custom code goes here

        // turn off
        group_136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(iphone_6_7_8_plus___40_activity.this,
                                iphone_6_7_8_plus___41_activity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
            }
        });
        // history
        group_132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(iphone_6_7_8_plus___40_activity.this,
                                iphone_6_7_8_plus___27_activity.class);
                startActivity(intent);
            }
        });
        // account
        group_131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(iphone_6_7_8_plus___40_activity.this,
                                iphone_6_7_8_plus___42_activity.class);
                startActivity(intent);
            }
        });
        // call
        myself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(iphone_6_7_8_plus___40_activity.this,
                                iphone_6_7_8_plus___28_activity.class);
                startActivity(intent);
            }
        });
    }
}
	
	