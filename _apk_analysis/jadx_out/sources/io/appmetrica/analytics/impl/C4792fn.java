package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4792fn extends Lambda implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4818gn f66799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4792fn(C4818gn c4818gn) {
        super(0);
        this.f66799a = c4818gn;
    }

    @Override // sn.a
    public final Object invoke() {
        HashMap map = new HashMap();
        C4818gn c4818gn = this.f66799a;
        String strA = c4818gn.f66872a.a();
        if (strA != null) {
        }
        String strA2 = c4818gn.f66873b.a();
        if (strA2 != null) {
            map.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, strA2);
        }
        return map;
    }
}
