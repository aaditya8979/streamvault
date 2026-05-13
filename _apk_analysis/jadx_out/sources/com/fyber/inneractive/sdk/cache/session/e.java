package com.fyber.inneractive.sdk.cache.session;

import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f15897a = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15899c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15900d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f15898b = new a();

    public static JSONObject a(e eVar) {
        eVar.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSession", eVar.f15897a.a());
            for (Map.Entry entry : eVar.f15898b.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                com.fyber.inneractive.sdk.cache.session.enums.c cVar = (com.fyber.inneractive.sdk.cache.session.enums.c) entry.getKey();
                Iterator it = ((PriorityQueue) entry.getValue()).iterator();
                while (it.hasNext()) {
                    jSONArray.put(((g) it.next()).a(true, true));
                }
                jSONObject.put(cVar.name(), jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final void a(com.fyber.inneractive.sdk.cache.session.enums.c cVar, g gVar) {
        synchronized (this.f15900d) {
            k kVar = (k) this.f15898b.get(cVar);
            if (kVar != null) {
                kVar.add(gVar);
            }
        }
    }
}
