package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class NativeImage {

    @NotNull
    private final List<Image> assets = new ArrayList();
    private final boolean required;

    @NotNull
    public final List<Image> getAssets() {
        return this.assets;
    }

    public final boolean getRequired() {
        return this.required;
    }
}
