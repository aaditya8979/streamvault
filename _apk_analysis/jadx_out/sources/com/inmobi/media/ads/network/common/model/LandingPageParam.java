package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public final class LandingPageParam {

    @Nullable
    private final InlineParams aParams;

    @NotNull
    private final String openMode = "DEFAULT";
    private final boolean supportLockScreen;

    public static /* synthetic */ void getOpenMode$annotations() {
    }

    @Nullable
    public final InlineParams getAParams() {
        return this.aParams;
    }

    @NotNull
    public final String getOpenMode() {
        return this.openMode;
    }

    public final boolean getSupportLockScreen() {
        return this.supportLockScreen;
    }
}
