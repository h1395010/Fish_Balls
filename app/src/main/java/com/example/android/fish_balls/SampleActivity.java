package com.example.android.fish_balls;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class SampleActivity extends Activity {
    FlyOutContainer root;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        this.root = (FlyOutContainer) this.getLayoutInflater().inflate(R.layout.activity_sample, null);

        this.setContentView(root);

        addListenerOnButton();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sample, menu);

        return true;
    }

    public void toggleMenu(View v){
        this.root.toggleMenu();
    }



    Button button1, button2, button3;

    public void addListenerOnButton() {

        final Context context = this;

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, App1Activity.class);
                startActivity(intent);
            }
        });


        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, App2Activity.class);
                startActivity(intent);
            }
        });



        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, App3Activity.class);
                startActivity(intent);
            }
        });



    }


}