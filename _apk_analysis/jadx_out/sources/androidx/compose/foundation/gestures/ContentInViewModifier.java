package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import bn.r;
import com.ironsource.C3996e4;
import hn.c;
import in.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b7\u00108J%\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u001d\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fH\u0016J\u001b\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00100R!\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0017\u00103\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "Landroidx/compose/ui/layout/LayoutCoordinates;", C3996e4.f31528f, "Landroidx/compose/ui/unit/IntSize;", "oldSize", "Lbn/r;", "onSizeChanged-O0kMr_c", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)V", "onSizeChanged", "Landroidx/compose/ui/geometry/Rect;", "source", "intSize", "computeDestination-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "computeDestination", "destination", "performBringIntoView", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Lhn/c;)Ljava/lang/Object;", "", "leadingEdge", "trailingEdge", "parentSize", "relocationDistance", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "onPlaced", "localRect", "calculateRectForParent", "bringChildIntoView", "(Landroidx/compose/ui/geometry/Rect;Lhn/c;)Ljava/lang/Object;", "Ldo/l0;", "scope", "Ldo/l0;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "reverseDirection", "Z", "focusedChild", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "<init>", "(Ldo/l0;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollableState;Z)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
final class ContentInViewModifier implements BringIntoViewResponder, OnRemeasuredModifier, OnPlacedModifier {

    @Nullable
    private LayoutCoordinates coordinates;

    @Nullable
    private LayoutCoordinates focusedChild;

    @NotNull
    private final Modifier modifier;

    @Nullable
    private IntSize oldSize;

    @NotNull
    private final Orientation orientation;
    private final boolean reverseDirection;

    @NotNull
    private final l0 scope;

    @NotNull
    private final ScrollableState scrollableState;

    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContentInViewModifier(@NotNull l0 l0Var, @NotNull Orientation orientation, @NotNull ScrollableState scrollableState, boolean z10) {
        p.k(l0Var, "scope");
        p.k(orientation, "orientation");
        p.k(scrollableState, "scrollableState");
        this.scope = l0Var;
        this.orientation = orientation;
        this.scrollableState = scrollableState;
        this.reverseDirection = z10;
        this.modifier = BringIntoViewResponderKt.bringIntoViewResponder(FocusedBoundsKt.onFocusedBoundsChanged(this, new l<LayoutCoordinates, r>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier$modifier$1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable LayoutCoordinates layoutCoordinates) {
                this.this$0.focusedChild = layoutCoordinates;
            }
        }), this);
    }

    /* JADX INFO: renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final Rect m237computeDestinationO0kMr_c(Rect source, long intSize) {
        long jM3996toSizeozmzZPI = IntSizeKt.m3996toSizeozmzZPI(intSize);
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return source.translate(0.0f, relocationDistance(source.getTop(), source.getBottom(), Size.m1449getHeightimpl(jM3996toSizeozmzZPI)));
        }
        if (i10 == 2) {
            return source.translate(relocationDistance(source.getLeft(), source.getRight(), Size.m1452getWidthimpl(jM3996toSizeozmzZPI)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: onSizeChanged-O0kMr_c, reason: not valid java name */
    private final void m238onSizeChangedO0kMr_c(LayoutCoordinates coordinates, long oldSize) {
        LayoutCoordinates layoutCoordinates;
        Rect rectLocalBoundingBoxOf;
        if (!(this.orientation != Orientation.Horizontal ? IntSize.m3985getHeightimpl(coordinates.mo3114getSizeYbymL2g()) < IntSize.m3985getHeightimpl(oldSize) : IntSize.m3986getWidthimpl(coordinates.mo3114getSizeYbymL2g()) < IntSize.m3986getWidthimpl(oldSize)) || (layoutCoordinates = this.focusedChild) == null || (rectLocalBoundingBoxOf = coordinates.localBoundingBoxOf(layoutCoordinates, false)) == null) {
            return;
        }
        Rect rectM1423Recttz77jQw = RectKt.m1423Recttz77jQw(Offset.INSTANCE.m1399getZeroF1C5BW0(), IntSizeKt.m3996toSizeozmzZPI(oldSize));
        Rect rectM237computeDestinationO0kMr_c = m237computeDestinationO0kMr_c(rectLocalBoundingBoxOf, coordinates.mo3114getSizeYbymL2g());
        boolean zOverlaps = rectM1423Recttz77jQw.overlaps(rectLocalBoundingBoxOf);
        boolean z10 = !p.f(rectM237computeDestinationO0kMr_c, rectLocalBoundingBoxOf);
        if (zOverlaps && z10) {
            i.d(this.scope, null, null, new ContentInViewModifier$onSizeChanged$1(this, rectLocalBoundingBoxOf, rectM237computeDestinationO0kMr_c, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object performBringIntoView(Rect rect, Rect rect2, c<? super r> cVar) {
        float top2;
        float top3;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            top2 = rect.getTop();
            top3 = rect2.getTop();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            top2 = rect.getLeft();
            top3 = rect2.getLeft();
        }
        float f10 = top2 - top3;
        if (this.reverseDirection) {
            f10 = -f10;
        }
        Object objAnimateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(this.scrollableState, f10, null, cVar, 2, null);
        return objAnimateScrollBy$default == a.g() ? objAnimateScrollBy$default : r.f5635a;
    }

    private final float relocationDistance(float leadingEdge, float trailingEdge, float parentSize) {
        if ((leadingEdge >= 0.0f && trailingEdge <= parentSize) || (leadingEdge < 0.0f && trailingEdge > parentSize)) {
            return 0.0f;
        }
        float f10 = trailingEdge - parentSize;
        return Math.abs(leadingEdge) < Math.abs(f10) ? leadingEdge : f10;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @Nullable
    public Object bringChildIntoView(@NotNull Rect rect, @NotNull c<? super r> cVar) {
        Object objPerformBringIntoView = performBringIntoView(rect, calculateRectForParent(rect), cVar);
        return objPerformBringIntoView == a.g() ? objPerformBringIntoView : r.f5635a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @NotNull
    public Rect calculateRectForParent(@NotNull Rect localRect) {
        p.k(localRect, "localRect");
        IntSize intSize = this.oldSize;
        if (intSize != null) {
            return m237computeDestinationO0kMr_c(localRect, intSize.getPackedValue());
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public void onPlaced(@NotNull LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, C3996e4.f31528f);
        this.coordinates = layoutCoordinates;
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo239onRemeasuredozmzZPI(long size) {
        LayoutCoordinates layoutCoordinates = this.coordinates;
        IntSize intSize = this.oldSize;
        if (intSize != null && !IntSize.m3984equalsimpl0(intSize.getPackedValue(), size)) {
            if (layoutCoordinates != null && layoutCoordinates.isAttached()) {
                m238onSizeChangedO0kMr_c(layoutCoordinates, intSize.getPackedValue());
            }
        }
        this.oldSize = IntSize.m3978boximpl(size);
    }
}
