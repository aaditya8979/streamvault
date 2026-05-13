package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import com.inmobi.media.A8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public final class InlineParams {

    @A8
    @Nullable
    private String callerBundleId;

    @Nullable
    private final String listing;
    private final boolean overlay;

    @A8
    private boolean pingInWebView;

    @Nullable
    private final String referrer;

    @A8
    @Nullable
    private String targetBundleId;

    @NotNull
    private final String url;

    public InlineParams() {
        this(null, null, null, false, null, null, false, 127, null);
    }

    public InlineParams(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z10, @Nullable String str4, @Nullable String str5, boolean z11) {
        p.k(str, "url");
        this.url = str;
        this.referrer = str2;
        this.listing = str3;
        this.overlay = z10;
        this.callerBundleId = str4;
        this.targetBundleId = str5;
        this.pingInWebView = z11;
    }

    public /* synthetic */ InlineParams(String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, int i10, i iVar) {
        this((i10 & 1) != 0 ? "https://play.google.com/d?" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? null : str4, (i10 & 32) == 0 ? str5 : null, (i10 & 64) != 0 ? false : z11);
    }

    public static /* synthetic */ InlineParams copy$default(InlineParams inlineParams, String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inlineParams.url;
        }
        if ((i10 & 2) != 0) {
            str2 = inlineParams.referrer;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = inlineParams.listing;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            z10 = inlineParams.overlay;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            str4 = inlineParams.callerBundleId;
        }
        String str8 = str4;
        if ((i10 & 32) != 0) {
            str5 = inlineParams.targetBundleId;
        }
        String str9 = str5;
        if ((i10 & 64) != 0) {
            z11 = inlineParams.pingInWebView;
        }
        return inlineParams.copy(str, str6, str7, z12, str8, str9, z11);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    @Nullable
    public final String component2() {
        return this.referrer;
    }

    @Nullable
    public final String component3() {
        return this.listing;
    }

    public final boolean component4() {
        return this.overlay;
    }

    @Nullable
    public final String component5() {
        return this.callerBundleId;
    }

    @Nullable
    public final String component6() {
        return this.targetBundleId;
    }

    public final boolean component7() {
        return this.pingInWebView;
    }

    @NotNull
    public final InlineParams copy(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z10, @Nullable String str4, @Nullable String str5, boolean z11) {
        p.k(str, "url");
        return new InlineParams(str, str2, str3, z10, str4, str5, z11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineParams)) {
            return false;
        }
        InlineParams inlineParams = (InlineParams) obj;
        return p.f(this.url, inlineParams.url) && p.f(this.referrer, inlineParams.referrer) && p.f(this.listing, inlineParams.listing) && this.overlay == inlineParams.overlay && p.f(this.callerBundleId, inlineParams.callerBundleId) && p.f(this.targetBundleId, inlineParams.targetBundleId) && this.pingInWebView == inlineParams.pingInWebView;
    }

    @Nullable
    public final String getCallerBundleId() {
        return this.callerBundleId;
    }

    @Nullable
    public final String getListing() {
        return this.listing;
    }

    public final boolean getOverlay() {
        return this.overlay;
    }

    public final boolean getPingInWebView() {
        return this.pingInWebView;
    }

    @Nullable
    public final String getReferrer() {
        return this.referrer;
    }

    @Nullable
    public final String getTargetBundleId() {
        return this.targetBundleId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.referrer;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.listing;
        int iHashCode3 = (Boolean.hashCode(this.overlay) + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.callerBundleId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.targetBundleId;
        return Boolean.hashCode(this.pingInWebView) + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final void setCallerBundleId(@Nullable String str) {
        this.callerBundleId = str;
    }

    public final void setPingInWebView(boolean z10) {
        this.pingInWebView = z10;
    }

    public final void setTargetBundleId(@Nullable String str) {
        this.targetBundleId = str;
    }

    @NotNull
    public String toString() {
        return "InlineParams(url=" + this.url + ", referrer=" + this.referrer + ", listing=" + this.listing + ", overlay=" + this.overlay + ", callerBundleId=" + this.callerBundleId + ", targetBundleId=" + this.targetBundleId + ", pingInWebView=" + this.pingInWebView + ")";
    }
}
