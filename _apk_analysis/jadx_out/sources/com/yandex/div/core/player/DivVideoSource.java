package com.yandex.div.core.player;

import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DivVideoSource.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivVideoSource {

    @Nullable
    private final Long bitrate;

    @NotNull
    private final String mimeType;

    @Nullable
    private final DivVideoResolution resolution;

    @NotNull
    private final Uri url;

    public DivVideoSource(@NotNull Uri uri, @NotNull String str, @Nullable DivVideoResolution divVideoResolution, @Nullable Long l10) {
        this.url = uri;
        this.mimeType = str;
        this.resolution = divVideoResolution;
        this.bitrate = l10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivVideoSource)) {
            return false;
        }
        DivVideoSource divVideoSource = (DivVideoSource) obj;
        return p.f(this.url, divVideoSource.url) && p.f(this.mimeType, divVideoSource.mimeType) && p.f(this.resolution, divVideoSource.resolution) && p.f(this.bitrate, divVideoSource.bitrate);
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.mimeType.hashCode()) * 31;
        DivVideoResolution divVideoResolution = this.resolution;
        int iHashCode2 = (iHashCode + (divVideoResolution == null ? 0 : divVideoResolution.hashCode())) * 31;
        Long l10 = this.bitrate;
        return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DivVideoSource(url=" + this.url + ", mimeType=" + this.mimeType + ", resolution=" + this.resolution + ", bitrate=" + this.bitrate + ')';
    }
}
