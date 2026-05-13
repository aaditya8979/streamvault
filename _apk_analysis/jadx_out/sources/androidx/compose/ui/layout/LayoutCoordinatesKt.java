package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.IntSize;
import fn.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: LayoutCoordinates.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\t\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\n\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRoot", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class LayoutCoordinatesKt {
    @NotNull
    public static final Rect boundsInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Rect rectLocalBoundingBoxOf$default;
        p.k(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m3986getWidthimpl(layoutCoordinates.mo3114getSizeYbymL2g()), IntSize.m3985getHeightimpl(layoutCoordinates.mo3114getSizeYbymL2g())) : rectLocalBoundingBoxOf$default;
    }

    @NotNull
    public static final Rect boundsInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, "<this>");
        return LayoutCoordinates.localBoundingBoxOf$default(findRoot(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    @NotNull
    public static final Rect boundsInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, "<this>");
        LayoutCoordinates layoutCoordinatesFindRoot = findRoot(layoutCoordinates);
        Rect rectBoundsInRoot = boundsInRoot(layoutCoordinates);
        long jMo3117localToWindowMKHz9U = layoutCoordinatesFindRoot.mo3117localToWindowMKHz9U(OffsetKt.Offset(rectBoundsInRoot.getLeft(), rectBoundsInRoot.getTop()));
        long jMo3117localToWindowMKHz9U2 = layoutCoordinatesFindRoot.mo3117localToWindowMKHz9U(OffsetKt.Offset(rectBoundsInRoot.getRight(), rectBoundsInRoot.getTop()));
        long jMo3117localToWindowMKHz9U3 = layoutCoordinatesFindRoot.mo3117localToWindowMKHz9U(OffsetKt.Offset(rectBoundsInRoot.getRight(), rectBoundsInRoot.getBottom()));
        long jMo3117localToWindowMKHz9U4 = layoutCoordinatesFindRoot.mo3117localToWindowMKHz9U(OffsetKt.Offset(rectBoundsInRoot.getLeft(), rectBoundsInRoot.getBottom()));
        return new Rect(c.j(Offset.m1383getXimpl(jMo3117localToWindowMKHz9U), Offset.m1383getXimpl(jMo3117localToWindowMKHz9U2), Offset.m1383getXimpl(jMo3117localToWindowMKHz9U4), Offset.m1383getXimpl(jMo3117localToWindowMKHz9U3)), c.j(Offset.m1384getYimpl(jMo3117localToWindowMKHz9U), Offset.m1384getYimpl(jMo3117localToWindowMKHz9U2), Offset.m1384getYimpl(jMo3117localToWindowMKHz9U4), Offset.m1384getYimpl(jMo3117localToWindowMKHz9U3)), c.g(Offset.m1383getXimpl(jMo3117localToWindowMKHz9U), Offset.m1383getXimpl(jMo3117localToWindowMKHz9U2), Offset.m1383getXimpl(jMo3117localToWindowMKHz9U4), Offset.m1383getXimpl(jMo3117localToWindowMKHz9U3)), c.g(Offset.m1384getYimpl(jMo3117localToWindowMKHz9U), Offset.m1384getYimpl(jMo3117localToWindowMKHz9U2), Offset.m1384getYimpl(jMo3117localToWindowMKHz9U4), Offset.m1384getYimpl(jMo3117localToWindowMKHz9U3)));
    }

    @NotNull
    public static final LayoutCoordinates findRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        p.k(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        LayoutNodeWrapper layoutNodeWrapper = layoutCoordinates2 instanceof LayoutNodeWrapper ? (LayoutNodeWrapper) layoutCoordinates2 : null;
        if (layoutNodeWrapper == null) {
            return layoutCoordinates2;
        }
        LayoutNodeWrapper wrappedBy$ui_release = layoutNodeWrapper.getWrappedBy();
        while (true) {
            LayoutNodeWrapper layoutNodeWrapper2 = wrappedBy$ui_release;
            LayoutNodeWrapper layoutNodeWrapper3 = layoutNodeWrapper;
            layoutNodeWrapper = layoutNodeWrapper2;
            if (layoutNodeWrapper == null) {
                return layoutNodeWrapper3;
            }
            wrappedBy$ui_release = layoutNodeWrapper.getWrappedBy();
        }
    }

    public static final long positionInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo3115localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m1399getZeroF1C5BW0()) : Offset.INSTANCE.m1399getZeroF1C5BW0();
    }

    public static final long positionInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, "<this>");
        return layoutCoordinates.mo3116localToRootMKHz9U(Offset.INSTANCE.m1399getZeroF1C5BW0());
    }

    public static final long positionInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, "<this>");
        return layoutCoordinates.mo3117localToWindowMKHz9U(Offset.INSTANCE.m1399getZeroF1C5BW0());
    }
}
