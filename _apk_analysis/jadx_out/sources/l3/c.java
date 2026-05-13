package l3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import k3.e;

/* JADX INFO: compiled from: FacebookRtbNativeAd.java */
/* JADX INFO: loaded from: classes9.dex */
public class c extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationNativeAdConfiguration f73652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f73653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAdBase f73654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MediationNativeAdCallback f73655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediaView f73656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f73657g;

    /* JADX INFO: compiled from: FacebookRtbNativeAd.java */
    public class a implements MediaViewListener {
        public a() {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onComplete(MediaView mediaView) {
            if (c.this.f73655e != null) {
                c.this.f73655e.onVideoComplete();
            }
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onEnterFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onExitFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenBackground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenForeground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPause(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPlay(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onVolumeChange(MediaView mediaView, float f10) {
        }
    }

    /* JADX INFO: compiled from: FacebookRtbNativeAd.java */
    public class b extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f73659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Uri f73660b;

        public b() {
        }

        public b(Drawable drawable) {
            this.f73659a = drawable;
        }

        public b(Uri uri) {
            this.f73660b = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        @Nullable
        public Drawable getDrawable() {
            return this.f73659a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        @NonNull
        public Uri getUri() {
            return this.f73660b;
        }
    }

    /* JADX INFO: renamed from: l3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FacebookRtbNativeAd.java */
    public interface InterfaceC0870c {
        void a(AdError adError);

        void b();
    }

    /* JADX INFO: compiled from: FacebookRtbNativeAd.java */
    public class d implements AdListener, NativeAdListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<Context> f73662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NativeAdBase f73663c;

        /* JADX INFO: compiled from: FacebookRtbNativeAd.java */
        public class a implements InterfaceC0870c {
            public a() {
            }

            @Override // l3.c.InterfaceC0870c
            public void a(AdError adError) {
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                c.this.f73653c.onFailure(adError);
            }

            @Override // l3.c.InterfaceC0870c
            public void b() {
                c cVar = c.this;
                cVar.f73655e = (MediationNativeAdCallback) cVar.f73653c.onSuccess(c.this);
            }
        }

        public d(Context context, NativeAdBase nativeAdBase) {
            this.f73663c = nativeAdBase;
            this.f73662b = new WeakReference<>(context);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            c.this.f73655e.reportAdClicked();
            c.this.f73655e.onAdOpened();
            c.this.f73655e.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            if (ad2 != this.f73663c) {
                AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
                c.this.f73653c.onFailure(adError);
                return;
            }
            Context context = this.f73662b.get();
            if (context != null) {
                c.this.e(context, new a());
                return;
            }
            AdError adError2 = new AdError(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            c.this.f73653c.onFailure(adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            c.this.f73653c.onFailure(adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }
    }

    public c(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, e eVar) {
        this.f73653c = mediationAdLoadCallback;
        this.f73652b = mediationNativeAdConfiguration;
        this.f73657g = eVar;
    }

    public final boolean d(NativeAdBase nativeAdBase) {
        boolean z10 = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
        return nativeAdBase instanceof NativeBannerAd ? z10 : (!z10 || nativeAdBase.getAdCoverImage() == null || this.f73656f == null) ? false : true;
    }

    public void e(@NonNull Context context, @NonNull InterfaceC0870c interfaceC0870c) {
        if (!d(this.f73654d)) {
            AdError adError = new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            interfaceC0870c.a(adError);
            return;
        }
        setHeadline(this.f73654d.getAdHeadline());
        if (this.f73654d.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new b(Uri.parse(this.f73654d.getAdCoverImage().getUrl())));
            setImages(arrayList);
        }
        setBody(this.f73654d.getAdBodyText());
        if (this.f73654d.getPreloadedIconViewDrawable() != null) {
            setIcon(new b(this.f73654d.getPreloadedIconViewDrawable()));
        } else if (this.f73654d.getAdIcon() == null) {
            setIcon(new b());
        } else {
            setIcon(new b(Uri.parse(this.f73654d.getAdIcon().getUrl())));
        }
        setCallToAction(this.f73654d.getAdCallToAction());
        setAdvertiser(this.f73654d.getAdvertiserName());
        this.f73656f.setListener(new a());
        setHasVideoContent(true);
        setMediaView(this.f73656f);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("id", this.f73654d.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f73654d.getAdSocialContext());
        setExtras(bundle);
        setAdChoicesContent(new AdOptionsView(context, this.f73654d, null));
        interfaceC0870c.b();
    }

    public void f() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f73652b.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f73653c.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.f73652b);
        this.f73656f = this.f73657g.b(this.f73652b.getContext());
        try {
            this.f73654d = NativeAdBase.fromBidPayload(this.f73652b.getContext(), placementID, this.f73652b.getBidResponse());
            if (!TextUtils.isEmpty(this.f73652b.getWatermark())) {
                this.f73654d.setExtraHints(new ExtraHints.Builder().mediationData(this.f73652b.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = this.f73654d;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new d(this.f73652b.getContext(), this.f73654d)).withBid(this.f73652b.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e10) {
            AdError adError2 = new AdError(109, "Failed to create native ad from bid payload: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.f73653c.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.f73654d;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Meta Audience Network impression recording might be impacted for this ad.");
                return;
            } else if (view2 instanceof ImageView) {
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
                return;
            } else {
                Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass()));
                return;
            }
        }
        if (!(nativeAdBase instanceof com.facebook.ads.NativeAd)) {
            Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Meta Audience Network Adapter. Meta Audience Network impression recording might be impacted for this ad.");
            return;
        }
        com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
        if (view2 instanceof ImageView) {
            nativeAd.registerViewForInteraction(view, this.f73656f, (ImageView) view2, arrayList);
        } else {
            Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
            nativeAd.registerViewForInteraction(view, this.f73656f, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(@NonNull View view) {
        NativeAdBase nativeAdBase = this.f73654d;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }
}
