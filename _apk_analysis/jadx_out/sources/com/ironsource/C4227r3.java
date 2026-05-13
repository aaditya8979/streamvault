package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4227r3 implements InterfaceC3993e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final T3 f33388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Cd f33389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final IronSource.a f33390c;

    /* JADX INFO: renamed from: com.ironsource.r3$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33391a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33391a = iArr;
        }
    }

    public C4227r3(@NotNull T3 t32, @Nullable Cd cd2, @NotNull IronSource.a aVar) {
        tn.p.k(t32, "adFormatConfigurations");
        tn.p.k(aVar, "adFormat");
        this.f33388a = t32;
        this.f33389b = cd2;
        this.f33390c = aVar;
    }

    @Override // com.ironsource.InterfaceC3993e1
    @Nullable
    public InterfaceC4164n9 a(@NotNull InterfaceC4305vd interfaceC4305vd) {
        NetworkSettings networkSettingsB;
        Zd zdF;
        tn.p.k(interfaceC4305vd, "providerName");
        Cd cd2 = this.f33389b;
        if (cd2 == null || (networkSettingsB = cd2.b(interfaceC4305vd.value())) == null) {
            return null;
        }
        int i10 = a.f33391a[this.f33390c.ordinal()];
        if (i10 == 1) {
            U2 u2C = this.f33388a.c();
            if (u2C != null) {
                return new Z2(new C3957c1(networkSettingsB, networkSettingsB.getBannerSettings(), this.f33390c), u2C);
            }
            return null;
        }
        if (i10 != 2) {
            if (i10 == 3 && (zdF = this.f33388a.f()) != null) {
                return new Md(new C3957c1(networkSettingsB, networkSettingsB.getRewardedVideoSettings(), this.f33390c), zdF);
            }
            return null;
        }
        H9 h9D = this.f33388a.d();
        if (h9D != null) {
            return new K9(new C3957c1(networkSettingsB, networkSettingsB.getInterstitialSettings(), this.f33390c), h9D);
        }
        return null;
    }
}
