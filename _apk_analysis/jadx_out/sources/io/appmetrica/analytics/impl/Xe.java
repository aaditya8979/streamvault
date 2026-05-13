package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Xe extends AbstractC5286zd implements Co {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f66160d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f66161e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f66162f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f66163g = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f66174r = "SESSION_";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Ze f66164h = new Ze("PERMISSIONS_CHECK_TIME", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Ze f66165i = new Ze("PROFILE_ID", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Ze f66166j = new Ze("APP_ENVIRONMENT", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Ze f66167k = new Ze("APP_ENVIRONMENT_REVISION", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Ze f66168l = new Ze("LAST_APP_VERSION_WITH_FEATURES", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Ze f66169m = new Ze("APPLICATION_FEATURES", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ze f66170n = new Ze("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Ze f66171o = new Ze("VITAL_DATA", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Ze f66172p = new Ze("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Ze f66173q = new Ze("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Ze f66175s = new Ze("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public Xe(Ia ia2) {
        super(ia2);
    }

    public final Xe a(int i10) {
        return (Xe) b(f66168l.f66302b, i10);
    }

    public final Xe a(long j10) {
        return (Xe) b(f66164h.f66302b, j10);
    }

    public final Xe a(C4847i0 c4847i0) {
        synchronized (this) {
            b(f66166j.f66302b, c4847i0.f66948a);
            b(f66167k.f66302b, c4847i0.f66949b);
        }
        return this;
    }

    public final Xe a(List<String> list) {
        return (Xe) a(f66170n.f66302b, list);
    }

    @Override // io.appmetrica.analytics.impl.Co
    @Nullable
    public final String a() {
        return this.f66262a.getString(f66171o.f66302b, null);
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final void a(@NonNull String str) {
        b(f66171o.f66302b, str);
    }

    public final void a(@NonNull Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f66173q.f66302b, jSONObject.toString());
    }

    public final boolean a(boolean z10) {
        return this.f66262a.getBoolean(f66175s.f66302b, z10);
    }

    public final void b(@NonNull Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f66172p.f66302b, jSONObject.toString());
    }

    public final void b(boolean z10) {
        b(f66175s.f66302b, z10);
    }

    @Override // io.appmetrica.analytics.impl.Ye
    @NonNull
    public final Set<String> c() {
        return this.f66262a.a();
    }

    public final C4847i0 d() {
        C4847i0 c4847i0;
        synchronized (this) {
            c4847i0 = new C4847i0(this.f66262a.getString(f66166j.f66302b, JsonUtils.EMPTY_JSON), this.f66262a.getLong(f66167k.f66302b, 0L));
        }
        return c4847i0;
    }

    public final Xe e(String str, String str2) {
        return (Xe) b(new Ze(f66174r, str).f66302b, str2);
    }

    public final String e() {
        return this.f66262a.getString(f66169m.f66302b, "");
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5286zd
    @NonNull
    public final String f(@NonNull String str) {
        return new Ze(str, null).f66302b;
    }

    public final Map<String, Long> f() {
        HashMap map = new HashMap();
        try {
            String string = this.f66262a.getString(f66173q.f66302b, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, Long.valueOf(jSONObject.getLong(next)));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    @NonNull
    public final List<String> g() {
        String str = f66170n.f66302b;
        List listEmptyList = Collections.emptyList();
        String[] strArr = listEmptyList == null ? null : (String[]) listEmptyList.toArray(new String[listEmptyList.size()]);
        String string = this.f66262a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = jSONArray.optString(i10);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public final int h() {
        return this.f66262a.getInt(f66168l.f66302b, -1);
    }

    public final String h(String str) {
        return this.f66262a.getString(new Ze(f66174r, str).f66302b, "");
    }

    public final long i() {
        return this.f66262a.getLong(f66164h.f66302b, 0L);
    }

    public final Xe i(String str) {
        return (Xe) b(f66169m.f66302b, str);
    }

    public final Xe j(@Nullable String str) {
        return (Xe) b(f66165i.f66302b, str);
    }

    @Nullable
    public final String j() {
        return this.f66262a.getString(f66165i.f66302b, null);
    }

    @NonNull
    public final Map<Integer, String> k() {
        HashMap map = new HashMap();
        try {
            String string = this.f66262a.getString(f66172p.f66302b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }
}
