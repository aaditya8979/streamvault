package k4;

import a6.k0;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;
import k4.s;

/* JADX INFO: compiled from: BinarySearchSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0858a f72844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f72845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public c f72846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f72847d;

    /* JADX INFO: renamed from: k4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class C0858a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f72848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f72849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f72850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f72851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f72852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f72853f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f72854g;

        public C0858a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f72848a = dVar;
            this.f72849b = j10;
            this.f72850c = j11;
            this.f72851d = j12;
            this.f72852e = j13;
            this.f72853f = j14;
            this.f72854g = j15;
        }

        public long f(long j10) {
            return this.f72848a.timeUsToTargetTime(j10);
        }

        @Override // k4.s
        public long getDurationUs() {
            return this.f72849b;
        }

        @Override // k4.s
        public s.a getSeekPoints(long j10) {
            return new s.a(new t(j10, c.h(this.f72848a.timeUsToTargetTime(j10), this.f72850c, this.f72851d, this.f72852e, this.f72853f, this.f72854g)));
        }

        @Override // k4.s
        public boolean isSeekable() {
            return true;
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class b implements d {
        @Override // k4.a.d
        public long timeUsToTargetTime(long j10) {
            return j10;
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f72855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f72856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f72857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f72858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f72859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f72860f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f72861g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f72862h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f72855a = j10;
            this.f72856b = j11;
            this.f72858d = j12;
            this.f72859e = j13;
            this.f72860f = j14;
            this.f72861g = j15;
            this.f72857c = j16;
            this.f72862h = h(j11, j12, j13, j14, j15, j16);
        }

        public static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return k0.r(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        public final long i() {
            return this.f72861g;
        }

        public final long j() {
            return this.f72860f;
        }

        public final long k() {
            return this.f72862h;
        }

        public final long l() {
            return this.f72855a;
        }

        public final long m() {
            return this.f72856b;
        }

        public final void n() {
            this.f72862h = h(this.f72856b, this.f72858d, this.f72859e, this.f72860f, this.f72861g, this.f72857c);
        }

        public final void o(long j10, long j11) {
            this.f72859e = j10;
            this.f72861g = j11;
            n();
        }

        public final void p(long j10, long j11) {
            this.f72858d = j10;
            this.f72860f = j11;
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
        public static final e f72863d = new e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f72864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f72865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f72866c;

        public e(int i10, long j10, long j11) {
            this.f72864a = i10;
            this.f72865b = j10;
            this.f72866c = j11;
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
        e a(h hVar, long j10) throws InterruptedException, IOException;

        default void onSeekFinished() {
        }
    }

    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f72845b = fVar;
        this.f72847d = i10;
        this.f72844a = new C0858a(dVar, j10, j11, j12, j13, j14, j15);
    }

    public c a(long j10) {
        return new c(j10, this.f72844a.f(j10), this.f72844a.f72850c, this.f72844a.f72851d, this.f72844a.f72852e, this.f72844a.f72853f, this.f72844a.f72854g);
    }

    public final s b() {
        return this.f72844a;
    }

    public int c(h hVar, r rVar) throws InterruptedException, IOException {
        f fVar = (f) a6.a.e(this.f72845b);
        while (true) {
            c cVar = (c) a6.a.e(this.f72846c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f72847d) {
                e(false, j10);
                return g(hVar, j10, rVar);
            }
            if (!i(hVar, jK)) {
                return g(hVar, jK, rVar);
            }
            hVar.resetPeekPosition();
            e eVarA = fVar.a(hVar, cVar.m());
            int i10 = eVarA.f72864a;
            if (i10 == -3) {
                e(false, jK);
                return g(hVar, jK, rVar);
            }
            if (i10 == -2) {
                cVar.p(eVarA.f72865b, eVarA.f72866c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    e(true, eVarA.f72866c);
                    i(hVar, eVarA.f72866c);
                    return g(hVar, eVarA.f72866c, rVar);
                }
                cVar.o(eVarA.f72865b, eVarA.f72866c);
            }
        }
    }

    public final boolean d() {
        return this.f72846c != null;
    }

    public final void e(boolean z10, long j10) {
        this.f72846c = null;
        this.f72845b.onSeekFinished();
        f(z10, j10);
    }

    public void f(boolean z10, long j10) {
    }

    public final int g(h hVar, long j10, r rVar) {
        if (j10 == hVar.getPosition()) {
            return 0;
        }
        rVar.f72918a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f72846c;
        if (cVar == null || cVar.l() != j10) {
            this.f72846c = a(j10);
        }
    }

    public final boolean i(h hVar, long j10) throws InterruptedException, IOException {
        long position = j10 - hVar.getPosition();
        if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        hVar.skipFully((int) position);
        return true;
    }
}
