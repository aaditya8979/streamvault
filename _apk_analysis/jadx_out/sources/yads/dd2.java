package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dd2 implements wa3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k83 f88824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f83 f88825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xo2 f88826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final be0 f88827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f88828e;

    public /* synthetic */ dd2(Context context, d4 d4Var, lu2 lu2Var, k83 k83Var) {
        f83 f83Var = new f83(context, d4Var, lu2Var);
        Object obj = xo2.f96843a;
        this(context, k83Var, f83Var, wo2.a(), new be0());
    }

    public dd2(Context context, k83 k83Var, f83 f83Var, xo2 xo2Var, be0 be0Var) {
        this.f88824a = k83Var;
        this.f88825b = f83Var;
        this.f88826c = xo2Var;
        this.f88827d = be0Var;
        this.f88828e = context.getApplicationContext();
    }

    @Override // yads.wa3
    public final void a(String str, Map map) {
        String strA = this.f88827d.a(str, map);
        Object obj = dw2.f89000j;
        bd2 bd2Var = new bd2(this.f88828e, strA, new cd2(str, cw2.a().a(this.f88828e), this.f88825b, this.f88824a));
        xo2 xo2Var = this.f88826c;
        Context context = this.f88828e;
        synchronized (xo2Var) {
            r82.a(context).a(bd2Var);
        }
    }
}
