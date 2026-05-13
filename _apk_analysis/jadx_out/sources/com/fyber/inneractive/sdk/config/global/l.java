package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4306ve;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16052a = new HashMap();

    public static l a(JSONObject jSONObject) throws JSONException {
        l lVar = new l();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("features");
        int i10 = 0;
        int i11 = 0;
        while (i11 < jSONArrayOptJSONArray.length()) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
            q qVar = new q();
            qVar.f16055b = jSONObject2.getString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("params");
            if (jSONObjectOptJSONObject != null) {
                qVar.f16054a = new o(jSONObjectOptJSONObject);
            } else {
                Object[] objArr = new Object[1];
                objArr[i10] = qVar.f16055b;
                IAlog.a("RemoteFeature fromJson. feature %s has no params!", objArr);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(C4306ve.f34270d);
            if (jSONArrayOptJSONArray2 != null) {
                int i12 = i10;
                while (i12 < jSONArrayOptJSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i12);
                    b bVar = new b();
                    bVar.f16026a = jSONObject3.getString("id");
                    bVar.f16027b = jSONObject3.optInt("perc", 10);
                    JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    for (int i13 = i10; i13 < jSONArray.length(); i13++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i13);
                        k kVar = new k();
                        kVar.f16050b = jSONObject4.getString("id");
                        kVar.f16051c = jSONObject4.getInt("perc");
                        JSONObject jSONObjectOptJSONObject2 = jSONObject4.optJSONObject("params");
                        if (jSONObjectOptJSONObject2 != null) {
                            kVar.f16054a = new o(jSONObjectOptJSONObject2);
                        }
                        bVar.f16028c.add(kVar);
                    }
                    b.a(bVar, jSONObject3.optJSONObject("include"), true);
                    b.a(bVar, jSONObject3.optJSONObject("exclude"), false);
                    qVar.f16056c.put(bVar.f16026a, bVar);
                    i12++;
                    i10 = 0;
                }
            }
            lVar.f16052a.put(qVar.f16055b, qVar);
            i11++;
            i10 = i10;
        }
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f16052a.equals(((l) obj).f16052a);
    }

    public final int hashCode() {
        return this.f16052a.hashCode();
    }

    public final String toString() {
        return String.format("remoteConfig - features: %s", this.f16052a.values());
    }
}
