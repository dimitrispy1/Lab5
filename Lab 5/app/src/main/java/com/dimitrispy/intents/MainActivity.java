package com.dimitrispy.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.resultTxtView);
    }

    public void openActivity2(View view) {
        Intent activity2Intent = new Intent(this, Activity2.class);
        startActivityForResult(activity2Intent, 2);
    }

    public void openActivity3(View view) {
        Intent activity3Intent = new Intent(this, Activity3.class);
        startActivityForResult(activity3Intent, 3);
    }

    public void onActivityResult(int request, int result, Intent data) {
        super.onActivityResult(request, result, data);
        if (request == 2) {
            if(result == RESULT_OK){
                String a2Return = data.getStringExtra("a2Return");
                this.result.setText(a2Return);
            }
        }
        else if (request == 3) {
            if(result == RESULT_OK){
                String a3Return = data.getStringExtra("a3Return");
                this.result.setText(a3Return);
            }
        }
    }
}
