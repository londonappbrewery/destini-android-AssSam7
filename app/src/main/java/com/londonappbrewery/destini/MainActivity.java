package com.londonappbrewery.destini;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextView;
    Button buttonTop;
    Button buttonBottom;
    int mIndex;
    int mQuestion;
    int mBut1;
    int mBut2;

    private int[] StoryBank = {
            R.string.T1_Story,
            R.string.T1_Ans1,
            R.string.T1_Ans2,
            R.string.T2_Story,
            R.string.T2_Ans1,
            R.string.T2_Ans2,
            R.string.T3_Story,
            R.string.T3_Ans1,
            R.string.T3_Ans2,
            R.string.T4_End,
            R.string.T5_End,
            R.string.T6_End
    };

    private int[] Scr2 = {
            StoryBank[6],
            StoryBank[7],
            StoryBank[8]
    };

    private int[] Scr3 = {
            StoryBank[3],
            StoryBank[4],
            StoryBank[5]
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);

        mQuestion = StoryBank[mIndex];


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        View.OnClickListener myListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScreenOne();
            }
        };
        buttonTop.setOnClickListener(myListener1);


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        View.OnClickListener myListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScreenTwo();
            }
        };
        buttonBottom.setOnClickListener(myListener2);

    }
    public void updateScreenOne(){
        mQuestion = Scr2[mIndex];
        mBut1 = Scr2[mIndex+1];
        mBut2 = Scr2[mIndex+2];
        mTextView.setText(mQuestion);
        buttonTop.setText(mBut1);
        buttonBottom.setText(mBut2);
        mIndex = mIndex + 1;
    }
    public void updateScreenTwo(){
        mQuestion = Scr3[mIndex];
        mBut1 = Scr3[mIndex+1];
        mBut2 = Scr3[mIndex+2];
        mTextView.setText(mQuestion);
        buttonTop.setText(mBut1);
        buttonBottom.setText(mBut2);
        mIndex = mIndex + 1;
        System.out.println(mIndex);
    }




}

