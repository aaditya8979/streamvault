package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: TrustedBiddingData.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TrustedBiddingData {

    @NotNull
    private final List<String> trustedBiddingKeys;

    @NotNull
    private final Uri trustedBiddingUri;

    public TrustedBiddingData(@NotNull Uri uri, @NotNull List<String> list) {
        p.k(uri, "trustedBiddingUri");
        p.k(list, "trustedBiddingKeys");
        this.trustedBiddingUri = uri;
        this.trustedBiddingKeys = list;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedBiddingData)) {
            return false;
        }
        TrustedBiddingData trustedBiddingData = (TrustedBiddingData) obj;
        return p.f(this.trustedBiddingUri, trustedBiddingData.trustedBiddingUri) && p.f(this.trustedBiddingKeys, trustedBiddingData.trustedBiddingKeys);
    }

    @NotNull
    public final List<String> getTrustedBiddingKeys() {
        return this.trustedBiddingKeys;
    }

    @NotNull
    public final Uri getTrustedBiddingUri() {
        return this.trustedBiddingUri;
    }

    public int hashCode() {
        return (this.trustedBiddingUri.hashCode() * 31) + this.trustedBiddingKeys.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.trustedBiddingUri + " trustedBiddingKeys=" + this.trustedBiddingKeys;
    }
}
