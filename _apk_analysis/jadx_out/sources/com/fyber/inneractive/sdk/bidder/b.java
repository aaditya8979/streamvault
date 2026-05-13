package com.fyber.inneractive.sdk.bidder;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.Topic;
import android.app.NotificationManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.v0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.protobuf.y0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s1;
import com.fyber.inneractive.sdk.util.z0;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements e, v0, com.fyber.inneractive.sdk.config.cellular.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f15832h = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f15833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f15834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f15835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f15836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f15837e = new AtomicReference(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f15838f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f15839g = new Object();

    public b() {
        com.fyber.inneractive.sdk.config.cellular.a aVar;
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(com.fyber.inneractive.sdk.config.global.r.a());
        this.f15834b = cVar;
        d dVar = new d(cVar);
        this.f15835c = dVar;
        this.f15833a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager iAConfigManager = IAConfigManager.O;
        iAConfigManager.f15978x.f16173d = this;
        if (iAConfigManager.f15975u.f16144b.a(true, "bidding_token_wait_for_ua")) {
            s1 s1Var = iAConfigManager.f15979y;
            s1Var.b();
            if (!s1Var.f19566d.get()) {
                s1Var.c();
            }
            dVar.f15842b = iAConfigManager.f15979y.a();
        }
        if (!InneractiveAdManager.isCurrentUserAChild() && (aVar = iAConfigManager.N) != null) {
            try {
                aVar.f15989c.add(this);
            } catch (Throwable th2) {
                IAlog.a("failed to add network observer", th2, new Object[0]);
            }
        }
        f fVar = new f(this);
        this.f15836d = fVar;
        fVar.a();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(z0 z0Var) {
        if (TextUtils.equals(this.f15835c.f15857q, z0Var.b())) {
            return;
        }
        this.f15835c.f15857q = z0Var.b();
        d();
    }

    public final void a(String str, UnitDisplayType unitDisplayType, l0 l0Var) {
        ArrayList<com.fyber.inneractive.sdk.cache.session.g> arrayList;
        int i10;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.cache.session.e eVar = iAConfigManager.f15978x.f16170a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.cache.session.k kVar = (com.fyber.inneractive.sdk.cache.session.k) eVar.f15898b.get(com.fyber.inneractive.sdk.cache.session.enums.c.a(unitDisplayType.value(), str));
            TokenParametersOuterClass$TokenParameters.UserSession userSession = null;
            if (kVar != null) {
                ArrayList arrayList2 = new ArrayList(kVar);
                Collections.sort(arrayList2, new com.fyber.inneractive.sdk.cache.session.j());
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            try {
                i10 = Integer.parseInt(iAConfigManager.f15975u.f16144b.a("number_of_sessions", Integer.toString(5)));
            } catch (Throwable unused) {
                i10 = 5;
            }
            int i11 = i10 >= 0 ? i10 : 5;
            if (i11 > 0 && arrayList != null && arrayList.size() >= i11) {
                j0 j0Var = !str.equals("video") ? !str.equals("display") ? j0.UNITCONTENTTYPEUNKNOWN : j0.DISPLAY : j0.VIDEO;
                o0 o0VarNewBuilder = TokenParametersOuterClass$TokenParameters.UserSession.newBuilder();
                o0VarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.f19235b).setSubType(j0Var);
                int i12 = 0;
                for (com.fyber.inneractive.sdk.cache.session.g gVar : arrayList) {
                    e0 e0VarNewBuilder = TokenParametersOuterClass$TokenParameters.SessionData.newBuilder();
                    int i13 = gVar.f15904b;
                    e0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.f19235b).setClicks(i13);
                    int i14 = gVar.f15903a;
                    e0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.f19235b).setImpressions(i14);
                    if (str.equals("video") || l0Var.equals(l0.REWARDED)) {
                        int i15 = gVar.f15905c;
                        e0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.f19235b).setCompletions(i15);
                    }
                    TokenParametersOuterClass$TokenParameters.SessionData sessionData = (TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.a();
                    o0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.f19235b).addSessionDataItems(sessionData);
                    i12++;
                    if (i12 >= i11) {
                        break;
                    }
                }
                o0VarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.f19235b).setType(l0Var);
                userSession = (TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.a();
            }
            if (userSession == null || userSession.getSessionDataItemsList().size() <= 0) {
                return;
            }
            k kVar2 = this.f15833a;
            kVar2.c();
            ((TokenParametersOuterClass$TokenParameters) kVar2.f19235b).addUserSessions(userSession);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final byte[] a() {
        JSONArray jSONArrayA;
        byte b10;
        byte b11;
        r0 r0Var;
        l0 l0Var;
        String str;
        k kVar = this.f15833a;
        kVar.f19235b = (com.fyber.inneractive.sdk.protobuf.z0) kVar.f19235b.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
        k kVar2 = this.f15833a;
        this.f15835c.getClass();
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA = h.a("1.2");
        kVar2.c();
        ((TokenParametersOuterClass$TokenParameters) kVar2.f19235b).setVersion(nullableStringA);
        if (this.f15837e.get() != null) {
            this.f15835c.a();
        }
        k kVar3 = this.f15833a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA2 = h.a(this.f15835c.f15842b);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setUserAgent(nullableStringA2);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA3 = h.a(this.f15835c.f15843c);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setSdkVersion(nullableStringA3);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA4 = h.a(this.f15835c.f15844d);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setBundleID(nullableStringA4);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA5 = h.a(this.f15835c.f15845e);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setDeviceModel(nullableStringA5);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA6 = h.a(this.f15835c.f15846f);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setAppVersion(nullableStringA6);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA7 = h.a(C3978d4.f31183d);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setDeviceOS(nullableStringA7);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A = h.a(Build.VERSION.SDK_INT);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setDeviceApi(nullableUInt32A);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA8 = h.a(Build.VERSION.RELEASE);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setOsVersion(nullableStringA8);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA9 = h.a(this.f15835c.f15847g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setDeviceLanguage(nullableStringA9);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA10 = h.a(this.f15835c.f15848h);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setCountryCode(nullableStringA10);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA11 = h.a(this.f15835c.f15849i);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setCarrierName(nullableStringA11);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA12 = h.a(this.f15835c.f15850j);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setMobileCountryCode(nullableStringA12);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA13 = h.a(this.f15835c.f15851k);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setMobileNetworkCode(nullableStringA13);
        Long l10 = this.f15835c.f15852l;
        x xVarNewBuilder = TokenParametersOuterClass$TokenParameters.NullableSInt32.newBuilder();
        if (l10 != null) {
            int iIntValue = l10.intValue();
            xVarNewBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableSInt32) xVarNewBuilder.f19235b).setData(iIntValue);
        }
        TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32 = (TokenParametersOuterClass$TokenParameters.NullableSInt32) xVarNewBuilder.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setOffsetFromGMT(nullableSInt32);
        IAConfigManager iAConfigManager = IAConfigManager.O;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA14 = h.a(iAConfigManager.D.f16018g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setUserID(nullableStringA14);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A2 = h.a(this.f15835c.f15853m);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setDeviceWidth(nullableUInt32A2);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A3 = h.a(this.f15835c.f15854n);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setDeviceHeight(nullableUInt32A3);
        q qVar = this.f15835c.f15855o;
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setFrameworkName(qVar);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA15 = h.a(this.f15835c.f15856p);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setInputLanguages(nullableStringA15);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA16 = h.a(this.f15835c.H);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setMediationType(nullableStringA16);
        this.f15835c.getClass();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f16744p;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA17 = h.a(lVar != null ? lVar.getOdt() : "");
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setOdt(nullableStringA17);
        Integer numA = com.fyber.inneractive.sdk.serverapi.b.a();
        z zVarNewBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (numA != null) {
            int iIntValue2 = numA.intValue();
            zVarNewBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder.f19235b).setData(iIntValue2);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f19235b).setAdServicesVersion(nullableUInt32);
        com.fyber.inneractive.sdk.config.g gVar = iAConfigManager.D;
        if (gVar != null) {
            k kVar4 = this.f15833a;
            if (gVar.f16015d == null) {
                gVar.f16016e = gVar.h();
            }
            if (com.fyber.inneractive.sdk.util.o.f19548a == null) {
                str = null;
            } else {
                str = gVar.f16015d;
                if (str == null) {
                    str = gVar.f16016e;
                }
            }
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA18 = h.a(str);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f19235b).setGdprString(nullableStringA18);
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA = h.a(gVar.d());
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f19235b).setGdprConsent(nullableBoolA);
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA19 = h.a(com.fyber.inneractive.sdk.util.o.f19548a == null ? null : gVar.f16019h);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f19235b).setCcpaString(nullableStringA19);
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA2 = h.a(com.fyber.inneractive.sdk.util.o.f19548a == null ? null : gVar.f16020i);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f19235b).setLgpdConsent(nullableBoolA2);
            Boolean bool = gVar.f16021j;
            if (bool != null && bool.booleanValue()) {
                k kVar5 = this.f15833a;
                TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA3 = h.a(bool);
                kVar5.c();
                ((TokenParametersOuterClass$TokenParameters) kVar5.f19235b).setCoppaApplies(nullableBoolA3);
            }
        }
        char c10 = 0;
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            k kVar6 = this.f15833a;
            com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f16160a.f16168b;
            boolean z10 = vVar != null ? vVar.f16165b : false;
            kVar6.c();
            ((TokenParametersOuterClass$TokenParameters) kVar6.f19235b).setDnt(z10);
        }
        k kVar7 = this.f15833a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA20 = h.a(this.f15835c.f15857q);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setNetwork(nullableStringA20);
        d0 d0Var = this.f15835c.f15858r;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setSecureContent(d0Var);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA4 = h.a(this.f15835c.B);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setBatteryCharging(nullableBoolA4);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA5 = h.a(this.f15835c.f15859s);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setHeadsetPlugged(nullableBoolA5);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA6 = h.a(this.f15835c.f15860t);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setBluetoothPlugged(nullableBoolA6);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA7 = h.a(this.f15835c.f15861u);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setLowPowerMode(nullableBoolA7);
        boolean z11 = this.f15835c.f15862v;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setDarkMode(z11);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA8 = h.a(this.f15835c.f15863w);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setAirplaneMode(nullableBoolA8);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA9 = h.a(this.f15835c.f15864x);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setDndMode(nullableBoolA9);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA10 = h.a(this.f15835c.f15865y);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setIsRingMuted(nullableBoolA10);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A4 = h.a(this.f15835c.f15866z);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setSessionDuration(nullableUInt32A4);
        String str2 = this.f15835c.C;
        z zVarNewBuilder2 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (!TextUtils.isEmpty(str2)) {
            int i10 = Integer.parseInt(str2);
            zVarNewBuilder2.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder2.f19235b).setData(i10);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder2.a();
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setBatteryLevel(nullableUInt322);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA11 = h.a(Boolean.valueOf(TextUtils.equals(iAConfigManager.f15978x.a(UnitDisplayType.INTERSTITIAL, "LAST_VAST_SKIPED"), "1")));
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setPriorSkip(nullableBoolA11);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A5 = h.a(this.f15835c.D);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setUserAge(nullableUInt32A5);
        InneractiveUserConfig.Gender gender = this.f15835c.E;
        n0 n0Var = gender == InneractiveUserConfig.Gender.FEMALE ? n0.FEMALE : gender == InneractiveUserConfig.Gender.MALE ? n0.MALE : n0.UNKNOWN;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setUserGender(n0Var);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA21 = h.a(this.f15835c.G);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setZipCode(nullableStringA21);
        boolean z12 = this.f15835c.F;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setMuteAudio(z12);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA12 = h.a(this.f15835c.L);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f19235b).setMediaMuted(nullableBoolA12);
        com.fyber.inneractive.sdk.config.v vVar2 = com.fyber.inneractive.sdk.config.u.f16160a.f16168b;
        if (vVar2 != null ? vVar2.f16166c : false) {
            k kVar8 = this.f15833a;
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA22 = h.a(this.f15835c.A);
            kVar8.c();
            ((TokenParametersOuterClass$TokenParameters) kVar8.f19235b).setAmazonId(nullableStringA22);
        } else {
            k kVar9 = this.f15833a;
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA23 = h.a(this.f15835c.A);
            kVar9.c();
            ((TokenParametersOuterClass$TokenParameters) kVar9.f19235b).setAaid(nullableStringA23);
        }
        UnitDisplayType[] unitDisplayTypeArrValues = UnitDisplayType.values();
        int length = unitDisplayTypeArrValues.length;
        int i11 = 0;
        while (true) {
            byte b12 = 2;
            if (i11 >= length) {
                com.fyber.inneractive.sdk.serverapi.c cVar = this.f15834b;
                cVar.getClass();
                com.fyber.inneractive.sdk.config.global.r rVarA = com.fyber.inneractive.sdk.config.global.r.a();
                cVar.f19437a = rVarA;
                rVarA.a(false, "");
                com.fyber.inneractive.sdk.config.global.r rVar = this.f15834b.f19437a;
                if (rVar != null) {
                    jSONArrayA = com.fyber.inneractive.sdk.config.global.g.a(rVar.f16058b, true);
                    IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayA);
                } else {
                    jSONArrayA = null;
                }
                if (jSONArrayA != null) {
                    for (int i12 = 0; i12 < jSONArrayA.length(); i12++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayA.optJSONObject(i12);
                        if (jSONObjectOptJSONObject != null) {
                            n nVarNewBuilder = TokenParametersOuterClass$TokenParameters.Experiment.newBuilder();
                            String strOptString = jSONObjectOptJSONObject.optString("id");
                            nVarNewBuilder.c();
                            ((TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.f19235b).setIdentifier(strOptString);
                            String strOptString2 = jSONObjectOptJSONObject.optString("v");
                            nVarNewBuilder.c();
                            ((TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.f19235b).setVariant(strOptString2);
                            k kVar10 = this.f15833a;
                            TokenParametersOuterClass$TokenParameters.Experiment experiment = (TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.a();
                            kVar10.c();
                            ((TokenParametersOuterClass$TokenParameters) kVar10.f19235b).addAbExperiments(experiment);
                        }
                    }
                }
                k kVar11 = this.f15833a;
                int i13 = com.fyber.inneractive.sdk.config.k.f16070a;
                String property = System.getProperty("ia.testEnvironmentConfiguration.number");
                z zVarNewBuilder3 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
                if (!TextUtils.isEmpty(property)) {
                    int i14 = Integer.parseInt(property);
                    zVarNewBuilder3.c();
                    ((TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder3.f19235b).setData(i14);
                }
                TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt323 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder3.a();
                kVar11.c();
                ((TokenParametersOuterClass$TokenParameters) kVar11.f19235b).setPortal(nullableUInt323);
                k kVar12 = this.f15833a;
                TokenParametersOuterClass$TokenParameters.NullableString nullableStringA24 = h.a(System.getProperty("ia.testEnvironmentConfiguration.response"));
                kVar12.c();
                ((TokenParametersOuterClass$TokenParameters) kVar12.f19235b).setMockResponseId(nullableStringA24);
                k kVar13 = this.f15833a;
                TokenParametersOuterClass$TokenParameters.NullableString nullableStringA25 = h.a(this.f15835c.I);
                kVar13.c();
                ((TokenParametersOuterClass$TokenParameters) kVar13.f19235b).setIgniteVersion(nullableStringA25);
                k kVar14 = this.f15833a;
                TokenParametersOuterClass$TokenParameters.NullableString nullableStringA26 = h.a(this.f15835c.J);
                kVar14.c();
                ((TokenParametersOuterClass$TokenParameters) kVar14.f19235b).setIgnitePackageName(nullableStringA26);
                if (this.f15835c.K) {
                    k kVar15 = this.f15833a;
                    TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA13 = h.a(Boolean.TRUE);
                    kVar15.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar15.f19235b).setChildMode(nullableBoolA13);
                }
                ArrayList<EncryptedTopic> arrayList = this.f15835c.M;
                if (IAConfigManager.c() && arrayList != null && !arrayList.isEmpty()) {
                    for (EncryptedTopic encryptedTopic : arrayList) {
                        l lVarNewBuilder = TokenParametersOuterClass$TokenParameters.EncryptedTopic.newBuilder();
                        byte[] encryptedTopic2 = encryptedTopic.getEncryptedTopic();
                        com.fyber.inneractive.sdk.protobuf.q qVar2 = com.fyber.inneractive.sdk.protobuf.s.f19223b;
                        int length2 = encryptedTopic2.length;
                        com.fyber.inneractive.sdk.protobuf.s.a(0, length2, encryptedTopic2.length);
                        com.fyber.inneractive.sdk.protobuf.o oVar = com.fyber.inneractive.sdk.protobuf.s.f19224c;
                        com.fyber.inneractive.sdk.protobuf.q qVar3 = new com.fyber.inneractive.sdk.protobuf.q(oVar.a(encryptedTopic2, 0, length2));
                        lVarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.EncryptedTopic) lVarNewBuilder.f19235b).setEncryptedTopic(qVar3);
                        String keyIdentifier = encryptedTopic.getKeyIdentifier();
                        lVarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.EncryptedTopic) lVarNewBuilder.f19235b).setKeyIdentifier(keyIdentifier);
                        byte[] encapsulatedKey = encryptedTopic.getEncapsulatedKey();
                        int length3 = encapsulatedKey.length;
                        com.fyber.inneractive.sdk.protobuf.s.a(0, length3, encapsulatedKey.length);
                        com.fyber.inneractive.sdk.protobuf.q qVar4 = new com.fyber.inneractive.sdk.protobuf.q(oVar.a(encapsulatedKey, 0, length3));
                        lVarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.EncryptedTopic) lVarNewBuilder.f19235b).setEncapsulatedKey(qVar4);
                        TokenParametersOuterClass$TokenParameters.EncryptedTopic encryptedTopic3 = (TokenParametersOuterClass$TokenParameters.EncryptedTopic) lVarNewBuilder.a();
                        k kVar16 = this.f15833a;
                        kVar16.c();
                        ((TokenParametersOuterClass$TokenParameters) kVar16.f19235b).addEncryptedTopics(encryptedTopic3);
                    }
                }
                ArrayList<Topic> arrayList2 = this.f15835c.N;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    for (Topic topic : arrayList2) {
                        g0 g0VarNewBuilder = TokenParametersOuterClass$TokenParameters.Topic.newBuilder();
                        int topicId = topic.getTopicId();
                        g0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.Topic) g0VarNewBuilder.f19235b).setTopicId(topicId);
                        long modelVersion = topic.getModelVersion();
                        g0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.Topic) g0VarNewBuilder.f19235b).setModelVersion(modelVersion);
                        long taxonomyVersion = topic.getTaxonomyVersion();
                        g0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.Topic) g0VarNewBuilder.f19235b).setTaxonomyVersion(taxonomyVersion);
                        TokenParametersOuterClass$TokenParameters.Topic topic2 = (TokenParametersOuterClass$TokenParameters.Topic) g0VarNewBuilder.a();
                        k kVar17 = this.f15833a;
                        kVar17.c();
                        ((TokenParametersOuterClass$TokenParameters) kVar17.f19235b).addTopics(topic2);
                    }
                }
                return ((TokenParametersOuterClass$TokenParameters) this.f15833a.a()).toByteArray();
            }
            UnitDisplayType unitDisplayType = unitDisplayTypeArrValues[i11];
            if (!unitDisplayType.isDeprecated()) {
                int[] iArr = g.f15868a;
                int i15 = iArr[unitDisplayType.ordinal()];
                l0 l0Var2 = i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? i15 != 5 ? l0.UNITDISPLAYTYPEUNKNOWN : l0.TYPENATIVE : l0.MRECT : l0.REWARDED : l0.INTERSTITIAL : l0.BANNER;
                com.fyber.inneractive.sdk.serverapi.a aVar = com.fyber.inneractive.sdk.serverapi.b.f19433a;
                IAConfigManager iAConfigManager2 = IAConfigManager.O;
                String strA = iAConfigManager2.f15978x.a(unitDisplayType, "LAST_DOMAIN_SHOWED");
                if (!TextUtils.isEmpty(strA) && strA.contains(StringUtils.COMMA)) {
                    strA = strA.split(StringUtils.COMMA)[c10];
                }
                if (!TextUtils.isEmpty(strA)) {
                    k kVar18 = this.f15833a;
                    r rVarNewBuilder = TokenParametersOuterClass$TokenParameters.LastAdomain.newBuilder();
                    rVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) rVarNewBuilder.f19235b).setAdomain(strA);
                    rVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) rVarNewBuilder.f19235b).setType(l0Var2);
                    TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain = (TokenParametersOuterClass$TokenParameters.LastAdomain) rVarNewBuilder.a();
                    kVar18.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar18.f19235b).addLastAdomains(lastAdomain);
                }
                String strA2 = iAConfigManager2.f15978x.a(unitDisplayType, "LAST_APP_BUNDLE_ID");
                if (!TextUtils.isEmpty(strA2)) {
                    k kVar19 = this.f15833a;
                    t tVarNewBuilder = TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.newBuilder();
                    tVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) tVarNewBuilder.f19235b).setLastBundle(strA2);
                    tVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) tVarNewBuilder.f19235b).setType(l0Var2);
                    TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle = (TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) tVarNewBuilder.a();
                    kVar19.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar19.f19235b).addLastAdvertisedBundles(lastAdvertisedBundle);
                }
                if (TextUtils.equals(iAConfigManager2.f15978x.a(unitDisplayType, "LAST_CLICKED"), "1")) {
                    k kVar20 = this.f15833a;
                    int i16 = iArr[unitDisplayType.ordinal()];
                    if (i16 == 1) {
                        b10 = 3;
                        b11 = 4;
                        l0Var = l0.BANNER;
                    } else if (i16 != 2) {
                        b10 = 3;
                        if (i16 != 3) {
                            b11 = 4;
                            l0Var = i16 != 4 ? i16 != 5 ? l0.UNITDISPLAYTYPEUNKNOWN : l0.TYPENATIVE : l0.MRECT;
                        } else {
                            b11 = 4;
                            l0Var = l0.REWARDED;
                        }
                    } else {
                        b10 = 3;
                        b11 = 4;
                        l0Var = l0.INTERSTITIAL;
                    }
                    kVar20.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar20.f19235b).addPriorClicks(l0Var);
                } else {
                    b10 = 3;
                    b11 = 4;
                }
                a("display", unitDisplayType, l0Var2);
                if (unitDisplayType.isFullscreenUnit()) {
                    a("video", unitDisplayType, l0Var2);
                    String strA3 = iAConfigManager2.f15978x.a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                    if (!TextUtils.isEmpty(strA3)) {
                        k kVar21 = this.f15833a;
                        a0 a0VarNewBuilder = TokenParametersOuterClass$TokenParameters.PriorVideoClickType.newBuilder();
                        strA3.getClass();
                        switch (strA3.hashCode()) {
                            case 49:
                                b12 = strA3.equals("1") ? (byte) 0 : (byte) -1;
                                break;
                            case 50:
                                b12 = strA3.equals("2") ? (byte) 1 : (byte) -1;
                                break;
                            case 51:
                                if (!strA3.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                                    b12 = -1;
                                }
                                break;
                            case 52:
                                b12 = strA3.equals("4") ? b10 : (byte) -1;
                                break;
                            case 53:
                                b12 = strA3.equals(CampaignEx.CLICKMODE_ON) ? b11 : (byte) -1;
                                break;
                            default:
                                b12 = -1;
                                break;
                        }
                        switch (b12) {
                            case 0:
                                r0Var = r0.CTABUTTON;
                                break;
                            case 1:
                                r0Var = r0.COMPANION;
                                break;
                            case 2:
                                r0Var = r0.VIDEOVIEW;
                                break;
                            case 3:
                                r0Var = r0.APPINFO;
                                break;
                            case 4:
                                r0Var = r0.STOREPROMO;
                                break;
                            default:
                                r0Var = r0.NOCLICK;
                                break;
                        }
                        a0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) a0VarNewBuilder.f19235b).setClickType(r0Var);
                        a0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) a0VarNewBuilder.f19235b).setType(l0Var2);
                        TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType = (TokenParametersOuterClass$TokenParameters.PriorVideoClickType) a0VarNewBuilder.a();
                        kVar21.c();
                        ((TokenParametersOuterClass$TokenParameters) kVar21.f19235b).addPriorClickTypes(priorVideoClickType);
                    }
                }
            }
            i11++;
            c10 = 0;
        }
    }

    public final void b() {
        if (this.f15838f.compareAndSet(false, true)) {
            try {
                this.f15837e.set(Base64.encodeToString(a(), 2));
            } catch (Throwable th2) {
                IAlog.b("Failed to generate token with error: %s", th2.getMessage());
            }
            this.f15838f.set(false);
        }
    }

    public final void c() {
        int currentInterruptionFilter = ((NotificationManager) com.fyber.inneractive.sdk.util.o.f19548a.getSystemService("notification")).getCurrentInterruptionFilter();
        boolean z10 = currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4;
        Boolean bool = this.f15835c.f15864x;
        if (bool == null || bool.booleanValue() != z10) {
            this.f15835c.f15864x = Boolean.valueOf(z10);
            d();
        }
    }

    public final void d() {
        com.fyber.inneractive.sdk.util.r.f19555a.execute(new a(this));
    }
}
