package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public final class fn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e9 f89641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final in2 f89642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f89643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f89644d;

    public fn2(e9 e9Var, in2 in2Var) {
        this(e9Var, in2Var, new Handler(Looper.getMainLooper()));
    }

    public fn2(e9 e9Var, in2 in2Var, Handler handler) {
        this.f89641a = e9Var;
        this.f89642b = in2Var;
        this.f89643c = handler;
    }
}
