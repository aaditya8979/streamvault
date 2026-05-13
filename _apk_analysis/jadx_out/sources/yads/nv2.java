package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class nv2 implements zp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f93013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f93014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qv2 f93015c;

    public nv2(qv2 qv2Var, Context context, v9 v9Var) {
        this.f93015c = qv2Var;
        this.f93013a = context;
        this.f93014b = v9Var;
    }

    @Override // yads.zp2
    public final void a() {
        qv2 qv2Var = this.f93015c;
        qv2Var.f94169e.a(this.f93013a, this.f93014b, qv2Var.f94168d);
        this.f93015c.f94169e.a(this.f93013a, this.f93014b, (e22) null);
    }

    @Override // yads.zp2
    public final void a(d12 d12Var) {
        v9 v9Var = this.f93014b;
        d4 d4Var = this.f93015c.f94165a.f97678c;
        f22 f22Var = new f22();
        qv2 qv2Var = this.f93015c;
        qv2Var.f94169e.a(this.f93013a, this.f93014b, qv2Var.f94168d);
        zs2 zs2Var = this.f93015c.f94169e;
        Context context = this.f93013a;
        v9 v9Var2 = this.f93014b;
        zs2Var.getClass();
        new fo2((Map) null, 3);
        fo2 fo2VarA = f22Var.a(v9Var, d4Var, d12Var);
        do2 do2Var = do2.f88937c;
        fo2VarA.b("success", "status");
        zs2Var.a(context, v9Var2, co2.f88538h, fo2VarA);
    }
}
