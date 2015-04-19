package com.custom.common.webview.control;

import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.WebView;

/**
 * Created by lin on 2015/4/19.
 */
public abstract class CustomWebViewAbstract implements  CustomWebViewInterFace {

    @Override
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return false;
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {

    }

    @Override
    public void onPageFinished(WebView view, String url) {

    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return false;
    }

    @Override
    public void onProgressChanged(WebView view, int newProgress) {

    }

    @Override
    public void onReceivedTitle(WebView view, String title) {

    }

    @Override
    public void jsControl() {

    }
}
