package com.kitanasoftware.interactiveguide;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kitanasoftware.interactiveguide.dataTransfer.StartConn;
import com.kitanasoftware.interactiveguide.db.WorkWithDb;

public class  EnterYourNameScreen_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_your_name_screen_2);

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#127e83"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

    }

    public void OKclick(View view) {
        WorkWithDb.getWorkWithDb(getApplicationContext());
        Intent intent1 = new Intent(getApplicationContext(), StartConn.class);
        startService(intent1);

        Intent intent = new Intent(getApplicationContext(),MainScreen_4.class);
        startActivity(intent);

    }
}
