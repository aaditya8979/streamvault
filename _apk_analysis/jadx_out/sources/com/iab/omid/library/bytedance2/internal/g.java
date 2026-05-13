package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f24171b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24172a;

    private g() {
    }

    public static g b() {
        return f24171b;
    }

    public Context a() {
        return this.f24172a;
    }

    public void a(Context context) {
        this.f24172a = context != null ? context.getApplicationContext() : null;
    }
}
