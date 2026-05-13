package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdData;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import com.mbridge.msdk.foundation.entity.b;
import java.time.Instant;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: CustomAudience.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class CustomAudience {

    @Nullable
    private final Instant activationTime;

    @NotNull
    private final List<AdData> ads;

    @NotNull
    private final Uri biddingLogicUri;

    @NotNull
    private final AdTechIdentifier buyer;

    @NotNull
    private final Uri dailyUpdateUri;

    @Nullable
    private final Instant expirationTime;

    @NotNull
    private final String name;

    @Nullable
    private final TrustedBiddingData trustedBiddingSignals;

    @Nullable
    private final AdSelectionSignals userBiddingSignals;

    /* JADX INFO: compiled from: CustomAudience.kt */
    public static final class Builder {

        @Nullable
        private Instant activationTime;

        @NotNull
        private List<AdData> ads;

        @NotNull
        private Uri biddingLogicUri;

        @NotNull
        private AdTechIdentifier buyer;

        @NotNull
        private Uri dailyUpdateUri;

        @Nullable
        private Instant expirationTime;

        @NotNull
        private String name;

        @Nullable
        private TrustedBiddingData trustedBiddingData;

        @Nullable
        private AdSelectionSignals userBiddingSignals;

        public Builder(@NotNull AdTechIdentifier adTechIdentifier, @NotNull String str, @NotNull Uri uri, @NotNull Uri uri2, @NotNull List<AdData> list) {
            p.k(adTechIdentifier, "buyer");
            p.k(str, "name");
            p.k(uri, "dailyUpdateUri");
            p.k(uri2, "biddingLogicUri");
            p.k(list, b.JSON_KEY_ADS);
            this.buyer = adTechIdentifier;
            this.name = str;
            this.dailyUpdateUri = uri;
            this.biddingLogicUri = uri2;
            this.ads = list;
        }

        @NotNull
        public final CustomAudience build() {
            return new CustomAudience(this.buyer, this.name, this.dailyUpdateUri, this.biddingLogicUri, this.ads, this.activationTime, this.expirationTime, this.userBiddingSignals, this.trustedBiddingData);
        }

        @NotNull
        public final Builder setActivationTime(@NotNull Instant instant) {
            p.k(instant, "activationTime");
            this.activationTime = instant;
            return this;
        }

        @NotNull
        public final Builder setAds(@NotNull List<AdData> list) {
            p.k(list, b.JSON_KEY_ADS);
            this.ads = list;
            return this;
        }

        @NotNull
        public final Builder setBiddingLogicUri(@NotNull Uri uri) {
            p.k(uri, "biddingLogicUri");
            this.biddingLogicUri = uri;
            return this;
        }

        @NotNull
        public final Builder setBuyer(@NotNull AdTechIdentifier adTechIdentifier) {
            p.k(adTechIdentifier, "buyer");
            this.buyer = adTechIdentifier;
            return this;
        }

        @NotNull
        public final Builder setDailyUpdateUri(@NotNull Uri uri) {
            p.k(uri, "dailyUpdateUri");
            this.dailyUpdateUri = uri;
            return this;
        }

        @NotNull
        public final Builder setExpirationTime(@NotNull Instant instant) {
            p.k(instant, "expirationTime");
            this.expirationTime = instant;
            return this;
        }

        @NotNull
        public final Builder setName(@NotNull String str) {
            p.k(str, "name");
            this.name = str;
            return this;
        }

        @NotNull
        public final Builder setTrustedBiddingData(@NotNull TrustedBiddingData trustedBiddingData) {
            p.k(trustedBiddingData, "trustedBiddingSignals");
            this.trustedBiddingData = trustedBiddingData;
            return this;
        }

        @NotNull
        public final Builder setUserBiddingSignals(@NotNull AdSelectionSignals adSelectionSignals) {
            p.k(adSelectionSignals, "userBiddingSignals");
            this.userBiddingSignals = adSelectionSignals;
            return this;
        }
    }

    public CustomAudience(@NotNull AdTechIdentifier adTechIdentifier, @NotNull String str, @NotNull Uri uri, @NotNull Uri uri2, @NotNull List<AdData> list, @Nullable Instant instant, @Nullable Instant instant2, @Nullable AdSelectionSignals adSelectionSignals, @Nullable TrustedBiddingData trustedBiddingData) {
        p.k(adTechIdentifier, "buyer");
        p.k(str, "name");
        p.k(uri, "dailyUpdateUri");
        p.k(uri2, "biddingLogicUri");
        p.k(list, b.JSON_KEY_ADS);
        this.buyer = adTechIdentifier;
        this.name = str;
        this.dailyUpdateUri = uri;
        this.biddingLogicUri = uri2;
        this.ads = list;
        this.activationTime = instant;
        this.expirationTime = instant2;
        this.userBiddingSignals = adSelectionSignals;
        this.trustedBiddingSignals = trustedBiddingData;
    }

    public /* synthetic */ CustomAudience(AdTechIdentifier adTechIdentifier, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, AdSelectionSignals adSelectionSignals, TrustedBiddingData trustedBiddingData, int i10, i iVar) {
        this(adTechIdentifier, str, uri, uri2, list, (i10 & 32) != 0 ? null : instant, (i10 & 64) != 0 ? null : instant2, (i10 & 128) != 0 ? null : adSelectionSignals, (i10 & 256) != 0 ? null : trustedBiddingData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAudience)) {
            return false;
        }
        CustomAudience customAudience = (CustomAudience) obj;
        return p.f(this.buyer, customAudience.buyer) && p.f(this.name, customAudience.name) && p.f(this.activationTime, customAudience.activationTime) && p.f(this.expirationTime, customAudience.expirationTime) && p.f(this.dailyUpdateUri, customAudience.dailyUpdateUri) && p.f(this.userBiddingSignals, customAudience.userBiddingSignals) && p.f(this.trustedBiddingSignals, customAudience.trustedBiddingSignals) && p.f(this.ads, customAudience.ads);
    }

    @Nullable
    public final Instant getActivationTime() {
        return this.activationTime;
    }

    @NotNull
    public final List<AdData> getAds() {
        return this.ads;
    }

    @NotNull
    public final Uri getBiddingLogicUri() {
        return this.biddingLogicUri;
    }

    @NotNull
    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    @NotNull
    public final Uri getDailyUpdateUri() {
        return this.dailyUpdateUri;
    }

    @Nullable
    public final Instant getExpirationTime() {
        return this.expirationTime;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final TrustedBiddingData getTrustedBiddingSignals() {
        return this.trustedBiddingSignals;
    }

    @Nullable
    public final AdSelectionSignals getUserBiddingSignals() {
        return this.userBiddingSignals;
    }

    public int hashCode() {
        int iHashCode = ((this.buyer.hashCode() * 31) + this.name.hashCode()) * 31;
        Instant instant = this.activationTime;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.expirationTime;
        int iHashCode3 = (((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.dailyUpdateUri.hashCode()) * 31;
        AdSelectionSignals adSelectionSignals = this.userBiddingSignals;
        int iHashCode4 = (iHashCode3 + (adSelectionSignals != null ? adSelectionSignals.hashCode() : 0)) * 31;
        TrustedBiddingData trustedBiddingData = this.trustedBiddingSignals;
        return ((((iHashCode4 + (trustedBiddingData != null ? trustedBiddingData.hashCode() : 0)) * 31) + this.biddingLogicUri.hashCode()) * 31) + this.ads.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomAudience: buyer=" + this.biddingLogicUri + ", activationTime=" + this.activationTime + ", expirationTime=" + this.expirationTime + ", dailyUpdateUri=" + this.dailyUpdateUri + ", userBiddingSignals=" + this.userBiddingSignals + ", trustedBiddingSignals=" + this.trustedBiddingSignals + ", biddingLogicUri=" + this.biddingLogicUri + ", ads=" + this.ads;
    }
}
