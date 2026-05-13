package com.inmobi.media;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorEntity;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.sdk.AppLovinSdk;
import com.inmobi.media.AbstractC3907zc;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.signals.adinfo.SignalCollector;
import com.unity3d.services.core.fid.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3907zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f28630a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SignalsConfig f28631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f28632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bn.g f28633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bn.g f28634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f28635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final sn.p f28636g;

    static {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) Y3.f26611a.a(SignalsConfig.class);
        f28631b = signalsConfig;
        String topic = signalsConfig.getPublisherConfig().getAuto().getTopic();
        if (topic.length() == 0) {
            topic = "max_revenue_events";
        }
        f28632c = topic;
        f28633d = kotlin.b.b(new sn.a() { // from class: n9.sc
            @Override // sn.a
            public final Object invoke() {
                return AbstractC3907zc.d();
            }
        });
        f28634e = kotlin.b.b(new sn.a() { // from class: n9.tc
            @Override // sn.a
            public final Object invoke() {
                return Boolean.valueOf(AbstractC3907zc.b());
            }
        });
        f28636g = new sn.p() { // from class: n9.uc
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return AbstractC3907zc.a((Bundle) obj, (String) obj2);
            }
        };
    }

    public static final bn.r a(Bundle bundle, String str) {
        LinkedHashMap linkedHashMapA;
        tn.p.k(str, "topic");
        if (bundle != null) {
            try {
                if (tn.p.f(str, f28632c) && (linkedHashMapA = a(bundle)) != null) {
                    Og.f26086a.getClass();
                    Og.a(linkedHashMapA);
                    linkedHashMapA.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return bn.r.f5635a;
    }

    public static LinkedHashMap a(Bundle bundle) {
        boolean z10;
        Object obj;
        Object obj2;
        tn.p.k(bundle, "data");
        if (!f28630a.get()) {
            return null;
        }
        SignalsConfig signalsConfig = f28631b;
        if (!signalsConfig.getPublisherConfig().getAuto().getEnabled()) {
            return null;
        }
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = signalsConfig.getPublisherConfig().getAuto().getAllowedKeys();
        if (allowedKeys.isEmpty()) {
            return null;
        }
        Objects.toString(allowedKeys.keySet());
        Set<String> setKeySet = bundle.keySet();
        if (setKeySet.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        tn.p.h(setKeySet);
        if (setKeySet.contains("ad_format") && (obj2 = bundle.get("ad_format")) != null) {
            linkedHashMap.put("auto_type", obj2);
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        if (!z10) {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            return null;
        }
        for (Map.Entry<String, SignalsConfig.PublisherConfig.KeyData> entry : allowedKeys.entrySet()) {
            String key = entry.getKey();
            SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
            if (setKeySet.contains(key)) {
                String name = value.getName();
                if (F3.a(name) && (obj = bundle.get(key)) != null) {
                    linkedHashMap.put(name, obj);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    public static void a() {
        if (f28631b.getPublisherConfig().getAuto().getEnabled() && !c() && ((Boolean) f28634e.getValue()).booleanValue() && f28632c.length() != 0 && f28630a.compareAndSet(false, true)) {
            ((SignalCollector) f28633d.getValue()).setupAppLovinCommunicator(f28636g);
        }
    }

    public static final boolean b() {
        try {
            int i10 = AppLovinCommunicator.f7599g;
            if (tn.p.f(AppLovinCommunicator.class.getMethod(Constants.GET_INSTANCE, new Class[0]).getReturnType(), AppLovinCommunicator.class) && tn.p.f(AppLovinCommunicatorSubscriber.class.getMethod("onMessageReceived", Class.forName("com.applovin.communicator.AppLovinCommunicatorMessage")).getReturnType(), Void.TYPE)) {
                return tn.p.f(AppLovinCommunicatorEntity.class.getMethod("getCommunicatorId", new Class[0]).getReturnType(), String.class);
            }
            return false;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public static boolean c() {
        String str;
        Boolean bool = f28635f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            String str2 = AppLovinSdk.VERSION;
            Object obj = AppLovinSdk.class.getField("VERSION").get(null);
            str = obj instanceof String ? (String) obj : null;
        } catch (Throwable unused) {
        }
        if (str == null) {
            str = com.ironsource.Y1.f30690f;
        }
        List<String> incompatibleSdkVer = f28631b.getPublisherConfig().getAuto().getIncompatibleSdkVer();
        Objects.toString(incompatibleSdkVer);
        boolean z10 = tn.p.f(str, com.ironsource.Y1.f30690f) || incompatibleSdkVer.contains(str);
        f28635f = Boolean.valueOf(z10);
        return z10;
    }

    public static final SignalCollector d() {
        return new SignalCollector(cn.v.e(f28632c));
    }
}
