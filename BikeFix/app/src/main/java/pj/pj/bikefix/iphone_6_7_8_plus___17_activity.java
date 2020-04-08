package pj.pj.bikefix;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class iphone_6_7_8_plus___17_activity extends AppCompatActivity {

    private TextView bikefix;
    private ImageView _2_copy;
    private ImageView bg_wait;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.iphone_6_7_8_plus___17);

        bikefix = findViewById(R.id.bikefix);
        _2_copy = findViewById(R.id._2_copy);
        bg_wait = findViewById(R.id.bg_wait);


        //custom code goes here
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // TODO: Your application init goes here.
                Intent intent = new Intent(iphone_6_7_8_plus___17_activity.this,
                        iphone_6_7_8_plus___1_activity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);

    }
}
	
	