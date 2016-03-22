package com.magdybindia.numbercrunch;

/**
 * Created by Bindia Venugopal on 19/03/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.magdybindia.numbercrunch.R;

public class LevelScreenActivity extends Activity {
    public final static String EXTRA_LEVEL = "com.magdybindia.numbercrunch.LEVEL";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levelscreen_activity);
        Button btnNextSrnOne = (Button) findViewById(R.id.btnOne);
        Button btnNextSrnTwo = (Button) findViewById(R.id.btnTwo);
        Button btnNextSrnThree = (Button) findViewById(R.id.btnThree);
        Button btnNextSrnFour = (Button) findViewById(R.id.btnFour);
        Button btnNextSrnMixitup = (Button) findViewById(R.id.btnmixitup);
        Button btnNextSrnClose = (Button) findViewById(R.id.btnClose);

        btnNextSrnOne.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                int [] level = {1,2,1,2,1};
                Intent nextScreen = new Intent(getApplicationContext(), LevelOneQstOne.class);
                nextScreen.putExtra(EXTRA_LEVEL, level);
                startActivity(nextScreen);
                finish();
            }
        });

        btnNextSrnTwo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                int [] level = {1,2,1,3,3};
                Intent nextScreen = new Intent(getApplicationContext(), LevelOneQstOne.class);
                nextScreen.putExtra(EXTRA_LEVEL, level);
                startActivity(nextScreen);
            }
        });

        btnNextSrnThree.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                int [] level = {1,2,3,4,4};
                Intent nextScreen = new Intent(getApplicationContext(), LevelOneQstOne.class);
                nextScreen.putExtra(EXTRA_LEVEL, level);
                startActivity(nextScreen);
            }
        });

        btnNextSrnFour.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                int [] level = {1,2,3,4,5};
                Intent nextScreen = new Intent(getApplicationContext(), LevelOneQstOne.class);
                nextScreen.putExtra(EXTRA_LEVEL, level);
                startActivity(nextScreen);
            }
        });

        btnNextSrnClose.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainscreenActivity.class);

                startActivity(nextScreen);
            }
        });

    }

}
