package z3;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: compiled from: UnityInterstitialEventAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationInterstitialListener f98189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationInterstitialAdapter f98190b;

    /* JADX INFO: renamed from: z3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UnityInterstitialEventAdapter.java */
    public static /* synthetic */ class C1115a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98191a;

        static {
            int[] iArr = new int[UnityAdsAdapterUtils.AdEvent.values().length];
            f98191a = iArr;
            try {
                iArr[UnityAdsAdapterUtils.AdEvent.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98191a[UnityAdsAdapterUtils.AdEvent.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98191a[UnityAdsAdapterUtils.AdEvent.CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98191a[UnityAdsAdapterUtils.AdEvent.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98191a[UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public a(MediationInterstitialListener mediationInterstitialListener, MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.f98189a = mediationInterstitialListener;
        this.f98190b = mediationInterstitialAdapter;
    }

    public void a(UnityAdsAdapterUtils.AdEvent adEvent) {
        if (this.f98189a == null) {
            return;
        }
        int i10 = C1115a.f98191a[adEvent.ordinal()];
        if (i10 == 1) {
            this.f98189a.onAdLoaded(this.f98190b);
            return;
        }
        if (i10 == 2) {
            this.f98189a.onAdOpened(this.f98190b);
            return;
        }
        if (i10 == 3) {
            this.f98189a.onAdClicked(this.f98190b);
        } else if (i10 == 4) {
            this.f98189a.onAdClosed(this.f98190b);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f98189a.onAdLeftApplication(this.f98190b);
        }
    }
}
