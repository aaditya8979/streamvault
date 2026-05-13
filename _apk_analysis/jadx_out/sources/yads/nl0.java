package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes5.dex */
public final class nl0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f92873h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f92874i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f92875j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f92876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f92877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f92878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gl0 f92879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fl0 f92880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ml0 f92881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f92882g;

    public nl0(int i10, int i11) {
        Paint paint = new Paint();
        this.f92876a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f92877b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f92878c = new Canvas();
        this.f92879d = new gl0(719, 575, 0, 719, 0, 575);
        this.f92880e = new fl0(0, a(), b(), c());
        this.f92881f = new ml0(i10, i11);
    }

    public static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static fl0 a(ib2 ib2Var, int i10) {
        int iA;
        int i11;
        int iA2;
        int iA3;
        int iA4;
        int i12 = 8;
        int iA5 = ib2Var.a(8);
        ib2Var.c(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrA = a();
        int[] iArrB = b();
        int[] iArrC = c();
        while (i14 > 0) {
            int iA6 = ib2Var.a(i12);
            int iA7 = ib2Var.a(i12);
            int[] iArr = (iA7 & 128) != 0 ? iArrA : (iA7 & 64) != 0 ? iArrB : iArrC;
            if ((iA7 & 1) != 0) {
                iA3 = ib2Var.a(i12);
                iA4 = ib2Var.a(i12);
                iA = ib2Var.a(i12);
                iA2 = ib2Var.a(i12);
                i11 = i14 - 6;
            } else {
                int iA8 = ib2Var.a(6) << i13;
                int iA9 = ib2Var.a(4) << 4;
                iA = ib2Var.a(4) << 4;
                i11 = i14 - 4;
                iA2 = ib2Var.a(i13) << 6;
                iA3 = iA8;
                iA4 = iA9;
            }
            if (iA3 == 0) {
                iA2 = 255;
                iA4 = 0;
                iA = 0;
            }
            double d10 = iA3;
            int i15 = iA5;
            double d11 = iA4 - 128;
            int i16 = (int) ((1.402d * d11) + d10);
            double d12 = iA - 128;
            int i17 = (int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d));
            int i18 = (int) ((d12 * 1.772d) + d10);
            int i19 = ib3.f90737a;
            iArr[iA6] = a((byte) (255 - (iA2 & 255)), Math.max(0, Math.min(i16, 255)), Math.max(0, Math.min(i17, 255)), Math.max(0, Math.min(i18, 255)));
            i14 = i11;
            iA5 = i15;
            i12 = 8;
            i13 = 2;
        }
        return new fl0(iA5, iArrA, iArrB, iArrC);
    }

    public static hl0 a(ib2 ib2Var) {
        byte[] bArr;
        int iA = ib2Var.a(16);
        ib2Var.c(4);
        int iA2 = ib2Var.a(2);
        boolean zE = ib2Var.e();
        ib2Var.c(1);
        byte[] bArr2 = ib3.f90742f;
        if (iA2 != 1) {
            if (iA2 == 0) {
                int iA3 = ib2Var.a(16);
                int iA4 = ib2Var.a(16);
                if (iA3 > 0) {
                    bArr2 = new byte[iA3];
                    if (ib2Var.f90735c != 0) {
                        throw new IllegalStateException();
                    }
                    System.arraycopy(ib2Var.f90733a, ib2Var.f90734b, bArr2, 0, iA3);
                    ib2Var.f90734b += iA3;
                    ib2Var.a();
                }
                if (iA4 > 0) {
                    bArr = new byte[iA4];
                    if (ib2Var.f90735c != 0) {
                        throw new IllegalStateException();
                    }
                    System.arraycopy(ib2Var.f90733a, ib2Var.f90734b, bArr, 0, iA4);
                    ib2Var.f90734b += iA4;
                    ib2Var.a();
                }
            }
            return new hl0(iA, zE, bArr2, bArr);
        }
        ib2Var.c(ib2Var.a(8) * 16);
        bArr = bArr2;
        return new hl0(iA, zE, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x026b A[LOOP:3: B:97:0x019b->B:131:0x026b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(byte[] r25, int[] r26, int r27, int r28, int r29, android.graphics.Paint r30, android.graphics.Canvas r31) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.nl0.a(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static int[] a() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = a(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }
}
