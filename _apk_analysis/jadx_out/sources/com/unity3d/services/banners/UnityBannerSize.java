package com.unity3d.services.banners;

import android.content.Context;
import com.unity3d.services.core.misc.ViewUtilities;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;
import vn.c;

/* JADX INFO: compiled from: UnityBannerSize.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class UnityBannerSize {
    private final int height;
    private final int width;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final UnityBannerSize leaderboard = new UnityBannerSize(728, 90);

    @NotNull
    private static final UnityBannerSize iabStandard = new UnityBannerSize(468, 60);

    @NotNull
    private static final UnityBannerSize standard = new UnityBannerSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);

    /* JADX INFO: compiled from: UnityBannerSize.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final UnityBannerSize getDynamicSize(@NotNull Context context) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            int iD = c.d(ViewUtilities.dpFromPx(context, context.getResources().getDisplayMetrics().widthPixels));
            return iD >= getLeaderboard().getWidth() ? getLeaderboard() : iD >= getIabStandard().getWidth() ? getIabStandard() : getStandard();
        }

        @NotNull
        public final UnityBannerSize getIabStandard() {
            return UnityBannerSize.iabStandard;
        }

        @NotNull
        public final UnityBannerSize getLeaderboard() {
            return UnityBannerSize.leaderboard;
        }

        @NotNull
        public final UnityBannerSize getStandard() {
            return UnityBannerSize.standard;
        }
    }

    public UnityBannerSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    @NotNull
    public static final UnityBannerSize getDynamicSize(@NotNull Context context) {
        return Companion.getDynamicSize(context);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
