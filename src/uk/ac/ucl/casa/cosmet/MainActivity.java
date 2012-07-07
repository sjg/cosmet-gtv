package uk.ac.ucl.casa.cosmet;

import java.util.Date;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends Activity {

	private WebView webView;
	private Button statsButton;
	// protected String statsUrl = "http://192.168.145.243:8000/index.html";

	protected String statsUrl = "http://128.40.111.232/cosmet/cosmet-gtv-html/index.html";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		this.webView = (WebView) findViewById(R.id.graph_view);

		this.statsButton = (Button) findViewById(R.id.my_status_button);

		this.statsButton.setClickable(true);
		this.statsButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				webView.loadUrl(statsUrl + '?' + (new Date()).getTime());
			}
		});
	}

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

		this.webView.loadUrl(statsUrl);
		WebSettings settings = webView.getSettings();
		settings.setJavaScriptEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);

		return true;
	}
}
