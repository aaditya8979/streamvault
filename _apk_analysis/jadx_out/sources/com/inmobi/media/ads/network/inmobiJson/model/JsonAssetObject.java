package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public final class JsonAssetObject {

    @Nullable
    private final Image adChoice;

    @Nullable
    private final AppMetrics appMetrics;

    @Nullable
    private final CTA cta;

    @Nullable
    private final Description description;

    @Nullable
    private final Icon icon;

    @Nullable
    private final NativeMedia media;

    @Nullable
    private final Sponsored sponsored;

    @Nullable
    private final Title title;

    @Nullable
    public final Image getAdChoice() {
        return this.adChoice;
    }

    @Nullable
    public final AppMetrics getAppMetrics() {
        return this.appMetrics;
    }

    @Nullable
    public final CTA getCta() {
        return this.cta;
    }

    @Nullable
    public final Description getDescription() {
        return this.description;
    }

    @Nullable
    public final Icon getIcon() {
        return this.icon;
    }

    @Nullable
    public final NativeMedia getMedia() {
        return this.media;
    }

    @Nullable
    public final Sponsored getSponsored() {
        return this.sponsored;
    }

    @Nullable
    public final Title getTitle() {
        return this.title;
    }
}
