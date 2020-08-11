package in.tvac.akshayejh.techblog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    public WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebview=(WebView)findViewById(R.id.webview);
        WebSettings webSettings=mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview.loadUrl("https://aaaaaaaaaaaaaatech.blogspot.com");
        // code for opening the app
        mywebview.setWebViewClient(new WebViewClient());
    }
    //code for back button


    @Override
    public void onBackPressed() {
        if (mywebview.canGoBack())
        {
          mywebview.goBack();
        }
        else
            {
                super.onBackPressed();
        }

    }
}
