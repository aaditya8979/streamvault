package bn;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UShort.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class p implements Comparable<p> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f5630c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f5631b;

    /* JADX INFO: compiled from: UShort.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public /* synthetic */ p(short s10) {
        this.f5631b = s10;
    }

    public static final /* synthetic */ p a(short s10) {
        return new p(s10);
    }

    public static short b(short s10) {
        return s10;
    }

    public static boolean c(short s10, Object obj) {
        return (obj instanceof p) && s10 == ((p) obj).f();
    }

    public static int d(short s10) {
        return Short.hashCode(s10);
    }

    @NotNull
    public static String e(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(p pVar) {
        return tn.p.m(f() & 65535, pVar.f() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f5631b, obj);
    }

    public final /* synthetic */ short f() {
        return this.f5631b;
    }

    public int hashCode() {
        return d(this.f5631b);
    }

    @NotNull
    public String toString() {
        return e(this.f5631b);
    }
}
