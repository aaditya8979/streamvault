package yads;

import android.os.Handler;
import android.os.Looper;
import yads.wz1;

/* JADX INFO: loaded from: classes12.dex */
public final class wz1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f96566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z00 f96567b;

    public /* synthetic */ wz1() {
        this(new Handler(Looper.getMainLooper()));
    }

    public wz1(Handler handler) {
        this.f96566a = handler;
    }

    public static final void a(wz1 wz1Var) {
        z00 z00Var = wz1Var.f96567b;
        if (z00Var != null) {
            z00Var.closeNativeAd();
        }
    }

    public static final void a(wz1 wz1Var, j5 j5Var) {
        z00 z00Var = wz1Var.f96567b;
        if (z00Var != null) {
            z00Var.a(j5Var);
        }
    }

    public static final void b(wz1 wz1Var) {
        z00 z00Var = wz1Var.f96567b;
        if (z00Var != null) {
            z00Var.onAdClicked();
        }
        z00 z00Var2 = wz1Var.f96567b;
        if (z00Var2 != null) {
            z00Var2.onLeftApplication();
        }
    }

    public static final void c(wz1 wz1Var) {
        z00 z00Var = wz1Var.f96567b;
        if (z00Var != null) {
            z00Var.onReturnedToApplication();
        }
    }

    public final void a() {
        this.f96566a.post(new Runnable() { // from class: bt.lc
            @Override // java.lang.Runnable
            public final void run() {
                wz1.a(this.f6144b);
            }
        });
    }

    public final void a(final j5 j5Var) {
        this.f96566a.post(new Runnable() { // from class: bt.mc
            @Override // java.lang.Runnable
            public final void run() {
                wz1.a(this.f6163b, j5Var);
            }
        });
    }

    public final void b() {
        this.f96566a.post(new Runnable() { // from class: bt.kc
            @Override // java.lang.Runnable
            public final void run() {
                wz1.b(this.f6125b);
            }
        });
    }

    @Override // yads.g1
    public final void onReturnedToApplication() {
        this.f96566a.post(new Runnable() { // from class: bt.nc
            @Override // java.lang.Runnable
            public final void run() {
                wz1.c(this.f6187b);
            }
        });
    }
}
