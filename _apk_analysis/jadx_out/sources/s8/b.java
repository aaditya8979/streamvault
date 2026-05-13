package s8;

import s8.d;

/* JADX INFO: compiled from: DataBlock.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f79579b;

    public b(int i10, byte[] bArr) {
        this.f79578a = i10;
        this.f79579b = bArr;
    }

    public static b[] b(byte[] bArr, d dVar) {
        d.c cVarD = dVar.d();
        d.b[] bVarArrA = cVarD.a();
        int iA = 0;
        for (d.b bVar : bVarArrA) {
            iA += bVar.a();
        }
        b[] bVarArr = new b[iA];
        int i10 = 0;
        for (d.b bVar2 : bVarArrA) {
            int i11 = 0;
            while (i11 < bVar2.a()) {
                int iB = bVar2.b();
                bVarArr[i10] = new b(iB, new byte[cVarD.b() + iB]);
                i11++;
                i10++;
            }
        }
        int length = bVarArr[0].f79579b.length - cVarD.b();
        int i12 = length - 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = 0;
            while (i15 < i10) {
                bVarArr[i15].f79579b[i14] = bArr[i13];
                i15++;
                i13++;
            }
        }
        boolean z10 = dVar.i() == 24;
        int i16 = z10 ? 8 : i10;
        int i17 = 0;
        while (i17 < i16) {
            bVarArr[i17].f79579b[i12] = bArr[i13];
            i17++;
            i13++;
        }
        int length2 = bVarArr[0].f79579b.length;
        while (length < length2) {
            int i18 = 0;
            while (i18 < i10) {
                int i19 = z10 ? (i18 + 8) % i10 : i18;
                bVarArr[i19].f79579b[(!z10 || i19 <= 7) ? length : length - 1] = bArr[i13];
                i18++;
                i13++;
            }
            length++;
        }
        if (i13 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    public byte[] a() {
        return this.f79579b;
    }

    public int c() {
        return this.f79578a;
    }
}
