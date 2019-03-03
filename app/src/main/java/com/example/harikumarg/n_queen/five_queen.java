package com.example.harikumarg.n_queen;

import android.content.Intent;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.DialogInterface;

import com.example.harikumarg.utility.Utility;


public class five_queen extends AppCompatActivity implements View.OnClickListener {

    Button b00;
    Button b01;
    Button b02;
    Button b03;
    Button b04;

    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;

    Button b20;
    Button b21;
    Button b22;
    Button b23;
    Button b24;

    Button b30;
    Button b31;
    Button b32;
    Button b33;
    Button b34;

    Button b40;
    Button b41;
    Button b42;
    Button b43;
    Button b44;

    Button next;
    Button retry;

    int[][] board = new int[5][5];
    int n = 5;
    int queencount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_queen);

        b00 = (Button) findViewById(R.id.b00);
        b01 = (Button) findViewById(R.id.b01);
        b02 = (Button) findViewById(R.id.b02);
        b03 = (Button) findViewById(R.id.b03);
        b04 = (Button) findViewById(R.id.b04);

        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);

        b20 = (Button) findViewById(R.id.b20);
        b21 = (Button) findViewById(R.id.b21);
        b22 = (Button) findViewById(R.id.b22);
        b23 = (Button) findViewById(R.id.b23);
        b24 = (Button) findViewById(R.id.b24);

        b30 = (Button) findViewById(R.id.b30);
        b31 = (Button) findViewById(R.id.b31);
        b32 = (Button) findViewById(R.id.b32);
        b33 = (Button) findViewById(R.id.b33);
        b34 = (Button) findViewById(R.id.b34);

        b40 = (Button) findViewById(R.id.b40);
        b41 = (Button) findViewById(R.id.b41);
        b42 = (Button) findViewById(R.id.b42);
        b43 = (Button) findViewById(R.id.b43);
        b44 = (Button) findViewById(R.id.b44);

        next = (Button) findViewById(R.id.next);
        retry = (Button) findViewById(R.id.retry);

        b00.setOnClickListener(this);
        b01.setOnClickListener(this);
        b02.setOnClickListener(this);
        b03.setOnClickListener(this);
        b04.setOnClickListener(this);

        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);

        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);

        b30.setOnClickListener(this);
        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b34.setOnClickListener(this);

        b40.setOnClickListener(this);
        b41.setOnClickListener(this);
        b42.setOnClickListener(this);
        b43.setOnClickListener(this);
        b44.setOnClickListener(this);

        retry.setOnClickListener(this);

        next.setEnabled(false);
        Utility.initializeboard(board);

        AlertDialog dialog = new AlertDialog.Builder(five_queen.this)
                .setTitle("Note:\n")
                .setMessage("1.No Queen should attack each other.\n2.To place the queen click the box.\n3.To remove the queen click that box again.\n4.If you go back to the previous level then the data in the current level will be lost.")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        dialog.show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.retry: {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
                break;
            }
            case R.id.b00: {
                if (b00.getText() == "Q") {
                    b00.setText("");
                    board[0][0] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 0, 0) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b00.setText("Q");
                        board[0][0] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b01: {
                if (b01.getText() == "Q") {
                    b01.setText("");
                    board[0][1] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 0, 1) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {

                        b01.setText("Q");
                        board[0][1] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b02: {
                if (b02.getText() == "Q") {
                    b02.setText("");
                    board[0][2] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 0, 2) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b02.setText("Q");
                        board[0][2] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b03: {
                if (b03.getText() == "Q") {
                    b03.setText("");
                    board[0][3] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 0, 3) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b03.setText("Q");
                        board[0][3] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b04: {
                if (b04.getText() == "Q") {
                    b04.setText("");
                    board[0][4] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 0, 4) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b04.setText("Q");
                        board[0][4] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b10: {
                if (b10.getText() == "Q") {
                    b10.setText("");
                    board[1][0] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {

                    if (Utility.checkattack(board, n, 1, 0) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b10.setText("Q");
                        board[1][0] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b11: {
                if (b11.getText() == "Q") {
                    b11.setText("");
                    board[1][1] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 1, 1) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b11.setText("Q");
                        board[1][1] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b12: {
                if (b12.getText() == "Q") {
                    b12.setText("");
                    board[1][2] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 1, 2) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b12.setText("Q");
                        board[1][2] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b13: {
                if (b13.getText() == "Q") {
                    b13.setText("");
                    board[1][3] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 1, 3) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b13.setText("Q");
                        board[1][3] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b14: {
                if (b14.getText() == "Q") {
                    b14.setText("");
                    board[1][4] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 1, 4) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b14.setText("Q");
                        board[1][4] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }

            case R.id.b20: {
                if (b20.getText() == "Q") {
                    b20.setText("");
                    board[2][0] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 2, 0) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b20.setText("Q");
                        board[2][0] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b21: {
                if (b21.getText() == "Q") {
                    b21.setText("");
                    board[2][1] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 2, 1) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b21.setText("Q");
                        board[2][1] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b22: {
                if (b22.getText() == "Q") {
                    b22.setText("");
                    board[2][2] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 2, 2) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b22.setText("Q");
                        board[2][2] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b23: {
                if (b23.getText() == "Q") {
                    b23.setText("");
                    board[2][3] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 2, 3) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b23.setText("Q");
                        board[2][3] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b24: {
                if (b24.getText() == "Q") {
                    b24.setText("");
                    board[2][4] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 2, 4) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b24.setText("Q");
                        board[2][4] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b30: {
                if (b30.getText() == "Q") {
                    b30.setText("");
                    board[3][0] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 3, 0) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b30.setText("Q");
                        board[3][0] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b31: {
                if (b31.getText() == "Q") {
                    b31.setText("");
                    board[3][1] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 3, 1) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b31.setText("Q");
                        board[3][1] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b32: {
                if (b32.getText() == "Q") {
                    b32.setText("");
                    board[3][2] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 3, 2) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b32.setText("Q");
                        board[3][2] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b33: {
                if (b33.getText() == "Q") {
                    b33.setText("");
                    board[3][3] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 3, 3) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b33.setText("Q");
                        board[3][3] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b34: {
                if (b34.getText() == "Q") {
                    b34.setText("");
                    board[3][4] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 3, 4) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b34.setText("Q");
                        board[3][4] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }

            case R.id.b40: {
                if (b40.getText() == "Q") {
                    b40.setText("");
                    board[4][0] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 4, 0) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b40.setText("Q");
                        board[4][0] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b41: {
                if (b41.getText() == "Q") {
                    b41.setText("");
                    board[4][1] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 4, 1) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b41.setText("Q");
                        board[4][1] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b42: {
                if (b42.getText() == "Q") {
                    b42.setText("");
                    board[4][2] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 4, 2) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b42.setText("Q");
                        board[4][2] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b43: {
                if (b43.getText() == "Q") {
                    b43.setText("");
                    board[4][3] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 4, 3) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b43.setText("Q");
                        board[4][3] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b44: {
                if (b44.getText() == "Q") {
                    b44.setText("");
                    board[4][4] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 4, 4) == false) {
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops! Sorry your queen has been attacked somewhere", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 800);
                    } else {
                        b44.setText("Q");
                        board[4][4] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent nextlevel = new Intent("com.example.harikumarg.n_queen.six_queen");
                                    startActivity(nextlevel);
                                }
                            });
                        }
                    }
                }
                break;
            }
        }
    }
}
