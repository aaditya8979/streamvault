package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface InitListener {
    void onInitFailed(@NotNull IronSourceError ironSourceError);

    void onInitSuccess();
}
