package com.example.davidtran.numpad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);




        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);  //Can also be done in xml by android:orientation="vertical"

        for (int i = 0; i < 9; i++) {
            LinearLayout row = new LinearLayout(this);
            //row.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            for (int j = 0; j < 9; j++) {

                Button btnTag = new Button(this);
              // btnTag.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                btnTag.setLayoutParams(new LinearLayout.LayoutParams(480*120/1080,LinearLayout.LayoutParams.WRAP_CONTENT));     //120 for 5 inch 1080 with
                btnTag.setText("" + (j + 1 + (i * 9 )));
                btnTag.setTextSize(480*14/1080+2);  // 14 standard front size
                btnTag.setId(j + 1 + (i * 4));
                row.addView(btnTag);
            }

            layout.addView(row);
        }
        setContentView(layout);
        //setContentView(R.layout.main);
    }
}
