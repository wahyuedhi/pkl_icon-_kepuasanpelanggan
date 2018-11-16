package com.example.ultimate.icon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.ultimate.icon.generator.ServiceGenerator;
import com.example.ultimate.icon.models.Penilaian;
import com.example.ultimate.icon.service.PenilaianService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SalesActivity extends AppCompatActivity {

    ImageButton btnSad3, btnMeh3, btnHappy3;
    String id_var = "12";
    String nama_cust = "Mobile";
    String tanggal_penilaian;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);

        final PenilaianService service = ServiceGenerator.createService(PenilaianService.class);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setLenient(false);
        Date today = new Date();
        tanggal_penilaian = df.format(today);

        btnHappy3 = findViewById(R.id.sales_okay);
        btnMeh3 = findViewById(R.id.sales_stand);
        btnSad3 = findViewById(R.id.sales_not);

        btnHappy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Penilaian itemPenilaian = new Penilaian(id_var, nama_cust, tanggal_penilaian, "100");
                Call<Penilaian>call = service.createPenilaian(itemPenilaian);
                call.enqueue(new Callback<Penilaian>() {
                    @Override
                    public void onResponse(Call<Penilaian> call, Response<Penilaian> response) {
                        Toast.makeText(getApplicationContext(), "Sukses", Toast.LENGTH_SHORT);
                        Intent trims1 = new Intent(SalesActivity.this, TrimsActivity.class);
                        startActivity(trims1);
                        finish();
                    }

                    @Override
                    public void onFailure(Call<Penilaian> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Gagal", Toast.LENGTH_SHORT);
                        Intent fail2 = new Intent(SalesActivity.this, FailActivity.class);
                        startActivity(fail2);
                        finish();
                    }
                });

            }
        });

        btnMeh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Penilaian itemPenilaian = new Penilaian(id_var, nama_cust, tanggal_penilaian, "70");
                Call<Penilaian>call = service.createPenilaian(itemPenilaian);
                call.enqueue(new Callback<Penilaian>() {
                    @Override
                    public void onResponse(Call<Penilaian> call, Response<Penilaian> response) {
                        Toast.makeText(getApplicationContext(), "Sukses", Toast.LENGTH_SHORT);
                        Intent trims2 = new Intent(SalesActivity.this, TrimsActivity.class);
                        startActivity(trims2);
                        finish();
                    }

                    @Override
                    public void onFailure(Call<Penilaian> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Gagal", Toast.LENGTH_SHORT);
                        Intent fail2 = new Intent(SalesActivity.this, FailActivity.class);
                        startActivity(fail2);
                        finish();
                    }
                });

            }
        });

        btnSad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Penilaian itemPenilaian = new Penilaian(id_var, nama_cust, tanggal_penilaian, "50");
                Call<Penilaian>call = service.createPenilaian(itemPenilaian);
                call.enqueue(new Callback<Penilaian>() {
                    @Override
                    public void onResponse(Call<Penilaian> call, Response<Penilaian> response) {
                        Toast.makeText(getApplicationContext(), "Sukses", Toast.LENGTH_SHORT);
                        Intent trims3 = new Intent(SalesActivity.this, TrimsActivity.class);
                        startActivity(trims3);
                        finish();
                    }

                    @Override
                    public void onFailure(Call<Penilaian> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Gagal", Toast.LENGTH_SHORT);
                        Intent fail3 = new Intent(SalesActivity.this, FailActivity.class);
                        startActivity(fail3);
                        finish();
                    }
                });

            }
        });

    }
}
