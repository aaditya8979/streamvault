package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.o;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j0;
import com.facebook.internal.k0;
import com.facebook.internal.w;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: compiled from: AppEventsLoggerImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 -2\u00020\u0001:\u0001\u001dB%\b\u0000\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)B'\b\u0010\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010,J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\"\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J$\u0010\u0011\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J,\u0010\u0014\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0006J+\u0010\u0016\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0018\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J=\u0010\u001b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006."}, d2 = {"Lcom/facebook/appevents/o;", "", "", C3978d4.i.f31344j0, "Landroid/os/Bundle;", "parameters", "Lbn/r;", "l", "", "valueToSum", CampaignEx.JSON_KEY_AD_K, "buttonText", "n", "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", "currency", "r", "", "isImplicitlyLogged", "q", "j", "o", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "p", "Ljava/util/UUID;", "currentSessionId", InneractiveMediationDefs.GENDER_MALE, "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZLjava/util/UUID;)V", "a", "Ljava/lang/String;", "contextName", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "b", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "activityName", "applicationId", "Lcom/facebook/AccessToken;", "accessToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "c", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f15234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static ScheduledThreadPoolExecutor f15235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static AppEventsLogger.FlushBehavior f15236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Object f15237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static String f15238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f15239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static String f15240j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String contextName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public AccessTokenAppIdPair accessTokenAppId;

    /* JADX INFO: renamed from: com.facebook.appevents.o$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AppEventsLoggerImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J\u0006\u0010\u0012\u001a\u00020\tJ\b\u0010\u0014\u001a\u00020\u0013H\u0007J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\u0016\u001a\u00020\tH\u0002J\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010&\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001fR\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0018\u0010+\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001fR\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u001fR\u0014\u00105\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/facebook/appevents/o$a;", "", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "j", "", "l", "Landroid/app/Application;", "application", "applicationId", "Lbn/r;", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, InneractiveMediationDefs.GENDER_MALE, "s", CampaignEx.JSON_KEY_AD_K, "referrer", "t", "g", "Ljava/util/concurrent/Executor;", "h", "i", "o", "Lcom/facebook/appevents/AppEvent;", "event", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "q", "message", "r", "ACCOUNT_KIT_EVENT_NAME_PREFIX", "Ljava/lang/String;", "APP_EVENTS_KILLSWITCH", "APP_EVENT_NAME_PUSH_OPENED", "APP_EVENT_PREFERENCES", "APP_EVENT_PUSH_PARAMETER_ACTION", "APP_EVENT_PUSH_PARAMETER_CAMPAIGN", "", "APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS", "I", "PUSH_PAYLOAD_CAMPAIGN_KEY", "PUSH_PAYLOAD_KEY", "TAG", "anonymousAppDeviceGUID", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "backgroundExecutor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "flushBehaviorField", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "", "isActivateAppEventRequested", "Z", "pushNotificationsRegistrationIdField", "staticLock", "Ljava/lang/Object;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: com.facebook.appevents.o$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AppEventsLoggerImpl.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/facebook/appevents/o$a$a", "Lcom/facebook/internal/w$a;", "", "s", "Lbn/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class C0275a implements w.a {
            @Override // com.facebook.internal.w.a
            public void a(@Nullable String str) {
                o.INSTANCE.t(str);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        public static final void n(Context context, o oVar) {
            tn.p.k(context, "$context");
            tn.p.k(oVar, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                String str = strArr[i10];
                String str2 = strArr2[i10];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i11 |= 1 << i10;
                } catch (ClassNotFoundException unused) {
                }
                if (i12 > 10) {
                    break;
                } else {
                    i10 = i12;
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i11) {
                sharedPreferences.edit().putInt("kitsBitmask", i11).apply();
                oVar.o("fb_sdk_initialize", null, bundle);
            }
        }

        public static final void p() {
            HashSet hashSet = new HashSet();
            Iterator<AccessTokenAppIdPair> it = k.p().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getApplicationId());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                FetchedAppSettingsManager.n((String) it2.next(), true);
            }
        }

        public final void f(@NotNull Application application, @Nullable String str) {
            tn.p.k(application, "application");
            if (!k2.t.F()) {
                throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
            }
            b.d();
            a0.e();
            if (str == null) {
                str = k2.t.m();
            }
            k2.t.K(application, str);
            s2.f.x(application, str);
        }

        public final void g() {
            if (j() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                k kVar = k.f15208a;
                k.l(FlushReason.EAGER_FLUSHING_EVENT);
            }
        }

        @NotNull
        public final Executor h() {
            if (o.b() == null) {
                o();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = o.b();
            if (scheduledThreadPoolExecutorB != null) {
                return scheduledThreadPoolExecutorB;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        @NotNull
        public final String i(@NotNull Context context) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            if (o.a() == null) {
                synchronized (o.e()) {
                    if (o.a() == null) {
                        o.h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                        if (o.a() == null) {
                            UUID uuidRandomUUID = UUID.randomUUID();
                            tn.p.j(uuidRandomUUID, "randomUUID()");
                            o.h(tn.p.t("XZ", uuidRandomUUID));
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", o.a()).apply();
                        }
                    }
                    bn.r rVar = bn.r.f5635a;
                }
            }
            String strA = o.a();
            if (strA != null) {
                return strA;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        @NotNull
        public final AppEventsLogger.FlushBehavior j() {
            AppEventsLogger.FlushBehavior flushBehaviorC;
            synchronized (o.e()) {
                flushBehaviorC = o.c();
            }
            return flushBehaviorC;
        }

        @Nullable
        public final String k() {
            com.facebook.internal.w wVar = com.facebook.internal.w.f15482a;
            com.facebook.internal.w.d(new C0275a());
            return k2.t.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        @Nullable
        public final String l() {
            String strD;
            synchronized (o.e()) {
                strD = o.d();
            }
            return strD;
        }

        public final void m(@NotNull final Context context, @Nullable String str) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            if (k2.t.p()) {
                final o oVar = new o(context, str, (AccessToken) null);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = o.b();
                if (scheduledThreadPoolExecutorB == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                scheduledThreadPoolExecutorB.execute(new Runnable() { // from class: com.facebook.appevents.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.Companion.n(context, oVar);
                    }
                });
            }
        }

        public final void o() {
            synchronized (o.e()) {
                if (o.b() != null) {
                    return;
                }
                o.i(new ScheduledThreadPoolExecutor(1));
                bn.r rVar = bn.r.f5635a;
                Runnable runnable = new Runnable() { // from class: com.facebook.appevents.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.Companion.p();
                    }
                };
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = o.b();
                if (scheduledThreadPoolExecutorB == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                scheduledThreadPoolExecutorB.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
            }
        }

        public final void q(AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
            k.g(accessTokenAppIdPair, appEvent);
            FeatureManager featureManager = FeatureManager.f15284a;
            if (FeatureManager.g(FeatureManager.Feature.OnDevicePostInstallEventProcessing) && u2.c.d()) {
                u2.c.e(accessTokenAppIdPair.getApplicationId(), appEvent);
            }
            if (appEvent.getIsImplicit() || o.f()) {
                return;
            }
            if (tn.p.f(appEvent.getName(), "fb_mobile_activate_app")) {
                o.g(true);
            } else {
                com.facebook.internal.a0.INSTANCE.b(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        public final void r(String str) {
            com.facebook.internal.a0.INSTANCE.b(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public final void s() {
            k.s();
        }

        public final void t(@Nullable String str) {
            SharedPreferences sharedPreferences = k2.t.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }
    }

    static {
        String canonicalName = o.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f15234d = canonicalName;
        f15236f = AppEventsLogger.FlushBehavior.AUTO;
        f15237g = new Object();
    }

    public o(@Nullable Context context, @Nullable String str, @Nullable AccessToken accessToken) {
        this(j0.t(context), str, accessToken);
    }

    public o(@NotNull String str, @Nullable String str2, @Nullable AccessToken accessToken) {
        tn.p.k(str, "activityName");
        k0.m();
        this.contextName = str;
        accessToken = accessToken == null ? AccessToken.INSTANCE.e() : accessToken;
        if (accessToken == null || accessToken.o() || !(str2 == null || tn.p.f(str2, accessToken.getApplicationId()))) {
            if (str2 == null) {
                j0 j0Var = j0.f15387a;
                str2 = j0.F(k2.t.l());
            }
            if (str2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            this.accessTokenAppId = new AccessTokenAppIdPair(null, str2);
        } else {
            this.accessTokenAppId = new AccessTokenAppIdPair(accessToken);
        }
        INSTANCE.o();
    }

    public static final /* synthetic */ String a() {
        if (c3.a.d(o.class)) {
            return null;
        }
        try {
            return f15238h;
        } catch (Throwable th2) {
            c3.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (c3.a.d(o.class)) {
            return null;
        }
        try {
            return f15235e;
        } catch (Throwable th2) {
            c3.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ AppEventsLogger.FlushBehavior c() {
        if (c3.a.d(o.class)) {
            return null;
        }
        try {
            return f15236f;
        } catch (Throwable th2) {
            c3.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (c3.a.d(o.class)) {
            return null;
        }
        try {
            return f15240j;
        } catch (Throwable th2) {
            c3.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ Object e() {
        if (c3.a.d(o.class)) {
            return null;
        }
        try {
            return f15237g;
        } catch (Throwable th2) {
            c3.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean f() {
        if (c3.a.d(o.class)) {
            return false;
        }
        try {
            return f15239i;
        } catch (Throwable th2) {
            c3.a.b(th2, o.class);
            return false;
        }
    }

    public static final /* synthetic */ void g(boolean z10) {
        if (c3.a.d(o.class)) {
            return;
        }
        try {
            f15239i = z10;
        } catch (Throwable th2) {
            c3.a.b(th2, o.class);
        }
    }

    public static final /* synthetic */ void h(String str) {
        if (c3.a.d(o.class)) {
            return;
        }
        try {
            f15238h = str;
        } catch (Throwable th2) {
            c3.a.b(th2, o.class);
        }
    }

    public static final /* synthetic */ void i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (c3.a.d(o.class)) {
            return;
        }
        try {
            f15235e = scheduledThreadPoolExecutor;
        } catch (Throwable th2) {
            c3.a.b(th2, o.class);
        }
    }

    public final void j() {
        if (c3.a.d(this)) {
            return;
        }
        try {
            k kVar = k.f15208a;
            k.l(FlushReason.EXPLICIT);
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void k(@Nullable String str, double d10, @Nullable Bundle bundle) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            m(str, Double.valueOf(d10), bundle, false, s2.f.m());
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void l(@Nullable String str, @Nullable Bundle bundle) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            m(str, null, bundle, false, s2.f.m());
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void m(@Nullable String eventName, @Nullable Double valueToSum, @Nullable Bundle parameters, boolean isImplicitlyLogged, @Nullable UUID currentSessionId) {
        if (c3.a.d(this) || eventName == null) {
            return;
        }
        try {
            if (eventName.length() == 0) {
                return;
            }
            com.facebook.internal.p pVar = com.facebook.internal.p.f15437a;
            if (com.facebook.internal.p.d("app_events_killswitch", k2.t.m(), false)) {
                com.facebook.internal.a0.INSTANCE.c(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", eventName);
                return;
            }
            try {
                INSTANCE.q(new AppEvent(this.contextName, eventName, valueToSum, parameters, isImplicitlyLogged, s2.f.o(), currentSessionId), this.accessTokenAppId);
            } catch (FacebookException e10) {
                com.facebook.internal.a0.INSTANCE.c(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e10.toString());
            } catch (JSONException e11) {
                com.facebook.internal.a0.INSTANCE.c(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e11.toString());
            }
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void n(@Nullable String str, @Nullable String str2) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            l(str, bundle);
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void o(@Nullable String eventName, @Nullable Double valueToSum, @Nullable Bundle parameters) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            m(eventName, valueToSum, parameters, true, s2.f.m());
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void p(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                j0 j0Var = j0.f15387a;
                j0.e0(f15234d, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, s2.f.m());
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void q(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle, boolean z10) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                INSTANCE.r("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                INSTANCE.r("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z10, s2.f.m());
            INSTANCE.g();
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void r(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            q(bigDecimal, currency, bundle, true);
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }
}
