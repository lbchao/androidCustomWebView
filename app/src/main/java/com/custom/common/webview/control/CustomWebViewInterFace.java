package com.custom.common.webview.control;

import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.WebView;

/**
 * Created by lin on 2015/4/19.
 */
public interface CustomWebViewInterFace {
    //webviewclient
    void onPageStarted(WebView view, String url, Bitmap favicon);

    void onPageFinished(WebView view, String url);

    boolean shouldOverrideUrlLoading(WebView view, String url);

    //webviewchoromclient
    void onProgressChanged(WebView view, int newProgress);

    void onReceivedTitle(WebView view, String title);
    boolean onConsoleMessage(ConsoleMessage consoleMessage);

    //js ojbect

    void   jsControl();
}
