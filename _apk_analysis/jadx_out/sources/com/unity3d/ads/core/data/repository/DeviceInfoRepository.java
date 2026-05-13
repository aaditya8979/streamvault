package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import go.d;
import go.l;
import hn.c;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceInfoRepository.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface DeviceInfoRepository {
    @NotNull
    StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    @NotNull
    l<AllowedPiiOuterClass.AllowedPii> getAllowedPii();

    @Nullable
    String getAnalyticsUserId();

    @NotNull
    String getAppName();

    @Nullable
    Object getAuidByteString(@NotNull c<? super ByteString> cVar);

    @Nullable
    Object getAuidString(@NotNull c<? super String> cVar);

    @NotNull
    String getConnectionTypeStr();

    int getCurrentUiTheme();

    @NotNull
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    boolean getHasInternet();

    @Nullable
    Object getIdfi(@NotNull c<? super String> cVar);

    @NotNull
    List<String> getLocaleList();

    @NotNull
    String getManufacturer();

    @NotNull
    String getModel();

    @NotNull
    String getOrientation();

    @NotNull
    String getOsVersion();

    @NotNull
    PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    long getSystemBootTime();

    @Nullable
    Object getUnityBuildGuid(@NotNull c<? super String> cVar);

    @NotNull
    d<VolumeSettingsChange> getVolumeSettingsChange();

    @Nullable
    Object staticDeviceInfo(@NotNull c<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> cVar);
}
