package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ge1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xo.a f89968a = xo.u.b(null, fe1.f89551b, 1, null);

    public static final Integer a(String str, JSONObject jSONObject) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(Integer.valueOf(jSONObject.getInt(str)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        return (Integer) objM7534constructorimpl;
    }

    public static Map a(JSONObject jSONObject) {
        Map mapD = cn.p0.d();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null && strOptString.length() != 0 && !tn.p.f("null", strOptString)) {
                mapD.put(next, strOptString);
            }
        }
        return cn.p0.c(mapD);
    }

    public static final JSONObject a(String str) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(new JSONObject(str));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        return (JSONObject) objM7534constructorimpl;
    }

    public static xo.a a() {
        return f89968a;
    }

    public static List b(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        List listC = cn.v.c();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String strOptString = jSONArrayOptJSONArray.optString(i10);
            if (strOptString != null && strOptString.length() != 0 && !tn.p.f("null", strOptString)) {
                listC.add(strOptString);
            }
        }
        return cn.v.a(listC);
    }
}
