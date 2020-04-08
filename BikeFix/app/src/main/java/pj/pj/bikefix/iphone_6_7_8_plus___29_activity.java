

/*
 *	This content is generated from the API File Info.
 *	(Alt+Shift+Ctrl+I).
 *
 *	@desc
 *	@file 		iphone_6_7_8_plus___29
 *	@date 		0
 *	@title 		iPhone 6/7/8 Plus  29
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
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class iphone_6_7_8_plus___29_activity extends AppCompatActivity {


    private View _bg__iphone_6_7_8_plus___29;
    private ImageView staticmap;
    private View pin_bg_copy_2;
    private View pin_bg_copy;
    private View pin_bg;
    private ImageView path_11;
    private TextView _1_3km;
    private ImageView machenic_23;
    private ImageView path_7;
    private TextView th_ng_b_nh_xe;
    private TextView honda_dream;
    private TextView ph_m_th__ng_c_h_;
    private ImageView nopath___copy__4_;
    private TextView _51a___1256;
    private ImageView nopath___copy__6_;
    private ImageView nopath___copy__7_;
    private TextView b__c_n_v_o__inh__c_n_thay_to_n_b___ru_t_b_nh_xe;
    private View rectangle_58;
    private TextView accept;
    private View rectangle_57;
    private TextView ignore;
    private View rectangle_37;
    private ImageView line_6;
    private ImageView path_1;
    private TextView ph_m_th__ng_c_h__ek1;
    private View rectangle_59;
    private View rectangle_60;
    private View rectangle_61;
    private View rectangle_62;
    private View rectangle_63;
    private ImageView nopath___copy__8_;
    private ImageView nopath___copy__9_;
    private View rectangle_62_ek1;
    private View rectangle_63_ek1;
    private View group_106;
    private Integer imgNo;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.iphone_6_7_8_plus___29);

        imgNo = this.getIntent().getIntExtra("img",1);
        _bg__iphone_6_7_8_plus___29 = (View) findViewById(R.id._bg__iphone_6_7_8_plus___29);
        staticmap = (ImageView) findViewById(R.id.staticmap);
        pin_bg_copy_2 = (View) findViewById(R.id.pin_bg_copy_2);
        pin_bg_copy = (View) findViewById(R.id.pin_bg_copy);
        pin_bg = (View) findViewById(R.id.pin_bg);
        path_11 = (ImageView) findViewById(R.id.path_11);
        _1_3km = (TextView) findViewById(R.id._1_3km);
        machenic_23 = (ImageView) findViewById(R.id.machenic_23);
        path_7 = (ImageView) findViewById(R.id.path_7);
        th_ng_b_nh_xe = (TextView) findViewById(R.id.th_ng_b_nh_xe);
        honda_dream = (TextView) findViewById(R.id.honda_dream);
        ph_m_th__ng_c_h_ = (TextView) findViewById(R.id.ph_m_th__ng_c_h_);
        nopath___copy__4_ = (ImageView) findViewById(R.id.nopath___copy__4_);
        _51a___1256 = (TextView) findViewById(R.id._51a___1256);
        nopath___copy__6_ = (ImageView) findViewById(R.id.nopath___copy__6_);
        nopath___copy__7_ = (ImageView) findViewById(R.id.nopath___copy__7_);
        b__c_n_v_o__inh__c_n_thay_to_n_b___ru_t_b_nh_xe = (TextView) findViewById(R.id.b__c_n_v_o__inh__c_n_thay_to_n_b___ru_t_b_nh_xe);
        rectangle_58 = (View) findViewById(R.id.rectangle_58);
        accept = (TextView) findViewById(R.id.accept);
        rectangle_57 = (View) findViewById(R.id.rectangle_57);
        ignore = (TextView) findViewById(R.id.ignore);
        rectangle_37 = (View) findViewById(R.id.rectangle_37);
        line_6 = (ImageView) findViewById(R.id.line_6);
        path_1 = (ImageView) findViewById(R.id.path_1);
        ph_m_th__ng_c_h__ek1 = (TextView) findViewById(R.id.ph_m_th__ng_c_h__ek1);
        rectangle_59 = (View) findViewById(R.id.rectangle_59);
        rectangle_60 = (View) findViewById(R.id.rectangle_60);
        rectangle_63 = (View) findViewById(R.id.rectangle_63);
        group_106 = (View) findViewById(R.id.group_106);
        nopath___copy__8_ = (ImageView) findViewById(R.id.nopath___copy__8_);
        nopath___copy__9_ = (ImageView) findViewById(R.id.nopath___copy__9_);
        rectangle_63_ek1 = (View) findViewById(R.id.rectangle_63_ek1);


        //custom code goes here
        //exit
        rectangle_60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //left
        rectangle_63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imgNo == 1){
                    group_106.startAnimation(toRight());
                    imgNo = 2;
                } else {
                    group_106.startAnimation(toLeft());
                    imgNo = 1;
                }
            }
        });
        //right
        rectangle_63_ek1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imgNo == 1){
                    group_106.startAnimation(toRight());
                    imgNo = 2;
                } else {
                    group_106.startAnimation(toLeft());
                    imgNo = 1;
                }
            }
        });


    }

    private TranslateAnimation toLeft(){
        TranslateAnimation animation = new TranslateAnimation(0, 1020,
                0, 0);
        animation.setDuration(1000);
        animation.setFillAfter(false);
        animation.setAnimationListener(new Left());
        return animation;
    }
    private TranslateAnimation toRight(){
        TranslateAnimation animation = new TranslateAnimation(0, -1020,
                0, 0);
        animation.setDuration(1000);
        animation.setFillAfter(false);
        animation.setAnimationListener(new Right());
        return animation;
    }
    private class Right implements Animation.AnimationListener {

        @Override
        public void onAnimationEnd(Animation animation) {
            group_106.clearAnimation();
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(group_106.getWidth(), group_106.getHeight());
            lp.setMargins(-808, 473, 0, 0);
            group_106.setLayoutParams(lp);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }

        @Override
        public void onAnimationStart(Animation animation) {
        }

    }

    private class Left implements Animation.AnimationListener {

        @Override
        public void onAnimationEnd(Animation animation) {
            group_106.clearAnimation();
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(group_106.getWidth(), group_106.getHeight());
            lp.setMargins(218, 473, 0, 0);
            group_106.setLayoutParams(lp);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }

        @Override
        public void onAnimationStart(Animation animation) {
        }

    }
}

