package r4;

import a6.k0;
import androidx.annotation.VisibleForTesting;
import java.io.EOFException;
import java.io.IOException;
import k4.s;
import k4.t;

/* JADX INFO: compiled from: DefaultOggSeeker.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f78575a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f78578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f78579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f78580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f78581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f78582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f78583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f78584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f78585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f78586l;

    /* JADX INFO: compiled from: DefaultOggSeeker.java */
    public final class b implements s {
        public b() {
        }

        @Override // k4.s
        public long getDurationUs() {
            return a.this.f78578d.a(a.this.f78580f);
        }

        @Override // k4.s
        public s.a getSeekPoints(long j10) {
            return new s.a(new t(j10, k0.r((a.this.f78576b + ((a.this.f78578d.b(j10) * (a.this.f78577c - a.this.f78576b)) / a.this.f78580f)) - 30000, a.this.f78576b, a.this.f78577c - 1)));
        }

        @Override // k4.s
        public boolean isSeekable() {
            return true;
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        a6.a.a(j10 >= 0 && j11 > j10);
        this.f78578d = iVar;
        this.f78576b = j10;
        this.f78577c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f78579e = 0;
        } else {
            this.f78580f = j13;
            this.f78579e = 4;
        }
    }

    @Override // r4.g
    public long a(k4.h hVar) throws InterruptedException, IOException {
        int i10 = this.f78579e;
        if (i10 == 0) {
            long position = hVar.getPosition();
            this.f78581g = position;
            this.f78579e = 1;
            long j10 = this.f78577c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jG = g(hVar);
                if (jG != -1) {
                    return jG;
                }
                this.f78579e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(hVar);
            this.f78579e = 4;
            return -(this.f78585k + 2);
        }
        this.f78580f = h(hVar);
        this.f78579e = 4;
        return this.f78581g;
    }

    @Override // r4.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b createSeekMap() {
        if (this.f78580f != 0) {
            return new b();
        }
        return null;
    }

    public final long g(k4.h hVar) throws InterruptedException, IOException {
        if (this.f78583i == this.f78584j) {
            return -1L;
        }
        long position = hVar.getPosition();
        if (!j(hVar, this.f78584j)) {
            long j10 = this.f78583i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f78575a.a(hVar, false);
        hVar.resetPeekPosition();
        long j11 = this.f78582h;
        f fVar = this.f78575a;
        long j12 = fVar.f78604c;
        long j13 = j11 - j12;
        int i10 = fVar.f78609h + fVar.f78610i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f78584j = position;
            this.f78586l = j12;
        } else {
            this.f78583i = hVar.getPosition() + ((long) i10);
            this.f78585k = this.f78575a.f78604c;
        }
        long j14 = this.f78584j;
        long j15 = this.f78583i;
        if (j14 - j15 < 100000) {
            this.f78584j = j15;
            return j15;
        }
        long position2 = hVar.getPosition() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f78584j;
        long j17 = this.f78583i;
        return k0.r(position2 + ((j13 * (j16 - j17)) / (this.f78586l - this.f78585k)), j17, j16 - 1);
    }

    @VisibleForTesting
    public long h(k4.h hVar) throws InterruptedException, IOException {
        i(hVar);
        this.f78575a.b();
        while ((this.f78575a.f78603b & 4) != 4 && hVar.getPosition() < this.f78577c) {
            this.f78575a.a(hVar, false);
            f fVar = this.f78575a;
            hVar.skipFully(fVar.f78609h + fVar.f78610i);
        }
        return this.f78575a.f78604c;
    }

    @VisibleForTesting
    public void i(k4.h hVar) throws InterruptedException, IOException {
        if (!j(hVar, this.f78577c)) {
            throw new EOFException();
        }
    }

    public final boolean j(k4.h hVar, long j10) throws InterruptedException, IOException {
        int i10;
        long jMin = Math.min(j10 + 3, this.f78577c);
        int position = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i11 = 0;
            if (hVar.getPosition() + ((long) position) > jMin && (position = (int) (jMin - hVar.getPosition())) < 4) {
                return false;
            }
            hVar.peekFully(bArr, 0, position, false);
            while (true) {
                i10 = position - 3;
                if (i11 < i10) {
                    if (bArr[i11] == 79 && bArr[i11 + 1] == 103 && bArr[i11 + 2] == 103 && bArr[i11 + 3] == 83) {
                        hVar.skipFully(i11);
                        return true;
                    }
                    i11++;
                }
            }
            hVar.skipFully(i10);
        }
    }

    public final void k(k4.h hVar) throws InterruptedException, IOException {
        this.f78575a.a(hVar, false);
        while (true) {
            f fVar = this.f78575a;
            if (fVar.f78604c > this.f78582h) {
                hVar.resetPeekPosition();
                return;
            }
            hVar.skipFully(fVar.f78609h + fVar.f78610i);
            this.f78583i = hVar.getPosition();
            f fVar2 = this.f78575a;
            this.f78585k = fVar2.f78604c;
            fVar2.a(hVar, false);
        }
    }

    @Override // r4.g
    public void startSeek(long j10) {
        this.f78582h = k0.r(j10, 0L, this.f78580f - 1);
        this.f78579e = 2;
        this.f78583i = this.f78576b;
        this.f78584j = this.f78577c;
        this.f78585k = 0L;
        this.f78586l = this.f78580f;
    }
}
