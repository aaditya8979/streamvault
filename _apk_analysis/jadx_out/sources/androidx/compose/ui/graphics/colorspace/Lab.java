package androidx.compose.ui.graphics.colorspace;

import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: Lab.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXyz", VastTagName.COMPANION, "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Lab extends ColorSpace {
    private static final float A = 0.008856452f;
    private static final float B = 7.787037f;
    private static final float C = 0.13793103f;
    private static final float D = 0.20689656f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lab(@NotNull String str, int i10) {
        super(str, ColorModel.INSTANCE.m1983getLabxdoWZVw(), i10, null);
        p.k(str, "name");
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v10) {
        p.k(v10, "v");
        float f10 = v10[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f11 = f10 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f12 = v10[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f13 = v10[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fPow = f11 > A ? (float) Math.pow(f11, 0.33333334f) : (f11 * B) + C;
        float fPow2 = f12 > A ? (float) Math.pow(f12, 0.33333334f) : (f12 * B) + C;
        float fPow3 = f13 > A ? (float) Math.pow(f13, 0.33333334f) : (f13 * B) + C;
        v10[0] = n.m((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        v10[1] = n.m((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        v10[2] = n.m((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return v10;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v10) {
        p.k(v10, "v");
        v10[0] = n.m(v10[0], 0.0f, 100.0f);
        v10[1] = n.m(v10[1], -128.0f, 128.0f);
        float fM = n.m(v10[2], -128.0f, 128.0f);
        v10[2] = fM;
        float f10 = (v10[0] + 16.0f) / 116.0f;
        float f11 = (v10[1] * 0.002f) + f10;
        float f12 = f10 - (fM * 0.005f);
        float f13 = f11 > D ? f11 * f11 * f11 : (f11 - C) * 0.12841855f;
        float f14 = f10 > D ? f10 * f10 * f10 : (f10 - C) * 0.12841855f;
        float f15 = f12 > D ? f12 * f12 * f12 : (f12 - C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        v10[0] = f13 * illuminant.getD50Xyz$ui_graphics_release()[0];
        v10[1] = f14 * illuminant.getD50Xyz$ui_graphics_release()[1];
        v10[2] = f15 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return v10;
    }
}
