package sg.bigo.ads.controller.a.b;

import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.g;
import sg.bigo.ads.controller.b.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.b f82938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f82939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.bigo.ads.controller.b.d f82940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f82941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.common.n.e f82942f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicInteger f82943g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AtomicBoolean f82944h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f82937a = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f82945i = new Runnable() { // from class: sg.bigo.ads.controller.a.b.c.1
        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            if (cVar.f82938b != null) {
                if (cVar.f82942f == null) {
                    cVar.f82942f = cVar.a();
                }
                sg.bigo.ads.common.n.e eVar = c.this.f82942f;
                if (!(eVar != null && eVar.f82275a.get() == 0)) {
                    c.this.d();
                    return;
                }
                Pair<String, Integer> pairA = c.a(c.this);
                if (pairA == null || TextUtils.isEmpty((CharSequence) pairA.first)) {
                    return;
                }
                c.this.a(pairA);
                c.this.f82938b.f82891a.a(0L);
                if (1 == ((Integer) pairA.second).intValue() % i.f81802a.y()) {
                    c.this.a((String) pairA.first, ((Integer) pairA.second).intValue(), "0");
                }
            }
        }
    };

    public c(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar) {
        this.f82938b = bVar;
        this.f82939c = gVar;
        this.f82940d = dVar;
        this.f82941e = hVar;
    }

    public static /* synthetic */ Pair a(c cVar) {
        sg.bigo.ads.controller.a.b bVar = cVar.f82938b;
        if (bVar == null || bVar.f82891a == null) {
            return null;
        }
        return cVar.b().a(i.f81802a);
    }

    public static boolean a(int i10) {
        return i10 == 702 || i10 == 701 || i10 == 700;
    }

    public abstract sg.bigo.ads.common.n.e a();

    public abstract void a(Pair<String, Integer> pair);

    public final void a(Pair<String, Integer> pair, boolean z10) {
        if (this.f82938b == null || this.f82939c == null || this.f82940d == null || pair == null) {
            return;
        }
        boolean zA = b().a((String) pair.first, this.f82939c.v(), this.f82940d.s(), i.f81802a, z10);
        this.f82938b.f82891a.a(0L);
        if (zA) {
            a((String) pair.first, ((Integer) pair.second).intValue(), "1");
        }
    }

    public final void a(String str, int i10, String str2) {
        String str3 = this instanceof b ? "1" : this instanceof a ? "2" : "0";
        HashMap map = new HashMap();
        map.put("type", str3);
        map.put("host", str);
        map.put("retry_times", String.valueOf(i.f81802a.y()));
        map.put("retry_interval", String.valueOf(i.f81802a.z()));
        map.put("next_retry_interval", String.valueOf(i.f81802a.A()));
        map.put("cur_retry_time", String.valueOf(i10));
        map.put(CommonUrlParts.UUID, this.f82939c.X());
        map.put("action", str2);
        sg.bigo.ads.core.d.b.d(map);
    }

    public abstract sg.bigo.ads.controller.a.a.b b();

    public final void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iRound = Math.round((i.f81802a.z() / 2.0f) * 60000.0f);
        long jAbs = Math.abs(jCurrentTimeMillis - this.f82937a);
        if (this.f82937a == 0 || jAbs > iRound) {
            this.f82937a = jCurrentTimeMillis;
            this.f82943g.set(0);
            d();
        }
    }

    public final void d() {
        if (this.f82943g.getAndAdd(1) >= 3 || this.f82944h.get()) {
            return;
        }
        sg.bigo.ads.common.n.d.a(this.f82945i);
        sg.bigo.ads.common.n.d.a(1, this.f82945i, 5000L);
    }
}
