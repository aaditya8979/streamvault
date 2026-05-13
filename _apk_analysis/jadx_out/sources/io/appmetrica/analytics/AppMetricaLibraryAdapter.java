package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.C4640a0;
import io.appmetrica.analytics.impl.C4666b0;
import io.appmetrica.analytics.impl.C4696c4;
import io.appmetrica.analytics.impl.Cb;
import io.appmetrica.analytics.impl.Db;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* JADX INFO: loaded from: classes4.dex */
public class AppMetricaLibraryAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static F0 f64366a = new F0();

    public static void activate(@NonNull Context context) {
        F0 f02 = f64366a;
        if (!f02.f65227a.f65101a.a(context).f67631a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Db db2 = f02.f65228b;
        Context applicationContext = context.getApplicationContext();
        db2.getClass();
        C4696c4.l().f66457g.a(applicationContext);
        C4696c4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void activate(@NonNull Context context, @NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        F0 f02 = f64366a;
        Cb cb2 = f02.f65227a;
        if (!cb2.f65101a.a(context).f67631a || !cb2.f65102b.a(appMetricaLibraryAdapterConfig).f67631a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
            return;
        }
        Db db2 = f02.f65228b;
        Context applicationContext = context.getApplicationContext();
        db2.getClass();
        C4696c4.l().f66457g.a(applicationContext);
        C4696c4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
    }

    public static void reportEvent(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        f64366a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z10) {
        F0 f02 = f64366a;
        if (f02.f65227a.f65103c.a((Void) null).f67631a) {
            f02.f65228b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z10);
        }
    }

    @VisibleForTesting
    public static void setProxy(@NonNull F0 f02) {
        f64366a = f02;
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String str) {
        F0 f02 = f64366a;
        f02.getClass();
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + ApiKeyUtils.createPartialApiKey(str), new Object[0]);
        Cb cb2 = f02.f65227a;
        if (cb2.f65107g.a(str).f67631a && cb2.f65101a.a(context).f67631a) {
            f02.f65228b.getClass();
            C4696c4.l().f66457g.a(context);
            C4666b0 c4666b0B = C4696c4.l().b();
            c4666b0B.f66405c.a().executeDelayed(new C4640a0(c4666b0B, context), c4666b0B.f66406d);
            ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }
}
