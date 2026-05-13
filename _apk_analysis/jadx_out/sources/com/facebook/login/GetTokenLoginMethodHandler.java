package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cn.w;
import cn.w0;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.e0;
import com.facebook.internal.j0;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.Scopes;
import com.vungle.ads.internal.ui.AdActivity;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import k2.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: GetTokenLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\b\u0010\r\u001a\u00020\u0006H\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lbn/r;", "c", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "p", "Landroid/os/Bundle;", "result", "s", "t", "r", "describeContents", "Lcom/facebook/login/i;", "e", "Lcom/facebook/login/i;", "getTokenClient", "", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/String;", "g", "()Ljava/lang/String;", "nameForLogging", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public i getTokenClient;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String nameForLogging;

    @NotNull
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new a();

    /* JADX INFO: compiled from: GetTokenLoginMethodHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/GetTokenLoginMethodHandler$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/GetTokenLoginMethodHandler;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/login/GetTokenLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Parcelable.Creator<GetTokenLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            tn.p.k(source, "source");
            return new GetTokenLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler[] newArray(int size) {
            return new GetTokenLoginMethodHandler[size];
        }
    }

    /* JADX INFO: compiled from: GetTokenLoginMethodHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/facebook/login/GetTokenLoginMethodHandler$c", "Lcom/facebook/internal/j0$a;", "Lorg/json/JSONObject;", "userInfo", "Lbn/r;", "a", "Lcom/facebook/FacebookException;", "error", "b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class c implements j0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f15535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GetTokenLoginMethodHandler f15536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LoginClient.Request f15537c;

        public c(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
            this.f15535a = bundle;
            this.f15536b = getTokenLoginMethodHandler;
            this.f15537c = request;
        }

        @Override // com.facebook.internal.j0.a
        public void a(@Nullable JSONObject jSONObject) {
            try {
                this.f15535a.putString("com.facebook.platform.extra.USER_ID", jSONObject == null ? null : jSONObject.getString("id"));
                this.f15536b.t(this.f15537c, this.f15535a);
            } catch (JSONException e10) {
                this.f15536b.e().g(LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, this.f15536b.e().getPendingRequest(), "Caught exception", e10.getMessage(), null, 8, null));
            }
        }

        @Override // com.facebook.internal.j0.a
        public void b(@Nullable FacebookException facebookException) {
            this.f15536b.e().g(LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, this.f15536b.e().getPendingRequest(), "Caught exception", facebookException == null ? null : facebookException.getMessage(), null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        tn.p.k(parcel, "source");
        this.nameForLogging = "get_token";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        tn.p.k(loginClient, "loginClient");
        this.nameForLogging = "get_token";
    }

    public static final void u(GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        tn.p.k(getTokenLoginMethodHandler, "this$0");
        tn.p.k(request, "$request");
        getTokenLoginMethodHandler.s(request, bundle);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void c() {
        i iVar = this.getTokenClient;
        if (iVar == null) {
            return;
        }
        iVar.m();
        iVar.q(null);
        this.getTokenClient = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int p(@NotNull final LoginClient.Request request) {
        tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
        Context activity = e().getActivity();
        if (activity == null) {
            activity = t.l();
        }
        i iVar = new i(activity, request);
        this.getTokenClient = iVar;
        if (tn.p.f(Boolean.valueOf(iVar.r()), Boolean.FALSE)) {
            return 0;
        }
        e().r();
        e0.b bVar = new e0.b() { // from class: com.facebook.login.j
            @Override // com.facebook.internal.e0.b
            public final void a(Bundle bundle) {
                GetTokenLoginMethodHandler.u(this.f15650a, request, bundle);
            }
        };
        i iVar2 = this.getTokenClient;
        if (iVar2 == null) {
            return 1;
        }
        iVar2.q(bVar);
        return 1;
    }

    public final void r(@NotNull LoginClient.Request request, @NotNull Bundle bundle) {
        tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
        tn.p.k(bundle, "result");
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (!(string == null || string.length() == 0)) {
            t(request, bundle);
            return;
        }
        e().r();
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        j0 j0Var = j0.f15387a;
        j0.D(string2, new c(bundle, this, request));
    }

    public final void s(@NotNull LoginClient.Request request, @Nullable Bundle bundle) {
        tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
        i iVar = this.getTokenClient;
        if (iVar != null) {
            iVar.q(null);
        }
        this.getTokenClient = null;
        e().s();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = w.m();
            }
            Set<String> setP = request.p();
            if (setP == null) {
                setP = w0.f();
            }
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (setP.contains(Scopes.OPEN_ID)) {
                if (string == null || string.length() == 0) {
                    e().A();
                    return;
                }
            }
            if (stringArrayList.containsAll(setP)) {
                r(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : setP) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                b("new_permissions", TextUtils.join(StringUtils.COMMA, hashSet));
            }
            request.y(hashSet);
        }
        e().A();
    }

    public final void t(@NotNull LoginClient.Request request, @NotNull Bundle bundle) {
        LoginClient.Result resultD;
        tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
        tn.p.k(bundle, "result");
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
            resultD = LoginClient.Result.INSTANCE.b(request, companion.a(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId()), companion.c(bundle, request.getNonce()));
        } catch (FacebookException e10) {
            resultD = LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, e().getPendingRequest(), null, e10.getMessage(), null, 8, null);
        }
        e().h(resultD);
    }
}
