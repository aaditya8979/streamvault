package com.mbridge.msdk.config.component.status;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: MBActivityLifecyclePublisher.java */
/* JADX INFO: loaded from: classes12.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f36354a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36355b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36356c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36357d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36358e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f36359f = new Handler();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f36360g = new Runnable() { // from class: com.mbridge.msdk.config.component.status.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f36379b.c();
        }
    };

    public b(Context context) {
        if (context == null) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    private void a() {
        if (this.f36356c == 0) {
            this.f36357d = true;
        }
    }

    private void a(com.mbridge.msdk.config.component.base.b bVar) {
        Iterator<a> it = this.f36354a.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private void a(String str, String str2) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b(str);
        HashMap map = new HashMap();
        map.put("event", str2);
        bVar.a(map);
        a(bVar);
    }

    private void b() {
        if (this.f36355b == 0 && this.f36357d) {
            a("OnAppBackground", "");
            this.f36358e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a();
        b();
    }

    public void a(a aVar) {
        this.f36354a.add(aVar);
    }

    public void b(a aVar) {
        this.f36354a.add(aVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        a("LifecycleChanged", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        a("LifecycleChanged", "onActivityDestroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        this.f36356c--;
        a("LifecycleChanged", "onActivityPaused");
        if (this.f36356c == 0) {
            this.f36359f.postDelayed(this.f36360g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        this.f36356c++;
        a("LifecycleChanged", "onActivityResumed");
        if (this.f36356c == 1) {
            if (!this.f36357d) {
                this.f36359f.removeCallbacks(this.f36360g);
            } else {
                a("OnAppForeground", "");
                this.f36357d = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        this.f36355b++;
        a("LifecycleChanged", "onActivityStarted");
        if (this.f36355b == 1 && this.f36358e) {
            this.f36358e = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        this.f36355b--;
        a("LifecycleChanged", "onActivityStopped");
        b();
    }
}
