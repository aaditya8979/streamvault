package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.AbstractC5017oi;
import io.appmetrica.analytics.impl.C4808gd;
import io.appmetrica.analytics.impl.C4860id;
import io.appmetrica.analytics.impl.C4885jd;
import io.appmetrica.analytics.impl.C4911kd;
import io.appmetrica.analytics.impl.C4937ld;
import io.appmetrica.analytics.impl.C4962md;
import io.appmetrica.analytics.impl.C4987nd;
import io.appmetrica.analytics.impl.C5012od;
import io.appmetrica.analytics.impl.C5273z0;

/* JADX INFO: loaded from: classes10.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static C5012od f64389a = new C5012od();

    @NonNull
    public static IModuleReporter getModuleReporter(@NonNull Context context, @NonNull String str) {
        C5012od c5012od = f64389a;
        C4808gd c4808gd = c5012od.f67445b;
        c4808gd.f66824b.a(context);
        c4808gd.f66826d.a(str);
        c5012od.f67446c.f67834a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC5017oi.f67464a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        C5012od c5012od = f64389a;
        c5012od.f67445b.getClass();
        c5012od.f67446c.getClass();
        c5012od.f67444a.getClass();
        return C5273z0.a();
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue, @NonNull Boolean bool) {
        C5012od c5012od = f64389a;
        boolean zBooleanValue = bool.booleanValue();
        c5012od.f67445b.getClass();
        c5012od.f67446c.getClass();
        c5012od.f67447d.execute(new C4860id(c5012od, adRevenue, zBooleanValue));
    }

    public static void reportEvent(@NonNull ModuleEvent moduleEvent) {
        C5012od c5012od = f64389a;
        c5012od.f67445b.f66823a.a(null);
        c5012od.f67446c.getClass();
        c5012od.f67447d.execute(new C4885jd(c5012od, moduleEvent));
    }

    public static void reportExternalAttribution(int i10, @NonNull String str) {
        C5012od c5012od = f64389a;
        c5012od.f67445b.getClass();
        c5012od.f67446c.getClass();
        c5012od.f67447d.execute(new C4911kd(c5012od, i10, str));
    }

    public static void sendEventsBuffer() {
        C5012od c5012od = f64389a;
        c5012od.f67445b.getClass();
        c5012od.f67446c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z10) {
        C5012od c5012od = f64389a;
        c5012od.f67445b.getClass();
        c5012od.f67446c.getClass();
        c5012od.f67447d.execute(new C4937ld(c5012od, z10));
    }

    @VisibleForTesting
    public static void setProxy(@NonNull C5012od c5012od) {
        f64389a = c5012od;
    }

    public static void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        C5012od c5012od = f64389a;
        c5012od.f67445b.f66825c.a(str);
        c5012od.f67446c.getClass();
        c5012od.f67447d.execute(new C4962md(c5012od, str, bArr));
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String str) {
        C5012od c5012od = f64389a;
        C4808gd c4808gd = c5012od.f67445b;
        c4808gd.f66824b.a(context);
        c4808gd.f66826d.a(str);
        c5012od.f67446c.f67834a.a(context.getApplicationContext());
        c5012od.f67447d.execute(new C4987nd(str));
    }
}
