package com.monetization.ads.quality.base.result;

import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public interface AdQualityVerificationResult {

    public static final class NotVerified implements AdQualityVerificationResult {
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotVerified)) {
                return false;
            }
            ((NotVerified) obj).getClass();
            return p.f(null, null);
        }

        @NotNull
        public final AdQualityVerificationError getReason() {
            return null;
        }

        public int hashCode() {
            throw null;
        }

        @NotNull
        public String toString() {
            return "NotVerified(reason=" + ((Object) null) + ")";
        }
    }

    public static final class Verified implements AdQualityVerificationResult {

        @NotNull
        private final AdQualityVerificationStateFlow verifiedAd;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verified) && p.f(this.verifiedAd, ((Verified) obj).verifiedAd);
        }

        @NotNull
        public final AdQualityVerificationStateFlow getVerifiedAd() {
            return this.verifiedAd;
        }

        public int hashCode() {
            return this.verifiedAd.hashCode();
        }

        @NotNull
        public String toString() {
            return "Verified(verifiedAd=" + this.verifiedAd + ")";
        }
    }

    public static final class WaitingForVerification implements AdQualityVerificationResult {

        @NotNull
        public static final WaitingForVerification INSTANCE = new WaitingForVerification();

        private WaitingForVerification() {
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WaitingForVerification)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 393213194;
        }

        @NotNull
        public String toString() {
            return "WaitingForVerification";
        }
    }
}
