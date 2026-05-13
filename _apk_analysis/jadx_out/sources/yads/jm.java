package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import yads.jm;

/* JADX INFO: loaded from: classes2.dex */
public final class jm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f91273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y5 f91274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h00 f91275c;

    public /* synthetic */ jm(Context context, d4 d4Var, iu3 iu3Var, w5 w5Var) {
        this(new Handler(Looper.getMainLooper()), new y5(context, d4Var, iu3Var, w5Var));
    }

    public jm(Handler handler, y5 y5Var) {
        this.f91273a = handler;
        this.f91274b = y5Var;
    }

    public static final void a(jm jmVar) {
        h00 h00Var = jmVar.f91275c;
        if (h00Var != null) {
            h00Var.closeBannerAd();
        }
    }

    public static final void a(jm jmVar, j5 j5Var) {
        h00 h00Var = jmVar.f91275c;
        if (h00Var != null) {
            h00Var.a(j5Var);
        }
    }

    public static final void a(jm jmVar, l4 l4Var) {
        h00 h00Var = jmVar.f91275c;
        if (h00Var != null) {
            h00Var.a(l4Var);
        }
    }

    public static final void b(jm jmVar) {
        h00 h00Var = jmVar.f91275c;
        if (h00Var != null) {
            h00Var.onAdLoaded();
        }
    }

    public static final void c(jm jmVar) {
        h00 h00Var = jmVar.f91275c;
        if (h00Var != null) {
            h00Var.onAdClicked();
            h00Var.onLeftApplication();
        }
    }

    public static final void d(jm jmVar) {
        h00 h00Var = jmVar.f91275c;
        if (h00Var != null) {
            h00Var.onReturnedToApplication();
        }
    }

    public final void a() {
        this.f91273a.post(new Runnable() { // from class: bt.p3
            @Override // java.lang.Runnable
            public final void run() {
                jm.a(this.f6214b);
            }
        });
    }

    public final void a(d4 d4Var) {
        this.f91274b.f97004e = new j9(d4Var);
    }

    public final void a(i12 i12Var) {
        this.f91274b.f97005f = i12Var;
    }

    public final void a(final j5 j5Var) {
        this.f91273a.post(new Runnable() { // from class: bt.o3
            @Override // java.lang.Runnable
            public final void run() {
                jm.a(this.f6196b, j5Var);
            }
        });
    }

    public final void a(final l4 l4Var) {
        this.f91274b.a(l4Var.f91879b, l4Var.f91880c);
        this.f91273a.post(new Runnable() { // from class: bt.l3
            @Override // java.lang.Runnable
            public final void run() {
                jm.a(this.f6130b, l4Var);
            }
        });
    }

    public final void b() {
        this.f91274b.a();
        this.f91273a.post(new Runnable() { // from class: bt.m3
            @Override // java.lang.Runnable
            public final void run() {
                jm.b(this.f6154b);
            }
        });
    }

    public final void c() {
        this.f91273a.post(new Runnable() { // from class: bt.n3
            @Override // java.lang.Runnable
            public final void run() {
                jm.c(this.f6173b);
            }
        });
    }

    public final void d() {
        this.f91273a.post(new Runnable() { // from class: bt.q3
            @Override // java.lang.Runnable
            public final void run() {
                jm.d(this.f6236b);
            }
        });
    }
}
