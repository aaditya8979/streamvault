package com.monetization.ads.mediation.base;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: loaded from: classes10.dex */
public final class MediatedAdapterInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f51080c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f51081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f51082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f51083c;

        @NotNull
        public final MediatedAdapterInfo build() {
            return new MediatedAdapterInfo(this.f51081a, this.f51082b, this.f51083c, null);
        }

        @NotNull
        public final Builder setAdapterVersion(@NotNull String str) {
            this.f51081a = str;
            return this;
        }

        @NotNull
        public final Builder setNetworkName(@NotNull String str) {
            this.f51082b = str;
            return this;
        }

        @NotNull
        public final Builder setNetworkSdkVersion(@NotNull String str) {
            this.f51083c = str;
            return this;
        }
    }

    private MediatedAdapterInfo(String str, String str2, String str3) {
        this.f51078a = str;
        this.f51079b = str2;
        this.f51080c = str3;
    }

    public /* synthetic */ MediatedAdapterInfo(String str, String str2, String str3, i iVar) {
        this(str, str2, str3);
    }

    @Nullable
    public final String getAdapterVersion() {
        return this.f51078a;
    }

    @Nullable
    public final String getNetworkName() {
        return this.f51079b;
    }

    @Nullable
    public final String getNetworkSdkVersion() {
        return this.f51080c;
    }
}
