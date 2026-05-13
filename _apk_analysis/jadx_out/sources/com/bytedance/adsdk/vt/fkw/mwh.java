package com.bytedance.adsdk.vt.fkw;

import android.graphics.Color;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mwh implements osn<com.bytedance.adsdk.vt.lh.vt.yu> {
    private int ouw;

    public mwh(int i10) {
        this.ouw = i10;
    }

    private static int ouw(float f10, int i10, float[] fArr, float[] fArr2) {
        float fOuw;
        if (fArr2.length < 2 || f10 <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        for (int i11 = 1; i11 < fArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 >= f10 || i11 == fArr.length - 1) {
                if (f11 <= f10) {
                    fOuw = fArr2[i11];
                } else {
                    int i12 = i11 - 1;
                    float f12 = fArr[i12];
                    fOuw = com.bytedance.adsdk.vt.le.ra.ouw(fArr2[i12], fArr2[i11], (f10 - f12) / (f11 - f12));
                }
                return Color.argb((int) (fOuw * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private com.bytedance.adsdk.vt.lh.vt.yu ouw(com.bytedance.adsdk.vt.lh.vt.yu yuVar, List<Float> list) {
        char c10;
        int iArgb;
        int i10 = this.ouw * 4;
        if (list.size() <= i10) {
            return yuVar;
        }
        float[] fArr = yuVar.ouw;
        int[] iArr = yuVar.vt;
        int i11 = 2;
        int size = (list.size() - i10) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        char c11 = 0;
        int i12 = 0;
        while (i10 < list.size()) {
            if (i10 % 2 == 0) {
                fArr2[i12] = list.get(i10).floatValue();
            } else {
                fArr3[i12] = list.get(i10).floatValue();
                i12++;
            }
            i10++;
        }
        float[] fArrCopyOf = yuVar.ouw;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                float f10 = i14 < fArrCopyOf.length ? fArrCopyOf[i14] : Float.NaN;
                float f11 = i15 < size ? fArr2[i15] : Float.NaN;
                if (Float.isNaN(f11) || f10 < f11) {
                    fArr4[i16] = f10;
                    i14++;
                } else if (Float.isNaN(f10) || f11 < f10) {
                    fArr4[i16] = f11;
                    i15++;
                } else {
                    fArr4[i16] = f10;
                    i14++;
                    i15++;
                    i13++;
                }
            }
            fArrCopyOf = i13 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i13);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i17 = 0;
        while (i17 < length2) {
            float f12 = fArrCopyOf[i17];
            int iBinarySearch = Arrays.binarySearch(fArr, f12);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f12);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f13 = fArr3[iBinarySearch2];
                if (iArr.length >= i11 && f12 != fArr[c11]) {
                    for (int i18 = 1; i18 < fArr.length; i18++) {
                        float f14 = fArr[i18];
                        if (f14 >= f12 || i18 == fArr.length - 1) {
                            int i19 = i18 - 1;
                            float f15 = fArr[i19];
                            float f16 = (f12 - f15) / (f14 - f15);
                            int i20 = iArr[i18];
                            int i21 = iArr[i19];
                            iArgb = Color.argb((int) (f13 * 255.0f), com.bytedance.adsdk.vt.le.vt.ouw(f16, Color.red(i21), Color.red(i20)), com.bytedance.adsdk.vt.le.vt.ouw(f16, Color.green(i21), Color.green(i20)), com.bytedance.adsdk.vt.le.vt.ouw(f16, Color.blue(i21), Color.blue(i20)));
                            c10 = 0;
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                c10 = c11;
                iArgb = iArr[c10];
                iArr2[i17] = iArgb;
            } else {
                iArr2[i17] = ouw(f12, iArr[iBinarySearch], fArr2, fArr3);
                c10 = c11;
            }
            i17++;
            c11 = c10;
            i11 = 2;
        }
        return new com.bytedance.adsdk.vt.lh.vt.yu(fArrCopyOf, iArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    @Override // com.bytedance.adsdk.vt.fkw.osn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.bytedance.adsdk.vt.lh.vt.yu ouw(android.util.JsonReader r18, float r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.fkw.mwh.ouw(android.util.JsonReader, float):java.lang.Object");
    }
}
