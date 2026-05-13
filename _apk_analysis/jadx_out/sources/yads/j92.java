package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class j92 implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq2 f91131a;

    public j92(lq2 lq2Var) {
        this.f91131a = lq2Var;
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws z02 {
        String strOptString = jSONObject.optString("name");
        if (strOptString == null || strOptString.length() == 0 || tn.p.f(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        String strOptString2 = jSONObject.optString("value");
        if (strOptString2 == null || strOptString2.length() == 0 || tn.p.f(strOptString2, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        return tn.p.f("review_count", strOptString) ? this.f91131a.a(strOptString2) : strOptString2;
    }
}
