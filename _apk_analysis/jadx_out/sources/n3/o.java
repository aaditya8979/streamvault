package n3;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import n3.a;

/* JADX INFO: compiled from: InMobiUnifiedNativeAdMapper.java */
/* JADX INFO: loaded from: classes11.dex */
public class o extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f75094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f75096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o3.c f75097e;

    /* JADX INFO: compiled from: InMobiUnifiedNativeAdMapper.java */
    public class a implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Uri f75098a;

        public a(Uri uri) {
            this.f75098a = uri;
        }

        @Override // n3.a.b
        public void a(HashMap<String, Drawable> map) {
            Drawable drawable = map.get("icon_key");
            o.this.setIcon(new l(drawable, this.f75098a, 1.0d));
            ArrayList arrayList = new ArrayList();
            arrayList.add(new l(new ColorDrawable(0), null, 1.0d));
            o.this.setImages(arrayList);
            if (drawable != null && o.this.f75096d != null) {
                o.this.f75097e.f76025e = (MediationNativeAdCallback) o.this.f75096d.onSuccess(o.this);
            } else {
                AdError adErrorA = g.a(109, "InMobi SDK failed to download native ad image assets.");
                Log.w(InMobiMediationAdapter.TAG, adErrorA.toString());
                o.this.f75096d.onFailure(adErrorA);
            }
        }

        @Override // n3.a.b
        public void b() {
            AdError adErrorA = g.a(109, "InMobi SDK failed to download native ad image assets.");
            Log.w(InMobiMediationAdapter.TAG, adErrorA.toString());
            o.this.f75096d.onFailure(adErrorA);
        }
    }

    public o(@NonNull m mVar, Boolean bool, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, o3.c cVar) {
        this.f75094b = mVar;
        this.f75095c = bool.booleanValue();
        this.f75096d = mediationAdLoadCallback;
        this.f75097e = cVar;
        setOverrideImpressionRecording(true);
    }

    public void c(Context context) {
        if (this.f75094b.e() != null) {
            setHeadline(this.f75094b.e());
        }
        if (this.f75094b.b() != null) {
            setBody(this.f75094b.b());
        }
        if (this.f75094b.a() != null) {
            setCallToAction(this.f75094b.a());
        }
        if (this.f75094b.f() != null) {
            setAdvertiser(this.f75094b.f());
        }
        setStarRating(Double.valueOf(this.f75094b.d()));
        MediaView mediaViewG = this.f75094b.g();
        if (mediaViewG != null) {
            setMediaView(mediaViewG);
        }
        setHasVideoContent(this.f75094b.h().booleanValue());
        if (this.f75094b.c() != null) {
            try {
                URL url = new URL(this.f75094b.c());
                Uri uri = Uri.parse(url.toURI().toString());
                HashMap map = new HashMap();
                if (this.f75095c) {
                    setIcon(new l(null, uri, 1.0d));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new l(new ColorDrawable(0), null, 1.0d));
                    setImages(arrayList);
                } else {
                    map.put("icon_key", url);
                }
                if (!this.f75095c) {
                    new n3.a(new a(uri)).execute(map);
                    return;
                }
                MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback = this.f75096d;
                if (mediationAdLoadCallback != null) {
                    this.f75097e.f76025e = mediationAdLoadCallback.onSuccess(this);
                }
            } catch (MalformedURLException | URISyntaxException e10) {
                AdError adErrorA = g.a(108, e10.getLocalizedMessage());
                Log.w(InMobiMediationAdapter.TAG, adErrorA.toString());
                this.f75096d.onFailure(adErrorA);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        setOverrideClickHandling(true);
        View view2 = map.get("3001");
        View view3 = map.get("3004");
        View view4 = map.get("3003");
        View view5 = map.get("3002");
        View view6 = map.get("3005");
        View view7 = map.get("3009");
        InMobiNativeViewData.Builder builder = new InMobiNativeViewData.Builder((ViewGroup) view);
        if (view2 != null) {
            builder.setTitleView(view2);
        }
        if (view3 != null) {
            builder.setDescriptionView(view3);
        }
        if (view4 instanceof ImageView) {
            builder.setIconView((ImageView) view4);
        }
        if (view5 != null) {
            builder.setCTAView(view5);
        }
        if (view6 != null) {
            builder.setAdvertiserView(view6);
        }
        if (view7 != null) {
            builder.setRatingView(view7);
        }
        this.f75094b.k(builder.build());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        this.f75094b.o();
    }
}
