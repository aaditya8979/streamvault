package y8;

import com.google.zxing.NotFoundException;
import x8.q;

/* JADX INFO: compiled from: AbstractRSSReader.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f87363b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f87366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f87367f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f87362a = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f87364c = new float[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f87365d = new float[4];

    public a() {
        int[] iArr = new int[8];
        this.f87363b = iArr;
        this.f87366e = new int[iArr.length / 2];
        this.f87367f = new int[iArr.length / 2];
    }

    public static void g(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 < f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] - 1;
    }

    public static void n(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 > f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] + 1;
    }

    public static boolean o(int[] iArr) {
        float f10 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f10 >= 0.7916667f && f10 <= 0.89285713f) {
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            for (int i12 : iArr) {
                if (i12 > i11) {
                    i11 = i12;
                }
                if (i12 < i10) {
                    i10 = i12;
                }
            }
            if (i11 < i10 * 10) {
                return true;
            }
        }
        return false;
    }

    public static int p(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            if (q.d(iArr, iArr2[i10], 0.45f) < 0.2f) {
                return i10;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final int[] h() {
        return this.f87363b;
    }

    public final int[] i() {
        return this.f87362a;
    }

    public final int[] j() {
        return this.f87367f;
    }

    public final float[] k() {
        return this.f87365d;
    }

    public final int[] l() {
        return this.f87366e;
    }

    public final float[] m() {
        return this.f87364c;
    }
}
