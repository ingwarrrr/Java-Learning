package com.example.thirdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        OnClickListener oclBtn = new OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                switch (view.getId()) {
                    case R.id.btnOk:
                        tvOut.setText("Нажата кнопка ОК");
                        break;
                    case R.id.btnCancel:
                        tvOut.setText("Нажата кнопка CANCEL");
                        break;
                }
            }
        };

        btnCancel.setOnClickListener(oclBtn);
        btnOk.setOnClickListener(oclBtn);
    }
}