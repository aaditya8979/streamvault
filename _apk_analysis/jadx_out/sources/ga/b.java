package ga;

import ia.c;

/* JADX INFO: compiled from: DefaultIdGenerator.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements c.d {
    @Override // ia.c.d
    public int a(String str, String str2, boolean z10) {
        return z10 ? ia.f.O(ia.f.o("%sp%s@dir", str, str2)).hashCode() : ia.f.O(ia.f.o("%sp%s", str, str2)).hashCode();
    }

    @Override // ia.c.d
    public int b(int i10, String str, String str2, boolean z10) {
        return a(str, str2, z10);
    }
}
