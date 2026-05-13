package com.safedk.android.utils;

import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.Q6;
import com.safedk.android.SafeDK;
import io.bidmachine.BidMachine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class SdksMapping {
    private static final String AD_COLONY_ADAPTER_CLASS_NAME = "com.applovin.mediation.adapters.AdColonyMediationAdapter";
    public static final String KEY_INSTALLED_MEDIATION_ADAPTERS = "installed_mediation_adapters";
    public static final String KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS = "class";
    public static final String KEY_INSTALLED_MEDIATION_ADAPTERS_SDK_VERSION = "sdk_version";
    public static final String KEY_INSTALLED_MEDIATION_ADAPTERS_VERSION = "version";
    private static final String TAG = "SdksMapping";
    private static Set<String> redirectSupportedSdks;
    private static boolean topicSdkVersionsUpdated;
    private static TreeMap<String, String> sdkPackageToName = new TreeMap<>(Collections.reverseOrder());
    private static TreeMap<String, String> sdkPackageToUUID = new TreeMap<>(Collections.reverseOrder());
    private static TreeMap<String, String> sdkPackages = new TreeMap<>(Collections.reverseOrder());
    private static TreeMap<String, String> sdkPackageUUIDToVersion = new TreeMap<>(Collections.reverseOrder());
    private static TreeMap<String, String> sdkAdaptersUUID = new TreeMap<>(Collections.reverseOrder());

    static {
        sdkPackageToName.put("io.bidmachine", BidMachine.NAME);
        sdkPackageToUUID.put("io.bidmachine", "b15e56a960628ffab498ee9fff6d7c1d");
        sdkPackages.put("io.bidmachine", "io.bidmachine");
        sdkAdaptersUUID.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "b15e56a960628ffab498ee9fff6d7c1d");
        sdkPackageToName.put(g.f53151y, "Yandex");
        sdkPackageToUUID.put(g.f53151y, "3e33901c9e3dbb997f2acd3343628f45");
        sdkPackages.put(g.f53151y, g.f53151y);
        sdkAdaptersUUID.put("com.applovin.mediation.adapters.YandexMediationAdapter", "3e33901c9e3dbb997f2acd3343628f45");
        sdkPackageToName.put(g.f53130d, "LiftoffMonetize");
        sdkPackageToUUID.put(g.f53130d, "217e8f437c9fc4244d6e74653ac8a8c7");
        sdkPackages.put(g.f53130d, g.f53130d);
        sdkAdaptersUUID.put("com.applovin.mediation.adapters.VungleMediationAdapter", "217e8f437c9fc4244d6e74653ac8a8c7");
        sdkPackageToName.put("com.unity3d.ads", Q6.H1);
        sdkPackages.put("com.unity3d.services.banners", "com.unity3d.ads");
        sdkPackages.put(g.f53138l, "com.unity3d.ads");
        sdkPackageToUUID.put("com.unity3d.ads", "daaea35726ab7cd457ab61d4538fb822");
        sdkPackages.put("com.unity3d.ads", "com.unity3d.ads");
        sdkAdaptersUUID.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "daaea35726ab7cd457ab61d4538fb822");
        sdkPackageToName.put(g.f53132f, "IronSource");
        sdkPackages.put("com.ironsource", g.f53132f);
        sdkPackageToUUID.put(g.f53132f, "b9b88d70c3d018bfbda46cd93ba3ddca");
        sdkPackages.put(g.f53132f, g.f53132f);
        sdkAdaptersUUID.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "b9b88d70c3d018bfbda46cd93ba3ddca");
        sdkPackageToName.put(g.D, "MolocoAds");
        sdkPackageToUUID.put(g.D, "213ac5b6803852323d73a1292440d7be");
        sdkPackages.put(g.D, g.D);
        sdkAdaptersUUID.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "213ac5b6803852323d73a1292440d7be");
        sdkPackageToName.put(g.f53141o, "Mintegral");
        sdkPackages.put("com.mbridge.msdk", g.f53141o);
        sdkPackageToUUID.put(g.f53141o, "1be9e72506f3307ce6a9e78d26d65bd0");
        sdkPackages.put(g.f53141o, g.f53141o);
        sdkAdaptersUUID.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "1be9e72506f3307ce6a9e78d26d65bd0");
        sdkPackageToName.put(g.f53142p, "DTExchange");
        sdkPackages.put("com.fyber.inneractive", g.f53142p);
        sdkPackageToUUID.put(g.f53142p, "d41ed920405e4bd14f3a42cd93c43d89");
        sdkPackages.put(g.f53142p, g.f53142p);
        sdkAdaptersUUID.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "d41ed920405e4bd14f3a42cd93c43d89");
        sdkPackageToName.put(g.f53135i, "InMobi");
        sdkPackageToUUID.put(g.f53135i, "7eac188d3286b05ccbba774f63a2c049");
        sdkPackages.put(g.f53135i, g.f53135i);
        sdkAdaptersUUID.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "7eac188d3286b05ccbba774f63a2c049");
        sdkPackageToName.put(g.f53134h, "AdMob");
        sdkPackages.put("com.google.android.gms.internal", g.f53134h);
        sdkPackages.put(MobileAds.ERROR_DOMAIN, g.f53134h);
        sdkPackageToUUID.put(g.f53134h, "29015bbfcc182d80e7f75bd2c38e4521");
        sdkPackages.put(g.f53134h, g.f53134h);
        sdkAdaptersUUID.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "29015bbfcc182d80e7f75bd2c38e4521");
        sdkPackageToName.put(g.f53147u, "Pangle");
        sdkPackageToUUID.put(g.f53147u, "dd2971b0681141d57b221687791ad1bd");
        sdkPackages.put(g.f53147u, g.f53147u);
        sdkAdaptersUUID.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "dd2971b0681141d57b221687791ad1bd");
        sdkPackageToName.put(g.f53127a, "AppLovin");
        sdkPackageToUUID.put(g.f53127a, "74616804a7dc29147dfb0afe122a9fd2");
        sdkPackages.put(g.f53127a, g.f53127a);
        sdkAdaptersUUID.put(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f52169i, "74616804a7dc29147dfb0afe122a9fd2");
    }

    public static Set<String> getAllSdkNames() {
        return new HashSet(sdkPackageToName.values());
    }

    public static Set<String> getAllSdkPackages() {
        return sdkPackageToName.keySet();
    }

    public static Map<String, String> getAllSdkVersionsMap() {
        return sdkPackageUUIDToVersion;
    }

    public static String getMainSdkPackage(String str) {
        return g.f53139m.equals(str) ? "com.unity3d.ads" : g.f53133g.equals(str) ? g.f53132f : str;
    }

    public static Set<String> getRedirectSupportedSdks() {
        Logger.d(TAG, "get redirect supported sdks started, sdkAdaptersUUID=" + sdkAdaptersUUID.values());
        return !isTopicSdkVersionsUpdated() ? new HashSet(sdkAdaptersUUID.values()) : redirectSupportedSdks;
    }

    public static TreeMap<String, String> getSdkAdaptersUUID() {
        return sdkAdaptersUUID;
    }

    public static String getSdkNameByPackage(String str) {
        return sdkPackageToName.get(str);
    }

    public static String getSdkPackageByClass(String str) {
        if (str != null) {
            for (String str2 : sdkPackages.keySet()) {
                if (str.startsWith(str2)) {
                    return sdkPackages.get(str2);
                }
            }
        }
        return null;
    }

    public static String getSdkPackageByPackageUUID(String str) {
        for (Map.Entry<String, String> entry : sdkPackageToUUID.entrySet()) {
            if (entry.getValue().equals(str)) {
                Logger.d(TAG, "get sdk package by package UUID returns " + entry.getKey() + " for UUID " + entry.getValue());
                return entry.getKey();
            }
        }
        Logger.d(TAG, "sdk UUID not valid: " + str);
        return null;
    }

    public static String getSdkUUIDByPackage(String str) {
        if (SafeDK.f51475a.equals(str)) {
            return str;
        }
        String str2 = sdkPackageToUUID.get(str);
        Logger.d(TAG, "get sdk UUID by package " + str + " , result = " + str2);
        return str2;
    }

    public static String getSdkVersionByPackage(String str) {
        Logger.d(TAG, "get sdk version by package started, package name = " + str);
        String sdkUUIDByPackage = getSdkUUIDByPackage(str);
        Logger.d(TAG, "get sdk version by package, uuid = " + sdkUUIDByPackage);
        if (sdkUUIDByPackage != null) {
            return sdkPackageUUIDToVersion.get(sdkUUIDByPackage);
        }
        return null;
    }

    public static void init() {
        printAllSdkVersions();
    }

    public static void initForInitTests() {
        sdkPackages.put("com.applovin.adview.StaticInterstitialActivity", g.f53127a);
        sdkPackages.put("com.google.ads.AdActivity1", g.f53134h);
        sdkPackages.put("com.inmobi.StaticInterstitialActivity", g.f53135i);
    }

    public static boolean isSameSdkByPackages(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String sdkNameByPackage = getSdkNameByPackage(str);
        String sdkNameByPackage2 = getSdkNameByPackage(str2);
        if (sdkNameByPackage == null || sdkNameByPackage2 == null) {
            return false;
        }
        return sdkNameByPackage.equals(sdkNameByPackage2) || sdkNameByPackage.regionMatches(false, 0, sdkNameByPackage2, 0, 5);
    }

    public static boolean isTopicSdkVersionsUpdated() {
        return topicSdkVersionsUpdated;
    }

    public static void printAllSdkVersions() {
        Logger.d(TAG, "print all sdk versions, sdkPackages=" + sdkPackages.toString());
        Logger.d(TAG, "print all sdk versions, sdkPackageToName=" + sdkPackageToName.toString());
        Logger.d(TAG, "print all sdk versions, sdkPackageToUUID=" + sdkPackageToUUID.toString());
        Logger.d(TAG, "print all sdk versions, sdkPackageUUIDToVersion=" + sdkPackageUUIDToVersion.toString());
        Logger.d(TAG, "print all sdk versions, sdkAdaptersUUID=" + sdkAdaptersUUID.toString());
        Iterator<Map.Entry<String, String>> it = sdkPackageToName.entrySet().iterator();
        Logger.d(TAG, "print all sdk versions, sdks detected: " + sdkPackageToName.entrySet().size() + " sdks with versions: " + sdkPackageUUIDToVersion.entrySet().size());
        while (it.hasNext()) {
            String key = it.next().getKey();
            Logger.d(TAG, String.format("print all sdk versions, sdk package: %s, version: %s", key, sdkPackageUUIDToVersion.get(key)));
        }
    }

    public static void setMaxAdapterVersions(Bundle bundle) {
        try {
            Logger.d(TAG, "get max adapter versions started, Bundle = " + bundle);
            if (!bundle.containsKey(KEY_INSTALLED_MEDIATION_ADAPTERS)) {
                Logger.d(TAG, "get max adapter versions, no adapter class version received from MAX");
                return;
            }
            Logger.d(TAG, "get max adapter versions, processing " + KEY_INSTALLED_MEDIATION_ADAPTERS.toUpperCase());
            ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(KEY_INSTALLED_MEDIATION_ADAPTERS);
            if (parcelableArrayList != null) {
                for (Bundle bundle2 : parcelableArrayList) {
                    String string = bundle2.getString(KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS);
                    String string2 = bundle2.getString("sdk_version");
                    Logger.d(TAG, "get max adapter versions, class name = " + string);
                    Logger.d(TAG, "get max adapter versions, class version = " + string2);
                    if (string2 != null && string2.length() > 0) {
                        updateSdkVersionIfNeeded(string, string2);
                    } else if (string.equals(AD_COLONY_ADAPTER_CLASS_NAME)) {
                        String string3 = bundle2.getString("version");
                        Logger.d(TAG, "get max adapter versions, ad colony adapter version special handling. version is " + string3);
                        updateSdkVersionIfNeeded(string, string3);
                    } else {
                        Logger.d(TAG, "get max adapter versions, adapter sdk_version field is empty for class " + string);
                    }
                    Logger.d(TAG, "get max adapter versions, class name " + string + " : " + getRedirectSupportedSdks().contains(string));
                }
                setTopicSdkVersionsUpdated();
            } else {
                Logger.d(TAG, "extracting value for key installed_mediation_adapters produced null value, skipping");
            }
            printAllSdkVersions();
        } catch (Throwable th2) {
            Logger.e(TAG, "get max adapter versions, exception extracting " + KEY_INSTALLED_MEDIATION_ADAPTERS.toUpperCase(), th2);
        }
    }

    public static void setTopicSdkVersionsUpdated() {
        topicSdkVersionsUpdated = true;
        Logger.d(TAG, "set topic sdk versions updated, sdkPackageToUUID=" + sdkPackageToUUID.toString());
        Logger.d(TAG, "set topic sdk versions updated, redirectSupprotedSdks=" + redirectSupportedSdks.toString());
    }

    public static void updateSdkVersionIfNeeded(String str, String str2) {
        if (isTopicSdkVersionsUpdated()) {
            return;
        }
        if (!sdkAdaptersUUID.containsKey(str)) {
            Logger.d(TAG, "Cannot find UUID for package " + str);
            return;
        }
        String str3 = sdkAdaptersUUID.get(str);
        Logger.d(TAG, "UUID for class " + str + " is " + str3);
        if (!sdkPackageUUIDToVersion.containsKey(str3) || (sdkPackageUUIDToVersion.containsKey(str3) && str2 != null && str2.length() > 0 && !sdkPackageUUIDToVersion.get(str3).equals(str2))) {
            sdkPackageUUIDToVersion.put(str3, str2);
            Logger.d(TAG, "update sdk version if needed, class " + str + " (uuid " + str3 + ") updated to " + str2);
        }
        if (redirectSupportedSdks == null) {
            redirectSupportedSdks = new HashSet();
        }
        if (sdkAdaptersUUID.values().contains(str3)) {
            Logger.d(TAG, "Adding " + str + " , package UUID " + str3 + " to redirect supported sdks");
            redirectSupportedSdks.add(str3);
        } else {
            Logger.d(TAG, "Not adding " + str + " , package UUID " + str3 + " to redirect supported sdks");
        }
        Logger.d(TAG, "get redirect supported sdks : " + getRedirectSupportedSdks().toString());
    }
}
