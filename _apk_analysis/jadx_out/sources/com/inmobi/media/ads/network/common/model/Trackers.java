package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class Trackers {

    @Nullable
    private final String type;

    @NotNull
    private final List<String> url = new ArrayList();

    public static /* synthetic */ void getType$annotations() {
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
