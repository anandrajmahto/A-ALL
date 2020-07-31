package com.armscreation.a_games.tictactoe;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.armscreation.a_games.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Random;

public class Host extends AppCompatActivity {
    TextView room_code, turn_dis;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String UserId;
    String nameofhost;
    Button hostbtn, reset_btn;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Boolean Turn;
    private DatabaseReference mDatabase;
    ImageView connection_check;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_tic);
        turn_dis = findViewById(R.id.turn_dis);
        Turn = false;
        connection_check = findViewById(R.id.connection_check);
        reset_btn = findViewById(R.id.reset_btn);
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
                    button1.setText("X");

                    button1.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g1");
                    check();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button2.getText().equals(" ") && Turn) {
                    button2.setText("X");
                    button2.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g2");
                    check();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button3.getText().equals(" ") && Turn) {
                    button3.setText("X");

                    button3.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g3");
                    check();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button4.getText().equals(" ") && Turn) {
                    button4.setText("X");

                    button4.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g4");
                    check();
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button5.getText().equals(" ") && Turn) {
                    button5.setText("X");
                    button5.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g5");
                    check();
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button6.getText().equals(" ") && Turn) {
                    button6.setText("X");

                    button6.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g6");
                    check();
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button7.getText().equals(" ") && Turn) {
                    button7.setText("X");

                    button7.setTextColor(Color.parseColor("#A6FF0000"));

                    UpdateData("g7");
                    check();
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button8.getText().equals(" ") && Turn) {
                    button8.setText("X");
                    button8.setTextColor(Color.parseColor("#A6FF0000"));
                    UpdateData("g8");
                    check();
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button9.getText().equals(" ") && Turn) {
                    button9.setText("X");
                    button9.setTextColor(Color.parseColor("#A6FF0000"));
                    Turn = false;
                    UpdateData("g9");
                    check();
                }
            }
        });


        int min = 1;
        int max = 100000;

        Random r = new Random();
        final String i = String.valueOf(r.nextInt(max - min + 1) + min);

        hostbtn = findViewById(R.id.hostbtn);
        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        room_code = findViewById(R.id.room_code);

        nameofhost = i;
        room_code.setText("Code=" + nameofhost);
        //Creating Data base
        mDatabase = FirebaseDatabase.getInstance().getReference();
        hostbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset_btn.setVisibility(View.VISIBLE);
                mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("Turn").setValue("online1");
                // DataAdapter user = new DataAdapter(nameofhost);
                DataAdapter user1 = new DataAdapter(" ", " ", " ", " ", " ", " ", " ", " ", " ");
                DataAdapter user2 = new DataAdapter("1", "");
                turn_dis.setText("Your Turn");
                //  mDatabase.child("TicTacToe").child(nameofhost).setValue(user);
                mDatabase.child("TicTacToe").child(nameofhost).child("Moves").setValue(user1);
                mDatabase.child("TicTacToe").child(nameofhost).child("Turn").setValue(user2);

                Toast.makeText(Host.this, "Hosted for Roomid=" + nameofhost, Toast.LENGTH_SHORT).show();
                hostbtn.setVisibility(View.INVISIBLE);
                //  String userId = mDatabase.push().getKey();
                mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("Turn").setValue("online1");

            }
        });

        //   if (turn_dis.getText()!=null){
        //Getting Values(Turn)

        mDatabase.child("TicTacToe").child(nameofhost).child("Turn").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {
                    DataAdapter user = dataSnapshot.getValue(DataAdapter.class);
                    if (user.getTurn().equals("1")) {
                        Turn = true;
                        turn_dis.setText("Your Turn");
                    } else if (user.getTurn().equals("2")) {
                        Turn = false;
                        turn_dis.setText("Your Opponent Turn");
                    }

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(Host.this, "error", Toast.LENGTH_SHORT).show();

            }
        });

        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {
                    DataAdapter user = dataSnapshot.getValue(DataAdapter.class);

                    button1.setText(user.getG1());
                    button2.setText(user.getG2());
                    button3.setText(user.getG3());
                    button4.setText(user.getG4());
                    button5.setText(user.getG5());
                    button6.setText(user.getG6());
                    button7.setText(user.getG7());
                    button8.setText(user.getG8());
                    button9.setText(user.getG9());
                    check();
                    if ((user.getG1() != " ") && (user.getG2() != " ") && (user.getG3() != " ") && (user.getG4() != " ") && (user.getG5() != " ") && (user.getG6() != " ") && (user.getG7() != " ") && (user.getG8() != " ") && (user.getG9() != " ")) {


                    }

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(Host.this, "error", Toast.LENGTH_SHORT).show();
            }
        });
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("Turn").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {
                    String user = (String) dataSnapshot.getValue();
                    if (user.equals("online")) {
                        connection_check.setVisibility(View.VISIBLE);
                    } else if (user.equals("online1")) {
                        //connection_check.setVisibility(View.INVISIBLE);
                    } else {
                        connection_check.setVisibility(View.INVISIBLE);
                        reset_btn.setVisibility(View.INVISIBLE);
                        hostbtn.setVisibility(View.VISIBLE);

                        turn_dis.setText("Opponent has left");
                    }
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(Host.this, "error", Toast.LENGTH_SHORT).show();

            }
        });
    }

    // }

    private void UpdateData(String g) {
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child(g).setValue("X");
        DataAdapter user2 = new DataAdapter("2", "");
        mDatabase.child("TicTacToe").child(nameofhost).child("Turn").setValue(user2);
    }

    public void check() {

        Thread myThread;
        myThread = new Thread() {
            @Override
            public void run() {
                try {
                    cleanX();
                    sleep(2000);
                    ResetData();
                    //  clean();
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
                    cleanO();
                    sleep(2000);
                    ResetData();
                    //clean();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //Toast.makeText(getApplicationContext(),"mesage",Toast.LENGTH_SHORT).show();
            }
        };


        if (button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) {
            myThread.start();
        } else if (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) {
            myThread.start();
        } else if (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) {
            myThread.start();
        } else if (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) {
            myThread.start();
        } else if (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) {
            myThread.start();
        } else if (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) {
            myThread.start();
        } else if (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) {
            myThread.start();
        } else if (button7.getText().equals("X") && button5.getText().equals("X") && button3.getText().equals("X")) {
            myThread.start();
        }

        if (button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) {
            myThread1.start();
        } else if (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) {
            myThread1.start();
        } else if (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) {
            myThread1.start();
        } else if (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) {
            myThread1.start();
        } else if (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) {
            myThread1.start();
        } else if (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) {
            myThread1.start();
        } else if (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) {
            myThread1.start();
        } else if (button7.getText().equals("O") && button5.getText().equals("O") && button3.getText().equals("O")) {
            myThread1.start();
        }
        if ((button1.getText() != " ") && (button2.getText() != " ") && (button3.getText() != " ") && (button4.getText() != " ") && (button5.getText() != " ") && (button6.getText() != " ") && (button7.getText() != " ") && (button8.getText() != " ") && (button9.getText() != " ")) {

            //   Toast.makeText(this, button1.getText()+""+button2.getText()+""+button3.getText()+""+button4.getText()+""+button5.getText()+""+button6.getText()+""+button7.getText()+""+button8.getText()+""+button9.getText(), Toast.LENGTH_SHORT).show();
            //  myThread2.start();
        }
    }
    private void ResetData() {
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g1").setValue(" ");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g2").setValue(" ");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g3").setValue(" ");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g4").setValue(" ");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g5").setValue(" ");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g6").setValue(" ");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g7").setValue(" ");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g8").setValue(" ");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g9").setValue(" ");
        int min = 1;
        int max = 2;

        Random r = new Random();
        final int i = r.nextInt(max - min + 1) + min;
        if (i == 1) {
            DataAdapter user2 = new DataAdapter("1", "Connected");
            mDatabase.child("TicTacToe").child(nameofhost).child("Turn").setValue(user2);
            Turn = true;
        } else {
            DataAdapter user2 = new DataAdapter("2", "Connected");
            mDatabase.child("TicTacToe").child(nameofhost).child("Turn").setValue(user2);
            Turn = false;
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
    void cleanX() {
        //   Toast.makeText(getApplicationContext(), "You Won", Toast.LENGTH_LONG).show();
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
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g1").setValue("x");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g2").setValue("x");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g3").setValue("x");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g4").setValue("x");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g5").setValue("x");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g6").setValue("x");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g7").setValue("x");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g8").setValue("x");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g9").setValue("x");
    }
    void cleanO() {
        // Toast.makeText(getApplicationContext(), "Your Opponent Won", Toast.LENGTH_LONG).show();
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
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g1").setValue("o");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g2").setValue("o");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g3").setValue("o");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g4").setValue("o");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g5").setValue("o");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g6").setValue("o");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g7").setValue("o");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g8").setValue("o");
        mDatabase.child("TicTacToe").child(nameofhost).child("Moves").child("g9").setValue("o");
    }
    public void onDestroy() {
        super.onDestroy();
        //Remove a value from realtime database
        DatabaseReference mDatabase;
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("TicTacToe").child(nameofhost).removeValue();
    }

}