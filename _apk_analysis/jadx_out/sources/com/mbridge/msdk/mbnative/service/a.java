package com.mbridge.msdk.mbnative.service;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.controller.d;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: NativeProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeController f38778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f38779b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbnative.listener.a f38780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f38781d;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NativeProvider.java */
    public class RunnableC0468a implements Runnable {
        public RunnableC0468a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f();
        }
    }

    public a() {
    }

    public a(com.mbridge.msdk.mbnative.listener.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f38780c = aVar;
        this.f38781d = nativeTrackingListener;
    }

    private void a(int i10, String str) {
        if (this.f38778a != null) {
            com.mbridge.msdk.mbnative.listener.a aVar = this.f38780c;
            if (aVar == null || !aVar.a()) {
                com.mbridge.msdk.mbnative.listener.a aVar2 = this.f38780c;
                if (aVar2 != null) {
                    aVar2.b();
                }
                this.f38778a.a(i10, str);
                return;
            }
            if (v0.h()) {
                f();
            } else {
                this.f38779b.post(new RunnableC0468a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f38780c.onAdLoadError("current request is loading");
        this.f38780c.b();
    }

    public static void preload(Map<String, Object> map, int i10) {
        q0.c("NativeProvider", "native provider preload");
        new d().a(map, i10);
    }

    public void a() {
        try {
            this.f38778a.d();
        } catch (Exception unused) {
            q0.b("NativeProvider", "clear cache failed");
        }
    }

    public void a(Context context, Resources resources, Map<String, Object> map) {
        this.f38778a = new NativeController(this.f38780c, this.f38781d, map, context);
    }

    public void a(View view, Campaign campaign) {
        q0.c("NativeProvider", "native provider registerView");
        NativeController nativeController = this.f38778a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view);
    }

    public void a(View view, List<View> list, Campaign campaign) {
        NativeController nativeController = this.f38778a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view, list);
    }

    public void a(com.mbridge.msdk.mbnative.listener.a aVar) {
        this.f38780c = aVar;
    }

    public void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f38781d = nativeTrackingListener;
    }

    public void a(String str) {
        a(0, str);
    }

    public String b() {
        NativeController nativeController = this.f38778a;
        return nativeController != null ? nativeController.e() : "";
    }

    public void b(View view, Campaign campaign) {
        q0.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f38778a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view);
    }

    public void b(View view, List<View> list, Campaign campaign) {
        q0.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f38778a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view, list);
    }

    public String c() {
        NativeController nativeController = this.f38778a;
        return nativeController != null ? nativeController.g() : "";
    }

    public void d() {
        a(0, "");
    }

    public void e() {
        a(1, "");
    }

    public void g() {
        try {
            this.f38778a.i();
        } catch (Exception unused) {
            q0.b("NativeProvider", "release failed");
        }
    }
}
