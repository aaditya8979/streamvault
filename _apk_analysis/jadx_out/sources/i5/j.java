package i5;

import a6.k0;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import java.util.List;

/* JADX INFO: compiled from: SegmentBase.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final h f63793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f63795c;

    /* JADX INFO: compiled from: SegmentBase.java */
    public static abstract class a extends j {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f63796d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f63797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final List<d> f63798f;

        public a(@Nullable h hVar, long j10, long j11, long j12, long j13, @Nullable List<d> list) {
            super(hVar, j10, j11);
            this.f63796d = j12;
            this.f63797e = j13;
            this.f63798f = list;
        }

        public long c() {
            return this.f63796d;
        }

        public abstract int d(long j10);

        public final long e(long j10, long j11) {
            List<d> list = this.f63798f;
            if (list != null) {
                return (list.get((int) (j10 - this.f63796d)).f63804b * 1000000) / this.f63794b;
            }
            int iD = d(j11);
            return (iD == -1 || j10 != (c() + ((long) iD)) - 1) ? (this.f63797e * 1000000) / this.f63794b : j11 - g(j10);
        }

        public long f(long j10, long j11) {
            long jC = c();
            long jD = d(j11);
            if (jD == 0) {
                return jC;
            }
            if (this.f63798f == null) {
                long j12 = this.f63796d + (j10 / ((this.f63797e * 1000000) / this.f63794b));
                return j12 < jC ? jC : jD == -1 ? j12 : Math.min(j12, (jC + jD) - 1);
            }
            long j13 = (jD + jC) - 1;
            long j14 = jC;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                long jG = g(j15);
                if (jG < j10) {
                    j14 = j15 + 1;
                } else {
                    if (jG <= j10) {
                        return j15;
                    }
                    j13 = j15 - 1;
                }
            }
            return j14 == jC ? j14 : j13;
        }

        public final long g(long j10) {
            List<d> list = this.f63798f;
            return k0.y0(list != null ? list.get((int) (j10 - this.f63796d)).f63803a - this.f63795c : (j10 - this.f63796d) * this.f63797e, 1000000L, this.f63794b);
        }

        public abstract h h(i iVar, long j10);

        public boolean i() {
            return this.f63798f != null;
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static class b extends a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final List<h> f63799g;

        public b(h hVar, long j10, long j11, long j12, long j13, @Nullable List<d> list, @Nullable List<h> list2) {
            super(hVar, j10, j11, j12, j13, list);
            this.f63799g = list2;
        }

        @Override // i5.j.a
        public int d(long j10) {
            return this.f63799g.size();
        }

        @Override // i5.j.a
        public h h(i iVar, long j10) {
            return this.f63799g.get((int) (j10 - this.f63796d));
        }

        @Override // i5.j.a
        public boolean i() {
            return true;
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static class c extends a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final l f63800g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final l f63801h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f63802i;

        public c(h hVar, long j10, long j11, long j12, long j13, long j14, @Nullable List<d> list, @Nullable l lVar, @Nullable l lVar2) {
            super(hVar, j10, j11, j12, j14, list);
            this.f63800g = lVar;
            this.f63801h = lVar2;
            this.f63802i = j13;
        }

        @Override // i5.j
        @Nullable
        public h a(i iVar) {
            l lVar = this.f63800g;
            if (lVar == null) {
                return super.a(iVar);
            }
            Format format = iVar.f63782b;
            return new h(lVar.a(format.f19919b, 0L, format.f19923f, 0L), 0L, -1L);
        }

        @Override // i5.j.a
        public int d(long j10) {
            List<d> list = this.f63798f;
            if (list != null) {
                return list.size();
            }
            long j11 = this.f63802i;
            if (j11 != -1) {
                return (int) ((j11 - this.f63796d) + 1);
            }
            if (j10 != -9223372036854775807L) {
                return (int) k0.l(j10, (this.f63797e * 1000000) / this.f63794b);
            }
            return -1;
        }

        @Override // i5.j.a
        public h h(i iVar, long j10) {
            List<d> list = this.f63798f;
            long j11 = list != null ? list.get((int) (j10 - this.f63796d)).f63803a : (j10 - this.f63796d) * this.f63797e;
            l lVar = this.f63801h;
            Format format = iVar.f63782b;
            return new h(lVar.a(format.f19919b, j10, format.f19923f, j11), 0L, -1L);
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f63803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f63804b;

        public d(long j10, long j11) {
            this.f63803a = j10;
            this.f63804b = j11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f63803a == dVar.f63803a && this.f63804b == dVar.f63804b;
        }

        public int hashCode() {
            return (((int) this.f63803a) * 31) + ((int) this.f63804b);
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static class e extends j {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f63805d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f63806e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(@Nullable h hVar, long j10, long j11, long j12, long j13) {
            super(hVar, j10, j11);
            this.f63805d = j12;
            this.f63806e = j13;
        }

        @Nullable
        public h c() {
            long j10 = this.f63806e;
            if (j10 <= 0) {
                return null;
            }
            return new h(null, this.f63805d, j10);
        }
    }

    public j(@Nullable h hVar, long j10, long j11) {
        this.f63793a = hVar;
        this.f63794b = j10;
        this.f63795c = j11;
    }

    @Nullable
    public h a(i iVar) {
        return this.f63793a;
    }

    public long b() {
        return k0.y0(this.f63795c, 1000000L, this.f63794b);
    }
}
