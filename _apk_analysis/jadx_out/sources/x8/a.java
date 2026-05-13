package x8;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: CodaBarReader.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f86818d = "0123456789-$:/.+ABCD".toCharArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f86819e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char[] f86820f = {'A', 'B', 'C', 'D'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f86821a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f86822b = new int[80];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86823c = 0;

    public static boolean g(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // x8.q
    public k8.i b(int i10, o8.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        Arrays.fill(this.f86822b, 0);
        j(aVar);
        int i11 = i();
        this.f86821a.setLength(0);
        int i12 = i11;
        do {
            int iK = k(i12);
            if (iK == -1) {
                throw NotFoundException.getNotFoundInstance();
            }
            this.f86821a.append((char) iK);
            i12 += 8;
            if (this.f86821a.length() > 1 && g(f86820f, f86818d[iK])) {
                break;
            }
        } while (i12 < this.f86823c);
        int i13 = i12 - 1;
        int i14 = this.f86822b[i13];
        int i15 = 0;
        for (int i16 = -8; i16 < -1; i16++) {
            i15 += this.f86822b[i12 + i16];
        }
        if (i12 < this.f86823c && i14 < i15 / 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        l(i11);
        for (int i17 = 0; i17 < this.f86821a.length(); i17++) {
            StringBuilder sb2 = this.f86821a;
            sb2.setCharAt(i17, f86818d[sb2.charAt(i17)]);
        }
        char cCharAt = this.f86821a.charAt(0);
        char[] cArr = f86820f;
        if (!g(cArr, cCharAt)) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb3 = this.f86821a;
        if (!g(cArr, sb3.charAt(sb3.length() - 1))) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (this.f86821a.length() <= 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (map == null || !map.containsKey(DecodeHintType.RETURN_CODABAR_START_END)) {
            StringBuilder sb4 = this.f86821a;
            sb4.deleteCharAt(sb4.length() - 1);
            this.f86821a.deleteCharAt(0);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < i11; i19++) {
            i18 += this.f86822b[i19];
        }
        float f10 = i18;
        while (i11 < i13) {
            i18 += this.f86822b[i11];
            i11++;
        }
        float f11 = i10;
        return new k8.i(this.f86821a.toString(), null, new k8.j[]{new k8.j(f10, f11), new k8.j(i18, f11)}, BarcodeFormat.CODABAR);
    }

    public final void h(int i10) {
        int[] iArr = this.f86822b;
        int i11 = this.f86823c;
        iArr[i11] = i10;
        int i12 = i11 + 1;
        this.f86823c = i12;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[i12 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f86822b = iArr2;
        }
    }

    public final int i() throws NotFoundException {
        for (int i10 = 1; i10 < this.f86823c; i10 += 2) {
            int iK = k(i10);
            if (iK != -1 && g(f86820f, f86818d[iK])) {
                int i11 = 0;
                for (int i12 = i10; i12 < i10 + 7; i12++) {
                    i11 += this.f86822b[i12];
                }
                if (i10 == 1 || this.f86822b[i10 - 1] >= i11 / 2) {
                    return i10;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final void j(o8.a aVar) throws NotFoundException {
        int i10 = 0;
        this.f86823c = 0;
        int iK = aVar.k(0);
        int iL = aVar.l();
        if (iK >= iL) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z10 = true;
        while (iK < iL) {
            if (aVar.g(iK) != z10) {
                i10++;
            } else {
                h(i10);
                z10 = !z10;
                i10 = 1;
            }
            iK++;
        }
        h(i10);
    }

    public final int k(int i10) {
        int i11 = i10 + 7;
        if (i11 >= this.f86823c) {
            return -1;
        }
        int[] iArr = this.f86822b;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = 0;
        for (int i16 = i10; i16 < i11; i16 += 2) {
            int i17 = iArr[i16];
            if (i17 < i14) {
                i14 = i17;
            }
            if (i17 > i15) {
                i15 = i17;
            }
        }
        int i18 = (i14 + i15) / 2;
        int i19 = 0;
        for (int i20 = i10 + 1; i20 < i11; i20 += 2) {
            int i21 = iArr[i20];
            if (i21 < i12) {
                i12 = i21;
            }
            if (i21 > i19) {
                i19 = i21;
            }
        }
        int i22 = (i12 + i19) / 2;
        int i23 = 128;
        int i24 = 0;
        for (int i25 = 0; i25 < 7; i25++) {
            i23 >>= 1;
            if (iArr[i10 + i25] > ((i25 & 1) == 0 ? i18 : i22)) {
                i24 |= i23;
            }
        }
        while (true) {
            int[] iArr2 = f86819e;
            if (i13 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i13] == i24) {
                return i13;
            }
            i13++;
        }
    }

    public final void l(int i10) throws NotFoundException {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f86821a.length() - 1;
        int i11 = 0;
        int i12 = i10;
        int i13 = 0;
        while (true) {
            int i14 = f86819e[this.f86821a.charAt(i13)];
            for (int i15 = 6; i15 >= 0; i15--) {
                int i16 = (i15 & 1) + ((i14 & 1) << 1);
                iArr[i16] = iArr[i16] + this.f86822b[i12 + i15];
                iArr2[i16] = iArr2[i16] + 1;
                i14 >>= 1;
            }
            if (i13 >= length) {
                break;
            }
            i12 += 8;
            i13++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i17 = 0; i17 < 2; i17++) {
            fArr2[i17] = 0.0f;
            int i18 = i17 + 2;
            int i19 = iArr[i18];
            int i20 = iArr2[i18];
            float f10 = ((iArr[i17] / iArr2[i17]) + (i19 / i20)) / 2.0f;
            fArr2[i18] = f10;
            fArr[i17] = f10;
            fArr[i18] = ((i19 * 2.0f) + 1.5f) / i20;
        }
        loop3: while (true) {
            int i21 = f86819e[this.f86821a.charAt(i11)];
            for (int i22 = 6; i22 >= 0; i22--) {
                int i23 = (i22 & 1) + ((i21 & 1) << 1);
                float f11 = this.f86822b[i10 + i22];
                if (f11 < fArr2[i23] || f11 > fArr[i23]) {
                    break loop3;
                }
                i21 >>= 1;
            }
            if (i11 >= length) {
                return;
            }
            i10 += 8;
            i11++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
