package yads;

import java.util.Map;
import java.util.Objects;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class p33 {
    public static String a(Map map) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            xo.b0 b0Var = new xo.b0();
            for (Map.Entry entry : map.entrySet()) {
                xo.h.d(b0Var, (String) entry.getKey(), (String) entry.getValue());
            }
            objM7534constructorimpl = Result.m7534constructorimpl(b0Var.a().toString());
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
        return (String) objM7534constructorimpl;
    }

    public static Map a(String str) {
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
        return (Map) objM7534constructorimpl;
    }

    public static Map a(JSONObject jSONObject) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(ge1.a(jSONObject));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            Objects.toString(jSONObject);
            boolean z10 = ad1.f87661a;
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        return (Map) objM7534constructorimpl;
    }
}
