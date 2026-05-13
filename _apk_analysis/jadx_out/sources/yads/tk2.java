package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import yads.tk2;

/* JADX INFO: loaded from: classes2.dex */
public final class tk2 implements iy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy0 f95253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f95254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zs3 f95255c;

    public /* synthetic */ tk2(hy0 hy0Var) {
        this(hy0Var, new Handler(Looper.getMainLooper()));
    }

    public tk2(hy0 hy0Var, Handler handler) {
        this.f95253a = hy0Var;
        this.f95254b = handler;
    }

    public static final void a(n7 n7Var, tk2 tk2Var) {
        String str = n7Var.f92760b;
        zs3 zs3Var = tk2Var.f95255c;
        if (zs3Var != null) {
            new CallbackStackTraceMarker(new ws3(zs3Var, new wp3(str)));
        }
    }

    public static final void a(tk2 tk2Var) {
        zs3 zs3Var = tk2Var.f95255c;
        if (zs3Var != null) {
            new CallbackStackTraceMarker(new us3(zs3Var));
        }
    }

    public static final void a(tk2 tk2Var, j5 j5Var) {
        zs3 zs3Var = tk2Var.f95255c;
        if (zs3Var != null) {
            new CallbackStackTraceMarker(new xs3(zs3Var, j5Var != null ? new lr3(j5Var) : null));
        }
    }

    public static final void b(tk2 tk2Var) {
        zs3 zs3Var = tk2Var.f95255c;
        if (zs3Var != null) {
            new CallbackStackTraceMarker(new vs3(zs3Var));
        }
    }

    public static final void c(tk2 tk2Var) {
        zs3 zs3Var = tk2Var.f95255c;
        if (zs3Var != null) {
            new CallbackStackTraceMarker(new ys3(zs3Var));
        }
        hy0 hy0Var = tk2Var.f95253a;
        if (hy0Var != null) {
            hy0Var.onAdShown();
        }
    }

    @Override // yads.iy0
    public final void a(final j5 j5Var) {
        this.f95254b.post(new Runnable() { // from class: bt.ea
            @Override // java.lang.Runnable
            public final void run() {
                tk2.a(this.f6019b, j5Var);
            }
        });
    }

    public final void a(final n7 n7Var) {
        this.f95254b.post(new Runnable() { // from class: bt.ia
            @Override // java.lang.Runnable
            public final void run() {
                tk2.a(n7Var, this);
            }
        });
    }

    @Override // yads.iy0
    public final void onAdClicked() {
        this.f95254b.post(new Runnable() { // from class: bt.fa
            @Override // java.lang.Runnable
            public final void run() {
                tk2.a(this.f6037b);
            }
        });
    }

    @Override // yads.iy0
    public final void onAdDismissed() {
        this.f95254b.post(new Runnable() { // from class: bt.ga
            @Override // java.lang.Runnable
            public final void run() {
                tk2.b(this.f6056b);
            }
        });
    }

    @Override // yads.iy0
    public final void onAdShown() {
        this.f95254b.post(new Runnable() { // from class: bt.ha
            @Override // java.lang.Runnable
            public final void run() {
                tk2.c(this.f6068b);
            }
        });
    }
}
