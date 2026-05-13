package com.google.ads.mediation.vungle;

import android.content.Context;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: VungleSdkWrapper.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f19917a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static com.google.ads.mediation.vungle.a f19918b = new a();

    /* JADX INFO: compiled from: VungleSdkWrapper.kt */
    public static final class a implements com.google.ads.mediation.vungle.a {
        @Override // com.google.ads.mediation.vungle.a
        public void a(Context context, String str, InitializationListener initializationListener) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(str, "appId");
            p.k(initializationListener, "initializationListener");
            VungleAds.INSTANCE.init(context, str, initializationListener);
        }

        @Override // com.google.ads.mediation.vungle.a
        public void b(Context context, BidTokenCallback bidTokenCallback) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(bidTokenCallback, "callback");
            VungleAds.INSTANCE.getBiddingToken(context, bidTokenCallback);
        }

        @Override // com.google.ads.mediation.vungle.a
        public String getSdkVersion() {
            return VungleAds.INSTANCE.getSdkVersion();
        }

        @Override // com.google.ads.mediation.vungle.a
        public boolean isInitialized() {
            return VungleAds.INSTANCE.isInitialized();
        }
    }
}
