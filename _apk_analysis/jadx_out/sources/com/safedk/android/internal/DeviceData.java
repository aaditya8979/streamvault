package com.safedk.android.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.i;
import com.safedk.android.utils.k;

/* JADX INFO: loaded from: classes5.dex */
public class DeviceData implements AppLovinCommunicatorSubscriber {
    private static final String A = "is_ad_tracking_enabled";
    private static final String B = "enduser_id";
    private static final String C = "app_version_name";
    private static final String D = "app_version";
    private static final String E = "init_success";
    private static final String F = "value";
    private static final String G = "user_id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f52859a = "sdk_key";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f52860l = "DeviceData";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f52861m = "values";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f52862n = "operator";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f52863o = "lte";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f52864p = "gte";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f52865q = "deactivationPercentage";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f52866r = "device_type";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f52867s = "applovin_random_token";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f52868t = "device_brand";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f52869u = "device_model";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f52870v = "device_revision";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f52871w = "os_version";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f52872x = "safedk_version";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f52873y = "applovin_version";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f52874z = "from_store";
    private i H;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f52875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f52876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f52877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f52878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f52879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f52880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f52881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f52882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f52883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f52884k = false;

    private enum CriteriaField {
        deviceModel,
        manufacturer,
        country,
        appVersionCode,
        androidVersion,
        osVersion,
        appDeviceIDs,
        age,
        region
    }

    private DeviceData() {
    }

    public DeviceData(final Context context, i iVar) {
        Logger.d(f52860l, "DeviceData started");
        this.H = iVar;
        this.f52875b = Build.MODEL;
        this.f52876c = Build.MANUFACTURER.toLowerCase();
        this.f52878e = Build.VERSION.SDK_INT;
        try {
            new Thread(new Runnable() { // from class: com.safedk.android.internal.DeviceData.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        DeviceData.this.f52884k = DeviceData.this.a(context);
                    } catch (Throwable th2) {
                    }
                }
            }).start();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f52879f = packageInfo.versionName;
            this.f52877d = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Logger.e(f52860l, "Error getting device data", e10);
        } catch (Throwable th2) {
            Logger.e(f52860l, "Error getting device data", th2);
        }
        AppLovinBridge.registerToReceiveSafeDKSettings(this);
        AppLovinBridge.registerToReceiveUserInfo(this);
    }

    public static float a(String str, String str2) {
        return (Math.abs((str + str2).hashCode()) % 100000) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo == null) {
                return false;
            }
            Logger.d(f52860l, "Ad Tracking id is " + advertisingIdInfo.getId());
            return !advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Throwable th2) {
            return false;
        }
    }

    public String a() {
        if (this.f52882i != null) {
            return this.f52882i;
        }
        if (this.H == null || this.H.n() != this.f52877d) {
            return null;
        }
        return this.H.m();
    }

    public String b() {
        if (this.f52881h != null) {
            return this.f52881h;
        }
        if (this.H == null || this.H.n() != this.f52877d) {
            return null;
        }
        return this.H.o();
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("package", SafeDK.getInstance().l().getPackageName());
        bundle.putString("platform", "android");
        bundle.putString(f52867s, b());
        bundle.putString(f52873y, k.a());
        bundle.putString("safedk_version", com.safedk.android.a.f51503a);
        bundle.putString("device_type", this.f52880g);
        bundle.putString(f52869u, Build.MODEL);
        bundle.putString(f52868t, Build.MANUFACTURER);
        bundle.putString(f52870v, Build.DEVICE);
        bundle.putString("os_version", Build.VERSION.RELEASE);
        bundle.putString(D, String.valueOf(this.f52877d));
        bundle.putString("app_version_name", this.f52879f);
        SafeDK.getInstance();
        bundle.putBoolean(f52874z, SafeDK.a());
        bundle.putString(B, this.f52883j);
        bundle.putBoolean(A, this.f52884k);
        return bundle;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f51529a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Logger.d(f52860l, "message received " + appLovinCommunicatorMessage.getMessageData());
        Bundle messageData = appLovinCommunicatorMessage.getMessageData();
        if (messageData.containsKey(E)) {
            if (this.H != null) {
                this.f52881h = messageData.getString(f52867s);
                this.f52882i = messageData.getString("sdk_key");
                this.H.a(this.f52877d, this.f52881h, this.f52882i);
                this.f52880g = messageData.getString("device_type");
                SdksMapping.setMaxAdapterVersions(messageData);
                if (Boolean.parseBoolean(messageData.getString(E))) {
                    Logger.d(f52860l, "AppLovinSdk reported success to retrieve settings");
                    SafeDK.getInstance().a(messageData, true);
                } else {
                    SafeDK.getInstance().a(true);
                    Logger.d(f52860l, "AppLovinSdk reported a failure to retrieve settings. The saved settings from a previous session will be used.");
                }
            } else {
                Logger.d(f52860l, "AppLovinSdk prefs is null");
            }
        } else if (messageData.containsKey("value")) {
            this.f52883j = messageData.getString("value");
        } else if (messageData.containsKey(G)) {
            this.f52883j = messageData.getString(G);
        }
        SafeDK.Z();
    }
}
