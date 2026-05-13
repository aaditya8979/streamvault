package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class jv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f91379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f91380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f91381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f91382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f91383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f91384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f91385g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f91386h;

    public final void a(long j10) {
        long j11 = this.f91382d;
        if (j11 == 0) {
            this.f91379a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f91379a;
            this.f91380b = j12;
            this.f91384f = j12;
            this.f91383e = 1L;
        } else {
            long j13 = j10 - this.f91381c;
            int i10 = (int) (j11 % 15);
            if (Math.abs(j13 - this.f91380b) <= 1000000) {
                this.f91383e++;
                this.f91384f += j13;
                boolean[] zArr = this.f91385g;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f91386h--;
                }
            } else {
                boolean[] zArr2 = this.f91385g;
                if (!zArr2[i10]) {
                    zArr2[i10] = true;
                    this.f91386h++;
                }
            }
        }
        this.f91382d++;
        this.f91381c = j10;
    }

    public final boolean a() {
        return this.f91382d > 15 && this.f91386h == 0;
    }
}
