package io.appmetrica.analytics.billingv6.impl;

import bn.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends Lambda implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f64570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f64571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f64572c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f64570a = linkedHashMap;
        this.f64571b = map;
        this.f64572c = iVar;
    }

    @Override // sn.a
    public final Object invoke() {
        Map map = this.f64570a;
        Map map2 = this.f64571b;
        i iVar = this.f64572c;
        m.a(map, map2, iVar.f64576d, iVar.f64575c.getBillingInfoManager());
        return r.f5635a;
    }
}
