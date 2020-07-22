package com.example.textsizeprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
   // private ProgressBar progressBar;
    private SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        //progressBar = (ProgressBar) findViewById(R.id.progressBar);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

           // int progress = 20;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //progressBar.setProgress(progress);

                textView.setText("Size: " + progress + "%");
                textView.setTextSize(pxFromDp(progress, MainActivity.this));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    public static float pxFromDp(float dp, Context mContext) {
        return dp * mContext.getResources().getDisplayMetrics().density;
        }
}

//        tv.setTextSize(pxFromDp(13, MainActivity.this));
//                }
//
//public static float pxFromDp(float dp, Context mContext) {
//        return dp * mContext.getResources().getDisplayMetrics().density;
//        }