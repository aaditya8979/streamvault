package com.moloco.sdk.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import io.bidmachine.unified.UnifiedMediationParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
public final class MolocoAdError {
    public static final int $stable = 0;

    @NotNull
    private final String adUnitId;

    @NotNull
    private final String description;

    @NotNull
    private final ErrorType errorType;

    @NotNull
    private final String networkName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AdCreateError {
        private static final /* synthetic */ kn.a $ENTRIES;
        private static final /* synthetic */ AdCreateError[] $VALUES;
        public static final AdCreateError SDK_INIT_FAILED = new AdCreateError("SDK_INIT_FAILED", 0, "Failed to create `ad` object due to SDK initialization failure.", 1011);
        public static final AdCreateError SDK_INIT_WAS_NOT_COMPLETED = new AdCreateError("SDK_INIT_WAS_NOT_COMPLETED", 1, "Failed to create `ad` object due to `Moloco.initialize()` not complete.", 1012);
        public static final AdCreateError UNABLE_TO_CREATE_AD = new AdCreateError("UNABLE_TO_CREATE_AD", 2, "Failed to create `ad` object due to `Moloco.initialize()` not complete in time", 1013);

        @NotNull
        private final String description;
        private final int errorCode;

        private static final /* synthetic */ AdCreateError[] $values() {
            return new AdCreateError[]{SDK_INIT_FAILED, SDK_INIT_WAS_NOT_COMPLETED, UNABLE_TO_CREATE_AD};
        }

        static {
            AdCreateError[] adCreateErrorArr$values = $values();
            $VALUES = adCreateErrorArr$values;
            $ENTRIES = kotlin.enums.a.a(adCreateErrorArr$values);
        }

        private AdCreateError(String str, int i10, String str2, int i11) {
            this.description = str2;
            this.errorCode = i11;
        }

        @NotNull
        public static kn.a<AdCreateError> getEntries() {
            return $ENTRIES;
        }

        public static AdCreateError valueOf(String str) {
            return (AdCreateError) Enum.valueOf(AdCreateError.class, str);
        }

        public static AdCreateError[] values() {
            return (AdCreateError[]) $VALUES.clone();
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ErrorType {
        private static final /* synthetic */ kn.a $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;

        @NotNull
        private final String description;
        private final int errorCode;
        public static final ErrorType UNKNOWN = new ErrorType("UNKNOWN", 0, "Generic failure error code", -1);
        public static final ErrorType SDK_INIT_ERROR = new ErrorType("SDK_INIT_ERROR", 1, "SDK initialization error", 1000);
        public static final ErrorType SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT = new ErrorType("SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT", 2, "WorkManager crash that prevents us from creating a persistent http request client", 1001);
        public static final ErrorType SDK_INVALID_CONFIGURATION = new ErrorType("SDK_INVALID_CONFIGURATION", 3, "Ad object cannot be created, due to invalid configuration", 1002);
        public static final ErrorType AD_LOAD_FAILED = new ErrorType("AD_LOAD_FAILED", 4, "Ad is not loaded", 2000);
        public static final ErrorType AD_LOAD_FAILED_SDK_NOT_INIT = new ErrorType("AD_LOAD_FAILED_SDK_NOT_INIT", 5, "Ad load failed because SDK was not initialized", 2001);
        public static final ErrorType AD_LOAD_TIMEOUT_ERROR = new ErrorType("AD_LOAD_TIMEOUT_ERROR", 6, "Ad failed to load because the request timed out", 2003);
        public static final ErrorType AD_LOAD_LIMIT_REACHED = new ErrorType("AD_LOAD_LIMIT_REACHED", 7, "Ad load limit reached", 2004);
        public static final ErrorType AD_LOAD_BID_FAILED = new ErrorType("AD_LOAD_BID_FAILED", 8, "Ad failed to load because bid request failed or no fill", 2005);
        public static final ErrorType AD_LOAD_WEBVIEW_FAILED = new ErrorType("AD_LOAD_WEBVIEW_FAILED", 9, "Ad failed to load because Webview was *not* available", 2006);
        public static final ErrorType AD_SHOW_ERROR = new ErrorType("AD_SHOW_ERROR", 10, "Ad show failed despite a successful ad load. Internal renderer error", 3000);
        public static final ErrorType AD_SHOW_ERROR_NOT_LOADED = new ErrorType("AD_SHOW_ERROR_NOT_LOADED", 11, "Ad show failed because ad load was not called", 3001);
        public static final ErrorType AD_SHOW_ERROR_ALREADY_DISPLAYING = new ErrorType("AD_SHOW_ERROR_ALREADY_DISPLAYING", 12, "Ad show failed because show() was invoked multiple times when ad was already rendering", 3002);
        public static final ErrorType AD_BID_PARSE_ERROR = new ErrorType("AD_BID_PARSE_ERROR", 13, "The bid response received was not parseable by the SDK", 4000);
        public static final ErrorType AD_SIGNAL_COLLECTION_FAILED = new ErrorType("AD_SIGNAL_COLLECTION_FAILED", 14, "The bid token couldn’t be retrieved.", 5000);

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{UNKNOWN, SDK_INIT_ERROR, SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT, SDK_INVALID_CONFIGURATION, AD_LOAD_FAILED, AD_LOAD_FAILED_SDK_NOT_INIT, AD_LOAD_TIMEOUT_ERROR, AD_LOAD_LIMIT_REACHED, AD_LOAD_BID_FAILED, AD_LOAD_WEBVIEW_FAILED, AD_SHOW_ERROR, AD_SHOW_ERROR_NOT_LOADED, AD_SHOW_ERROR_ALREADY_DISPLAYING, AD_BID_PARSE_ERROR, AD_SIGNAL_COLLECTION_FAILED};
        }

        static {
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = kotlin.enums.a.a(errorTypeArr$values);
        }

        private ErrorType(String str, int i10, String str2, int i11) {
            this.description = str2;
            this.errorCode = i11;
        }

        @NotNull
        public static kn.a<ErrorType> getEntries() {
            return $ENTRIES;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    public MolocoAdError(@NotNull String str, @NotNull String str2, @NotNull ErrorType errorType, @NotNull String str3) {
        p.k(str, "networkName");
        p.k(str2, "adUnitId");
        p.k(errorType, "errorType");
        p.k(str3, UnifiedMediationParams.KEY_DESCRIPTION);
        this.networkName = str;
        this.adUnitId = str2;
        this.errorType = errorType;
        this.description = str3;
    }

    public /* synthetic */ MolocoAdError(String str, String str2, ErrorType errorType, String str3, int i10, tn.i iVar) {
        this(str, str2, errorType, (i10 & 8) != 0 ? errorType.getDescription() : str3);
    }

    public static /* synthetic */ MolocoAdError copy$default(MolocoAdError molocoAdError, String str, String str2, ErrorType errorType, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = molocoAdError.networkName;
        }
        if ((i10 & 2) != 0) {
            str2 = molocoAdError.adUnitId;
        }
        if ((i10 & 4) != 0) {
            errorType = molocoAdError.errorType;
        }
        if ((i10 & 8) != 0) {
            str3 = molocoAdError.description;
        }
        return molocoAdError.copy(str, str2, errorType, str3);
    }

    @NotNull
    public final String component1() {
        return this.networkName;
    }

    @NotNull
    public final String component2() {
        return this.adUnitId;
    }

    @NotNull
    public final ErrorType component3() {
        return this.errorType;
    }

    @NotNull
    public final String component4() {
        return this.description;
    }

    @NotNull
    public final MolocoAdError copy(@NotNull String str, @NotNull String str2, @NotNull ErrorType errorType, @NotNull String str3) {
        p.k(str, "networkName");
        p.k(str2, "adUnitId");
        p.k(errorType, "errorType");
        p.k(str3, UnifiedMediationParams.KEY_DESCRIPTION);
        return new MolocoAdError(str, str2, errorType, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MolocoAdError)) {
            return false;
        }
        MolocoAdError molocoAdError = (MolocoAdError) obj;
        return p.f(this.networkName, molocoAdError.networkName) && p.f(this.adUnitId, molocoAdError.adUnitId) && this.errorType == molocoAdError.errorType && p.f(this.description, molocoAdError.description);
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final ErrorType getErrorType() {
        return this.errorType;
    }

    @NotNull
    public final String getNetworkName() {
        return this.networkName;
    }

    public int hashCode() {
        return (((((this.networkName.hashCode() * 31) + this.adUnitId.hashCode()) * 31) + this.errorType.hashCode()) * 31) + this.description.hashCode();
    }

    @NotNull
    public String toString() {
        return "MolocoAdError(networkName=" + this.networkName + ", adUnitId=" + this.adUnitId + ", errorType=" + this.errorType + ", description=" + this.description + ')';
    }
}
