package com.ironsource;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4111kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, JSONObject> f32155a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4111kc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C4111kc(@NotNull ConcurrentHashMap<String, JSONObject> concurrentHashMap) {
        tn.p.k(concurrentHashMap, "networkDataMap");
        this.f32155a = concurrentHashMap;
    }

    public /* synthetic */ C4111kc(ConcurrentHashMap concurrentHashMap, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4111kc a(C4111kc c4111kc, ConcurrentHashMap concurrentHashMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            concurrentHashMap = c4111kc.f32155a;
        }
        return c4111kc.a((ConcurrentHashMap<String, JSONObject>) concurrentHashMap);
    }

    private final ConcurrentHashMap<String, JSONObject> a() {
        return this.f32155a;
    }

    @NotNull
    public final C4111kc a(@NotNull ConcurrentHashMap<String, JSONObject> concurrentHashMap) {
        tn.p.k(concurrentHashMap, "networkDataMap");
        return new C4111kc(concurrentHashMap);
    }

    public final void a(@NotNull AbstractAdapter abstractAdapter) {
        tn.p.k(abstractAdapter, Q6.G1);
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f32155a.entrySet();
        tn.p.j(setEntrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), abstractAdapter)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            Object key = entry.getKey();
            tn.p.j(key, "it.key");
            Object value = entry.getValue();
            tn.p.j(value, "it.value");
            abstractAdapter.setNetworkData(new com.ironsource.mediationsdk.x((String) key, (JSONObject) value));
        }
    }

    public final void a(@Nullable AdapterBaseWrapper adapterBaseWrapper) {
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f32155a.entrySet();
        tn.p.j(setEntrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null;
            tn.p.i(adapterBaseInterface, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface");
            Object key = entry.getKey();
            tn.p.j(key, "it.key");
            Object value = entry.getValue();
            tn.p.j(value, "it.value");
            ((AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new com.ironsource.mediationsdk.x((String) key, (JSONObject) value));
        }
    }

    public final void a(@NotNull com.ironsource.mediationsdk.x xVar) {
        tn.p.k(xVar, "networkData");
        if (!this.f32155a.containsKey(xVar.a())) {
            this.f32155a.put(xVar.a(), xVar.allData());
            return;
        }
        try {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.f32155a;
            String strA = xVar.a();
            JSONObject jSONObjectJsonObjectInit = this.f32155a.get(xVar.a());
            if (jSONObjectJsonObjectInit == null) {
                jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            }
            JSONObject jSONObjectA = IronSourceUtils.a(jSONObjectJsonObjectInit, xVar.allData());
            tn.p.j(jSONObjectA, "deepMergeJSONObjects(\n  …), networkData.allData())");
            concurrentHashMap.put(strA, jSONObjectA);
        } catch (Exception e10) {
            IronLog.INTERNAL.error("error while merging network data: " + e10.getMessage());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4111kc) && tn.p.f(this.f32155a, ((C4111kc) obj).f32155a);
    }

    public int hashCode() {
        return this.f32155a.hashCode();
    }

    @NotNull
    public String toString() {
        return "NetworkDataStore(networkDataMap=" + this.f32155a + ")";
    }
}
