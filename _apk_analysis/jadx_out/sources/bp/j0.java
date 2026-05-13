package bp;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAdPreloader;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.ads.rewarded.RewardedAdPreloader;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile j0 f5786m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5787a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f5788b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5789c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5790d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IComCallback f5791e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5792f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f5793g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5794h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5795i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5796j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5797k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l1 f5798l = new l1(this);

    public static j0 a() {
        if (f5786m == null) {
            synchronized (j0.class) {
                if (f5786m == null) {
                    f5786m = new j0();
                }
            }
        }
        return f5786m;
    }

    public final /* synthetic */ void b(final Activity activity, final ConsentInformation consentInformation, final IComCallback iComCallback) {
        UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: bp.i0
            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(FormError formError) {
                this.f5780a.e(consentInformation, activity, iComCallback, formError);
            }
        });
    }

    public final void c(final Activity activity, final IComCallback iComCallback) {
        try {
            ConsentRequestParameters consentRequestParametersBuild = new ConsentRequestParameters.Builder().build();
            final ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
            consentInformation.requestConsentInfoUpdate(activity, consentRequestParametersBuild, new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: bp.g0
                @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
                public final void onConsentInfoUpdateSuccess() {
                    this.f5766a.b(activity, consentInformation, iComCallback);
                }
            }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: bp.h0
                @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
                public final void onConsentInfoUpdateFailure(FormError formError) {
                    this.f5775a.f(iComCallback, formError);
                }
            });
            if (consentInformation.canRequestAds()) {
                if (this.f5792f) {
                    AdLog.i("Admob utils has success");
                    h(true, "", iComCallback);
                    d(activity);
                } else {
                    MobileAds.initialize(activity, new t0(this, System.currentTimeMillis(), iComCallback, activity));
                }
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            if (iComCallback != null) {
                iComCallback.onFailed(-1, e10.getMessage());
            }
        }
    }

    public final void d(Context context) {
        try {
            g(a.d.c().k(context, 16), a.d.c().k(context, 14));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public final void e(ConsentInformation consentInformation, Activity activity, IComCallback iComCallback, FormError formError) {
        if (formError != null) {
            AdLog.w(formError.getErrorCode() + ": " + formError.getMessage());
        }
        if (consentInformation.canRequestAds()) {
            if (!this.f5792f) {
                MobileAds.initialize(activity, new t0(this, System.currentTimeMillis(), iComCallback, activity));
                return;
            }
            AdLog.i("Admob utils has success");
            h(true, "", iComCallback);
            d(activity);
        }
    }

    public final void f(IComCallback iComCallback, FormError formError) {
        String str = formError.getErrorCode() + ": " + formError.getMessage();
        AdLog.w(str);
        h(false, str, iComCallback);
    }

    public final void g(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (this.f5795i) {
                    AdLog.i("admob inter preload is start");
                } else {
                    this.f5795i = true;
                    InterstitialAdPreloader.start(str, new PreloadConfiguration.Builder(str).setBufferSize(this.f5797k).build(), new p("interstitial", str));
                    AdLog.i("admob startPreload add inter");
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (this.f5796j) {
                AdLog.i("admob reward preload is start");
                return;
            }
            this.f5796j = true;
            RewardedAdPreloader.start(str2, new PreloadConfiguration.Builder(str2).setBufferSize(this.f5797k).build(), new p("reward", str2));
            AdLog.i("admob startPreload add reward");
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(boolean r3, java.lang.String r4, com.yk.e.inf.IComCallback r5) {
        /*
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L47
            r1 = -1
            if (r3 == 0) goto L11
            boolean r3 = r2.f5790d     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            if (r3 != 0) goto L47
            r3 = 1
            r2.f5790d = r3     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            r5.onSuccess()     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            goto L47
        L11:
            r5.onFailed(r1, r4)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            goto L47
        L15:
            r3 = move-exception
            goto L31
        L17:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()     // Catch: java.lang.Throwable -> L15
            com.yk.e.util.AdLog.e(r4, r3)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L15
            r5.onFailed(r1, r3)     // Catch: java.lang.Throwable -> L15
            r2.f5789c = r0
            java.util.concurrent.ConcurrentLinkedQueue r3 = r2.f5788b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L5c
            goto L51
        L31:
            r2.f5789c = r0
            java.util.concurrent.ConcurrentLinkedQueue r4 = r2.f5788b
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L46
            java.util.concurrent.ConcurrentLinkedQueue r4 = r2.f5788b
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r4.run()
        L46:
            throw r3
        L47:
            r2.f5789c = r0
            java.util.concurrent.ConcurrentLinkedQueue r3 = r2.f5788b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L5c
        L51:
            java.util.concurrent.ConcurrentLinkedQueue r3 = r2.f5788b
            java.lang.Object r3 = r3.poll()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r3.run()
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.j0.h(boolean, java.lang.String, com.yk.e.inf.IComCallback):void");
    }
}
