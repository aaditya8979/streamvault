package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import bo.d0;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.appevents.x;
import com.facebook.internal.j0;
import com.facebook.login.LoginClient;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import k2.t;
import k2.z;
import kotlin.Metadata;
import me.goldze.mvvmhabit.base.ContainerActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LoginMethodHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b'\u0018\u0000 \u00152\u00020\u0001:\u00018B\u0011\b\u0016\u0012\u0006\u00101\u001a\u00020+¢\u0006\u0004\b5\u00100B\u0011\b\u0014\u0012\u0006\u00106\u001a\u00020\u001f¢\u0006\u0004\b5\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0014J\u001c\u0010\u0019\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014J\u0012\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u0014J\u0018\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0014J\u0018\u0010\"\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\nH\u0016R4\u0010*\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00101\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00104\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00069"}, d2 = {"Lcom/facebook/login/LoginMethodHandler;", "Landroid/os/Parcelable;", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "p", "requestCode", C3978d4.f.f31284f, "Landroid/content/Intent;", "data", "", CampaignEx.JSON_KEY_AD_K, "j", "Lbn/r;", "c", "Lorg/json/JSONObject;", "param", InneractiveMediationDefs.GENDER_MALE, "", "h", "authId", "d", "key", "", "value", "b", "e2e", "i", "Landroid/os/Bundle;", "values", "l", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "o", "", "Ljava/util/Map;", InneractiveMediationDefs.GENDER_FEMALE, "()Ljava/util/Map;", "setMethodLoggingExtras", "(Ljava/util/Map;)V", "methodLoggingExtras", "Lcom/facebook/login/LoginClient;", "Lcom/facebook/login/LoginClient;", "e", "()Lcom/facebook/login/LoginClient;", "n", "(Lcom/facebook/login/LoginClient;)V", "loginClient", "g", "()Ljava/lang/String;", "nameForLogging", "<init>", "source", "(Landroid/os/Parcel;)V", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
@VisibleForTesting(otherwise = 3)
public abstract class LoginMethodHandler implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Map<String, String> methodLoggingExtras;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public LoginClient loginClient;

    /* JADX INFO: renamed from: com.facebook.login.LoginMethodHandler$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LoginMethodHandler.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J$\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J6\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/facebook/login/LoginMethodHandler$a;", "", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", "expectedNonce", "Lcom/facebook/AuthenticationToken;", "c", "Lcom/facebook/AccessTokenSource;", "source", "applicationId", "Lcom/facebook/AccessToken;", "a", "d", "", "requestedPermissions", "b", "signedRequest", "e", "NO_SIGNED_REQUEST_ERROR_MESSAGE", "Ljava/lang/String;", "NO_USER_ID_ERROR_MESSAGE", "USER_CANCELED_LOG_IN_ERROR_MESSAGE", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        @Nullable
        public final AccessToken a(@NotNull Bundle bundle, @Nullable AccessTokenSource source, @NotNull String applicationId) {
            String string;
            tn.p.k(bundle, ContainerActivity.BUNDLE);
            tn.p.k(applicationId, "applicationId");
            j0 j0Var = j0.f15387a;
            Date dateW = j0.w(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date dateW2 = j0.w(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 != null) {
                if (!(string2.length() == 0) && (string = bundle.getString("com.facebook.platform.extra.USER_ID")) != null) {
                    if (!(string.length() == 0)) {
                        return new AccessToken(string2, applicationId, string, stringArrayList, null, null, source, dateW, new Date(), dateW2, bundle.getString("graph_domain"));
                    }
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.AccessToken b(@org.jetbrains.annotations.Nullable java.util.Collection<java.lang.String> r20, @org.jetbrains.annotations.NotNull android.os.Bundle r21, @org.jetbrains.annotations.Nullable com.facebook.AccessTokenSource r22, @org.jetbrains.annotations.NotNull java.lang.String r23) throws com.facebook.FacebookException {
            /*
                Method dump skipped, instruction units count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginMethodHandler.Companion.b(java.util.Collection, android.os.Bundle, com.facebook.AccessTokenSource, java.lang.String):com.facebook.AccessToken");
        }

        @Nullable
        public final AuthenticationToken c(@NotNull Bundle bundle, @Nullable String expectedNonce) throws FacebookException {
            tn.p.k(bundle, ContainerActivity.BUNDLE);
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null) {
                if (!(string.length() == 0) && expectedNonce != null) {
                    if (!(expectedNonce.length() == 0)) {
                        try {
                            return new AuthenticationToken(string, expectedNonce);
                        } catch (Exception e10) {
                            throw new FacebookException(e10.getMessage());
                        }
                    }
                }
            }
            return null;
        }

        @Nullable
        public final AuthenticationToken d(@NotNull Bundle bundle, @Nullable String expectedNonce) throws FacebookException {
            tn.p.k(bundle, ContainerActivity.BUNDLE);
            String string = bundle.getString("id_token");
            if (string != null) {
                if (!(string.length() == 0) && expectedNonce != null) {
                    if (!(expectedNonce.length() == 0)) {
                        try {
                            return new AuthenticationToken(string, expectedNonce);
                        } catch (Exception e10) {
                            throw new FacebookException(e10.getMessage(), e10);
                        }
                    }
                }
            }
            return null;
        }

        @NotNull
        public final String e(@Nullable String signedRequest) throws FacebookException {
            Object[] array;
            if (signedRequest != null) {
                if (!(signedRequest.length() == 0)) {
                    try {
                        array = d0.U0(signedRequest, new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        byte[] bArrDecode = Base64.decode(strArr[1], 0);
                        tn.p.j(bArrDecode, "data");
                        String string = new JSONObject(new String(bArrDecode, bo.c.f5639b)).getString("user_id");
                        tn.p.j(string, "jsonObject.getString(\"user_id\")");
                        return string;
                    }
                    throw new FacebookException("Failed to retrieve user_id from signed_request");
                }
            }
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
    }

    public LoginMethodHandler(@NotNull Parcel parcel) {
        tn.p.k(parcel, "source");
        Map<String, String> mapO0 = j0.o0(parcel);
        this.methodLoggingExtras = mapO0 == null ? null : kotlin.collections.a.C(mapO0);
    }

    public LoginMethodHandler(@NotNull LoginClient loginClient) {
        tn.p.k(loginClient, "loginClient");
        n(loginClient);
    }

    public void b(@Nullable String str, @Nullable Object obj) {
        if (this.methodLoggingExtras == null) {
            this.methodLoggingExtras = new HashMap();
        }
        Map<String, String> map = this.methodLoggingExtras;
        if (map == null) {
            return;
        }
        map.put(str, obj == null ? null : obj.toString());
    }

    public void c() {
    }

    @NotNull
    public String d(@NotNull String authId) {
        tn.p.k(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", getNameForLogging());
            m(jSONObject);
        } catch (JSONException e10) {
            Log.w("LoginMethodHandler", tn.p.t("Error creating client state json: ", e10.getMessage()));
        }
        String string = jSONObject.toString();
        tn.p.j(string, "param.toString()");
        return string;
    }

    @NotNull
    public final LoginClient e() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        tn.p.C("loginClient");
        throw null;
    }

    @Nullable
    public final Map<String, String> f() {
        return this.methodLoggingExtras;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public abstract String getNameForLogging();

    @NotNull
    /* JADX INFO: renamed from: h */
    public String getValidRedirectURI() {
        return "fb" + t.m() + "://authorize/";
    }

    public void i(@Nullable String str) {
        LoginClient.Request requestO = e().getPendingRequest();
        String strC = requestO == null ? null : requestO.getApplicationId();
        if (strC == null) {
            strC = t.m();
        }
        x xVar = new x(e().getActivity(), strC);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", strC);
        xVar.h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    public boolean j() {
        return false;
    }

    public boolean k(int requestCode, int resultCode, @Nullable Intent data) {
        return false;
    }

    @NotNull
    public Bundle l(@NotNull LoginClient.Request request, @NotNull Bundle values) throws FacebookException {
        GraphRequest graphRequestA;
        tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
        tn.p.k(values, "values");
        String string = values.getString("code");
        if (j0.X(string)) {
            throw new FacebookException("No code param found from the request");
        }
        if (string == null) {
            graphRequestA = null;
        } else {
            s sVar = s.f15673a;
            String validRedirectURI = getValidRedirectURI();
            String strH = request.getCodeVerifier();
            if (strH == null) {
                strH = "";
            }
            graphRequestA = s.a(string, validRedirectURI, strH);
        }
        if (graphRequestA == null) {
            throw new FacebookException("Failed to create code exchange request");
        }
        z zVarK = graphRequestA.k();
        FacebookRequestError error = zVarK.getError();
        if (error != null) {
            throw new FacebookServiceException(error, error.e());
        }
        try {
            JSONObject graphObject = zVarK.getGraphObject();
            String string2 = graphObject != null ? graphObject.getString("access_token") : null;
            if (graphObject == null || j0.X(string2)) {
                throw new FacebookException("No access token found from result");
            }
            values.putString("access_token", string2);
            if (graphObject.has("id_token")) {
                values.putString("id_token", graphObject.getString("id_token"));
            }
            return values;
        } catch (JSONException e10) {
            throw new FacebookException(tn.p.t("Fail to process code exchange response: ", e10.getMessage()));
        }
    }

    public void m(@NotNull JSONObject jSONObject) throws JSONException {
        tn.p.k(jSONObject, "param");
    }

    public final void n(@NotNull LoginClient loginClient) {
        tn.p.k(loginClient, "<set-?>");
        this.loginClient = loginClient;
    }

    public boolean o() {
        return false;
    }

    public abstract int p(@NotNull LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        tn.p.k(parcel, "dest");
        j0 j0Var = j0.f15387a;
        j0.C0(parcel, this.methodLoggingExtras);
    }
}
