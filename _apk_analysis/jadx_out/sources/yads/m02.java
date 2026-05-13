package yads;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class m02 extends zn {
    public final n43 A;
    public final mz1 B;
    public final l02 C;
    public final a02 D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a12 f92200w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v02 f92201x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f12 f92202y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i12 f92203z;

    public m02(Context context, lu2 lu2Var, a12 a12Var, d4 d4Var, v02 v02Var, w5 w5Var, p000do.l0 l0Var, f12 f12Var, i12 i12Var, n43 n43Var, mz1 mz1Var) {
        super(context, w5Var, d4Var, lu2Var, l0Var);
        this.f92200w = a12Var;
        this.f92201x = v02Var;
        this.f92202y = f12Var;
        this.f92203z = i12Var;
        this.A = n43Var;
        this.B = mz1Var;
        this.C = new l02(this);
        this.D = new a02(context, lu2Var, this, this);
        v02Var.a(i12Var);
    }

    @Override // yads.zn
    public final pn a(String str, String str2) {
        JSONObject jSONObjectA;
        a02 a02Var = this.D;
        a12 a12Var = this.f92200w;
        yo2 yo2Var = a12Var.f87545c;
        d4 d4Var = this.f97678c;
        g9 g9Var = a12Var.f87543a;
        a02Var.getClass();
        zz1 zz1Var = new zz1(a02Var.f87533a, d4Var, ((iu3) a02Var.f87534b).a(), str, str2, a02Var.f87535c, a02Var.f87536d, new u02(yo2Var), new c12());
        String str3 = g9Var.f89884h;
        a02Var.f87538f.getClass();
        String strOptString = (str3 == null || (jSONObjectA = ge1.a(str3)) == null || !jSONObjectA.has("response")) ? null : jSONObjectA.optString("response");
        String str4 = g9Var.f89885i;
        if (strOptString == null) {
            strOptString = str4;
        }
        if (strOptString != null) {
            hm2 hm2Var = a02Var.f87537e;
            hm2Var.getClass();
            synchronized (hm2.f90466c) {
                hm2Var.f90468a.put(zz1Var, strOptString);
                bn.r rVar = bn.r.f5635a;
            }
        }
        return zz1Var;
    }

    @Override // yads.up2
    public final void a(Object obj) {
        v9 v9Var = (v9) obj;
        synchronized (this) {
            this.f97677b.a(v5.f95940s);
            this.f97697v = v9Var;
        }
        this.f92203z.f90632d = v9Var;
        if (this.f97693r == z5.f97392b) {
            return;
        }
        f12 f12Var = this.f92202y;
        f12Var.getClass();
        hq1 hq1Var = v9Var.f96006q;
        w22 w22VarA = (hq1Var != null ? new pp1(v9Var, hq1Var) : new tv2(f12Var.f89447a, f12Var.f89448b)).a(this);
        Context contextA = j1.a();
        if (contextA != null) {
            boolean z10 = ad1.f87661a;
        }
        if (contextA == null) {
            contextA = this.f97676a;
        }
        w22VarA.a(contextA, v9Var);
    }

    @Override // yads.zn
    public final void a(l4 l4Var) {
        this.f92201x.a(l4Var);
    }

    @Override // yads.zn
    public final boolean a(g9 g9Var) {
        return true;
    }

    @Override // yads.zn
    public final synchronized void b(g9 g9Var) {
        throw null;
    }

    @Override // yads.zn
    public final l4 o() {
        return (l4) cn.f0.v0(this.f97685j.a());
    }
}
