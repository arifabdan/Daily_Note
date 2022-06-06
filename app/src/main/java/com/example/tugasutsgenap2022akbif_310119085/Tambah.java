package com.example.tugasutsgenap2022akbif_310119085;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.content.Context;

import com.example.tugasutsgenap2022akbif_310119085.databinding.FragmentListBinding;
import com.example.tugasutsgenap2022akbif_310119085.ui.List.ListFragment;

import java.text.DateFormat;
import java.util.Calendar;

public class Tambah extends AppCompatActivity {

    EditText judul, isi, kategori, tanggal;
    Button tambah;
    MyDatabaseHelper database;
    FragmentListBinding fragmentListBinding;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.mocha)));
        Bundle bundle = getIntent().getExtras();

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        tanggal = findViewById(R.id.tanggal);
        tanggal.setFocusable(false);
        tanggal.setText(currentDate);


        judul = findViewById(R.id.judul);
        kategori = findViewById(R.id.kategori);
        isi = findViewById(R.id.isi);
        tambah = findViewById(R.id.btn_tambah);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper db = new MyDatabaseHelper(Tambah.this);
                db.addData(tanggal.getText().toString().trim(),
                        judul.getText().toString().trim(),
                        kategori.getText().toString().trim(),
                        isi.getText().toString().trim());
                Toast.makeText(Tambah.this, "Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Tambah.this, home.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
            }
        });
    }
}
