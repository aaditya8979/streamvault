package com.unity3d.ads.core.data.model;

import com.unity3d.ads.adplayer.model.ShowStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ShowEvent.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class ShowEvent {

    /* JADX INFO: compiled from: ShowEvent.kt */
    public static final class CancelTimeout extends ShowEvent {

        @NotNull
        public static final CancelTimeout INSTANCE = new CancelTimeout();

        private CancelTimeout() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ShowEvent.kt */
    public static final class Clicked extends ShowEvent {

        @NotNull
        public static final Clicked INSTANCE = new Clicked();

        private Clicked() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ShowEvent.kt */
    public static final class Completed extends ShowEvent {

        @Nullable
        private final String reason;

        @Nullable
        private final String reasonDebug;

        @NotNull
        private final ShowStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(@NotNull ShowStatus showStatus, @Nullable String str, @Nullable String str2) {
            super(null);
            p.k(showStatus, "status");
            this.status = showStatus;
            this.reason = str;
            this.reasonDebug = str2;
        }

        public /* synthetic */ Completed(ShowStatus showStatus, String str, String str2, int i10, i iVar) {
            this(showStatus, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
        }

        public static /* synthetic */ Completed copy$default(Completed completed, ShowStatus showStatus, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                showStatus = completed.status;
            }
            if ((i10 & 2) != 0) {
                str = completed.reason;
            }
            if ((i10 & 4) != 0) {
                str2 = completed.reasonDebug;
            }
            return completed.copy(showStatus, str, str2);
        }

        @NotNull
        public final ShowStatus component1() {
            return this.status;
        }

        @Nullable
        public final String component2() {
            return this.reason;
        }

        @Nullable
        public final String component3() {
            return this.reasonDebug;
        }

        @NotNull
        public final Completed copy(@NotNull ShowStatus showStatus, @Nullable String str, @Nullable String str2) {
            p.k(showStatus, "status");
            return new Completed(showStatus, str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) obj;
            return this.status == completed.status && p.f(this.reason, completed.reason) && p.f(this.reasonDebug, completed.reasonDebug);
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        @NotNull
        public final ShowStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.status.hashCode() * 31;
            String str = this.reason;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.reasonDebug;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Completed(status=" + this.status + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }
    }

    /* JADX INFO: compiled from: ShowEvent.kt */
    public static final class Error extends ShowEvent {
        private final int errorCode;

        @NotNull
        private final String message;

        @NotNull
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String str, int i10, @NotNull String str2) {
            super(null);
            p.k(str, "message");
            p.k(str2, "reason");
            this.message = str;
            this.errorCode = i10;
            this.reason = str2;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.message;
            }
            if ((i11 & 2) != 0) {
                i10 = error.errorCode;
            }
            if ((i11 & 4) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, i10, str2);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        @NotNull
        public final String component3() {
            return this.reason;
        }

        @NotNull
        public final Error copy(@NotNull String str, int i10, @NotNull String str2) {
            p.k(str, "message");
            p.k(str2, "reason");
            return new Error(str, i10, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return p.f(this.message, error.message) && this.errorCode == error.errorCode && p.f(this.reason, error.reason);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + Integer.hashCode(this.errorCode)) * 31) + this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ", reason=" + this.reason + ')';
        }
    }

    /* JADX INFO: compiled from: ShowEvent.kt */
    public static final class LeftApplication extends ShowEvent {

        @NotNull
        public static final LeftApplication INSTANCE = new LeftApplication();

        private LeftApplication() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ShowEvent.kt */
    public static final class Started extends ShowEvent {

        @NotNull
        public static final Started INSTANCE = new Started();

        private Started() {
            super(null);
        }
    }

    private ShowEvent() {
    }

    public /* synthetic */ ShowEvent(i iVar) {
        this();
    }
}
