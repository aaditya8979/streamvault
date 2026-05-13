package yads;

import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xw0 {
    public static vw0 a(JSONObject jSONObject) {
        Object objM7534constructorimpl;
        xo.a aVarB = xo.u.b(null, ww0.f96545b, 1, null);
        try {
            Result.a aVar = Result.Companion;
            String string = jSONObject.toString();
            aVarB.a();
            objM7534constructorimpl = Result.m7534constructorimpl((vw0) aVarB.c(vw0.Companion.serializer(), string));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        return (vw0) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
    }
}
