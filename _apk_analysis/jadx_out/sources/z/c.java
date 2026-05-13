package z;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import coil.view.Scale;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import j0.f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0001\u001a!\u0010\u000b\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u000e\u001a\u00020\t*\u00020\b2\u0006\u0010\r\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\f\u001a\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\"\u001d\u0010\u0016\u001a\u00020\b8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"", "model", "Lj0/f;", "d", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Lj0/f;", "Landroidx/compose/ui/layout/ContentScale;", "Lcoil/size/Scale;", InneractiveMediationDefs.GENDER_FEMALE, "Landroidx/compose/ui/unit/Constraints;", "", "width", "b", "(JF)F", "height", "a", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/IntSize;", "e", "(J)J", "J", "c", "()J", "ZeroConstraints", "coil-compose-base_release"}, k = 2, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f98124a = Constraints.INSTANCE.m3790fixedJhjzzOo(0, 0);

    public static final float a(long j10, float f10) {
        return n.m(f10, Constraints.m3783getMinHeightimpl(j10), Constraints.m3781getMaxHeightimpl(j10));
    }

    public static final float b(long j10, float f10) {
        return n.m(f10, Constraints.m3784getMinWidthimpl(j10), Constraints.m3782getMaxWidthimpl(j10));
    }

    public static final long c() {
        return f98124a;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final f d(@Nullable Object obj, @Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1151830858, i10, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        return obj instanceof f ? (f) obj : new f.a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).b(obj).a();
    }

    public static final long e(long j10) {
        return IntSizeKt.IntSize(vn.c.d(Size.m1452getWidthimpl(j10)), vn.c.d(Size.m1449getHeightimpl(j10)));
    }

    @Stable
    @NotNull
    public static final Scale f(@NotNull ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.INSTANCE;
        return p.f(contentScale, companion.getFit()) ? true : p.f(contentScale, companion.getInside()) ? Scale.FIT : Scale.FILL;
    }
}
