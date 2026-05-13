package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import bn.g;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.AbstractC3457ha;
import com.inmobi.media.AbstractC3481i9;
import com.inmobi.media.AbstractC3547l1;
import com.inmobi.media.C3482ia;
import com.inmobi.media.C3505j9;
import com.inmobi.media.C3506ja;
import com.inmobi.media.C3531ka;
import com.inmobi.media.C3556la;
import com.inmobi.media.J5;
import com.inmobi.media.Jg;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Ki;
import com.inmobi.media.P9;
import com.inmobi.media.Pj;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class InMobiInterstitial {

    @NotNull
    public static final C3505j9 Companion = new C3505j9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f25096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jg f25097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f25098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f25099f;
    public C3556la mAdManager;
    public AbstractC3457ha mPubListener;

    public static final class a extends C3531ka {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiInterstitial inMobiInterstitial) {
            super(inMobiInterstitial);
            p.k(inMobiInterstitial, "interstitial");
        }

        @Override // com.inmobi.media.C3531ka, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C3531ka, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
            AbstractC3457ha mPubListener$media_release;
            p.k(inMobiAdRequestStatus, "status");
            InMobiInterstitial inMobiInterstitial = this.f27461a.get();
            if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
                return;
            }
            mPubListener$media_release.a(inMobiInterstitial, inMobiAdRequestStatus);
        }

        @Override // com.inmobi.media.C3531ka, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo adMetaInfo) throws JSONException {
            p.k(adMetaInfo, "info");
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiInterstitial inMobiInterstitial = this.f27461a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.getMAdManager$media_release().i();
                } catch (IllegalStateException e10) {
                    String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
                    p.j(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    Kb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
                    inMobiInterstitial.getMPubListener$media_release().a(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    public InMobiInterstitial(@NotNull Context context, long j10, @NotNull InterstitialAdEventListener interstitialAdEventListener) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(interstitialAdEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Jg jg2 = new Jg();
        this.f25097d = jg2;
        this.f25098e = new a(this);
        this.f25099f = new e(this);
        if (!Ji.d()) {
            p.j("InMobiInterstitial", "TAG");
            throw new SdkNotInitializedException("InMobiInterstitial");
        }
        this.f25094a = context.getApplicationContext();
        jg2.f25731a = j10;
        this.f25096c = new WeakReference(context);
        setMPubListener$media_release(new C3482ia(interstitialAdEventListener));
        setMAdManager$media_release(new C3556la());
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiInterstitial";
    }

    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final void a(Activity activity) {
        try {
            if (this.f25095b) {
                getMAdManager$media_release().a(activity);
            } else {
                p.j("InMobiInterstitial", "TAG");
                Kb.a((byte) 1, "InMobiInterstitial", "load() must be called before trying to show the ad");
            }
        } catch (Exception e10) {
            p.j("InMobiInterstitial", "TAG");
            Kb.a((byte) 1, "InMobiInterstitial", "Unable to show ad; SDK encountered an unexpected error");
            p.j("InMobiInterstitial", "TAG");
            e10.getMessage();
            g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    public final void disableHardwareAcceleration() {
        this.f25097d.f25734d = true;
    }

    @NotNull
    public final C3556la getMAdManager$media_release() {
        C3556la c3556la = this.mAdManager;
        if (c3556la != null) {
            return c3556la;
        }
        p.C("mAdManager");
        return null;
    }

    @NotNull
    public final AbstractC3457ha getMPubListener$media_release() {
        AbstractC3457ha abstractC3457ha = this.mPubListener;
        if (abstractC3457ha != null) {
            return abstractC3457ha;
        }
        p.C("mPubListener");
        return null;
    }

    @NotNull
    public final PreloadManager getPreloadManager() {
        return this.f25099f;
    }

    public final void getSignals() {
        Jg jg2 = this.f25097d;
        jg2.getClass();
        p.k("AB", "<set-?>");
        jg2.f25737g = "AB";
        C3556la mAdManager$media_release = getMAdManager$media_release();
        Jg jg3 = this.f25097d;
        Context context = this.f25094a;
        if (context == null) {
            p.C("mContext");
            context = null;
        }
        mAdManager$media_release.a(jg3, context, false, "getToken");
        getMAdManager$media_release().a(this.f25098e);
    }

    public final boolean isReady() {
        C3506ja c3506ja;
        Pj pj2;
        C3556la mAdManager$media_release = getMAdManager$media_release();
        C3506ja c3506ja2 = mAdManager$media_release.f27554h;
        boolean z10 = c3506ja2 != null && 2 == mAdManager$media_release.f25333a && c3506ja2.f27506b == 4;
        if (!z10 && (((c3506ja = getMAdManager$media_release().f27554h) == null || (pj2 = c3506ja.H) == null || !pj2.f26140b) && c3506ja != null)) {
            c3506ja.a0();
        }
        return z10;
    }

    @UiThread
    public final void load() {
        try {
            this.f25095b = true;
            Jg jg2 = this.f25097d;
            p.k("NonAB", "<set-?>");
            jg2.f25737g = "NonAB";
            C3556la mAdManager$media_release = getMAdManager$media_release();
            Jg jg3 = this.f25097d;
            Context context = this.f25094a;
            if (context == null) {
                p.C("mContext");
                context = null;
            }
            mAdManager$media_release.a(jg3, context, true, "intHtml");
            if (Build.VERSION.SDK_INT >= 29) {
                J5.c((Context) this.f25096c.get());
            }
            loadAdUnit();
        } catch (Exception e10) {
            p.j("InMobiInterstitial", "TAG");
            Kb.a((byte) 1, "InMobiInterstitial", "Unable to load ad; SDK encountered an unexpected error");
            p.j("InMobiInterstitial", "TAG");
            e10.getMessage();
            getMAdManager$media_release().a((short) 2000);
            getMAdManager$media_release().a(getMAdManager$media_release().f27554h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    public final void load(@Nullable byte[] bArr) {
        this.f25095b = true;
        Jg jg2 = this.f25097d;
        p.k("AB", "<set-?>");
        jg2.f25737g = "AB";
        C3556la mAdManager$media_release = getMAdManager$media_release();
        Jg jg3 = this.f25097d;
        Context context = this.f25094a;
        if (context == null) {
            p.C("mContext");
            context = null;
        }
        mAdManager$media_release.a(jg3, context, true, "intHtml");
        if (Build.VERSION.SDK_INT >= 29) {
            J5.c((Context) this.f25096c.get());
        }
        getMAdManager$media_release().a(bArr, this.f25098e);
    }

    @VisibleForTesting
    public final void loadAdUnit() {
        getMAdManager$media_release().b(this.f25098e);
    }

    public final void notifyLoss(int i10, double d10) {
        String strA = "loss notification failed to trigger";
        if (this.mAdManager == null) {
            Kb.a((byte) 1, "InMobi", "loss notification failed to trigger");
            return;
        }
        C3556la mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC3547l1 abstractC3547l1F = mAdManager$media_release.f();
            strA = abstractC3547l1F != null ? abstractC3547l1F.a(i10, d10) : null;
        }
        if (strA != null) {
            Kb.a((byte) 1, "InMobi", strA);
        }
    }

    public final void notifyWin(double d10) {
        String strA = "win notification failed to trigger";
        if (this.mAdManager == null) {
            Kb.a((byte) 1, "InMobi", "win notification failed to trigger");
            return;
        }
        C3556la mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC3547l1 abstractC3547l1F = mAdManager$media_release.f();
            strA = abstractC3547l1F != null ? abstractC3547l1F.a(d10) : null;
        }
        if (strA != null) {
            Kb.a((byte) 1, "InMobi", strA);
        }
    }

    public final void setContentUrl(@NotNull String str) {
        p.k(str, "contentUrl");
        this.f25097d.f25735e = str;
    }

    public final void setExtras(@Nullable Map<String, String> map) {
        if (map != null) {
            String str = map.get("tp");
            if (!TextUtils.isEmpty(str)) {
                Ki.f25816b = str;
            }
            String str2 = map.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                Ki.f25815a = str2;
            }
        }
        this.f25097d.f25733c = map;
    }

    public final void setKeywords(@Nullable String str) {
        this.f25097d.f25732b = str;
    }

    public final void setListener(@NotNull InterstitialAdEventListener interstitialAdEventListener) {
        p.k(interstitialAdEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        setMPubListener$media_release(new C3482ia(interstitialAdEventListener));
    }

    public final void setMAdManager$media_release(@NotNull C3556la c3556la) {
        p.k(c3556la, "<set-?>");
        this.mAdManager = c3556la;
    }

    public final void setMPubListener$media_release(@NotNull AbstractC3457ha abstractC3457ha) {
        p.k(abstractC3457ha, "<set-?>");
        this.mPubListener = abstractC3457ha;
    }

    public final void setWatermarkData(@NotNull WatermarkData watermarkData) {
        p.k(watermarkData, "watermarkData");
        getMAdManager$media_release().a(watermarkData);
    }

    @UiThread
    public final void show() {
        a(null);
    }

    @UiThread
    public final void show(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        if (context instanceof Activity) {
            a((Activity) context);
            return;
        }
        p.j("InMobiInterstitial", "TAG");
        Kb.a((byte) 1, "InMobiInterstitial", "Activity context is required to show interstitial ad as expected");
        a(null);
    }
}
