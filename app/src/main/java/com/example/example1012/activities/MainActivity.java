package com.example.example1012.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.example1012.R;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button mButton, mBut1, mBut2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.my_id);
        textView.setText(R.string.ok_mess);
        mButton = findViewById(R.id.button_id);
        mBut1 = findViewById(R.id.button1);
        mBut2 = findViewById(R.id.button2);

        mBut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "f,gldm,fg;l,m", Toast.LENGTH_SHORT).show();
            }
        });

        mBut2.setOnClickListener(v -> Toast.makeText(getApplicationContext(), "f,gldm,fg;l,m", Toast.LENGTH_SHORT).show());

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "ssssssssss", Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"mees",Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        //
        ///
        //
    }

    @Override
    protected void onStart() {
        Log.i("AAAAAAA","onStart");
        super.onStart();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    public void clickOnButton(View view) {
        Toast.makeText(this, "Hi there!!!", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "f,gldm,fg;l,m", Toast.LENGTH_SHORT).show();
    }

    public void clickButton1(View view) {
        Toast.makeText(this, "f,gldm,fg;l,m", Toast.LENGTH_SHORT).show();
    }
}