package yads;

import com.ironsource.Q6;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f88499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jn f88500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib f88501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z82 f88502d;

    public cm0(d4 d4Var, jn jnVar, ib ibVar, z82 z82Var) {
        this.f88499a = d4Var;
        this.f88500b = jnVar;
        this.f88501c = ibVar;
        this.f88502d = z82Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r14, hn.c r15) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cm0.a(android.content.Context, hn.c):java.lang.Object");
    }

    public final String a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Q6.E1, jSONArray);
                jn jnVar = this.f88500b;
                String string = jSONObject.toString();
                jnVar.getClass();
                return jn.a(string);
            } catch (JSONException unused) {
                boolean z10 = ad1.f87661a;
            }
        }
        return null;
    }
}
