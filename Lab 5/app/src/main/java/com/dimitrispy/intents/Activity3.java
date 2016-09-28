package com.dimitrispy.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    private String returnString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void openActivity4(View view) {
        Intent activity4Intent = new Intent(this, Activity4.class);
        startActivityForResult(activity4Intent, 4);
    }

    public void openActivity5(View view) {
        Intent activity5Intent = new Intent(this, Activity5.class);
        startActivityForResult(activity5Intent, 5);
    }

    public void onActivityResult(int request, int result, Intent data) {
        super.onActivityResult(request, result, data);
        if (request == 4) {
            if(result == RESULT_OK){
                returnString = data.getStringExtra("a4Return");
            }
        }
        else if (request == 5) {
            if(result == RESULT_OK){
                returnString = data.getStringExtra("a5Return");
            }
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("a3Return", returnString);
        setResult(RESULT_OK, intent);
        finish();
    }
}
