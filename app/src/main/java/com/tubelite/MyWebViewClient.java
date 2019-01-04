package com.tubelite;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient {

    @Override
    public void onPageFinished(WebView view, String url) {
        // hide element by id
        view.loadUrl("javascript:(function() { " +
                "document.getElementById('header-bar').style.display='none';" +
                "document.getElementById('player-container-id').style.top='0px';})()");
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        view.loadUrl(request.getUrl().toString());
        return false;
    }
}