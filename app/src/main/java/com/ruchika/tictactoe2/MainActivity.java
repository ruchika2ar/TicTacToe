package com.ruchika.tictactoe2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button one, two, three;
    Button four, five, six;
    Button seven, eight, nine;
    int[][] arr = new int[3][3];
    boolean computer = false;
    int depth = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                arr[r][c] = -1;
            }
        }
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!computer)
                    if (arr[0][0] == -1) {
                        arr[0][0] = 1;
                        computer = true;
                        one.setText("?");
                        computer = false;
                        int x = Computer.findBoxNo(arr, depth + 1);
                        depth += 2;
                        if (x == 1) {
                            one.setText("=");
                            arr[0][0] = 0;
                        } else if (x == 2) {
                            two.setText("=");
                            arr[0][1] = 0;
                        } else if (x == 3) {
                            three.setText("=");
                            arr[0][2] = 0;
                        } else if (x == 4) {
                            four.setText("=");
                            arr[1][0] = 0;
                        } else if (x == 5) {
                            five.setText("=");
                            arr[1][1] = 0;
                        } else if (x == 6) {
                            six.setText("=");
                            arr[1][2] = 0;
                        } else if (x == 7) {
                            seven.setText("=");
                            arr[2][0] = 0;
                        } else if (x == 8) {
                            eight.setText("=");
                            arr[2][1] = 0;
                        } else {
                            nine.setText("=");
                            arr[2][2] = 0;
                        }
                    }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!computer) {
                    if (arr[0][1] == -1) {
                        arr[0][1] = 1;
                        computer = true;
                        two.setText("?");
                        computer = false;
                        int x = Computer.findBoxNo(arr, depth + 1);
                        depth += 2;
                        if (x == 1) {
                            one.setText("=");
                            arr[0][0] = 0;
                        } else if (x == 2) {
                            two.setText("=");
                            arr[0][1] = 0;
                        } else if (x == 3) {
                            three.setText("=");
                            arr[0][2] = 0;
                        } else if (x == 4) {
                            four.setText("=");
                            arr[1][0] = 0;
                        } else if (x == 5) {
                            five.setText("=");
                            arr[1][1] = 0;
                        } else if (x == 6) {
                            six.setText("=");
                            arr[1][2] = 0;
                        } else if (x == 7) {
                            seven.setText("=");
                            arr[2][0] = 0;
                        } else if (x == 8) {
                            eight.setText("=");
                            arr[2][1] = 0;
                        } else {
                            nine.setText("=");
                            arr[2][2] = 0;
                        }
                    }
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!computer) {
                    if (arr[0][2] == -1) {
                        arr[0][2] = 1;
                        computer = true;
                        three.setText("?");
                        computer = false;
                        int x = Computer.findBoxNo(arr, depth + 1);
                        depth += 2;
                        if (x == 1) {
                            one.setText("=");
                            arr[0][0] = 0;
                        } else if (x == 2) {
                            two.setText("=");
                            arr[0][1] = 0;
                        } else if (x == 3) {
                            three.setText("=");
                            arr[0][2] = 0;
                        } else if (x == 4) {
                            four.setText("=");
                            arr[1][0] = 0;
                        } else if (x == 5) {
                            five.setText("=");
                            arr[1][1] = 0;
                        } else if (x == 6) {
                            six.setText("=");
                            arr[1][2] = 0;
                        } else if (x == 7) {
                            seven.setText("=");
                            arr[2][0] = 0;
                        } else if (x == 8) {
                            eight.setText("=");
                            arr[2][1] = 0;
                        } else {
                            nine.setText("=");
                            arr[2][2] = 0;
                        }
                    }
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!computer) {
                    if (arr[1][0] == -1) {
                        arr[1][0] = 1;
                        computer = true;
                        four.setText("?");
                        computer = false;
                        int x = Computer.findBoxNo(arr, depth + 1);
                        depth += 2;
                        if (x == 1) {
                            one.setText("=");
                            arr[0][0] = 0;
                        } else if (x == 2) {
                            two.setText("=");
                            arr[0][1] = 0;
                        } else if (x == 3) {
                            three.setText("=");
                            arr[0][2] = 0;
                        } else if (x == 4) {
                            four.setText("=");
                            arr[1][0] = 0;
                        } else if (x == 5) {
                            five.setText("=");
                            arr[1][1] = 0;
                        } else if (x == 6) {
                            six.setText("=");
                            arr[1][2] = 0;
                        } else if (x == 7) {
                            seven.setText("=");
                            arr[2][0] = 0;
                        } else if (x == 8) {
                            eight.setText("=");
                            arr[2][1] = 0;
                        } else {
                            nine.setText("=");
                            arr[2][2] = 0;
                        }
                    }
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!computer) {
                    if (arr[1][1] == -1) {
                        arr[1][1] = 1;
                        computer = true;
                        five.setText("?");
                        computer = false;
                        int x = Computer.findBoxNo(arr, depth + 1);
                        depth += 2;
                        if (x == 1) {
                            one.setText("=");
                            arr[0][0] = 0;
                        } else if (x == 2) {
                            two.setText("=");
                            arr[0][1] = 0;
                        } else if (x == 3) {
                            three.setText("=");
                            arr[0][2] = 0;
                        } else if (x == 4) {
                            four.setText("=");
                            arr[1][0] = 0;
                        } else if (x == 5) {
                            five.setText("=");
                            arr[1][1] = 0;
                        } else if (x == 6) {
                            six.setText("=");
                            arr[1][2] = 0;
                        } else if (x == 7) {
                            seven.setText("=");
                            arr[2][0] = 0;
                        } else if (x == 8) {
                            eight.setText("=");
                            arr[2][1] = 0;
                        } else {
                            nine.setText("=");
                            arr[2][2] = 0;
                        }
                    }
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!computer) {
                    if (arr[1][2] == -1) {
                        arr[1][2] = 1;
                        computer = true;
                        six.setText("?");
                        computer = false;
                        int x = Computer.findBoxNo(arr, depth + 1);
                        depth += 2;
                        if (x == 1) {
                            one.setText("=");
                            arr[0][0] = 0;
                        } else if (x == 2) {
                            two.setText("=");
                            arr[0][1] = 0;
                        } else if (x == 3) {
                            three.setText("=");
                            arr[0][2] = 0;
                        } else if (x == 4) {
                            four.setText("=");
                            arr[1][0] = 0;
                        } else if (x == 5) {
                            five.setText("=");
                            arr[1][1] = 0;
                        } else if (x == 6) {
                            six.setText("=");
                            arr[1][2] = 0;
                        } else if (x == 7) {
                            seven.setText("=");
                            arr[2][0] = 0;
                        } else if (x == 8) {
                            eight.setText("=");
                            arr[2][1] = 0;
                        } else {
                            nine.setText("=");
                            arr[2][2] = 0;
                        }
                    }
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!computer) {
                    if (arr[2][0] == -1) {
                        arr[2][0] = 1;
                        computer = true;
                        seven.setText("?");
                        computer = false;
                        int x = Computer.findBoxNo(arr, depth + 1);
                        depth += 2;
                        if (x == 1) {
                            one.setText("=");
                            arr[0][0] = 0;
                        } else if (x == 2) {
                            two.setText("=");
                            arr[0][1] = 0;
                        } else if (x == 3) {
                            three.setText("=");
                            arr[0][2] = 0;
                        } else if (x == 4) {
                            four.setText("=");
                            arr[1][0] = 0;
                        } else if (x == 5) {
                            five.setText("=");
                            arr[1][1] = 0;
                        } else if (x == 6) {
                            six.setText("=");
                            arr[1][2] = 0;
                        } else if (x == 7) {
                            seven.setText("=");
                            arr[2][0] = 0;
                        } else if (x == 8) {
                            eight.setText("=");
                            arr[2][1] = 0;
                        } else {
                            nine.setText("=");
                            arr[2][2] = 0;
                        }
                    }
                }
            }

        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!computer) {
                    if (arr[2][1] == -1) {
                        arr[2][1] = 1;
                        computer = true;
                        eight.setText("?");
                        computer = false;
                        int x = Computer.findBoxNo(arr, depth + 1);
                        depth += 2;
                        if (x == 1) {
                            one.setText("=");
                            arr[0][0] = 0;
                        } else if (x == 2) {
                            two.setText("=");
                            arr[0][1] = 0;
                        } else if (x == 3) {
                            three.setText("=");
                            arr[0][2] = 0;
                        } else if (x == 4) {
                            four.setText("=");
                            arr[1][0] = 0;
                        } else if (x == 5) {
                            five.setText("=");
                            arr[1][1] = 0;
                        } else if (x == 6) {
                            six.setText("=");
                            arr[1][2] = 0;
                        } else if (x == 7) {
                            seven.setText("=");
                            arr[2][0] = 0;
                        } else if (x == 8) {
                            eight.setText("=");
                            arr[2][1] = 0;
                        } else {
                            nine.setText("=");
                            arr[2][2] = 0;
                        }
                    }
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!computer) {
                    if (arr[2][2] == -1) {
                        arr[2][2] = 1;
                        computer = true;
                        nine.setText("?");
                        computer = false;
                        int x = Computer.findBoxNo(arr, depth + 1);
                        depth += 2;
                        if (x == 1) {
                            one.setText("=");
                            arr[0][0] = 0;
                        } else if (x == 2) {
                            two.setText("=");
                            arr[0][1] = 0;
                        } else if (x == 3) {
                            three.setText("=");
                            arr[0][2] = 0;
                        } else if (x == 4) {
                            four.setText("=");
                            arr[1][0] = 0;
                        } else if (x == 5) {
                            five.setText("=");
                            arr[1][1] = 0;
                        } else if (x == 6) {
                            six.setText("=");
                            arr[1][2] = 0;
                        } else if (x == 7) {
                            seven.setText("=");
                            arr[2][0] = 0;
                        } else if (x == 8) {
                            eight.setText("=");
                            arr[2][1] = 0;
                        } else {
                            nine.setText("=");
                            arr[2][2] = 0;
                        }
                    }
                }
            }
        });

    }
}
