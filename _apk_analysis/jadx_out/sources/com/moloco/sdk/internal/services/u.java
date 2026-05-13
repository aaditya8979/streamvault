package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.R$bool;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class u implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f47546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final bn.g f47547b;

    public u(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f47546a = context;
        this.f47547b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.services.s
            @Override // sn.a
            public final Object invoke() {
                return Boolean.valueOf(u.b(this.f47537b));
            }
        });
    }

    public static final boolean b(u uVar) {
        return uVar.f47546a.getResources().getBoolean(R$bool.isTablet);
    }

    @Override // com.moloco.sdk.internal.services.j0
    @Nullable
    public Boolean a() {
        try {
            Object systemService = this.f47546a.getSystemService("sensor");
            tn.p.i(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            return Boolean.valueOf(((SensorManager) systemService).getDefaultSensor(4) != null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.moloco.sdk.internal.services.j0
    @NotNull
    public i0 b() {
        String networkOperatorName;
        String str = Build.MANUFACTURER;
        String str2 = str == null ? "" : str;
        String str3 = Build.MODEL;
        String str4 = str3 == null ? "" : str3;
        String str5 = Build.HARDWARE;
        String str6 = str5 == null ? "" : str5;
        boolean zE = e();
        String str7 = Build.VERSION.RELEASE;
        tn.p.j(str7, "RELEASE");
        int i10 = Build.VERSION.SDK_INT;
        String language = Locale.getDefault().getLanguage();
        tn.p.j(language, "getLanguage(...)");
        TelephonyManager telephonyManager = (TelephonyManager) ContextCompat.getSystemService(this.f47546a, TelephonyManager.class);
        if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
            networkOperatorName = "";
        }
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        String str8 = str5 == null ? "" : str5;
        String str9 = Build.BRAND;
        return new i0(str2, str4, str6, zE, "android", str7, i10, language, networkOperatorName, f10, jCurrentTimeMillis, str8, str9 == null ? "" : str9);
    }

    @Override // com.moloco.sdk.internal.services.j0
    @NotNull
    public String c() {
        String language = Locale.getDefault().getLanguage();
        tn.p.j(language, "getLanguage(...)");
        return language;
    }

    @Override // com.moloco.sdk.internal.services.j0
    @Nullable
    public String d() {
        Object systemService = this.f47546a.getSystemService("input_method");
        tn.p.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) systemService).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype != null) {
            return currentInputMethodSubtype.getLocale();
        }
        return null;
    }

    public final boolean e() {
        return ((Boolean) this.f47547b.getValue()).booleanValue();
    }

    @Override // com.moloco.sdk.internal.services.j0
    @NotNull
    public i0 invoke() {
        return b();
    }
}
