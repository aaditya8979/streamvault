package io.appmetrica.analytics.billingv8.impl;

import bn.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends Lambda implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f64623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f64624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f64625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f64623a = linkedHashMap;
        this.f64624b = map;
        this.f64625c = iVar;
    }

    @Override // sn.a
    public final Object invoke() {
        Map map = this.f64623a;
        Map map2 = this.f64624b;
        i iVar = this.f64625c;
        m.a(map, map2, iVar.f64629d, iVar.f64628c.getBillingInfoManager());
        return r.f5635a;
    }
}
