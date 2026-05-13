package com.ironsource;

import com.ironsource.C4194p3;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC4176o3<Smash extends C4194p3<?>> extends AbstractC4120l3<Smash, AdapterAdRewardListener> implements V0 {
    public AbstractC4176o3(V v10, C4201pa c4201pa, C4002ea c4002ea) {
        super(v10, c4201pa, c4002ea);
    }

    @Override // com.ironsource.V0
    public void a(C4194p3<?> c4194p3, C4041gd c4041gd) {
        IronLog.INTERNAL.verbose(b(c4194p3.k()));
        this.f33051t.b(c4041gd, c4194p3.f());
    }
}
