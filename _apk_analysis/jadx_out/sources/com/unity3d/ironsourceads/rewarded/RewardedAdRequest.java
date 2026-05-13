package com.unity3d.ironsourceads.rewarded;

import android.os.Bundle;
import com.ironsource.C4338xc;
import com.ironsource.InterfaceC4305vd;
import com.ironsource.Z9;
import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class RewardedAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f53462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f53463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Bundle f53464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4305vd f53465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f53466e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f53467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f53468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Bundle f53469c;

        public Builder(@NotNull String str, @NotNull String str2) {
            p.k(str, "instanceId");
            p.k(str2, "adm");
            this.f53467a = str;
            this.f53468b = str2;
        }

        @NotNull
        public final RewardedAdRequest build() {
            IronLog.API.info("instanceId: " + this.f53467a);
            return new RewardedAdRequest(this.f53467a, this.f53468b, this.f53469c, null);
        }

        @NotNull
        public final String getAdm() {
            return this.f53468b;
        }

        @NotNull
        public final String getInstanceId() {
            return this.f53467a;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle bundle) {
            p.k(bundle, "extraParams");
            this.f53469c = bundle;
            return this;
        }
    }

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.f53462a = str;
        this.f53463b = str2;
        this.f53464c = bundle;
        this.f53465d = new C4338xc(str);
        String strB = Z9.b();
        p.j(strB, "generateMultipleUniqueInstanceId()");
        this.f53466e = strB;
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, i iVar) {
        this(str, str2, bundle);
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.f53466e;
    }

    @NotNull
    public final String getAdm() {
        return this.f53463b;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.f53464c;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f53462a;
    }

    @NotNull
    public final InterfaceC4305vd getProviderName$mediationsdk_release() {
        return this.f53465d;
    }
}
