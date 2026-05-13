package com.inmobi.media;

import android.content.Context;
import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.P9;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class P9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bn.g f26117a = kotlin.b.b(new sn.a() { // from class: n9.v3
        @Override // sn.a
        public final Object invoke() {
            return P9.b();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O9 f26118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3775u5 f26119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final La f26120d;

    static {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f26118b = new O9();
        f26120d = new La(a());
        Context context = Ji.f25747a;
        if (context != null) {
            f26119c = new C3775u5(context, a(), (C3857xc) Ji.f25751e.getValue());
        }
        if (a().getCrashConfig().getReportSessionInfo()) {
            V4 v42 = V4.f26470d;
            tn.p.k(v42, "type");
            Ea eaA = S9.a();
            if (eaA != null) {
                eaA.a(v42.f26575a, jCurrentTimeMillis, true);
            }
            Ea eaA2 = S9.a();
            if (eaA2 != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                eaA2.a("s-cnt", 0, false);
            }
        }
        if (AbstractC3462hf.f27303a.getCrashConfig().getReportOOMInfo()) {
            for (X4 x42 : cn.w.p(W4.f26520d, U4.f26410d)) {
                tn.p.k(x42, "type");
                Ea eaA3 = S9.a();
                if (eaA3 != null) {
                    eaA3.a(x42.f26575a, jCurrentTimeMillis, true);
                }
            }
        }
    }

    public static CrashConfig a() {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(CrashConfig.class, "clazz");
        return (CrashConfig) Y3.f26611a.a(CrashConfig.class);
    }

    public static void a(L2 l22) {
        tn.p.k(l22, "event");
        La la2 = f26120d;
        la2.getClass();
        tn.p.k(l22, "incident");
        if (la2.f25863a.getCatchConfig().getEnabled() && la2.f25865c.f26238b.a()) {
            AbstractC3492il.a(new Ha(la2, l22, null));
        }
    }

    public static void a(JSONObject jSONObject, boolean z10, long j10) throws JSONException {
        tn.p.k(jSONObject, "payload");
        if (a().getCrashConfig().getReportSessionInfo() && z10) {
            V4 v42 = V4.f26470d;
            tn.p.k(v42, com.ironsource.Z7.f30790n);
            Ea eaA = S9.a();
            long j11 = 0;
            if (eaA != null) {
                String str = v42.f26575a;
                tn.p.k(str, "key");
                long j12 = eaA.f25373a.getLong(str, 0L);
                String str2 = v42.f26576b;
                if (j12 == 0) {
                    eaA.a(str2, j10, true);
                } else {
                    eaA.a(str2, j10 - j12, true);
                }
            }
            tn.p.k(v42, com.ironsource.Z7.f30790n);
            Ea eaA2 = S9.a();
            if (eaA2 != null) {
                String str3 = v42.f26576b;
                tn.p.k(str3, "key");
                j11 = eaA2.f25373a.getLong(str3, 0L);
            }
            jSONObject.put("crashFreeSessionLength", j11);
            Ea eaA3 = S9.a();
            int i10 = 0;
            if (eaA3 != null) {
                tn.p.k("s-cnt", "key");
                i10 = eaA3.f25373a.getInt("s-cnt", 0);
            }
            jSONObject.put("crashFreeSessionCount", i10);
        }
    }

    public static final N9 b() {
        return new N9(AbstractC3456h9.b());
    }

    public static void c() {
        Ea eaA;
        if (a().getCrashConfig().getReportSessionInfo() && (eaA = S9.a()) != null) {
            tn.p.k("s-cnt", "key");
            eaA.a("s-cnt", eaA.f25373a.getInt("s-cnt", 0) + 1, false);
        }
        C3775u5 c3775u5 = f26119c;
        if (c3775u5 != null) {
            Iterator it = c3775u5.f28227c.iterator();
            while (it.hasNext()) {
                ((AbstractC3750t5) it.next()).a();
            }
        }
        La la2 = f26120d;
        la2.getClass();
        AbstractC3492il.a(new Ia(la2, null));
        ((C3857xc) Ji.f25751e.getValue()).a(new int[]{2, 1, 152, TextFieldImplKt.AnimationDuration, 151}, la2.f25866d);
        C3476i4 c3476i4 = Y3.f26611a;
        Y3.a("crashReporting", f26118b);
    }
}
