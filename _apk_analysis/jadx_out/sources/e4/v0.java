package e4;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;
import f5.a;

/* JADX INFO: compiled from: Timeline.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f60303a = new a();

    /* JADX INFO: compiled from: Timeline.java */
    public class a extends v0 {
        @Override // e4.v0
        public int b(Object obj) {
            return -1;
        }

        @Override // e4.v0
        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // e4.v0
        public int i() {
            return 0;
        }

        @Override // e4.v0
        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // e4.v0
        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // e4.v0
        public int p() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Object f60304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Object f60305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f60307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f60308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public f5.a f60309f = f5.a.f61460f;

        public int a(int i10) {
            return this.f60309f.f61463c[i10].f61466a;
        }

        public long b(int i10, int i11) {
            a.C0760a c0760a = this.f60309f.f61463c[i10];
            if (c0760a.f61466a != -1) {
                return c0760a.f61469d[i11];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f60309f.f61461a;
        }

        public int d(long j10) {
            return this.f60309f.a(j10, this.f60307d);
        }

        public int e(long j10) {
            return this.f60309f.b(j10, this.f60307d);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return a6.k0.c(this.f60304a, bVar.f60304a) && a6.k0.c(this.f60305b, bVar.f60305b) && this.f60306c == bVar.f60306c && this.f60307d == bVar.f60307d && this.f60308e == bVar.f60308e && a6.k0.c(this.f60309f, bVar.f60309f);
        }

        public long f(int i10) {
            return this.f60309f.f61462b[i10];
        }

        public long g() {
            return this.f60309f.f61464d;
        }

        public long h() {
            return k.b(this.f60307d);
        }

        public int hashCode() {
            Object obj = this.f60304a;
            int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f60305b;
            int iHashCode2 = (((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31) + this.f60306c) * 31;
            long j10 = this.f60307d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f60308e;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            f5.a aVar = this.f60309f;
            return i11 + (aVar != null ? aVar.hashCode() : 0);
        }

        public long i() {
            return this.f60307d;
        }

        public int j(int i10) {
            return this.f60309f.f61463c[i10].a();
        }

        public int k(int i10, int i11) {
            return this.f60309f.f61463c[i10].b(i11);
        }

        public long l() {
            return k.b(this.f60308e);
        }

        public long m() {
            return this.f60308e;
        }

        public boolean n(int i10) {
            return !this.f60309f.f61463c[i10].c();
        }

        public boolean o(int i10, int i11) {
            a.C0760a c0760a = this.f60309f.f61463c[i10];
            return (c0760a.f61466a == -1 || c0760a.f61468c[i11] == 0) ? false : true;
        }

        public b p(@Nullable Object obj, @Nullable Object obj2, int i10, long j10, long j11) {
            return q(obj, obj2, i10, j10, j11, f5.a.f61460f);
        }

        public b q(@Nullable Object obj, @Nullable Object obj2, int i10, long j10, long j11, f5.a aVar) {
            this.f60304a = obj;
            this.f60305b = obj2;
            this.f60306c = i10;
            this.f60307d = j10;
            this.f60308e = j11;
            this.f60309f = aVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Object f60310n = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f60311a = f60310n;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Object f60312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Object f60313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f60314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f60315e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f60316f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f60317g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f60318h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f60319i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f60320j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f60321k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f60322l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f60323m;

        public long a() {
            return k.b(this.f60321k);
        }

        public long b() {
            return this.f60321k;
        }

        public long c() {
            return k.b(this.f60322l);
        }

        public long d() {
            return this.f60323m;
        }

        public c e(Object obj, @Nullable Object obj2, @Nullable Object obj3, long j10, long j11, boolean z10, boolean z11, boolean z12, long j12, long j13, int i10, int i11, long j14) {
            this.f60311a = obj;
            this.f60312b = obj2;
            this.f60313c = obj3;
            this.f60314d = j10;
            this.f60315e = j11;
            this.f60316f = z10;
            this.f60317g = z11;
            this.f60318h = z12;
            this.f60321k = j12;
            this.f60322l = j13;
            this.f60319i = i10;
            this.f60320j = i11;
            this.f60323m = j14;
            return this;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return a6.k0.c(this.f60311a, cVar.f60311a) && a6.k0.c(this.f60312b, cVar.f60312b) && a6.k0.c(this.f60313c, cVar.f60313c) && this.f60314d == cVar.f60314d && this.f60315e == cVar.f60315e && this.f60316f == cVar.f60316f && this.f60317g == cVar.f60317g && this.f60318h == cVar.f60318h && this.f60321k == cVar.f60321k && this.f60322l == cVar.f60322l && this.f60319i == cVar.f60319i && this.f60320j == cVar.f60320j && this.f60323m == cVar.f60323m;
        }

        public int hashCode() {
            int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f60311a.hashCode()) * 31;
            Object obj = this.f60312b;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f60313c;
            int iHashCode3 = (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
            long j10 = this.f60314d;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f60315e;
            int i11 = (((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f60316f ? 1 : 0)) * 31) + (this.f60317g ? 1 : 0)) * 31) + (this.f60318h ? 1 : 0)) * 31;
            long j12 = this.f60321k;
            int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f60322l;
            int i13 = (((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f60319i) * 31) + this.f60320j) * 31;
            long j14 = this.f60323m;
            return i13 + ((int) (j14 ^ (j14 >>> 32)));
        }
    }

    public int a(boolean z10) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f60306c;
        if (n(i12, cVar).f60320j != i10) {
            return i10 + 1;
        }
        int iE = e(i12, i11, z10);
        if (iE == -1) {
            return -1;
        }
        return n(iE, cVar).f60319i;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (v0Var.p() != p() || v0Var.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(v0Var.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(v0Var.g(i11, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iP = Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + p();
        for (int i10 = 0; i10 < p(); i10++) {
            iP = (iP * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (iP * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        return i11;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j10) {
        return (Pair) a6.a.e(k(cVar, bVar, i10, j10, 0L));
    }

    @Nullable
    public final Pair<Object, Long> k(c cVar, b bVar, int i10, long j10, long j11) {
        a6.a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.b();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f60319i;
        long jD = cVar.d() + j10;
        long jI = g(i11, bVar, true).i();
        while (jI != -9223372036854775807L && jD >= jI && i11 < cVar.f60320j) {
            jD -= jI;
            i11++;
            jI = g(i11, bVar, true).i();
        }
        return Pair.create(a6.a.e(bVar.f60305b), Long.valueOf(jD));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0L);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        return d(i10, bVar, cVar, i11, z10) == -1;
    }
}
