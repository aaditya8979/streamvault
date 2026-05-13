package io.appmetrica.analytics.identifiers.impl;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f64846a;

    public /* synthetic */ d() {
        this(kotlin.collections.a.m(bn.h.a(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, new h()), bn.h.a("huawei", new j()), bn.h.a("yandex", new q())));
    }

    public d(Map map) {
        this.f64846a = map;
    }
}
