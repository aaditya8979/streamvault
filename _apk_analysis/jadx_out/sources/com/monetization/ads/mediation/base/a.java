package com.monetization.ads.mediation.base;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    @NotNull
    public MediatedAdapterInfo getAdapterInfo() {
        return new MediatedAdapterInfo.Builder().build();
    }
}
