package com.dimitrispy.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public void returnFour(View view) {
        EditText e = (EditText)findViewById(R.id.editText);
        String str = e.getText().toString();

        if(str == null || str.isEmpty()){
            e.setHintTextColor(0xffff0000);
            e.setHint("Cannot be empty");
        }
        else{
            Intent intent = new Intent();
            intent.putExtra("a4Return",str);
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}
