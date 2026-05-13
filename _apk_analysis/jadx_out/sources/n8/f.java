package n8;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: State.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f75271e = new f(g.f75276b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f75273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75275d;

    public f(g gVar, int i10, int i11, int i12) {
        this.f75273b = gVar;
        this.f75272a = i10;
        this.f75274c = i11;
        this.f75275d = i12;
    }

    public static int b(f fVar) {
        int i10 = fVar.f75274c;
        if (i10 > 62) {
            return 21;
        }
        if (i10 > 31) {
            return 20;
        }
        return i10 > 0 ? 10 : 0;
    }

    public f a(int i10) {
        g gVarA = this.f75273b;
        int i11 = this.f75272a;
        int i12 = this.f75275d;
        if (i11 == 4 || i11 == 2) {
            int i13 = d.f75264c[i11][0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            gVarA = gVarA.a(i14, i15);
            i12 += i15;
            i11 = 0;
        }
        int i16 = this.f75274c;
        f fVar = new f(gVarA, i11, i16 + 1, i12 + ((i16 == 0 || i16 == 31) ? 18 : i16 == 62 ? 9 : 8));
        return fVar.f75274c == 2078 ? fVar.c(i10 + 1) : fVar;
    }

    public f c(int i10) {
        int i11 = this.f75274c;
        return i11 == 0 ? this : new f(this.f75273b.b(i10 - i11, i11), this.f75272a, 0, this.f75275d);
    }

    public int d() {
        return this.f75274c;
    }

    public int e() {
        return this.f75275d;
    }

    public int f() {
        return this.f75272a;
    }

    public boolean g(f fVar) {
        int iB = this.f75275d + (d.f75264c[this.f75272a][fVar.f75272a] >> 16);
        int i10 = this.f75274c;
        int i11 = fVar.f75274c;
        if (i10 < i11) {
            iB += b(fVar) - b(this);
        } else if (i10 > i11 && i11 > 0) {
            iB += 10;
        }
        return iB <= fVar.f75275d;
    }

    public f h(int i10, int i11) {
        int i12 = this.f75275d;
        g gVarA = this.f75273b;
        int i13 = this.f75272a;
        if (i10 != i13) {
            int i14 = d.f75264c[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVarA = gVarA.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new f(gVarA.a(i11, i17), i10, 0, i12 + i17);
    }

    public f i(int i10, int i11) {
        g gVar = this.f75273b;
        int i12 = this.f75272a;
        int i13 = i12 == 2 ? 4 : 5;
        return new f(gVar.a(d.f75266e[i12][i10], i13).a(i11, 5), this.f75272a, 0, this.f75275d + i13 + 5);
    }

    public o8.a j(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (g gVarD = c(bArr.length).f75273b; gVarD != null; gVarD = gVarD.d()) {
            linkedList.addFirst(gVarD);
        }
        o8.a aVar = new o8.a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f75263b[this.f75272a], Integer.valueOf(this.f75275d), Integer.valueOf(this.f75274c));
    }
}
