package r8;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.List;
import java.util.Map;
import k8.h;
import k8.i;
import k8.j;
import o8.d;
import o8.f;
import s8.c;

/* JADX INFO: compiled from: DataMatrixReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j[] f78869b = new j[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f78870a = new c();

    public static o8.b b(o8.b bVar) throws NotFoundException {
        int[] iArrI = bVar.i();
        int[] iArrE = bVar.e();
        if (iArrI == null || iArrE == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iC = c(iArrI, bVar);
        int i10 = iArrI[1];
        int i11 = iArrE[1];
        int i12 = iArrI[0];
        int i13 = ((iArrE[0] - i12) + 1) / iC;
        int i14 = ((i11 - i10) + 1) / iC;
        if (i13 <= 0 || i14 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i15 = iC / 2;
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        o8.b bVar2 = new o8.b(i13, i14);
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = (i18 * iC) + i16;
            for (int i20 = 0; i20 < i13; i20++) {
                if (bVar.d((i20 * iC) + i17, i19)) {
                    bVar2.l(i20, i18);
                }
            }
        }
        return bVar2;
    }

    public static int c(int[] iArr, o8.b bVar) throws NotFoundException {
        int iJ = bVar.j();
        int i10 = iArr[0];
        int i11 = iArr[1];
        while (i10 < iJ && bVar.d(i10, i11)) {
            i10++;
        }
        if (i10 == iJ) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i12 = i10 - iArr[0];
        if (i12 != 0) {
            return i12;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // k8.h
    public i a(k8.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        j[] jVarArrB;
        d dVarB;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            f fVarB = new t8.a(bVar.a()).b();
            d dVarB2 = this.f78870a.b(fVarB.a());
            jVarArrB = fVarB.b();
            dVarB = dVarB2;
        } else {
            dVarB = this.f78870a.b(b(bVar.a()));
            jVarArrB = f78869b;
        }
        i iVar = new i(dVarB.h(), dVarB.e(), jVarArrB, BarcodeFormat.DATA_MATRIX);
        List<byte[]> listA = dVarB.a();
        if (listA != null) {
            iVar.h(ResultMetadataType.BYTE_SEGMENTS, listA);
        }
        String strB = dVarB.b();
        if (strB != null) {
            iVar.h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strB);
        }
        return iVar;
    }

    @Override // k8.h
    public void reset() {
    }
}
