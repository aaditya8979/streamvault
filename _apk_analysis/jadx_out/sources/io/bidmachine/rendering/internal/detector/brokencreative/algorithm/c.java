package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import android.graphics.Bitmap;
import cn.f0;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import tn.p;
import zn.i;
import zn.n;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BrokenCreativeAlgorithmParams brokenCreativeAlgorithmParams) {
        super(brokenCreativeAlgorithmParams);
        p.k(brokenCreativeAlgorithmParams, "algorithmParams");
    }

    private final float c(Bitmap bitmap) {
        float f10;
        float f11;
        i iVarV = n.v(0, bitmap.getWidth());
        i iVarV2 = n.v(0, bitmap.getHeight());
        int iJ0 = f0.j0(iVarV) * f0.j0(iVarV2);
        int[] iArr = new int[bitmap.getWidth()];
        int iF = iVarV2.f();
        int iG = iVarV2.g();
        if (iF <= iG) {
            int i10 = iF;
            f10 = 0.0f;
            f11 = 0.0f;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i10, bitmap.getWidth(), 1);
                int iF2 = iVarV.f();
                int iG2 = iVarV.g();
                if (iF2 <= iG2) {
                    while (true) {
                        float fA = a(iArr[iF2]);
                        f10 += fA;
                        f11 += fA * fA;
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
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        float f12 = iJ0;
        float f13 = f10 / f12;
        float f14 = (f11 / f12) - (f13 * f13);
        if (f14 < 0.0f) {
            return 0.0f;
        }
        return (float) Math.sqrt(f14);
    }

    @Override // io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a
    public Boolean a(Bitmap bitmap) {
        p.k(bitmap, "image");
        float fC = c(bitmap);
        boolean z10 = fC <= a().getThreshold();
        a(Float.valueOf(fC), Boolean.valueOf(z10));
        return Boolean.valueOf(z10);
    }
}
