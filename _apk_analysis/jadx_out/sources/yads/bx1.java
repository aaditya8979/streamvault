package yads;

import android.content.Context;
import com.safedk.android.analytics.events.base.StatsEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class bx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f88183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final at1 f88184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88187e;

    public bx1(Context context, v9 v9Var, lu2 lu2Var) {
        this.f88183a = v9Var;
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f93787a;
        this.f88184b = cf.a(context, iu3Var.b());
        this.f88185c = true;
        this.f88186d = true;
        this.f88187e = true;
    }

    public final void a(String str) {
        co2 co2Var = co2.f88533c;
        this.f88184b.a(new eo2("multibanner_event", kotlin.collections.a.C(kotlin.collections.a.l(bn.h.a(StatsEvent.f52830z, str))), this.f88183a.f95998i));
    }
}
