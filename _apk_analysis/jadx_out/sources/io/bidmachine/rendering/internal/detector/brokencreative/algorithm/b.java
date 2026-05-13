package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmType;
import kotlin.NoWhenBranchMatchedException;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f70411a = new b();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70412a;

        static {
            int[] iArr = new int[BrokenCreativeAlgorithmType.values().length];
            try {
                iArr[BrokenCreativeAlgorithmType.ColorHistogram.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokenCreativeAlgorithmType.BrightnessVariance.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokenCreativeAlgorithmType.EdgeDetection.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f70412a = iArr;
        }
    }

    private b() {
    }

    public final io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a a(BrokenCreativeAlgorithmParams brokenCreativeAlgorithmParams) {
        p.k(brokenCreativeAlgorithmParams, "algorithmParams");
        int i10 = a.f70412a[brokenCreativeAlgorithmParams.getType().ordinal()];
        if (i10 == 1) {
            return new d(brokenCreativeAlgorithmParams);
        }
        if (i10 == 2) {
            return new c(brokenCreativeAlgorithmParams);
        }
        if (i10 == 3) {
            return new e(brokenCreativeAlgorithmParams);
        }
        throw new NoWhenBranchMatchedException();
    }
}
