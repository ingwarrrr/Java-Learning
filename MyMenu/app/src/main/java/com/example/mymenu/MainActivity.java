package com.example.mymenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        TextView headerView = findViewById(R.id.header);
        headerView.setText(item.getTitle());
        /*switch (id){
            case R.id.action_settings :
                headerView.setText(item.getTitle());
                return true;
            case R.id.save_settings :
                headerView.setText(item.getTitle());
                return true;
            case R.id.open_settings :
                headerView.setText(item.getTitle());
                return true;
        }*/
        return super.onOptionsItemSelected(item);
    }
}