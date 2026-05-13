package yads;

import android.content.Context;
import java.util.Locale;
import kotlin.Result;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jf1 f87571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lj f87572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sa3 f87573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v51 f87574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final li0 f87575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dg0 f87576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w42 f87577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ry2 f87578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final uj1 f87579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ic f87580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final bf f87581k;

    public /* synthetic */ a42(Context context, at1 at1Var) {
        jf1 jf1Var = new jf1(context, at1Var);
        this(jf1Var, new lj(context, at1Var, jf1Var, 8), new sa3(), new v51(), new li0(at1Var), new dg0(), new w42(), new ry2(), new uj1(), new ic(at1Var), new bf());
    }

    public a42(jf1 jf1Var, lj ljVar, sa3 sa3Var, v51 v51Var, li0 li0Var, dg0 dg0Var, w42 w42Var, ry2 ry2Var, uj1 uj1Var, ic icVar, bf bfVar) {
        this.f87571a = jf1Var;
        this.f87572b = ljVar;
        this.f87573c = sa3Var;
        this.f87574d = v51Var;
        this.f87575e = li0Var;
        this.f87576f = dg0Var;
        this.f87577g = w42Var;
        this.f87578h = ry2Var;
        this.f87579i = uj1Var;
        this.f87580j = icVar;
        this.f87581k = bfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:448:0x00ca, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.d12 a(java.lang.String r52, yads.kn r53) throws org.json.JSONException, yads.z02 {
        /*
            Method dump skipped, instruction units count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.a42.a(java.lang.String, yads.kn):yads.d12");
    }

    public final py2 a(JSONObject jSONObject) throws JSONException, z02 {
        Object objM7534constructorimpl;
        Object objM7534constructorimpl2;
        Object objM7534constructorimpl3;
        qy2 qy2Var;
        if (!b42.a(jSONObject, "delay", "url")) {
            throw new z02("Native Ad json has not required attributes");
        }
        long j10 = jSONObject.getLong("delay");
        this.f87573c.getClass();
        String strA = sa3.a("url", jSONObject);
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(Double.valueOf(jSONObject.optInt("visibilityPercent", 0)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        Double d10 = (Double) objM7534constructorimpl;
        int iL = (int) zn.n.l(d10 != null ? d10.doubleValue() : 0.0d, 0.0d, 100.0d);
        try {
            objM7534constructorimpl2 = Result.m7534constructorimpl(jSONObject.getString("type"));
        } catch (Throwable th3) {
            Result.a aVar3 = Result.Companion;
            objM7534constructorimpl2 = Result.m7534constructorimpl(kotlin.c.a(th3));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl2)) {
            objM7534constructorimpl2 = null;
        }
        String str = (String) objM7534constructorimpl2;
        if (str != null) {
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                tn.p.j(upperCase, "toUpperCase(...)");
                objM7534constructorimpl3 = Result.m7534constructorimpl(qy2.valueOf(upperCase));
            } catch (Throwable th4) {
                Result.a aVar4 = Result.Companion;
                objM7534constructorimpl3 = Result.m7534constructorimpl(kotlin.c.a(th4));
            }
            if (Result.m7539isFailureimpl(objM7534constructorimpl3)) {
                objM7534constructorimpl3 = null;
            }
            qy2Var = (qy2) objM7534constructorimpl3;
        } else {
            qy2Var = null;
        }
        if (qy2Var == null) {
            this.f87578h.getClass();
            qy2Var = bo.d0.c0(strA, "/rtbcount/", false, 2, null) ? qy2.f94220c : bo.d0.c0(strA, "/count/", false, 2, null) ? qy2.f94219b : qy2.f94221d;
        }
        return new py2(iL, j10, qy2Var, strA);
    }
}
