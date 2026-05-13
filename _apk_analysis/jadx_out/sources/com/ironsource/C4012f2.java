package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4012f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC4309w0 f31654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f31655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<String> f31656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final StringBuilder f31657d;

    public C4012f2(@NotNull AbstractC4309w0 abstractC4309w0) {
        tn.p.k(abstractC4309w0, "adUnitData");
        this.f31654a = abstractC4309w0;
        this.f31655b = new HashMap();
        this.f31656c = new ArrayList();
        this.f31657d = new StringBuilder();
    }

    private final void a(String str, int i10, Map<String, ? extends Object> map) {
        this.f31655b.put(str, map);
        StringBuilder sb2 = this.f31657d;
        sb2.append(i10);
        sb2.append(str);
        sb2.append(StringUtils.COMMA);
    }

    @NotNull
    public final Map<String, Object> a() {
        return this.f31655b;
    }

    public final void a(@NotNull B3 b32) {
        tn.p.k(b32, "biddingResponse");
        String strC = b32.c();
        tn.p.j(strC, "biddingResponse.instanceName");
        int iD = b32.d();
        Map<String, Object> mapA = b32.a();
        tn.p.j(mapA, "biddingResponse.biddingData");
        a(strC, iD, mapA);
    }

    public final void a(@NotNull NetworkSettings networkSettings) {
        tn.p.k(networkSettings, "providerSettings");
        List<String> list = this.f31656c;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        tn.p.j(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        StringBuilder sb2 = this.f31657d;
        sb2.append(networkSettings.getInstanceType(this.f31654a.b().a()));
        sb2.append(networkSettings.getProviderInstanceName());
        sb2.append(StringUtils.COMMA);
    }

    public final void a(@NotNull NetworkSettings networkSettings, @NotNull Map<String, ? extends Object> map) {
        tn.p.k(networkSettings, "providerSettings");
        tn.p.k(map, "biddingData");
        String providerInstanceName = networkSettings.getProviderInstanceName();
        tn.p.j(providerInstanceName, "providerSettings.providerInstanceName");
        a(providerInstanceName, networkSettings.getInstanceType(this.f31654a.b().a()), map);
    }

    @NotNull
    public final List<String> b() {
        return this.f31656c;
    }

    @NotNull
    public final StringBuilder c() {
        return this.f31657d;
    }

    public final boolean d() {
        return (this.f31655b.isEmpty() && this.f31656c.isEmpty()) ? false : true;
    }
}
