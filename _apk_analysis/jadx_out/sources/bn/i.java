package bn;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UByte.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements Comparable<i> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f5614c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f5615b;

    /* JADX INFO: compiled from: UByte.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public /* synthetic */ i(byte b10) {
        this.f5615b = b10;
    }

    public static final /* synthetic */ i a(byte b10) {
        return new i(b10);
    }

    public static byte b(byte b10) {
        return b10;
    }

    public static boolean c(byte b10, Object obj) {
        return (obj instanceof i) && b10 == ((i) obj).f();
    }

    public static int d(byte b10) {
        return Byte.hashCode(b10);
    }

    @NotNull
    public static String e(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(i iVar) {
        return tn.p.m(f() & 255, iVar.f() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f5615b, obj);
    }

    public final /* synthetic */ byte f() {
        return this.f5615b;
    }

    public int hashCode() {
        return d(this.f5615b);
    }

    @NotNull
    public String toString() {
        return e(this.f5615b);
    }
}
