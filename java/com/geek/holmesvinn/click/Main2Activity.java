package com.geek.holmesvinn.click;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void bclick(View view) {
        Button button = (Button)findViewById(R.id.button3);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.09, 16);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
       myAnim.setAnimationListener(new Animation.AnimationListener() {
           @Override
           public void onAnimationStart(Animation animation) {
               finish();
           }

           @Override
           public void onAnimationEnd(Animation animation) {


           }

           @Override
           public void onAnimationRepeat(Animation animation) {

           }
       });
    }
}
