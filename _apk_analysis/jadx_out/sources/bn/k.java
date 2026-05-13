package bn;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UInt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class k implements Comparable<k> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f5619c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5620b;

    /* JADX INFO: compiled from: UInt.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public /* synthetic */ k(int i10) {
        this.f5620b = i10;
    }

    public static final /* synthetic */ k a(int i10) {
        return new k(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof k) && i10 == ((k) obj).f();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String e(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(k kVar) {
        return s.b(f(), kVar.f());
    }

    public boolean equals(Object obj) {
        return c(this.f5620b, obj);
    }

    public final /* synthetic */ int f() {
        return this.f5620b;
    }

    public int hashCode() {
        return d(this.f5620b);
    }

    @NotNull
    public String toString() {
        return e(this.f5620b);
    }
}
