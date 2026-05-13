package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.impl.xo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo f67993a;

    public xo(C4655af c4655af, C4702ca c4702ca) {
        this.f67993a = new zo(c4655af, c4702ca, new Ao() { // from class: mh.x0
            @Override // io.appmetrica.analytics.impl.Ao
            public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
                return xo.a(jSONObject, jSONObject2);
            }
        });
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC4832hb.a(jSONObject2, "last_migration_api_level", AbstractC4832hb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.f67993a.a(), "device_id_hash");
    }

    public final synchronized void a(C5015og c5015og) {
        zo zoVar = this.f67993a;
        zoVar.a(zoVar.a().put("referrer", c5015og != null ? new String(Base64.encode(c5015og.a(), 0), bo.c.f5639b) : null));
    }

    public final synchronized void a(String str) {
        zo zoVar = this.f67993a;
        zoVar.a(zoVar.a().put("device_id", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized io.appmetrica.analytics.impl.C5015og b() {
        /*
            r2 = this;
            monitor-enter(r2)
            io.appmetrica.analytics.impl.zo r0 = r2.f67993a     // Catch: java.lang.Throwable -> L29
            org.json.JSONObject r0 = r0.a()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "referrer"
            java.lang.String r0 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r0, r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L26
            java.nio.charset.Charset r1 = bo.c.f5639b     // Catch: java.lang.Throwable -> L26
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L26
            r1 = 0
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L26
            int r1 = r0.length     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L20
            goto L26
        L20:
            io.appmetrica.analytics.impl.og r1 = new io.appmetrica.analytics.impl.og     // Catch: java.lang.Throwable -> L26
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
            r1 = 0
        L27:
            monitor-exit(r2)
            return r1
        L29:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.xo.b():io.appmetrica.analytics.impl.og");
    }

    public final synchronized void b(String str) {
        zo zoVar = this.f67993a;
        zoVar.a(zoVar.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.f67993a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        zo zoVar = this.f67993a;
        zoVar.a(zoVar.a().put("referrer_checked", true));
    }
}
