package coil.compose;

import android.os.SystemClock;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactorKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zn.n;

/* JADX INFO: compiled from: CrossfadePainter.kt */
/* JADX INFO: loaded from: classes9.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b:\u0010;J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0018\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\u00020\u0003*\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R+\u0010*\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\u001d\u0010(\"\u0004\b&\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010!R+\u00104\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010'\u001a\u0004\b \u00102\"\u0004\b,\u00103R/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010'\u001a\u0004\b\u0019\u00106\"\u0004\b#\u00107R\u001d\u00109\u001a\u00020\f8VX\u0096\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b8\u0010\u000e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lcoil/compose/CrossfadePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lbn/r;", "onDraw", "", "alpha", "", "applyAlpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "Landroidx/compose/ui/geometry/Size;", "b", "()J", "painter", "c", "srcSize", "dstSize", "a", "(JJ)J", "Landroidx/compose/ui/graphics/painter/Painter;", "start", "end", "Landroidx/compose/ui/layout/ContentScale;", "d", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "e", "I", "durationMillis", InneractiveMediationDefs.GENDER_FEMALE, "Z", "fadeStart", "g", "preferExactIntrinsicSize", "<set-?>", "h", "Landroidx/compose/runtime/MutableState;", "()I", "(I)V", "invalidateTick", "", "i", "J", "startTimeMillis", "j", "isDone", CampaignEx.JSON_KEY_AD_K, "()F", "(F)V", "maxAlpha", "l", "()Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/layout/ContentScale;IZZ)V", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1})
public final class CrossfadePainter extends Painter {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Painter start;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Painter end;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ContentScale contentScale;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int durationMillis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean fadeStart;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean preferExactIntrinsicSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isDone;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState invalidateTick = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public long startTimeMillis = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState maxAlpha = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState colorFilter = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public CrossfadePainter(@Nullable Painter painter, @Nullable Painter painter2, @NotNull ContentScale contentScale, int i10, boolean z10, boolean z11) {
        this.start = painter;
        this.end = painter2;
        this.contentScale = contentScale;
        this.durationMillis = i10;
        this.fadeStart = z10;
        this.preferExactIntrinsicSize = z11;
    }

    public final long a(long srcSize, long dstSize) {
        Size.Companion companion = Size.INSTANCE;
        if (!(srcSize == companion.m1460getUnspecifiedNHjbRc()) && !Size.m1454isEmptyimpl(srcSize)) {
            if (!(dstSize == companion.m1460getUnspecifiedNHjbRc()) && !Size.m1454isEmptyimpl(dstSize)) {
                return ScaleFactorKt.m3188timesUQTWf7w(srcSize, this.contentScale.mo3103computeScaleFactorH7hwNQA(srcSize, dstSize));
            }
        }
        return dstSize;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        i(alpha);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        g(colorFilter);
        return true;
    }

    public final long b() {
        Painter painter = this.start;
        long intrinsicSize = painter != null ? painter.getIntrinsicSize() : Size.INSTANCE.m1461getZeroNHjbRc();
        Painter painter2 = this.end;
        long intrinsicSize2 = painter2 != null ? painter2.getIntrinsicSize() : Size.INSTANCE.m1461getZeroNHjbRc();
        Size.Companion companion = Size.INSTANCE;
        boolean z10 = intrinsicSize != companion.m1460getUnspecifiedNHjbRc();
        boolean z11 = intrinsicSize2 != companion.m1460getUnspecifiedNHjbRc();
        if (z10 && z11) {
            return SizeKt.Size(Math.max(Size.m1452getWidthimpl(intrinsicSize), Size.m1452getWidthimpl(intrinsicSize2)), Math.max(Size.m1449getHeightimpl(intrinsicSize), Size.m1449getHeightimpl(intrinsicSize2)));
        }
        if (this.preferExactIntrinsicSize) {
            if (z10) {
                return intrinsicSize;
            }
            if (z11) {
                return intrinsicSize2;
            }
        }
        return companion.m1460getUnspecifiedNHjbRc();
    }

    public final void c(DrawScope drawScope, Painter painter, float f10) {
        if (painter == null || f10 <= 0.0f) {
            return;
        }
        long jMo2113getSizeNHjbRc = drawScope.mo2113getSizeNHjbRc();
        long jA = a(painter.getIntrinsicSize(), jMo2113getSizeNHjbRc);
        if ((jMo2113getSizeNHjbRc == Size.INSTANCE.m1460getUnspecifiedNHjbRc()) || Size.m1454isEmptyimpl(jMo2113getSizeNHjbRc)) {
            painter.m2188drawx_KDEd0(drawScope, jA, f10, d());
            return;
        }
        float f11 = 2;
        float fM1452getWidthimpl = (Size.m1452getWidthimpl(jMo2113getSizeNHjbRc) - Size.m1452getWidthimpl(jA)) / f11;
        float fM1449getHeightimpl = (Size.m1449getHeightimpl(jMo2113getSizeNHjbRc) - Size.m1449getHeightimpl(jA)) / f11;
        drawScope.getDrawContext().getTransform().inset(fM1452getWidthimpl, fM1449getHeightimpl, fM1452getWidthimpl, fM1449getHeightimpl);
        painter.m2188drawx_KDEd0(drawScope, jA, f10, d());
        float f12 = -fM1452getWidthimpl;
        float f13 = -fM1449getHeightimpl;
        drawScope.getDrawContext().getTransform().inset(f12, f13, f12, f13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ColorFilter d() {
        return (ColorFilter) this.colorFilter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int e() {
        return ((Number) this.invalidateTick.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float f() {
        return ((Number) this.maxAlpha.getValue()).floatValue();
    }

    public final void g(ColorFilter colorFilter) {
        this.colorFilter.setValue(colorFilter);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        return b();
    }

    public final void h(int i10) {
        this.invalidateTick.setValue(Integer.valueOf(i10));
    }

    public final void i(float f10) {
        this.maxAlpha.setValue(Float.valueOf(f10));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        if (this.isDone) {
            c(drawScope, this.end, f());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.startTimeMillis == -1) {
            this.startTimeMillis = jUptimeMillis;
        }
        float f10 = (jUptimeMillis - this.startTimeMillis) / this.durationMillis;
        float fM = n.m(f10, 0.0f, 1.0f) * f();
        float f11 = this.fadeStart ? f() - fM : f();
        this.isDone = f10 >= 1.0f;
        c(drawScope, this.start, f11);
        c(drawScope, this.end, fM);
        if (this.isDone) {
            this.start = null;
        } else {
            h(e() + 1);
        }
    }
}
