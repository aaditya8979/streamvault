package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import bn.r;
import hn.c;
import in.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes12.dex */
@ExperimentalFoundationApi
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewChildModifier;", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lbn/r;", "bringIntoView", "(Landroidx/compose/ui/geometry/Rect;Lhn/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "defaultParent", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewParent;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
final class BringIntoViewRequesterModifier extends BringIntoViewChildModifier {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterModifier(@NotNull BringIntoViewParent bringIntoViewParent) {
        super(bringIntoViewParent);
        p.k(bringIntoViewParent, "defaultParent");
    }

    @Nullable
    public final Object bringIntoView(@Nullable Rect rect, @NotNull c<? super r> cVar) {
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return r.f5635a;
        }
        if (rect == null) {
            rect = SizeKt.m1473toRectuvyYCjk(IntSizeKt.m3996toSizeozmzZPI(layoutCoordinates.mo3114getSizeYbymL2g()));
        }
        Object objBringChildIntoView = getParent().bringChildIntoView(rect, layoutCoordinates, cVar);
        return objBringChildIntoView == a.g() ? objBringChildIntoView : r.f5635a;
    }
}
