package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class We extends AbstractC5286zd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ze f66104d = new Ze("UUID_RESULT", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Ze f66105e = new Ze("DEVICE_ID_RESULT", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Ze f66106f = new Ze("DEVICE_ID_HASH_RESULT", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Ze f66107g = new Ze("AD_URL_GET_RESULT", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Ze f66108h = new Ze("AD_URL_REPORT_RESULT", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Ze f66109i = new Ze("CUSTOM_HOSTS", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Ze f66110j = new Ze("SERVER_TIME_OFFSET", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Ze f66111k = new Ze("RESPONSE_CLIDS_RESULT", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Ze f66112l = new Ze("CUSTOM_SDK_HOSTS", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Ze f66113m = new Ze("CLIENT_CLIDS", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ze f66114n = new Ze("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Ze f66115o = new Ze("API_LEVEL", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Ze f66116p = new Ze("NEXT_STARTUP_TIME", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Ze f66117q = new Ze(IronSourceConstants.TYPE_GAID, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Ze f66118r = new Ze("HOAID", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Ze f66119s = new Ze("YANDEX_ADV_ID", null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Ze f66120t = new Ze("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Ze f66121u = new Ze("SCREEN_INFO", null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Ze f66122v = new Ze("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Ze f66123w = new Ze("FEATURES", null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Ze f66124x = new Ze("APPMETRICA_CLIENT_CONFIG", null);

    public We(Ia ia2) {
        super(ia2);
    }

    public final long a(long j10) {
        return this.f66262a.getLong(f66115o.f66302b, j10);
    }

    @NonNull
    public final We a(@NonNull W9 w92) {
        String str = f66123w.f66302b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", w92.f66095a).put("STATUS", w92.f66096b.getValue()).putOpt("ERROR_EXPLANATION", w92.f66097c);
        } catch (Throwable unused) {
        }
        return (We) b(str, jSONObject.toString());
    }

    @NonNull
    public final We a(@Nullable IdentifiersResult identifiersResult) {
        return a(f66107g.f66302b, identifiersResult);
    }

    public final We a(String str, IdentifiersResult identifiersResult) {
        String string;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ID", identifiersResult.f68099id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
                string = null;
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(str, string);
        }
        return this;
    }

    public final We a(List<String> list) {
        return (We) b(f66109i.f66302b, mo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    public final void a(@NonNull AppMetricaConfig appMetricaConfig) {
        b(f66124x.f66302b, appMetricaConfig.toJson());
    }

    public final void a(@Nullable ScreenInfo screenInfo) {
        b(f66121u.f66302b, AbstractC4832hb.a(screenInfo));
    }

    public final boolean a(boolean z10) {
        return this.f66262a.getBoolean(f66120t.f66302b, z10);
    }

    public final long b(long j10) {
        return this.f66262a.getLong(f66110j.f66301a, j10);
    }

    @NonNull
    public final We b(@Nullable IdentifiersResult identifiersResult) {
        return a(f66108h.f66302b, identifiersResult);
    }

    public final We b(boolean z10) {
        return (We) b(f66120t.f66302b, z10);
    }

    public final We c(long j10) {
        return (We) b(f66115o.f66302b, j10);
    }

    @NonNull
    public final We c(@Nullable IdentifiersResult identifiersResult) {
        return a(f66112l.f66302b, identifiersResult);
    }

    @NonNull
    public final We d(long j10) {
        return (We) b(f66116p.f66302b, j10);
    }

    @NonNull
    public final We d(@Nullable IdentifiersResult identifiersResult) {
        return a(f66106f.f66302b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult d() {
        return h(f66107g.f66302b);
    }

    public final We e(long j10) {
        return (We) b(f66110j.f66302b, j10);
    }

    @NonNull
    public final We e(@Nullable IdentifiersResult identifiersResult) {
        return a(f66105e.f66302b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult e() {
        return h(f66108h.f66302b);
    }

    @Nullable
    public final AppMetricaConfig.Builder f() {
        String string = this.f66262a.getString(f66124x.f66302b, null);
        if (string == null) {
            return null;
        }
        return new H3().a(string);
    }

    @NonNull
    public final We f(@Nullable IdentifiersResult identifiersResult) {
        return a(f66117q.f66302b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5286zd
    @NonNull
    public final String f(@NonNull String str) {
        return new Ze(str, null).f66302b;
    }

    @NonNull
    public final We g(@Nullable IdentifiersResult identifiersResult) {
        return a(f66118r.f66302b, identifiersResult);
    }

    public final List<String> g() {
        String string = this.f66262a.getString(f66109i.f66302b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC4832hb.b(string);
    }

    @NonNull
    public final We h(@Nullable IdentifiersResult identifiersResult) {
        return a(f66111k.f66302b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult h() {
        return h(f66112l.f66302b);
    }

    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        String string;
        try {
            string = this.f66262a.getString(str, null);
        } catch (Throwable unused) {
        }
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
        } else {
            identifiersResult = null;
        }
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
    }

    @NonNull
    public final We i(@Nullable IdentifiersResult identifiersResult) {
        return a(f66104d.f66302b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult i() {
        return h(f66106f.f66302b);
    }

    @Nullable
    public final String i(@Nullable String str) {
        return this.f66262a.getString(f66113m.f66302b, str);
    }

    @NonNull
    public final We j(@Nullable IdentifiersResult identifiersResult) {
        return a(f66119s.f66302b, identifiersResult);
    }

    public final We j(@Nullable String str) {
        return (We) b(f66113m.f66302b, str);
    }

    @NonNull
    public final IdentifiersResult j() {
        return h(f66105e.f66302b);
    }

    @NonNull
    public final W9 k() {
        String string = this.f66262a.getString(f66123w.f66302b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new W9(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new W9(null, IdentifierStatus.UNKNOWN, null);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5286zd
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final We g(@NonNull String str) {
        return (We) d(new Ze(str, null).f66302b);
    }

    @NonNull
    public final IdentifiersResult l() {
        return h(f66117q.f66302b);
    }

    @NonNull
    public final IdentifiersResult m() {
        return h(f66118r.f66302b);
    }

    @NonNull
    public final long n() {
        return this.f66262a.getLong(f66116p.f66302b, 0L);
    }

    @NonNull
    public final IdentifiersResult o() {
        return h(f66111k.f66302b);
    }

    @Nullable
    public final ScreenInfo p() {
        return AbstractC4832hb.e(this.f66262a.getString(f66121u.f66302b, null));
    }

    @NonNull
    public final IdentifiersResult q() {
        return h(f66104d.f66302b);
    }

    @NonNull
    public final IdentifiersResult r() {
        return h(f66119s.f66302b);
    }

    public final boolean s() {
        return this.f66262a.getBoolean(f66114n.f66302b, false);
    }

    public final boolean t() {
        return this.f66262a.getBoolean(f66122v.f66302b, false);
    }

    public final We u() {
        return (We) b(f66114n.f66302b, true);
    }

    public final void v() {
        b(f66122v.f66302b, true);
    }
}
