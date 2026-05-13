package com.monetization.ads.quality.base.model.configuration;

import kn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class AdQualityVerifiableNetwork {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdQualityVerifiableNetwork[] $VALUES;
    public static final AdQualityVerifiableNetwork ADMOB;
    public static final AdQualityVerifiableNetwork APPLOVIN;
    public static final AdQualityVerifiableNetwork APPLOVINMAX;
    public static final AdQualityVerifiableNetwork BIGOADS;
    public static final AdQualityVerifiableNetwork CHARTBOOST;
    public static final AdQualityVerifiableNetwork DIGITALTURBINE;
    public static final AdQualityVerifiableNetwork GOOGLE;
    public static final AdQualityVerifiableNetwork INMOBI;
    public static final AdQualityVerifiableNetwork IRONSOURCE;
    public static final AdQualityVerifiableNetwork LEVELPLAY;
    public static final AdQualityVerifiableNetwork MINTEGRAL;
    public static final AdQualityVerifiableNetwork MYTARGET;
    public static final AdQualityVerifiableNetwork PANGLE;
    public static final AdQualityVerifiableNetwork TAPJOY;
    public static final AdQualityVerifiableNetwork UNITYADS;
    public static final AdQualityVerifiableNetwork UNKNOWN;
    public static final AdQualityVerifiableNetwork VUNGLE;
    public static final AdQualityVerifiableNetwork YANDEX;

    static {
        AdQualityVerifiableNetwork adQualityVerifiableNetwork = new AdQualityVerifiableNetwork(0, "APPLOVIN");
        APPLOVIN = adQualityVerifiableNetwork;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork2 = new AdQualityVerifiableNetwork(1, "APPLOVINMAX");
        APPLOVINMAX = adQualityVerifiableNetwork2;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork3 = new AdQualityVerifiableNetwork(2, "BIGOADS");
        BIGOADS = adQualityVerifiableNetwork3;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork4 = new AdQualityVerifiableNetwork(3, "CHARTBOOST");
        CHARTBOOST = adQualityVerifiableNetwork4;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork5 = new AdQualityVerifiableNetwork(4, "DIGITALTURBINE");
        DIGITALTURBINE = adQualityVerifiableNetwork5;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork6 = new AdQualityVerifiableNetwork(5, "GOOGLE");
        GOOGLE = adQualityVerifiableNetwork6;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork7 = new AdQualityVerifiableNetwork(6, "ADMOB");
        ADMOB = adQualityVerifiableNetwork7;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork8 = new AdQualityVerifiableNetwork(7, "INMOBI");
        INMOBI = adQualityVerifiableNetwork8;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork9 = new AdQualityVerifiableNetwork(8, "IRONSOURCE");
        IRONSOURCE = adQualityVerifiableNetwork9;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork10 = new AdQualityVerifiableNetwork(9, "LEVELPLAY");
        LEVELPLAY = adQualityVerifiableNetwork10;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork11 = new AdQualityVerifiableNetwork(10, "MINTEGRAL");
        MINTEGRAL = adQualityVerifiableNetwork11;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork12 = new AdQualityVerifiableNetwork(11, "MYTARGET");
        MYTARGET = adQualityVerifiableNetwork12;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork13 = new AdQualityVerifiableNetwork(12, "PANGLE");
        PANGLE = adQualityVerifiableNetwork13;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork14 = new AdQualityVerifiableNetwork(13, "TAPJOY");
        TAPJOY = adQualityVerifiableNetwork14;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork15 = new AdQualityVerifiableNetwork(14, "UNITYADS");
        UNITYADS = adQualityVerifiableNetwork15;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork16 = new AdQualityVerifiableNetwork(15, "VUNGLE");
        VUNGLE = adQualityVerifiableNetwork16;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork17 = new AdQualityVerifiableNetwork(16, "YANDEX");
        YANDEX = adQualityVerifiableNetwork17;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork18 = new AdQualityVerifiableNetwork(17, "UNKNOWN");
        UNKNOWN = adQualityVerifiableNetwork18;
        AdQualityVerifiableNetwork[] adQualityVerifiableNetworkArr = {adQualityVerifiableNetwork, adQualityVerifiableNetwork2, adQualityVerifiableNetwork3, adQualityVerifiableNetwork4, adQualityVerifiableNetwork5, adQualityVerifiableNetwork6, adQualityVerifiableNetwork7, adQualityVerifiableNetwork8, adQualityVerifiableNetwork9, adQualityVerifiableNetwork10, adQualityVerifiableNetwork11, adQualityVerifiableNetwork12, adQualityVerifiableNetwork13, adQualityVerifiableNetwork14, adQualityVerifiableNetwork15, adQualityVerifiableNetwork16, adQualityVerifiableNetwork17, adQualityVerifiableNetwork18};
        $VALUES = adQualityVerifiableNetworkArr;
        $ENTRIES = kotlin.enums.a.a(adQualityVerifiableNetworkArr);
    }

    private AdQualityVerifiableNetwork(int i10, String str) {
    }

    public static AdQualityVerifiableNetwork valueOf(String str) {
        return (AdQualityVerifiableNetwork) Enum.valueOf(AdQualityVerifiableNetwork.class, str);
    }

    public static AdQualityVerifiableNetwork[] values() {
        return (AdQualityVerifiableNetwork[]) $VALUES.clone();
    }
}
