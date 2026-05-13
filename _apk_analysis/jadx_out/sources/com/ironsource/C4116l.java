package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C4116l implements qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f32183a;

    public C4116l(Activity activity) {
        this.f32183a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.qg
    public void a() {
        Activity activity = this.f32183a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
