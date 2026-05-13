package sg.bigo.ads.controller.landing;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.a.a;
import sg.bigo.ads.api.b.h;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements a.c, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f83446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f83447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83448c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f83451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final sg.bigo.ads.api.core.b f83452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sg.bigo.ads.ad.c<?, ?> f83453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sg.bigo.ads.controller.landing.a f83454i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f83457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f83458m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f83450e = "ChromeTabStatSession";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f83455j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f83456k = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f83449d = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<h.a> f83459n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f83460o = new AtomicBoolean(true);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f83461p = new AtomicBoolean(true);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f83462q = false;

    public static class a implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f83463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f83464b;

        private a(int i10, long j10) {
            this.f83463a = i10;
            this.f83464b = System.currentTimeMillis() - j10;
        }

        public /* synthetic */ a(int i10, long j10, byte b10) {
            this(i10, j10);
        }

        @Override // sg.bigo.ads.api.b.h.a
        public final int a() {
            return this.f83463a;
        }

        @Override // sg.bigo.ads.api.b.h.a
        public final long b() {
            return this.f83464b;
        }
    }

    public b(String str, @Nullable sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.ad.c<?, ?> cVar, @Nullable sg.bigo.ads.controller.landing.a aVar) {
        long jCurrentTimeMillis;
        this.f83451f = str;
        this.f83452g = bVar;
        this.f83453h = cVar;
        this.f83454i = aVar;
        if (cVar != null) {
            this.f83457l = cVar.s();
            jCurrentTimeMillis = cVar.t();
        } else {
            this.f83457l = 0;
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.f83458m = jCurrentTimeMillis;
    }

    private void a(int i10) {
        a aVar = new a(i10, this.f83458m, (byte) 0);
        this.f83459n.add(0, aVar);
        sg.bigo.ads.core.d.b.a(this, aVar, this.f83452g, this.f83453h, (String) null);
    }

    @Override // sg.bigo.ads.a.a.c
    public final void a() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs shown: " + this.f83451f);
        a(1);
    }

    @Override // sg.bigo.ads.a.a.c
    public final void b() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs page started: " + this.f83451f);
        this.f83449d = SystemClock.elapsedRealtime();
        this.f83455j = this.f83455j + 1;
        if (this.f83460o.compareAndSet(true, false)) {
            a(4);
        }
    }

    @Override // sg.bigo.ads.a.a.c
    public final void c() {
        this.f83456k = true;
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs page aborted: " + this.f83451f);
    }

    @Override // sg.bigo.ads.a.a.c
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs page failed: " + this.f83451f);
        if (this.f83462q) {
            return;
        }
        a(6);
    }

    @Override // sg.bigo.ads.a.a.c
    public final void e() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs page finished: " + this.f83451f);
        this.f83462q = true;
        if (this.f83461p.compareAndSet(true, false)) {
            a(5);
        }
    }

    @Override // sg.bigo.ads.a.a.c
    public final void f() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs hidden: " + this.f83451f);
        sg.bigo.ads.core.d.b.a(this, this.f83459n.isEmpty() ? null : this.f83459n.get(0), System.currentTimeMillis() - this.f83458m, this.f83455j, this.f83452g, this.f83453h, (String) null);
    }

    @Override // sg.bigo.ads.api.b.h
    public final int h() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final String i() {
        return this.f83451f;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int j() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int k() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int l() {
        return this.f83462q ? 100 : 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final boolean m() {
        sg.bigo.ads.controller.landing.a aVar = this.f83454i;
        return aVar != null && aVar.f83427d;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int n() {
        return this.f83457l;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int o() {
        return 2;
    }

    @Override // sg.bigo.ads.api.b.h
    @Nullable
    public final Map<String, String> p() {
        if (!this.f83456k && TextUtils.isEmpty(this.f83446a) && TextUtils.isEmpty(this.f83448c) && TextUtils.isEmpty(this.f83447b)) {
            return null;
        }
        HashMap map = new HashMap();
        if (this.f83456k) {
            map.put("tab_aborted", "1");
        }
        if (!TextUtils.isEmpty(this.f83446a)) {
            map.put("chrome_pkg", this.f83446a);
        }
        if (!TextUtils.isEmpty(this.f83448c)) {
            map.put("is_chrome_def", TextUtils.equals(this.f83446a, this.f83448c) ? "1" : "0");
        }
        if (!TextUtils.isEmpty(this.f83447b)) {
            map.put("chrome_ver", this.f83447b);
        }
        return map;
    }
}
