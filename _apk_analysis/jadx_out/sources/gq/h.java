package gq;

/* JADX INFO: compiled from: HttpHeaderValues.java */
/* JADX INFO: loaded from: classes2.dex */
public class h extends hq.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f62794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hq.d f62795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final hq.d f62796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final hq.d f62797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final hq.d f62798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final hq.d f62799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final hq.d f62800j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final hq.d f62801k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final hq.d f62802l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final hq.d f62803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final hq.d f62804n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final hq.d f62805o;

    static {
        h hVar = new h();
        f62794d = hVar;
        f62795e = hVar.a("close", 1);
        f62796f = hVar.a("chunked", 2);
        f62797g = hVar.a("gzip", 3);
        f62798h = hVar.a("identity", 4);
        f62799i = hVar.a("keep-alive", 5);
        f62800j = hVar.a("100-continue", 6);
        f62801k = hVar.a("102-processing", 7);
        f62802l = hVar.a("TE", 8);
        f62803m = hVar.a("bytes", 9);
        f62804n = hVar.a("no-cache", 10);
        f62805o = hVar.a("Upgrade", 11);
    }

    public static boolean i(int i10) {
        return i10 == 1 || i10 == 5 || i10 == 10;
    }
}
