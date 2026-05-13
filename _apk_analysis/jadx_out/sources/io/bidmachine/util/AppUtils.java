package io.bidmachine.util;

import android.content.Context;
import android.security.NetworkSecurityPolicy;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AppUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"Lio/bidmachine/util/AppUtils;", "", "()V", "canUseCleartextTraffic", "", "getAppName", "", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "getAppVersion", "isDebuggable", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AppUtils {

    @NotNull
    public static final AppUtils INSTANCE = new AppUtils();

    private AppUtils() {
    }

    public static final boolean canUseCleartextTraffic() {
        Boolean bool = AppUtilsKt.isCleartextTrafficPermitted;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        AppUtilsKt.isCleartextTrafficPermitted = Boolean.valueOf(z10);
        return z10;
    }

    @NotNull
    public static final String getAppName(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return AppUtilsKt.getAppName(context);
    }

    @Nullable
    public static final String getAppVersion(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return AppUtilsKt.getAppVersion(context);
    }

    public static final boolean isDebuggable(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return AppUtilsKt.isDebuggable(context);
    }
}
