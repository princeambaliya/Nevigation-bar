package com.example.navigationbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity<name, Add, string, u> extends AppCompatActivity {


    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.Drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.app_name, R.string.app_name);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (!actionBarDrawerToggle.onOptionsItemSelected(item))
            return super.onOptionsItemSelected(item);
        return true;

    }


    public void home(MenuItem item) {
        Toast.makeText(this, "Going to Home", Toast.LENGTH_SHORT).show();

    }

    public void share(MenuItem item) {
        Toast.makeText(this, "Going to Share", Toast.LENGTH_SHORT).show();
    }

    public void rate(MenuItem item) {
        Toast.makeText(this, "going to rate", Toast.LENGTH_SHORT).show();
    }


    public void MOre(MenuItem item) {
        Toast.makeText(this, "Going to More", Toast.LENGTH_SHORT).show();
    }


}