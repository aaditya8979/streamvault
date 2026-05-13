package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import cn.f0;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.g0;
import com.facebook.internal.j0;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.ironsource.C3978d4;
import com.ironsource.K5;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.iab.vast.tags.VastAttributes;
import k2.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NativeAppLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'B\u0011\b\u0010\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b&\u0010*J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J0\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0014J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J\u001a\u0010\u0014\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0012\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0005H\u0002R\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "", "requestCode", C3978d4.f.f31284f, "Landroid/content/Intent;", "data", "", CampaignEx.JSON_KEY_AD_K, "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "error", "errorMessage", IronSourceConstants.EVENTS_ERROR_CODE, "Lbn/r;", "w", "Landroid/os/Bundle;", "extras", VastAttributes.HORIZONTAL_POSITION, "v", "s", "t", "intent", "B", "z", "Lcom/facebook/login/LoginClient$Result;", K5.f29723b, "r", VastAttributes.VERTICAL_POSITION, "Lcom/facebook/AccessTokenSource;", "e", "Lcom/facebook/AccessTokenSource;", "u", "()Lcom/facebook/AccessTokenSource;", "tokenSource", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
@VisibleForTesting(otherwise = 3)
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AccessTokenSource tokenSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        tn.p.k(parcel, "source");
        this.tokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        tn.p.k(loginClient, "loginClient");
        this.tokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    public static final void A(NativeAppLoginMethodHandler nativeAppLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        tn.p.k(nativeAppLoginMethodHandler, "this$0");
        tn.p.k(request, "$request");
        tn.p.k(bundle, "$extras");
        try {
            nativeAppLoginMethodHandler.x(request, nativeAppLoginMethodHandler.l(request, bundle));
        } catch (FacebookServiceException e10) {
            FacebookRequestError requestError = e10.getRequestError();
            nativeAppLoginMethodHandler.w(request, requestError.getErrorType(), requestError.e(), String.valueOf(requestError.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE java.lang.String()));
        } catch (FacebookException e11) {
            nativeAppLoginMethodHandler.w(request, null, e11.getMessage(), null);
        }
    }

    public boolean B(@Nullable Intent intent, int requestCode) {
        ActivityResultLauncher<Intent> activityResultLauncherH;
        if (intent == null || !y(intent)) {
            return false;
        }
        Fragment fragment = e().getMe.goldze.mvvmhabit.base.ContainerActivity.FRAGMENT java.lang.String();
        bn.r rVar = null;
        LoginFragment loginFragment = fragment instanceof LoginFragment ? (LoginFragment) fragment : null;
        if (loginFragment != null && (activityResultLauncherH = loginFragment.h()) != null) {
            activityResultLauncherH.launch(intent);
            rVar = bn.r.f5635a;
        }
        return rVar != null;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean k(int requestCode, int resultCode, @Nullable Intent data) {
        LoginClient.Request pendingRequest = e().getPendingRequest();
        if (data == null) {
            r(LoginClient.Result.INSTANCE.a(pendingRequest, "Operation canceled"));
        } else if (resultCode == 0) {
            v(pendingRequest, data);
        } else if (resultCode != -1) {
            r(LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, pendingRequest, "Unexpected resultCode from authorization.", null, null, 8, null));
        } else {
            Bundle extras = data.getExtras();
            if (extras == null) {
                r(LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, pendingRequest, "Unexpected null from returned authorization data.", null, null, 8, null));
                return true;
            }
            String strS = s(extras);
            Object obj = extras.get("error_code");
            String string = obj == null ? null : obj.toString();
            String strT = t(extras);
            String string2 = extras.getString("e2e");
            if (!j0.X(string2)) {
                i(string2);
            }
            if (strS == null && string == null && strT == null && pendingRequest != null) {
                z(pendingRequest, extras);
            } else {
                w(pendingRequest, strS, strT, string);
            }
        }
        return true;
    }

    public final void r(LoginClient.Result result) {
        if (result != null) {
            e().h(result);
        } else {
            e().A();
        }
    }

    @Nullable
    public String s(@Nullable Bundle extras) {
        String string = extras == null ? null : extras.getString("error");
        if (string != null) {
            return string;
        }
        if (extras == null) {
            return null;
        }
        return extras.getString("error_type");
    }

    @Nullable
    public String t(@Nullable Bundle extras) {
        String string = extras == null ? null : extras.getString("error_message");
        if (string != null) {
            return string;
        }
        if (extras == null) {
            return null;
        }
        return extras.getString("error_description");
    }

    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    public void v(@Nullable LoginClient.Request request, @NotNull Intent intent) {
        Object obj;
        tn.p.k(intent, "data");
        Bundle extras = intent.getExtras();
        String strS = s(extras);
        String string = null;
        if (extras != null && (obj = extras.get("error_code")) != null) {
            string = obj.toString();
        }
        if (tn.p.f(g0.c(), string)) {
            r(LoginClient.Result.INSTANCE.c(request, strS, t(extras), string));
        } else {
            r(LoginClient.Result.INSTANCE.a(request, strS));
        }
    }

    public void w(@Nullable LoginClient.Request request, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (str != null && tn.p.f(str, "logged_out")) {
            CustomTabLoginMethodHandler.f15493m = true;
            r(null);
        } else if (f0.i0(g0.d(), str)) {
            r(null);
        } else if (f0.i0(g0.e(), str)) {
            r(LoginClient.Result.INSTANCE.a(request, null));
        } else {
            r(LoginClient.Result.INSTANCE.c(request, str, str2, str3));
        }
    }

    public void x(@NotNull LoginClient.Request request, @NotNull Bundle bundle) {
        tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
        tn.p.k(bundle, "extras");
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
            r(LoginClient.Result.INSTANCE.b(request, companion.b(request.p(), bundle, getTokenSource(), request.getApplicationId()), companion.d(bundle, request.getNonce())));
        } catch (FacebookException e10) {
            r(LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, request, null, e10.getMessage(), null, 8, null));
        }
    }

    public final boolean y(Intent intent) {
        tn.p.j(t.l().getPackageManager().queryIntentActivities(intent, 65536), "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !r3.isEmpty();
    }

    public final void z(final LoginClient.Request request, final Bundle bundle) {
        if (bundle.containsKey("code")) {
            j0 j0Var = j0.f15387a;
            if (!j0.X(bundle.getString("code"))) {
                t.t().execute(new Runnable() { // from class: com.facebook.login.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        NativeAppLoginMethodHandler.A(this.f15669b, request, bundle);
                    }
                });
                return;
            }
        }
        x(request, bundle);
    }
}
