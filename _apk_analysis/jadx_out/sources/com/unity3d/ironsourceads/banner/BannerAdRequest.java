package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C4338xc;
import com.ironsource.InterfaceC4305vd;
import com.ironsource.Z9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.AdSize;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
public final class BannerAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f53415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f53416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f53417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AdSize f53418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Bundle f53419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4305vd f53420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f53421g;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f53422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f53423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f53424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final AdSize f53425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private Bundle f53426e;

        public Builder(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull AdSize adSize) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(str, "instanceId");
            p.k(str2, "adm");
            p.k(adSize, "size");
            this.f53422a = context;
            this.f53423b = str;
            this.f53424c = str2;
            this.f53425d = adSize;
        }

        @NotNull
        public final BannerAdRequest build() {
            IronLog.API.info("instanceId: " + this.f53423b + ", size: " + this.f53425d.getSizeDescription());
            return new BannerAdRequest(this.f53422a, this.f53423b, this.f53424c, this.f53425d, this.f53426e, null);
        }

        @NotNull
        public final String getAdm() {
            return this.f53424c;
        }

        @NotNull
        public final Context getContext() {
            return this.f53422a;
        }

        @NotNull
        public final String getInstanceId() {
            return this.f53423b;
        }

        @NotNull
        public final AdSize getSize() {
            return this.f53425d;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle bundle) {
            p.k(bundle, "extraParams");
            this.f53426e = bundle;
            return this;
        }
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.f53415a = context;
        this.f53416b = str;
        this.f53417c = str2;
        this.f53418d = adSize;
        this.f53419e = bundle;
        this.f53420f = new C4338xc(str);
        String strB = Z9.b();
        p.j(strB, "generateMultipleUniqueInstanceId()");
        this.f53421g = strB;
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, i iVar) {
        this(context, str, str2, adSize, bundle);
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.f53421g;
    }

    @NotNull
    public final String getAdm() {
        return this.f53417c;
    }

    @NotNull
    public final Context getContext() {
        return this.f53415a;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.f53419e;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f53416b;
    }

    @NotNull
    public final InterfaceC4305vd getProviderName$mediationsdk_release() {
        return this.f53420f;
    }

    @NotNull
    public final AdSize getSize() {
        return this.f53418d;
    }
}
