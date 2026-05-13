package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import android.graphics.Bitmap;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.util.Utils;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BrokenCreativeAlgorithmParams brokenCreativeAlgorithmParams) {
        super(brokenCreativeAlgorithmParams);
        p.k(brokenCreativeAlgorithmParams, "algorithmParams");
    }

    private final float a(int i10, int i11) {
        float fRedToRatio = Utils.redToRatio(i10) - Utils.redToRatio(i11);
        float fGreenToRatio = Utils.greenToRatio(i10) - Utils.greenToRatio(i11);
        float fBlueToRatio = Utils.blueToRatio(i10) - Utils.blueToRatio(i11);
        return (float) Math.sqrt((fRedToRatio * fRedToRatio) + (fGreenToRatio * fGreenToRatio) + (fBlueToRatio * fBlueToRatio));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Float a(android.graphics.Bitmap r22, float r23) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.rendering.internal.detector.brokencreative.algorithm.e.a(android.graphics.Bitmap, float):java.lang.Float");
    }

    @Override // io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a
    public Boolean a(Bitmap bitmap) {
        Boolean boolValueOf;
        p.k(bitmap, "image");
        Float fA = a(bitmap, a().getThreshold());
        if (fA != null) {
            boolValueOf = Boolean.valueOf(fA.floatValue() <= a().getThreshold());
        } else {
            boolValueOf = null;
        }
        a(fA, boolValueOf);
        return boolValueOf;
    }
}
