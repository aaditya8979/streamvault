package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* JADX INFO: renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4032g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MutableContextWrapper f31776a;

    public Activity a() {
        return (Activity) this.f31776a.getBaseContext();
    }

    public synchronized void a(Activity activity) {
        if (this.f31776a == null) {
            this.f31776a = new MutableContextWrapper(activity);
        }
        this.f31776a.setBaseContext(activity);
    }

    public synchronized void b() {
        this.f31776a = null;
    }
}
