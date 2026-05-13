package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.j0;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.Scopes;
import com.vungle.ads.internal.ui.AdActivity;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import k2.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000  2\u00020\u0001:\u0001!B\u0011\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "", "s", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "Landroid/os/Bundle;", "r", "parameters", "q", "values", "Lcom/facebook/FacebookException;", "error", "Lbn/r;", "v", "u", "token", "w", "e", "Ljava/lang/String;", "e2e", "Lcom/facebook/AccessTokenSource;", "t", "()Lcom/facebook/AccessTokenSource;", "tokenSource", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", InneractiveMediationDefs.GENDER_FEMALE, "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String e2e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        tn.p.k(parcel, "source");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        tn.p.k(loginClient, "loginClient");
    }

    @NotNull
    public Bundle q(@NotNull Bundle parameters, @NotNull LoginClient.Request request) {
        tn.p.k(parameters, "parameters");
        tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
        parameters.putString("redirect_uri", getValidRedirectURI());
        if (request.t()) {
            parameters.putString("app_id", request.getApplicationId());
        } else {
            parameters.putString("client_id", request.getApplicationId());
        }
        parameters.putString("e2e", LoginClient.INSTANCE.a());
        if (request.t()) {
            parameters.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.p().contains(Scopes.OPEN_ID)) {
                parameters.putString("nonce", request.getNonce());
            }
            parameters.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        parameters.putString("code_challenge", request.getCodeChallenge());
        CodeChallengeMethod codeChallengeMethod = request.getCodeChallengeMethod();
        parameters.putString("code_challenge_method", codeChallengeMethod == null ? null : codeChallengeMethod.name());
        parameters.putString("return_scopes", "true");
        parameters.putString("auth_type", request.getAuthType());
        parameters.putString("login_behavior", request.getLoginBehavior().name());
        parameters.putString("sdk", tn.p.t("android-", t.B()));
        if (s() != null) {
            parameters.putString("sso", s());
        }
        parameters.putString("cct_prefetching", t.hasCustomTabsPrefetching ? "1" : "0");
        if (request.getIsFamilyLogin()) {
            parameters.putString("fx_app", request.getLoginTargetApp().getTargetApp());
        }
        if (request.getShouldSkipAccountDeduplication()) {
            parameters.putString("skip_dedupe", "true");
        }
        if (request.getMessengerPageId() != null) {
            parameters.putString("messenger_page_id", request.getMessengerPageId());
            parameters.putString("reset_messenger_state", request.getResetMessengerState() ? "1" : "0");
        }
        return parameters;
    }

    @NotNull
    public Bundle r(@NotNull LoginClient.Request request) {
        tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
        Bundle bundle = new Bundle();
        j0 j0Var = j0.f15387a;
        if (!j0.Y(request.p())) {
            String strJoin = TextUtils.join(StringUtils.COMMA, request.p());
            bundle.putString("scope", strJoin);
            b("scope", strJoin);
        }
        DefaultAudience defaultAudience = request.getDefaultAudience();
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        bundle.putString("default_audience", defaultAudience.getNativeProtocolAudience());
        bundle.putString("state", d(request.getAuthId()));
        AccessToken accessTokenE = AccessToken.INSTANCE.e();
        String token = accessTokenE == null ? null : accessTokenE.getToken();
        if (token == null || !tn.p.f(token, u())) {
            FragmentActivity activity = e().getActivity();
            if (activity != null) {
                j0.i(activity);
            }
            b("access_token", "0");
        } else {
            bundle.putString("access_token", token);
            b("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", t.p() ? "1" : "0");
        return bundle;
    }

    @Nullable
    public String s() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public abstract AccessTokenSource getTokenSource();

    public final String u() {
        Context activity = e().getActivity();
        if (activity == null) {
            activity = t.l();
        }
        return activity.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    @VisibleForTesting(otherwise = 4)
    public void v(@NotNull LoginClient.Request request, @Nullable Bundle bundle, @Nullable FacebookException facebookException) {
        String strValueOf;
        LoginClient.Result resultC;
        tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
        LoginClient loginClientE = e();
        this.e2e = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.e2e = bundle.getString("e2e");
            }
            try {
                LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
                AccessToken accessTokenB = companion.b(request.p(), bundle, getTokenSource(), request.getApplicationId());
                resultC = LoginClient.Result.INSTANCE.b(loginClientE.getPendingRequest(), accessTokenB, companion.d(bundle, request.getNonce()));
                if (loginClientE.getActivity() != null) {
                    try {
                        CookieSyncManager.createInstance(loginClientE.getActivity()).sync();
                    } catch (Exception unused) {
                    }
                    if (accessTokenB != null) {
                        w(accessTokenB.getToken());
                    }
                }
            } catch (FacebookException e10) {
                resultC = LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, loginClientE.getPendingRequest(), null, e10.getMessage(), null, 8, null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            resultC = LoginClient.Result.INSTANCE.a(loginClientE.getPendingRequest(), "User canceled log in.");
        } else {
            this.e2e = null;
            String message = facebookException == null ? null : facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError requestError = ((FacebookServiceException) facebookException).getRequestError();
                strValueOf = String.valueOf(requestError.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE java.lang.String());
                message = requestError.toString();
            } else {
                strValueOf = null;
            }
            resultC = LoginClient.Result.INSTANCE.c(loginClientE.getPendingRequest(), null, message, strValueOf);
        }
        j0 j0Var = j0.f15387a;
        if (!j0.X(this.e2e)) {
            i(this.e2e);
        }
        loginClientE.h(resultC);
    }

    public final void w(String str) {
        Context activity = e().getActivity();
        if (activity == null) {
            activity = t.l();
        }
        activity.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }
}
