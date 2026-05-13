package yads;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class th0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dg0 f95213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final li0 f95214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m83 f95215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f95216d;

    public th0(dg0 dg0Var, li0 li0Var, m83 m83Var, boolean z10) {
        this.f95213a = dg0Var;
        this.f95214b = li0Var;
        this.f95215c = m83Var;
        this.f95216d = z10;
    }

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) throws JSONException, z02 {
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || tn.p.f(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        this.f95215c.getClass();
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("design");
        xf0 xf0VarA = jSONObjectOptJSONObject != null ? this.f95213a.a(jSONObjectOptJSONObject) : null;
        gi0 gi0VarA = xf0VarA != null ? this.f95214b.a(xf0VarA, this.f95216d) : null;
        if (gi0VarA != null) {
            return new rh0(strOptString, gi0VarA, arrayList);
        }
        throw new z02("Native Ad json has not required attributes");
    }
}
