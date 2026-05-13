package t7;

import java.util.Arrays;

/* JADX INFO: compiled from: FixedFrameRateEstimator.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f85098d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85100f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f85095a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f85096b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f85099e = -9223372036854775807L;

    /* JADX INFO: compiled from: FixedFrameRateEstimator.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f85101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f85102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f85103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f85104d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f85105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f85106f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean[] f85107g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f85108h;

        public static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f85105e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f85106f / j10;
        }

        public long b() {
            return this.f85106f;
        }

        public boolean d() {
            long j10 = this.f85104d;
            if (j10 == 0) {
                return false;
            }
            return this.f85107g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f85104d > 15 && this.f85108h == 0;
        }

        public void f(long j10) {
            long j11 = this.f85104d;
            if (j11 == 0) {
                this.f85101a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f85101a;
                this.f85102b = j12;
                this.f85106f = j12;
                this.f85105e = 1L;
            } else {
                long j13 = j10 - this.f85103c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f85102b) <= 1000000) {
                    this.f85105e++;
                    this.f85106f += j13;
                    boolean[] zArr = this.f85107g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f85108h--;
                    }
                } else {
                    boolean[] zArr2 = this.f85107g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f85108h++;
                    }
                }
            }
            this.f85104d++;
            this.f85103c = j10;
        }

        public void g() {
            this.f85104d = 0L;
            this.f85105e = 0L;
            this.f85106f = 0L;
            this.f85108h = 0;
            Arrays.fill(this.f85107g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f85095a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f85095a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f85100f;
    }

    public long d() {
        if (e()) {
            return this.f85095a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f85095a.e();
    }

    public void f(long j10) {
        this.f85095a.f(j10);
        if (this.f85095a.e() && !this.f85098d) {
            this.f85097c = false;
        } else if (this.f85099e != -9223372036854775807L) {
            if (!this.f85097c || this.f85096b.d()) {
                this.f85096b.g();
                this.f85096b.f(this.f85099e);
            }
            this.f85097c = true;
            this.f85096b.f(j10);
        }
        if (this.f85097c && this.f85096b.e()) {
            a aVar = this.f85095a;
            this.f85095a = this.f85096b;
            this.f85096b = aVar;
            this.f85097c = false;
            this.f85098d = false;
        }
        this.f85099e = j10;
        this.f85100f = this.f85095a.e() ? 0 : this.f85100f + 1;
    }

    public void g() {
        this.f85095a.g();
        this.f85096b.g();
        this.f85097c = false;
        this.f85099e = -9223372036854775807L;
        this.f85100f = 0;
    }
}
