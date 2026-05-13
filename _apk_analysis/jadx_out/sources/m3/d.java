package m3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.external.NativeAdEventsListener;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d extends NativeAdMapper {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f73947e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> f73948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public MediationNativeAdCallback f73949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InneractiveAdSpot f73950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public NativeAdContent f73951d;

    /* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
    public static final class b extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Uri f73952a;

        public b(@NotNull Uri uri) {
            p.k(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            this.f73952a = uri;
        }

        @Nullable
        public Void a() {
            return null;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public /* bridge */ /* synthetic */ Drawable getDrawable() {
            return (Drawable) a();
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        @NotNull
        public Uri getUri() {
            return this.f73952a;
        }
    }

    /* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
    public static final class c implements VideoContentListener {
        public c() {
        }

        @Override // com.fyber.inneractive.sdk.external.VideoContentListener
        public void onCompleted() {
            MediationNativeAdCallback mediationNativeAdCallback = d.this.f73949b;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.onVideoComplete();
            }
        }

        @Override // com.fyber.inneractive.sdk.external.VideoContentListener
        public void onPlayerError() {
        }

        @Override // com.fyber.inneractive.sdk.external.VideoContentListener
        public void onProgress(int i10, int i11) {
        }
    }

    /* JADX INFO: renamed from: m3.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
    public static final class C0876d extends NativeAdEventsListener {
        public C0876d() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
            p.k(inneractiveAdSpot, "adSpot");
            MediationNativeAdCallback mediationNativeAdCallback = d.this.f73949b;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.reportAdClicked();
            }
            MediationNativeAdCallback mediationNativeAdCallback2 = d.this.f73949b;
            if (mediationNativeAdCallback2 != null) {
                mediationNativeAdCallback2.onAdOpened();
            }
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            p.k(inneractiveAdSpot, "adSpot");
            MediationNativeAdCallback mediationNativeAdCallback = d.this.f73949b;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.onAdOpened();
            }
            MediationNativeAdCallback mediationNativeAdCallback2 = d.this.f73949b;
            if (mediationNativeAdCallback2 != null) {
                mediationNativeAdCallback2.reportAdImpression();
            }
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
            p.k(inneractiveAdSpot, "adSpot");
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            p.k(inneractiveAdSpot, "adSpot");
            MediationNativeAdCallback mediationNativeAdCallback = d.this.f73949b;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.onAdLeftApplication();
            }
        }
    }

    /* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
    public static final class e extends InneractiveAdSpot.NativeAdRequestListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MediationNativeAdConfiguration f73956c;

        public e(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
            this.f73956c = mediationNativeAdConfiguration;
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            d.this.i("onInneractiveFailedAdRequest error: " + inneractiveErrorCode, inneractiveErrorCode);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.NativeAdRequestListener
        public void onInneractiveSuccessfulNativeAdRequest(InneractiveAdSpot inneractiveAdSpot, NativeAdContent nativeAdContent) {
            if (nativeAdContent == null) {
                d.this.i("content is NOT NativeAdContent", InneractiveErrorCode.SDK_INTERNAL_ERROR);
                return;
            }
            d dVar = d.this;
            Context context = this.f73956c.getContext();
            p.j(context, "getContext(...)");
            dVar.h(context, nativeAdContent);
            d dVar2 = d.this;
            dVar2.f73949b = (MediationNativeAdCallback) dVar2.f73948a.onSuccess(d.this);
        }
    }

    public d(@NotNull MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        p.k(mediationAdLoadCallback, "adLoadCallback");
        this.f73948a = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void destroy() {
        super.destroy();
        InneractiveAdSpot inneractiveAdSpot = this.f73950c;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.f73950c = null;
        NativeAdContent nativeAdContent = this.f73951d;
        if (nativeAdContent != null) {
            nativeAdContent.destroy();
        }
        this.f73951d = null;
        this.f73949b = null;
    }

    public final void f(@NotNull MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        p.k(mediationNativeAdConfiguration, "mediationNativeAdConfiguration");
        InneractiveAdManager.setMediationName(FyberMediationAdapter.f19816n);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        p.j(bidResponse, "getBidResponse(...)");
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        NativeAdUnitController nativeAdUnitControllerB = f.b();
        NativeAdVideoContentController nativeAdVideoContentControllerC = f.c();
        nativeAdVideoContentControllerC.setEventsListener(new c());
        nativeAdUnitControllerB.addContentController(nativeAdVideoContentControllerC);
        nativeAdUnitControllerB.setEventsListener(new C0876d());
        inneractiveAdSpotCreateSpot.addUnitController(nativeAdUnitControllerB);
        inneractiveAdSpotCreateSpot.setRequestListener(new e(mediationNativeAdConfiguration));
        m3.e.c(mediationNativeAdConfiguration.getMediationExtras());
        inneractiveAdSpotCreateSpot.loadAd(bidResponse);
        this.f73950c = inneractiveAdSpotCreateSpot;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String g(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 1567014) {
            switch (iHashCode) {
                case 1567006:
                    if (str.equals("3001")) {
                        return NativeAdContent.ViewTag.AD_TITLE;
                    }
                    break;
                case 1567007:
                    if (str.equals("3002")) {
                        return "CTA";
                    }
                    break;
                case 1567008:
                    if (str.equals("3003")) {
                        return NativeAdContent.ViewTag.AD_ICON;
                    }
                    break;
                case 1567009:
                    if (str.equals("3004")) {
                        return NativeAdContent.ViewTag.AD_DESCRIPTION;
                    }
                    break;
            }
        } else if (str.equals("3009")) {
            return NativeAdContent.ViewTag.RATING;
        }
        return NativeAdContent.ViewTag.OTHER;
    }

    public final void h(Context context, NativeAdContent nativeAdContent) {
        nativeAdContent.bindMediaView(new MediaView(context));
        this.f73951d = nativeAdContent;
        setHeadline(nativeAdContent.getAdTitle());
        setBody(nativeAdContent.getAdDescription());
        Uri appIcon = nativeAdContent.getAppIcon();
        p.j(appIcon, "getAppIcon(...)");
        setIcon(new b(appIcon));
        setCallToAction(nativeAdContent.getAdCallToAction());
        setMediaView(nativeAdContent.getMediaView());
        setStarRating(Double.valueOf(nativeAdContent.getRating().floatValue()));
        Float mediaAspectRatio = nativeAdContent.getMediaAspectRatio();
        setMediaContentAspectRatio(mediaAspectRatio != null ? mediaAspectRatio.floatValue() : 0.0f);
        setOverrideClickHandling(true);
        setOverrideImpressionRecording(true);
    }

    public final void i(String str, InneractiveErrorCode inneractiveErrorCode) {
        Log.e("DTExchangeNativeAdMapper", str);
        MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback = this.f73948a;
        if (inneractiveErrorCode == null) {
            inneractiveErrorCode = InneractiveErrorCode.SDK_INTERNAL_ERROR;
        }
        mediationAdLoadCallback.onFailure(m3.b.a(inneractiveErrorCode));
        InneractiveAdSpot inneractiveAdSpot = this.f73950c;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.f73950c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void trackViews(@NotNull View view, @NotNull Map<String, ? extends View> map, @NotNull Map<String, ? extends View> map2) {
        MediaView mediaView;
        p.k(view, "containerView");
        p.k(map, "clickableAssetViews");
        p.k(map2, "nonClickableAssetViews");
        view.setTag(NativeAdContent.ViewTag.ROOT);
        NativeAdContent nativeAdContent = this.f73951d;
        if (nativeAdContent != null && (mediaView = nativeAdContent.getMediaView()) != null) {
            mediaView.setTag(NativeAdContent.ViewTag.MEDIA_VIEW);
        }
        for (Map.Entry<String, ? extends View> entry : map.entrySet()) {
            entry.getValue().setTag(g(entry.getKey()));
        }
        NativeAdContent nativeAdContent2 = this.f73951d;
        if (nativeAdContent2 != 0) {
            nativeAdContent2.registerViewsForInteraction((ViewGroup) view, nativeAdContent2 != 0 ? nativeAdContent2.getMediaView() : null, null, map.values());
        }
    }
}
