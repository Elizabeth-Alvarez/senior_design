package com.example.cyber_toast;

import java.util.ArrayList;
import java.util.List;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;


public class splash extends Activity {
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		
		/*This thread is to time how long splash page is displayed before
		  moving on to next thing*/
		Thread logoTimer = new Thread() {
			public void run() {
				try {
					int logoTimer = 0;
					while(logoTimer < 5000) {
						sleep(100); //1/10 of a second
						logoTimer = logoTimer + 100;
					}
					startActivity(new Intent("com.example.cyber_toast.CLEARSCREEN"));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				finally {
					finish();
				}
			}
			
		}; //End of Thread
		logoTimer.start();

	}
	
/*
	public  List<String> getInput() {
		List<String> list = new ArrayList<String>();
		Toast toast = new Toast((Context) getInput());
    	toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
		toast.makeText(questions.this, simpleEditText.getText(), toast.LENGTH_SHORT).show();
		simpleEditText.setText("");
   
    return list;
	}*/

}
  