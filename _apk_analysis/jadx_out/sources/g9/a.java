package g9;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import h9.c;
import h9.e;
import java.util.List;
import java.util.Map;
import k8.h;
import k8.i;
import k8.j;
import o8.d;
import o8.f;

/* JADX INFO: compiled from: QRCodeReader.java */
/* JADX INFO: loaded from: classes12.dex */
public class a implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j[] f62248b = new j[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f62249a = new c();

    public static o8.b b(o8.b bVar) throws NotFoundException {
        int[] iArrI = bVar.i();
        int[] iArrE = bVar.e();
        if (iArrI == null || iArrE == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        float fC = c(iArrI, bVar);
        int i10 = iArrI[1];
        int i11 = iArrE[1];
        int i12 = iArrI[0];
        int i13 = iArrE[0];
        if (i12 >= i13 || i10 >= i11) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i14 = i11 - i10;
        if (i14 != i13 - i12 && (i13 = i12 + i14) >= bVar.j()) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iRound = Math.round(((i13 - i12) + 1) / fC);
        int iRound2 = Math.round((i14 + 1) / fC);
        if (iRound <= 0 || iRound2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (iRound2 != iRound) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i15 = (int) (fC / 2.0f);
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        int i18 = (((int) ((iRound - 1) * fC)) + i17) - i13;
        if (i18 > 0) {
            if (i18 > i15) {
                throw NotFoundException.getNotFoundInstance();
            }
            i17 -= i18;
        }
        int i19 = (((int) ((iRound2 - 1) * fC)) + i16) - i11;
        if (i19 > 0) {
            if (i19 > i15) {
                throw NotFoundException.getNotFoundInstance();
            }
            i16 -= i19;
        }
        o8.b bVar2 = new o8.b(iRound, iRound2);
        for (int i20 = 0; i20 < iRound2; i20++) {
            int i21 = ((int) (i20 * fC)) + i16;
            for (int i22 = 0; i22 < iRound; i22++) {
                if (bVar.d(((int) (i22 * fC)) + i17, i21)) {
                    bVar2.l(i22, i20);
                }
            }
        }
        return bVar2;
    }

    public static float c(int[] iArr, o8.b bVar) throws NotFoundException {
        int iG = bVar.g();
        int iJ = bVar.j();
        int i10 = iArr[0];
        boolean z10 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (i10 < iJ && i11 < iG) {
            if (z10 != bVar.d(i10, i11)) {
                i12++;
                if (i12 == 5) {
                    break;
                }
                z10 = !z10;
            }
            i10++;
            i11++;
        }
        if (i10 == iJ || i11 == iG) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (i10 - iArr[0]) / 7.0f;
    }

    @Override // k8.h
    public final i a(k8.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        j[] jVarArrB;
        d dVarC;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            f fVarE = new i9.c(bVar.a()).e(map);
            d dVarC2 = this.f62249a.c(fVarE.a(), map);
            jVarArrB = fVarE.b();
            dVarC = dVarC2;
        } else {
            dVarC = this.f62249a.c(b(bVar.a()), map);
            jVarArrB = f62248b;
        }
        if (dVarC.d() instanceof e) {
            ((e) dVarC.d()).a(jVarArrB);
        }
        i iVar = new i(dVarC.h(), dVarC.e(), jVarArrB, BarcodeFormat.QR_CODE);
        List<byte[]> listA = dVarC.a();
        if (listA != null) {
            iVar.h(ResultMetadataType.BYTE_SEGMENTS, listA);
        }
        String strB = dVarC.b();
        if (strB != null) {
            iVar.h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strB);
        }
        if (dVarC.i()) {
            iVar.h(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(dVarC.g()));
            iVar.h(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(dVarC.f()));
        }
        return iVar;
    }

    @Override // k8.h
    public void reset() {
    }
}
