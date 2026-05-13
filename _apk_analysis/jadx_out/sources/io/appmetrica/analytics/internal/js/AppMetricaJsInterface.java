package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5149u1;

/* JADX INFO: loaded from: classes3.dex */
public class AppMetricaJsInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5149u1 f68104a;

    public AppMetricaJsInterface(@NonNull C5149u1 c5149u1) {
        this.f68104a = c5149u1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f68104a.d(str, str2);
    }
}
