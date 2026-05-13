package com.iab.omid.library.inmobi.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f24442b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24443a;

    private g() {
    }

    public static g b() {
        return f24442b;
    }

    public Context a() {
        return this.f24443a;
    }

    public void a(Context context) {
        this.f24443a = context != null ? context.getApplicationContext() : null;
    }
}
