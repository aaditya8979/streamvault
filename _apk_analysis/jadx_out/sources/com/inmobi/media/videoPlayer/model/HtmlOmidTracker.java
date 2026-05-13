package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class HtmlOmidTracker {

    @Nullable
    private String verificationParams;

    @NotNull
    private String vendor = "";

    @NotNull
    private String url = "";

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getVendor() {
        return this.vendor;
    }

    @Nullable
    public final String getVerificationParams() {
        return this.verificationParams;
    }

    public final void setUrl(@NotNull String str) {
        p.k(str, "<set-?>");
        this.url = str;
    }

    public final void setVendor(@NotNull String str) {
        p.k(str, "<set-?>");
        this.vendor = str;
    }

    public final void setVerificationParams(@Nullable String str) {
        this.verificationParams = str;
    }
}
