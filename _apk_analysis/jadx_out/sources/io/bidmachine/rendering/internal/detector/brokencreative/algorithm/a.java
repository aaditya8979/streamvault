package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import android.graphics.Bitmap;
import android.graphics.Color;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.util.Utils;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BrokenCreativeAlgorithmParams f70410a;

    public a(BrokenCreativeAlgorithmParams brokenCreativeAlgorithmParams) {
        p.k(brokenCreativeAlgorithmParams, "algorithmParams");
        this.f70410a = brokenCreativeAlgorithmParams;
    }

    public final float a(int i10) {
        return (Utils.redToRatio(i10) * 0.299f) + (Utils.greenToRatio(i10) * 0.587f) + (Utils.blueToRatio(i10) * 0.114f);
    }

    public final int a(Bitmap bitmap, int i10, int i11) {
        p.k(bitmap, "<this>");
        return b(bitmap.getPixel(i10, i11));
    }

    public final BrokenCreativeAlgorithmParams a() {
        return this.f70410a;
    }

    public abstract Boolean a(Bitmap bitmap);

    public final void a(Float f10, Boolean bool) {
        if (o.b()) {
            o.b("BrokenCreativeDetector", this.f70410a.getType().name() + " result - " + f10 + " (isBroken - " + bool + ')', new Object[0]);
        }
    }

    public final int b(int i10) {
        return (int) ((Color.red(i10) * 0.299f) + (Color.green(i10) * 0.587f) + (Color.blue(i10) * 0.114f));
    }

    public final Boolean b(Bitmap bitmap) {
        p.k(bitmap, "image");
        try {
            return a(bitmap);
        } catch (Throwable unused) {
            return null;
        }
    }
}
