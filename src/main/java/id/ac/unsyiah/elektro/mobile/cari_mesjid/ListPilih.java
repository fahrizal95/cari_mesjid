package id.ac.unsyiah.elektro.mobile.cari_mesjid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import id.ac.unsyiah.elektro.mobile.cari_mesjid.R;

/**
 * Created by Indonesia on 11/06/2016.
 */
public class ListPilih extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pilih);
    }
    public void bandaaceh(View view){

        Intent intent = new Intent(this, List_bandaaceh.class);

        startActivity(intent);
    }
    public void pidie(View view){

        Intent intent = new Intent(this, List_pidie.class);

        startActivity(intent);
    }

    public void acehbesar(View view){

        Intent intent = new Intent(this, List_acehbesar.class);

        startActivity(intent);
    }

    public void acehjaya(View view){

        Intent intent = new Intent(this, List_acehjaya.class);

        startActivity(intent);
    }
}

