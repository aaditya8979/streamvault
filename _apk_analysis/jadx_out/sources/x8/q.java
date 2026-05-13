package x8;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: OneDReader.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class q implements k8.h {
    public static float d(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f15 = iArr2[i13] * f12;
            float f16 = iArr[i13];
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    public static void e(o8.a aVar, int i10, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int iL = aVar.l();
        if (i10 >= iL) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z10 = !aVar.g(i10);
        while (i10 < iL) {
            if (aVar.g(i10) == z10) {
                i11++;
                if (i11 == length) {
                    break;
                }
                iArr[i11] = 1;
                z10 = !z10;
            } else {
                iArr[i11] = iArr[i11] + 1;
            }
            i10++;
        }
        if (i11 != length) {
            if (i11 != length - 1 || i10 != iL) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public static void f(o8.a aVar, int i10, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean zG = aVar.g(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (aVar.g(i10) != zG) {
                length--;
                zG = !zG;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        e(aVar, i10 + 1, iArr);
    }

    @Override // k8.h
    public k8.i a(k8.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        try {
            return c(bVar, map);
        } catch (NotFoundException e10) {
            if (!(map != null && map.containsKey(DecodeHintType.TRY_HARDER)) || !bVar.e()) {
                throw e10;
            }
            k8.b bVarF = bVar.f();
            k8.i iVarC = c(bVarF, map);
            Map<ResultMetadataType, Object> mapD = iVarC.d();
            int iIntValue = 270;
            if (mapD != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (mapD.containsKey(resultMetadataType)) {
                    iIntValue = (((Integer) mapD.get(resultMetadataType)).intValue() + 270) % 360;
                }
            }
            iVarC.h(ResultMetadataType.ORIENTATION, Integer.valueOf(iIntValue));
            k8.j[] jVarArrE = iVarC.e();
            if (jVarArrE != null) {
                int iC = bVarF.c();
                for (int i10 = 0; i10 < jVarArrE.length; i10++) {
                    jVarArrE[i10] = new k8.j((iC - jVarArrE[i10].d()) - 1.0f, jVarArrE[i10].c());
                }
            }
            return iVarC;
        }
    }

    public abstract k8.i b(int i10, o8.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k8.i c(k8.b r22, java.util.Map<com.google.zxing.DecodeHintType, ?> r23) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.q.c(k8.b, java.util.Map):k8.i");
    }

    @Override // k8.h
    public void reset() {
    }
}
