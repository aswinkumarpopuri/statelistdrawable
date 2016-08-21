package com.brighterbrain.statelistdrawable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected int imgstate;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          iv = (ImageView)findViewById(R.id.image);
        iv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (imgstate==0){
                    iv.setImageState(new int[] { android.R.attr.state_checked},true);
                    iv.refreshDrawableState();
                }
                else if(imgstate==1){
                    iv.setImageState(new int[] { android.R.attr.state_activated},true);
                    iv.refreshDrawableState();
                }
                else if(imgstate==2){
                    iv.setImageState(new int[] { android.R.attr.state_pressed},true);
                    iv.refreshDrawableState();
                }
                   imgstate=(imgstate+1)%3;

            }
        });


    }
}
