package androidx.privacysandbox.ads.adservices.common;

import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AdData.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AdData {

    @NotNull
    private final String metadata;

    @NotNull
    private final Uri renderUri;

    public AdData(@NotNull Uri uri, @NotNull String str) {
        p.k(uri, "renderUri");
        p.k(str, "metadata");
        this.renderUri = uri;
        this.metadata = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdData)) {
            return false;
        }
        AdData adData = (AdData) obj;
        return p.f(this.renderUri, adData.renderUri) && p.f(this.metadata, adData.metadata);
    }

    @NotNull
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public int hashCode() {
        return (this.renderUri.hashCode() * 31) + this.metadata.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdData: renderUri=" + this.renderUri + ", metadata='" + this.metadata + '\'';
    }
}
