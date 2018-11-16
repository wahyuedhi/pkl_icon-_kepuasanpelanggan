package com.example.ultimate.icon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button aktivasi, pemeliharaan, sales;

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        //inisial tombol
        aktivasi = (Button)findViewById(R.id.btn_aktiv);
        pemeliharaan = (Button)findViewById(R.id.btn_pel);
        sales = (Button)findViewById(R.id.btn_sal);

        //function tombol vote aktivasi
        aktivasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iAktivasi = new Intent(getApplicationContext(), AktivasiActivity.class);
                startActivity(iAktivasi);
                finish();
            }
        });
        //function tombol vote pemeliharaan
        pemeliharaan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent iPemeliharaan = new Intent(getApplicationContext(), PemeliharaanActivity.class);
                startActivity(iPemeliharaan);
                finish();
            }
        });
        //function tombol vote sales
        sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iSales = new Intent(getApplicationContext(), SalesActivity.class);
                startActivity(iSales);
                finish();
            }
        });
    }



}
