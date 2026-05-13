package com.iab.omid.library.mmadbridge.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f24712b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24713a;

    private g() {
    }

    public static g b() {
        return f24712b;
    }

    public Context a() {
        return this.f24713a;
    }

    public void a(Context context) {
        this.f24713a = context != null ? context.getApplicationContext() : null;
    }
}
