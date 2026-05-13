package yads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class qs1 extends ry {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final fm1 f94134v;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f94135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f94136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mo[] f94137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s63[] f94138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f94139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hc0 f94140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f94141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sx1 f94142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f94143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long[][] f94144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ps1 f94145u;

    static {
        sl1 sl1Var = new sl1();
        p51.g();
        Collections.emptyList();
        sm2 sm2Var = sm2.f94878f;
        f94134v = new fm1("MergingMediaSource", new ul1(sl1Var), null, new yl1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), jm1.H, cm1.f88503d);
    }

    public qs1(hc0 hc0Var, mo... moVarArr) {
        this.f94135k = false;
        this.f94136l = false;
        this.f94137m = moVarArr;
        this.f94140p = hc0Var;
        this.f94139o = new ArrayList(Arrays.asList(moVarArr));
        this.f94143s = -1;
        this.f94138n = new s63[moVarArr.length];
        this.f94144t = new long[0][];
        this.f94141q = new HashMap();
        this.f94142r = px1.a().a().b();
    }

    public qs1(mo[] moVarArr, int i10) {
        this(new hc0(), moVarArr);
    }

    @Override // yads.mo
    public final pm1 a(ym1 ym1Var, qe qeVar, long j10) {
        int length = this.f94137m.length;
        pm1[] pm1VarArr = new pm1[length];
        int iA = this.f94138n[0].a(ym1Var.f94492a);
        for (int i10 = 0; i10 < length; i10++) {
            pm1VarArr[i10] = this.f94137m[i10].a(ym1Var.a(this.f94138n[i10].a(iA)), qeVar, j10 - this.f94144t[iA][i10]);
        }
        ns1 ns1Var = new ns1(this.f94140p, this.f94144t[iA], pm1VarArr);
        if (!this.f94136l) {
            return ns1Var;
        }
        Long l10 = (Long) this.f94141q.get(ym1Var.f94492a);
        l10.getClass();
        tv tvVar = new tv(ns1Var, true, 0L, l10.longValue());
        this.f94142r.a(ym1Var.f94492a, tvVar);
        return tvVar;
    }

    @Override // yads.ry
    public final ym1 a(Object obj, ym1 ym1Var) {
        if (((Integer) obj).intValue() == 0) {
            return ym1Var;
        }
        return null;
    }

    @Override // yads.mo
    public final void a(pm1 pm1Var) {
        if (this.f94136l) {
            tv tvVar = (tv) pm1Var;
            sx1 sx1Var = this.f94142r;
            c0 c0Var = sx1Var.f89035b;
            if (c0Var == null) {
                c0Var = new c0(sx1Var);
                sx1Var.f89035b = c0Var;
            }
            Iterator it = c0Var.iterator();
            while (true) {
                o oVar = (o) it;
                if (!oVar.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) oVar.next();
                if (((tv) entry.getValue()).equals(tvVar)) {
                    sx1 sx1Var2 = this.f94142r;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) sx1Var2.a().get(key);
                    if (collection != null) {
                        collection.remove(value);
                    }
                }
            }
            pm1Var = tvVar.f95362b;
        }
        ns1 ns1Var = (ns1) pm1Var;
        int i10 = 0;
        while (true) {
            mo[] moVarArr = this.f94137m;
            if (i10 >= moVarArr.length) {
                return;
            }
            mo moVar = moVarArr[i10];
            pm1 pm1Var2 = ns1Var.f92925b[i10];
            if (pm1Var2 instanceof ls1) {
                pm1Var2 = ((ls1) pm1Var2).f92081b;
            }
            moVar.a(pm1Var2);
            i10++;
        }
    }

    @Override // yads.mo
    public final void a(r83 r83Var) {
        this.f94645j = r83Var;
        this.f94644i = ib3.a((Handler.Callback) null);
        for (int i10 = 0; i10 < this.f94137m.length; i10++) {
            a(Integer.valueOf(i10), this.f94137m[i10]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0132, code lost:
    
        r14 = r14 + 1;
     */
    @Override // yads.ry
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r12, yads.mo r13, yads.s63 r14) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.qs1.a(java.lang.Object, yads.mo, yads.s63):void");
    }

    @Override // yads.mo
    public final fm1 c() {
        mo[] moVarArr = this.f94137m;
        return moVarArr.length > 0 ? moVarArr[0].c() : f94134v;
    }

    @Override // yads.ry, yads.mo
    public final void d() throws ps1 {
        ps1 ps1Var = this.f94145u;
        if (ps1Var != null) {
            throw ps1Var;
        }
        super.d();
    }

    @Override // yads.ry, yads.mo
    public final void e() {
        super.e();
        Arrays.fill(this.f94138n, (Object) null);
        this.f94143s = -1;
        this.f94145u = null;
        this.f94139o.clear();
        Collections.addAll(this.f94139o, this.f94137m);
    }
}
