package yads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class x41 implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l41 f96629a;

    public /* synthetic */ x41() {
        this(new l41());
    }

    public x41(l41 l41Var) {
        this.f96629a = l41Var;
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws JSONException, z02 {
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            boolean z10 = ad1.f87661a;
            throw new z02("Native Ad json has not required attributes");
        }
        return this.f96629a.a(jSONObject.getJSONObject("value"));
    }
}
