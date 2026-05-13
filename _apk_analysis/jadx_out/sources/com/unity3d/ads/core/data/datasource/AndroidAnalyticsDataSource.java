package com.unity3d.ads.core.data.datasource;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidAnalyticsDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidAnalyticsDataSource implements AnalyticsDataSource {
    @Override // com.unity3d.ads.core.data.datasource.AnalyticsDataSource
    @Nullable
    public String getUserId() {
        return AndroidPreferences.getString(ClientProperties.getAppName() + BuildConfigApi.UNITY_SHARED_PREFERENCES_SUFIX, "unity.cloud_userid");
    }
}
