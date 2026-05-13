package x8;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: UPCEANExtension2Support.java */
/* JADX INFO: loaded from: classes12.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f86859a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f86860b = new StringBuilder();

    public static Map<ResultMetadataType, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    public final int a(o8.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f86859a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int iK = iArr[1];
        int i10 = 0;
        for (int i11 = 0; i11 < 2 && iK < iL; i11++) {
            int i12 = x.i(aVar, iArr2, iK, x.f86871h);
            sb2.append((char) ((i12 % 10) + 48));
            for (int i13 : iArr2) {
                iK += i13;
            }
            if (i12 >= 10) {
                i10 |= 1 << (1 - i11);
            }
            if (i11 != 1) {
                iK = aVar.k(aVar.j(iK));
            }
        }
        if (sb2.length() != 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (Integer.parseInt(sb2.toString()) % 4 == i10) {
            return iK;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public k8.i b(int i10, o8.a aVar, int[] iArr) throws NotFoundException {
        StringBuilder sb2 = this.f86860b;
        sb2.setLength(0);
        int iA = a(aVar, iArr, sb2);
        String string = sb2.toString();
        Map<ResultMetadataType, Object> mapC = c(string);
        float f10 = i10;
        k8.i iVar = new k8.i(string, null, new k8.j[]{new k8.j((iArr[0] + iArr[1]) / 2.0f, f10), new k8.j(iA, f10)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (mapC != null) {
            iVar.g(mapC);
        }
        return iVar;
    }
}
