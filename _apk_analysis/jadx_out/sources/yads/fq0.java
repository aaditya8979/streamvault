package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class fq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f89662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cq0 f89663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ka2 f89664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f89665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public eq0 f89666e;

    public fq0(Handler handler, gw1 gw1Var, cq0 cq0Var, ka2 ka2Var) {
        this.f89662a = gw1Var;
        this.f89663b = cq0Var;
        this.f89664c = ka2Var;
        this.f89665d = handler;
    }

    public /* synthetic */ fq0(gw1 gw1Var, cq0 cq0Var, ka2 ka2Var) {
        this(new Handler(Looper.getMainLooper()), gw1Var, cq0Var, ka2Var);
    }
}
