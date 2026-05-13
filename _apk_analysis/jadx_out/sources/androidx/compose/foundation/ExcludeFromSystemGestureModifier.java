package androidx.compose.foundation;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import com.ironsource.C3996e4;
import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: SystemGestureExclusion.kt */
/* JADX INFO: loaded from: classes12.dex */
@RequiresApi(30)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0006\u0010\f\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0006R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureModifier;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroid/graphics/Rect;", "calcBounds", "findRoot", C3996e4.f31528f, "Lbn/r;", "onGloballyPositioned", "removeRect", "newRect", "replaceRect", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lkotlin/Function1;", "exclusion", "Lsn/l;", "getExclusion", "()Lsn/l;", "Landroid/graphics/Rect;", "getRect", "()Landroid/graphics/Rect;", "setRect", "(Landroid/graphics/Rect;)V", "<init>", "(Landroid/view/View;Lsn/l;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
final class ExcludeFromSystemGestureModifier implements OnGloballyPositionedModifier {

    @Nullable
    private final l<LayoutCoordinates, Rect> exclusion;

    @Nullable
    private android.graphics.Rect rect;

    @NotNull
    private final View view;

    /* JADX WARN: Multi-variable type inference failed */
    public ExcludeFromSystemGestureModifier(@NotNull View view, @Nullable l<? super LayoutCoordinates, Rect> lVar) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.view = view;
        this.exclusion = lVar;
    }

    private final android.graphics.Rect calcBounds(LayoutCoordinates layoutCoordinates, Rect rect) {
        LayoutCoordinates layoutCoordinatesFindRoot = findRoot(layoutCoordinates);
        long jMo3115localPositionOfR5De75A = layoutCoordinatesFindRoot.mo3115localPositionOfR5De75A(layoutCoordinates, rect.m1418getTopLeftF1C5BW0());
        long jMo3115localPositionOfR5De75A2 = layoutCoordinatesFindRoot.mo3115localPositionOfR5De75A(layoutCoordinates, rect.m1419getTopRightF1C5BW0());
        long jMo3115localPositionOfR5De75A3 = layoutCoordinatesFindRoot.mo3115localPositionOfR5De75A(layoutCoordinates, rect.m1411getBottomLeftF1C5BW0());
        long jMo3115localPositionOfR5De75A4 = layoutCoordinatesFindRoot.mo3115localPositionOfR5De75A(layoutCoordinates, rect.m1412getBottomRightF1C5BW0());
        return new android.graphics.Rect(vn.c.d(fn.c.j(Offset.m1383getXimpl(jMo3115localPositionOfR5De75A), Offset.m1383getXimpl(jMo3115localPositionOfR5De75A2), Offset.m1383getXimpl(jMo3115localPositionOfR5De75A3), Offset.m1383getXimpl(jMo3115localPositionOfR5De75A4))), vn.c.d(fn.c.j(Offset.m1384getYimpl(jMo3115localPositionOfR5De75A), Offset.m1384getYimpl(jMo3115localPositionOfR5De75A2), Offset.m1384getYimpl(jMo3115localPositionOfR5De75A3), Offset.m1384getYimpl(jMo3115localPositionOfR5De75A4))), vn.c.d(fn.c.g(Offset.m1383getXimpl(jMo3115localPositionOfR5De75A), Offset.m1383getXimpl(jMo3115localPositionOfR5De75A2), Offset.m1383getXimpl(jMo3115localPositionOfR5De75A3), Offset.m1383getXimpl(jMo3115localPositionOfR5De75A4))), vn.c.d(fn.c.g(Offset.m1384getYimpl(jMo3115localPositionOfR5De75A), Offset.m1384getYimpl(jMo3115localPositionOfR5De75A2), Offset.m1384getYimpl(jMo3115localPositionOfR5De75A3), Offset.m1384getYimpl(jMo3115localPositionOfR5De75A4))));
    }

    private final LayoutCoordinates findRoot(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates2 = parentLayoutCoordinates;
            LayoutCoordinates layoutCoordinates3 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates2;
            if (layoutCoordinates == null) {
                return layoutCoordinates3;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
    }

    @Nullable
    public final l<LayoutCoordinates, Rect> getExclusion() {
        return this.exclusion;
    }

    @Nullable
    public final android.graphics.Rect getRect() {
        return this.rect;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, C3996e4.f31528f);
        l<LayoutCoordinates, Rect> lVar = this.exclusion;
        replaceRect(lVar == null ? RectHelper_androidKt.toAndroidRect(LayoutCoordinatesKt.boundsInRoot(layoutCoordinates)) : calcBounds(layoutCoordinates, lVar.invoke(layoutCoordinates)));
    }

    public final void removeRect() {
        replaceRect(null);
    }

    public final void replaceRect(@Nullable android.graphics.Rect rect) {
        boolean z10 = false;
        MutableVector mutableVector = new MutableVector(new android.graphics.Rect[16], 0);
        List systemGestureExclusionRects = this.view.getSystemGestureExclusionRects();
        p.j(systemGestureExclusionRects, "view.systemGestureExclusionRects");
        mutableVector.addAll(mutableVector.getSize(), systemGestureExclusionRects);
        android.graphics.Rect rect2 = this.rect;
        if (rect2 != null) {
            mutableVector.remove(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            z10 = true;
        }
        if (z10) {
            mutableVector.add(rect);
        }
        this.view.setSystemGestureExclusionRects(mutableVector.asMutableList());
        this.rect = rect;
    }

    public final void setRect(@Nullable android.graphics.Rect rect) {
        this.rect = rect;
    }
}
