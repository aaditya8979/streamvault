package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5149u1;

/* JADX INFO: loaded from: classes3.dex */
public class AppMetricaInitializerJsInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5149u1 f68103a;

    public AppMetricaInitializerJsInterface(@NonNull C5149u1 c5149u1) {
        this.f68103a = c5149u1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f68103a.c(str);
    }
}
