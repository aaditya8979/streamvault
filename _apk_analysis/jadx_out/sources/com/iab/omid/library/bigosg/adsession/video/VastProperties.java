package com.iab.omid.library.bigosg.adsession.video;

import com.iab.omid.library.bigosg.d.e;

/* JADX INFO: loaded from: classes10.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f24024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f24026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bigosg.adsession.media.VastProperties f24027e;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position, com.iab.omid.library.bigosg.adsession.media.VastProperties vastProperties) {
        this.f24023a = z10;
        this.f24024b = f10;
        this.f24025c = z11;
        this.f24026d = position;
        this.f24027e = vastProperties;
    }

    public static VastProperties createVastPropertiesForNonSkippableVideo(boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z10, position, com.iab.omid.library.bigosg.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(z10, com.iab.omid.library.bigosg.adsession.media.Position.valueOf(position.toString().toUpperCase())));
    }

    public static VastProperties createVastPropertiesForSkippableVideo(float f10, boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position, com.iab.omid.library.bigosg.adsession.media.VastProperties.createVastPropertiesForSkippableMedia(f10, z10, com.iab.omid.library.bigosg.adsession.media.Position.valueOf(position.toString().toUpperCase())));
    }

    public final com.iab.omid.library.bigosg.adsession.media.VastProperties a() {
        return this.f24027e;
    }

    public final Position getPosition() {
        return this.f24026d;
    }

    public final Float getSkipOffset() {
        return this.f24024b;
    }

    public final boolean isAutoPlay() {
        return this.f24025c;
    }

    public final boolean isSkippable() {
        return this.f24023a;
    }
}
