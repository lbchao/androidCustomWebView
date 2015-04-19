package com.custom.common.webview.control;

import com.custom.common.webview.view.CustomWebView;

/**
 * Created by lin on 2015/4/19.
 */
public class CustomWebViewController {

    private CustomWebView mCustomWebView;
    private CustomWebChromeClient customWebChromeClient;
    private CustomWebviewClient customWebviewClient;
    private CustomWebBaseController customWebBaseController;

    public CustomWebViewController(CustomWebView customWebView, CustomWebBaseController customWebBaseController,
                                   String interName) {
        this.customWebBaseController = customWebBaseController;
        mCustomWebView = customWebView;
        customWebChromeClient = new CustomWebChromeClient(customWebBaseController);
        customWebviewClient = new CustomWebviewClient(customWebBaseController);
        mCustomWebView.setWebChromeClient(customWebChromeClient);
        mCustomWebView.setWebViewClient(customWebviewClient);
        mCustomWebView.addJavascriptInterface(customWebBaseController,interName);
    }


}
