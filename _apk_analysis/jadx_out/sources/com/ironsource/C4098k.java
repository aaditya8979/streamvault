package com.ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.WindowInsets$Type;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C4098k implements qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f32102a;

    public C4098k(Activity activity) {
        this.f32102a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.qg
    public void a() {
        Activity activity = this.f32102a.get();
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            activity.getWindow().setFlags(1024, 1024);
            return;
        }
        WindowInsetsController windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsets$Type.statusBars());
        }
    }
}
