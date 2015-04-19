package com.custom.common.webview.control;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by lin on 2015/4/19.
 */
public class CustomWebviewClient extends WebViewClient {

    private CustomWebBaseController  controller;

    public CustomWebviewClient(CustomWebBaseController  controller) {
        this.controller=controller;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
//        return super.shouldOverrideUrlLoading(view, url);
          return controller.shouldOverrideUrlLoading(view,url);
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        controller.onPageStarted(view, url, favicon);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        controller.onPageFinished(view, url);
    }
}
