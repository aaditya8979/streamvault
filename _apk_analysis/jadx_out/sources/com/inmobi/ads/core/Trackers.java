package com.inmobi.ads.core;

import androidx.annotation.Keep;
import cn.w;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public final class Trackers {

    @NotNull
    private final String type = "";

    @NotNull
    private final List<String> imExts = w.m();

    @NotNull
    private final List<String> url = w.m();

    @NotNull
    public final List<String> getImExts() {
        return this.imExts;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final List<String> getUrl() {
        return this.url;
    }
}
