package uk.ac.ucl.casa.cosmet;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {

	private WebView webView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		this.webView = (WebView) findViewById(R.id.graph_view);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

		this.webView.loadUrl("http://128.40.111.232/cosmet/cosmet-gtv-html/index.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
