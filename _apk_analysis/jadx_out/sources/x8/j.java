package x8;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: EAN8Reader.java */
/* JADX INFO: loaded from: classes12.dex */
public final class j extends x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f86841i = new int[4];

    @Override // x8.x
    public int k(o8.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f86841i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int i10 = iArr[1];
        for (int i11 = 0; i11 < 4 && i10 < iL; i11++) {
            sb2.append((char) (x.i(aVar, iArr2, i10, x.f86870g) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        int i13 = x.m(aVar, i10, true, x.f86868e)[1];
        for (int i14 = 0; i14 < 4 && i13 < iL; i14++) {
            sb2.append((char) (x.i(aVar, iArr2, i13, x.f86870g) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    @Override // x8.x
    public BarcodeFormat p() {
        return BarcodeFormat.EAN_8;
    }
}
