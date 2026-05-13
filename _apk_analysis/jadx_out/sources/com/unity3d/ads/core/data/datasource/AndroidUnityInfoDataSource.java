package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import bo.d0;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.preferences.AndroidPreferences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidUnityInfoDataSource.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidUnityInfoDataSource {

    @NotNull
    private final String prefName;

    public AndroidUnityInfoDataSource(@NotNull Context context) {
        p.k(context, "applicationContext");
        this.prefName = context.getPackageName() + BuildConfigApi.UNITY_SHARED_PREFERENCES_SUFIX;
    }

    private final String getPlayerPrefId(String str) {
        String string = AndroidPreferences.getString(this.prefName, str);
        if (string == null) {
            return null;
        }
        if (d0.u0(string)) {
            string = null;
        }
        return string;
    }

    @Nullable
    public final String getUnityInstallationId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_INSTALLATION_ID);
    }

    @Nullable
    public final String getUnityMegaSessionId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_MEGA_SESSION_ID);
    }
}
