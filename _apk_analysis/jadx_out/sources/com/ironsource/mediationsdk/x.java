package com.ironsource.mediationsdk;

import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.J9;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements AdapterNetworkData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f32912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final JSONObject f32913b;

    public x(@NotNull String str, @NotNull JSONObject jSONObject) {
        tn.p.k(str, "networkName");
        tn.p.k(jSONObject, "data");
        this.f32912a = str;
        this.f32913b = IronSourceVideoBridge.jsonObjectInit(jSONObject.toString());
    }

    private final void a(Collection<? extends AbstractAdapter> collection) {
        List listQ0 = cn.f0.q0(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ0) {
            if (c.a(this.f32912a, (AbstractAdapter) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractAdapter) it.next()).setNetworkData(this);
        }
    }

    private final void b(Collection<? extends AdapterBaseWrapper> collection) {
        List listQ0 = cn.f0.q0(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ0) {
            if (c.a(this.f32912a, (AdapterBaseWrapper) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(cn.x.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AdapterBaseWrapper) it.next()).getAdapterBaseInterface());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof AdapterNetworkDataInterface) {
                arrayList3.add(obj2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((AdapterNetworkDataInterface) it2.next()).setNetworkData(this);
        }
    }

    @NotNull
    public final String a() {
        return this.f32912a;
    }

    public final void a(@NotNull Collection<? extends AbstractAdapter> collection, @NotNull Collection<? extends AdapterBaseWrapper> collection2) {
        tn.p.k(collection, "adapters");
        tn.p.k(collection2, "networkAdapters");
        try {
            a(collection);
            b(collection2);
        } catch (Exception e10) {
            IronLog.INTERNAL.error("error while setting network data: " + e10.getMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @NotNull
    public JSONObject allData() {
        return this.f32913b;
    }

    public final void b() throws JSONException {
        Iterator<String> itKeys = this.f32913b.keys();
        tn.p.j(itKeys, "networkData.keys()");
        String strD0 = cn.f0.D0(SequencesKt___SequencesKt.U(ao.r.g(itKeys)), StringUtils.COMMA, null, null, 0, null, null, 62, null);
        J9.i().a(new C5(D5.SET_NETWORK_DATA, IronSourceUtils.b(false).put(IronSourceConstants.EVENTS_EXT1, this.f32912a + " - " + strD0)));
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @Nullable
    public <T> T dataByKeyIgnoreCase(@NotNull String str, @NotNull Class<T> cls) {
        T next;
        tn.p.k(str, "desiredKey");
        tn.p.k(cls, "valueType");
        Iterator<String> itKeys = allData().keys();
        tn.p.j(itKeys, "allData()\n          .keys()");
        Iterator<T> it = ao.r.g(itKeys).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
            if (bo.a0.J((String) next, str, true)) {
                break;
            }
        }
        String str2 = next;
        if (str2 == null) {
            return null;
        }
        Object objOpt = allData().opt(str2);
        if (!cls.isInstance(objOpt)) {
            objOpt = null;
        }
        if (objOpt != null) {
            return cls.cast(objOpt);
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @NotNull
    public JSONObject networkDataByAdUnit(@NotNull IronSource.a aVar) {
        tn.p.k(aVar, "adUnit");
        JSONObject jSONObjectOptJSONObject = this.f32913b.optJSONObject(aVar.toString());
        return jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject;
    }

    @NotNull
    public String toString() {
        return "NetworkData(networkName=" + this.f32912a + ", networkData=" + this.f32913b + ")";
    }
}
