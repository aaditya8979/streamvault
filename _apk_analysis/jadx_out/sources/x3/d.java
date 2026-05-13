package x3;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PangleNativeAd.java */
/* JADX INFO: loaded from: classes9.dex */
public class d extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f86758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f86759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w3.d f86760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w3.b f86761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationNativeAdCallback f86762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PAGNativeAd f86763g;

    /* JADX INFO: compiled from: PangleNativeAd.java */
    public class a implements a.InterfaceC0282a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f86764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationNativeAdConfiguration f86765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f86766c;

        /* JADX INFO: renamed from: x3.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PangleNativeAd.java */
        public class C1096a implements PAGNativeAdLoadListener {
            public C1096a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGNativeAd pAGNativeAd) {
                d.this.h(pAGNativeAd);
                d dVar = d.this;
                dVar.f86762f = (MediationNativeAdCallback) dVar.f86758b.onSuccess(d.this);
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
            public void onError(int i10, String str) {
                AdError adErrorC = w3.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                d.this.f86758b.onFailure(adErrorC);
            }
        }

        public a(String str, MediationNativeAdConfiguration mediationNativeAdConfiguration, String str2) {
            this.f86764a = str;
            this.f86765b = mediationNativeAdConfiguration;
            this.f86766c = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0282a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            d.this.f86758b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0282a
        public void onInitializeSuccess() {
            PAGNativeRequest pAGNativeRequestE = d.this.f86761e.e();
            pAGNativeRequestE.setAdString(this.f86764a);
            w3.c.a(pAGNativeRequestE, this.f86764a, this.f86765b);
            d.this.f86760d.h(this.f86766c, pAGNativeRequestE, new C1096a());
        }
    }

    /* JADX INFO: compiled from: PangleNativeAd.java */
    public class b implements PAGNativeAdInteractionListener {
        public b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (d.this.f86762f != null) {
                d.this.f86762f.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (d.this.f86762f != null) {
                d.this.f86762f.reportAdImpression();
            }
        }
    }

    /* JADX INFO: compiled from: PangleNativeAd.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.f86763g.showPrivacyActivity();
        }
    }

    /* JADX INFO: renamed from: x3.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PangleNativeAd.java */
    public class C1097d extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable f86771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f86772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f86773c;

        public C1097d(Drawable drawable, Uri uri, double d10) {
            this.f86771a = drawable;
            this.f86772b = uri;
            this.f86773c = d10;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        @NonNull
        public Drawable getDrawable() {
            return this.f86771a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.f86773c;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        @NonNull
        public Uri getUri() {
            return this.f86772b;
        }
    }

    public d(@NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, @NonNull w3.d dVar, @NonNull w3.b bVar) {
        this.f86758b = mediationAdLoadCallback;
        this.f86759c = aVar;
        this.f86760d = dVar;
        this.f86761e = bVar;
    }

    public final void h(PAGNativeAd pAGNativeAd) {
        this.f86763g = pAGNativeAd;
        PAGNativeAdData nativeAdData = pAGNativeAd.getNativeAdData();
        setHeadline(nativeAdData.getTitle());
        setBody(nativeAdData.getDescription());
        setCallToAction(nativeAdData.getButtonText());
        if (nativeAdData.getIcon() != null) {
            setIcon(new C1097d(null, Uri.parse(nativeAdData.getIcon().getImageUrl()), 1.0d));
        }
        setOverrideClickHandling(true);
        setMediaView(nativeAdData.getMediaView());
        setAdChoicesContent(nativeAdData.getAdLogoView());
    }

    public void i(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = w3.a.a(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f86758b.onFailure(adErrorA);
        } else {
            String bidResponse = mediationNativeAdConfiguration.getBidResponse();
            this.f86759c.b(mediationNativeAdConfiguration.getContext(), serverParameters.getString("appid"), new a(bidResponse, mediationNativeAdConfiguration, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
        HashMap map3 = new HashMap(map);
        map3.remove("3011");
        map3.remove("3012");
        View view2 = (View) map3.get("3002");
        ArrayList arrayList = new ArrayList();
        if (view2 != null) {
            arrayList.add(view2);
        }
        this.f86763g.registerViewForInteraction((ViewGroup) view, new ArrayList(map3.values()), arrayList, (View) null, new b());
        getAdChoicesContent().setOnClickListener(new c());
    }
}
