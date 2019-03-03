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


public class eight_queen extends AppCompatActivity implements View.OnClickListener {

    Button b00;
    Button b01;
    Button b02;
    Button b03;
    Button b04;
    Button b05;
    Button b06;
    Button b07;

    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;
    Button b17;

    Button b20;
    Button b21;
    Button b22;
    Button b23;
    Button b24;
    Button b25;
    Button b26;
    Button b27;

    Button b30;
    Button b31;
    Button b32;
    Button b33;
    Button b34;
    Button b35;
    Button b36;
    Button b37;

    Button b40;
    Button b41;
    Button b42;
    Button b43;
    Button b44;
    Button b45;
    Button b46;
    Button b47;

    Button b50;
    Button b51;
    Button b52;
    Button b53;
    Button b54;
    Button b55;
    Button b56;
    Button b57;

    Button b60;
    Button b61;
    Button b62;
    Button b63;
    Button b64;
    Button b65;
    Button b66;
    Button b67;

    Button b70;
    Button b71;
    Button b72;
    Button b73;
    Button b74;
    Button b75;
    Button b76;
    Button b77;

    Button next;
    Button retry;

    int[][] board = new int[8][8];
    int n = 8;
    int queencount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_queen);

        b00 = (Button) findViewById(R.id.b00);
        b01 = (Button) findViewById(R.id.b01);
        b02 = (Button) findViewById(R.id.b02);
        b03 = (Button) findViewById(R.id.b03);
        b04 = (Button) findViewById(R.id.b04);
        b05 = (Button) findViewById(R.id.b05);
        b06 = (Button) findViewById(R.id.b06);
        b07 = (Button) findViewById(R.id.b07);

        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15);
        b16 = (Button) findViewById(R.id.b16);
        b17 = (Button) findViewById(R.id.b17);

        b20 = (Button) findViewById(R.id.b20);
        b21 = (Button) findViewById(R.id.b21);
        b22 = (Button) findViewById(R.id.b22);
        b23 = (Button) findViewById(R.id.b23);
        b24 = (Button) findViewById(R.id.b24);
        b25 = (Button) findViewById(R.id.b25);
        b26 = (Button) findViewById(R.id.b26);
        b27 = (Button) findViewById(R.id.b27);

        b30 = (Button) findViewById(R.id.b30);
        b31 = (Button) findViewById(R.id.b31);
        b32 = (Button) findViewById(R.id.b32);
        b33 = (Button) findViewById(R.id.b33);
        b34 = (Button) findViewById(R.id.b34);
        b35 = (Button) findViewById(R.id.b35);
        b36 = (Button) findViewById(R.id.b36);
        b37 = (Button) findViewById(R.id.b37);

        b40 = (Button) findViewById(R.id.b40);
        b41 = (Button) findViewById(R.id.b41);
        b42 = (Button) findViewById(R.id.b42);
        b43 = (Button) findViewById(R.id.b43);
        b44 = (Button) findViewById(R.id.b44);
        b45 = (Button) findViewById(R.id.b45);
        b46 = (Button) findViewById(R.id.b46);
        b47 = (Button) findViewById(R.id.b47);

        b50 = (Button) findViewById(R.id.b50);
        b51 = (Button) findViewById(R.id.b51);
        b52 = (Button) findViewById(R.id.b52);
        b53 = (Button) findViewById(R.id.b53);
        b54 = (Button) findViewById(R.id.b54);
        b55 = (Button) findViewById(R.id.b55);
        b56 = (Button) findViewById(R.id.b56);
        b57 = (Button) findViewById(R.id.b57);

        b60 = (Button) findViewById(R.id.b60);
        b61 = (Button) findViewById(R.id.b61);
        b62 = (Button) findViewById(R.id.b62);
        b63 = (Button) findViewById(R.id.b63);
        b64 = (Button) findViewById(R.id.b64);
        b65 = (Button) findViewById(R.id.b65);
        b66 = (Button) findViewById(R.id.b66);
        b67 = (Button) findViewById(R.id.b67);

        b70 = (Button) findViewById(R.id.b70);
        b71 = (Button) findViewById(R.id.b71);
        b72 = (Button) findViewById(R.id.b72);
        b73 = (Button) findViewById(R.id.b73);
        b74 = (Button) findViewById(R.id.b74);
        b75 = (Button) findViewById(R.id.b75);
        b76 = (Button) findViewById(R.id.b76);
        b77 = (Button) findViewById(R.id.b77);

        next = (Button) findViewById(R.id.next);
        retry = (Button) findViewById(R.id.retry);

        b00.setOnClickListener(this);
        b01.setOnClickListener(this);
        b02.setOnClickListener(this);
        b03.setOnClickListener(this);
        b04.setOnClickListener(this);
        b05.setOnClickListener(this);
        b06.setOnClickListener(this);
        b07.setOnClickListener(this);

        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);

        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);
        b25.setOnClickListener(this);
        b26.setOnClickListener(this);
        b27.setOnClickListener(this);

        b30.setOnClickListener(this);
        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b34.setOnClickListener(this);
        b35.setOnClickListener(this);
        b36.setOnClickListener(this);
        b37.setOnClickListener(this);

        b40.setOnClickListener(this);
        b41.setOnClickListener(this);
        b42.setOnClickListener(this);
        b43.setOnClickListener(this);
        b44.setOnClickListener(this);
        b45.setOnClickListener(this);
        b46.setOnClickListener(this);
        b47.setOnClickListener(this);

        b50.setOnClickListener(this);
        b51.setOnClickListener(this);
        b52.setOnClickListener(this);
        b53.setOnClickListener(this);
        b54.setOnClickListener(this);
        b55.setOnClickListener(this);
        b56.setOnClickListener(this);
        b57.setOnClickListener(this);

        b60.setOnClickListener(this);
        b61.setOnClickListener(this);
        b62.setOnClickListener(this);
        b63.setOnClickListener(this);
        b64.setOnClickListener(this);
        b65.setOnClickListener(this);
        b66.setOnClickListener(this);
        b67.setOnClickListener(this);

        b70.setOnClickListener(this);
        b71.setOnClickListener(this);
        b72.setOnClickListener(this);
        b73.setOnClickListener(this);
        b74.setOnClickListener(this);
        b75.setOnClickListener(this);
        b76.setOnClickListener(this);
        b77.setOnClickListener(this);

        retry.setOnClickListener(this);

        next.setEnabled(false);
        Utility.initializeboard(board);

        AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b05: {
                if (b05.getText() == "Q") {
                    b05.setText("");
                    board[0][5] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 0, 5) == false) {
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
                        b05.setText("Q");
                        board[0][5] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b06: {
                if (b06.getText() == "Q") {
                    b06.setText("");
                    board[0][6] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 0, 6) == false) {
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
                        b06.setText("Q");
                        board[0][6] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b07: {
                if (b07.getText() == "Q") {
                    b07.setText("");
                    board[0][7] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 0, 7) == false) {
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
                        b07.setText("Q");
                        board[0][7] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }

            case R.id.b15: {
                if (b15.getText() == "Q") {
                    b15.setText("");
                    board[1][5] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 1, 5) == false) {
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
                        b15.setText("Q");
                        board[1][5] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b16: {
                if (b16.getText() == "Q") {
                    b16.setText("");
                    board[1][6] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 1, 6) == false) {
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
                        b16.setText("Q");
                        board[1][6] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b17: {
                if (b17.getText() == "Q") {
                    b17.setText("");
                    board[1][7] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 1, 7) == false) {
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
                        b17.setText("Q");
                        board[1][7] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b25: {
                if (b25.getText() == "Q") {
                    b25.setText("");
                    board[2][5] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 2, 5) == false) {
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
                        b25.setText("Q");
                        board[2][5] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b26: {
                if (b26.getText() == "Q") {
                    b26.setText("");
                    board[2][6] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 2, 6) == false) {
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
                        b26.setText("Q");
                        board[2][6] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b27: {
                if (b27.getText() == "Q") {
                    b27.setText("");
                    board[2][7] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 2, 7) == false) {
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
                        b27.setText("Q");
                        board[2][7] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b35: {
                if (b35.getText() == "Q") {
                    b35.setText("");
                    board[3][5] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 3, 5) == false) {
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
                        b35.setText("Q");
                        board[3][5] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b36: {
                if (b36.getText() == "Q") {
                    b36.setText("");
                    board[3][6] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 3, 6) == false) {
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
                        b36.setText("Q");
                        board[3][6] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b37: {
                if (b37.getText() == "Q") {
                    b37.setText("");
                    board[3][7] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 3, 7) == false) {
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
                        b37.setText("Q");
                        board[3][7] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b45: {
                if (b45.getText() == "Q") {
                    b45.setText("");
                    board[4][5] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 4, 5) == false) {
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
                        b45.setText("Q");
                        board[4][5] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b46: {
                if (b46.getText() == "Q") {
                    b46.setText("");
                    board[4][6] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 4, 6) == false) {
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
                        b46.setText("Q");
                        board[4][6] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b47: {
                if (b47.getText() == "Q") {
                    b47.setText("");
                    board[4][7] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 4, 7) == false) {
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
                        b47.setText("Q");
                        board[4][7] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }

            case R.id.b50: {
                if (b50.getText() == "Q") {
                    b50.setText("");
                    board[5][0] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 5, 0) == false) {
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
                        b50.setText("Q");
                        board[5][0] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b51: {
                if (b51.getText() == "Q") {
                    b51.setText("");
                    board[5][1] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 5, 1) == false) {
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
                        b51.setText("Q");
                        board[5][1] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b52: {
                if (b52.getText() == "Q") {
                    b52.setText("");
                    board[5][2] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 5, 2) == false) {
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
                        b52.setText("Q");
                        board[5][2] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b53: {
                if (b53.getText() == "Q") {
                    b53.setText("");
                    board[5][3] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 5, 3) == false) {
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
                        b53.setText("Q");
                        board[5][3] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b54: {
                if (b54.getText() == "Q") {
                    b54.setText("");
                    board[5][4] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 5, 4) == false) {
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
                        b54.setText("Q");
                        board[5][4] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b55: {
                if (b55.getText() == "Q") {
                    b55.setText("");
                    board[5][5] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 5, 5) == false) {
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
                        b55.setText("Q");
                        board[5][5] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b56: {
                if (b56.getText() == "Q") {
                    b56.setText("");
                    board[5][6] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 5, 6) == false) {
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
                        b56.setText("Q");
                        board[5][6] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b57: {
                if (b57.getText() == "Q") {
                    b57.setText("");
                    board[5][7] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 5, 7) == false) {
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
                        b57.setText("Q");
                        board[5][7] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }

            case R.id.b60: {
                if (b60.getText() == "Q") {
                    b60.setText("");
                    board[6][0] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 6, 0) == false) {
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
                        b60.setText("Q");
                        board[6][0] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b61: {
                if (b61.getText() == "Q") {
                    b61.setText("");
                    board[6][1] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 6, 1) == false) {
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
                        b61.setText("Q");
                        board[6][1] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b62: {
                if (b62.getText() == "Q") {
                    b62.setText("");
                    board[6][2] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 6, 2) == false) {
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
                        b62.setText("Q");
                        board[6][2] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b63: {
                if (b63.getText() == "Q") {
                    b63.setText("");
                    board[6][3] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 6, 3) == false) {
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
                        b63.setText("Q");
                        board[6][3] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b64: {
                if (b64.getText() == "Q") {
                    b64.setText("");
                    board[6][4] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 6, 4) == false) {
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
                        b64.setText("Q");
                        board[6][4] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b65: {
                if (b65.getText() == "Q") {
                    b65.setText("");
                    board[6][5] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 6, 5) == false) {
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
                        b65.setText("Q");
                        board[6][5] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b66: {
                if (b66.getText() == "Q") {
                    b66.setText("");
                    board[6][6] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 6, 6) == false) {
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
                        b66.setText("Q");
                        board[6][6] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b67: {
                if (b67.getText() == "Q") {
                    b67.setText("");
                    board[6][7] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 6, 7) == false) {
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
                        b67.setText("Q");
                        board[6][7] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b70: {
                if (b70.getText() == "Q") {
                    b70.setText("");
                    board[7][0] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 7, 0) == false) {
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
                        b70.setText("Q");
                        board[7][0] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b71: {
                if (b71.getText() == "Q") {
                    b71.setText("");
                    board[7][1] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 7, 1) == false) {
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
                        b71.setText("Q");
                        board[7][1] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b72: {
                if (b72.getText() == "Q") {
                    b72.setText("");
                    board[7][2] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 7, 2) == false) {
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
                        b72.setText("Q");
                        board[7][2] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b73: {
                if (b73.getText() == "Q") {
                    b73.setText("");
                    board[7][3] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 7, 3) == false) {
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
                        b73.setText("Q");
                        board[7][3] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b74: {
                if (b74.getText() == "Q") {
                    b74.setText("");
                    board[7][4] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 7, 4) == false) {
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
                        b74.setText("Q");
                        board[7][4] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b75: {
                if (b75.getText() == "Q") {
                    b75.setText("");
                    board[7][5] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 7, 5) == false) {
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
                        b75.setText("Q");
                        board[7][5] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b76: {
                if (b76.getText() == "Q") {
                    b76.setText("");
                    board[7][6] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 7, 6) == false) {
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
                        b76.setText("Q");
                        board[7][6] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
                                }
                            });
                        }
                    }
                }
                break;
            }
            case R.id.b77: {
                if (b77.getText() == "Q") {
                    b77.setText("");
                    board[7][7] = 0;
                    queencount--;
                    next.setEnabled(false);
                    next.setBackgroundColor(0xff000000);
                } else {
                    if (Utility.checkattack(board, n, 7, 7) == false) {
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
                        b77.setText("Q");
                        board[7][7] = 1;
                        queencount++;
                        if (queencount == n) {
                            next.setEnabled(true);
                            next.setBackgroundColor(0xff99cc00);
                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog dialog = new AlertDialog.Builder(eight_queen.this)
                                            .setTitle("Congratulations!\n")
                                            .setMessage("You have completed all the levels.\nTry different ways to solve the problem.")
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            })
                                            .create();
                                    dialog.show();
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
