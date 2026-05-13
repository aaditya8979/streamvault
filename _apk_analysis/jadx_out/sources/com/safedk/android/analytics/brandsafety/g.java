package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
public class g implements AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52573a = "BrandSafetyReporter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f52574b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f52575c = null;

    private g() {
        d();
    }

    public static g a() {
        if (f52575c == null) {
            f52575c = new g();
        }
        return f52575c;
    }

    public static void a(final Bundle bundle) {
        Logger.d(f52573a, "report image uploaded to server started");
        try {
            f52574b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle == null) {
                            Logger.d(g.f52573a, "Data argument is null, which means that the upload failed or that the validation check has failed. Nothing to report to the server.");
                            return;
                        }
                        if (bundle.size() > 0) {
                            Logger.d(g.f52573a, "Starting image upload report event.");
                            AppLovinBridge.reportImageUploadEvent(bundle, g.f52575c);
                            String string = bundle.getString("image_id");
                            c cVarH = b.h(string);
                            if (cVarH != null) {
                                for (l lVar : cVarH.g()) {
                                    if (string.contains(lVar.f52673a)) {
                                        g.b(lVar, cVarH.f51883p);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        Logger.e(g.f52573a, "Caught exception while creating json data", th2);
                        new CrashReporter().caughtException(th2);
                    }
                }
            });
        } catch (Throwable th2) {
            Logger.e(f52573a, "failed during reportImageUploadedToServer. data: " + bundle.toString(), th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public static void b(final Bundle bundle) {
        try {
            f52574b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle == null) {
                            Logger.d(g.f52573a, "Data argument is null, which means reporting a resolved click url is not possible. ");
                        } else if (bundle.size() > 0) {
                            Logger.d(g.f52573a, "Starting url resolution report event.");
                            AppLovinBridge.reportClickUrlResolvedEvent(bundle, g.f52575c);
                        }
                    } catch (Throwable th2) {
                        Logger.e(g.f52573a, "Caught exception while creating json data", th2);
                        new CrashReporter().caughtException(th2);
                    }
                }
            });
        } catch (Throwable th2) {
            Logger.e(f52573a, "failed during reportImageUploadedToServer. data: " + bundle.toString(), th2);
            new CrashReporter().caughtException(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(l lVar, BrandSafetyUtils.AdType adType) {
        if (lVar != null) {
            a aVarA = SafeDK.getInstance().a(adType);
            if (aVarA == null) {
                Logger.d(f52573a, "Upload: finder not found for image cleanup request");
            } else {
                Logger.d(f52573a, "Executing image cleanup request");
                aVarA.b(lVar);
            }
        }
    }

    private void d() {
        com.safedk.android.analytics.b bVar = new com.safedk.android.analytics.b() { // from class: com.safedk.android.analytics.brandsafety.g.1
            @Override // com.safedk.android.analytics.b
            public void a(String str, Bundle bundle) {
                Logger.d(g.f52573a, "Response received, response=" + bundle.toString());
            }
        };
        AppLovinBridge.registerListener(AppLovinBridge.f51531c, bVar);
        AppLovinBridge.registerListener(AppLovinBridge.f51532d, bVar);
    }

    public String b() {
        return AppLovinBridge.f51529a;
    }
}
