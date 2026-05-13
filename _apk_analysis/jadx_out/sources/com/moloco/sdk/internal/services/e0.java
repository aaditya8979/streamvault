package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import androidx.compose.runtime.internal.StabilityInferred;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class e0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f47373a;

    public e0(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f47373a = context;
    }

    @Override // com.moloco.sdk.internal.services.d0
    public int a() {
        Intent intentRegisterReceiver = this.f47373a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("status", 1);
        }
        return 1;
    }

    @Override // com.moloco.sdk.internal.services.d0
    public int b() {
        Intent intentRegisterReceiver = this.f47373a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("scale", -1);
        }
        return -1;
    }

    @Override // com.moloco.sdk.internal.services.d0
    public boolean c() {
        Object systemService = this.f47373a.getSystemService("power");
        tn.p.i(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode();
    }
}
