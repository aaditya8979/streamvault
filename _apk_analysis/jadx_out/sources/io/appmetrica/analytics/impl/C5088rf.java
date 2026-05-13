package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5088rf implements U7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f67617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final JSONObject f67618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f67620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final T7 f67621e;

    public C5088rf(@Nullable String str, @NonNull JSONObject jSONObject, boolean z10, boolean z11, @NonNull T7 t72) {
        this.f67617a = str;
        this.f67618b = jSONObject;
        this.f67619c = z10;
        this.f67620d = z11;
        this.f67621e = t72;
    }

    @NonNull
    public static C5088rf a(@Nullable JSONObject jSONObject) {
        T7 t72;
        String strOptStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject jSONObjectOptJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i10 = 0;
        boolean zOptBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean zOptBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String strOptStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        T7[] t7ArrValues = T7.values();
        int length = t7ArrValues.length;
        while (true) {
            if (i10 >= length) {
                t72 = null;
                break;
            }
            t72 = t7ArrValues[i10];
            if (tn.p.f(t72.f65930a, strOptStringOrNull2)) {
                break;
            }
            i10++;
        }
        return new C5088rf(strOptStringOrNull, jSONObjectOptJsonObjectOrDefault, zOptBooleanOrDefault, zOptBooleanOrDefault2, t72 == null ? T7.f65925b : t72);
    }

    @Override // io.appmetrica.analytics.impl.U7
    @NonNull
    public final T7 a() {
        return this.f67621e;
    }

    @Nullable
    public final JSONObject b() {
        if (!this.f67619c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f67617a);
            if (this.f67618b.length() <= 0) {
                return jSONObject;
            }
            jSONObject.put("additionalParams", this.f67618b);
            return jSONObject;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    @NonNull
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f67617a);
            jSONObject.put("additionalParams", this.f67618b);
            jSONObject.put("wasSet", this.f67619c);
            jSONObject.put("autoTracking", this.f67620d);
            jSONObject.put("source", this.f67621e.f65930a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f67617a + "', additionalParameters=" + this.f67618b + ", wasSet=" + this.f67619c + ", autoTrackingEnabled=" + this.f67620d + ", source=" + this.f67621e + '}';
    }
}
