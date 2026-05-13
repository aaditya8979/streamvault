package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v73 extends po {
    public final we A;
    public final o9 B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d4 f95982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f95983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fp2 f95984y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final io2 f95985z;

    public /* synthetic */ v73(Context context, d4 d4Var, int i10, String str, oo ooVar, Object obj, fp2 fp2Var, uo2 uo2Var, at1 at1Var, int i11) {
        this(context, d4Var, i10, str, ooVar, obj, fp2Var, (i11 & 128) != 0 ? null : uo2Var, at1Var, new we(context), new o9());
    }

    public v73(Context context, d4 d4Var, int i10, String str, oo ooVar, Object obj, fp2 fp2Var, uo2 uo2Var, at1 at1Var, we weVar, o9 o9Var) {
        super(context, i10, str, ooVar, uo2Var);
        this.f95982w = d4Var;
        this.f95983x = obj;
        this.f95984y = fp2Var;
        this.f95985z = at1Var;
        this.A = weVar;
        this.B = o9Var;
        a(context);
        l();
        m();
        n();
    }

    @Override // yads.po, yads.po2
    public im3 a(im3 im3Var) {
        try {
            e82 e82Var = im3Var.f90905b;
            this.f95985z.a(this.f95984y.a(null, e82Var != null ? e82Var.f89157a : -1, this.f95983x));
            return im3Var;
        } catch (Throwable th2) {
            this.f95985z.reportError("Failed to parse network error", th2);
            return new h4(m4.f92254p, null);
        }
    }

    @Override // yads.po2
    public final vp2 a(e82 e82Var) {
        try {
            int i10 = e82Var.f89157a;
            vp2 vp2VarA = a(e82Var, i10);
            a(e82Var, vp2VarA, i10);
            return vp2VarA;
        } catch (Throwable th2) {
            this.f95985z.reportError("Failed to parse network response", th2);
            return new vp2(new h4(m4.f92254p, null));
        }
    }

    public abstract vp2 a(e82 e82Var, int i10);

    public final void a(Context context) {
        Integer num;
        Integer num2;
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        int iIntValue = (nt2VarA == null || (num2 = nt2VarA.f92975t0) == null) ? x11.f96593a : num2.intValue();
        this.B.f93155a.getClass();
        nt2 nt2VarA2 = cw2.a().a(context);
        this.f93682o = new qe0(1.0f, iIntValue, (nt2VarA2 == null || (num = nt2VarA2.J) == null) ? 0 : num.intValue());
    }

    public final void a(e82 e82Var, vp2 vp2Var, int i10) {
        eo2 eo2VarA = this.f95984y.a(vp2Var, i10, this.f95983x);
        Map linkedHashMap = eo2VarA.f89340b;
        if (!tn.y.m(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String strC = t01.c(e82Var.f89159c, u11.f95495q);
        if (strC != null) {
            linkedHashMap.put("server_log_id", strC);
        }
        Map map = e82Var.f89159c;
        if (map != null) {
            w9.a(map);
        }
        this.f95985z.a(eo2VarA);
    }

    @Override // yads.po2
    public Map d() {
        Map mapD = cn.p0.d();
        mapD.putAll(this.f95982w.f88741b.f94197a.f91279c);
        return cn.p0.c(mapD);
    }

    public final void n() {
        eo2 eo2VarA = this.f95984y.a(this.f95983x);
        this.f95985z.a(eo2VarA);
        String str = eo2VarA.f89339a;
        co2 co2Var = co2.f88541k;
        if (tn.p.f(str, "ad_request")) {
            this.A.a(co2Var, eo2VarA.f89340b, null, null);
        }
    }
}
