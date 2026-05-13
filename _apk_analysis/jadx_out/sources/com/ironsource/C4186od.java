package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4186od {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f33154b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f33155c = "placements";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f33156d = "placementName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final JSONArray f33157a;

    /* JADX INFO: renamed from: com.ironsource.od$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public C4186od(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, com.safedk.android.utils.i.f53156c);
        this.f33157a = jSONObject.optJSONArray("placements");
    }

    @NotNull
    public final <T> Map<String, T> a(@NotNull sn.l<? super JSONObject, ? extends T> lVar) throws JSONException {
        tn.p.k(lVar, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f33157a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String strOptString = jSONObject.optString("placementName");
                tn.p.j(jSONObject, "jsonObject");
                T tInvoke = lVar.invoke(jSONObject);
                tn.p.j(strOptString, "key");
                linkedHashMap.put(strOptString, tInvoke);
            }
        }
        return linkedHashMap;
    }
}
