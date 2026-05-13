package y8;

/* JADX INFO: compiled from: DataCharacter.java */
/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87369b;

    public b(int i10, int i11) {
        this.f87368a = i10;
        this.f87369b = i11;
    }

    public final int a() {
        return this.f87369b;
    }

    public final int b() {
        return this.f87368a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f87368a == bVar.f87368a && this.f87369b == bVar.f87369b;
    }

    public final int hashCode() {
        return this.f87368a ^ this.f87369b;
    }

    public final String toString() {
        return this.f87368a + "(" + this.f87369b + ')';
    }
}
