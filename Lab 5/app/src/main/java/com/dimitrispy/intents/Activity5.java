package com.dimitrispy.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("a5Return","Dave. I'm afraid I can't do that.");
        setResult(RESULT_OK, intent);
        finish();
    }
}
