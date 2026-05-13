package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class in implements ub3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn f90906a;

    public in(hn hnVar) {
        this.f90906a = hnVar;
    }

    @Override // yads.ub3
    public final String a(String str, JSONObject jSONObject) throws z02 {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0 || tn.p.f(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        this.f90906a.getClass();
        String strB = hn.b(strOptString);
        if (strB == null || strB.length() == 0) {
            throw new z02("Native Ad json has attribute with broken base64 encoding");
        }
        return strB;
    }
}
