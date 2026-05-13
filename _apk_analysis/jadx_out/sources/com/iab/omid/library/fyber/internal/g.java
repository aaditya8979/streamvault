package com.iab.omid.library.fyber.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f24301b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24302a;

    private g() {
    }

    public static g b() {
        return f24301b;
    }

    public Context a() {
        return this.f24302a;
    }

    public void a(Context context) {
        this.f24302a = context != null ? context.getApplicationContext() : null;
    }
}
