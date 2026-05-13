package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import android.graphics.Bitmap;
import cn.f0;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import java.util.HashMap;
import tn.p;
import zn.i;
import zn.n;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BrokenCreativeAlgorithmParams brokenCreativeAlgorithmParams) {
        super(brokenCreativeAlgorithmParams);
        p.k(brokenCreativeAlgorithmParams, "algorithmParams");
    }

    private final float a(Bitmap bitmap, float f10) {
        int i10;
        int i11;
        int i12 = 0;
        i iVarV = n.v(0, bitmap.getWidth());
        i iVarV2 = n.v(0, bitmap.getHeight());
        int iJ0 = f0.j0(iVarV) * f0.j0(iVarV2);
        int[] iArr = new int[bitmap.getWidth()];
        int iF = iVarV2.f();
        int iG = iVarV2.g();
        if (iF <= iG) {
            int i13 = 0;
            int i14 = 0;
            int i15 = iF;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i15, bitmap.getWidth(), 1);
                int iF2 = iVarV.f();
                int iG2 = iVarV.g();
                if (iF2 <= iG2) {
                    int i16 = i14;
                    while (true) {
                        int i17 = iArr[iF2];
                        if (i13 == 0) {
                            i16 = i17;
                            i13 = 1;
                        } else {
                            i13 = i17 == i16 ? i13 + 1 : i13 - 1;
                        }
                        if (iF2 == iG2) {
                            break;
                        }
                        iF2++;
                    }
                    i14 = i16;
                }
                if (i15 == iG) {
                    break;
                }
                i15++;
            }
            i10 = i13;
            i11 = i14;
        } else {
            i10 = 0;
            i11 = 0;
        }
        float f11 = iJ0;
        if (i10 < ((2 * f10) - 1) * f11) {
            return 0.0f;
        }
        int iF3 = iVarV2.f();
        int iG3 = iVarV2.g();
        if (iF3 <= iG3) {
            int i18 = iF3;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i18, bitmap.getWidth(), 1);
                int iF4 = iVarV.f();
                int iG4 = iVarV.g();
                if (iF4 <= iG4) {
                    while (true) {
                        if (iArr[iF4] == i11) {
                            i12++;
                        }
                        if (iF4 == iG4) {
                            break;
                        }
                        iF4++;
                    }
                }
                if (i18 == iG3) {
                    break;
                }
                i18++;
            }
        }
        return i12 / f11;
    }

    private final float c(Bitmap bitmap) {
        i iVarV = n.v(0, bitmap.getWidth());
        i iVarV2 = n.v(0, bitmap.getHeight());
        int iJ0 = f0.j0(iVarV) * f0.j0(iVarV2);
        int[] iArr = new int[bitmap.getWidth()];
        HashMap map = new HashMap();
        int iF = iVarV2.f();
        int iG = iVarV2.g();
        if (iF <= iG) {
            int i10 = iF;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i10, bitmap.getWidth(), 1);
                int iF2 = iVarV.f();
                int iG2 = iVarV.g();
                if (iF2 <= iG2) {
                    while (true) {
                        int i11 = iArr[iF2];
                        Integer numValueOf = Integer.valueOf(i11);
                        Integer num = (Integer) map.get(Integer.valueOf(i11));
                        map.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                        if (iF2 == iG2) {
                            break;
                        }
                        iF2++;
                    }
                }
                if (i10 == iG) {
                    break;
                }
                i10++;
            }
        }
        return (((Integer) f0.H0(map.values())) != null ? r0.intValue() : 0) / iJ0;
    }

    @Override // io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a
    public Boolean a(Bitmap bitmap) {
        p.k(bitmap, "image");
        float threshold = a().getThreshold();
        float fA = threshold > 0.5f ? a(bitmap, threshold) : c(bitmap);
        boolean z10 = fA >= threshold;
        a(Float.valueOf(fA), Boolean.valueOf(z10));
        return Boolean.valueOf(z10);
    }
}
