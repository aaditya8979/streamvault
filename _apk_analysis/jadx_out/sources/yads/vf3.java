package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf3 f96079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rf3 f96080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f96081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f96082d;

    public /* synthetic */ vf3(hf3 hf3Var, rf3 rf3Var) {
        this(hf3Var, rf3Var, new Handler(Looper.getMainLooper()));
    }

    public vf3(hf3 hf3Var, rf3 rf3Var, Handler handler) {
        this.f96079a = hf3Var;
        this.f96080b = rf3Var;
        this.f96081c = handler;
    }

    public final void a() {
        if (this.f96082d) {
            this.f96080b.b();
            this.f96081c.removeCallbacksAndMessages(null);
            this.f96082d = false;
        }
    }
}
