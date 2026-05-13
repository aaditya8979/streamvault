package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import bo.a0;
import cn.f0;
import cn.w0;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.k0;
import com.facebook.login.LoginClient;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import com.ironsource.C4157n2;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k2.h;
import k2.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 &2\u00020\u0001:\u0003-O3B\u0007¢\u0006\u0004\bM\u0010NJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002JL\u0010\u0012\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002JH\u0010 \u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u000fH\u0002J,\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0017J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0014J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0004H\u0014R$\u00101\u001a\u00020+2\u0006\u0010,\u001a\u00020+8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R$\u00107\u001a\u0002022\u0006\u0010,\u001a\u0002028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010@\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010=R\u0016\u0010C\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010BR$\u0010H\u001a\u00020D2\u0006\u0010,\u001a\u00020D8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010E\u001a\u0004\bF\u0010GR$\u0010I\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\bI\u0010JR$\u0010L\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bK\u0010J¨\u0006P"}, d2 = {"Lcom/facebook/login/LoginManager;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/facebook/login/LoginClient$Request;", "loginRequest", "Lbn/r;", "i", "Lcom/facebook/login/LoginClient$Result$Code;", "result", "", "", "resultExtras", "Ljava/lang/Exception;", "exception", "", "wasLoginActivityTried", AdActivity.REQUEST_KEY_EXTRA, "h", "Landroid/content/Intent;", "intent", "l", "Lcom/facebook/AccessToken;", "newToken", "Lcom/facebook/AuthenticationToken;", "newIdToken", "origRequest", "Lcom/facebook/FacebookException;", "isCanceled", "Lk2/i;", "Lcom/facebook/login/p;", "callback", InneractiveMediationDefs.GENDER_FEMALE, "isExpressLoginAllowed", InneractiveMediationDefs.GENDER_MALE, "", C3978d4.f.f31284f, "data", "j", "Lcom/facebook/login/k;", "loginConfig", "e", "g", "Lcom/facebook/login/LoginBehavior;", "<set-?>", "a", "Lcom/facebook/login/LoginBehavior;", "getLoginBehavior", "()Lcom/facebook/login/LoginBehavior;", "loginBehavior", "Lcom/facebook/login/DefaultAudience;", "b", "Lcom/facebook/login/DefaultAudience;", "getDefaultAudience", "()Lcom/facebook/login/DefaultAudience;", "defaultAudience", "Landroid/content/SharedPreferences;", "c", "Landroid/content/SharedPreferences;", "sharedPreferences", "d", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "authType", "messengerPageId", "Z", "resetMessengerState", "Lcom/facebook/login/LoginTargetApp;", "Lcom/facebook/login/LoginTargetApp;", "getLoginTargetApp", "()Lcom/facebook/login/LoginTargetApp;", "loginTargetApp", "isFamilyLogin", "()Z", "getShouldSkipAccountDeduplication", "shouldSkipAccountDeduplication", "<init>", "()V", "FacebookLoginActivityResultContract", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public class LoginManager {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Set<String> f15594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f15595l;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String messengerPageId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean resetMessengerState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isFamilyLogin;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean shouldSkipAccountDeduplication;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public DefaultAudience defaultAudience = DefaultAudience.FRIENDS;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String authType = "rerequest";

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;

    /* JADX INFO: compiled from: LoginManager.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016R$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/facebook/login/LoginManager$FacebookLoginActivityResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Lk2/h$a;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "permissions", "Landroid/content/Intent;", "a", "", C3978d4.f.f31284f, "intent", "b", "Lk2/h;", "Lk2/h;", "getCallbackManager", "()Lk2/h;", "setCallbackManager", "(Lk2/h;)V", "callbackManager", "Ljava/lang/String;", "getLoggerID", "()Ljava/lang/String;", "setLoggerID", "(Ljava/lang/String;)V", "loggerID", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public final class FacebookLoginActivityResultContract extends ActivityResultContract<Collection<? extends String>, h.ActivityResultParameters> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public k2.h callbackManager;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String loggerID;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LoginManager f15607c;

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull Collection<String> permissions) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            tn.p.k(permissions, "permissions");
            LoginClient.Request requestE = this.f15607c.e(new k(permissions, null, 2, null));
            String str = this.loggerID;
            if (str != null) {
                requestE.v(str);
            }
            this.f15607c.i(context, requestE);
            Intent intentG = this.f15607c.g(requestE);
            if (this.f15607c.l(intentG)) {
                return intentG;
            }
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            this.f15607c.h(context, LoginClient.Result.Code.ERROR, null, facebookException, false, requestE);
            throw facebookException;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h.ActivityResultParameters parseResult(int resultCode, @Nullable Intent intent) {
            LoginManager.k(this.f15607c, resultCode, intent, null, 4, null);
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            k2.h hVar = this.callbackManager;
            if (hVar != null) {
                hVar.onActivityResult(requestCode, resultCode, intent);
            }
            return new h.ActivityResultParameters(requestCode, resultCode, intent);
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginManager$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LoginManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/facebook/login/LoginManager$a;", "", "", "permission", "", "d", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "Lcom/facebook/AccessToken;", "newToken", "Lcom/facebook/AuthenticationToken;", "newIdToken", "Lcom/facebook/login/p;", "b", "", "c", "()Ljava/util/Set;", "otherPublishPermissions", "EXPRESS_LOGIN_ALLOWED", "Ljava/lang/String;", "MANAGE_PERMISSION_PREFIX", "OTHER_PUBLISH_PERMISSIONS", "Ljava/util/Set;", "PREFERENCE_LOGIN_MANAGER", "PUBLISH_PERMISSION_PREFIX", "TAG", "Lcom/facebook/login/LoginManager;", C4157n2.f33007p, "Lcom/facebook/login/LoginManager;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        @VisibleForTesting(otherwise = 2)
        @NotNull
        public final LoginResult b(@NotNull LoginClient.Request request, @NotNull AccessToken newToken, @Nullable AuthenticationToken newIdToken) {
            tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
            tn.p.k(newToken, "newToken");
            Set<String> setP = request.p();
            Set setK1 = f0.k1(f0.q0(newToken.k()));
            if (request.getIsRerequest()) {
                setK1.retainAll(setP);
            }
            Set setK12 = f0.k1(f0.q0(setP));
            setK12.removeAll(setK1);
            return new LoginResult(newToken, newIdToken, setK1, setK12);
        }

        public final Set<String> c() {
            return w0.j("ads_management", "create_event", "rsvp_event");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean d(@Nullable String permission) {
            if (permission != null) {
                return a0.W(permission, "publish", false, 2, null) || a0.W(permission, "manage", false, 2, null) || LoginManager.f15594k.contains(permission);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: LoginManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/login/LoginManager$b;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/facebook/login/o;", "a", "b", "Lcom/facebook/login/o;", "logger", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f15608a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public static o logger;

        /* JADX WARN: Removed duplicated region for block: B:12:0x000f A[Catch: all -> 0x0008, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized com.facebook.login.o a(@org.jetbrains.annotations.Nullable android.content.Context r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                if (r3 != 0) goto La
                android.content.Context r3 = k2.t.l()     // Catch: java.lang.Throwable -> L8
                goto La
            L8:
                r3 = move-exception
                goto L22
            La:
                if (r3 != 0) goto Lf
                r3 = 0
                monitor-exit(r2)
                return r3
            Lf:
                com.facebook.login.o r0 = com.facebook.login.LoginManager.b.logger     // Catch: java.lang.Throwable -> L8
                if (r0 != 0) goto L1e
                com.facebook.login.o r0 = new com.facebook.login.o     // Catch: java.lang.Throwable -> L8
                java.lang.String r1 = k2.t.m()     // Catch: java.lang.Throwable -> L8
                r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L8
                com.facebook.login.LoginManager.b.logger = r0     // Catch: java.lang.Throwable -> L8
            L1e:
                com.facebook.login.o r3 = com.facebook.login.LoginManager.b.logger     // Catch: java.lang.Throwable -> L8
                monitor-exit(r2)
                return r3
            L22:
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginManager.b.a(android.content.Context):com.facebook.login.o");
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f15594k = companion.c();
        String string = LoginManager.class.toString();
        tn.p.j(string, "LoginManager::class.java.toString()");
        f15595l = string;
    }

    public LoginManager() {
        k0.m();
        SharedPreferences sharedPreferences = t.l().getSharedPreferences("com.facebook.loginManager", 0);
        tn.p.j(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
        if (!t.hasCustomTabsPrefetching || com.facebook.internal.e.a() == null) {
            return;
        }
        CustomTabsClient.bindCustomTabsService(t.l(), "com.android.chrome", new CustomTabPrefetchHelper());
        CustomTabsClient.connectAndInitialize(t.l(), t.l().getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean k(LoginManager loginManager, int i10, Intent intent, k2.i iVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i11 & 4) != 0) {
            iVar = null;
        }
        return loginManager.j(i10, intent, iVar);
    }

    @NotNull
    public LoginClient.Request e(@NotNull k loginConfig) {
        String codeVerifier;
        tn.p.k(loginConfig, "loginConfig");
        CodeChallengeMethod codeChallengeMethod = CodeChallengeMethod.S256;
        try {
            s sVar = s.f15673a;
            codeVerifier = s.b(loginConfig.getCodeVerifier(), codeChallengeMethod);
        } catch (FacebookException unused) {
            codeChallengeMethod = CodeChallengeMethod.PLAIN;
            codeVerifier = loginConfig.getCodeVerifier();
        }
        LoginBehavior loginBehavior = this.loginBehavior;
        Set setL1 = f0.l1(loginConfig.c());
        DefaultAudience defaultAudience = this.defaultAudience;
        String str = this.authType;
        String strM = t.m();
        String string = UUID.randomUUID().toString();
        tn.p.j(string, "randomUUID().toString()");
        LoginTargetApp loginTargetApp = this.loginTargetApp;
        String nonce = loginConfig.getNonce();
        String codeVerifier2 = loginConfig.getCodeVerifier();
        LoginClient.Request request = new LoginClient.Request(loginBehavior, setL1, defaultAudience, str, strM, string, loginTargetApp, nonce, codeVerifier2, codeVerifier, codeChallengeMethod);
        request.z(AccessToken.INSTANCE.g());
        request.x(this.messengerPageId);
        request.A(this.resetMessengerState);
        request.w(this.isFamilyLogin);
        request.B(this.shouldSkipAccountDeduplication);
        return request;
    }

    public final void f(AccessToken accessToken, AuthenticationToken authenticationToken, LoginClient.Request request, FacebookException facebookException, boolean z10, k2.i<LoginResult> iVar) {
        if (accessToken != null) {
            AccessToken.INSTANCE.h(accessToken);
            Profile.INSTANCE.a();
        }
        if (authenticationToken != null) {
            AuthenticationToken.INSTANCE.a(authenticationToken);
        }
        if (iVar != null) {
            LoginResult loginResultB = (accessToken == null || request == null) ? null : INSTANCE.b(request, accessToken, authenticationToken);
            if (z10 || (loginResultB != null && loginResultB.a().isEmpty())) {
                iVar.onCancel();
                return;
            }
            if (facebookException != null) {
                iVar.a(facebookException);
            } else {
                if (accessToken == null || loginResultB == null) {
                    return;
                }
                m(true);
                iVar.onSuccess(loginResultB);
            }
        }
    }

    @NotNull
    public Intent g(@NotNull LoginClient.Request request) {
        tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
        Intent intent = new Intent();
        intent.setClass(t.l(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable(AdActivity.REQUEST_KEY_EXTRA, request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public final void h(Context context, LoginClient.Result.Code code, Map<String, String> map, Exception exc, boolean z10, LoginClient.Request request) {
        o oVarA = b.f15608a.a(context);
        if (oVarA == null) {
            return;
        }
        if (request == null) {
            o.k(oVarA, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z10 ? "1" : "0");
        oVarA.f(request.getAuthId(), map2, code, map, exc, request.getIsFamilyLogin() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    public final void i(Context context, LoginClient.Request request) {
        o oVarA = b.f15608a.a(context);
        if (oVarA == null || request == null) {
            return;
        }
        oVarA.i(request, request.getIsFamilyLogin() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    @androidx.annotation.VisibleForTesting(otherwise = 3)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(int r16, @org.jetbrains.annotations.Nullable android.content.Intent r17, @org.jetbrains.annotations.Nullable k2.i<com.facebook.login.LoginResult> r18) {
        /*
            r15 = this;
            r0 = r16
            r1 = r17
            com.facebook.login.LoginClient$Result$Code r2 = com.facebook.login.LoginClient.Result.Code.ERROR
            r3 = 1
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L46
            java.lang.Class<com.facebook.login.LoginClient$Result> r6 = com.facebook.login.LoginClient.Result.class
            java.lang.ClassLoader r6 = r6.getClassLoader()
            r1.setExtrasClassLoader(r6)
            java.lang.String r6 = "com.facebook.LoginFragment:Result"
            android.os.Parcelable r1 = r1.getParcelableExtra(r6)
            com.facebook.login.LoginClient$Result r1 = (com.facebook.login.LoginClient.Result) r1
            if (r1 == 0) goto L51
            com.facebook.login.LoginClient$Request r2 = r1.com.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String
            com.facebook.login.LoginClient$Result$Code r6 = r1.code
            r7 = -1
            if (r0 == r7) goto L2c
            if (r0 == 0) goto L2a
        L27:
            r0 = r4
            r7 = r0
            goto L3f
        L2a:
            r5 = r3
            goto L27
        L2c:
            com.facebook.login.LoginClient$Result$Code r0 = com.facebook.login.LoginClient.Result.Code.SUCCESS
            if (r6 != r0) goto L35
            com.facebook.AccessToken r0 = r1.token
            com.facebook.AuthenticationToken r7 = r1.authenticationToken
            goto L3f
        L35:
            com.facebook.FacebookAuthorizationException r0 = new com.facebook.FacebookAuthorizationException
            java.lang.String r7 = r1.errorMessage
            r0.<init>(r7)
            r7 = r4
            r4 = r0
            r0 = r7
        L3f:
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.loggingExtras
            r8 = r1
            r13 = r5
            r1 = r7
            r7 = r6
            goto L57
        L46:
            if (r0 != 0) goto L51
            com.facebook.login.LoginClient$Result$Code r2 = com.facebook.login.LoginClient.Result.Code.CANCEL
            r7 = r2
            r13 = r3
            r0 = r4
            r1 = r0
            r2 = r1
            r8 = r2
            goto L57
        L51:
            r7 = r2
            r0 = r4
            r1 = r0
            r2 = r1
            r8 = r2
            r13 = r5
        L57:
            if (r4 != 0) goto L64
            if (r0 != 0) goto L64
            if (r13 != 0) goto L64
            com.facebook.FacebookException r4 = new com.facebook.FacebookException
            java.lang.String r5 = "Unexpected call to LoginManager.onActivityResult"
            r4.<init>(r5)
        L64:
            r12 = r4
            r10 = 1
            r6 = 0
            r5 = r15
            r9 = r12
            r11 = r2
            r5.h(r6, r7, r8, r9, r10, r11)
            r8 = r15
            r9 = r0
            r10 = r1
            r14 = r18
            r8.f(r9, r10, r11, r12, r13, r14)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginManager.j(int, android.content.Intent, k2.i):boolean");
    }

    public final boolean l(Intent intent) {
        return t.l().getPackageManager().resolveActivity(intent, 0) != null;
    }

    public final void m(boolean z10) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("express_login_allowed", z10);
        editorEdit.apply();
    }
}
