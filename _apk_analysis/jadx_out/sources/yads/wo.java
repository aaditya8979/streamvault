package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wo extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f96460a;

    public /* synthetic */ wo(Context context) {
        this(context, null);
    }

    public wo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96460a = new LinkedHashMap();
        d();
    }

    public final String a(String str) {
        return str + b() + "<body style='margin:0; padding:0;'>";
    }

    @Override // android.webkit.WebView
    public final void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
        this.f96460a.put(str, obj);
    }

    public String b() {
        return "";
    }

    public void c() {
        kl3.a((ViewGroup) this);
        Iterator it = this.f96460a.keySet().iterator();
        while (it.hasNext()) {
            removeJavascriptInterface((String) it.next());
        }
        this.f96460a.clear();
        destroy();
        getClass().toString();
        boolean z10 = ad1.f87661a;
    }

    public final void d() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        if (ub.a(11)) {
            settings.setAllowContentAccess(false);
            if (ub.a(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String str) {
        if (ub.a(11)) {
            super.removeJavascriptInterface(str);
        }
    }

    public final void setDisplayZoomControls(boolean z10) {
        if (ub.a(11)) {
            getSettings().setDisplayZoomControls(z10);
        }
    }
}
