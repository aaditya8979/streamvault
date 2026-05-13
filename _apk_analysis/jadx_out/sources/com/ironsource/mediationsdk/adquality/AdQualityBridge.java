package com.ironsource.mediationsdk.adquality;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import bo.a0;
import bo.d0;
import com.ironsource.C4002ea;
import com.ironsource.C4064i0;
import com.ironsource.C4228r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.Lb;
import com.ironsource.N6;
import com.ironsource.O6;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class AdQualityBridge {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private static Boolean isGetVersionMethodExist;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isGetVersionMethodExist() throws JSONException {
            try {
                if (AdQualityBridge.isGetVersionMethodExist != null) {
                    return p.f(AdQualityBridge.isGetVersionMethodExist, Boolean.TRUE);
                }
                boolean z10 = IronSourceAdQuality.class.getDeclaredMethods().length >= 10;
                AdQualityBridge.isGetVersionMethodExist = Boolean.valueOf(z10);
                return z10;
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
                logEvent$default(this, D5.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST, null, null, 6, null);
                return false;
            }
        }

        private static /* synthetic */ void isGetVersionMethodExist$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logEvent(D5 d52, Integer num, String str) throws JSONException {
            JSONObject jSONObjectB = IronSourceUtils.b(false);
            if (num != null) {
                jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            }
            if (str != null) {
                jSONObjectB.put("reason", str);
            }
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, a.f32334a.a().b());
            Lb.f29764s.d().q().a(new C5(d52, jSONObjectB));
        }

        public static /* synthetic */ void logEvent$default(Companion companion, D5 d52, Integer num, String str, int i10, Object obj) throws JSONException {
            if ((i10 & 2) != 0) {
                num = null;
            }
            if ((i10 & 4) != 0) {
                str = null;
            }
            companion.logEvent(d52, num, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int versionCompare(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return -1;
            }
            int i10 = 0;
            String[] strArr = (String[]) d0.U0(new Regex("[^0-9.]").replace(str, ""), new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
            String[] strArr2 = (String[]) d0.U0(new Regex("[^0-9.]").replace(str2, ""), new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
            while (i10 < strArr.length && i10 < strArr2.length && p.f(strArr[i10], strArr2[i10])) {
                i10++;
            }
            if (i10 >= strArr.length || i10 >= strArr2.length) {
                return Integer.signum(strArr.length - strArr2.length);
            }
            int iIntValue = Integer.valueOf(strArr[i10]).intValue();
            Integer numValueOf = Integer.valueOf(strArr2[i10]);
            p.j(numValueOf, "valueOf(vals2[i])");
            return Integer.signum(p.m(iIntValue, numValueOf.intValue()));
        }

        public final boolean adQualityAvailable() {
            return versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0;
        }

        @NotNull
        public final String getAdQualitySdkVersion() {
            if (!isGetVersionMethodExist()) {
                return new String();
            }
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            p.j(sDKVersion, "getSDKVersion()");
            return sDKVersion;
        }
    }

    public AdQualityBridge(@NotNull Context context, @NotNull String str, @Nullable String str2, @NotNull C4064i0 c4064i0, int i10) throws JSONException {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(str, "appKey");
        p.k(c4064i0, "adQualityDataProvider");
        ISAdQualityConfig.Builder deviceIdType = new ISAdQualityConfig.Builder().setInitializationSource("LevelPlay").setLogLevel(convertToAdQualityLogLevel(i10)).setAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(@NotNull ISAdQualityInitError iSAdQualityInitError, @NotNull String str3) throws JSONException {
                p.k(iSAdQualityInitError, "isAdQualityInitError");
                p.k(str3, "message");
                D5 d52 = D5.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT;
                if (iSAdQualityInitError == ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED) {
                    d52 = D5.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT;
                }
                AdQualityBridge.Companion.logEvent(d52, Integer.valueOf(iSAdQualityInitError.getValue()), str3);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: " + str3, 3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() throws JSONException {
                AdQualityBridge.Companion.logEvent$default(AdQualityBridge.Companion, D5.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT, null, null, 6, null);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (!TextUtils.isEmpty(str2)) {
            deviceIdType.setUserId(str2);
        }
        Companion companion = Companion;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            JSONObject jSONObjectA = c4064i0.a();
            if (jSONObjectA.length() > 0) {
                deviceIdType.setMetaData(jSONObjectA);
            }
        }
        Companion.logEvent$default(companion, D5.TROUBLESHOOTING_INITIALIZING_AD_QUALITY_SDK_EVENT, null, null, 6, null);
        IronSourceAdQuality.getInstance().initialize(context, str, deviceIdType.build());
    }

    public static final boolean adQualityAvailable() {
        return Companion.adQualityAvailable();
    }

    private final ISAdQualityLogLevel convertToAdQualityLogLevel(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.ERROR : ISAdQualityLogLevel.WARNING : ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.VERBOSE;
    }

    @NotNull
    public static final String getAdQualitySdkVersion() {
        return Companion.getAdQualitySdkVersion();
    }

    private final boolean getCoppaValue() {
        String strA = N6.a().a("is_coppa");
        return strA != null && Boolean.parseBoolean(strA);
    }

    private final ISAdQualityDeviceIdType getDeviceIdType() {
        return !TextUtils.isEmpty(N6.a().a(O6.N)) ? ISAdQualityDeviceIdType.NONE : ISAdQualityDeviceIdType.GAID;
    }

    private static final boolean isGetVersionMethodExist() {
        return Companion.isGetVersionMethodExist();
    }

    private static final void logEvent(D5 d52, Integer num, String str) throws JSONException {
        Companion.logEvent(d52, num, str);
    }

    private static final int versionCompare(String str, String str2) {
        return Companion.versionCompare(str, str2);
    }

    public final void changeUserId(@NotNull String str) {
        p.k(str, "userId");
        IronSourceAdQuality.getInstance().changeUserId(str);
    }

    public final void setSegment(@NotNull C4002ea c4002ea) {
        p.k(c4002ea, "segment");
        ISAdQualitySegment.Builder builder = new ISAdQualitySegment.Builder();
        if (c4002ea.g() != null) {
            builder.setSegmentName(c4002ea.g());
        }
        if (c4002ea.a() > -1) {
            builder.setAge(c4002ea.a());
        }
        if (c4002ea.b() != null) {
            builder.setGender(c4002ea.b());
        }
        if (c4002ea.e() > -1) {
            builder.setLevel(c4002ea.e());
        }
        if (c4002ea.d() != null) {
            builder.setIsPaying(c4002ea.d().get());
        }
        if (c4002ea.c() > -1.0d) {
            builder.setInAppPurchasesTotal(c4002ea.c());
        }
        if (c4002ea.h() > 0) {
            builder.setUserCreationDate(c4002ea.h());
        }
        for (Pair<String, String> pair : c4002ea.f()) {
            String str = (String) pair.first;
            String str2 = (String) pair.second;
            p.j(str, "key");
            if (a0.W(str, "custom_", false, 2, null)) {
                builder.setCustomData(d0.L0(str, "custom_"), str2);
            }
        }
        IronSourceAdQuality.getInstance().setSegment(builder.build());
    }
}
