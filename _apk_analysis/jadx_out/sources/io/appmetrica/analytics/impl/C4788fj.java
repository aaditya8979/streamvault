package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.model.SdkInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4788fj implements SdkEnvironmentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb f66790b = new Jb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f66791c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SdkEnvironment f66792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f66793e;

    public C4788fj(@NotNull Context context) {
        this.f66789a = context;
        this.f66792d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("7.14.0", "50145656", AbstractC4814gj.a()), "phone", Jb.a(context.getResources().getConfiguration()));
    }

    public final synchronized void a(@NotNull Configuration configuration) {
        this.f66790b.getClass();
        List listA = Jb.a(configuration);
        if (!tn.p.f(getSdkEnvironment().getLocales(), listA)) {
            this.f66792d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, listA, 31, null);
            Iterator it = this.f66791c.iterator();
            while (it.hasNext()) {
                ((AbstractC5029p5) ((InterfaceC4762ej) it.next())).d();
            }
        }
    }

    public final synchronized void a(@Nullable ScreenInfo screenInfo) {
        float f10;
        if (screenInfo != null) {
            if (!tn.p.f(screenInfo, getSdkEnvironment().getScreenInfo())) {
                String str = this.f66793e;
                if (str == null) {
                    Context context = this.f66789a;
                    Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                    SafePackageManager safePackageManager = O7.f65687a;
                    try {
                        f10 = context.getResources().getDisplayMetrics().density;
                    } catch (Throwable unused) {
                        f10 = 0.0f;
                    }
                    if (Float.isNaN(f10) || f10 == 0.0f) {
                        str = "phone";
                    } else {
                        int i10 = point.x;
                        int i11 = point.y;
                        if (O7.a(context)) {
                            str = "tv";
                        } else {
                            float f11 = 160 * f10;
                            float f12 = i10;
                            float f13 = f12 / f11;
                            float f14 = i11;
                            float f15 = f14 / f11;
                            str = (Math.sqrt((double) ((f15 * f15) + (f13 * f13))) >= ((double) 7) || zn.n.i(f12 / f10, f14 / f10) >= ((float) 600)) ? "tablet" : "phone";
                        }
                    }
                }
                this.f66792d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                Iterator it = this.f66791c.iterator();
                while (it.hasNext()) {
                    ((AbstractC5029p5) ((InterfaceC4762ej) it.next())).d();
                }
            }
        }
    }

    public final void a(@NotNull InterfaceC4762ej interfaceC4762ej) {
        this.f66791c.add(interfaceC4762ej);
    }

    public final synchronized void a(@Nullable String str) {
        if (str != null) {
            if (!tn.p.f(str, this.f66793e)) {
                this.f66793e = str;
                if (!tn.p.f(str, getSdkEnvironment().getDeviceType())) {
                    this.f66792d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f66791c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC5029p5) ((InterfaceC4762ej) it.next())).d();
                    }
                }
            }
        }
    }

    public final synchronized void a(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            try {
                str = getSdkEnvironment().getAppVersionInfo().getAppVersionName();
            } finally {
            }
        }
        if (str2 == null) {
            str2 = getSdkEnvironment().getAppVersionInfo().getAppBuildNumber();
        }
        AppVersionInfo appVersionInfo = getSdkEnvironment().getAppVersionInfo();
        if (!tn.p.f(appVersionInfo.getAppVersionName(), str) || !tn.p.f(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f66792d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f66791c.iterator();
            while (it.hasNext()) {
                ((AbstractC5029p5) ((InterfaceC4762ej) it.next())).d();
            }
        }
    }

    public final void b(@NotNull InterfaceC4762ej interfaceC4762ej) {
        this.f66791c.remove(interfaceC4762ej);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    @NotNull
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f66792d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        tn.p.C("sdkEnvironment");
        return null;
    }
}
