package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f24577b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24578a;

    private g() {
    }

    public static g b() {
        return f24577b;
    }

    public Context a() {
        return this.f24578a;
    }

    public void a(Context context) {
        this.f24578a = context != null ? context.getApplicationContext() : null;
    }
}
