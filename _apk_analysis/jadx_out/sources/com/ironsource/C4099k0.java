package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4099k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4099k0 f32103a = new C4099k0();

    private C4099k0() {
    }

    @SuppressLint({"WrongConstant", "NewApi"})
    public static final int a() {
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return SdkExtensions.getExtensionVersion(1000000);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return 0;
        }
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public static final MeasurementManager a(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        if (Build.VERSION.SDK_INT < 30 || a() < 4) {
            return null;
        }
        try {
            return (MeasurementManager) context.getSystemService(MeasurementManager.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ void b() {
    }
}
