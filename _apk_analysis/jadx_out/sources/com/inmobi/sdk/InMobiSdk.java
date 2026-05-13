package com.inmobi.sdk;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import androidx.annotation.Size;
import androidx.annotation.UiThread;
import bn.g;
import bn.h;
import bn.r;
import bo.a0;
import cn.w;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.media.A9;
import com.inmobi.media.AbstractC3765tk;
import com.inmobi.media.AbstractC3853x8;
import com.inmobi.media.AbstractC3915zk;
import com.inmobi.media.C3850x5;
import com.inmobi.media.C3879y9;
import com.inmobi.media.Da;
import com.inmobi.media.E1;
import com.inmobi.media.Ea;
import com.inmobi.media.Ii;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Kf;
import com.inmobi.media.L2;
import com.inmobi.media.Lg;
import com.inmobi.media.Og;
import com.inmobi.media.Oj;
import com.inmobi.media.P9;
import com.inmobi.media.Pg;
import com.inmobi.media.RunnableC3904z9;
import com.inmobi.media.Tg;
import com.inmobi.media.W6;
import com.inmobi.media.Yk;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p000do.i;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
public final class InMobiSdk {

    @NotNull
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";

    @NotNull
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";

    @NotNull
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";

    @NotNull
    public static final InMobiSdk INSTANCE = new InMobiSdk();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AgeGroup {
        private static final /* synthetic */ kn.a $ENTRIES;
        private static final /* synthetic */ AgeGroup[] $VALUES;

        @NotNull
        private final String value;
        public static final AgeGroup BELOW_18 = new AgeGroup("BELOW_18", 0, "below18");
        public static final AgeGroup BETWEEN_18_AND_24 = new AgeGroup("BETWEEN_18_AND_24", 1, "between18and24");
        public static final AgeGroup BETWEEN_25_AND_29 = new AgeGroup("BETWEEN_25_AND_29", 2, "between25and29");
        public static final AgeGroup BETWEEN_30_AND_34 = new AgeGroup("BETWEEN_30_AND_34", 3, "between30and34");
        public static final AgeGroup BETWEEN_35_AND_44 = new AgeGroup("BETWEEN_35_AND_44", 4, "between35and44");
        public static final AgeGroup BETWEEN_45_AND_54 = new AgeGroup("BETWEEN_45_AND_54", 5, "between45and54");
        public static final AgeGroup BETWEEN_55_AND_65 = new AgeGroup("BETWEEN_55_AND_65", 6, "between55and65");
        public static final AgeGroup ABOVE_65 = new AgeGroup("ABOVE_65", 7, "above65");

        private static final /* synthetic */ AgeGroup[] $values() {
            return new AgeGroup[]{BELOW_18, BETWEEN_18_AND_24, BETWEEN_25_AND_29, BETWEEN_30_AND_34, BETWEEN_35_AND_44, BETWEEN_45_AND_54, BETWEEN_55_AND_65, ABOVE_65};
        }

        static {
            AgeGroup[] ageGroupArr$values = $values();
            $VALUES = ageGroupArr$values;
            $ENTRIES = kotlin.enums.a.a(ageGroupArr$values);
        }

        private AgeGroup(String str, int i10, String str2) {
            this.value = str2;
        }

        @NotNull
        public static kn.a<AgeGroup> getEntries() {
            return $ENTRIES;
        }

        public static AgeGroup valueOf(String str) {
            return (AgeGroup) Enum.valueOf(AgeGroup.class, str);
        }

        public static AgeGroup[] values() {
            return (AgeGroup[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Education {
        private static final /* synthetic */ kn.a $ENTRIES;
        private static final /* synthetic */ Education[] $VALUES;

        @NotNull
        private final String value;
        public static final Education HIGH_SCHOOL_OR_LESS = new Education("HIGH_SCHOOL_OR_LESS", 0, "highschoolorless");
        public static final Education COLLEGE_OR_GRADUATE = new Education("COLLEGE_OR_GRADUATE", 1, "collegeorgraduate");
        public static final Education POST_GRADUATE_OR_ABOVE = new Education("POST_GRADUATE_OR_ABOVE", 2, "postgraduateorabove");

        private static final /* synthetic */ Education[] $values() {
            return new Education[]{HIGH_SCHOOL_OR_LESS, COLLEGE_OR_GRADUATE, POST_GRADUATE_OR_ABOVE};
        }

        static {
            Education[] educationArr$values = $values();
            $VALUES = educationArr$values;
            $ENTRIES = kotlin.enums.a.a(educationArr$values);
        }

        private Education(String str, int i10, String str2) {
            this.value = str2;
        }

        @NotNull
        public static kn.a<Education> getEntries() {
            return $ENTRIES;
        }

        public static Education valueOf(String str) {
            return (Education) Enum.valueOf(Education.class, str);
        }

        public static Education[] values() {
            return (Education[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Gender {
        private static final /* synthetic */ kn.a $ENTRIES;
        private static final /* synthetic */ Gender[] $VALUES;
        public static final Gender FEMALE = new Gender("FEMALE", 0, InneractiveMediationDefs.GENDER_FEMALE);
        public static final Gender MALE = new Gender("MALE", 1, InneractiveMediationDefs.GENDER_MALE);

        @NotNull
        private final String value;

        private static final /* synthetic */ Gender[] $values() {
            return new Gender[]{FEMALE, MALE};
        }

        static {
            Gender[] genderArr$values = $values();
            $VALUES = genderArr$values;
            $ENTRIES = kotlin.enums.a.a(genderArr$values);
        }

        private Gender(String str, int i10, String str2) {
            this.value = str2;
        }

        @NotNull
        public static kn.a<Gender> getEntries() {
            return $ENTRIES;
        }

        public static Gender valueOf(String str) {
            return (Gender) Enum.valueOf(Gender.class, str);
        }

        public static Gender[] values() {
            return (Gender[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LogLevel {
        private static final /* synthetic */ kn.a $ENTRIES;
        private static final /* synthetic */ LogLevel[] $VALUES;
        public static final LogLevel NONE = new LogLevel(Constraint.NONE, 0);
        public static final LogLevel ERROR = new LogLevel("ERROR", 1);
        public static final LogLevel DEBUG = new LogLevel("DEBUG", 2);

        private static final /* synthetic */ LogLevel[] $values() {
            return new LogLevel[]{NONE, ERROR, DEBUG};
        }

        static {
            LogLevel[] logLevelArr$values = $values();
            $VALUES = logLevelArr$values;
            $ENTRIES = kotlin.enums.a.a(logLevelArr$values);
        }

        private LogLevel(String str, int i10) {
        }

        @NotNull
        public static kn.a<LogLevel> getEntries() {
            return $ENTRIES;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) $VALUES.clone();
        }
    }

    public static final class PublisherSignals {

        @NotNull
        public static final PublisherSignals INSTANCE = new PublisherSignals();

        @Nullable
        public final Map<String, Object> getPublisherSignals() {
            Map mapJ;
            ArrayList arrayList;
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                p.j(strAccess$getTAG$p, "access$getTAG$p(...)");
                Kb.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot get publisher signals.");
                return null;
            }
            Og og2 = Og.f26086a;
            og2.getClass();
            try {
                SignalsConfig.PublisherConfig publisherConfigC = Og.c();
                Map map = Pg.f26135a;
                p.k(publisherConfigC, "<this>");
                if (!(publisherConfigC.getEnableMCO() || publisherConfigC.getEnableAB())) {
                    return kotlin.collections.a.j();
                }
                try {
                    SignalsConfig.PublisherConfig publisherConfigC2 = Og.c();
                    p.k(publisherConfigC2, "<this>");
                    mapJ = !(publisherConfigC2.getEnableMCO() || publisherConfigC2.getEnableAB()) ? kotlin.collections.a.j() : kotlin.collections.a.q(Pg.a(og2.b(), Og.c()), og2.d());
                } catch (Exception e10) {
                    g gVar = P9.f26117a;
                    P9.a(new L2(e10));
                    mapJ = kotlin.collections.a.j();
                }
                Map mapC = kotlin.collections.a.C(mapJ);
                for (Pair pair : w.p(h.a(Og.c().getObj(), "o_i_dep"), h.a(Og.c().getDirect(), "d_i_dep"))) {
                    SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) pair.component1();
                    String str = (String) pair.component2();
                    if (baseInputData.getDepth().getEnabled()) {
                        Og og3 = Og.f26086a;
                        og3.getClass();
                        JSONArray jSONArrayOptJSONArray = ((JSONObject) Og.f26091f.getValue(og3, Og.f26087b[1])).optJSONArray(str);
                        if (jSONArrayOptJSONArray != null) {
                            p.k(jSONArrayOptJSONArray, "<this>");
                            arrayList = new ArrayList();
                            int length = jSONArrayOptJSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                Object obj = jSONArrayOptJSONArray.get(i10);
                                p.j(obj, "get(...)");
                                arrayList.add(obj);
                            }
                        } else {
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(0);
                            jSONArray.put(0);
                            jSONArray.put(0);
                            jSONArray.put(0);
                            p.k(jSONArray, "<this>");
                            arrayList = new ArrayList();
                            int length2 = jSONArray.length();
                            for (int i11 = 0; i11 < length2; i11++) {
                                Object obj2 = jSONArray.get(i11);
                                p.j(obj2, "get(...)");
                                arrayList.add(obj2);
                            }
                        }
                        mapC.put(str, arrayList);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapC.entrySet()) {
                    if (!a0.W((String) entry.getKey(), "auto_", false, 2, null)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap;
            } catch (Exception e11) {
                g gVar2 = P9.f26117a;
                P9.a(new L2(e11));
                Kb.a((byte) 1, "PubSignals", "Publisher signals could not be retrieved.");
                return kotlin.collections.a.j();
            }
        }

        public final void putPublisherSignals(@Nullable Map<String, ? extends Object> map) {
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                p.j(strAccess$getTAG$p, "access$getTAG$p(...)");
                Kb.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot set publisher signals.");
            } else if (map != null) {
                Og.f26086a.getClass();
                Og.a(map);
            }
        }

        public final void resetPublisherSignals() {
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                p.j(strAccess$getTAG$p, "access$getTAG$p(...)");
                Kb.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot reset publisher signals.");
            } else {
                Og.f26086a.getClass();
                Context context = Ji.f25747a;
                if (context == null || i.d(A9.f25149e, null, null, new Lg(context, null), 3, null) == null) {
                    r rVar = r.f5635a;
                }
            }
        }
    }

    public static LinkedHashMap a(long j10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        p.j("InMobiSdk", "TAG");
        Objects.toString(linkedHashMap.get("latency"));
        linkedHashMap.put("networkType", C3850x5.m());
        linkedHashMap.put("integrationType", "InMobi");
        return linkedHashMap;
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: o9.b
            @Override // java.lang.Runnable
            public final void run() {
                InMobiSdk.b();
            }
        };
        Context context = Ji.f25747a;
        p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static final void a(Context context, SdkInitializationListener sdkInitializationListener, String str, JSONObject jSONObject) {
        if (context == null) {
            INSTANCE.getClass();
            a(sdkInitializationListener, SdkInitializationListener.MISSING_CONTEXT);
            return;
        }
        if (str == null) {
            INSTANCE.getClass();
            a(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Yk.a()) {
            INSTANCE.getClass();
            a(sdkInitializationListener, "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = p.m(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String string = str.subSequence(i10, length + 1).toString();
        try {
            W6.a(jSONObject);
            if (string.length() == 0) {
                INSTANCE.getClass();
                a(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                return;
            }
            if (!Kf.a(context, "android.permission.ACCESS_COARSE_LOCATION") && !Kf.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                p.j("InMobiSdk", "TAG");
                Kb.a((byte) 1, "InMobiSdk", "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (Ji.d()) {
                p.j("InMobiSdk", "TAG");
                INSTANCE.getClass();
                a(sdkInitializationListener, null);
                return;
            }
            if (Ji.f25755i == 1) {
                p.j("InMobiSdk", "TAG");
                return;
            }
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(string, "accountId");
            Ji.f25755i = 1;
            Ji.f25747a = context.getApplicationContext();
            Ji.f25750d.set(true);
            Ji.f25749c = string;
            if (!Ji.c(context)) {
                p.j("InMobiSdk", "TAG");
                Ji.f25749c = null;
                Ji.f25747a = null;
                Ji.f25755i = 3;
                INSTANCE.getClass();
                a(sdkInitializationListener, SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY);
                return;
            }
            p.k(context, GAMConfig.KEY_CONTEXT);
            E1.b(context);
            INSTANCE.getClass();
            a();
            C3879y9 c3879y9 = new C3879y9(context, string, sdkInitializationListener, jElapsedRealtime, null);
            p.k(c3879y9, "runnable");
            i.d(Ji.f25754h, null, null, new Ii(c3879y9, null), 3, null);
        } catch (Exception e10) {
            p.j("InMobiSdk", "TAG");
            e10.getMessage();
            Ji.f25749c = null;
            Ji.f25747a = null;
            Ji.f25755i = 3;
            INSTANCE.getClass();
            a(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
        }
    }

    public static void a(final Context context, final String str, final JSONObject jSONObject, final SdkInitializationListener sdkInitializationListener) {
        Oj.a(new Runnable() { // from class: o9.a
            @Override // java.lang.Runnable
            public final void run() {
                InMobiSdk.a(context, sdkInitializationListener, str, jSONObject);
            }
        });
    }

    public static void a(final SdkInitializationListener sdkInitializationListener, final String str) {
        if (sdkInitializationListener != null) {
            Oj.a(new Runnable() { // from class: o9.c
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiSdk.b(sdkInitializationListener, str);
                }
            });
        }
        if (str != null) {
            p.j("InMobiSdk", "TAG");
            Kb.a((byte) 1, "InMobiSdk", str);
            return;
        }
        p.j("InMobiSdk", "TAG");
        Kb.a((byte) 2, "InMobiSdk", "InMobi SDK initialized with account id: " + Ji.f25749c);
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return "InMobiSdk";
    }

    public static final /* synthetic */ Map access$prepareTelemetryPayload(InMobiSdk inMobiSdk, long j10) {
        inMobiSdk.getClass();
        return a(j10);
    }

    public static final /* synthetic */ void access$provideCallback(InMobiSdk inMobiSdk, SdkInitializationListener sdkInitializationListener, String str) {
        inMobiSdk.getClass();
        a(sdkInitializationListener, str);
    }

    public static final void b() {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
        StringBuilder sb2 = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
        for (int i10 = 0; i10 < 4; i10++) {
            String str = strArr[i10];
            if (Kf.a(Ji.f25747a, str)) {
                sb2.append("\n");
                sb2.append(str);
            }
        }
        p.j("InMobiSdk", "TAG");
        Kb.a((byte) 2, "InMobiSdk", sb2.toString());
    }

    public static final void b(SdkInitializationListener sdkInitializationListener, String str) {
        INSTANCE.getClass();
        sdkInitializationListener.onInitializationComplete(str == null ? null : new Error(str));
    }

    @Nullable
    public static final String getToken() {
        return getToken(null, null);
    }

    @UiThread
    @Nullable
    public static final String getToken(@Nullable Map<String, String> map, @Nullable String str) {
        return AbstractC3765tk.a(map, str);
    }

    @NotNull
    public static final String getVersion() {
        return "11.1.0";
    }

    @UiThread
    public static final void init(@Nullable Context context, @Size(max = 36, min = 32) @Nullable String str, @Nullable JSONObject jSONObject, @Nullable SdkInitializationListener sdkInitializationListener) {
        InMobiSdk inMobiSdk = INSTANCE;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        inMobiSdk.getClass();
        a(applicationContext, str, jSONObject, sdkInitializationListener);
    }

    public static final boolean isSDKInitialized() {
        return Ji.d();
    }

    public static final void setAge(int i10) {
        Context context = Ji.f25747a;
        if (i10 != Integer.MIN_VALUE) {
            Tg.f26360a = i10;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Da.a(context, "user_info_store").a("user_age", i10, false);
            }
        }
    }

    public static final void setAgeGroup(@NotNull AgeGroup ageGroup) {
        p.k(ageGroup, "group");
        String string = ageGroup.toString();
        Locale locale = Locale.ENGLISH;
        p.j(locale, "ENGLISH");
        String lowerCase = string.toLowerCase(locale);
        p.j(lowerCase, "toLowerCase(...)");
        Context context = Ji.f25747a;
        if (lowerCase != null) {
            Tg.f26362c = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Da.a(context, "user_info_store").a("user_age_group", lowerCase, false);
            }
        }
    }

    public static final void setApplicationMuted(boolean z10) {
        Ji.f25752f = z10;
    }

    public static final void setAreaCode(@Nullable String str) {
        Context context = Ji.f25747a;
        Tg.f26363d = str;
        if (context == null || str == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Da.a(context, "user_info_store").a("user_area_code", str, false);
    }

    public static final void setEducation(@NotNull Education education) {
        p.k(education, "education");
        String string = education.toString();
        Locale locale = Locale.ENGLISH;
        p.j(locale, "ENGLISH");
        String lowerCase = string.toLowerCase(locale);
        p.j(lowerCase, "toLowerCase(...)");
        Context context = Ji.f25747a;
        if (lowerCase != null) {
            Tg.f26370k = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Da.a(context, "user_info_store").a("user_education", lowerCase, false);
            }
        }
    }

    public static final void setGender(@NotNull Gender gender) {
        p.k(gender, "gender");
        String string = gender.toString();
        Locale locale = Locale.ENGLISH;
        p.j(locale, "ENGLISH");
        String lowerCase = string.toLowerCase(locale);
        p.j(lowerCase, "toLowerCase(...)");
        Context context = Ji.f25747a;
        if (lowerCase != null) {
            Tg.f26369j = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Da.a(context, "user_info_store").a("user_gender", lowerCase, false);
            }
        }
    }

    public static final void setInterests(@Nullable String str) {
        Context context = Ji.f25747a;
        if (str != null) {
            Tg.f26372m = str;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Da.a(context, "user_info_store").a("user_interest", str, false);
            }
        }
    }

    public static final void setIsAgeRestricted(boolean z10) {
        Tg.a(z10);
        AbstractC3915zk.a(z10);
        if (z10) {
            InMobiUnifiedIdService.reset();
            AbstractC3853x8.a(null);
        }
    }

    public static final void setLanguage(@Nullable String str) {
        Context context = Ji.f25747a;
        if (str != null) {
            Tg.f26371l = str;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Da.a(context, "user_info_store").a("user_language", str, false);
            }
        }
    }

    public static final void setLocation(@Nullable Location location) {
        Context context = Ji.f25747a;
        if (location != null) {
            Tg.f26373n = location;
            if (context != null) {
                String strA = Tg.a(location);
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Da.a(context, "user_info_store").a("user_location", strA, false);
            }
        }
    }

    public static final void setLocationWithCityStateCountry(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        Context context = Ji.f25747a;
        if (str != null) {
            Tg.f26365f = str;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Da.a(context, "user_info_store").a("user_city_code", str, false);
            }
        }
        Context context2 = Ji.f25747a;
        if (str2 != null) {
            Tg.f26366g = str2;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f25372b;
                Da.a(context2, "user_info_store").a("user_state_code", str2, false);
            }
        }
        Context context3 = Ji.f25747a;
        if (str3 != null) {
            Tg.f26367h = str3;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap3 = Ea.f25372b;
                Da.a(context3, "user_info_store").a("user_country_code", str3, false);
            }
        }
    }

    public static final void setLogLevel(@Nullable LogLevel logLevel) {
        int i10 = logLevel == null ? -1 : a.f28674a[logLevel.ordinal()];
        if (i10 == 1) {
            Kb.f25807a = (byte) 0;
            return;
        }
        if (i10 == 2) {
            Kb.f25807a = (byte) 1;
        } else if (i10 != 3) {
            Kb.f25807a = (byte) 2;
        } else {
            Kb.f25807a = (byte) 2;
        }
    }

    public static final void setPartnerGDPRConsent(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            W6.f26524b = jSONObject;
        }
    }

    public static final void setPostalCode(@Nullable String str) {
        Context context = Ji.f25747a;
        if (str != null) {
            Tg.f26364e = str;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Da.a(context, "user_info_store").a("user_post_code", str, false);
            }
        }
    }

    public static final void setPublisherProvidedUnifiedId(@Nullable JSONObject jSONObject) {
        p.j("InMobiSdk", "TAG");
        Objects.toString(jSONObject);
        RunnableC3904z9 runnableC3904z9 = new RunnableC3904z9(jSONObject);
        Context context = Ji.f25747a;
        p.k(runnableC3904z9, "runnable");
        Ji.f25753g.submit(runnableC3904z9);
    }

    public static final void setYearOfBirth(int i10) {
        Context context = Ji.f25747a;
        if (i10 != Integer.MIN_VALUE) {
            Tg.f26368i = i10;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Da.a(context, "user_info_store").a("user_yob", i10, false);
            }
        }
    }

    public static final void updateGDPRConsent(@Nullable JSONObject jSONObject) {
        W6.a(jSONObject);
    }
}
