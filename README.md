自定义androidwebview，将webview的设置及 WebSettings 规范，重写及WebChromeClient，WebViewClient类，将有关webview控件的操作统一规范化，当然也包括了webview和js的调用。
 <com.custom.common.webview.view.CustomWebView
        android:id="@+id/webview"
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"></com.custom.common.webview.view.CustomWebView>

  private CustomWebViewController controller;
声明一个控制类 ，并初始化，重写需要调用的方法，然后如下
 controller = new CustomWebViewController(mWebview, customWebBaseController, "object");
        mWebview.loadUrl(url);
使用即可。
