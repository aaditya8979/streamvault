package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4933l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xe f67195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yo f67196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sk f67197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M6 f67198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I8 f67199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Kk f67200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4872j0 f67201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4645a5 f67202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TimeProvider f67203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f67204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f67205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f67206l;

    public C4933l9(Xe xe2, yo yoVar, Sk sk2, M6 m62, C4872j0 c4872j0, I8 i82, Kk kk2, int i10, C4645a5 c4645a5, SystemTimeProvider systemTimeProvider) {
        this.f67195a = xe2;
        this.f67196b = yoVar;
        this.f67197c = sk2;
        this.f67198d = m62;
        this.f67201g = c4872j0;
        this.f67199e = i82;
        this.f67200f = kk2;
        this.f67204j = i10;
        this.f67203i = systemTimeProvider;
        this.f67202h = c4645a5;
        this.f67205k = xe2.i();
        this.f67206l = xe2.h();
    }

    public final void a(Q5 q52, Uk uk2) {
        Map map = q52.f65803p;
        Kk kk2 = this.f67200f;
        kk2.getClass();
        map.putAll(new HashMap(kk2.f65497b));
        q52.c(this.f67195a.j());
        q52.f65802o = Integer.valueOf(this.f67196b.b());
        C4847i0 c4847i0A = this.f67201g.a();
        I8 i82 = this.f67199e;
        i82.getClass();
        H8 h82 = (H8) i82.f65356b.a(EnumC4703cb.a(q52.f65791d));
        M6 m62 = this.f67198d;
        A8 a8A = h82.a(q52);
        int i10 = q52.f65791d;
        yo yoVar = this.f67196b;
        C4854i7 c4854i7 = new C4854i7(m62.f65570g, uk2, i10, yoVar, a8A, (C4941lh) m62.f65571h.f66224k.a(), c4847i0A);
        Long lValueOf = Long.valueOf(uk2.f66011a);
        Wk wk2 = uk2.f66014d;
        Long lValueOf2 = Long.valueOf(uk2.f66012b);
        EnumC4703cb enumC4703cbA = EnumC4703cb.a(c4854i7.f66967h.f65791d);
        long jOptLong = 0;
        if (!AbstractC5232x9.f67939g.contains(EnumC4703cb.a(i10))) {
            synchronized (yoVar) {
                JSONObject jSONObjectA = yoVar.f68052a.a();
                jOptLong = jSONObjectA.optLong("global_number", 0L);
                yoVar.f68052a.a(jSONObjectA.put("global_number", 1 + jOptLong));
            }
        }
        m62.a(m62.f65575l.fromModel(new C4776f7(lValueOf, wk2, lValueOf2, enumC4703cbA, Long.valueOf(jOptLong), Long.valueOf(uk2.f66013c), c4854i7.a())));
        this.f67202h.f66335a.h();
    }
}
