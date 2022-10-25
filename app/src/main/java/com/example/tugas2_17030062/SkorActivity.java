package com.example.tugas2_17030062;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SkorActivity extends AppCompatActivity {

   int counter;
    int skorA = 0;
    int skorB = 0;

   Button satu_poinA, dua_poinA, tiga_poinA, satu_poinB, dua_poinB, tiga_poinB, resetA, resetB;
   TextView nilaiA,nilaiB, skorTimA, skorTimB;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        TextView namaTimA = findViewById(R.id.textViewA);
        TextView namaTimB = findViewById(R.id.textViewB);

        String namaA = getIntent().getStringExtra("Tim A");
        String namaB = getIntent().getStringExtra("Tim B");

        namaTimA.setText("Team" + " " + namaA);
        namaTimB.setText("Team" + " " + namaB);


        context = this;

        /*public void Tambah (View view) {
            if (view.getId() == R.id.satu_poinA) {
                skorA = skorA + 1;
            } else if (view.getId() == R.id.dua_poinA) {
                skorA = skorA + 2;
            } else if (view.getId() == R.id.tiga_poinA) {
                skorA = skorA + 3;
            } else if (view.getId() == R.id.satu_poinB) {
                skorA = skorB + 1;
            } else if (view.getId() == R.id.dua_poinB) {
                skorB = skorB + 2;
            } else if (view.getId() == R.id.tiga_poinB) {
                skorB = skorB + 3;
            }

            resetA = (Button) findViewById(R.id.resetA);
            resetB = (Button) findViewById(R.id.resetB);
            nilaiA = (TextView) findViewById(R.id.textViewPointA);
            nilaiB = (TextView) findViewById(R.id.textViewPointB);

        skorTimA = (TextView) findViewById(String.valueOf(skorA));
        skorTimB = (TextView) findViewById(String.valueOf(skorB));
        } */

        satu_poinA = (Button) findViewById(R.id.satu_poinA);
        dua_poinA = (Button) findViewById(R.id.dua_poinA);
        tiga_poinA = (Button) findViewById(R.id.tiga_poinA);
        satu_poinB = (Button) findViewById(R.id.satu_poinB);
        dua_poinB = (Button) findViewById(R.id.dua_poinB);
        tiga_poinB = (Button) findViewById(R.id.tiga_poinB);
        resetA = (Button) findViewById(R.id.resetA);
        resetB = (Button) findViewById(R.id.resetB);
        nilaiA = (TextView) findViewById(R.id.textViewPointA);
        nilaiB = (TextView) findViewById(R.id.textViewPointB);



        nilaiA.setText("" + counter);

        satu_poinA.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                counter++;
                nilaiA.setText("" + counter);
            }
        });

        dua_poinA.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                counter+=2;
                nilaiA.setText("" + counter);
            }
        });

        tiga_poinA.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                counter+=3;
                nilaiA.setText("" + counter);
            }
        });

        resetA.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                counter = 0;
                nilaiA.setText("" + counter);
            }
        });

        nilaiB.setText("" + counter);

        satu_poinB.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                counter++;
                nilaiB.setText("" + counter);
            }
        });

        dua_poinB.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                counter+=2;
                nilaiB.setText("" + counter);
            }
        });

        tiga_poinB.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                counter+=3;
                nilaiB.setText("" + counter);
            }
        });

        resetB.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                counter = 0;
                nilaiB.setText("" + counter);
            }
        });

        /*nilaiA.setText("" + counter);

        satu_poinA.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                skorA = skorA +1;
                satu_poinA(skorA);
            }
        });

        dua_poinA.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                skorA = skorA +2;
                nilaiA(skorA);
            }
        });

        tiga_poinA.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                skorA = skorA +3;
                nilaiA(skorA);
            }
        });

        resetA.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                skorA =0;
                nilaiA(skorA);
            }
        });

        nilaiB.setText("" + counter);

        satu_poinB.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                skorB = skorB +1;
                nilaiB(skorB);
            }
        });

        dua_poinB.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                skorB = skorB +2;
                nilaiB(skorB);
            }
        });

        tiga_poinB.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                skorB = skorB +3;
                nilaiB(skorB);
            }
        });

        resetB.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                skorB =0;*/

        }
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimpSlifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
   /* public void addOneForTeamA(View v) {
        skorA = skorA + 1;
        displayForTeamA(skorA);
    }

    /**
     * Increase the score for Team A by 2 points.

    public void addTwoForTeamA(View v) {
        skorA = skorA + 2;
        displayForTeamA(skorA);
    }

    /**
     * Increase the score for Team A by 3 points.

    public void addThreeForTeamA(View v) {
        skorA = skorA + 3;
        displayForTeamA(skorA);
    }

    /**
     * Increase the score for Team B by 1 point.

    public void addOneForTeamB(View v) {
        skorB = skorB + 1;
        displayForTeamB(skorB);
    }

    /*
     * Increase the score for Team B by 2 points.


    }

    /**
     * Increase the score for Team B by 3 points.

    public void addThreeForTeamB(View v) {
        skorB = skorB + 3;
        displayForTeamB(skorB);
    }


     * Resets the score for both teams back to 0.

    public void resetScore(View v) {
        skorA = 0;
        skorB = 0;
        displayForTeamA(skorA);
        displayForTeamB(skorB);
    }

    /**
     * Displays the given score for Team A.

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textViewA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textViewB);
        scoreView.setText(String.valueOf(score));
    }*/
}

