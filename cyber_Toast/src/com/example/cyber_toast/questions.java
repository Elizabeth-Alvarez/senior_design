package com.example.cyber_toast;

import java.util.ArrayList;
import java.util.Collection;

import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;



public class questions extends Activity {
	
	Button submit;
	int current = 0;
	EditText simpleEditText;
	TextView textView;
	public static ArrayList<String> playerList = new ArrayList<String>();
	//public static String  [] playerList;
	String [] list;
	
	
	String [] questions = {"Who was your first kiss?",
	"Who was your third grade teacher?",
	"What was the first concert you attended?",
	"What is your mother's maiden name?",
	"What was the name of your first pet?",
	"What street did you grow up on?",
	"What is your favorite childhood game?",
	"What are you most afraid of?",
	"What was your childhood nickname that most people do no know?"};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		textView = (TextView)findViewById(R.id.TextView01);
		submit = (Button) findViewById(R.id.continueButton);
		simpleEditText = (EditText)findViewById(R.id.editText);

		submit.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				
					submit.setOnClickListener(this);
					textView.setText(nextQuestion());	
					
					String ag = simpleEditText.getText().toString();
					if(ag.length() != 0) {
						playerList.add(ag);
						simpleEditText.setText("");
					}
					
					for(int i = 0; i < playerList.size(); i++) {
						list = playerList.toArray(list);
						
						/*Toast toast = new Toast(getApplicationContext());
						toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
						toast.makeText(questions.this, ag, toast.LENGTH_SHORT).show();
						//toast.makeText(questions.this, simpleEditText.getText(), toast.LENGTH_SHORT).show();
						simpleEditText.setText("");*/
					}

					Toast toast = new Toast(getApplicationContext());
					toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
					toast.makeText(questions.this, ag, toast.LENGTH_SHORT).show();
					//toast.makeText(questions.this, simpleEditText.getText(), toast.LENGTH_SHORT).show();
					simpleEditText.setText("");
					
				}
		});
		
	}
		
	public String nextQuestion() {
		for (int i =0; i < questions.length; i++) {
			if(current < questions.length) {
				return questions[current++];
			}
		}
		return questions[current];
	}
	}

			 


		 