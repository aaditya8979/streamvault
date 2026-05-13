package x8;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: UPCEANExtension5Support.java */
/* JADX INFO: loaded from: classes12.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f86861c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f86862a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f86863b = new StringBuilder();

    public static int c(int i10) throws NotFoundException {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f86861c[i11]) {
                return i11;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i10 = length - 2; i10 >= 0; i10 -= 2) {
            iCharAt += charSequence.charAt(i10) - '0';
        }
        int iCharAt2 = iCharAt * 3;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            iCharAt2 += charSequence.charAt(i11) - '0';
        }
        return (iCharAt2 * 3) % 10;
    }

    public static String e(String str) {
        char cCharAt = str.charAt(0);
        String str2 = "";
        if (cCharAt == '0') {
            str2 = "£";
        } else if (cCharAt == '5') {
            str2 = "$";
        } else if (cCharAt == '9') {
            switch (str) {
                case "90000":
                    return null;
                case "99990":
                    return "Used";
                case "99991":
                    return "0.00";
            }
        }
        int i10 = Integer.parseInt(str.substring(1));
        String strValueOf = String.valueOf(i10 / 100);
        int i11 = i10 % 100;
        return str2 + strValueOf + '.' + (i11 < 10 ? "0".concat(String.valueOf(i11)) : String.valueOf(i11));
    }

    public static Map<ResultMetadataType, Object> f(String str) {
        String strE;
        if (str.length() != 5 || (strE = e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.SUGGESTED_PRICE, strE);
        return enumMap;
    }

    public final int a(o8.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f86862a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int iK = iArr[1];
        int i10 = 0;
        for (int i11 = 0; i11 < 5 && iK < iL; i11++) {
            int i12 = x.i(aVar, iArr2, iK, x.f86871h);
            sb2.append((char) ((i12 % 10) + 48));
            for (int i13 : iArr2) {
                iK += i13;
            }
            if (i12 >= 10) {
                i10 |= 1 << (4 - i11);
            }
            if (i11 != 4) {
                iK = aVar.k(aVar.j(iK));
            }
        }
        if (sb2.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (d(sb2.toString()) == c(i10)) {
            return iK;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public k8.i b(int i10, o8.a aVar, int[] iArr) throws NotFoundException {
        StringBuilder sb2 = this.f86863b;
        sb2.setLength(0);
        int iA = a(aVar, iArr, sb2);
        String string = sb2.toString();
        Map<ResultMetadataType, Object> mapF = f(string);
        float f10 = i10;
        k8.i iVar = new k8.i(string, null, new k8.j[]{new k8.j((iArr[0] + iArr[1]) / 2.0f, f10), new k8.j(iA, f10)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (mapF != null) {
            iVar.g(mapF);
        }
        return iVar;
    }
}
