package com.iab.omid.library.bigosg.b;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static d f24043a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24044b;

    private d() {
    }

    public static d a() {
        return f24043a;
    }

    public void a(Context context) {
        this.f24044b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f24044b;
    }
}
