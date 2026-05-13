package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f23780b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23781a;

    private g() {
    }

    public static g b() {
        return f23780b;
    }

    public Context a() {
        return this.f23781a;
    }

    public void a(Context context) {
        this.f23781a = context != null ? context.getApplicationContext() : null;
    }
}
