package yads;

import com.ironsource.C3978d4;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class pn1 implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm1 f93648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bi3 f93649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l41 f93650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a51 f93651d;

    public pn1(nm1 nm1Var, bi3 bi3Var, l41 l41Var, a51 a51Var) {
        this.f93648a = nm1Var;
        this.f93649b = bi3Var;
        this.f93650c = l41Var;
        this.f93651d = a51Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws JSONException, z02 {
        ?? S;
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            boolean z10 = ad1.f87661a;
            throw new z02("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        oj1 oj1Var = (oj1) ((!jSONObject2.has(C3978d4.i.I0) || jSONObject2.isNull(C3978d4.i.I0)) ? null : this.f93648a.a(jSONObject2.getJSONObject(C3978d4.i.I0)));
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            a51 a51Var = this.f93651d;
            a51Var.getClass();
            S = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                S.add(a51Var.f87584a.a(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
        } else {
            S = 0;
        }
        u41 u41VarA = (!jSONObject2.has("image") || jSONObject2.isNull("image")) ? null : this.f93650c.a(jSONObject2.getJSONObject("image"));
        if ((S == 0 || S.isEmpty()) && u41VarA != null) {
            S = cn.w.s(u41VarA);
        }
        sd3 sd3Var = (sd3) ((!jSONObject2.has("video") || jSONObject2.isNull("video")) ? null : this.f93649b.a(jSONObject2.getJSONObject("video")));
        if (oj1Var != null || ((S != 0 && !S.isEmpty()) || sd3Var != null)) {
            return new on1(oj1Var, sd3Var, S != 0 ? cn.f0.j1(S) : null);
        }
        boolean z11 = ad1.f87661a;
        throw new z02("Native Ad json has not required attributes");
    }
}
