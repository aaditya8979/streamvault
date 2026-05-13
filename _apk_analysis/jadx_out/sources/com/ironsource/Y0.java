package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f30682b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f30683c = "adUnits";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final JSONObject f30684a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public Y0(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "configurations");
        this.f30684a = jSONObject.optJSONObject("adUnits");
    }

    @NotNull
    public final <T> Map<String, T> a(@NotNull sn.l<? super JSONObject, ? extends T> lVar) throws JSONException {
        tn.p.k(lVar, "valueExtractor");
        JSONObject jSONObject = this.f30684a;
        if (jSONObject == null) {
            return kotlin.collections.a.j();
        }
        Iterator<String> itKeys = jSONObject.keys();
        tn.p.j(itKeys, "adUnits.keys()");
        ao.i iVarG = ao.r.g(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : iVarG) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) t10);
            tn.p.j(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(t10, lVar.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
