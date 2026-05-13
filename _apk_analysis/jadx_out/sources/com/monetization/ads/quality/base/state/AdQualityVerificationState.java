package com.monetization.ads.quality.base.state;

import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
public interface AdQualityVerificationState {

    public static final class Blocked implements AdQualityVerificationState {
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Blocked)) {
                return false;
            }
            ((Blocked) obj).getClass();
            return p.f(null, null);
        }

        @NotNull
        public final AdQualityVerificationBlockingReasons getReason() {
            return null;
        }

        public int hashCode() {
            throw null;
        }

        @NotNull
        public String toString() {
            return "Blocked(reason=" + ((Object) null) + ")";
        }
    }

    public static final class Error implements AdQualityVerificationState {
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            ((Error) obj).getClass();
            return p.f(null, null);
        }

        @NotNull
        public final AdQualityVerificationError getError() {
            return null;
        }

        public int hashCode() {
            throw null;
        }

        @NotNull
        public String toString() {
            return "Error(error=" + ((Object) null) + ")";
        }
    }

    public static final class ShouldBeBlockedOnDisplay implements AdQualityVerificationState {
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShouldBeBlockedOnDisplay)) {
                return false;
            }
            ((ShouldBeBlockedOnDisplay) obj).getClass();
            return p.f(null, null);
        }

        @NotNull
        public final AdQualityVerificationBlockingReasons getReason() {
            return null;
        }

        public int hashCode() {
            throw null;
        }

        @NotNull
        public String toString() {
            return "ShouldBeBlockedOnDisplay(reason=" + ((Object) null) + ")";
        }
    }
}
