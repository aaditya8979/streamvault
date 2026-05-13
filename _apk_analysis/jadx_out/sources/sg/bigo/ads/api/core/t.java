package sg.bigo.ads.api.core;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81914d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f81911a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f81912b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f81913c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f81915e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f81916f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f81917g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f81918h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f81919i = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f81921k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f81922l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f81923m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f81924n = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f81920j = false;

    public t(int i10) {
        this.f81914d = i10;
    }

    public final void a(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i10 == 1) {
            if (this.f81921k <= 0) {
                this.f81921k = jCurrentTimeMillis;
            }
        } else if (i10 == 2) {
            if (this.f81922l <= 0) {
                this.f81922l = jCurrentTimeMillis;
            }
        } else {
            if (i10 != 3) {
                return;
            }
            if (this.f81923m <= 0) {
                this.f81923m = jCurrentTimeMillis;
            }
            if (this.f81924n <= 0) {
                this.f81924n = jCurrentTimeMillis;
            }
        }
    }

    public final void a(String str, String str2, boolean z10) {
        this.f81917g = str;
        this.f81919i = str2;
        this.f81918h = z10;
    }

    public final void b(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i10 == 1) {
            if (this.f81912b <= 0) {
                long j10 = this.f81921k;
                if (j10 > 0) {
                    this.f81912b = jCurrentTimeMillis - j10;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 2) {
            this.f81920j = true;
            if (this.f81913c <= 0) {
                long j11 = this.f81922l;
                if (j11 > 0) {
                    this.f81913c = jCurrentTimeMillis - j11;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (this.f81915e <= 0) {
                long j12 = this.f81923m;
                if (j12 > 0) {
                    this.f81915e = jCurrentTimeMillis - j12;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4 && this.f81916f <= 0) {
            long j13 = this.f81924n;
            if (j13 > 0) {
                this.f81916f = jCurrentTimeMillis - j13;
            }
        }
    }
}
