package id.ac.unsyiah.elektro.mobile.cari_mesjid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import id.ac.unsyiah.elektro.mobile.cari_mesjid.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void maps(View view){
        Intent intent = new Intent(this, Maps.class);

        startActivity(intent);
    }
    public void listpilih(View view){
        Intent intent = new Intent(this, ListPilih.class);
        startActivity(intent);
    }

}
