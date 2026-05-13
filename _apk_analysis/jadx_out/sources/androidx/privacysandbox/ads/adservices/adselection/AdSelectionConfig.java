package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AdSelectionConfig.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AdSelectionConfig {

    @NotNull
    private final AdSelectionSignals adSelectionSignals;

    @NotNull
    private final List<AdTechIdentifier> customAudienceBuyers;

    @NotNull
    private final Uri decisionLogicUri;

    @NotNull
    private final Map<AdTechIdentifier, AdSelectionSignals> perBuyerSignals;

    @NotNull
    private final AdTechIdentifier seller;

    @NotNull
    private final AdSelectionSignals sellerSignals;

    @NotNull
    private final Uri trustedScoringSignalsUri;

    public AdSelectionConfig(@NotNull AdTechIdentifier adTechIdentifier, @NotNull Uri uri, @NotNull List<AdTechIdentifier> list, @NotNull AdSelectionSignals adSelectionSignals, @NotNull AdSelectionSignals adSelectionSignals2, @NotNull Map<AdTechIdentifier, AdSelectionSignals> map, @NotNull Uri uri2) {
        p.k(adTechIdentifier, "seller");
        p.k(uri, "decisionLogicUri");
        p.k(list, "customAudienceBuyers");
        p.k(adSelectionSignals, "adSelectionSignals");
        p.k(adSelectionSignals2, "sellerSignals");
        p.k(map, "perBuyerSignals");
        p.k(uri2, "trustedScoringSignalsUri");
        this.seller = adTechIdentifier;
        this.decisionLogicUri = uri;
        this.customAudienceBuyers = list;
        this.adSelectionSignals = adSelectionSignals;
        this.sellerSignals = adSelectionSignals2;
        this.perBuyerSignals = map;
        this.trustedScoringSignalsUri = uri2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionConfig)) {
            return false;
        }
        AdSelectionConfig adSelectionConfig = (AdSelectionConfig) obj;
        return p.f(this.seller, adSelectionConfig.seller) && p.f(this.decisionLogicUri, adSelectionConfig.decisionLogicUri) && p.f(this.customAudienceBuyers, adSelectionConfig.customAudienceBuyers) && p.f(this.adSelectionSignals, adSelectionConfig.adSelectionSignals) && p.f(this.sellerSignals, adSelectionConfig.sellerSignals) && p.f(this.perBuyerSignals, adSelectionConfig.perBuyerSignals) && p.f(this.trustedScoringSignalsUri, adSelectionConfig.trustedScoringSignalsUri);
    }

    @NotNull
    public final AdSelectionSignals getAdSelectionSignals() {
        return this.adSelectionSignals;
    }

    @NotNull
    public final List<AdTechIdentifier> getCustomAudienceBuyers() {
        return this.customAudienceBuyers;
    }

    @NotNull
    public final Uri getDecisionLogicUri() {
        return this.decisionLogicUri;
    }

    @NotNull
    public final Map<AdTechIdentifier, AdSelectionSignals> getPerBuyerSignals() {
        return this.perBuyerSignals;
    }

    @NotNull
    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    @NotNull
    public final AdSelectionSignals getSellerSignals() {
        return this.sellerSignals;
    }

    @NotNull
    public final Uri getTrustedScoringSignalsUri() {
        return this.trustedScoringSignalsUri;
    }

    public int hashCode() {
        return (((((((((((this.seller.hashCode() * 31) + this.decisionLogicUri.hashCode()) * 31) + this.customAudienceBuyers.hashCode()) * 31) + this.adSelectionSignals.hashCode()) * 31) + this.sellerSignals.hashCode()) * 31) + this.perBuyerSignals.hashCode()) * 31) + this.trustedScoringSignalsUri.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdSelectionConfig: seller=" + this.seller + ", decisionLogicUri='" + this.decisionLogicUri + "', customAudienceBuyers=" + this.customAudienceBuyers + ", adSelectionSignals=" + this.adSelectionSignals + ", sellerSignals=" + this.sellerSignals + ", perBuyerSignals=" + this.perBuyerSignals + ", trustedScoringSignalsUri=" + this.trustedScoringSignalsUri;
    }
}
