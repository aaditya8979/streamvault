package k2;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: AccessTokenCache.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0007\u000fB\u0017\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dB\t\b\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001f"}, d2 = {"Lk2/a;", "", "Lcom/facebook/AccessToken;", InneractiveMediationDefs.GENDER_FEMALE, "accessToken", "Lbn/r;", "g", "a", "", "e", "h", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lk2/a$b;", "b", "Lk2/a$b;", "tokenCachingStrategyFactory", "Lk2/a0;", "c", "Lk2/a0;", "tokenCachingStrategyField", "d", "()Lk2/a0;", "tokenCachingStrategy", "()Lcom/facebook/AccessToken;", "cachedAccessToken", "legacyAccessToken", "<init>", "(Landroid/content/SharedPreferences;Lk2/a$b;)V", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b tokenCachingStrategyFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public a0 tokenCachingStrategyField;

    /* JADX INFO: compiled from: AccessTokenCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lk2/a$b;", "", "Lk2/a0;", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {
        @NotNull
        public final a0 a() {
            return new a0(t.l(), null, 2, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        SharedPreferences sharedPreferences = t.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        tn.p.j(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this(sharedPreferences, new b());
    }

    public a(@NotNull SharedPreferences sharedPreferences, @NotNull b bVar) {
        tn.p.k(sharedPreferences, "sharedPreferences");
        tn.p.k(bVar, "tokenCachingStrategyFactory");
        this.sharedPreferences = sharedPreferences;
        this.tokenCachingStrategyFactory = bVar;
    }

    public final void a() {
        this.sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public final AccessToken b() {
        String string = this.sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.INSTANCE.b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final AccessToken c() {
        Bundle bundleC = d().c();
        if (bundleC == null || !a0.INSTANCE.g(bundleC)) {
            return null;
        }
        return AccessToken.INSTANCE.c(bundleC);
    }

    public final a0 d() {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            if (this.tokenCachingStrategyField == null) {
                synchronized (this) {
                    if (this.tokenCachingStrategyField == null) {
                        this.tokenCachingStrategyField = this.tokenCachingStrategyFactory.a();
                    }
                    bn.r rVar = bn.r.f5635a;
                }
            }
            a0 a0Var = this.tokenCachingStrategyField;
            if (a0Var != null) {
                return a0Var;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final boolean e() {
        return this.sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    @Nullable
    public final AccessToken f() {
        if (e()) {
            return b();
        }
        if (!h()) {
            return null;
        }
        AccessToken accessTokenC = c();
        if (accessTokenC == null) {
            return accessTokenC;
        }
        g(accessTokenC);
        d().a();
        return accessTokenC;
    }

    public final void g(@NotNull AccessToken accessToken) {
        tn.p.k(accessToken, "accessToken");
        try {
            this.sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.p().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public final boolean h() {
        return t.G();
    }
}
