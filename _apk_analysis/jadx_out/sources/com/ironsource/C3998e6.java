package com.ironsource;

import com.ironsource.C3978d4;
import io.bidmachine.unified.UnifiedMediationParams;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3998e6 implements Kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private InterfaceC4016f6 f31534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private WeakReference<InterfaceC4034g6> f31535b = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.ironsource.e6$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f31536a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f31537b = "impressions";

        private a() {
        }
    }

    public final void a(@NotNull InterfaceC4016f6 interfaceC4016f6) {
        tn.p.k(interfaceC4016f6, "loadListener");
        this.f31534a = interfaceC4016f6;
    }

    public final void a(@NotNull InterfaceC4034g6 interfaceC4034g6) {
        tn.p.k(interfaceC4034g6, "showListener");
        this.f31535b = new WeakReference<>(interfaceC4034g6);
    }

    @Override // com.ironsource.Kc
    public void onInterstitialAdRewarded(@Nullable String str, int i10) {
        InterfaceC4034g6 interfaceC4034g6 = this.f31535b.get();
        if (interfaceC4034g6 != null) {
            interfaceC4034g6.onAdInstanceDidReward(str, i10);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialClick() {
        InterfaceC4034g6 interfaceC4034g6 = this.f31535b.get();
        if (interfaceC4034g6 != null) {
            interfaceC4034g6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialClose() {
        InterfaceC4034g6 interfaceC4034g6 = this.f31535b.get();
        if (interfaceC4034g6 != null) {
            interfaceC4034g6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialEventNotificationReceived(@Nullable String str, @Nullable JSONObject jSONObject) {
        InterfaceC4034g6 interfaceC4034g6;
        if (!tn.p.f(str, "impressions") || (interfaceC4034g6 = this.f31535b.get()) == null) {
            return;
        }
        interfaceC4034g6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.Kc
    public void onInterstitialInitFailed(@Nullable String str) {
    }

    @Override // com.ironsource.Kc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.Kc
    public void onInterstitialLoadFailed(@NotNull String str) {
        tn.p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        InterfaceC4016f6 interfaceC4016f6 = this.f31534a;
        if (interfaceC4016f6 != null) {
            interfaceC4016f6.a(str);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialLoadSuccess(@NotNull O9 o92) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        InterfaceC4016f6 interfaceC4016f6 = this.f31534a;
        if (interfaceC4016f6 != null) {
            interfaceC4016f6.a(o92);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialOpen() {
        InterfaceC4034g6 interfaceC4034g6 = this.f31535b.get();
        if (interfaceC4034g6 != null) {
            interfaceC4034g6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialShowFailed(@Nullable String str) {
        InterfaceC4034g6 interfaceC4034g6 = this.f31535b.get();
        if (interfaceC4034g6 != null) {
            interfaceC4034g6.a(str);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialShowSuccess() {
    }
}
