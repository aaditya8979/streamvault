package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.AppMetrica;
import java.util.concurrent.TimeUnit;
import yads.wg;

/* JADX INFO: loaded from: classes2.dex */
public final class wg implements dh {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f96372g = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ug f96373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fh f96374b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f96377e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f96375c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rg f96376d = new rg();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f96378f = new Object();

    public wg(ug ugVar, fh fhVar) {
        this.f96373a = ugVar;
        this.f96374b = fhVar;
    }

    public static final void a(sn.a aVar) {
        aVar.invoke();
    }

    public final void a() {
        boolean z10 = ad1.f87661a;
        ug ugVar = this.f96373a;
        synchronized (ugVar.f95641a) {
            ugVar.f95642b.clear();
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void a(Context context) {
        boolean z10;
        synchronized (this.f96378f) {
            z10 = true;
            if (this.f96377e) {
                z10 = false;
            } else {
                this.f96377e = true;
            }
            bn.r rVar = bn.r.f5635a;
        }
        if (z10) {
            boolean z11 = ad1.f87661a;
            b();
            this.f96374b.getClass();
            try {
                AppMetrica.requestStartupParams(context, new hh(this), ih.f90836a);
            } catch (Throwable unused) {
                boolean z12 = ad1.f87661a;
                ch chVar = ch.f88459b;
                c();
                this.f96376d.f94434a.getClass();
                String str = (String) sg.f94810a.get(chVar);
                if (str == null) {
                    str = "Unknown";
                }
                rg.a(str);
                a();
            }
        }
    }

    public final void b() {
        final vg vgVar = new vg(this);
        this.f96375c.postDelayed(new Runnable() { // from class: bt.sb
            @Override // java.lang.Runnable
            public final void run() {
                wg.a(vgVar);
            }
        }, f96372g);
    }

    public final void c() {
        synchronized (this.f96378f) {
            this.f96375c.removeCallbacksAndMessages(null);
            this.f96377e = false;
            bn.r rVar = bn.r.f5635a;
        }
    }
}
