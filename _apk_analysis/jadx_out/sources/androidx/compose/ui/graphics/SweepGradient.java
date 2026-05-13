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
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B4\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0014ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001d\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/geometry/Offset;", "center", "J", "", "Landroidx/compose/ui/graphics/Color;", "colors", "Ljava/util/List;", "", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Ltn/i;)V", "ui-graphics_release"}, k = 1, mv = {1, 6, 0})
public final class SweepGradient extends ShaderBrush {
    private final long center;

    @NotNull
    private final List<Color> colors;

    @Nullable
    private final List<Float> stops;

    private SweepGradient(long j10, List<Color> list, List<Float> list2) {
        this.center = j10;
        this.colors = list;
        this.stops = list2;
    }

    public /* synthetic */ SweepGradient(long j10, List list, List list2, int i10, i iVar) {
        this(j10, list, (i10 & 4) != 0 ? null : list2, null);
    }

    public /* synthetic */ SweepGradient(long j10, List list, List list2, i iVar) {
        this(j10, list, list2);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @NotNull
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo1588createShaderuvyYCjk(long size) {
        long jOffset;
        if (OffsetKt.m1404isUnspecifiedk4lQ0M(this.center)) {
            jOffset = SizeKt.m1462getCenteruvyYCjk(size);
        } else {
            jOffset = OffsetKt.Offset((Offset.m1383getXimpl(this.center) > Float.POSITIVE_INFINITY ? 1 : (Offset.m1383getXimpl(this.center) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m1452getWidthimpl(size) : Offset.m1383getXimpl(this.center), Offset.m1384getYimpl(this.center) == Float.POSITIVE_INFINITY ? Size.m1449getHeightimpl(size) : Offset.m1384getYimpl(this.center));
        }
        return ShaderKt.m1897SweepGradientShader9KIMszo(jOffset, this.colors, this.stops);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) other;
        return Offset.m1380equalsimpl0(this.center, sweepGradient.center) && p.f(this.colors, sweepGradient.colors) && p.f(this.stops, sweepGradient.stops);
    }

    public int hashCode() {
        int iM1385hashCodeimpl = ((Offset.m1385hashCodeimpl(this.center) * 31) + this.colors.hashCode()) * 31;
        List<Float> list = this.stops;
        return iM1385hashCodeimpl + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str;
        if (OffsetKt.m1402isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((Object) Offset.m1391toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }
}
