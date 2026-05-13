package yads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class u7 {
    public static String a(f8 f8Var) {
        if (f8Var == null) {
            return null;
        }
        xo.b0 b0Var = new xo.b0();
        xo.h.b(b0Var, "isEnabled", Boolean.valueOf(f8Var.f89506a));
        xo.h.b(b0Var, "isInDebug", Boolean.valueOf(f8Var.f89507b));
        xo.h.d(b0Var, "apiKey", f8Var.f89508c);
        xo.h.c(b0Var, "validationTimeoutInSec", Long.valueOf(f8Var.f89509d));
        xo.h.c(b0Var, "usagePercent", Integer.valueOf(f8Var.f89510e));
        xo.h.b(b0Var, "willBlockAdOnInternalError", Boolean.valueOf(f8Var.f89511f));
        xo.h.e(b0Var, "enabledAdUnits", new r7(f8Var));
        xo.h.f(b0Var, "adNetworksCustomParameters", new t7(f8Var));
        return b0Var.a().toString();
    }

    public static f8 a(String str) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(a(new JSONObject(str)));
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
        return (f8) objM7534constructorimpl;
    }

    public static f8 a(JSONObject jSONObject) {
        Object objM7534constructorimpl;
        Set setF;
        Map mapJ;
        String str = "usagePercent";
        if (jSONObject == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            boolean z10 = jSONObject.getBoolean("isEnabled");
            boolean z11 = jSONObject.getBoolean("isInDebug");
            String string = jSONObject.getString("apiKey");
            long j10 = jSONObject.getLong("validationTimeoutInSec");
            int i10 = jSONObject.getInt("usagePercent");
            boolean z12 = jSONObject.getBoolean("willBlockAdOnInternalError");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("enabledAdUnits");
            if (jSONArrayOptJSONArray != null) {
                Set setB = cn.v0.b();
                int length = jSONArrayOptJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    String string2 = jSONArrayOptJSONArray.getString(i11);
                    if (string2.length() > 0) {
                        setB.add(string2);
                    }
                }
                setF = cn.v0.a(setB);
            } else {
                setF = null;
            }
            if (setF == null) {
                setF = cn.w0.f();
            }
            Set set = setF;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adNetworksCustomParameters");
            if (jSONObjectOptJSONObject != null) {
                Map mapD = cn.p0.d();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObjectOptJSONObject.getJSONObject(next);
                    mapD.put(next, new h8(jSONObject2.getBoolean("isDisabled"), jSONObject2.getInt(str)));
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject;
                    str = str;
                }
                mapJ = cn.p0.c(mapD);
            } else {
                mapJ = null;
            }
            if (mapJ == null) {
                mapJ = kotlin.collections.a.j();
            }
            objM7534constructorimpl = Result.m7534constructorimpl(new f8(z10, z11, string, j10, i10, z12, set, mapJ));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            jSONObject.toString();
            boolean z13 = ad1.f87661a;
        }
        return (f8) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
    }
}
