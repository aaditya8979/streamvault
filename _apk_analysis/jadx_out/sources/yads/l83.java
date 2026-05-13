package yads;

import java.util.List;
import kotlin.Result;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public final class l83 {
    public static List a(JSONArray jSONArray) {
        Object objM7534constructorimpl;
        List listC = cn.v.c();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Result.a aVar = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(jSONArray.getString(i10));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m7540isSuccessimpl(objM7534constructorimpl)) {
                listC.add((String) objM7534constructorimpl);
            }
        }
        return cn.v.a(listC);
    }
}
