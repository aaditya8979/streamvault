package com.unity3d.ads.adplayer.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: WebViewClientError.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class WebViewClientError {

    @NotNull
    private final ErrorReason reason;

    @Nullable
    private final Integer statusCode;

    @Nullable
    private final String url;

    public WebViewClientError(@Nullable String str, @NotNull ErrorReason errorReason, @Nullable Integer num) {
        p.k(errorReason, "reason");
        this.url = str;
        this.reason = errorReason;
        this.statusCode = num;
    }

    public /* synthetic */ WebViewClientError(String str, ErrorReason errorReason, Integer num, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str, errorReason, (i10 & 4) != 0 ? null : num);
    }

    public static /* synthetic */ WebViewClientError copy$default(WebViewClientError webViewClientError, String str, ErrorReason errorReason, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webViewClientError.url;
        }
        if ((i10 & 2) != 0) {
            errorReason = webViewClientError.reason;
        }
        if ((i10 & 4) != 0) {
            num = webViewClientError.statusCode;
        }
        return webViewClientError.copy(str, errorReason, num);
    }

    @Nullable
    public final String component1() {
        return this.url;
    }

    @NotNull
    public final ErrorReason component2() {
        return this.reason;
    }

    @Nullable
    public final Integer component3() {
        return this.statusCode;
    }

    @NotNull
    public final WebViewClientError copy(@Nullable String str, @NotNull ErrorReason errorReason, @Nullable Integer num) {
        p.k(errorReason, "reason");
        return new WebViewClientError(str, errorReason, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewClientError)) {
            return false;
        }
        WebViewClientError webViewClientError = (WebViewClientError) obj;
        return p.f(this.url, webViewClientError.url) && this.reason == webViewClientError.reason && p.f(this.statusCode, webViewClientError.statusCode);
    }

    @NotNull
    public final ErrorReason getReason() {
        return this.reason;
    }

    @Nullable
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.reason.hashCode()) * 31;
        Integer num = this.statusCode;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WebViewClientError(url=" + this.url + ", reason=" + this.reason + ", statusCode=" + this.statusCode + ')';
    }
}
