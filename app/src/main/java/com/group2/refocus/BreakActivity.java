package com.group2.refocus;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BreakActivity extends AppCompatActivity {

    LinearLayout slotHolder;
    BreakGenerator breakGenerator = new BreakGenerator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break);

        // add slots
        slotHolder = findViewById(R.id.slotHolder);

        Button time0 = new Button(this);
        Button time1 = new Button(this);
        Button time2 = new Button(this);

        time0.setText("5\nminutes");
        time1.setText("15\nminutes");
        time2.setText("30\nminutes");

        buttonListener(time0);
        buttonListener(time1);
        buttonListener(time2);

        slotHolder.addView(time0);
        slotHolder.addView(time1);
        slotHolder.addView(time2);
    }

    private void buttonListener(Button button){
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                // hide slots
                slotHolder.removeAllViews();

                // set time
                TextView timer = findViewById(R.id.timerView);
                int time = 0; // in min

                if (button.getText().charAt(0) == '5')
                    time = 5;
                else if (button.getText().charAt(0) == '1')
                    time = 15;
                else if (button.getText().charAt(0) == '3')
                    time = 30;


                // set break text
                TextView breakTask = findViewById(R.id.task);
                ViewGroup.LayoutParams layoutParams = breakTask.getLayoutParams();
                layoutParams.height = (int) (layoutParams.height * 1.5);
                layoutParams.width = layoutParams.width * 2;
                view.setLayoutParams(layoutParams);
                breakTask.setText(breakGenerator.getBreak(time).getBreakActivity());

                // Create and start the countdown timer
                new CountDownTimer(time*60*1000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        timer.setVisibility(View.VISIBLE);
                        long min = millisUntilFinished / (60*1000);
                        long sec = (millisUntilFinished / 1000) % 60;
                        String str = String.format("%d : %d", min, sec);
                        timer.setText(str);
                    }

                    @Override
                    public void onFinish() {
                        // When the task is over it will print 00:00:00
                        slotHolder.removeAllViews();
                        launchMain(view);
                    }
                }.start();
            }
        });
    }

    public void launchMain(View view) {
        Intent intent = new Intent(this, FocusActivity.class);

        startActivity(intent);
    }
}