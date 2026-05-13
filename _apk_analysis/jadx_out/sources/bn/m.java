package bn;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ULong.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class m implements Comparable<m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f5624c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5625b;

    /* JADX INFO: compiled from: ULong.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public /* synthetic */ m(long j10) {
        this.f5625b = j10;
    }

    public static final /* synthetic */ m a(long j10) {
        return new m(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof m) && j10 == ((m) obj).f();
    }

    public static int d(long j10) {
        return Long.hashCode(j10);
    }

    @NotNull
    public static String e(long j10) {
        return s.f(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(m mVar) {
        return s.d(f(), mVar.f());
    }

    public boolean equals(Object obj) {
        return c(this.f5625b, obj);
    }

    public final /* synthetic */ long f() {
        return this.f5625b;
    }

    public int hashCode() {
        return d(this.f5625b);
    }

    @NotNull
    public String toString() {
        return e(this.f5625b);
    }
}
