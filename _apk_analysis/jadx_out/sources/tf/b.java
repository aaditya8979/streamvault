package tf;

/* JADX INFO: compiled from: ExifInfo.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85258c;

    public b(int i10, int i11, int i12) {
        this.f85256a = i10;
        this.f85257b = i11;
        this.f85258c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f85256a == bVar.f85256a && this.f85257b == bVar.f85257b && this.f85258c == bVar.f85258c;
    }

    public int hashCode() {
        return (((this.f85256a * 31) + this.f85257b) * 31) + this.f85258c;
    }
}
