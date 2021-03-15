package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView image_00, image_01, image_02, image_10, image_11, image_12, image_20, image_21, image_22;
    int chance = 1;
    int total = 0;
    int gameState[][] = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
    TextView current;
    Button restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();

        image_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1){
                    gameState[0][0] = 1;
                    image_00.setImageResource(R.drawable.ic_baseline_cross);
                    image_00.setClickable(false);
                    image_00.setFocusable(false);
                    chance = 2;
                    total++;
                    checkWinner_one();
                }else{
                    gameState[0][0] = 2;
                    image_00.setImageResource(R.drawable.ic_baseline_exposure_zero_24);
                    image_00.setClickable(false);
                    image_00.setFocusable(false);
                    chance = 1;
                    total++;
                    checkWinner_two();
                }
            }
        });

        image_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1){
                    gameState[0][1] = 1;
                    image_01.setImageResource(R.drawable.ic_baseline_cross);
                    image_01.setClickable(false);
                    image_01.setFocusable(false);
                    chance = 2;
                    total++;
                    checkWinner_one();
                }else{
                    gameState[0][1] = 2;
                    image_01.setImageResource(R.drawable.ic_baseline_exposure_zero_24);
                    image_01.setClickable(false);
                    image_01.setFocusable(false);
                    chance = 1;
                    total++;
                    checkWinner_two();
                }
            }
        });

        image_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1){
                    gameState[0][2] = 1;
                    image_02.setImageResource(R.drawable.ic_baseline_cross);
                    image_02.setClickable(false);
                    image_02.setFocusable(false);
                    chance = 2;
                    total++;
                    checkWinner_one();
                }else{
                    gameState[0][2] = 2;
                    image_02.setImageResource(R.drawable.ic_baseline_exposure_zero_24);
                    image_02.setClickable(false);
                    image_02.setFocusable(false);
                    chance = 1;
                    total++;
                    checkWinner_two();
                }
            }
        });

        image_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1){
                    gameState[1][0] = 1;
                    image_10.setImageResource(R.drawable.ic_baseline_cross);
                    image_10.setClickable(false);
                    image_10.setFocusable(false);
                    chance = 2;
                    total++;
                    checkWinner_one();
                }else{
                    gameState[1][0] = 2;
                    image_10.setImageResource(R.drawable.ic_baseline_exposure_zero_24);
                    image_10.setClickable(false);
                    image_10.setFocusable(false);
                    chance = 1;
                    total++;
                    checkWinner_two();
                }
            }
        });

        image_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1){
                    gameState[1][1] = 1;
                    image_11.setImageResource(R.drawable.ic_baseline_cross);
                    image_11.setClickable(false);
                    image_11.setFocusable(false);
                    chance = 2;
                    total++;
                    checkWinner_one();
                }else{
                    gameState[1][1] = 2;
                    image_11.setImageResource(R.drawable.ic_baseline_exposure_zero_24);
                    image_11.setClickable(false);
                    image_11.setFocusable(false);
                    chance = 1;
                    total++;
                    checkWinner_two();
                }
            }
        });

        image_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1){
                    gameState[1][2] = 1;
                    image_12.setImageResource(R.drawable.ic_baseline_cross);
                    image_12.setClickable(false);
                    image_12.setFocusable(false);
                    chance = 2;
                    total++;
                    checkWinner_one();
                }else{
                    gameState[1][2] = 2;
                    image_12.setImageResource(R.drawable.ic_baseline_exposure_zero_24);
                    image_12.setClickable(false);
                    image_12.setFocusable(false);
                    chance = 1;
                    total++;
                    checkWinner_two();
                }
            }
        });

        image_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1){
                    gameState[2][0] = 1;
                    image_20.setImageResource(R.drawable.ic_baseline_cross);
                    image_20.setClickable(false);
                    image_20.setFocusable(false);
                    chance = 2;
                    total++;
                    checkWinner_one();
                }else{
                    gameState[2][0] = 2;
                    image_20.setImageResource(R.drawable.ic_baseline_exposure_zero_24);
                    image_20.setClickable(false);
                    image_20.setFocusable(false);
                    chance = 1;
                    total++;
                    checkWinner_two();
                }
            }
        });

        image_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1){
                    gameState[2][1] = 1;
                    image_21.setImageResource(R.drawable.ic_baseline_cross);
                    image_21.setClickable(false);
                    image_21.setFocusable(false);
                    chance = 2;
                    total++;
                    checkWinner_one();
                }else{
                    gameState[2][1] = 2;
                    image_21.setImageResource(R.drawable.ic_baseline_exposure_zero_24);
                    image_21.setClickable(false);
                    image_21.setFocusable(false);
                    chance = 1;
                    total++;
                    checkWinner_two();
                }
            }
        });

        image_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1){
                    gameState[2][2] = 1;
                    image_22.setImageResource(R.drawable.ic_baseline_cross);
                    image_22.setClickable(false);
                    image_22.setFocusable(false);
                    chance = 2;
                    total++;
                    checkWinner_one();
                }else{
                    gameState[2][2] = 2;
                    image_22.setImageResource(R.drawable.ic_baseline_exposure_zero_24);
                    image_22.setClickable(false);
                    image_22.setFocusable(false);
                    chance = 1;
                    total++;
                    checkWinner_two();
                }
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart_game();
            }
        });

    }

    private void checkWinner_two() {
        int gotWinner = 0;
        for(int i = 0; i < 3; i++){
            int cond = 1;
            for(int j = 0; j < 3; j++){
                if(gameState[i][j] != 2){
                    cond = 0;
                    break;
                }
            }
            if(cond == 1){
                gotWinner = 1;
                break;
            }
        }

        if(gotWinner == 1){
            Toast.makeText(this, "Game Ended", Toast.LENGTH_LONG).show();
            current.setText("Winner :- Player 2");
            disableGame();
        }else{
            for(int i = 0; i < 3; i++){
                int cond = 1;
                for(int j = 0; j < 3; j++){
                    if(gameState[j][i] != 2){
                        cond = 0;
                        break;
                    }
                }
                if(cond == 1){
                    gotWinner = 1;
                    break;
                }
            }

            if(gotWinner == 1){
                Toast.makeText(this, "Game Ended", Toast.LENGTH_LONG).show();
                current.setText("Winner :- Player 2");
                disableGame();
            }else{
                if(gameState[0][0] == 2 && gameState[1][1] == 2 && gameState[2][2] == 2){
                    gotWinner = 1;
                    Toast.makeText(this, "Game Ended", Toast.LENGTH_LONG).show();
                    current.setText("Winner :- Player 2");
                    disableGame();
                }else if(gameState[0][2] == 2 && gameState[1][1] == 2 && gameState[2][0] == 2){
                    gotWinner = 1;
                    Toast.makeText(this, "Game Ended", Toast.LENGTH_LONG).show();
                    current.setText("Winner :- Player 2");
                    disableGame();
                }else{
                    if(total == 9){
                        Toast.makeText(this, "Game Ended in Draw!", Toast.LENGTH_LONG).show();
                        current.setText("Winner :- None");
                        disableGame();
                    }else{
                        current.setText("Next Move :- Player 1");
                    }
                }
            }

        }

    }

    private void checkWinner_one() {
        int gotWinner = 0;
        for(int i = 0; i < 3; i++){
            int cond = 1;
            for(int j = 0; j < 3; j++){
                if(gameState[i][j] != 1){
                    cond = 0;
                    break;
                }
            }
            if(cond == 1){
                gotWinner = 1;
                break;
            }
        }

        if(gotWinner == 1){
            Toast.makeText(this, "Game Ended", Toast.LENGTH_LONG).show();
            current.setText("Winner :- Player 1");
            disableGame();
        }else{
            for(int i = 0; i < 3; i++){
                int cond = 1;
                for(int j = 0; j < 3; j++){
                    if(gameState[j][i] != 1){
                        cond = 0;
                        break;
                    }
                }
                if(cond == 1){
                    gotWinner = 1;
                    break;
                }
            }

            if(gotWinner == 1){
                Toast.makeText(this, "Game Ended", Toast.LENGTH_LONG).show();
                current.setText("Winner :- Player 1");
                disableGame();
            }else{
                if(gameState[0][0] == 1 && gameState[1][1] == 1 && gameState[2][2] == 1){
                    gotWinner = 1;
                    Toast.makeText(this, "Game Ended", Toast.LENGTH_LONG).show();
                    current.setText("Winner :- Player 1");
                    disableGame();
                }else if(gameState[0][2] == 1 && gameState[1][1] == 1 && gameState[2][0] == 1){
                    gotWinner = 1;
                    Toast.makeText(this, "Game Ended", Toast.LENGTH_LONG).show();
                    current.setText("Winner :- Player 1");
                    disableGame();
                }else{
                    if(total == 9){
                        Toast.makeText(this, "Game Ended in Draw!", Toast.LENGTH_LONG).show();
                        current.setText("Winner :- None");
                        disableGame();
                    }else{
                        current.setText("Next Move :- Player 2");
                    }
                }
            }

        }

    }

    private void disableGame() {
        image_00.setClickable(false);
        image_00.setFocusable(false);
        image_01.setClickable(false);
        image_01.setFocusable(false);
        image_02.setClickable(false);
        image_02.setFocusable(false);
        image_10.setClickable(false);
        image_10.setFocusable(false);
        image_11.setClickable(false);
        image_11.setFocusable(false);
        image_12.setClickable(false);
        image_12.setFocusable(false);
        image_20.setClickable(false);
        image_20.setFocusable(false);
        image_21.setClickable(false);
        image_21.setFocusable(false);
        image_22.setClickable(false);
        image_22.setFocusable(false);
        restart.setVisibility(View.VISIBLE);
    }

    private void restart_game() {
        chance = 1;
        total = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                gameState[i][j] = 3;
            }
        }
        resetImages();
        current.setText("Next Move :- Player 1");
        enableGame();
        Toast.makeText(this, "Game Restarted!!!\nEnjoy", Toast.LENGTH_SHORT).show();
    }

    private void enableGame() {
        image_00.setClickable(true);
        image_00.setFocusable(true);
        image_01.setClickable(true);
        image_01.setFocusable(true);
        image_02.setClickable(true);
        image_02.setFocusable(true);
        image_10.setClickable(true);
        image_10.setFocusable(true);
        image_11.setClickable(true);
        image_11.setFocusable(true);
        image_12.setClickable(true);
        image_12.setFocusable(true);
        image_20.setClickable(true);
        image_20.setFocusable(true);
        image_21.setClickable(true);
        image_21.setFocusable(true);
        image_22.setClickable(true);
        image_22.setFocusable(true);
        restart.setVisibility(View.INVISIBLE);
    }

    private void resetImages() {
        image_00.setImageResource(0);
        image_01.setImageResource(0);
        image_02.setImageResource(0);
        image_10.setImageResource(0);
        image_11.setImageResource(0);
        image_12.setImageResource(0);
        image_20.setImageResource(0);
        image_21.setImageResource(0);
        image_22.setImageResource(0);
    }

    private void initializeViews() {
        image_00 = findViewById(R.id.image_00);
        image_01 = findViewById(R.id.image_01);
        image_02 = findViewById(R.id.image_02);
        image_10 = findViewById(R.id.image_10);
        image_11 = findViewById(R.id.image_11);
        image_12 = findViewById(R.id.image_12);
        image_20 = findViewById(R.id.image_20);
        image_21 = findViewById(R.id.image_21);
        image_22 = findViewById(R.id.image_22);

        current = findViewById(R.id.next_move);
        restart = findViewById(R.id.restart);
    }

    private void print(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(gameState[i][j] + "   ");
            }
            System.out.print("\n");
        }
    }
}