package x8;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: UPCEANReader.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class x extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f86867d = {1, 1, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f86868e = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f86869f = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[][] f86870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[][] f86871h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f86872a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f86873b = new w();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f86874c = new l();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f86870g = iArr;
        int[][] iArr2 = new int[20][];
        f86871h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f86870g[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f86871h[i10] = iArr4;
        }
    }

    public static boolean h(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return q(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    public static int i(o8.a aVar, int[] iArr, int i10, int[][] iArr2) throws NotFoundException {
        q.e(aVar, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float fD = q.d(iArr, iArr2[i12], 0.7f);
            if (fD < f10) {
                i11 = i12;
                f10 = fD;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] m(o8.a aVar, int i10, boolean z10, int[] iArr) throws NotFoundException {
        return n(aVar, i10, z10, iArr, new int[iArr.length]);
    }

    public static int[] n(o8.a aVar, int i10, boolean z10, int[] iArr, int[] iArr2) throws NotFoundException {
        int iL = aVar.l();
        int iK = z10 ? aVar.k(i10) : aVar.j(i10);
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = iK;
        while (iK < iL) {
            if (aVar.g(iK) != z11) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (q.d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i12, iK};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z11 = !z11;
            }
            iK++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] o(o8.a aVar) throws NotFoundException {
        int[] iArr = new int[f86867d.length];
        int[] iArrN = null;
        boolean zN = false;
        int i10 = 0;
        while (!zN) {
            int[] iArr2 = f86867d;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrN = n(aVar, i10, false, iArr2, iArr);
            int i11 = iArrN[0];
            int i12 = iArrN[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                zN = aVar.n(i13, i11, false);
            }
            i10 = i12;
        }
        return iArrN;
    }

    public static int q(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int iCharAt = charSequence.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i10 += iCharAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int iCharAt2 = charSequence.charAt(i13) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i12 += iCharAt2;
        }
        return (1000 - i12) % 10;
    }

    @Override // x8.q
    public k8.i b(int i10, o8.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return l(i10, aVar, o(aVar), map);
    }

    public boolean g(String str) throws FormatException {
        return h(str);
    }

    public int[] j(o8.a aVar, int i10) throws NotFoundException {
        return m(aVar, i10, false, f86867d);
    }

    public abstract int k(o8.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException;

    public k8.i l(int i10, o8.a aVar, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int length;
        String strC;
        k8.k kVar = map == null ? null : (k8.k) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        boolean z10 = true;
        if (kVar != null) {
            kVar.a(new k8.j((iArr[0] + iArr[1]) / 2.0f, i10));
        }
        StringBuilder sb2 = this.f86872a;
        sb2.setLength(0);
        int iK = k(aVar, iArr, sb2);
        if (kVar != null) {
            kVar.a(new k8.j(iK, i10));
        }
        int[] iArrJ = j(aVar, iK);
        if (kVar != null) {
            kVar.a(new k8.j((iArrJ[0] + iArrJ[1]) / 2.0f, i10));
        }
        int i11 = iArrJ[1];
        int i12 = (i11 - iArrJ[0]) + i11;
        if (i12 >= aVar.l() || !aVar.n(i11, i12, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String string = sb2.toString();
        if (string.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if (!g(string)) {
            throw ChecksumException.getChecksumInstance();
        }
        BarcodeFormat barcodeFormatP = p();
        float f10 = i10;
        k8.i iVar = new k8.i(string, null, new k8.j[]{new k8.j((iArr[1] + iArr[0]) / 2.0f, f10), new k8.j((iArrJ[1] + iArrJ[0]) / 2.0f, f10)}, barcodeFormatP);
        try {
            k8.i iVarA = this.f86873b.a(i10, aVar, iArrJ[1]);
            iVar.h(ResultMetadataType.UPC_EAN_EXTENSION, iVarA.f());
            iVar.g(iVarA.d());
            iVar.a(iVarA.e());
            length = iVarA.f().length();
        } catch (ReaderException unused) {
            length = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length2 = iArr2.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    z10 = false;
                    break;
                }
                if (length == iArr2[i13]) {
                    break;
                }
                i13++;
            }
            if (!z10) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if ((barcodeFormatP == BarcodeFormat.EAN_13 || barcodeFormatP == BarcodeFormat.UPC_A) && (strC = this.f86874c.c(string)) != null) {
            iVar.h(ResultMetadataType.POSSIBLE_COUNTRY, strC);
        }
        return iVar;
    }

    public abstract BarcodeFormat p();
}
