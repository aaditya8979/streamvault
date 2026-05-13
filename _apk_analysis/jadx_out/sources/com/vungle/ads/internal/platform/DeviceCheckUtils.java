package com.vungle.ads.internal.platform;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.provider.Settings;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DeviceCheckUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b*\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/platform/DeviceCheckUtils;", "", "()V", "getSensorCount", "", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "hasSystemAlertWindowPermission", "", "isEmulator", "isProxyEnabled", "isVpnConnected", "isEnabled", "Landroid/net/ProxyInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceCheckUtils {

    @NotNull
    public static final DeviceCheckUtils INSTANCE = new DeviceCheckUtils();

    private DeviceCheckUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isEnabled(android.net.ProxyInfo r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r5.getHost()
            r2 = 1
            if (r1 == 0) goto L18
            int r1 = r1.length()
            if (r1 <= 0) goto L13
            r1 = r2
            goto L14
        L13:
            r1 = r0
        L14:
            if (r1 != r2) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r1 == 0) goto L23
            int r1 = r5.getPort()
            if (r1 <= 0) goto L23
            r1 = r2
            goto L24
        L23:
            r1 = r0
        L24:
            android.net.Uri r3 = r5.getPacFileUrl()
            if (r3 == 0) goto L38
            android.net.Uri r5 = r5.getPacFileUrl()
            android.net.Uri r3 = android.net.Uri.EMPTY
            boolean r5 = tn.p.f(r5, r3)
            if (r5 != 0) goto L38
            r5 = r2
            goto L39
        L38:
            r5 = r0
        L39:
            if (r1 != 0) goto L3d
            if (r5 == 0) goto L3e
        L3d:
            r0 = r2
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.platform.DeviceCheckUtils.isEnabled(android.net.ProxyInfo):boolean");
    }

    public final int getSensorCount(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        Object systemService = context.getSystemService("sensor");
        p.i(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getSensorList(-1).size();
    }

    public final boolean hasSystemAlertWindowPermission(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return Settings.canDrawOverlays(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isEmulator() {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.platform.DeviceCheckUtils.isEmulator():boolean");
    }

    public final boolean isProxyEnabled(@NotNull Context context) {
        Object objM7534constructorimpl;
        boolean zIsEnabled;
        p.k(context, GAMConfig.KEY_CONTEXT);
        try {
            Result.a aVar = Result.Companion;
            Object systemService = context.getSystemService("connectivity");
            p.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                zIsEnabled = false;
            } else {
                p.j(activeNetwork, "cm.activeNetwork ?: return@runCatching false");
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                zIsEnabled = isEnabled(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            objM7534constructorimpl = Result.m7534constructorimpl(Boolean.valueOf(zIsEnabled));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = bool;
        }
        return ((Boolean) objM7534constructorimpl).booleanValue();
    }

    public final boolean isVpnConnected(@NotNull Context context) {
        Object objM7534constructorimpl;
        p.k(context, GAMConfig.KEY_CONTEXT);
        try {
            Result.a aVar = Result.Companion;
            Object systemService = context.getSystemService("connectivity");
            p.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            p.j(allNetworks, "cm.allNetworks");
            int length = allNetworks.length;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i10]);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            objM7534constructorimpl = Result.m7534constructorimpl(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = bool;
        }
        return ((Boolean) objM7534constructorimpl).booleanValue();
    }
}
