package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class MetaInfo {

    @NotNull
    private String creativeType = "unknown";
    private final boolean iasEnabled;

    @Nullable
    private final List<LandingPageParam> landingPageParams;

    @Nullable
    private final OmSdkInfo omsdkInfo;

    public static /* synthetic */ void getCreativeType$annotations() {
    }

    @NotNull
    public final String getCreativeType() {
        return this.creativeType;
    }

    public final boolean getIasEnabled() {
        return this.iasEnabled;
    }

    @Nullable
    public final List<LandingPageParam> getLandingPageParams() {
        return this.landingPageParams;
    }

    @Nullable
    public final OmSdkInfo getOmsdkInfo() {
        return this.omsdkInfo;
    }
}
