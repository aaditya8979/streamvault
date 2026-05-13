package com.inmobi.media;

import android.os.Debug;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3462hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CrashConfig f27303a;

    static {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(CrashConfig.class, "clazz");
        f27303a = (CrashConfig) Y3.f26611a.a(CrashConfig.class);
        System.currentTimeMillis();
    }

    public static void a(JSONObject jSONObject, boolean z10, boolean z11, long j10) {
        int i10;
        int i11;
        long j11;
        long j12;
        long[] jArr;
        tn.p.k(jSONObject, "payload");
        if (f27303a.getCrashConfig().getReportOOMInfo() && z10) {
            X4 x42 = z11 ? W4.f26520d : U4.f26410d;
            tn.p.k(x42, "type");
            Ea eaA = S9.a();
            if (eaA != null) {
                String str = x42.f26577c;
                tn.p.k(str, "key");
                eaA.a(x42.f26577c, eaA.f25373a.getInt(str, 0) + 1, true);
            }
            tn.p.k(x42, com.ironsource.Z7.f30790n);
            Ea eaA2 = S9.a();
            if (eaA2 != null) {
                String str2 = x42.f26575a;
                tn.p.k(str2, "key");
                long j13 = eaA2.f25373a.getLong(str2, 0L);
                String str3 = x42.f26576b;
                if (j13 == 0) {
                    eaA2.a(str3, j10, true);
                } else {
                    eaA2.a(str3, j10 - j13, true);
                }
            }
            if (z11) {
                W4 w42 = W4.f26520d;
                tn.p.k(w42, "type");
                Ea eaA3 = S9.a();
                if (eaA3 != null) {
                    String str4 = w42.f26577c;
                    tn.p.k(str4, "key");
                    i10 = eaA3.f25373a.getInt(str4, 0);
                } else {
                    i10 = 0;
                }
                U4 u42 = U4.f26410d;
                tn.p.k(u42, "type");
                Ea eaA4 = S9.a();
                if (eaA4 != null) {
                    String str5 = u42.f26577c;
                    tn.p.k(str5, "key");
                    i11 = eaA4.f25373a.getInt(str5, 0);
                } else {
                    i11 = 0;
                }
                int i12 = i10 + i11;
                float f10 = i12 > 0 ? (i10 * 100.0f) / i12 : 0.0f;
                jSONObject.put("inmobiOOMCount", i10);
                jSONObject.put("appOOMCount", i11);
                tn.p.k(u42, com.ironsource.Z7.f30790n);
                Ea eaA5 = S9.a();
                if (eaA5 != null) {
                    String str6 = u42.f26576b;
                    tn.p.k(str6, "key");
                    j11 = eaA5.f25373a.getLong(str6, 0L);
                } else {
                    j11 = 0;
                }
                jSONObject.put("appOomCrashInterval", j11);
                tn.p.k(w42, com.ironsource.Z7.f30790n);
                Ea eaA6 = S9.a();
                if (eaA6 != null) {
                    String str7 = w42.f26576b;
                    tn.p.k(str7, "key");
                    j12 = eaA6.f25373a.getLong(str7, 0L);
                } else {
                    j12 = 0;
                }
                jSONObject.put("inmOOMCrashInterval", j12);
                jSONObject.put("oomRatioInMobiToApp", Float.valueOf(f10));
                C3850x5.f28483a.getClass();
                if (C3850x5.w()) {
                    long jLongValue = 0;
                    long jLongValue2 = 0;
                    for (Map.Entry<String, String> entry : Debug.getRuntimeStats().entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (tn.p.f(key, "art.gc.blocking-gc-count")) {
                            tn.p.h(value);
                            Long lT = bo.z.t(value);
                            jLongValue = lT != null ? lT.longValue() : 0L;
                        } else if (tn.p.f(key, "art.gc.gc-count")) {
                            tn.p.h(value);
                            Long lT2 = bo.z.t(value);
                            jLongValue2 = lT2 != null ? lT2.longValue() : 0L;
                        }
                    }
                    jArr = new long[]{jLongValue, jLongValue2};
                } else {
                    jArr = null;
                }
                if (jArr != null) {
                    jSONObject.put("blockingGcCount", jArr[0]);
                    jSONObject.put("gcCount", jArr[1]);
                }
            }
        }
    }
}
