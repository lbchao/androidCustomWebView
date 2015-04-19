package com.custom.common.webview.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.custom.common.webview.constant.WebConstant;

/**
 * customWebivew
 * Created by lin on 2015/4/19.
 */
public class CustomWebView extends WebView implements WebConstant {

    public CustomWebView(Context context) {
        super(context, null);
    }

    public CustomWebView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public CustomWebView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initSetting(context);
    }

    @TargetApi(21)
    public CustomWebView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @TargetApi(11)
    public CustomWebView(Context context, AttributeSet attrs, int defStyleAttr, boolean privateBrowsing) {
        super(context, attrs, defStyleAttr, privateBrowsing);
    }


    /**
     * set attribute
     *
     * @param context
     */
    public void initSetting(Context context) {
        WebView webView = this;
        WebSettings webSettings = this.getSettings();
        if (webSettings != null) {
            webSettings.setJavaScriptEnabled(isSupportJavaScript);
            webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);
            webSettings.setAllowFileAccess(isSupportAllowFileAccess);
            webSettings.setSupportMultipleWindows(isSupportMultipleWindows);
            webSettings.setUseWideViewPort(isUseWideViewPort);
            webSettings.setDatabaseEnabled(isDatabaseEnabled);
        }
        if (webView != null) {
            webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
        }
    }


}
