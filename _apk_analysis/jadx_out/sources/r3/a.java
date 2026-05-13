package r3;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.mediationsdk.ISBannerSize;
import com.unity3d.ironsourceads.AdSize;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: IronSourceAdapterUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static AdError a(int i10, @NonNull String str) {
        return new AdError(i10, str, IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN);
    }

    public static AdError b(int i10, @NonNull String str) {
        return new AdError(i10, str, IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
    }

    public static <T> boolean c(@NonNull String str, @NonNull ConcurrentHashMap<String, WeakReference<T>> concurrentHashMap) {
        WeakReference<T> weakReference = concurrentHashMap.get(str);
        return weakReference == null || weakReference.get() == null;
    }

    @NonNull
    public static AdSize d(@NonNull Context context, @NonNull com.google.android.gms.ads.AdSize adSize) {
        com.google.android.gms.ads.AdSize adSize2 = com.google.android.gms.ads.AdSize.BANNER;
        com.google.android.gms.ads.AdSize adSize3 = com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE;
        com.google.android.gms.ads.AdSize adSize4 = com.google.android.gms.ads.AdSize.LARGE_BANNER;
        com.google.android.gms.ads.AdSize adSize5 = com.google.android.gms.ads.AdSize.LEADERBOARD;
        com.google.android.gms.ads.AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, new ArrayList(Arrays.asList(adSize2, adSize3, adSize4, adSize5)));
        if (adSizeFindClosestSize != null && !adSize2.equals(adSizeFindClosestSize)) {
            return adSize3.equals(adSizeFindClosestSize) ? AdSize.mediumRectangle() : adSize4.equals(adSizeFindClosestSize) ? AdSize.large() : adSize5.equals(adSizeFindClosestSize) ? AdSize.leaderboard() : AdSize.banner();
        }
        return AdSize.banner();
    }

    public static String e() {
        return "9.2.0.0";
    }

    @Nullable
    public static ISBannerSize f(@NonNull Context context, @NonNull com.google.android.gms.ads.AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        com.google.android.gms.ads.AdSize adSize2 = com.google.android.gms.ads.AdSize.BANNER;
        arrayList.add(adSize2);
        com.google.android.gms.ads.AdSize adSize3 = com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE;
        arrayList.add(adSize3);
        com.google.android.gms.ads.AdSize adSize4 = com.google.android.gms.ads.AdSize.LARGE_BANNER;
        arrayList.add(adSize4);
        com.google.android.gms.ads.AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize == null) {
            return null;
        }
        return adSize2.equals(adSizeFindClosestSize) ? ISBannerSize.BANNER : adSize3.equals(adSizeFindClosestSize) ? ISBannerSize.RECTANGLE : adSize4.equals(adSizeFindClosestSize) ? ISBannerSize.LARGE : new ISBannerSize(adSizeFindClosestSize.getWidth(), adSizeFindClosestSize.getHeight());
    }

    public static String g() {
        return "AdMob" + h(e()) + "SDK" + h(MobileAds.getVersion().toString()) + "iAds511";
    }

    public static String h(@NonNull String str) {
        return str.replace(".", "");
    }

    public static AdError i(@NonNull Context context, @NonNull String str) {
        if (!(context instanceof Activity)) {
            return new AdError(102, "IronSource requires an Activity context to load ads.", IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN);
        }
        if (TextUtils.isEmpty(str)) {
            return new AdError(101, "Missing or invalid instance ID.", IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN);
        }
        return null;
    }
}
