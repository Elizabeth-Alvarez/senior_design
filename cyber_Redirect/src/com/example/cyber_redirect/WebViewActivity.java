package com.example.cyber_redirect;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.widget.Toast;



public class WebViewActivity extends Activity {
	
	private WebView webView;
	int currentUrl = 0;
	
	String [] websites = {"http://www.wikihow.com/Make-a-Gun-Barrel",
			"http://www.totse2.com/showthread.php?6078-How-to-Make-a-bomb-from-household-items",
			"http://www.wikihow.com/Make-a-Bomb-Bag",
			"http://www.tricklife.com/view.php?id=862",
			"http://nighthawkinlight.wonderhowto.com/how-to/make-bb-machine-gun-from-soda-bottle-0133352/",
			"http://www.instructables.com/id/How-to-make-a-match-bomb/",
			"http://explosives.wonderhowto.com/how-to/make-bomb-from-chlorine-and-alcohol-324024/",
			"http://www.motherjones.com/politics/2012/12/how-make-your-gun-shoot-fully-automatic-one-easy-step",
			"http://explosives.wonderhowto.com/how-to/make-exploding-pen-bomb-for-cheap-373195/",
			"http://thehomegunsmith.com/pdf/Expedient-Homemade-Firearms-Vol-II-PA-Luty.pdf" };


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
		
		webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl(getWebsite());
	
	}
	
	public String getWebsite() {
		for (int i =0; i < websites.length; i++) {
			if(currentUrl < websites.length) {
				return websites[currentUrl++];
			}
	}
		return websites[currentUrl];
	}
	

	//Overrides the back button function
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Toast.makeText(getApplicationContext(), "Back button pressed...Please wait for load",
	        Toast.LENGTH_SHORT).show();
		
			webView.loadUrl(getWebsite());

			return true;
		}
		else 
			//webView.loadUrl("http://thehomegunsmith.com/pdf/Expedient-Homemade-Firearms-Vol-II-PA-Luty.pdf ");
		// TODO Auto-generated method stub
		return super.onKeyDown(keyCode, event);
	}


}

