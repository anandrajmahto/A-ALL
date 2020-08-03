package com.armscreation.a_games.chain;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.armscreation.a_games.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth fAuth;
    ImageButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25, button26, button27, button28, button29, button30, button31, button32, button33, button34, button35, button36, button37, button38, button39, button40, button41, button42, button43, button44, button45, button46, button47, button48, button49, button50;
    ImageButton[] array = new ImageButton[51];
    View imageView;
    private FirebaseAuth mAuth;
    private int turn;
    private boolean green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chain);

        final Button btn_multiplayer = findViewById(R.id.btn_multiplayer);
        btn_multiplayer.setVisibility(View.INVISIBLE);
        mAuth = FirebaseAuth.getInstance();
        fAuth = FirebaseAuth.getInstance();
        turn = 1;
        green = false;
        imageView = findViewById(R.id.imageView);
        mAuth.signInAnonymously().addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                Log.d("TAG", "signInAnonymously:onComplete:" + task.isSuccessful());
                if (task.isSuccessful()) {
                    btn_multiplayer.setVisibility(View.VISIBLE);
                    btn_multiplayer.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(MainActivity.this, "Comming Soon", Toast.LENGTH_LONG).show();


                        }
                    });


                } else {

                    Toast.makeText(MainActivity.this, "Error Signing-in !!", Toast.LENGTH_LONG).show();

                }

            }

        });

        initialize();
        onclicklistners();
        turnchk();


    }

    private void onclicklistners() {

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(0);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(2);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(3);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(4);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(5);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(6);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(7);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(8);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(9);

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(10);

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(11);

            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(12);

            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(13);

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(14);

            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(15);

            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(16);

            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(17);

            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(18);

            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(19);

            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(20);

            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(21);

            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(22);

            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(23);

            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(24);

            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(25);

            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(26);

            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(27);

            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(28);

            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(29);

            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(30);

            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(31);

            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(32);

            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(33);

            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(34);

            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(35);

            }
        });
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(36);

            }
        });
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(37);

            }
        });
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(38);

            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(39);

            }
        });
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(40);

            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(41);

            }
        });
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(42);

            }
        });
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(43);

            }
        });
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(44);

            }
        });
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(45);

            }
        });
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(46);

            }
        });
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(47);

            }
        });
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(48);

            }
        });
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(49);

            }
        });


    }

    void btn(final int j) {

        //turn 1=red
        //turn 2=green


        if (turn == 1 && array[j].getTag().equals(" ")) {
            array[j].setBackgroundResource(R.drawable.red);
            //  array[j].setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary), android.graphics.PorterDuff.Mode.MULTIPLY);
            //  array[j].setColorFilter(Color.rgb(10,12,12));
            //  array[j].setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
            array[j].setTag("red");
            turn = 2;
        } else if (turn == 2 && array[j].getTag().equals(" ")) {
            green = true;
            array[j].setBackgroundResource(R.drawable.green);
            array[j].setTag("green");
            turn = 1;
        } else if (turn == 1 && array[j].getTag().equals("red")) {
            array[j].setBackgroundResource(R.drawable.red2);
            array[j].setTag("red2");
            turn = 2;
        } else if (turn == 2 && array[j].getTag().equals("green")) {
            array[j].setBackgroundResource(R.drawable.green2);
            array[j].setTag("green2");
            turn = 1;
        } else if (turn == 1 && array[j].getTag().equals("red2")) {
            array[j].setBackgroundResource(R.drawable.red3);
            array[j].setTag("red3");
            turn = 2;
        } else if (turn == 2 && array[j].getTag().equals("green2")) {
            array[j].setBackgroundResource(R.drawable.green3);
            array[j].setTag("green3");
            turn = 1;
        } else if (turn == 1 && array[j].getTag().equals("red3")) {
            array[j].setBackgroundResource(R.drawable.red4);
            array[j].setTag("red4");
            turn = 2;
        } else if (turn == 2 && array[j].getTag().equals("green3")) {
            array[j].setBackgroundResource(R.drawable.green4);
            array[j].setTag("green4");
            turn = 1;
        }


        check();
        turnchk();
        // resultchk();
    }

    private void resultchk() {

        boolean statusred = true, statusgreen = true;
        for (int i = 0; i <= 49; i++) {
            if ((array[i].getTag().equals("red") || array[i].getTag().equals("red2") || array[i].getTag().equals("red3") || array[i].getTag().equals("red4") || array[i].getTag().equals(" "))) {
                // Toast.makeText(this, "Red Wins", Toast.LENGTH_SHORT).show();

                if (i == 49 && statusred) {
                    if (green) {
                        for (int j = 0; j < 50; j++) {
                            array[j].setTag(" ");
                            array[j].setBackgroundResource(R.drawable.toe);
                        }
                        Toast.makeText(this, "Red Wins", Toast.LENGTH_SHORT).show();
                        green = false;

                    }
                }
            } else {
                statusred = false;
            }

            if ((array[i].getTag().equals("green") || array[i].getTag().equals("green2") || array[i].getTag().equals("green3") || array[i].getTag().equals("green4") || array[i].getTag().equals(" "))) {
                //Toast.makeText(this, "Green Wins", Toast.LENGTH_SHORT).show();

                if (i == 49 && statusgreen) {
                    for (int j = 0; j < 50; j++) {
                        array[j].setTag(" ");
                        array[j].setBackgroundResource(R.drawable.toe);
                    }

                    Toast.makeText(this, "Green Wins", Toast.LENGTH_SHORT).show();
                    green = false;
                }
            } else {
                statusgreen = false;
            }
        }


    }

    private void check() {
        resultchk();
        check2(0, 1, 5);
        check2(4, 3, 9);
        check2(45, 40, 46);
        check2(49, 48, 44);

        check3(1, 0, 2, 6);
        check3(2, 1, 3, 7);
        check3(3, 2, 4, 8);

        check3(46, 47, 45, 41);
        check3(47, 48, 46, 42);
        check3(48, 49, 47, 43);

        check3(5, 0, 6, 10);
        check3(10, 5, 11, 15);
        check3(15, 10, 16, 20);
        check3(20, 15, 21, 25);
        check3(25, 20, 26, 30);
        check3(30, 25, 31, 35);
        check3(35, 30, 36, 40);
        check3(40, 35, 41, 45);

        check3(9, 4, 8, 14);
        check3(14, 9, 13, 19);
        check3(19, 14, 18, 24);
        check3(24, 19, 23, 29);
        check3(29, 24, 28, 34);
        check3(34, 29, 33, 39);
        check3(39, 34, 38, 44);
        check3(44, 39, 43, 49);

        check4(6, 1, 7, 11, 5);
        check4(7, 2, 8, 12, 6);
        check4(8, 3, 9, 13, 7);
        check4(11, 6, 12, 16, 10);
        check4(12, 7, 13, 17, 11);
        check4(13, 8, 14, 18, 12);
        check4(16, 11, 17, 21, 15);
        check4(17, 12, 18, 22, 16);
        check4(18, 13, 19, 23, 17);
        check4(21, 16, 22, 26, 20);
        check4(22, 17, 23, 27, 21);
        check4(23, 18, 24, 28, 22);
        check4(26, 21, 27, 31, 25);
        check4(27, 22, 28, 32, 26);
        check4(28, 23, 29, 33, 27);
        check4(31, 26, 32, 36, 30);
        check4(32, 27, 33, 37, 31);
        check4(33, 28, 34, 38, 32);
        check4(36, 31, 37, 41, 35);
        check4(37, 32, 38, 42, 36);
        check4(38, 33, 39, 43, 37);
        check4(41, 36, 42, 46, 40);
        check4(42, 37, 43, 47, 41);
        check4(43, 38, 44, 48, 42);

    }

    private void check4(int i, int i1, int i2, int i3, int i4) {


        //red check button i
        if (array[i].getTag().equals("red4")) {
            //button i1 check
            if (array[i1].getTag().equals("red") || array[i1].getTag().equals("green")) {
                array[i1].setBackgroundResource(R.drawable.red2);
                array[i1].setTag("red2");

            } else if (array[i1].getTag().equals("red2") || array[i1].getTag().equals("green2")) {
                array[i1].setBackgroundResource(R.drawable.red3);
                array[i1].setTag("red3");
            } else if (array[i1].getTag().equals("red3") || array[i1].getTag().equals("green3")) {
                array[i1].setBackgroundResource(R.drawable.red4);
                array[i1].setTag("red4");
            } else if (array[i1].getTag().equals("red4") || array[i1].getTag().equals("green4")) {
                array[i1].setBackgroundResource(R.drawable.toe);
                array[i1].setTag(" ");
            } else {
                array[i1].setBackgroundResource(R.drawable.red);
                array[i1].setTag("red");

            }
            //button i2 check
            if (array[i2].getTag().equals("red") || array[i2].getTag().equals("green")) {
                array[i2].setBackgroundResource(R.drawable.red2);
                array[i2].setTag("red2");
            } else if (array[i2].getTag().equals("red2") || array[i2].getTag().equals("green2")) {
                array[i2].setBackgroundResource(R.drawable.red3);
                array[i2].setTag("red3");
            } else if (array[i2].getTag().equals("red3") || array[i2].getTag().equals("green3")) {
                array[i2].setBackgroundResource(R.drawable.red4);
                array[i2].setTag("red4");
            } else if (array[i2].getTag().equals("red4") || array[i2].getTag().equals("green4")) {
                array[i2].setBackgroundResource(R.drawable.toe);
                array[i2].setTag(" ");
            } else {
                array[i2].setBackgroundResource(R.drawable.red);
                array[i2].setTag("red");

            }
            //button i3 check
            if (array[i3].getTag().equals("red") || array[i3].getTag().equals("green")) {
                array[i3].setBackgroundResource(R.drawable.red2);
                array[i3].setTag("red2");
            } else if (array[i3].getTag().equals("red2") || array[i3].getTag().equals("green2")) {
                array[i3].setBackgroundResource(R.drawable.red3);
                array[i3].setTag("red3");
            } else if (array[i3].getTag().equals("red3") || array[i3].getTag().equals("red3")) {
                array[i3].setBackgroundResource(R.drawable.red4);
                array[i3].setTag("red4");
            } else if (array[i3].getTag().equals("red4") || array[i3].getTag().equals("green4")) {
                array[i3].setBackgroundResource(R.drawable.toe);
                array[i3].setTag(" ");
            } else {
                array[i3].setBackgroundResource(R.drawable.red);
                array[i3].setTag("red");

            }
            //button i4 check
            if (array[i4].getTag().equals("red") || array[i4].getTag().equals("green")) {
                array[i4].setBackgroundResource(R.drawable.red2);
                array[i4].setTag("red2");
            } else if (array[i4].getTag().equals("red2") || array[i4].getTag().equals("green2")) {
                array[i4].setBackgroundResource(R.drawable.red3);
                array[i4].setTag("red3");
            } else if (array[i4].getTag().equals("red3") || array[i4].getTag().equals("red3")) {
                array[i4].setBackgroundResource(R.drawable.red4);
                array[i4].setTag("red4");
            } else if (array[i4].getTag().equals("red4") || array[i4].getTag().equals("green4")) {
                array[i4].setBackgroundResource(R.drawable.toe);
                array[i4].setTag(" ");
            } else {
                array[i4].setBackgroundResource(R.drawable.red);
                array[i4].setTag("red");

            }

            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");

            check();
        }
        //green check button i
        else if (array[i].getTag().equals("green4")) {
            //button i1 check
            if (array[i1].getTag().equals("green") || array[i1].getTag().equals("red")) {
                array[i1].setBackgroundResource(R.drawable.green2);
                array[i1].setTag("green2");
            } else if (array[i1].getTag().equals("green2") || array[i1].getTag().equals("red2")) {
                array[i1].setBackgroundResource(R.drawable.green3);
                array[i1].setTag("green3");
            } else if (array[i1].getTag().equals("green3") || array[i1].getTag().equals("red3")) {
                array[i1].setBackgroundResource(R.drawable.green4);
                array[i1].setTag("green4");
            } else if (array[i1].getTag().equals("green4") || array[i1].getTag().equals("red4")) {
                array[i1].setBackgroundResource(R.drawable.toe);
                array[i1].setTag(" ");
            } else {
                array[i1].setBackgroundResource(R.drawable.green);
                array[i1].setTag("green");

            }
            //button i2 check
            if (array[i2].getTag().equals("green") || array[i2].getTag().equals("red")) {
                array[i2].setBackgroundResource(R.drawable.green2);
                array[i2].setTag("green2");
            } else if (array[i2].getTag().equals("green2") || array[i2].getTag().equals("red2")) {
                array[i2].setBackgroundResource(R.drawable.green3);
                array[i2].setTag("green3");
            } else if (array[i2].getTag().equals("green3") || array[i2].getTag().equals("red3")) {
                array[i2].setBackgroundResource(R.drawable.green4);
                array[i2].setTag("green4");
            } else if (array[i2].getTag().equals("green4") || array[i2].getTag().equals("red4")) {
                array[i2].setBackgroundResource(R.drawable.toe);
                array[i2].setTag(" ");
            } else {
                array[i2].setBackgroundResource(R.drawable.green);
                array[i2].setTag("green");

            }
            //button i3 check
            if (array[i3].getTag().equals("green") || array[i3].getTag().equals("red")) {
                array[i3].setBackgroundResource(R.drawable.green2);
                array[i3].setTag("green2");
            } else if (array[i3].getTag().equals("green2") || array[i3].getTag().equals("red2")) {
                array[i3].setBackgroundResource(R.drawable.green3);
                array[i3].setTag("green3");
            } else if (array[i3].getTag().equals("green3") || array[i3].getTag().equals("red3")) {
                array[i3].setBackgroundResource(R.drawable.green4);
                array[i3].setTag("green4");
            } else if (array[i3].getTag().equals("green4") || array[i3].getTag().equals("red4")) {
                array[i3].setBackgroundResource(R.drawable.toe);
                array[i3].setTag(" ");
            } else {
                array[i3].setBackgroundResource(R.drawable.green);
                array[i3].setTag("green");

            }
            //button i4 check
            if (array[i4].getTag().equals("green") || array[i4].getTag().equals("red")) {
                array[i4].setBackgroundResource(R.drawable.green2);
                array[i4].setTag("green2");
            } else if (array[i4].getTag().equals("green2") || array[i4].getTag().equals("red2")) {
                array[i4].setBackgroundResource(R.drawable.green3);
                array[i4].setTag("green3");
            } else if (array[i4].getTag().equals("green3") || array[i4].getTag().equals("red3")) {
                array[i4].setBackgroundResource(R.drawable.green4);
                array[i4].setTag("green4");
            } else if (array[i4].getTag().equals("green4") || array[i4].getTag().equals("red4")) {
                array[i4].setBackgroundResource(R.drawable.toe);
                array[i4].setTag(" ");
            } else {
                array[i4].setBackgroundResource(R.drawable.green);
                array[i4].setTag("green");

            }
            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");
            check();
        }
    }

    private void check3(int i, int i1, int i2, int i3) {

        //red check button i
        if (array[i].getTag().equals("red3")) {
            //button i1 check
            if (array[i1].getTag().equals("red") || array[i1].getTag().equals("green")) {
                array[i1].setBackgroundResource(R.drawable.red2);
                array[i1].setTag("red2");

            } else if (array[i1].getTag().equals("red2") || array[i1].getTag().equals("green2")) {
                array[i1].setBackgroundResource(R.drawable.red3);
                array[i1].setTag("red3");
            } else if (array[i1].getTag().equals("red3") || array[i1].getTag().equals("green3")) {
                array[i1].setBackgroundResource(R.drawable.red4);
                array[i1].setTag("red4");
            } else {
                array[i1].setBackgroundResource(R.drawable.red);
                array[i1].setTag("red");

            }
            //button i2 check
            if (array[i2].getTag().equals("red") || array[i2].getTag().equals("green")) {
                array[i2].setBackgroundResource(R.drawable.red2);
                array[i2].setTag("red2");
            } else if (array[i2].getTag().equals("red2") || array[i2].getTag().equals("green2")) {
                array[i2].setBackgroundResource(R.drawable.red3);
                array[i2].setTag("red3");
            } else if (array[i2].getTag().equals("red3") || array[i2].getTag().equals("green3")) {
                array[i2].setBackgroundResource(R.drawable.red4);
                array[i2].setTag("red4");
            } else {
                array[i2].setBackgroundResource(R.drawable.red);
                array[i2].setTag("red");

            }
            //button i3 check
            if (array[i3].getTag().equals("red") || array[i3].getTag().equals("green")) {
                array[i3].setBackgroundResource(R.drawable.red2);
                array[i3].setTag("red2");
            } else if (array[i3].getTag().equals("red2") || array[i3].getTag().equals("green2")) {
                array[i3].setBackgroundResource(R.drawable.red3);
                array[i3].setTag("red3");
            } else if (array[i3].getTag().equals("red3") || array[i3].getTag().equals("red3")) {
                array[i3].setBackgroundResource(R.drawable.red4);
                array[i3].setTag("red4");
            } else {
                array[i3].setBackgroundResource(R.drawable.red);
                array[i3].setTag("red");

            }
            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");

            check();
        }
        //green check button i
        else if (array[i].getTag().equals("green3")) {
            //button i1 check
            if (array[i1].getTag().equals("green") || array[i1].getTag().equals("red")) {
                array[i1].setBackgroundResource(R.drawable.green2);
                array[i1].setTag("green2");
            } else if (array[i1].getTag().equals("green2") || array[i1].getTag().equals("red2")) {
                array[i1].setBackgroundResource(R.drawable.green3);
                array[i1].setTag("green3");
            } else if (array[i1].getTag().equals("green3") || array[i1].getTag().equals("red3")) {
                array[i1].setBackgroundResource(R.drawable.green4);
                array[i1].setTag("green4");
            } else {
                array[i1].setBackgroundResource(R.drawable.green);
                array[i1].setTag("green");

            }
            //button i2 check
            if (array[i2].getTag().equals("green") || array[i2].getTag().equals("red")) {
                array[i2].setBackgroundResource(R.drawable.green2);
                array[i2].setTag("green2");
            } else if (array[i2].getTag().equals("green2") || array[i2].getTag().equals("red2")) {
                array[i2].setBackgroundResource(R.drawable.green3);
                array[i2].setTag("green3");
            } else if (array[i2].getTag().equals("green3") || array[i2].getTag().equals("red3")) {
                array[i2].setBackgroundResource(R.drawable.green4);
                array[i2].setTag("green4");
            } else {
                array[i2].setBackgroundResource(R.drawable.green);
                array[i2].setTag("green");

            }
            //button i3 check
            if (array[i3].getTag().equals("green") || array[i3].getTag().equals("red")) {
                array[i3].setBackgroundResource(R.drawable.green2);
                array[i3].setTag("green2");
            } else if (array[i3].getTag().equals("green2") || array[i3].getTag().equals("red2")) {
                array[i3].setBackgroundResource(R.drawable.green3);
                array[i3].setTag("green3");
            } else if (array[i3].getTag().equals("green3") || array[i3].getTag().equals("red3")) {
                array[i3].setBackgroundResource(R.drawable.green4);
                array[i3].setTag("green4");
            } else {
                array[i3].setBackgroundResource(R.drawable.green);
                array[i3].setTag("green");

            }
            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");
            check();
        }
    }

    private void check2(int i, int i1, int i2) {


        //red check button i
        if (array[i].getTag().equals("red2")) {
            //button i1 check
            if (array[i1].getTag().equals("red") || array[i1].getTag().equals("green")) {
                array[i1].setBackgroundResource(R.drawable.red2);
                array[i1].setTag("red2");

            } else if (array[i1].getTag().equals("red2") || array[i1].getTag().equals("green2")) {
                array[i1].setBackgroundResource(R.drawable.red3);
                array[i1].setTag("red3");
            } else {
                array[i1].setBackgroundResource(R.drawable.red);
                array[i1].setTag("red");

            }
            //button i2 check
            if (array[i2].getTag().equals("red") || array[i2].getTag().equals("green")) {
                array[i2].setBackgroundResource(R.drawable.red2);
                array[i2].setTag("red2");
            } else if (array[i2].getTag().equals("red2") || array[i2].getTag().equals("green2")) {
                array[i2].setBackgroundResource(R.drawable.red3);
                array[i2].setTag("red3");
            } else {
                array[i2].setBackgroundResource(R.drawable.red);
                array[i2].setTag("red");

            }
            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");
            check();

        }
        //green check button i
        else if (array[i].getTag().equals("green2")) {
            //button i1 check
            if (array[i1].getTag().equals("green") || array[i1].getTag().equals("red")) {
                array[i1].setBackgroundResource(R.drawable.green2);
                array[i1].setTag("green2");
            } else if (array[i1].getTag().equals("green2") || array[i1].getTag().equals("red2")) {
                array[i1].setBackgroundResource(R.drawable.green3);
                array[i1].setTag("green3");
            } else {
                array[i1].setBackgroundResource(R.drawable.green);
                array[i1].setTag("green");

            }
            //button i2 check
            if (array[i2].getTag().equals("green") || array[i2].getTag().equals("red")) {
                array[i2].setBackgroundResource(R.drawable.green2);
                array[i2].setTag("green2");
            } else if (array[i2].getTag().equals("green2") || array[i2].getTag().equals("red2")) {
                array[i2].setBackgroundResource(R.drawable.green3);
                array[i2].setTag("green3");
            } else {
                array[i2].setBackgroundResource(R.drawable.green);
                array[i2].setTag("green");

            }
            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");
            check();
        }
    }

    private void turnchk() {
        //turn check
        if (turn == 1) {


            //  imageView.setBackgroundResource(R.drawable.background_red);
            //   Toast.makeText(this, "Red's turn", Toast.LENGTH_SHORT).show();
        } else if (turn == 2) {
            //   imageView.setBackgroundResource(R.drawable.background_green);
            //  Toast.makeText(this, "Green's turn", Toast.LENGTH_SHORT).show();
        }
    }

    private void initialize() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);
        button26 = findViewById(R.id.button26);
        button27 = findViewById(R.id.button27);
        button28 = findViewById(R.id.button28);
        button29 = findViewById(R.id.button29);
        button30 = findViewById(R.id.button30);
        button31 = findViewById(R.id.button31);
        button32 = findViewById(R.id.button32);
        button33 = findViewById(R.id.button33);
        button34 = findViewById(R.id.button34);
        button35 = findViewById(R.id.button35);
        button36 = findViewById(R.id.button36);
        button37 = findViewById(R.id.button37);
        button38 = findViewById(R.id.button38);
        button39 = findViewById(R.id.button39);
        button40 = findViewById(R.id.button40);
        button41 = findViewById(R.id.button41);
        button42 = findViewById(R.id.button42);
        button43 = findViewById(R.id.button43);
        button44 = findViewById(R.id.button44);
        button45 = findViewById(R.id.button45);
        button46 = findViewById(R.id.button46);
        button47 = findViewById(R.id.button47);
        button48 = findViewById(R.id.button48);
        button49 = findViewById(R.id.button49);
        button50 = findViewById(R.id.button50);
        array[0] = button1;
        array[1] = button2;
        array[2] = button3;
        array[3] = button4;
        array[4] = button5;
        array[5] = button6;
        array[6] = button7;
        array[7] = button8;
        array[8] = button9;
        array[9] = button10;
        array[10] = button11;
        array[11] = button12;
        array[12] = button13;
        array[13] = button14;
        array[14] = button15;
        array[15] = button16;
        array[16] = button17;
        array[17] = button18;
        array[18] = button19;
        array[19] = button20;
        array[20] = button21;
        array[21] = button22;
        array[22] = button23;
        array[23] = button24;
        array[24] = button25;
        array[25] = button26;
        array[26] = button27;
        array[27] = button28;
        array[28] = button29;
        array[29] = button30;
        array[30] = button31;
        array[31] = button32;
        array[32] = button33;
        array[33] = button34;
        array[34] = button35;
        array[35] = button36;
        array[36] = button37;
        array[37] = button38;
        array[38] = button39;
        array[39] = button40;
        array[40] = button41;
        array[41] = button42;
        array[42] = button43;
        array[43] = button44;
        array[44] = button45;
        array[45] = button46;
        array[46] = button47;
        array[47] = button48;
        array[48] = button49;
        array[49] = button50;
        for (int i = 0; i < 50; i++) {
            array[i].setTag(" ");
            /**
             final int finalI = i;
             Runnable runnable = new Runnable() {
            @Override public void run() {
            array[finalI].animate().rotationBy(360).withEndAction(this).setDuration(6000).setInterpolator(new LinearInterpolator()).start();
            }
            };

             array[finalI].animate().rotationBy(360).withEndAction(runnable).setDuration(6000).setInterpolator(new LinearInterpolator()).start();
             **/
        }

    }


}











