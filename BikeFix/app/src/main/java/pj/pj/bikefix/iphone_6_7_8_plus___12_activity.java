package pj.pj.bikefix;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class iphone_6_7_8_plus___12_activity extends AppCompatActivity {


    private View bg;
    private View rectangle_37;
    private ImageView line_6;
    private ImageView path_1;
    private View rectangle_36;
    private ImageView icons8_place_marker_52px;
    private View rectangle_43;
    private TextView _56_l__v_n_vi_t__t_ng_nh_n_ph___qu_n_9__h__ch__minh;
    private ImageView search_location;
    private View rectangle_43_ek1;
    private TextView _122_3_tran_hung_dao__qu_n_10__tp__hcm;
    private ImageView icons8_marker_52px;
    private View rectangle_43_ek2;
    private TextView _37_vo_van_viet__qu_n_9__tp__hcm;
    private ImageView icons8_marker_52px_ek1;
    private View rectangle_43_ek3;
    private TextView toa_nha_the_blues__so_9__duong_linh__phuong_11__q__go___;
    private ImageView icons8_marker_52px_ek2;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.iphone_6_7_8_plus___12);


        bg = findViewById(R.id.bg);
        rectangle_37 = findViewById(R.id.rectangle_37);
        line_6 = findViewById(R.id.line_6);
        path_1 = findViewById(R.id.path_1);
        rectangle_36 = findViewById(R.id.rectangle_36);
        icons8_place_marker_52px = findViewById(R.id.icons8_place_marker_52px);
        rectangle_43 = findViewById(R.id.rectangle_43);
        _56_l__v_n_vi_t__t_ng_nh_n_ph___qu_n_9__h__ch__minh = findViewById(R.id._56_l__v_n_vi_t__t_ng_nh_n_ph___qu_n_9__h__ch__minh);
        search_location = findViewById(R.id.search_location);
        rectangle_43_ek1 = findViewById(R.id.rectangle_43_ek1);
        _122_3_tran_hung_dao__qu_n_10__tp__hcm = findViewById(R.id._122_3_tran_hung_dao__qu_n_10__tp__hcm);
        icons8_marker_52px = findViewById(R.id.icons8_marker_52px);
        rectangle_43_ek2 = findViewById(R.id.rectangle_43_ek2);
        _37_vo_van_viet__qu_n_9__tp__hcm = findViewById(R.id._37_vo_van_viet__qu_n_9__tp__hcm);
        icons8_marker_52px_ek1 = findViewById(R.id.icons8_marker_52px_ek1);
        rectangle_43_ek3 = findViewById(R.id.rectangle_43_ek3);
        toa_nha_the_blues__so_9__duong_linh__phuong_11__q__go___ = findViewById(R.id.toa_nha_the_blues__so_9__duong_linh__phuong_11__q__go___);
        icons8_marker_52px_ek2 = findViewById(R.id.icons8_marker_52px_ek2);


        //custom code goes here

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.m_12, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.m_12_done:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
	
	