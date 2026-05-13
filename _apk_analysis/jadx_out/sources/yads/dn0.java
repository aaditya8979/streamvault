package yads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class dn0 {
    public static String a(Set set) throws JSONException {
        if (set != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                bn0 bn0Var = (bn0) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", bn0Var.f88089a.name());
                jSONObject.put("value", bn0Var.f88090b);
                jSONArray = jSONArray.put(jSONObject);
            }
            if (jSONArray != null) {
                return jSONArray.toString();
            }
        }
        return null;
    }

    public static Set a(String str) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(a(new JSONArray(str)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            boolean z10 = ad1.f87661a;
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        return (Set) objM7534constructorimpl;
    }

    public static Set a(JSONArray jSONArray) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            Set setB = cn.v0.b();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                setB.add(new bn0(cn0.valueOf(jSONObject.getString("type")), jSONObject.getString("value")));
            }
            objM7534constructorimpl = Result.m7534constructorimpl(cn.v0.a(setB));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            Objects.toString(jSONArray);
            boolean z10 = ad1.f87661a;
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        return (Set) objM7534constructorimpl;
    }
}
