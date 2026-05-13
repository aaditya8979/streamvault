package com.unity3d.ironsourceads.interstitial;

import android.os.Bundle;
import com.ironsource.C4338xc;
import com.ironsource.InterfaceC4305vd;
import com.ironsource.Z9;
import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes8.dex */
public final class InterstitialAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f53449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f53450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Bundle f53451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4305vd f53452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f53453e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f53454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f53455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Bundle f53456c;

        public Builder(@NotNull String str, @NotNull String str2) {
            p.k(str, "instanceId");
            p.k(str2, "adm");
            this.f53454a = str;
            this.f53455b = str2;
        }

        @NotNull
        public final InterstitialAdRequest build() {
            IronLog.API.info("instanceId: " + this.f53454a);
            return new InterstitialAdRequest(this.f53454a, this.f53455b, this.f53456c, null);
        }

        @NotNull
        public final String getAdm() {
            return this.f53455b;
        }

        @NotNull
        public final String getInstanceId() {
            return this.f53454a;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle bundle) {
            p.k(bundle, "extraParams");
            this.f53456c = bundle;
            return this;
        }
    }

    private InterstitialAdRequest(String str, String str2, Bundle bundle) {
        this.f53449a = str;
        this.f53450b = str2;
        this.f53451c = bundle;
        this.f53452d = new C4338xc(str);
        String strB = Z9.b();
        p.j(strB, "generateMultipleUniqueInstanceId()");
        this.f53453e = strB;
    }

    public /* synthetic */ InterstitialAdRequest(String str, String str2, Bundle bundle, i iVar) {
        this(str, str2, bundle);
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.f53453e;
    }

    @NotNull
    public final String getAdm() {
        return this.f53450b;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.f53451c;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f53449a;
    }

    @NotNull
    public final InterfaceC4305vd getProviderName$mediationsdk_release() {
        return this.f53452d;
    }
}
