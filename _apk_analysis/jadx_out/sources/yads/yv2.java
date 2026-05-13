package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class yv2 implements zp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f97307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f97308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aw2 f97309c;

    public yv2(aw2 aw2Var, Context context, v9 v9Var) {
        this.f97309c = aw2Var;
        this.f97307a = v9Var;
        this.f97308b = context.getApplicationContext();
    }

    @Override // yads.zp2
    public final void a() {
        v9 v9Var = this.f97307a;
        d4 d4Var = this.f97309c.f87825f;
        f22 f22Var = new f22();
        aw2 aw2Var = this.f97309c;
        aw2Var.f87823d.a(this.f97308b, this.f97307a, aw2Var.f87826g);
        zs2 zs2Var = this.f97309c.f87823d;
        Context context = this.f97308b;
        v9 v9Var2 = this.f97307a;
        zs2Var.getClass();
        new fo2((Map) null, 3);
        fo2 fo2VarA = f22Var.a(v9Var, d4Var, null);
        do2 do2Var = do2.f88937c;
        fo2VarA.b("success", "status");
        zs2Var.a(context, v9Var2, co2.f88538h, fo2VarA);
    }

    @Override // yads.zp2
    public final void a(d12 d12Var) {
        v9 v9Var = this.f97307a;
        d4 d4Var = this.f97309c.f87825f;
        f22 f22Var = new f22();
        aw2 aw2Var = this.f97309c;
        aw2Var.f87823d.a(this.f97308b, this.f97307a, aw2Var.f87826g);
        zs2 zs2Var = this.f97309c.f87823d;
        Context context = this.f97308b;
        v9 v9Var2 = this.f97307a;
        zs2Var.getClass();
        new fo2((Map) null, 3);
        fo2 fo2VarA = f22Var.a(v9Var, d4Var, d12Var);
        do2 do2Var = do2.f88937c;
        fo2VarA.b("success", "status");
        zs2Var.a(context, v9Var2, co2.f88538h, fo2VarA);
    }
}
