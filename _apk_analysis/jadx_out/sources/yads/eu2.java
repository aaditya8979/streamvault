package yads;

import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class eu2 implements dq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f89375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dq2 f89376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g53 f89377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hm0 f89378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ip f89379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dn0 f89380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u7 f89381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p33 f89382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final cy2 f89383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final od2 f89384j;

    public eu2(at1 at1Var, dq2 dq2Var, g53 g53Var, hm0 hm0Var, ip ipVar, dn0 dn0Var, u7 u7Var, p33 p33Var, cy2 cy2Var, od2 od2Var) {
        this.f89375a = at1Var;
        this.f89376b = dq2Var;
        this.f89377c = g53Var;
        this.f89378d = hm0Var;
        this.f89379e = ipVar;
        this.f89380f = dn0Var;
        this.f89381g = u7Var;
        this.f89382h = p33Var;
        this.f89383i = cy2Var;
        this.f89384j = od2Var;
    }

    public static Integer a(String str, JSONObject jSONObject) {
        Object objM7534constructorimpl;
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(Integer.valueOf(jSONObject.getInt(str)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        return (Integer) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0177  */
    @Override // yads.dq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(yads.wp2 r101) {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.eu2.a(yads.wp2):java.lang.Object");
    }
}
