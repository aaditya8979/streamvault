package r6;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import i6.a0;
import i6.l;
import i6.n;
import i6.z;
import java.io.EOFException;
import java.io.IOException;
import s7.m0;

/* JADX INFO: compiled from: DefaultOggSeeker.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f78664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f78667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f78668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f78669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f78670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f78671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f78672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f78673j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f78674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f78675l;

    /* JADX INFO: compiled from: DefaultOggSeeker.java */
    public final class b implements z {
        public b() {
        }

        @Override // i6.z
        public long getDurationUs() {
            return a.this.f78667d.b(a.this.f78669f);
        }

        @Override // i6.z
        public z.a getSeekPoints(long j10) {
            return new z.a(new a0(j10, m0.q((a.this.f78665b + ((a.this.f78667d.c(j10) * (a.this.f78666c - a.this.f78665b)) / a.this.f78669f)) - 30000, a.this.f78665b, a.this.f78666c - 1)));
        }

        @Override // i6.z
        public boolean isSeekable() {
            return true;
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        s7.a.a(j10 >= 0 && j11 > j10);
        this.f78667d = iVar;
        this.f78665b = j10;
        this.f78666c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f78669f = j13;
            this.f78668e = 4;
        } else {
            this.f78668e = 0;
        }
        this.f78664a = new f();
    }

    @Override // r6.g
    public long a(l lVar) throws IOException {
        int i10 = this.f78668e;
        if (i10 == 0) {
            long position = lVar.getPosition();
            this.f78670g = position;
            this.f78668e = 1;
            long j10 = this.f78666c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jG = g(lVar);
                if (jG != -1) {
                    return jG;
                }
                this.f78668e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            i(lVar);
            this.f78668e = 4;
            return -(this.f78674k + 2);
        }
        this.f78669f = h(lVar);
        this.f78668e = 4;
        return this.f78670g;
    }

    @Override // r6.g
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b createSeekMap() {
        if (this.f78669f != 0) {
            return new b();
        }
        return null;
    }

    public final long g(l lVar) throws IOException {
        if (this.f78672i == this.f78673j) {
            return -1L;
        }
        long position = lVar.getPosition();
        if (!this.f78664a.d(lVar, this.f78673j)) {
            long j10 = this.f78672i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f78664a.a(lVar, false);
        lVar.resetPeekPosition();
        long j11 = this.f78671h;
        f fVar = this.f78664a;
        long j12 = fVar.f78694c;
        long j13 = j11 - j12;
        int i10 = fVar.f78699h + fVar.f78700i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f78673j = position;
            this.f78675l = j12;
        } else {
            this.f78672i = lVar.getPosition() + ((long) i10);
            this.f78674k = this.f78664a.f78694c;
        }
        long j14 = this.f78673j;
        long j15 = this.f78672i;
        if (j14 - j15 < 100000) {
            this.f78673j = j15;
            return j15;
        }
        long position2 = lVar.getPosition() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f78673j;
        long j17 = this.f78672i;
        return m0.q(position2 + ((j13 * (j16 - j17)) / (this.f78675l - this.f78674k)), j17, j16 - 1);
    }

    @VisibleForTesting
    public long h(l lVar) throws IOException {
        this.f78664a.b();
        if (!this.f78664a.c(lVar)) {
            throw new EOFException();
        }
        this.f78664a.a(lVar, false);
        f fVar = this.f78664a;
        lVar.skipFully(fVar.f78699h + fVar.f78700i);
        long j10 = this.f78664a.f78694c;
        while (true) {
            f fVar2 = this.f78664a;
            if ((fVar2.f78693b & 4) == 4 || !fVar2.c(lVar) || lVar.getPosition() >= this.f78666c || !this.f78664a.a(lVar, true)) {
                break;
            }
            f fVar3 = this.f78664a;
            if (!n.e(lVar, fVar3.f78699h + fVar3.f78700i)) {
                break;
            }
            j10 = this.f78664a.f78694c;
        }
        return j10;
    }

    public final void i(l lVar) throws IOException {
        while (true) {
            this.f78664a.c(lVar);
            this.f78664a.a(lVar, false);
            f fVar = this.f78664a;
            if (fVar.f78694c > this.f78671h) {
                lVar.resetPeekPosition();
                return;
            } else {
                lVar.skipFully(fVar.f78699h + fVar.f78700i);
                this.f78672i = lVar.getPosition();
                this.f78674k = this.f78664a.f78694c;
            }
        }
    }

    @Override // r6.g
    public void startSeek(long j10) {
        this.f78671h = m0.q(j10, 0L, this.f78669f - 1);
        this.f78668e = 2;
        this.f78672i = this.f78665b;
        this.f78673j = this.f78666c;
        this.f78674k = 0L;
        this.f78675l = this.f78669f;
    }
}
