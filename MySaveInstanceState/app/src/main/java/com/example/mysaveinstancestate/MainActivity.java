package com.example.mysaveinstancestate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String PREFS_FILE = "Account";
    private static final String PREF_NAME = "Name";
    EditText nameBox;
    TextView nameView;
    SharedPreferences settings;
    SharedPreferences.Editor prefEditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameBox = (EditText) findViewById(R.id.nameBox);
        nameView = (TextView) findViewById(R.id.nameView);

        settings = getSharedPreferences(PREFS_FILE, MODE_PRIVATE);
        // получаем настройки
        String name = settings.getString(PREF_NAME,"");

        nameBox.setText(name);
        nameView.setText(name);
    }

    @Override
    protected void onPause(){
        super.onPause();

        EditText nameBox = (EditText) findViewById(R.id.nameBox);
        String name = nameBox.getText().toString();
        // сохраняем в настройках
        prefEditor = settings.edit();
        prefEditor.putString(PREF_NAME, name);
        prefEditor.apply();
    }

    public void saveName(View view) {
        // получаем введенное имя
        //EditText nameBox = (EditText) findViewById(R.id.nameBox);
        String name = nameBox.getText().toString();
        // сохраняем его в настройках
        prefEditor = settings.edit();
        prefEditor.putString(PREF_NAME, name);
        prefEditor.apply();
    }

    public void getName(View view) {
        // получаем сохраненное имя
        String name = settings.getString(PREF_NAME,"не определено");
        nameView.setText(name);
    }
}