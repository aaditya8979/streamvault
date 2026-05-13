package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.ironsource.C3978d4;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class q extends BannerFinder {
    public q(int i10) {
        super(BrandSafetyUtils.AdType.MREC, Arrays.asList(BrandSafetyUtils.f51658o), "MrecFinder", i10);
    }

    private void b(e eVar) {
        if (eVar.H || eVar.I) {
            Logger.d(this.f51863a, "avoid clearing any images taken previously: onVideoCompletedEventHasBeenTriggered=" + eVar.H + ", impressionScreenshotsRemoved=" + eVar.I);
            return;
        }
        Logger.d(this.f51863a, "Video is marked as completed, clearing any images taken previously, isOnUiThread = " + com.safedk.android.utils.k.c());
        for (l lVar : eVar.g()) {
            if (lVar.c() != null && eVar.K.equals(lVar.c().af())) {
                a(lVar);
            }
        }
        eVar.I = true;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder, com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new r(str, str2, str3, screenShotOrientation, str4, str5);
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected e a(Activity activity, String str, int i10, String str2, Bundle bundle, String str3) {
        r rVar = new r(a(com.safedk.android.internal.b.getInstance().getForegroundActivity()), str, i10, str2, bundle, str3);
        rVar.f52562af = new WeakReference<>(activity);
        return rVar;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder, com.safedk.android.analytics.brandsafety.a
    public void a(String str, String str2, boolean z10) {
        synchronized (BannerFinder.class) {
            Logger.d(this.f51863a, "on video completed - keys : " + I.keySet() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            Iterator<e> it = I.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e next = it.next();
                if (next.K != null && next.K.equals(str2)) {
                    if (z10) {
                        next.a(ImpressionLog.f51746p, new ImpressionLog.a[0]);
                    } else {
                        next.a(ImpressionLog.f51745o, new ImpressionLog.a(ImpressionLog.K, C3978d4.i.K));
                    }
                    CreativeInfo creativeInfoI = next.i();
                    Logger.d(this.f51863a, "on video completed - view address: " + str2 + ", ad format: " + (creativeInfoI != null ? creativeInfoI.I() : null) + ", video completed: " + z10 + ", current value: " + next.H);
                    if (creativeInfoI != null) {
                        if (creativeInfoI.I() == null) {
                            Logger.d(this.f51863a, "on video completed - setting CI ad format, based on view address match");
                            creativeInfoI.p(BrandSafetyUtils.f51658o);
                        }
                        if (!next.H && z10) {
                            b(next);
                            if (!creativeInfoI.v()) {
                                Logger.d(this.f51863a, "on video completed - setting CI as video ad");
                                creativeInfoI.d(true);
                            }
                            Logger.d(this.f51863a, "on video completed - setting to: " + z10);
                            next.H = true;
                            next.a(ImpressionLog.f51746p, new ImpressionLog.a[0]);
                            if (!j(next.c())) {
                                Logger.d(this.f51863a, "on video completed - Info impressionHandlerTask is null : " + next);
                            } else if (next.f52569am != null) {
                                Logger.d(this.f51863a, "on video completed - impressionHandlerTask = " + next.f52569am + ", taskFuture = " + next.f52569am.f51628d);
                                if (next.f52569am.f51628d != null) {
                                    Logger.d(this.f51863a, "on video completed - cancelling existing taskFuture " + next.f52569am.f51628d);
                                    next.f52569am.f51628d.cancel(false);
                                    next.f52569am.f51628d = null;
                                }
                                int iW = SafeDK.getInstance().W() * 1000;
                                Logger.d(this.f51863a, "on video completed - start taking screenshots for view: " + ((next.f52569am.f51626b == null || next.f52569am.f51626b.get() == null) ? "null" : next.f52569am.f51626b.get()) + ", samplingInterval = " + iW);
                                next.f52569am.f51628d = this.D.scheduleAtFixedRate(next.f52569am, 500L, iW, TimeUnit.MILLISECONDS);
                            }
                        } else if (!z10) {
                            next.H = false;
                            next.a(ImpressionLog.f51745o, new ImpressionLog.a[0]);
                        }
                    }
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected boolean a(e eVar) {
        if (eVar == null) {
            return false;
        }
        if (SafeDK.getInstance().I()) {
            Logger.d(this.f51863a, "take screenshot, SafeDK Config item 'AlwaysTakeScreenshot' is true");
            return true;
        }
        CreativeInfo creativeInfoI = eVar.i();
        if (creativeInfoI == null) {
            Logger.d(this.f51863a, "don't take screenshot, no creative info yet");
            return false;
        }
        if (!BrandSafetyUtils.f51658o.equals(creativeInfoI.I())) {
            Logger.d(this.f51863a, "take screenshot, MREC ad, take screenshot");
            return true;
        }
        boolean zA = CreativeInfoManager.a(eVar.f51889v, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
        if (creativeInfoI.ah() && !zA) {
            Logger.d(this.f51863a, "don't take screenshot, multi ad, sdk: " + eVar.f51889v);
            return false;
        }
        if (!j(eVar.c())) {
            Logger.d(this.f51863a, "take screenshot, sdk " + eVar.c() + " Mrec EOV is not supported");
            return true;
        }
        if (!creativeInfoI.v()) {
            Logger.d(this.f51863a, "take screenshot, MREC ad is not a video ad");
            return true;
        }
        if (eVar.H) {
            Logger.d(this.f51863a, "take screenshot, MREC video ad finished playing or sdk configured to take screenshots throughout the impression. ");
            return true;
        }
        Logger.d(this.f51863a, "don't take screenshot, MREC video hasn't finished playing yet, waiting for video completed event");
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected boolean g(String str, String str2) {
        boolean zA = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        String strA = CreativeInfoManager.a(str2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        Logger.d(this.f51863a, "sdk " + str2 + ": config item SUPPORTS_MREC_IMPRESSION_TRACKING is " + zA + ", config item AD_NETWORK_TO_IGNORE is " + strA + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (zA && !str.equals(strA)) {
            return true;
        }
        Logger.d(this.f51863a, "MREC tracking is not supported for this ad network (" + str + ")");
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected boolean j(String str) {
        boolean zA = CreativeInfoManager.a(str, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, false);
        Logger.d(this.f51863a, "take screenshot, supports Mrec EOV value is " + zA);
        return zA;
    }
}
