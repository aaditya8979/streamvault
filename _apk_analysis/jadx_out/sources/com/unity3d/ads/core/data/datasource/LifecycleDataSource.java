package com.unity3d.ads.core.data.datasource;

import go.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LifecycleDataSource.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface LifecycleDataSource {
    boolean appIsForeground();

    @NotNull
    u<Boolean> getAppActive();
}
