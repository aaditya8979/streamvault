package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f88740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qx f88741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hb f88742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b03 f88743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g9 f88744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v42 f88745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qa3 f88746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f88747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f88748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f88749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public qq1 f88750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f88751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f88752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f88753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f88754o;

    public /* synthetic */ d4(e00 e00Var) {
        this(e00Var, new qx(), new hb(), new b03());
    }

    public d4(e00 e00Var, qx qxVar, hb hbVar, b03 b03Var) {
        this.f88740a = e00Var;
        this.f88741b = qxVar;
        this.f88742c = hbVar;
        this.f88743d = b03Var;
        this.f88752m = true;
        this.f88754o = x11.f96594b;
    }

    public final e00 a() {
        return this.f88740a;
    }

    public final void a(String str) {
        hb hbVar = this.f88742c;
        hbVar.getClass();
        if (str == null || bo.d0.u0(str)) {
            lc1.c("Ad Unit Id can't be null or empty.", new Object[0]);
            return;
        }
        String str2 = hbVar.f90339a;
        if (str2 == null || tn.p.f(str2, str)) {
            hbVar.f90339a = str;
        } else {
            lc1.c("Ad Unit Id can't be set twice.", new Object[0]);
        }
    }

    public final void a(g9 g9Var) {
        this.f88744e = g9Var;
    }

    public final rd b() {
        return this.f88741b.f94198b;
    }

    public final jm0 c() {
        return this.f88741b.f94197a;
    }

    public final a03 d() {
        return this.f88743d.f87866a;
    }

    public final void e() {
        this.f88745f = v42.f95918c;
    }
}
