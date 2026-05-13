package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class wo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f28471a = new ConcurrentHashMap();

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.f28471a.entrySet()) {
                jSONObject.put(String.valueOf(Ef.a((Df) entry.getKey())), ((vo) entry.getValue()).a());
            }
            return jSONObject;
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            P9.a(new L2(e10));
            return new JSONObject();
        }
    }
}
