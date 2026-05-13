package com.inmobi.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import bn.g;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.AbstractC3383ed;
import com.inmobi.media.AbstractC3481i9;
import com.inmobi.media.Ac;
import com.inmobi.media.C3307be;
import com.inmobi.media.C3358dd;
import com.inmobi.media.C3605n9;
import com.inmobi.media.C3659pd;
import com.inmobi.media.C3734se;
import com.inmobi.media.InterfaceC3338cj;
import com.inmobi.media.InterfaceC3580m9;
import com.inmobi.media.Jg;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Ki;
import com.inmobi.media.P9;
import com.inmobi.media.Rg;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class InMobiNative {

    @NotNull
    public static final String APP_INSTALLS = "AppInstalls";

    @NotNull
    public static final String LIKES = "Likes";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3358dd f25106a;

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f25105b = "InMobiNative";

    public static final class Companion {
        public Companion(i iVar) {
        }
    }

    public interface LockScreenListener {
        void onActionRequired(@NotNull InMobiNative inMobiNative);
    }

    public InMobiNative(@NotNull Context context, long j10, @NotNull NativeAdEventListener nativeAdEventListener) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(nativeAdEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C3358dd c3358dd = new C3358dd(this, context, j10);
        this.f25106a = c3358dd;
        if (Ji.d()) {
            p.k(nativeAdEventListener, "adEventListener");
            c3358dd.f27031b.f26259a = nativeAdEventListener;
        } else {
            String str = f25105b;
            p.j(str, "TAG");
            throw new SdkNotInitializedException(str);
        }
    }

    public final void destroy() {
        C3358dd c3358dd = this.f25106a;
        c3358dd.getClass();
        try {
            c3358dd.f27034e = null;
            Rg rg2 = c3358dd.f27031b;
            rg2.f26259a = null;
            rg2.f26260b = null;
            rg2.f26261c = null;
            c3358dd.f27032c.f25603c.clear();
            c3358dd.f27033d.f25528b.j();
        } catch (Exception e10) {
            String str = AbstractC3383ed.f27105a;
            p.j(str, "access$getTAG$p(...)");
            Kb.a((byte) 1, str, "Failed to destroy ad; SDK encountered an unexpected error");
            g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    @Nullable
    public final View getAdChoiceIcon() {
        C3307be c3307be = this.f25106a.f27034e;
        if (c3307be != null) {
            return c3307be.f26866j;
        }
        return null;
    }

    @Nullable
    public final JSONObject getAdContent() {
        C3307be c3307be = this.f25106a.f27034e;
        if (c3307be != null) {
            return c3307be.f26861e;
        }
        return null;
    }

    @Nullable
    public final String getAdDescription() {
        C3307be c3307be = this.f25106a.f27034e;
        if (c3307be != null) {
            return c3307be.f26858b;
        }
        return null;
    }

    @Nullable
    public final InMobiNativeImage getAdIcon() {
        C3307be c3307be = this.f25106a.f27034e;
        if (c3307be != null) {
            return c3307be.f26859c;
        }
        return null;
    }

    public final float getAdRating() {
        Float f10;
        C3307be c3307be = this.f25106a.f27034e;
        if (c3307be == null || (f10 = c3307be.f26863g) == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    @Nullable
    public final String getAdTitle() {
        C3307be c3307be = this.f25106a.f27034e;
        if (c3307be != null) {
            return c3307be.f26857a;
        }
        return null;
    }

    @Nullable
    public final String getAdvertiserName() {
        C3307be c3307be = this.f25106a.f27034e;
        if (c3307be != null) {
            return c3307be.f26862f;
        }
        return null;
    }

    @Nullable
    public final String getCtaText() {
        C3307be c3307be = this.f25106a.f27034e;
        if (c3307be != null) {
            return c3307be.f26860d;
        }
        return null;
    }

    @Nullable
    public final MediaView getMediaView() {
        C3307be c3307be = this.f25106a.f27034e;
        if (c3307be != null) {
            return c3307be.f26865i;
        }
        return null;
    }

    public final boolean isReady() {
        return this.f25106a.f27034e != null;
    }

    public final boolean isVideo() {
        C3307be c3307be = this.f25106a.f27034e;
        if (c3307be != null) {
            return c3307be.f26864h;
        }
        return false;
    }

    public final void load() {
        C3358dd c3358dd = this.f25106a;
        Jg jg2 = c3358dd.f27030a;
        p.k("NonAB", "<set-?>");
        jg2.f25737g = "NonAB";
        c3358dd.f27033d.f25528b.c();
    }

    public final void load(@Nullable byte[] bArr) {
        C3358dd c3358dd = this.f25106a;
        Jg jg2 = c3358dd.f27030a;
        p.k("AB", "<set-?>");
        jg2.f25737g = "AB";
        c3358dd.f27033d.f25528b.a(bArr);
    }

    public final void notifyLoss(int i10, double d10) {
        String strA = this.f25106a.f27033d.f25528b.a(i10, d10);
        if (strA.length() > 0) {
            Kb.a((byte) 1, "InMobiNative", strA);
        }
    }

    public final void notifyWin(double d10) {
        String strA = this.f25106a.f27033d.f25528b.a(d10);
        if (strA.length() > 0) {
            Kb.a((byte) 1, "InMobiNative", strA);
        }
    }

    public final void registerViewForTracking(@NotNull InMobiNativeViewData inMobiNativeViewData) {
        p.k(inMobiNativeViewData, "inMobiNativeViewData");
        C3358dd c3358dd = this.f25106a;
        c3358dd.getClass();
        p.k(inMobiNativeViewData, "inMobiNativeViewData");
        c3358dd.f27033d.a(inMobiNativeViewData);
    }

    public final void setContentUrl(@Nullable String str) {
        this.f25106a.f27030a.f25735e = str;
    }

    public final void setExtras(@Nullable Map<String, String> map) {
        C3358dd c3358dd = this.f25106a;
        if (map != null) {
            c3358dd.getClass();
            String str = map.get("tp");
            if (!TextUtils.isEmpty(str)) {
                Ki.f25816b = str;
            }
            String str2 = map.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                Ki.f25815a = str2;
            }
        }
        c3358dd.f27030a.f25733c = map;
    }

    public final void setKeywords(@Nullable String str) {
        this.f25106a.f27030a.f25732b = str;
    }

    public final void setListener(@NotNull NativeAdEventListener nativeAdEventListener) {
        p.k(nativeAdEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C3358dd c3358dd = this.f25106a;
        c3358dd.getClass();
        p.k(nativeAdEventListener, "adEventListener");
        c3358dd.f27031b.f26259a = nativeAdEventListener;
    }

    public final void setVideoEventListener(@NotNull VideoEventListener videoEventListener) {
        p.k(videoEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C3358dd c3358dd = this.f25106a;
        c3358dd.getClass();
        p.k(videoEventListener, "videoEventListener");
        c3358dd.f27031b.f26260b = videoEventListener;
    }

    public final void showOnLockScreen(@NotNull LockScreenListener lockScreenListener) {
        p.k(lockScreenListener, "lockScreenListener");
        C3358dd c3358dd = this.f25106a;
        c3358dd.getClass();
        p.k(lockScreenListener, "lockScreenListener");
        c3358dd.f27030a.f25736f = true;
        c3358dd.f27031b.f26261c = lockScreenListener;
    }

    public final void takeAction() {
        Ac ac2 = this.f25106a.f27033d.f25528b;
        InterfaceC3338cj interfaceC3338cj = ac2.f25156c;
        C3659pd c3659pd = interfaceC3338cj instanceof C3659pd ? (C3659pd) interfaceC3338cj : null;
        if (c3659pd != null) {
            InterfaceC3580m9 interfaceC3580m9L = c3659pd.l();
            if (interfaceC3580m9L != null) {
                ((C3605n9) interfaceC3580m9L).a("AUM-NativeLoadedState", "takeAction - delegating to ad unit");
            }
            c3659pd.f27869h.a();
        }
        InterfaceC3338cj interfaceC3338cj2 = ac2.f25156c;
        C3734se c3734se = interfaceC3338cj2 instanceof C3734se ? (C3734se) interfaceC3338cj2 : null;
        if (c3734se != null) {
            InterfaceC3580m9 interfaceC3580m9L2 = c3734se.l();
            if (interfaceC3580m9L2 != null) {
                ((C3605n9) interfaceC3580m9L2).a("AUM-NativeRenderedState", "takeAction - delegating to ad unit");
            }
            c3734se.f28117f.a();
        }
    }

    public final void unTrackViews() {
        this.f25106a.f27033d.f25528b.d();
    }
}
