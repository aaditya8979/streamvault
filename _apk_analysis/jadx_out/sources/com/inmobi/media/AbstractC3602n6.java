package com.inmobi.media;

import com.inmobi.media.AbstractC3602n6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3602n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bn.g f27672a = kotlin.b.b(new sn.a() { // from class: n9.p9
        @Override // sn.a
        public final Object invoke() {
            return AbstractC3602n6.a();
        }
    });

    public static final p000do.l0 a() {
        tn.p.j("n6", "TAG");
        tn.p.k("n6", "name");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("n6", false));
        tn.p.j(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return kotlinx.coroutines.d.a(p000do.l1.c(executorServiceNewSingleThreadExecutor));
    }

    public static void a(C3376e6 c3376e6, String str, int i10, int i11, long j10, Ak ak2, C3552l6 c3552l6, boolean z10) throws InterruptedException {
        long j11;
        tn.p.j("n6", "TAG");
        if (Re.a() != null || !Ji.f25750d.get()) {
            tn.p.j("n6", "TAG");
            c3552l6.getClass();
            tn.p.k(c3376e6, "eventPayload");
            tn.p.j(c3552l6.f27539e, "TAG");
            p000do.h.b(null, new C3453h6(c3376e6, false, c3552l6, null), 1, null);
            c3552l6.a(System.currentTimeMillis());
            if (c3552l6.f27538d != null) {
                ArrayList arrayList = c3376e6.f27092a;
                tn.p.k(arrayList, "eventIds");
                Integer num = AbstractC3313bk.f26877c;
                if (num != null && arrayList.contains(Integer.valueOf(num.intValue()))) {
                    AbstractC3313bk.f26877c = null;
                }
            }
            c3552l6.f27540f.set(false);
            return;
        }
        if (str != null) {
            String str2 = c3376e6.f27093b;
            int i12 = i10 - i11;
            tn.p.k(str, "url");
            tn.p.k(str2, "payload");
            tn.p.k(str, "url");
            tn.p.k(str, "url");
            HashMap mapL = kotlin.collections.a.l(bn.h.a("payload", str2));
            tn.p.k(mapL, "<this>");
            JSONObject jSONObjectB = W6.b();
            if (jSONObjectB != null) {
                String string = jSONObjectB.toString();
                tn.p.j(string, "toString(...)");
                mapL.put("consentObject", string);
            }
            Le le2 = new Le(str, i12 > 0 ? cn.p0.g(bn.h.a("X-im-retry-count", String.valueOf(i12))) : null, null, new Y6(mapL, 0), null, 52);
            if (z10) {
                long jPow = i11 != i10 ? ((long) Math.pow(2.0d, i12)) * j10 : 0L;
                j11 = jPow;
                p000do.i.d((p000do.l0) f27672a.getValue(), null, null, new C3577m6(j11, le2, i11, c3376e6, str, i10, j10, ak2, c3552l6, z10, null), 3, null);
            } else if (i11 != i10) {
                j11 = j10;
                p000do.i.d((p000do.l0) f27672a.getValue(), null, null, new C3577m6(j11, le2, i11, c3376e6, str, i10, j10, ak2, c3552l6, z10, null), 3, null);
            }
            j11 = jPow;
            p000do.i.d((p000do.l0) f27672a.getValue(), null, null, new C3577m6(j11, le2, i11, c3376e6, str, i10, j10, ak2, c3552l6, z10, null), 3, null);
        }
    }
}
