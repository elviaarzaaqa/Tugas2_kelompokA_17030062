package com.example.tugas2_17030062;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import com.example.tugas2_17030062.SkorActivity;


public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";
    String namaTimA, namaTimB;
    EditText inputNamaTimA, inputNamaTimB;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        EditText inputNamaTimA = findViewById(R.id.editTextA);
        EditText inputNamaTimB = findViewById(R.id.editTextB);

        namaTimA = inputNamaTimA.getText().toString();
        Log.d(TAG, namaTimA);
        namaTimB = inputNamaTimB.getText().toString();
        Log.d(TAG, namaTimB);

        Intent intent = new Intent(this, SkorActivity.class);
        intent.putExtra("Tim A", namaTimA);
        intent.putExtra("Tim B", namaTimB);
        startActivity(intent);
    }
}