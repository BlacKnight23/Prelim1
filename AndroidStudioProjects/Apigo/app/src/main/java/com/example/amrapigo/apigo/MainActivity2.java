package com.example.amrapigo.apigo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView correct, incorrect, time;
    String one = "", two = "";
    int cor = 0, incor = 0;
    int fr, sc;
    public int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final String[] letters = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "BONUS"};

        correct = (TextView) findViewById(R.id.editText);
        incorrect = (TextView) findViewById(R.id.editText3);
        time = (TextView) findViewById(R.id.editText2);

        correct.setText(""+cor);
        incorrect.setText(""+incor);

        final Button[] buttons = new Button[]{
                (Button) findViewById(R.id.button5),
                (Button) findViewById(R.id.button6),
                (Button) findViewById(R.id.button7),
                (Button) findViewById(R.id.button8),
                (Button) findViewById(R.id.button9),
                (Button) findViewById(R.id.button10),
                (Button) findViewById(R.id.button11),
                (Button) findViewById(R.id.button12),
                (Button) findViewById(R.id.button13),
                (Button) findViewById(R.id.button14),
                (Button) findViewById(R.id.button15),
                (Button) findViewById(R.id.button16),
                (Button) findViewById(R.id.button17),
                (Button) findViewById(R.id.button18),
                (Button) findViewById(R.id.button19),
                (Button) findViewById(R.id.button20),
                (Button) findViewById(R.id.button21),
                (Button) findViewById(R.id.button22),
                (Button) findViewById(R.id.button23),
                (Button) findViewById(R.id.button24),
                (Button) findViewById(R.id.button25),
                (Button) findViewById(R.id.button26),
                (Button) findViewById(R.id.button27),
                (Button) findViewById(R.id.button28),
                (Button) findViewById(R.id.button29)};

        final String[] save = new String[25];

        List<String> shufflelet = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "BONUS");
        Collections.shuffle(shufflelet);
        for (int k = 0; k < letters.length; k++) {

            buttons[k].setEnabled(false);
            buttons[k].setText("" + shufflelet.get(k));
            save[k] = shufflelet.get(k);
        }


        new CountDownTimer(6000, 1000) {
            public void onTick(long millisUntilFinished) {
                time.setText("00:0" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                Chronometer simpleChronometer = (Chronometer) findViewById(R.id.editText2);
                simpleChronometer.setBase(SystemClock.elapsedRealtime());
                simpleChronometer.start();

                for (int j = 0; j < letters.length; j++) {
                    buttons[j].setEnabled(true);
                    buttons[j].setText(("???"));
                }
            }
        }.start();

        buttons[0].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[0].setText("" + save[0]);
                buttons[0].setBackgroundResource(R.drawable.select);
                buttons[0].setEnabled(false);

                if (one == "") {
                    one = save[0];
                    fr = 0;
                } else {
                    two = save[0];
                    sc = 0;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);
                }


            }
        });


        buttons[1].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                buttons[1].setText("" + save[1]);
                buttons[1].setBackgroundResource(R.drawable.select);
                buttons[1].setEnabled(false);

                if (one == "") {
                    one = save[1];
                    fr = 1;
                } else {
                    two = save[1];
                    sc = 1;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });


        buttons[2].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                buttons[2].setText("" + save[2]);
                buttons[2].setBackgroundResource(R.drawable.select);
                buttons[2].setEnabled(false);

                if (one == "") {
                    one = save[2];
                    fr = 2;
                } else {
                    two = save[2];
                    sc = 2;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });


        buttons[3].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                buttons[3].setText("" + save[3]);
                buttons[3].setBackgroundResource(R.drawable.select);
                buttons[3].setEnabled(false);

                if (one == "") {
                    one = save[3];
                    fr = 3;
                } else {
                    two = save[3];
                    sc = 3;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });


        buttons[4].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[4].setText("" + save[4]);
                buttons[4].setBackgroundResource(R.drawable.select);
                buttons[4].setEnabled(false);

                if (one == "") {
                    one = save[4];
                    fr = 4;
                } else {
                    two = save[4];
                    sc = 4;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });


        buttons[5].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[5].setText("" + save[5]);
                buttons[5].setBackgroundResource(R.drawable.select);
                buttons[5].setEnabled(false);

                if (one == "") {
                    one = save[5];
                    fr = 5;
                } else {
                    two = save[5];
                    sc = 5;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });


        buttons[6].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[6].setText("" + save[6]);
                buttons[6].setBackgroundResource(R.drawable.select);
                buttons[6].setEnabled(false);

                if (one == "") {
                    one = save[6];
                    fr = 6;
                } else {
                    two = save[6];
                    sc = 6;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });


        buttons[7].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[7].setText("" + save[7]);
                buttons[7].setBackgroundResource(R.drawable.select);
                buttons[7].setEnabled(false);

                if (one == "") {
                    one = save[7];
                    fr = 7;
                } else {
                    two = save[7];
                    sc = 7;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });


        buttons[8].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[8].setText("" + save[8]);
                buttons[8].setBackgroundResource(R.drawable.select);
                buttons[8].setEnabled(false);

                if (one == "") {
                    one = save[8];
                    fr = 8;
                } else {
                    two = save[8];
                    sc = 8;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });


        buttons[9].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[9].setText("" + save[9]);
                buttons[9].setBackgroundResource(R.drawable.select);
                buttons[9].setEnabled(false);

                if (one == "") {
                    one = save[9];
                    fr = 9;
                } else {
                    two = save[9];
                    sc = 9;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });


        buttons[10].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[10].setText("" + save[10]);
                buttons[10].setBackgroundResource(R.drawable.select);
                buttons[10].setEnabled(false);

                if (one == "") {
                    one = save[10];
                    fr = 10;
                } else {
                    two = save[10];
                    sc = 10;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);
                }


            }
        });


        buttons[11].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[11].setText("" + save[11]);
                buttons[11].setBackgroundResource(R.drawable.select);
                buttons[11].setEnabled(false);

                if (one == "") {
                    one = save[11];
                    fr = 11;
                } else {
                    two = save[11];
                    sc = 11;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);
                }


            }
        });


        buttons[12].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[12].setText("" + save[12]);
                buttons[12].setBackgroundResource(R.drawable.select);
                buttons[12].setEnabled(false);

                if (one == "") {
                    one = save[12];
                    fr = 12;
                } else {
                    two = save[12];
                    sc = 12;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);
                }


            }
        });


        buttons[13].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[13].setText("" + save[13]);
                buttons[13].setBackgroundResource(R.drawable.select);
                buttons[13].setEnabled(false);

                if (one == "") {
                    one = save[13];
                    fr = 13;
                } else {
                    two = save[13];
                    sc = 13;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });


        buttons[14].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[14].setText("" + save[14]);
                buttons[14].setBackgroundResource(R.drawable.select);
                buttons[14].setEnabled(false);

                if (one == "") {
                    one = save[14];
                    fr = 14;
                } else {
                    two = save[14];
                    sc = 14;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });


        buttons[15].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[15].setText("" + save[15]);
                buttons[15].setBackgroundResource(R.drawable.select);
                buttons[15].setEnabled(false);

                if (one == "") {
                    one = save[15];
                    fr = 15;
                } else {
                    two = save[15];
                    sc = 15;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });

        buttons[16].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[16].setText("" + save[16]);
                buttons[16].setBackgroundResource(R.drawable.select);
                buttons[16].setEnabled(false);

                if (one == "") {
                    one = save[16];
                    fr = 16;
                } else {
                    two = save[16];
                    sc = 16;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });

        buttons[17].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[17].setText("" + save[17]);
                buttons[17].setBackgroundResource(R.drawable.select);
                buttons[17].setEnabled(false);

                if (one == "") {
                    one = save[17];
                    fr = 17;
                } else {
                    two = save[17];
                    sc = 17;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });

        buttons[18].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[18].setText("" + save[18]);
                buttons[18].setBackgroundResource(R.drawable.select);
                buttons[18].setEnabled(false);

                if (one == "") {
                    one = save[18];
                    fr = 18;
                } else {
                    two = save[18];
                    sc = 18;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });

        buttons[19].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[19].setText("" + save[19]);
                buttons[19].setBackgroundResource(R.drawable.select);
                buttons[19].setEnabled(false);

                if (one == "") {
                    one = save[19];
                    fr = 19;
                } else {
                    two = save[19];
                    sc = 19;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });

        buttons[20].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[20].setText("" + save[20]);
                buttons[20].setBackgroundResource(R.drawable.select);
                buttons[20].setEnabled(false);

                if (one == "") {
                    one = save[20];
                    fr = 20;
                } else {
                    two = save[15];
                    sc = 20;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });

        buttons[21].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[21].setText("" + save[21]);
                buttons[21].setBackgroundResource(R.drawable.select);
                buttons[21].setEnabled(false);

                if (one == "") {
                    one = save[21];
                    fr = 21;
                } else {
                    two = save[21];
                    sc = 21;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });

        buttons[22].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[22].setText("" + save[22]);
                buttons[22].setBackgroundResource(R.drawable.select);
                buttons[22].setEnabled(false);

                if (one == "") {
                    one = save[22];
                    fr = 22;
                } else {
                    two = save[22];
                    sc = 22;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });

        buttons[23].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[23].setText("" + save[23]);
                buttons[23].setBackgroundResource(R.drawable.select);
                buttons[23].setEnabled(false);

                if (one == "") {
                    one = save[23];
                    fr = 23;
                } else {
                    two = save[23];
                    sc = 23;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });

        buttons[24].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                buttons[24].setText("" + save[24]);
                buttons[24].setBackgroundResource(R.drawable.select);
                buttons[24].setEnabled(false);

                if (one == "") {
                    one = save[24];
                    fr = 24;
                } else {
                    two = save[24];
                    sc = 24;
                }

                if (one == two && one != "" && two != "") {
                    buttons[fr].setBackgroundResource(R.drawable.right);
                    buttons[sc].setBackgroundResource(R.drawable.right);

                    buttons[fr].setEnabled(false);
                    buttons[sc].setEnabled(false);

                    cor += 1;

                    correct.setText("" + cor);

                    one = "";
                    two = "";


                }

                if (one != two && one != "" && two != "") {

                    buttons[fr].setBackgroundResource(R.drawable.wrong);
                    buttons[sc].setBackgroundResource(R.drawable.wrong);
                    incor += 1;

                    incorrect.setText("" + incor);

                }


            }
        });

    }
}


