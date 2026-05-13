package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import h9.d;
import h9.f;
import o8.b;

/* JADX INFO: compiled from: BitMatrixParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f23683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f23684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23685d;

    public a(b bVar) throws FormatException {
        int iG = bVar.g();
        if (iG < 21 || (iG & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.f23682a = bVar;
    }

    public final int a(int i10, int i11, int i12) {
        return this.f23685d ? this.f23682a.d(i11, i10) : this.f23682a.d(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    public void b() {
        int i10 = 0;
        while (i10 < this.f23682a.j()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f23682a.g(); i12++) {
                if (this.f23682a.d(i10, i12) != this.f23682a.d(i12, i10)) {
                    this.f23682a.c(i12, i10);
                    this.f23682a.c(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    public byte[] c() throws FormatException {
        d dVarD = d();
        f fVarE = e();
        DataMask dataMask = DataMask.values()[dVarD.c()];
        int iG = this.f23682a.g();
        dataMask.unmaskBitMatrix(this.f23682a, iG);
        b bVarA = fVarE.a();
        byte[] bArr = new byte[fVarE.h()];
        int i10 = iG - 1;
        boolean z10 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < iG; i15++) {
                int i16 = z10 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!bVarA.d(i18, i16)) {
                        i13++;
                        i14 <<= 1;
                        if (this.f23682a.d(i18, i16)) {
                            i14 |= 1;
                        }
                        if (i13 == 8) {
                            bArr[i12] = (byte) i14;
                            i12++;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i11 -= 2;
        }
        if (i12 == fVarE.h()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    public d d() throws FormatException {
        d dVar = this.f23684c;
        if (dVar != null) {
            return dVar;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i10 = 0; i10 < 6; i10++) {
            iA2 = a(i10, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i11 = 5; i11 >= 0; i11--) {
            iA3 = a(8, i11, iA3);
        }
        int iG = this.f23682a.g();
        int i12 = iG - 7;
        for (int i13 = iG - 1; i13 >= i12; i13--) {
            iA = a(8, i13, iA);
        }
        for (int i14 = iG - 8; i14 < iG; i14++) {
            iA = a(i14, 8, iA);
        }
        d dVarA = d.a(iA3, iA);
        this.f23684c = dVarA;
        if (dVarA != null) {
            return dVarA;
        }
        throw FormatException.getFormatInstance();
    }

    public f e() throws FormatException {
        f fVar = this.f23683b;
        if (fVar != null) {
            return fVar;
        }
        int iG = this.f23682a.g();
        int i10 = (iG - 17) / 4;
        if (i10 <= 6) {
            return f.i(i10);
        }
        int i11 = iG - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = iG - 9; i13 >= i11; i13--) {
                iA2 = a(i13, i12, iA2);
            }
        }
        f fVarC = f.c(iA2);
        if (fVarC != null && fVarC.e() == iG) {
            this.f23683b = fVarC;
            return fVarC;
        }
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = iG - 9; i15 >= i11; i15--) {
                iA = a(i14, i15, iA);
            }
        }
        f fVarC2 = f.c(iA);
        if (fVarC2 == null || fVarC2.e() != iG) {
            throw FormatException.getFormatInstance();
        }
        this.f23683b = fVarC2;
        return fVarC2;
    }

    public void f() {
        if (this.f23684c == null) {
            return;
        }
        DataMask.values()[this.f23684c.c()].unmaskBitMatrix(this.f23682a, this.f23682a.g());
    }

    public void g(boolean z10) {
        this.f23683b = null;
        this.f23684c = null;
        this.f23685d = z10;
    }
}
