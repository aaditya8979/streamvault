package com.moloco.sdk.internal.publisher.nativead.parser;

import androidx.compose.runtime.internal.StabilityInferred;
import cn.w;
import com.moloco.sdk.internal.publisher.nativead.model.a;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class a {
    public final a.AbstractC0574a.C0575a a(JSONObject jSONObject, int i10, boolean z10) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Integer numValueOf = jSONObject.has("type") ? Integer.valueOf(jSONObject.getInt("type")) : null;
        Integer numValueOf2 = jSONObject.has("len") ? Integer.valueOf(jSONObject.getInt("len")) : null;
        String string = jSONObject.getString("value");
        p.j(string, "getString(...)");
        return new a.AbstractC0574a.C0575a(i10, z10, numValueOf, numValueOf2, string);
    }

    public final a.c b(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("url");
        String string2 = jSONObject.has("fallback") ? jSONObject.getString("fallback") : null;
        List<String> listH = h(jSONObject.optJSONArray("clicktrackers"));
        p.h(string);
        return new a.c(string, listH, string2);
    }

    @NotNull
    public final Object c(@NotNull String str) {
        p.k(str, "nativeOrtbString");
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("native");
            if (jSONObjectOptJSONObject != null) {
                jSONObject = jSONObjectOptJSONObject;
            }
            Result.a aVar = Result.Companion;
            return Result.m7534constructorimpl(new com.moloco.sdk.internal.publisher.nativead.model.a(jSONObject.has("ver") ? jSONObject.getString("ver") : null, d(jSONObject.optJSONArray("assets")), b(jSONObject.optJSONObject("link")), h(jSONObject.optJSONArray("imptrackers")), f(jSONObject.optJSONArray("eventtrackers")), jSONObject.has("privacy") ? jSONObject.getString("privacy") : null));
        } catch (Exception e10) {
            Result.a aVar2 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(e10));
        }
    }

    public final List<a.AbstractC0574a> d(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return w.m();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            if (jSONObject.has("id")) {
                int i11 = jSONObject.getInt("id");
                boolean z10 = jSONObject.optInt(VastAttributes.REQUIRED, 0) == 1;
                Object objG = g(jSONObject.optJSONObject("title"), i11, z10);
                if (objG == null && (objG = e(jSONObject.optJSONObject(ImpressionLog.f51750t), i11, z10)) == null && (objG = i(jSONObject.optJSONObject("video"), i11, z10)) == null) {
                    objG = a(jSONObject.optJSONObject("data"), i11, z10);
                }
                if (objG != null) {
                    arrayList.add(objG);
                }
            }
        }
        return arrayList;
    }

    public final a.AbstractC0574a.b e(JSONObject jSONObject, int i10, boolean z10) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Integer numValueOf = jSONObject.has("type") ? Integer.valueOf(jSONObject.getInt("type")) : null;
        String string = jSONObject.getString("url");
        p.j(string, "getString(...)");
        return new a.AbstractC0574a.b(i10, z10, numValueOf, string, jSONObject.has("w") ? Integer.valueOf(jSONObject.getInt("w")) : null, jSONObject.has("h") ? Integer.valueOf(jSONObject.getInt("h")) : null);
    }

    public final List<a.b> f(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return w.m();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            arrayList.add(new a.b(jSONObject.getInt("event"), jSONObject.getInt("method"), jSONObject.has("url") ? jSONObject.getString("url") : null));
        }
        return arrayList;
    }

    public final a.AbstractC0574a.c g(JSONObject jSONObject, int i10, boolean z10) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("text");
        p.j(string, "getString(...)");
        return new a.AbstractC0574a.c(i10, z10, string, jSONObject.has("len") ? Integer.valueOf(jSONObject.getInt("len")) : null);
    }

    public final List<String> h(JSONArray jSONArray) {
        if (jSONArray == null) {
            return w.m();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return arrayList;
    }

    public final a.AbstractC0574a.d i(JSONObject jSONObject, int i10, boolean z10) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("vasttag");
        p.j(string, "getString(...)");
        return new a.AbstractC0574a.d(i10, z10, string);
    }
}
