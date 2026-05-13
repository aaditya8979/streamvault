package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4322wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, a> f34345a;

    /* JADX INFO: renamed from: com.ironsource.wd$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<String, b> f34346a;

        public a(@NotNull JSONObject jSONObject) throws JSONException {
            tn.p.k(jSONObject, "adFormatProviderOrder");
            List<String> listB = C4127la.b(jSONObject.names());
            listB = listB == null ? cn.w.m() : listB;
            LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(listB, 10)), 16));
            for (Object obj : listB) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray((String) obj);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                } else {
                    tn.p.j(jSONArrayOptJSONArray, "adFormatProviderOrder.op…(adUnitId) ?: JSONArray()");
                }
                linkedHashMap.put(obj, new b(jSONArrayOptJSONArray));
            }
            this.f34346a = linkedHashMap;
        }

        @NotNull
        public final Map<String, b> a() {
            return this.f34346a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<String> f34347a;

        public b(@NotNull JSONArray jSONArray) throws JSONException {
            tn.p.k(jSONArray, "providerOrder");
            List<String> listB = C4127la.b(jSONArray);
            tn.p.j(listB, "jsonArrayToStringList(providerOrder)");
            this.f34347a = listB;
        }

        @NotNull
        public final List<String> a() {
            return this.f34347a;
        }
    }

    public C4322wd(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "providerOrder");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(adFormatArrValues.length), 16));
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C4324wf.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = IronSourceVideoBridge.jsonObjectInit();
            } else {
                tn.p.j(jSONObjectOptJSONObject, "providerOrder.optJSONObj…dFormat)) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new a(jSONObjectOptJSONObject));
        }
        this.f34345a = linkedHashMap;
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, a> a() {
        return this.f34345a;
    }
}
