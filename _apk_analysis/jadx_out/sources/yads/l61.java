package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class l61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m61 f91888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f91889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ul3 f91890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oc1 f91891d;

    public /* synthetic */ l61(j52 j52Var, List list) {
        this(new m61(), new Handler(Looper.getMainLooper()), new ul3(), pc1.a(j52Var, list));
    }

    public l61(m61 m61Var, Handler handler, ul3 ul3Var, oc1 oc1Var) {
        this.f91888a = m61Var;
        this.f91889b = handler;
        this.f91890c = ul3Var;
        this.f91891d = oc1Var;
    }
}
