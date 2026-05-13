package com.iab.omid.library.appodeal.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f23915b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23916a;

    private g() {
    }

    public static g b() {
        return f23915b;
    }

    public Context a() {
        return this.f23916a;
    }

    public void a(Context context) {
        this.f23916a = context != null ? context.getApplicationContext() : null;
    }
}
