package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.common_adapter_internal.b;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f50932a;

    public x(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f50932a = context;
    }

    public final DisplayMetrics a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    @RequiresApi(30)
    public final DisplayMetrics b(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.density = this.f50932a.getResources().getDisplayMetrics().density;
        displayMetrics.densityDpi = this.f50932a.getResources().getDisplayMetrics().densityDpi;
        displayMetrics.widthPixels = windowManager.getCurrentWindowMetrics().getBounds().width();
        displayMetrics.heightPixels = windowManager.getCurrentWindowMetrics().getBounds().height();
        return displayMetrics;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w
    @NotNull
    public b invoke() {
        WindowManager windowManager = (WindowManager) ContextCompat.getSystemService(this.f50932a, WindowManager.class);
        if (windowManager == null) {
            return new b(0, 0, 0.0f, 0.0f, 0, 0.0f);
        }
        DisplayMetrics displayMetricsB = Build.VERSION.SDK_INT >= 30 ? b(windowManager) : a(windowManager);
        int i10 = displayMetricsB.widthPixels;
        return new b(i10, displayMetricsB.heightPixels, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h.a(i10, displayMetricsB.density), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h.a(displayMetricsB.heightPixels, displayMetricsB.density), displayMetricsB.densityDpi, displayMetricsB.density);
    }
}
