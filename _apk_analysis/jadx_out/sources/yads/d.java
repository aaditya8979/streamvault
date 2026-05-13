package yads;

import com.ironsource.C4306ve;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static LinkedHashSet a(JSONArray jSONArray) {
        Object objM7534constructorimpl;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Result.a aVar = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(Boolean.valueOf(linkedHashSet.add(Long.valueOf(jSONArray.getLong(i10)))));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
                Objects.toString(bn.h.a(jSONArray.get(i10), tn.r.f85361a));
                boolean z10 = ad1.f87661a;
            }
        }
        return linkedHashSet;
    }

    public static c a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString(C4306ve.f34270d), a(jSONObject.getJSONArray("test_ids")));
        } catch (Throwable unused) {
            boolean z10 = ad1.f87661a;
            return null;
        }
    }
}
