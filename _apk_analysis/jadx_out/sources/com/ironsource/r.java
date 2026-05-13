package com.ironsource;

import com.ironsource.InterfaceC4124l7;
import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements InterfaceC4124l7, InterfaceC4124l7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<IronSource.a, AtomicBoolean> f33378a = kotlin.collections.a.m(bn.h.a(IronSource.a.REWARDED_VIDEO, new AtomicBoolean(false)), bn.h.a(IronSource.a.INTERSTITIAL, new AtomicBoolean(false)), bn.h.a(IronSource.a.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC4124l7.a
    public void a(@NotNull IronSource.a aVar, boolean z10) {
        tn.p.k(aVar, "adFormat");
        AtomicBoolean atomicBoolean = this.f33378a.get(aVar);
        if (atomicBoolean != null) {
            atomicBoolean.set(z10);
        }
    }

    @Override // com.ironsource.InterfaceC4124l7
    public boolean a(@NotNull IronSource.a aVar) {
        tn.p.k(aVar, "adFormat");
        AtomicBoolean atomicBoolean = this.f33378a.get(aVar);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
