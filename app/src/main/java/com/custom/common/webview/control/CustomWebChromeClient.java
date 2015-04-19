package com.custom.common.webview.control;

import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * Created by lin on 2015/4/19.
 */
public class CustomWebChromeClient extends WebChromeClient {

    private CustomWebBaseController controller;

    public CustomWebChromeClient(CustomWebBaseController controller) {
        this.controller = controller;
    }


    @Override
    public void onProgressChanged(WebView view, int newProgress) {
        super.onProgressChanged(view, newProgress);
        controller.onProgressChanged(view, newProgress);
    }

    @Override
    public void onReceivedTitle(WebView view, String title) {
        super.onReceivedTitle(view, title);
        controller.onReceivedTitle(view, title);
    }

    @Override
    public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
        return super.onJsAlert(view, url, message, result);
    }

    @Override
    public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
        return super.onJsConfirm(view, url, message, result);
    }

    @Override
    public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        return super.onJsPrompt(view, url, message, defaultValue, result);
    }


    @Override
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
//        return super.onConsoleMessage(consoleMessage);
        return controller.onConsoleMessage(consoleMessage);
    }
}
