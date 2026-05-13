package com.iab.omid.library.unity3d.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static f f24846b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24847a;

    private f() {
    }

    public static f b() {
        return f24846b;
    }

    public Context a() {
        return this.f24847a;
    }

    public void a(Context context) {
        this.f24847a = context != null ? context.getApplicationContext() : null;
    }
}
