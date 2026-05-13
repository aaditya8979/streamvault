package com.moloco.sdk.internal.services;

import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import androidx.compose.runtime.internal.StabilityInferred;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class n implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f47531b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f47532c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f47533a;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public n(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f47533a = context;
    }

    @Override // com.moloco.sdk.internal.services.m
    public boolean a() {
        return Settings.Secure.getInt(this.f47533a.getContentResolver(), "reduce_bright_colors_activated") == 1;
    }

    @Override // com.moloco.sdk.internal.services.m
    public boolean b() {
        Object systemService = this.f47533a.getSystemService("accessibility");
        tn.p.i(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager) systemService).isEnabled() && Settings.Secure.getInt(this.f47533a.getContentResolver(), "accessibility_large_pointer_icon", 0) == 1;
    }

    @Override // com.moloco.sdk.internal.services.m
    public boolean c() {
        try {
            Object systemService = this.f47533a.getSystemService("captioning");
            tn.p.i(systemService, "null cannot be cast to non-null type android.view.accessibility.CaptioningManager");
            return ((CaptioningManager) systemService).isEnabled();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.moloco.sdk.internal.services.m
    public float getFontScale() {
        Object systemService = this.f47533a.getSystemService("accessibility");
        tn.p.i(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        if (((AccessibilityManager) systemService).isEnabled()) {
            return this.f47533a.getResources().getConfiguration().fontScale;
        }
        return 1.0f;
    }
}
