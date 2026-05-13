package sg.bigo.ads.ad.interstitial;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f81487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f81490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f81491e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f81496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f81497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f81498l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f81500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f81501o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f81492f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81493g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f81494h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f81495i = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f81499m = 0;

    public static int a(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 10;
        }
        return 5;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 != 1) {
            return i10 != 3 ? 5 : 10;
        }
        return 3;
    }
}
