package io.bidmachine.iab.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3978d4;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.SafeDKWebAppInterface;
import io.bidmachine.iab.mraid.MraidWebView;
import io.bidmachine.iab.utils.VisibilityTracker;

/* JADX INFO: loaded from: classes11.dex */
public class MraidWebView extends WebView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f69316g = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebViewGestureDetector f69317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VisibilityTracker f69318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MraidWebViewListener f69319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f69320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f69321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f69322f;

    public interface MraidWebViewListener {
        void onViewableChanged(boolean z10);
    }

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            MraidWebView.this.f69317a.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    public static final class b extends WebChromeClient {
        private b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        private boolean a(JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String str;
            if (consoleMessage == null || consoleMessage.message() == null) {
                return false;
            }
            if (MraidLog.canSendDLog() && !consoleMessage.message().contains("Uncaught ReferenceError")) {
                Object[] objArr = new Object[3];
                objArr[0] = consoleMessage.message();
                if (consoleMessage.sourceId() == null) {
                    str = "";
                } else {
                    str = " at " + consoleMessage.sourceId();
                }
                objArr[1] = str;
                objArr[2] = Integer.valueOf(consoleMessage.lineNumber());
                MraidLog.d("JS console", String.format("%s%s:%d", objArr), new Object[0]);
            }
            if (MraidLog.canSendELog() && consoleMessage.message().contains("AppodealAlert")) {
                MraidLog.e("Appodeal", consoleMessage.message().replace("AppodealAlert:", ""), new Object[0]);
            }
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            MraidLog.d("JS alert", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            MraidLog.d("JS confirm", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            MraidLog.d("JS prompt", str2, new Object[0]);
            return a(jsPromptResult);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public MraidWebView(@NonNull Context context) {
        super(context);
        this.f69320d = false;
        this.f69321e = false;
        this.f69322f = false;
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setScrollBarStyle(33554432);
        setFocusableInTouchMode(false);
        this.f69317a = new WebViewGestureDetector(context);
        setOnTouchListener(new a());
        setWebChromeClient(f69316g);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setBackgroundColor(0);
        this.f69318b = new VisibilityTracker(context, this, new VisibilityTracker.Callback() { // from class: fi.e
            @Override // io.bidmachine.iab.utils.VisibilityTracker.Callback
            public final void onVisibilityChanged(boolean z10) {
                this.f61720a.a(z10);
            }
        });
    }

    private void a() {
        MraidLog.d("MraidWebView", C3978d4.i.f31364t0, new Object[0]);
        try {
            onPause();
        } catch (Throwable th2) {
            MraidLog.e("MraidWebView", th2);
        }
        this.f69321e = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str) {
        MraidLog.d("MraidWebView", "evaluate js complete: %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10) {
        c();
    }

    private void b() {
        MraidLog.d("MraidWebView", C3978d4.i.f31366u0, new Object[0]);
        try {
            onResume();
        } catch (Throwable th2) {
            MraidLog.e("MraidWebView", th2);
        }
        this.f69321e = false;
        c();
    }

    private void c() {
        boolean z10 = !this.f69321e && this.f69318b.isVisible();
        if (z10 != this.f69320d) {
            this.f69320d = z10;
            MraidWebViewListener mraidWebViewListener = this.f69319c;
            if (mraidWebViewListener != null) {
                mraidWebViewListener.onViewableChanged(z10);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f69322f = true;
        try {
            reset();
            removeAllViews();
            this.f69318b.release();
            super.destroy();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void injectJs(String str) {
        if (isDestroyed()) {
            MraidLog.d("MraidWebView", "can't evaluating js: WebView is destroyed", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MraidLog.d("MraidWebView", "can't evaluating js: js is empty", new Object[0]);
            return;
        }
        try {
            MraidLog.d("MraidWebView", "evaluating js: %s", str);
            evaluateJavascript(str, new ValueCallback() { // from class: fi.d
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    MraidWebView.a((String) obj);
                }
            });
        } catch (Throwable th2) {
            MraidLog.e("MraidWebView", th2.getMessage(), new Object[0]);
            MraidLog.d("MraidWebView", "loading url: %s", str);
            loadUrl(SafeDKWebAppInterface.f52902f + str);
        }
    }

    public boolean isDestroyed() {
        return this.f69322f;
    }

    public boolean isViewable() {
        return this.f69320d;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void onPageFinished() {
        this.f69318b.start();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            b();
        } else {
            a();
        }
    }

    @Override // android.view.View
    public boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        return false;
    }

    public void reset() {
        stopLoading();
        loadUrl("");
        a();
    }

    public void resetClicked() {
        this.f69317a.resetClick();
    }

    public void setListener(@Nullable MraidWebViewListener mraidWebViewListener) {
        this.f69319c = mraidWebViewListener;
    }

    public boolean wasClicked() {
        return this.f69317a.isClicked();
    }
}
