package b4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.c;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.ui.view.MediaView;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: VungleRtbNativeAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends UnifiedNativeAdMapper implements NativeAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f5376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediationNativeAdCallback f5377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAd f5378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MediaView f5379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.ads.mediation.vungle.b f5381g;

    /* JADX INFO: compiled from: VungleRtbNativeAd.java */
    public class a implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f5382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f5383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f5384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f5385d;

        public a(Context context, String str, int i10, String str2) {
            this.f5382a = context;
            this.f5383b = str;
            this.f5384c = i10;
            this.f5385d = str2;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeError(AdError adError) {
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            d.this.f5376b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeSuccess() {
            d dVar = d.this;
            dVar.f5378d = dVar.f5381g.d(this.f5382a, this.f5383b);
            d.this.f5378d.setAdOptionsPosition(this.f5384c);
            d.this.f5378d.setAdListener(d.this);
            d.this.f5379e = new MediaView(this.f5382a);
            if (!TextUtils.isEmpty(this.f5385d)) {
                d.this.f5378d.getAdConfig().setWatermark(this.f5385d);
            }
            d.this.f5378d.load(d.this.f5380f);
        }
    }

    /* JADX INFO: compiled from: VungleRtbNativeAd.java */
    public static class b extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f5387a;

        public b(Uri uri) {
            this.f5387a = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return null;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f5387a;
        }
    }

    public d(@NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        this.f5376b = mediationAdLoadCallback;
        this.f5381g = bVar;
    }

    public final void g() {
        setHeadline(this.f5378d.getAdTitle());
        setBody(this.f5378d.getAdBodyText());
        setCallToAction(this.f5378d.getAdCallToActionText());
        Double adStarRating = this.f5378d.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.f5378d.getAdSponsoredText());
        setMediaView(this.f5379e);
        String appIcon = this.f5378d.getAppIcon();
        if (!TextUtils.isEmpty(appIcon) && appIcon.startsWith(AdPayload.FILE_SCHEME)) {
            setIcon(new b(Uri.parse(appIcon)));
        }
        setMediaContentAspectRatio(this.f5378d.getAspectRatio());
        if (VungleMediationAdapter.runtimeGmaSdkListensToAdapterReportedImpressions()) {
            setOverrideImpressionRecording(true);
        }
        setOverrideClickHandling(true);
    }

    public void h(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        int i10;
        int i11;
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        Context context = mediationNativeAdConfiguration.getContext();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or invalid app ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            this.f5376b.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or Invalid placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError2.toString());
            this.f5376b.onFailure(adError2);
            return;
        }
        this.f5380f = mediationNativeAdConfiguration.getBidResponse();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (adChoicesPlacement != 0) {
            if (adChoicesPlacement == 2) {
                i11 = 3;
            } else if (adChoicesPlacement != 3) {
                i10 = 1;
            } else {
                i11 = 2;
            }
            com.google.ads.mediation.vungle.c.a().b(string, context, new a(context, string2, i11, mediationNativeAdConfiguration.getWatermark()));
        }
        i10 = 0;
        i11 = i10;
        com.google.ads.mediation.vungle.c.a().b(string, context, new a(context, string2, i11, mediationNativeAdConfiguration.getWatermark()));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(@NonNull BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f5377c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f5377c.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(@NonNull BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        this.f5376b.onFailure(VungleMediationAdapter.getAdError(vungleError));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(@NonNull BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f5377c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(@NonNull BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f5377c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(@NonNull BaseAd baseAd) {
        g();
        this.f5377c = this.f5376b.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(@NonNull BaseAd baseAd) {
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
        super.trackViews(view, map, map2);
        String str = VungleMediationAdapter.TAG;
        Log.d(str, "trackViews()");
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            com.vungle.ads.NativeAd nativeAd = this.f5378d;
            if (nativeAd == null || !nativeAd.canPlayAd().booleanValue()) {
                return;
            }
            View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (!(childAt instanceof FrameLayout)) {
                Log.d(str, "Vungle requires a FrameLayout to render the native ad.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            ImageView imageView = null;
            View value = null;
            for (Map.Entry<String, View> entry : map.entrySet()) {
                arrayList.add(entry.getValue());
                if (entry.getKey().equals("3003")) {
                    value = entry.getValue();
                }
            }
            if (value instanceof ImageView) {
                imageView = (ImageView) value;
            } else {
                Log.d(VungleMediationAdapter.TAG, "The view to display a Vungle native icon image is not a type of ImageView, so it can't be registered for click events.");
            }
            this.f5378d.registerViewForInteraction((FrameLayout) childAt, this.f5379e, imageView, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(@NonNull View view) {
        super.untrackView(view);
        Log.d(VungleMediationAdapter.TAG, "untrackView()");
        com.vungle.ads.NativeAd nativeAd = this.f5378d;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
    }
}
