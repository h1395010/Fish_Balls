package com.example.android.fish_balls;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class App3Activity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);

        addListenerOnButton();
    }


    Button buttonBACK_3;

    public void addListenerOnButton() {

        final Context context = this;



        buttonBACK_3 = (Button) findViewById(R.id.buttonBACK_3);
        buttonBACK_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, SampleActivity.class);
                startActivity(intent);
            }
        });



    }

}