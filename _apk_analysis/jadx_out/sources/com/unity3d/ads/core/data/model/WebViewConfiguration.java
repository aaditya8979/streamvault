package com.unity3d.ads.core.data.model;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: WebViewConfiguration.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class WebViewConfiguration {

    @NotNull
    private final List<String> additionalFiles;

    @NotNull
    private final String entryPoint;

    @NotNull
    private final String type;
    private final int version;

    public WebViewConfiguration(int i10, @NotNull String str, @NotNull List<String> list, @NotNull String str2) {
        p.k(str, "entryPoint");
        p.k(list, "additionalFiles");
        p.k(str2, "type");
        this.version = i10;
        this.entryPoint = str;
        this.additionalFiles = list;
        this.type = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i10, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = webViewConfiguration.version;
        }
        if ((i11 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i11 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        if ((i11 & 8) != 0) {
            str2 = webViewConfiguration.type;
        }
        return webViewConfiguration.copy(i10, str, list, str2);
    }

    public final int component1() {
        return this.version;
    }

    @NotNull
    public final String component2() {
        return this.entryPoint;
    }

    @NotNull
    public final List<String> component3() {
        return this.additionalFiles;
    }

    @NotNull
    public final String component4() {
        return this.type;
    }

    @NotNull
    public final WebViewConfiguration copy(int i10, @NotNull String str, @NotNull List<String> list, @NotNull String str2) {
        p.k(str, "entryPoint");
        p.k(list, "additionalFiles");
        p.k(str2, "type");
        return new WebViewConfiguration(i10, str, list, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
        return this.version == webViewConfiguration.version && p.f(this.entryPoint, webViewConfiguration.entryPoint) && p.f(this.additionalFiles, webViewConfiguration.additionalFiles) && p.f(this.type, webViewConfiguration.type);
    }

    @NotNull
    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    @NotNull
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.version) * 31) + this.entryPoint.hashCode()) * 31) + this.additionalFiles.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "WebViewConfiguration(version=" + this.version + ", entryPoint=" + this.entryPoint + ", additionalFiles=" + this.additionalFiles + ", type=" + this.type + ')';
    }
}
