package co;

import co.a;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f6782a = new j();

    /* JADX INFO: compiled from: TimeSource.kt */
    public static final class a implements co.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6783b;

        public /* synthetic */ a(long j10) {
            this.f6783b = j10;
        }

        public static final /* synthetic */ a b(long j10) {
            return new a(j10);
        }

        public static long d(long j10) {
            return j10;
        }

        public static long e(long j10) {
            return h.f6780a.c(j10);
        }

        public static boolean f(long j10, Object obj) {
            return (obj instanceof a) && j10 == ((a) obj).l();
        }

        public static int g(long j10) {
            return Long.hashCode(j10);
        }

        public static final long i(long j10, long j11) {
            return h.f6780a.b(j10, j11);
        }

        public static long j(long j10, @NotNull co.a aVar) {
            p.k(aVar, "other");
            if (aVar instanceof a) {
                return i(j10, ((a) aVar).l());
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) k(j10)) + " and " + aVar);
        }

        public static String k(long j10) {
            return "ValueTimeMark(reading=" + j10 + ')';
        }

        @Override // co.i
        public long a() {
            return e(this.f6783b);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull co.a aVar) {
            return a.C0131a.a(this, aVar);
        }

        public boolean equals(Object obj) {
            return f(this.f6783b, obj);
        }

        @Override // co.a
        public long h(@NotNull co.a aVar) {
            p.k(aVar, "other");
            return j(this.f6783b, aVar);
        }

        public int hashCode() {
            return g(this.f6783b);
        }

        public final /* synthetic */ long l() {
            return this.f6783b;
        }

        public String toString() {
            return k(this.f6783b);
        }
    }

    @Override // co.k
    public /* bridge */ /* synthetic */ co.a a() {
        return a.b(b());
    }

    public long b() {
        return h.f6780a.d();
    }

    @NotNull
    public String toString() {
        return h.f6780a.toString();
    }
}
