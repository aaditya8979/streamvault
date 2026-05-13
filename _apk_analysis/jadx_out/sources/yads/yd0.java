package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class yd0 implements rf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f97073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f97074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f97075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f97076d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f97077e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f97079g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f97080h = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f97083k = 0.97f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f97082j = 1.03f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f97084l = 1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f97085m = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f97078f = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f97081i = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f97086n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f97087o = -9223372036854775807L;

    public yd0(long j10, long j11, float f10) {
        this.f97073a = j10;
        this.f97074b = j11;
        this.f97075c = f10;
    }

    public final void a() {
        long j10 = this.f97076d;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f97077e;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f97079g;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f97080h;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f97078f == j10) {
            return;
        }
        this.f97078f = j10;
        this.f97081i = j10;
        this.f97086n = -9223372036854775807L;
        this.f97087o = -9223372036854775807L;
        this.f97085m = -9223372036854775807L;
    }
}
