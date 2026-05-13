package com.applovin.impl.sdk;

import com.applovin.impl.g7;
import com.applovin.impl.sdk.a;
import com.applovin.impl.t1;
import com.applovin.impl.x4;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f9993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f9994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f9995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g7 f9996d;

    private b(t1 t1Var, a.InterfaceC0152a interfaceC0152a, k kVar) {
        this.f9994b = new WeakReference(t1Var);
        this.f9995c = new WeakReference(interfaceC0152a);
        this.f9993a = kVar;
    }

    public static b a(t1 t1Var, a.InterfaceC0152a interfaceC0152a, k kVar) {
        b bVar = new b(t1Var, interfaceC0152a, kVar);
        bVar.a(t1Var.getTimeToLiveMillis());
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f9993a.f().a(this);
    }

    public void a() {
        g7 g7Var = this.f9996d;
        if (g7Var != null) {
            g7Var.a();
            this.f9996d = null;
        }
    }

    public void a(long j10) {
        a();
        if (((Boolean) this.f9993a.a(x4.f10684b1)).booleanValue() || !this.f9993a.m0().isApplicationPaused()) {
            this.f9996d = g7.a(j10, this.f9993a, new Runnable() { // from class: com.applovin.impl.sdk.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10390b.c();
                }
            });
        }
    }

    public t1 b() {
        return (t1) this.f9994b.get();
    }

    public void d() {
        a();
        t1 t1VarB = b();
        if (t1VarB == null) {
            return;
        }
        t1VarB.setExpired();
        a.InterfaceC0152a interfaceC0152a = (a.InterfaceC0152a) this.f9995c.get();
        if (interfaceC0152a == null) {
            return;
        }
        interfaceC0152a.onAdExpired(t1VarB);
    }
}
