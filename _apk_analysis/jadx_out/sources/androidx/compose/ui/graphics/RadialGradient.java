package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes12.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BF\b\u0000\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\"\u0010#J!\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001d\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010!\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "", "hashCode", "", "toString", "", "Landroidx/compose/ui/graphics/Color;", "colors", "Ljava/util/List;", "", "stops", "Landroidx/compose/ui/geometry/Offset;", "center", "J", "radius", "F", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "I", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "<init>", "(Ljava/util/List;Ljava/util/List;JFILtn/i;)V", "ui-graphics_release"}, k = 1, mv = {1, 6, 0})
public final class RadialGradient extends ShaderBrush {
    private final long center;

    @NotNull
    private final List<Color> colors;
    private final float radius;

    @Nullable
    private final List<Float> stops;
    private final int tileMode;

    private RadialGradient(List<Color> list, List<Float> list2, long j10, float f10, int i10) {
        this.colors = list;
        this.stops = list2;
        this.center = j10;
        this.radius = f10;
        this.tileMode = i10;
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j10, float f10, int i10, int i11, i iVar) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, f10, (i11 & 16) != 0 ? TileMode.INSTANCE.m1943getClamp3opZhB0() : i10, null);
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j10, float f10, int i10, i iVar) {
        this(list, list2, j10, f10, i10);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @NotNull
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo1588createShaderuvyYCjk(long size) {
        float fM1452getWidthimpl;
        float fM1449getHeightimpl;
        if (OffsetKt.m1404isUnspecifiedk4lQ0M(this.center)) {
            long jM1462getCenteruvyYCjk = SizeKt.m1462getCenteruvyYCjk(size);
            fM1452getWidthimpl = Offset.m1383getXimpl(jM1462getCenteruvyYCjk);
            fM1449getHeightimpl = Offset.m1384getYimpl(jM1462getCenteruvyYCjk);
        } else {
            fM1452getWidthimpl = (Offset.m1383getXimpl(this.center) > Float.POSITIVE_INFINITY ? 1 : (Offset.m1383getXimpl(this.center) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m1452getWidthimpl(size) : Offset.m1383getXimpl(this.center);
            fM1449getHeightimpl = (Offset.m1384getYimpl(this.center) > Float.POSITIVE_INFINITY ? 1 : (Offset.m1384getYimpl(this.center) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m1449getHeightimpl(size) : Offset.m1384getYimpl(this.center);
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long jOffset = OffsetKt.Offset(fM1452getWidthimpl, fM1449getHeightimpl);
        float f10 = this.radius;
        return ShaderKt.m1895RadialGradientShader8uybcMk(jOffset, f10 == Float.POSITIVE_INFINITY ? Size.m1451getMinDimensionimpl(size) / 2 : f10, list, list2, this.tileMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) other;
        if (p.f(this.colors, radialGradient.colors) && p.f(this.stops, radialGradient.stops) && Offset.m1380equalsimpl0(this.center, radialGradient.center)) {
            return ((this.radius > radialGradient.radius ? 1 : (this.radius == radialGradient.radius ? 0 : -1)) == 0) && TileMode.m1939equalsimpl0(this.tileMode, radialGradient.tileMode);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        float f10 = this.radius;
        if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
            return Size.INSTANCE.m1460getUnspecifiedNHjbRc();
        }
        float f11 = this.radius;
        float f12 = 2;
        return SizeKt.Size(f11 * f12, f11 * f12);
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m1385hashCodeimpl(this.center)) * 31) + Float.hashCode(this.radius)) * 31) + TileMode.m1940hashCodeimpl(this.tileMode);
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.m1402isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((Object) Offset.m1391toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        float f10 = this.radius;
        if ((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m1941toStringimpl(this.tileMode)) + ')';
    }
}
