package com.armscreation.a_games.tictactoe;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.armscreation.a_games.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Random;

public class Join extends AppCompatActivity {
    TextView turn_dis;
    EditText input_room_codee;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, reset_btn;
    Boolean Turn;
    String input_room_code;
    private DatabaseReference mDatabase;
    ImageView connection_check;
    Button connect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_tic);
        reset_btn = findViewById(R.id.reset_btn);

        turn_dis = findViewById(R.id.turn_dis);
        connect = findViewById(R.id.btnConnect);
        connection_check = findViewById(R.id.connection_check);
        Turn = false;
        input_room_code = "0";
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResetData();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.getText().equals(" ") && Turn) {
                    button1.setText("O");

                    button1.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g1");
                   // check();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().equals(" ") && Turn) {
                    button2.setText("O");

                    button2.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g2");
                    // check();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText().equals(" ") && Turn) {
                    button3.setText("O");

                    button3.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g3");
                    //  check();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText().equals(" ") && Turn) {
                    button4.setText("O");

                    button4.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g4");
                    //    check();
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button5.getText().equals(" ") && Turn) {
                    button5.setText("O");

                    button5.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g5");
                    //  check();
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button6.getText().equals(" ") && Turn) {
                    button6.setText("O");

                    button6.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g6");
                    // check();
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button7.getText().equals(" ") && Turn) {
                    button7.setText("O");

                    button7.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g7");
                    //   check();
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button8.getText().equals(" ") && Turn) {
                    button8.setText("O");

                    button8.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g8");
                    //   check();
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button9.getText().equals(" ") && Turn) {
                    button9.setText("O");

                    button9.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g9");
                    //   check();
                }
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference();
        input_room_codee = findViewById(R.id.input_room_code);

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input_room_code = input_room_codee.getText().toString();
                if (!(input_room_codee.getText().toString().isEmpty())) {
                    hideKeyboard((Button) view);
                    mDatabase.child("TicTacToe").child(input_room_code).addValueEventListener(new ValueEventListener() {
                        @SuppressLint("SetTextI18n")
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            if (dataSnapshot.getValue() != null) {
                                mDatabase.child("TicTacToe").child(input_room_code).child("Moves").child("Turn").setValue("online");

                                connect.setVisibility(View.INVISIBLE);
                                input_room_codee.setVisibility(View.INVISIBLE);
                                connection_check.setVisibility(View.VISIBLE);
                                reset_btn.setVisibility(View.VISIBLE);

                            } else {

                                reset_btn.setVisibility(View.INVISIBLE);
                                connect.setVisibility(View.VISIBLE);
                                turn_dis.setText(" ");
                                input_room_codee.setVisibility(View.VISIBLE);
                                clean();
                                connection_check.setVisibility(View.INVISIBLE);

                                Toast.makeText(Join.this, "Invalid Room Code", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            Toast.makeText(Join.this, "error", Toast.LENGTH_SHORT).show();

                        }
                    });

                    mDatabase.child("TicTacToe").child(input_room_code).child("Turn").addValueEventListener(new ValueEventListener() {
                        @SuppressLint("SetTextI18n")
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            if (dataSnapshot.getValue() != null) {
                                DataAdapter user = dataSnapshot.getValue(DataAdapter.class);

                                assert user != null;
                                if (user.getTurn().equals("2")) {
                                    Turn = true;
                                    turn_dis.setText("Your Turn");
                                } else if (user.getTurn().equals("1")) {
                                    turn_dis.setText("Your Opponent Turn");
                                    Turn = false;
                                }
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            Toast.makeText(Join.this, "error", Toast.LENGTH_SHORT).show();

                        }
                    });

                    mDatabase.child("TicTacToe").child(input_room_code).child("Moves").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            if (dataSnapshot.getValue() != null) {
                                DataAdapter user = dataSnapshot.getValue(DataAdapter.class);

                                assert user != null;
                                button1.setText(user.getG1());
                                button2.setText(user.getG2());
                                button3.setText(user.getG3());
                                button4.setText(user.getG4());
                                button5.setText(user.getG5());
                                button6.setText(user.getG6());
                                button7.setText(user.getG7());
                                button8.setText(user.getG8());
                                button9.setText(user.getG9());
                                //check();
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            Toast.makeText(Join.this, "error", Toast.LENGTH_SHORT).show();

                        }
                    });
                }
            }
        });
        // if (connection.getText()!=null){
        //Getting Values(Turn)


        //}

    }

    private void UpdateData(String g) {

        mDatabase.child("TicTacToe").child(input_room_code).child("Moves").child(g).setValue("O");
        DataAdapter user2 = new DataAdapter("1", "Connected");
        mDatabase.child("TicTacToe").child(input_room_code).child("Turn").setValue(user2);

    }

    public void check() {

        Thread myThread;
        myThread = new Thread() {
            @Override
            public void run() {
                try {
                    cleanO();

                    sleep(2000);

                    clean();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //Toast.makeText(getApplicationContext(),"mesage",Toast.LENGTH_SHORT).show();
            }
        };
        Thread myThread1;
        myThread1 = new Thread() {
            @Override
            public void run() {
                try {
                    cleanX();

                    sleep(2000);

                    clean();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //Toast.makeText(getApplicationContext(),"mesage",Toast.LENGTH_SHORT).show();
            }
        };



        if (button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) {


            myThread.start();
        } else if (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) {

            myThread.start();
        } else if (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) {

            myThread.start();
        } else if (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) {

            myThread.start();
        } else if (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) {

            myThread.start();
        } else if (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) {

            myThread.start();
        } else if (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) {

            myThread.start();
        } else if (button7.getText().equals("O") && button5.getText().equals("O") && button3.getText().equals("O")) {

            myThread.start();
        }


        if (button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) {


            myThread1.start();
        } else if (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) {

            myThread1.start();
        } else if (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) {

            myThread1.start();
        } else if (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) {

            myThread1.start();
        } else if (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) {

            myThread1.start();
        } else if (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) {

            myThread1.start();
        } else if (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) {

            myThread1.start();
        } else if (button7.getText().equals("X") && button5.getText().equals("X") && button3.getText().equals("X")) {

            myThread1.start();
        }

    }

    private void ResetData() {
        mDatabase.child("TicTacToe").child(input_room_code).child("Moves").child("g1").setValue(" ");
        mDatabase.child("TicTacToe").child(input_room_code).child("Moves").child("g2").setValue(" ");
        mDatabase.child("TicTacToe").child(input_room_code).child("Moves").child("g3").setValue(" ");
        mDatabase.child("TicTacToe").child(input_room_code).child("Moves").child("g4").setValue(" ");
        mDatabase.child("TicTacToe").child(input_room_code).child("Moves").child("g5").setValue(" ");
        mDatabase.child("TicTacToe").child(input_room_code).child("Moves").child("g6").setValue(" ");
        mDatabase.child("TicTacToe").child(input_room_code).child("Moves").child("g7").setValue(" ");
        mDatabase.child("TicTacToe").child(input_room_code).child("Moves").child("g8").setValue(" ");
        mDatabase.child("TicTacToe").child(input_room_code).child("Moves").child("g9").setValue(" ");

        int min = 1;
        int max = 2;

        Random r = new Random();
        final int i = r.nextInt(max - min + 1) + min;
        if (i == 1) {
            DataAdapter user2 = new DataAdapter("1", "Connected");
            mDatabase.child("TicTacToe").child(input_room_code).child("Turn").setValue(user2);
            Turn = false;
        } else {
            DataAdapter user2 = new DataAdapter("2", "Connected");
            mDatabase.child("TicTacToe").child(input_room_code).child("Turn").setValue(user2);
            Turn = true;
        }

    }

    void clean() {
        button1.setText(" ");
        button2.setText(" ");
        button3.setText(" ");
        button4.setText(" ");
        button5.setText(" ");
        button6.setText(" ");
        button7.setText(" ");
        button8.setText(" ");
        button9.setText(" ");
        button1.setTextColor(Color.parseColor("#473e3e"));
        button2.setTextColor(Color.parseColor("#473e3e"));
        button3.setTextColor(Color.parseColor("#473e3e"));
        button4.setTextColor(Color.parseColor("#473e3e"));
        button5.setTextColor(Color.parseColor("#473e3e"));
        button6.setTextColor(Color.parseColor("#473e3e"));
        button7.setTextColor(Color.parseColor("#473e3e"));
        button8.setTextColor(Color.parseColor("#473e3e"));
        button9.setTextColor(Color.parseColor("#473e3e"));

    }

    void cleanO() {
        //    Toast.makeText(getApplicationContext(), "You Won", Toast.LENGTH_LONG).show();
        button1.setText("O");
        button2.setText("O");
        button3.setText("O");
        button4.setText("O");
        button5.setText("O");
        button6.setText("O");
        button7.setText("O");
        button8.setText("O");
        button9.setText("O");
        button1.setTextColor(Color.parseColor("#A6FF0000"));
        button2.setTextColor(Color.parseColor("#A6FF0000"));
        button3.setTextColor(Color.parseColor("#A6FF0000"));
        button4.setTextColor(Color.parseColor("#A6FF0000"));
        button5.setTextColor(Color.parseColor("#A6FF0000"));
        button6.setTextColor(Color.parseColor("#A6FF0000"));
        button7.setTextColor(Color.parseColor("#A6FF0000"));
        button8.setTextColor(Color.parseColor("#A6FF0000"));
        button9.setTextColor(Color.parseColor("#A6FF0000"));


    }

    void cleanX() {
        //   Toast.makeText(getApplicationContext(), "Your Opponent Won", Toast.LENGTH_LONG).show();
        button1.setText("X");
        button2.setText("X");
        button3.setText("X");
        button4.setText("X");
        button5.setText("X");
        button6.setText("X");
        button7.setText("X");
        button8.setText("X");
        button9.setText("X");
        button1.setTextColor(Color.parseColor("#A6FF0000"));
        button2.setTextColor(Color.parseColor("#A6FF0000"));
        button3.setTextColor(Color.parseColor("#A6FF0000"));
        button4.setTextColor(Color.parseColor("#A6FF0000"));
        button5.setTextColor(Color.parseColor("#A6FF0000"));
        button6.setTextColor(Color.parseColor("#A6FF0000"));
        button7.setTextColor(Color.parseColor("#A6FF0000"));
        button8.setTextColor(Color.parseColor("#A6FF0000"));
        button9.setTextColor(Color.parseColor("#A6FF0000"));
    }

    public void hideKeyboard(View view) {
        try {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception ignored) {
        }
    }

    public void onDestroy() {

        super.onDestroy();
        //Remove a value from realtime database
        DatabaseReference mDatabase;
        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("TicTacToe").child(input_room_code).removeValue();
    }
}