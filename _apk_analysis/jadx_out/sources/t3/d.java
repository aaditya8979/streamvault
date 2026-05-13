package t3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.ArrayList;
import java.util.List;
import s3.k;

/* JADX INFO: compiled from: MintegralNativeAd.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d extends UnifiedNativeAdMapper implements OnMBMediaViewListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Campaign f84631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f84632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationNativeAdCallback f84633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f84634e;

    /* JADX INFO: compiled from: MintegralNativeAd.java */
    public class a extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable f84635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f84636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f84637c;

        public a(Drawable drawable, Uri uri, double d10) {
            this.f84635a = drawable;
            this.f84636b = uri;
            this.f84637c = d10;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f84635a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.f84637c;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        @NonNull
        public Uri getUri() {
            return this.f84636b;
        }
    }

    public d(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f84634e = k.f(mediationNativeAdConfiguration.getMediationExtras());
        this.f84632c = mediationAdLoadCallback;
    }

    @NonNull
    public void a(@NonNull Campaign campaign, Context context) {
        this.f84631b = campaign;
        if (campaign.getAppName() != null) {
            setHeadline(this.f84631b.getAppName());
        }
        if (this.f84631b.getAppDesc() != null) {
            setBody(this.f84631b.getAppDesc());
        }
        if (this.f84631b.getAdCall() != null) {
            setCallToAction(this.f84631b.getAdCall());
        }
        setStarRating(Double.valueOf(this.f84631b.getRating()));
        if (!TextUtils.isEmpty(this.f84631b.getIconUrl())) {
            setIcon(new a(null, Uri.parse(this.f84631b.getIconUrl()), 1.0d));
        }
        MBMediaView mBMediaView = new MBMediaView(context);
        mBMediaView.setVideoSoundOnOff(!this.f84634e);
        mBMediaView.setNativeAd(this.f84631b);
        setMediaView(mBMediaView);
        MBAdChoice mBAdChoice = new MBAdChoice(context);
        mBAdChoice.setCampaign(this.f84631b);
        setAdChoicesContent(mBAdChoice);
        setOverrideClickHandling(true);
    }

    public List b(View view) {
        ArrayList arrayList = new ArrayList();
        if (view == null) {
            return arrayList;
        }
        if (!(view instanceof MediaView) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (viewGroup.getChildAt(i10) instanceof ViewGroup) {
                    arrayList.addAll(b(viewGroup.getChildAt(i10)));
                } else {
                    arrayList.add(viewGroup.getChildAt(i10));
                }
            }
        } else {
            arrayList.add(view);
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onEnterFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f84633d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onExitFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f84633d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onFinishRedirection(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onRedirectionFailed(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onStartRedirection(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onVideoAdClicked(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f84633d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onVideoStart() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f84633d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoPlay();
        }
    }
}
