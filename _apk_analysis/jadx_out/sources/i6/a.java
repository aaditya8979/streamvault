package i6;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import i6.z;
import java.io.IOException;
import s7.m0;

/* JADX INFO: compiled from: BinarySearchSeeker.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0783a f63814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f63815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public c f63816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63817d;

    /* JADX INFO: renamed from: i6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class C0783a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f63818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f63819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f63820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f63821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f63822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f63823f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f63824g;

        public C0783a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f63818a = dVar;
            this.f63819b = j10;
            this.f63820c = j11;
            this.f63821d = j12;
            this.f63822e = j13;
            this.f63823f = j14;
            this.f63824g = j15;
        }

        public long f(long j10) {
            return this.f63818a.timeUsToTargetTime(j10);
        }

        @Override // i6.z
        public long getDurationUs() {
            return this.f63819b;
        }

        @Override // i6.z
        public z.a getSeekPoints(long j10) {
            return new z.a(new a0(j10, c.h(this.f63818a.timeUsToTargetTime(j10), this.f63820c, this.f63821d, this.f63822e, this.f63823f, this.f63824g)));
        }

        @Override // i6.z
        public boolean isSeekable() {
            return true;
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class b implements d {
        @Override // i6.a.d
        public long timeUsToTargetTime(long j10) {
            return j10;
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f63825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f63826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f63827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f63828d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f63829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f63830f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f63831g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f63832h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f63825a = j10;
            this.f63826b = j11;
            this.f63828d = j12;
            this.f63829e = j13;
            this.f63830f = j14;
            this.f63831g = j15;
            this.f63827c = j16;
            this.f63832h = h(j11, j12, j13, j14, j15, j16);
        }

        public static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return m0.q(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        public final long i() {
            return this.f63831g;
        }

        public final long j() {
            return this.f63830f;
        }

        public final long k() {
            return this.f63832h;
        }

        public final long l() {
            return this.f63825a;
        }

        public final long m() {
            return this.f63826b;
        }

        public final void n() {
            this.f63832h = h(this.f63826b, this.f63828d, this.f63829e, this.f63830f, this.f63831g, this.f63827c);
        }

        public final void o(long j10, long j11) {
            this.f63829e = j10;
            this.f63831g = j11;
            n();
        }

        public final void p(long j10, long j11) {
            this.f63828d = j10;
            this.f63830f = j11;
            n();
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface d {
        long timeUsToTargetTime(long j10);
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f63833d = new e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f63835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f63836c;

        public e(int i10, long j10, long j11) {
            this.f63834a = i10;
            this.f63835b = j10;
            this.f63836c = j11;
        }

        public static e d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e e(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface f {
        e a(l lVar, long j10) throws IOException;

        default void onSeekFinished() {
        }
    }

    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f63815b = fVar;
        this.f63817d = i10;
        this.f63814a = new C0783a(dVar, j10, j11, j12, j13, j14, j15);
    }

    public c a(long j10) {
        return new c(j10, this.f63814a.f(j10), this.f63814a.f63820c, this.f63814a.f63821d, this.f63814a.f63822e, this.f63814a.f63823f, this.f63814a.f63824g);
    }

    public final z b() {
        return this.f63814a;
    }

    public int c(l lVar, y yVar) throws IOException {
        while (true) {
            c cVar = (c) s7.a.i(this.f63816c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f63817d) {
                e(false, j10);
                return g(lVar, j10, yVar);
            }
            if (!i(lVar, jK)) {
                return g(lVar, jK, yVar);
            }
            lVar.resetPeekPosition();
            e eVarA = this.f63815b.a(lVar, cVar.m());
            int i10 = eVarA.f63834a;
            if (i10 == -3) {
                e(false, jK);
                return g(lVar, jK, yVar);
            }
            if (i10 == -2) {
                cVar.p(eVarA.f63835b, eVarA.f63836c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(lVar, eVarA.f63836c);
                    e(true, eVarA.f63836c);
                    return g(lVar, eVarA.f63836c, yVar);
                }
                cVar.o(eVarA.f63835b, eVarA.f63836c);
            }
        }
    }

    public final boolean d() {
        return this.f63816c != null;
    }

    public final void e(boolean z10, long j10) {
        this.f63816c = null;
        this.f63815b.onSeekFinished();
        f(z10, j10);
    }

    public void f(boolean z10, long j10) {
    }

    public final int g(l lVar, long j10, y yVar) {
        if (j10 == lVar.getPosition()) {
            return 0;
        }
        yVar.f63944a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f63816c;
        if (cVar == null || cVar.l() != j10) {
            this.f63816c = a(j10);
        }
    }

    public final boolean i(l lVar, long j10) throws IOException {
        long position = j10 - lVar.getPosition();
        if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        lVar.skipFully((int) position);
        return true;
    }
}
