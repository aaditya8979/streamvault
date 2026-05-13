package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import yads.vk2;

/* JADX INFO: loaded from: classes9.dex */
public final class vk2 implements iy0, qr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy0 f96122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f96123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public eu3 f96124c;

    public /* synthetic */ vk2(hy0 hy0Var) {
        this(hy0Var, new Handler(Looper.getMainLooper()));
    }

    public vk2(hy0 hy0Var, Handler handler) {
        this.f96122a = hy0Var;
        this.f96123b = handler;
    }

    public static final void a(n7 n7Var, vk2 vk2Var) {
        String str = n7Var.f92760b;
        eu3 eu3Var = vk2Var.f96124c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new au3(eu3Var, new wp3(str)));
        }
    }

    public static final void a(vk2 vk2Var) {
        eu3 eu3Var = vk2Var.f96124c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new yt3(eu3Var));
        }
    }

    public static final void a(vk2 vk2Var, j5 j5Var) {
        eu3 eu3Var = vk2Var.f96124c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new bu3(eu3Var, j5Var != null ? new lr3(j5Var) : null));
        }
    }

    public static final void a(vk2 vk2Var, pq2 pq2Var) {
        eu3 eu3Var = vk2Var.f96124c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new du3(eu3Var, new wt3(pq2Var)));
        }
    }

    public static final void b(vk2 vk2Var) {
        eu3 eu3Var = vk2Var.f96124c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new zt3(eu3Var));
        }
    }

    public static final void c(vk2 vk2Var) {
        eu3 eu3Var = vk2Var.f96124c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new cu3(eu3Var));
        }
        hy0 hy0Var = vk2Var.f96122a;
        if (hy0Var != null) {
            hy0Var.onAdShown();
        }
    }

    @Override // yads.qr2
    public final void a(final bw2 bw2Var) {
        this.f96123b.post(new Runnable() { // from class: bt.ib
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(this.f6086b, bw2Var);
            }
        });
    }

    @Override // yads.iy0
    public final void a(final j5 j5Var) {
        this.f96123b.post(new Runnable() { // from class: bt.jb
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(this.f6104b, j5Var);
            }
        });
    }

    public final void a(final n7 n7Var) {
        this.f96123b.post(new Runnable() { // from class: bt.lb
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(n7Var, this);
            }
        });
    }

    @Override // yads.iy0
    public final void onAdClicked() {
        this.f96123b.post(new Runnable() { // from class: bt.nb
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(this.f6186b);
            }
        });
    }

    @Override // yads.iy0
    public final void onAdDismissed() {
        this.f96123b.post(new Runnable() { // from class: bt.kb
            @Override // java.lang.Runnable
            public final void run() {
                vk2.b(this.f6124b);
            }
        });
    }

    @Override // yads.iy0
    public final void onAdShown() {
        this.f96123b.post(new Runnable() { // from class: bt.mb
            @Override // java.lang.Runnable
            public final void run() {
                vk2.c(this.f6162b);
            }
        });
    }
}
