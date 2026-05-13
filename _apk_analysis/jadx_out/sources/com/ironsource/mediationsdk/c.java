package com.ironsource.mediationsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.C3942b4;
import com.ironsource.C4111kc;
import com.ironsource.C4228r4;
import com.ironsource.C4324wf;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.J9;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f32369k = "IronSource";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f32370l = "com.ironsource.adapters";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f32371m = "aps";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c f32372n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f32373o = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f32378e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f32381h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C3942b4 f32382i = new C3942b4();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C4111kc f32383j = new C4111kc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, AbstractAdapter> f32374a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, AdapterBaseWrapper> f32375b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap<String, List<String>> f32379f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap<IronSource.a, JSONObject> f32380g = new ConcurrentHashMap<>();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32384a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            f32384a = iArr;
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32384a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32384a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32384a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private AbstractAdapter a(String str, String str2) {
        try {
            Class<?> cls = Class.forName(a(str2));
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e10) {
            String str3 = "Error while loading adapter - exception = " + e10.getLocalizedMessage();
            a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            b(str3);
            return null;
        }
    }

    private AdapterBaseInterface a(String str, String str2, NetworkSettings networkSettings) {
        String strA;
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        if (networkSettings.isCustomNetwork()) {
            strA = networkSettings.getCustomNetworkPackage() + "." + str2;
        } else {
            strA = a(str2);
        }
        try {
            BaseAdapter baseAdapter = (BaseAdapter) Class.forName(strA).newInstance();
            IronLog.INTERNAL.info(strA + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            a(str, baseAdapter, networkSettings);
            return baseAdapter;
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str3 = "failed to load " + strA;
                IronLog.INTERNAL.error(str3);
                a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            }
            return null;
        }
    }

    private BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.a aVar) {
        boolean zIsCustomNetwork = networkSettings.isCustomNetwork();
        if (zIsCustomNetwork && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            c(networkSettings);
            return null;
        }
        String strA = a(networkSettings, aVar, zIsCustomNetwork, a(networkSettings, aVar, zIsCustomNetwork));
        try {
            return a(strA, networkSettings);
        } catch (Exception e10) {
            if (zIsCustomNetwork) {
                a(e10, strA);
            }
            return null;
        }
    }

    private BaseAdAdapter<?, ?> a(String str, NetworkSettings networkSettings) throws Exception {
        return (BaseAdAdapter) Class.forName(str).getConstructor(NetworkSettings.class).newInstance(networkSettings);
    }

    @Nullable
    private w a(NetworkSettings networkSettings, IronSource.a aVar, String str) {
        AbstractAdapter abstractAdapterA = a(networkSettings, b(networkSettings, aVar), false);
        if (abstractAdapterA != null) {
            w wVar = new w(abstractAdapterA);
            this.f32375b.put(str, new AdapterBaseWrapper(wVar, networkSettings));
            return wVar;
        }
        String str2 = "error creating network adapter " + networkSettings.getProviderName();
        a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
        IronLog.INTERNAL.error(str2);
        return null;
    }

    private String a(IronSource.a aVar) {
        if (aVar == null) {
            return null;
        }
        int i10 = a.f32384a[aVar.ordinal()];
        if (i10 == 1) {
            return "Rewarded";
        }
        if (i10 == 2) {
            return "Interstitial";
        }
        if (i10 == 3) {
            return "Banner";
        }
        if (i10 != 4) {
            return null;
        }
        return "NativeAd";
    }

    private String a(NetworkSettings networkSettings, IronSource.a aVar, boolean z10) {
        return z10 ? networkSettings.getCustomNetworkAdapterName(aVar) : networkSettings.getProviderTypeForReflection();
    }

    private String a(NetworkSettings networkSettings, IronSource.a aVar, boolean z10, String str) {
        if (!z10) {
            return a(str, aVar);
        }
        return networkSettings.getCustomNetworkPackage() + "." + str;
    }

    @NotNull
    private static String a(String str) {
        return "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
    }

    @NotNull
    private String a(String str, IronSource.a aVar) {
        return "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + StringUtils.toLowerCase(a(aVar)) + "." + str + a(aVar) + "Adapter";
    }

    private void a(D5 d52, String str) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            if (!TextUtils.isEmpty(str)) {
                jSONObjectJsonObjectInit.put("reason", str);
            }
            J9.i().a(new C5(d52, jSONObjectJsonObjectInit));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(AbstractAdapter abstractAdapter) {
        if (!StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(f32371m) || this.f32380g.size() == 0) {
            return;
        }
        for (IronSource.a aVar : this.f32380g.keySet()) {
            try {
                JSONObject jSONObject = this.f32380g.get(aVar);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                    ((SetAPSInterface) abstractAdapter).setAPSData(C4324wf.a(aVar), jSONObject);
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                String str = "error while setting aps data: " + e10.getLocalizedMessage();
                a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                c(str);
            }
        }
        this.f32380g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(AdapterBaseInterface adapterBaseInterface) {
        if (!(adapterBaseInterface instanceof SetAPSInterface) || this.f32380g.size() == 0) {
            return;
        }
        for (IronSource.a aVar : this.f32380g.keySet()) {
            try {
                JSONObject jSONObject = this.f32380g.get(aVar);
                if (jSONObject != null && jSONObject.length() > 0) {
                    ((SetAPSInterface) adapterBaseInterface).setAPSData(C4324wf.a(aVar), jSONObject);
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                String str = "error while setting aps data: " + e10.getLocalizedMessage();
                a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                c(str);
            }
        }
        this.f32380g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(LevelPlay.AdFormat adFormat, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "APSData is empty");
            b("APSData is empty");
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(jSONObject.toString());
            if (!this.f32374a.isEmpty()) {
                for (AbstractAdapter abstractAdapter : this.f32374a.values()) {
                    if (StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(f32371m) && (abstractAdapter instanceof SetAPSInterface)) {
                        ((SetAPSInterface) abstractAdapter).setAPSData(adFormat, jSONObjectJsonObjectInit);
                        return;
                    }
                }
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.f32375b.values()) {
                if (StringUtils.toLowerCase(adapterBaseWrapper.getSettings().getProviderTypeForReflection()).equals(f32371m)) {
                    AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                    if (adapterBaseInterface != null) {
                        ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(adFormat, jSONObjectJsonObjectInit);
                        return;
                    }
                    return;
                }
            }
            synchronized (f32373o) {
                this.f32380g.put(C4324wf.b(adFormat), jSONObjectJsonObjectInit);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            String str = "error while setting APSData: " + e10.getLocalizedMessage();
            a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
            b(str);
        }
    }

    private void a(Exception exc, String str) {
        String str2 = "Failed to load adapter class: " + str;
        IronLog.INTERNAL.error(str2);
        a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2 + " - " + exc.getMessage());
    }

    private void a(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str2 = "Error while setting meta-data for adapter " + str + ": " + th2.getLocalizedMessage();
            a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            c(str2);
        }
    }

    private void a(String str, AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        if (!networkSettings.isCustomNetwork()) {
            c(adapterBaseInterface);
            a(adapterBaseInterface);
        }
        this.f32382i.a(adapterBaseInterface, networkSettings);
        b(adapterBaseInterface);
        this.f32383j.a(new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
        this.f32375b.put(str, new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
    }

    private void a(final String str, final List<String> list) {
        for (AdapterBaseWrapper adapterBaseWrapper : this.f32375b.values()) {
            final AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                a(new Runnable() { // from class: com.ironsource.mediationsdk.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.a(adapterBaseInterface, str, list);
                    }
                }, adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    private void a(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (next.equalsIgnoreCase(IronSource.a.BANNER.toString())) {
                a(LevelPlay.AdFormat.BANNER, jSONObjectOptJSONObject);
            } else if (next.equalsIgnoreCase(IronSource.a.INTERSTITIAL.toString())) {
                a(LevelPlay.AdFormat.INTERSTITIAL, jSONObjectOptJSONObject);
            } else if (next.equalsIgnoreCase(IronSource.a.REWARDED_VIDEO.toString())) {
                a(LevelPlay.AdFormat.REWARDED, jSONObjectOptJSONObject);
            }
        }
    }

    private void a(JSONObject jSONObject, AbstractAdapter abstractAdapter, String str) {
        if (str.equalsIgnoreCase("IronSource") && this.f32381h.compareAndSet(false, true)) {
            c("SDK5 earlyInit  <" + str + ">");
            try {
                abstractAdapter.earlyInit(this.f32376c, this.f32377d, jSONObject);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                String str2 = "error while calling early init for " + abstractAdapter.getProviderName() + ": " + e10.getLocalizedMessage();
                a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
            }
        }
    }

    private boolean a(@NotNull x xVar) {
        if (xVar.allData().length() == 0) {
            a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network data");
            b("empty network data");
            return false;
        }
        if (!TextUtils.isEmpty(xVar.a())) {
            return true;
        }
        a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network key");
        b("empty network key");
        return false;
    }

    public static boolean a(String str, AbstractAdapter abstractAdapter) {
        return (abstractAdapter == null || abstractAdapter.getProviderNetworkKey() == null || !abstractAdapter.getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean a(String str, AdapterBaseWrapper adapterBaseWrapper) {
        return (adapterBaseWrapper == null || adapterBaseWrapper.getSettings().getProviderNetworkKey() == null || !adapterBaseWrapper.getSettings().getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    public static c b() {
        return f32372n;
    }

    private String b(NetworkSettings networkSettings) {
        return networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
    }

    private JSONObject b(NetworkSettings networkSettings, IronSource.a aVar) {
        int i10 = a.f32384a[aVar.ordinal()];
        if (i10 == 1) {
            return networkSettings.getRewardedVideoSettings();
        }
        if (i10 == 2) {
            return networkSettings.getInterstitialSettings();
        }
        if (i10 == 3) {
            return networkSettings.getBannerSettings();
        }
        if (i10 != 4) {
            return null;
        }
        return networkSettings.getNativeAdSettings();
    }

    private void b(AbstractAdapter abstractAdapter) {
        Boolean bool = this.f32378e;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th2.getLocalizedMessage();
                a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                c(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void b(AdapterBaseInterface adapterBaseInterface) {
        Boolean bool = this.f32378e;
        if (bool == null || !(adapterBaseInterface instanceof AdapterDebugInterface)) {
            return;
        }
        try {
            ((AdapterDebugInterface) adapterBaseInterface).setAdapterDebug(bool.booleanValue());
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            String str = "error while setting adapterDebug of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
            a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            c(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 3);
    }

    private void b(final String str, final List<String> list) {
        for (final AbstractAdapter abstractAdapter : this.f32374a.values()) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.c0
                @Override // java.lang.Runnable
                public final void run() {
                    c.a(abstractAdapter, str, list);
                }
            }, abstractAdapter.getProviderName());
        }
    }

    private String c(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        return (uuid != null ? uuid.toString() : "") + "-" + aVar.toString() + "-" + networkSettings.getProviderName();
    }

    private void c(final AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return;
        }
        for (final String str : this.f32379f.keySet()) {
            final List<String> list = this.f32379f.get(str);
            if (list != null) {
                a(new Runnable() { // from class: com.ironsource.mediationsdk.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.b(abstractAdapter, str, list);
                    }
                }, abstractAdapter.getProviderName());
            }
        }
    }

    private void c(final AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return;
        }
        for (final String str : this.f32379f.keySet()) {
            final List<String> list = this.f32379f.get(str);
            if (list != null && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                a(new Runnable() { // from class: com.ironsource.mediationsdk.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.b(adapterBaseInterface, str, list);
                    }
                }, adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    private void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.error("Missing package definition for " + networkSettings.getProviderTypeForReflection());
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 0);
    }

    public AbstractAdapter a(NetworkSettings networkSettings) {
        return a(b(networkSettings), networkSettings.getProviderTypeForReflection());
    }

    public AbstractAdapter a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z10) {
        String coreSDKVersion;
        String strB = b(networkSettings);
        String providerTypeForReflection = z10 ? "IronSource" : networkSettings.getProviderTypeForReflection();
        synchronized (f32373o) {
            if (this.f32374a.containsKey(strB)) {
                return this.f32374a.get(strB);
            }
            AbstractAdapter abstractAdapterA = a(strB, providerTypeForReflection);
            if (abstractAdapterA == null) {
                b(strB + " adapter was not loaded");
                return null;
            }
            abstractAdapterA.setProviderNetworkKey(networkSettings.getProviderNetworkKey());
            try {
                coreSDKVersion = abstractAdapterA.getCoreSDKVersion();
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
                String str = "error while retrieving coreSDKVersion " + abstractAdapterA.getProviderName() + ": " + th2.getLocalizedMessage();
                a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                IronLog.INTERNAL.error(str);
                coreSDKVersion = "Unknown";
            }
            c(strB + " was allocated (adapter version: " + abstractAdapterA.getVersion() + ", sdk version: " + coreSDKVersion + ")");
            c(abstractAdapterA);
            this.f32383j.a(abstractAdapterA);
            a(abstractAdapterA);
            this.f32382i.a(abstractAdapterA, networkSettings);
            b(abstractAdapterA);
            a(jSONObject, abstractAdapterA, providerTypeForReflection);
            this.f32374a.put(strB, abstractAdapterA);
            return abstractAdapterA;
        }
    }

    public BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        BaseAdAdapter<?, ?> baseAdAdapterA = a(networkSettings, aVar);
        if (baseAdAdapterA != null || networkSettings.isCustomNetwork()) {
            return baseAdAdapterA;
        }
        AbstractAdapter abstractAdapterA = a(networkSettings);
        if (abstractAdapterA != null) {
            return AbstractC4150a.a(abstractAdapterA, networkSettings, aVar, uuid);
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        a(D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    public ConcurrentHashMap<String, AbstractAdapter> a() {
        return this.f32374a;
    }

    public void a(boolean z10) {
        synchronized (f32373o) {
            this.f32378e = Boolean.valueOf(z10);
            Iterator<AbstractAdapter> it = this.f32374a.values().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Iterator<AdapterBaseWrapper> it2 = this.f32375b.values().iterator();
            while (it2.hasNext()) {
                b(it2.next().getAdapterBaseInterface());
            }
        }
    }

    public AdapterBaseInterface b(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        String strB = networkSettings.isCustomNetwork() ? b(networkSettings) : c(networkSettings, aVar, uuid);
        if (this.f32375b.containsKey(strB)) {
            return this.f32375b.get(strB).getAdapterBaseInterface();
        }
        AdapterBaseInterface adapterBaseInterfaceA = a(strB, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(null) : networkSettings.getProviderTypeForReflection(), networkSettings);
        return (adapterBaseInterfaceA != null || networkSettings.isCustomNetwork()) ? adapterBaseInterfaceA : a(networkSettings, aVar, strB);
    }

    public void b(@NotNull x xVar) {
        if (a(xVar)) {
            this.f32383j.a(xVar);
            xVar.a(this.f32374a.values(), this.f32375b.values());
            xVar.b();
            if (StringUtils.toLowerCase(xVar.a()).equals(f32371m)) {
                a(xVar.allData());
            }
        }
    }

    public void b(String str, String str2) {
        this.f32376c = str;
        this.f32377d = str2;
    }

    public void b(boolean z10) {
        synchronized (f32373o) {
            this.f32382i.a(z10);
            this.f32382i.a(this.f32374a, this.f32375b);
        }
    }

    public ConcurrentHashMap<String, LevelPlayBaseAdapter> c() {
        ConcurrentHashMap<String, LevelPlayBaseAdapter> concurrentHashMap = new ConcurrentHashMap<>();
        for (String str : this.f32375b.keySet()) {
            AdapterBaseWrapper adapterBaseWrapper = this.f32375b.get(str);
            if (adapterBaseWrapper != null && (adapterBaseWrapper.getAdapterBaseInterface() instanceof LevelPlayBaseAdapter)) {
                concurrentHashMap.put(str, (LevelPlayBaseAdapter) adapterBaseWrapper.getAdapterBaseInterface());
            }
        }
        return concurrentHashMap;
    }

    public void c(String str, List<String> list) {
        synchronized (f32373o) {
            this.f32379f.put(str, list);
            if (!this.f32374a.isEmpty()) {
                IronSourceUtils.i("setMetaData key = " + str + ", values = " + list);
                b(str, list);
            }
            a(str, list);
        }
    }

    public ConcurrentHashMap<String, List<String>> d() {
        return this.f32379f;
    }

    public ConcurrentHashMap<String, AdapterBaseWrapper> e() {
        return this.f32375b;
    }

    public void f() {
        this.f32374a.clear();
        this.f32375b.clear();
    }
}
