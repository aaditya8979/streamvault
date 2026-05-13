package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class vv2 implements zp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f96200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f96201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xv2 f96202c;

    public vv2(xv2 xv2Var, Context context, v9 v9Var) {
        this.f96202c = xv2Var;
        this.f96200a = v9Var;
        this.f96201b = context.getApplicationContext();
    }

    @Override // yads.zp2
    public final void a() {
        v9 v9Var = this.f96200a;
        d4 d4Var = this.f96202c.f96895f;
        f22 f22Var = new f22();
        xv2 xv2Var = this.f96202c;
        xv2Var.f96893d.a(this.f96201b, this.f96200a, xv2Var.f96896g);
        zs2 zs2Var = this.f96202c.f96893d;
        Context context = this.f96201b;
        v9 v9Var2 = this.f96200a;
        zs2Var.getClass();
        new fo2((Map) null, 3);
        fo2 fo2VarA = f22Var.a(v9Var, d4Var, null);
        do2 do2Var = do2.f88937c;
        fo2VarA.b("success", "status");
        zs2Var.a(context, v9Var2, co2.f88538h, fo2VarA);
    }

    @Override // yads.zp2
    public final void a(d12 d12Var) {
        v9 v9Var = this.f96200a;
        d4 d4Var = this.f96202c.f96895f;
        f22 f22Var = new f22();
        xv2 xv2Var = this.f96202c;
        xv2Var.f96893d.a(this.f96201b, this.f96200a, xv2Var.f96896g);
        zs2 zs2Var = this.f96202c.f96893d;
        Context context = this.f96201b;
        v9 v9Var2 = this.f96200a;
        zs2Var.getClass();
        new fo2((Map) null, 3);
        fo2 fo2VarA = f22Var.a(v9Var, d4Var, d12Var);
        do2 do2Var = do2.f88937c;
        fo2VarA.b("success", "status");
        zs2Var.a(context, v9Var2, co2.f88538h, fo2VarA);
    }
}
