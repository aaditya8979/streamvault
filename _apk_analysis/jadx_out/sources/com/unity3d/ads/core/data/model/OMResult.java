package com.unity3d.ads.core.data.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: OMResult.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class OMResult {

    /* JADX INFO: compiled from: OMResult.kt */
    public static final class Failure extends OMResult {

        @NotNull
        private final String reason;

        @Nullable
        private final String reasonDebug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull String str, @Nullable String str2) {
            super(null);
            p.k(str, "reason");
            this.reason = str;
            this.reasonDebug = str2;
        }

        public /* synthetic */ Failure(String str, String str2, int i10, i iVar) {
            this(str, (i10 & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = failure.reason;
            }
            if ((i10 & 2) != 0) {
                str2 = failure.reasonDebug;
            }
            return failure.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.reason;
        }

        @Nullable
        public final String component2() {
            return this.reasonDebug;
        }

        @NotNull
        public final Failure copy(@NotNull String str, @Nullable String str2) {
            p.k(str, "reason");
            return new Failure(str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return p.f(this.reason, failure.reason) && p.f(this.reasonDebug, failure.reasonDebug);
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            String str = this.reasonDebug;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "Failure(reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }
    }

    /* JADX INFO: compiled from: OMResult.kt */
    public static final class Success extends OMResult {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    private OMResult() {
    }

    public /* synthetic */ OMResult(i iVar) {
        this();
    }
}
