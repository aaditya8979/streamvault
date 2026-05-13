package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class TrackersV2 {

    @Nullable
    private final String type;

    @NotNull
    private final List<String> url = new ArrayList();

    @NotNull
    private final List<String> imExts = new ArrayList();

    public static /* synthetic */ void getType$annotations() {
    }

    @NotNull
    public final List<String> getImExts() {
        return this.imExts;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final List<String> getUrl() {
        return this.url;
    }
}
