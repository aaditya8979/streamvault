package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import bn.r;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import go.k;
import go.q;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import tn.p;

/* JADX INFO: compiled from: AdPlayer.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface AdPlayer {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
    public static final int SCAR_EVENT_QUEUE_SIZE = 10;

    /* JADX INFO: compiled from: AdPlayer.kt */
    public static final class Companion {
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        public static final int SCAR_EVENT_QUEUE_SIZE = 10;
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final k<String> broadcastEventChannel = q.b(0, 0, null, 7, null);

        private Companion() {
        }

        @NotNull
        public final k<String> getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    /* JADX INFO: compiled from: AdPlayer.kt */
    public static final class DefaultImpls {
        @CallSuper
        @Nullable
        public static Object destroy(@NotNull AdPlayer adPlayer, @NotNull hn.c<? super r> cVar) {
            d.e(adPlayer.getScope(), null, 1, null);
            return r.f5635a;
        }

        public static void show(@NotNull AdPlayer adPlayer, @NotNull ShowOptions showOptions) {
            p.k(showOptions, "showOptions");
            throw new NotImplementedError(null, 1, null);
        }
    }

    @CallSuper
    @Nullable
    Object destroy(@NotNull hn.c<? super r> cVar);

    void dispatchShowCompleted();

    @NotNull
    go.d<LoadEvent> getOnLoadEvent();

    @NotNull
    go.d<OfferwallShowEvent> getOnOfferwallEvent();

    @NotNull
    go.d<ScarEvent> getOnScarEvent();

    @NotNull
    go.d<ShowEvent> getOnShowEvent();

    @NotNull
    l0 getScope();

    @NotNull
    WebViewContainer getWebViewContainer();

    @Nullable
    Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull hn.c<? super r> cVar);

    @Nullable
    Object onBroadcastEvent(@NotNull String str, @NotNull hn.c<? super r> cVar);

    @Nullable
    Object requestShow(@Nullable Map<String, ? extends Object> map, @NotNull hn.c<? super r> cVar);

    @Nullable
    Object sendActivityDestroyed(@NotNull hn.c<? super r> cVar);

    @Nullable
    Object sendFocusChange(boolean z10, @NotNull hn.c<? super r> cVar);

    @Nullable
    Object sendGmaEvent(@NotNull GMAEvent gMAEvent, @NotNull hn.c<? super r> cVar);

    @Nullable
    Object sendMuteChange(boolean z10, @NotNull hn.c<? super r> cVar);

    @Nullable
    Object sendOfferwallEvent(@NotNull OfferwallEvent offerwallEvent, @NotNull hn.c<? super r> cVar);

    @Nullable
    Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull hn.c<? super r> cVar);

    @Nullable
    Object sendScarBannerEvent(@NotNull BannerBridge.BannerEvent bannerEvent, @NotNull hn.c<? super r> cVar);

    @Nullable
    Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull hn.c<? super r> cVar);

    @Nullable
    Object sendVisibilityChange(boolean z10, @NotNull hn.c<? super r> cVar);

    @Nullable
    Object sendVolumeChange(double d10, @NotNull hn.c<? super r> cVar);

    void show(@NotNull ShowOptions showOptions);
}
