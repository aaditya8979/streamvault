package com.moloco.sdk.internal.services;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.services.a;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f47358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j0 f47359b;

    public c(@NotNull Context context, @NotNull j0 j0Var) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(j0Var, "deviceInfoService");
        this.f47358a = context;
        this.f47359b = j0Var;
    }

    @Override // com.moloco.sdk.internal.services.b
    public boolean a() {
        Object systemService = this.f47358a.getSystemService("connectivity");
        tn.p.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return b((ConnectivityManager) systemService);
    }

    @Override // com.moloco.sdk.internal.services.b
    @Nullable
    public Integer b() {
        Object systemService = this.f47358a.getSystemService("phone");
        tn.p.i(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() == 0) {
            return null;
        }
        String strSubstring = networkOperator.substring(3);
        tn.p.j(strSubstring, "substring(...)");
        return Integer.valueOf(Integer.parseInt(strSubstring));
    }

    @RequiresApi(24)
    public final boolean b(ConnectivityManager connectivityManager) {
        return connectivityManager.getRestrictBackgroundStatus() == 3;
    }

    @Override // com.moloco.sdk.internal.services.b
    @NotNull
    public a c() {
        NetworkCapabilities networkCapabilities;
        Object systemService = this.f47358a.getSystemService("connectivity");
        tn.p.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager.getActiveNetwork() != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
            return networkCapabilities.hasTransport(1) ? a.c.f47112a : networkCapabilities.hasTransport(0) ? new a.C0580a(this.f47359b.invoke().g()) : a.b.f47111a;
        }
        return a.b.f47111a;
    }

    @Override // com.moloco.sdk.internal.services.b
    @Nullable
    public Integer d() {
        Object systemService = this.f47358a.getSystemService("phone");
        tn.p.i(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() == 0) {
            return null;
        }
        String strSubstring = networkOperator.substring(0, 3);
        tn.p.j(strSubstring, "substring(...)");
        return Integer.valueOf(Integer.parseInt(strSubstring));
    }

    @Override // com.moloco.sdk.internal.services.b
    @NotNull
    public a invoke() {
        return c();
    }
}
