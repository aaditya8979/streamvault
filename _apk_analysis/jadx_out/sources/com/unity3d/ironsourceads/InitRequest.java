package com.unity3d.ironsourceads;

import cn.w;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes10.dex */
public final class InitRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f53403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<IronSourceAds.AdFormat> f53404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final LogLevel f53405c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f53406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private List<? extends IronSourceAds.AdFormat> f53407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private LogLevel f53408c;

        public Builder(@NotNull String str) {
            p.k(str, "appKey");
            this.f53406a = str;
        }

        @NotNull
        public final InitRequest build() {
            String str = this.f53406a;
            List<? extends IronSourceAds.AdFormat> listM = this.f53407b;
            if (listM == null) {
                listM = w.m();
            }
            LogLevel logLevel = this.f53408c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, listM, logLevel, null);
        }

        @NotNull
        public final String getAppKey() {
            return this.f53406a;
        }

        @NotNull
        public final Builder withLegacyAdFormats(@NotNull List<? extends IronSourceAds.AdFormat> list) {
            p.k(list, "legacyAdFormats");
            this.f53407b = list;
            return this;
        }

        @NotNull
        public final Builder withLogLevel(@NotNull LogLevel logLevel) {
            p.k(logLevel, "logLevel");
            this.f53408c = logLevel;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.f53403a = str;
        this.f53404b = list;
        this.f53405c = logLevel;
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, i iVar) {
        this(str, list, logLevel);
    }

    @NotNull
    public final String getAppKey() {
        return this.f53403a;
    }

    @NotNull
    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.f53404b;
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return this.f53405c;
    }
}
