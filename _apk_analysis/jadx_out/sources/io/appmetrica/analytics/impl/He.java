package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public abstract class He {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final De f65316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ee f65317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Fe f65318c;

    static {
        NetworkType networkType = NetworkType.UNDEFINED;
        f65316a = new De(networkType);
        f65317b = new Ee(networkType);
        f65318c = new Fe(2);
    }

    public static NetworkType a(ConnectivityManager connectivityManager) {
        NetworkInfo networkInfo;
        NetworkType networkType = NetworkType.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!AndroidUtils.isApiAchieved(29) ? activeNetwork != null && ((networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || networkInfo.isConnected()) : activeNetwork != null) {
            return NetworkType.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return networkType;
        }
        for (Integer num : f65317b.f65193a.keySet()) {
            if (networkCapabilities.hasTransport(num.intValue())) {
                return (NetworkType) f65317b.a(num);
            }
        }
        return networkType;
    }

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb2 = new StringBuilder(language);
        String script = locale.getScript();
        if (!TextUtils.isEmpty(script)) {
            sb2.append('-');
            sb2.append(script);
        }
        if (!TextUtils.isEmpty(country)) {
            sb2.append('_');
            sb2.append(country);
        }
        return sb2.toString();
    }
}
