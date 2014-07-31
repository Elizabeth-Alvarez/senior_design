package com.example.cyber_redirect;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button button;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		final Context context = this;
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		

		button = (Button) findViewById(R.id.buttonUrl);
		button.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				Intent intent = new Intent(context, WebViewActivity.class);
				startActivity(intent);
			}
			
		});

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
