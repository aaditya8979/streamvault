package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class V6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final X9 f30592a;

    public V6(@NotNull X9 x92) {
        tn.p.k(x92, "globalDataWriter");
        this.f30592a = x92;
    }

    public final void a(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "metaDataJson");
        if (jSONObject.has(com.ironsource.mediationsdk.metadata.a.f32684i)) {
            try {
                Object objRemove = jSONObject.remove(com.ironsource.mediationsdk.metadata.a.f32684i);
                tn.p.i(objRemove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) objRemove;
                if (arrayList.isEmpty()) {
                    return;
                }
                Object obj = arrayList.get(0);
                tn.p.i(obj, "null cannot be cast to non-null type kotlin.String");
                this.f30592a.e((String) obj);
            } catch (ClassCastException e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error("got the following error " + e10.getMessage());
            }
        }
    }
}
