package com.monetization.ads.mediation.base.initialize;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
public interface MediatedAdapterInitializationResult {

    public static final class Failure implements MediatedAdapterInitializationResult {
        private final int errorCode;

        @NotNull
        private final String errorMessage;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.errorCode == failure.errorCode && p.f(this.errorMessage, failure.errorMessage);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode() + (Integer.hashCode(this.errorCode) * 31);
        }

        @NotNull
        public String toString() {
            return "Failure(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ")";
        }
    }
}
