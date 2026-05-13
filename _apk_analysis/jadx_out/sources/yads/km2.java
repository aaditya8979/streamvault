package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class km2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f91654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f91655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij f91656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f91657d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ km2(Context context, lu2 lu2Var, o5 o5Var, e00 e00Var, v9 v9Var, String str) {
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f93787a;
        this(o5Var, e00Var, v9Var, str, cf.a(context, iu3Var.b()));
    }

    public km2(o5 o5Var, e00 e00Var, v9 v9Var, String str, io2 io2Var) {
        this.f91654a = v9Var;
        this.f91655b = io2Var;
        this.f91656c = new ij(o5Var, e00Var, str);
        this.f91657d = true;
    }

    public final void a() {
        if (this.f91657d) {
            this.f91657d = false;
            return;
        }
        fo2 fo2VarA = this.f91656c.a();
        Map map = this.f91654a.f96010u;
        if (map != null) {
            fo2VarA.f89652a.putAll(map);
        }
        c cVar = this.f91654a.f95998i;
        fo2VarA.f89653b = cVar;
        this.f91655b.a(new eo2(co2.f88556z.a(), kotlin.collections.a.C(fo2VarA.f89652a), cVar));
    }
}
