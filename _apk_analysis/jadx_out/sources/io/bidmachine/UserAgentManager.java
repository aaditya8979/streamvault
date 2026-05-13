package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.webkit.WebSettings;
import bn.r;
import com.ironsource.Z7;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.util.DeviceUtils;
import io.bidmachine.util.UiUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserAgentManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u001d\u001e\u001f !\"#B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\u0019\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011¨\u0006$"}, d2 = {"Lio/bidmachine/UserAgentManager;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lbn/r;", MobileAdsBridgeBase.initializeMethodName, "", "getUserAgent", "updateWebViewUserAgent", "clear", "findWebUserAgent$bidmachine_android_sdk_bi_3_3_0", "(Landroid/content/Context;)Ljava/lang/String;", "findWebUserAgent", "", "DEFAULT_EXPIRATION_MS", "J", "SYSTEM_PROPERTY_HTTP_AGENT", "Ljava/lang/String;", "SYSTEM_HTTP_AGENT", "Ljava/util/concurrent/atomic/AtomicBoolean;", "WEB_USER_AGENT_PROCESSED", "Ljava/util/concurrent/atomic/AtomicBoolean;", "WEB_USER_AGENT_UPDATED", "applicationContext", "Landroid/content/Context;", "webUserAgent", "generatedUserAgent", "<init>", "()V", "ApplovinUserAgentSource", "BidMachineUserAgentSource", "FacebookUserAgentSource", "GeneratedUserAgentSource", "IronSourceUserAgentSource", "SharedPreferenceUserAgentSource", "UserAgentSource", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class UserAgentManager {

    @Nullable
    private static final String SYSTEM_HTTP_AGENT;

    @NotNull
    private static final String SYSTEM_PROPERTY_HTTP_AGENT = "http.agent";

    @NotNull
    private static final AtomicBoolean WEB_USER_AGENT_PROCESSED;

    @NotNull
    private static final AtomicBoolean WEB_USER_AGENT_UPDATED;

    @Nullable
    private static Context applicationContext;

    @Nullable
    private static String generatedUserAgent;

    @Nullable
    public static String webUserAgent;

    @NotNull
    public static final UserAgentManager INSTANCE = new UserAgentManager();
    private static final long DEFAULT_EXPIRATION_MS = TimeUnit.DAYS.toMillis(14);

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/UserAgentManager$ApplovinUserAgentSource;", "Lio/bidmachine/UserAgentManager$SharedPreferenceUserAgentSource;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ApplovinUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplovinUserAgentSource(@NotNull Context context) {
            super(context, "com.applovin.sdk.shared", "com.applovin.sdk.user_agent");
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\bR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lio/bidmachine/UserAgentManager$BidMachineUserAgentSource;", "Lio/bidmachine/UserAgentManager$UserAgentSource;", "Ljava/lang/Runnable;", "", "get", "Lbn/r;", "run", "checkAndUpdate", "", "calculateExpirationMs", "expirationMs", "J", "getExpirationMs", "()J", "Landroid/content/Context;", "applicationContext", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;J)V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class BidMachineUserAgentSource implements UserAgentSource, Runnable {

        @NotNull
        private final Context applicationContext;
        private final long expirationMs;

        public BidMachineUserAgentSource(@NotNull Context context, long j10) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            this.expirationMs = j10;
            Context applicationContext = context.getApplicationContext();
            tn.p.j(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        public final long calculateExpirationMs() {
            return System.currentTimeMillis() + this.expirationMs;
        }

        public final void checkAndUpdate() {
            String str = get();
            if (str == null || str.length() == 0) {
                UiUtils.onUiThread(this);
            }
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        @Nullable
        public String get() {
            return o2.getValidUserAgent(this.applicationContext);
        }

        public final long getExpirationMs() {
            return this.expirationMs;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UserAgentManager userAgentManager = UserAgentManager.INSTANCE;
                String defaultUserAgent = WebSettings.getDefaultUserAgent(this.applicationContext);
                if (defaultUserAgent != null) {
                    tn.p.j(defaultUserAgent, "getDefaultUserAgent(applicationContext)");
                    o2.setValidUserAgent(this.applicationContext, defaultUserAgent, calculateExpirationMs());
                } else {
                    defaultUserAgent = null;
                }
                UserAgentManager.webUserAgent = defaultUserAgent;
                r rVar = r.f5635a;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/UserAgentManager$FacebookUserAgentSource;", "Lio/bidmachine/UserAgentManager$SharedPreferenceUserAgentSource;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FacebookUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookUserAgentSource(@NotNull Context context) {
            super(context, "com.facebook.ads.internal.ua", "user_agent");
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002J$\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lio/bidmachine/UserAgentManager$GeneratedUserAgentSource;", "Lio/bidmachine/UserAgentManager$UserAgentSource;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "create", "Landroid/content/pm/PackageManager;", "packageManager", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "userAgentBuilder", "Lbn/r;", "appendChromeToUserAgent", "appendMobileToUserAgent", "get", "applicationContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class GeneratedUserAgentSource implements UserAgentSource {

        @NotNull
        private final Context applicationContext;

        public GeneratedUserAgentSource(@NotNull Context context) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            Context applicationContext = context.getApplicationContext();
            tn.p.j(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        private final void appendChromeToUserAgent(PackageManager packageManager, StringBuilder sb2) {
            String[] strArr = {"com.android.chrome", "com.google.android.webview", "com.android.webview"};
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(strArr[i10], 0);
                    sb2.append(" Chrome/");
                    sb2.append(packageInfo.versionName);
                    return;
                } catch (Throwable unused) {
                }
            }
        }

        private final void appendMobileToUserAgent(Context context, PackageManager packageManager, StringBuilder sb2) {
            String string;
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                sb2.append(" Mobile");
                sb2.append(Z7.f30794r);
                int i10 = applicationInfo.labelRes;
                if (i10 == 0) {
                    string = applicationInfo.nonLocalizedLabel.toString();
                } else {
                    string = context.getString(i10);
                    tn.p.j(string, "{\n                      …                        }");
                }
                sb2.append(string);
                sb2.append("/");
                sb2.append(packageInfo.versionName);
            } catch (Throwable unused) {
            }
        }

        private final String create(Context context) {
            try {
                StringBuilder sb2 = new StringBuilder("Mozilla/5.0");
                sb2.append(" (Linux; Android ");
                sb2.append(DeviceUtils.getOsVersion());
                sb2.append("; ");
                sb2.append(DeviceUtils.getModel());
                sb2.append(" Build/");
                sb2.append(DeviceUtils.getBuildId());
                sb2.append("; wv)");
                sb2.append(" AppleWebKit/537.36 (KHTML, like Gecko)");
                sb2.append(" Version/4.0");
                PackageManager packageManager = context.getPackageManager();
                tn.p.j(packageManager, "packageManager");
                tn.p.j(sb2, "userAgentBuilder");
                appendChromeToUserAgent(packageManager, sb2);
                appendMobileToUserAgent(context, packageManager, sb2);
                String string = sb2.toString();
                tn.p.j(string, "userAgentBuilder.toString()");
                return string;
            } catch (Throwable unused) {
                return "";
            }
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        @NotNull
        public String get() {
            return create(this.applicationContext);
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/UserAgentManager$IronSourceUserAgentSource;", "Lio/bidmachine/UserAgentManager$SharedPreferenceUserAgentSource;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class IronSourceUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IronSourceUserAgentSource(@NotNull Context context) {
            super(context, "Mediation_Shared_Preferences", "browser_user_agent");
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/bidmachine/UserAgentManager$SharedPreferenceUserAgentSource;", "Lio/bidmachine/UserAgentManager$UserAgentSource;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "name", "", "field", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "applicationContext", "sharedPreferences", "Landroid/content/SharedPreferences;", "get", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class SharedPreferenceUserAgentSource implements UserAgentSource {

        @NotNull
        private final Context applicationContext;

        @NotNull
        private final String field;

        @NotNull
        private final String name;

        @Nullable
        private SharedPreferences sharedPreferences;

        public SharedPreferenceUserAgentSource(@NotNull Context context, @NotNull String str, @NotNull String str2) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            tn.p.k(str, "name");
            tn.p.k(str2, "field");
            this.name = str;
            this.field = str2;
            Context applicationContext = context.getApplicationContext();
            tn.p.j(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        @Nullable
        public String get() {
            try {
                if (this.sharedPreferences == null) {
                    this.sharedPreferences = this.applicationContext.getSharedPreferences(this.name, 0);
                }
                SharedPreferences sharedPreferences = this.sharedPreferences;
                if (sharedPreferences != null) {
                    return sharedPreferences.getString(this.field, null);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, d2 = {"Lio/bidmachine/UserAgentManager$UserAgentSource;", "", "get", "", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface UserAgentSource {
        @Nullable
        String get();
    }

    static {
        String property;
        try {
            property = System.getProperty(SYSTEM_PROPERTY_HTTP_AGENT);
        } catch (Throwable unused) {
            property = null;
        }
        SYSTEM_HTTP_AGENT = property;
        WEB_USER_AGENT_PROCESSED = new AtomicBoolean(false);
        WEB_USER_AGENT_UPDATED = new AtomicBoolean(false);
    }

    private UserAgentManager() {
    }

    public static final void clear() {
        WEB_USER_AGENT_PROCESSED.set(false);
        webUserAgent = null;
        generatedUserAgent = null;
    }

    @Nullable
    public static final String getUserAgent() {
        return getUserAgent(applicationContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getUserAgent(@org.jetbrains.annotations.Nullable android.content.Context r3) {
        /*
            if (r3 != 0) goto L4
            android.content.Context r3 = io.bidmachine.UserAgentManager.applicationContext
        L4:
            java.lang.String r0 = io.bidmachine.UserAgentManager.webUserAgent
            if (r0 != 0) goto L12
            if (r3 == 0) goto L12
            io.bidmachine.UserAgentManager r0 = io.bidmachine.UserAgentManager.INSTANCE
            java.lang.String r0 = r0.findWebUserAgent$bidmachine_android_sdk_bi_3_3_0(r3)
            io.bidmachine.UserAgentManager.webUserAgent = r0
        L12:
            java.lang.String r0 = io.bidmachine.UserAgentManager.webUserAgent
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L25
            int r0 = r0.length()
            if (r0 <= 0) goto L20
            r0 = r1
            goto L21
        L20:
            r0 = r2
        L21:
            if (r0 != r1) goto L25
            r0 = r1
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L2b
            java.lang.String r3 = io.bidmachine.UserAgentManager.webUserAgent
            return r3
        L2b:
            java.lang.String r0 = io.bidmachine.UserAgentManager.generatedUserAgent
            if (r0 != 0) goto L3c
            if (r3 == 0) goto L3c
            io.bidmachine.UserAgentManager$GeneratedUserAgentSource r0 = new io.bidmachine.UserAgentManager$GeneratedUserAgentSource
            r0.<init>(r3)
            java.lang.String r3 = r0.get()
            io.bidmachine.UserAgentManager.generatedUserAgent = r3
        L3c:
            java.lang.String r3 = io.bidmachine.UserAgentManager.generatedUserAgent
            if (r3 == 0) goto L4c
            int r3 = r3.length()
            if (r3 <= 0) goto L48
            r3 = r1
            goto L49
        L48:
            r3 = r2
        L49:
            if (r3 != r1) goto L4c
            goto L4d
        L4c:
            r1 = r2
        L4d:
            if (r1 == 0) goto L52
            java.lang.String r3 = io.bidmachine.UserAgentManager.generatedUserAgent
            return r3
        L52:
            java.lang.String r3 = io.bidmachine.UserAgentManager.SYSTEM_HTTP_AGENT
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.UserAgentManager.getUserAgent(android.content.Context):java.lang.String");
    }

    public static final void initialize(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        applicationContext = context.getApplicationContext();
        INSTANCE.findWebUserAgent$bidmachine_android_sdk_bi_3_3_0(context);
    }

    public static final void updateWebViewUserAgent() {
        Context context;
        if (WEB_USER_AGENT_UPDATED.compareAndSet(false, true) && (context = applicationContext) != null) {
            try {
                new BidMachineUserAgentSource(context, DEFAULT_EXPIRATION_MS).checkAndUpdate();
                r rVar = r.f5635a;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String findWebUserAgent$bidmachine_android_sdk_bi_3_3_0(@org.jetbrains.annotations.NotNull android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            tn.p.k(r6, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = io.bidmachine.UserAgentManager.WEB_USER_AGENT_PROCESSED
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L12
            java.lang.String r6 = io.bidmachine.UserAgentManager.webUserAgent
            return r6
        L12:
            io.bidmachine.UserAgentManager$BidMachineUserAgentSource r0 = new io.bidmachine.UserAgentManager$BidMachineUserAgentSource
            long r3 = io.bidmachine.UserAgentManager.DEFAULT_EXPIRATION_MS
            r0.<init>(r6, r3)
            java.lang.String r0 = r0.get()
            if (r0 == 0) goto L2c
            int r3 = r0.length()
            if (r3 <= 0) goto L27
            r3 = r2
            goto L28
        L27:
            r3 = r1
        L28:
            if (r3 != r2) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            if (r3 == 0) goto L30
            return r0
        L30:
            io.bidmachine.UserAgentManager$ApplovinUserAgentSource r0 = new io.bidmachine.UserAgentManager$ApplovinUserAgentSource
            r0.<init>(r6)
            java.lang.String r0 = r0.get()
            if (r0 == 0) goto L48
            int r3 = r0.length()
            if (r3 <= 0) goto L43
            r3 = r2
            goto L44
        L43:
            r3 = r1
        L44:
            if (r3 != r2) goto L48
            r3 = r2
            goto L49
        L48:
            r3 = r1
        L49:
            if (r3 == 0) goto L4c
            return r0
        L4c:
            io.bidmachine.UserAgentManager$IronSourceUserAgentSource r0 = new io.bidmachine.UserAgentManager$IronSourceUserAgentSource
            r0.<init>(r6)
            java.lang.String r0 = r0.get()
            if (r0 == 0) goto L64
            int r3 = r0.length()
            if (r3 <= 0) goto L5f
            r3 = r2
            goto L60
        L5f:
            r3 = r1
        L60:
            if (r3 != r2) goto L64
            r3 = r2
            goto L65
        L64:
            r3 = r1
        L65:
            if (r3 == 0) goto L68
            return r0
        L68:
            io.bidmachine.UserAgentManager$FacebookUserAgentSource r0 = new io.bidmachine.UserAgentManager$FacebookUserAgentSource
            r0.<init>(r6)
            java.lang.String r6 = r0.get()
            if (r6 == 0) goto L7f
            int r0 = r6.length()
            if (r0 <= 0) goto L7b
            r0 = r2
            goto L7c
        L7b:
            r0 = r1
        L7c:
            if (r0 != r2) goto L7f
            r1 = r2
        L7f:
            if (r1 == 0) goto L82
            return r6
        L82:
            updateWebViewUserAgent()
            java.lang.String r6 = io.bidmachine.UserAgentManager.webUserAgent
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.UserAgentManager.findWebUserAgent$bidmachine_android_sdk_bi_3_3_0(android.content.Context):java.lang.String");
    }
}
