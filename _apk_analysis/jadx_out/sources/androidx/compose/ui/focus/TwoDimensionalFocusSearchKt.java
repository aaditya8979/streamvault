package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000b\u001a1\u0010\u0014\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0019\u001a\f\u0010 \u001a\u00020\u0010*\u00020\u0010H\u0002\u001a\f\u0010!\u001a\u00020\u0010*\u00020\u0010H\u0002\u001a\f\u0010\"\u001a\u00020\u0000*\u00020\u0000H\u0002\"\u0014\u0010$\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010&\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010%\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "twoDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusModifier;ILsn/l;)Z", "twoDimensionalFocusSearch", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusModifier;Landroidx/compose/ui/focus/FocusModifier;ILsn/l;)Z", "generateAndSearchChildren", "searchChildren-4C6V_qg", "searchChildren", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "findBestCandidate-4WY_MpI", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusModifier;", "findBestCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "source", "rect1", "rect2", "beamBeats-I7lrPNg", "beamBeats", "topLeft", "bottomRight", "activeNode", "", "InvalidFocusDirection", "Ljava/lang/String;", "NoActiveChild", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class TwoDimensionalFocusSearchKt {

    @NotNull
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";

    @NotNull
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final FocusModifier activeNode(FocusModifier focusModifier) {
        if (!(focusModifier.getFocusState() == FocusStateImpl.ActiveParent || focusModifier.getFocusState() == FocusStateImpl.DeactivatedParent)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        FocusModifier focusModifierFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusModifier);
        if (focusModifierFindActiveFocusNode != null) {
            return focusModifierFindActiveFocusNode;
        }
        throw new IllegalStateException(NoActiveChild.toString());
    }

    /* JADX INFO: renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m1342beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i10) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i10, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i10, rect)) {
            return false;
        }
        if (beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i10, rect)) {
            FocusDirection.Companion companion = FocusDirection.INSTANCE;
            if (!FocusDirection.m1319equalsimpl0(i10, companion.m1327getLeftdhqQ8s()) && !FocusDirection.m1319equalsimpl0(i10, companion.m1331getRightdhqQ8s()) && m1343beamBeats_I7lrPNg$majorAxisDistance3(rect2, i10, rect) >= beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i10, rect)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i10, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!(FocusDirection.m1319equalsimpl0(i10, companion.m1327getLeftdhqQ8s()) ? true : FocusDirection.m1319equalsimpl0(i10, companion.m1331getRightdhqQ8s()))) {
            if (!(FocusDirection.m1319equalsimpl0(i10, companion.m1332getUpdhqQ8s()) ? true : FocusDirection.m1319equalsimpl0(i10, companion.m1325getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                return true;
            }
        } else if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
            return true;
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i10, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1327getLeftdhqQ8s())) {
            if (rect2.getLeft() >= rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m1319equalsimpl0(i10, companion.m1331getRightdhqQ8s())) {
            if (rect2.getRight() <= rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m1319equalsimpl0(i10, companion.m1332getUpdhqQ8s())) {
            if (rect2.getTop() >= rect.getBottom()) {
                return true;
            }
        } else {
            if (!FocusDirection.m1319equalsimpl0(i10, companion.m1325getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if (rect2.getBottom() <= rect.getTop()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: beamBeats_I7lrPNg$majorAxisDistance-3, reason: not valid java name */
    private static final float m1343beamBeats_I7lrPNg$majorAxisDistance3(Rect rect, int i10, Rect rect2) {
        float top2;
        float bottom;
        float top3;
        float bottom2;
        float f10;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m1319equalsimpl0(i10, companion.m1327getLeftdhqQ8s())) {
            if (FocusDirection.m1319equalsimpl0(i10, companion.m1331getRightdhqQ8s())) {
                top2 = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m1319equalsimpl0(i10, companion.m1332getUpdhqQ8s())) {
                top3 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m1319equalsimpl0(i10, companion.m1325getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                top2 = rect.getTop();
                bottom = rect2.getBottom();
            }
            f10 = top2 - bottom;
            return Math.max(0.0f, f10);
        }
        top3 = rect2.getLeft();
        bottom2 = rect.getRight();
        f10 = top3 - bottom2;
        return Math.max(0.0f, f10);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i10, Rect rect2) {
        float bottom;
        float bottom2;
        float top2;
        float top3;
        float f10;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m1319equalsimpl0(i10, companion.m1327getLeftdhqQ8s())) {
            if (FocusDirection.m1319equalsimpl0(i10, companion.m1331getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m1319equalsimpl0(i10, companion.m1332getUpdhqQ8s())) {
                top2 = rect2.getTop();
                top3 = rect.getTop();
            } else {
                if (!FocusDirection.m1319equalsimpl0(i10, companion.m1325getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f10 = bottom - bottom2;
            return Math.max(1.0f, f10);
        }
        top2 = rect2.getLeft();
        top3 = rect.getLeft();
        f10 = top2 - top3;
        return Math.max(1.0f, f10);
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    /* JADX INFO: renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusModifier m1344findBestCandidate4WY_MpI(MutableVector<FocusModifier> mutableVector, Rect rect, int i10) {
        Rect rectTranslate;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1327getLeftdhqQ8s())) {
            rectTranslate = rect.translate(rect.getWidth() + 1, 0.0f);
        } else if (FocusDirection.m1319equalsimpl0(i10, companion.m1331getRightdhqQ8s())) {
            rectTranslate = rect.translate(-(rect.getWidth() + 1), 0.0f);
        } else if (FocusDirection.m1319equalsimpl0(i10, companion.m1332getUpdhqQ8s())) {
            rectTranslate = rect.translate(0.0f, rect.getHeight() + 1);
        } else {
            if (!FocusDirection.m1319equalsimpl0(i10, companion.m1325getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            rectTranslate = rect.translate(0.0f, -(rect.getHeight() + 1));
        }
        FocusModifier focusModifier = null;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i11 = 0;
            FocusModifier[] content = mutableVector.getContent();
            do {
                FocusModifier focusModifier2 = content[i11];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusModifier2)) {
                    Rect rectFocusRect = FocusTraversalKt.focusRect(focusModifier2);
                    if (m1346isBetterCandidateI7lrPNg(rectFocusRect, rectTranslate, rect, i10)) {
                        focusModifier = focusModifier2;
                        rectTranslate = rectFocusRect;
                    }
                }
                i11++;
            } while (i11 < size);
        }
        return focusModifier;
    }

    /* JADX INFO: renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m1345generateAndSearchChildren4C6V_qg(final FocusModifier focusModifier, final FocusModifier focusModifier2, final int i10, final l<? super FocusModifier, Boolean> lVar) {
        if (m1347searchChildren4C6V_qg(focusModifier, focusModifier2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m1315searchBeyondBoundsOMvw8(focusModifier, i10, new l<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            @Nullable
            public final Boolean invoke(@NotNull BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                p.k(beyondBoundsScope, "$this$searchBeyondBounds");
                Boolean boolValueOf = Boolean.valueOf(TwoDimensionalFocusSearchKt.m1347searchChildren4C6V_qg(focusModifier, focusModifier2, i10, lVar));
                if (boolValueOf.booleanValue() || !beyondBoundsScope.getHasMoreContent()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    private static final boolean m1346isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i10) {
        if (isBetterCandidate_I7lrPNg$isCandidate(rect, i10, rect3)) {
            if (!isBetterCandidate_I7lrPNg$isCandidate(rect2, i10, rect3) || m1342beamBeatsI7lrPNg(rect3, rect, rect2, i10)) {
                return true;
            }
            if (!m1342beamBeatsI7lrPNg(rect3, rect2, rect, i10) && isBetterCandidate_I7lrPNg$weightedDistance(i10, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i10, rect3, rect2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i10, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1327getLeftdhqQ8s())) {
            if ((rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m1319equalsimpl0(i10, companion.m1331getRightdhqQ8s())) {
            if ((rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m1319equalsimpl0(i10, companion.m1332getUpdhqQ8s())) {
            if ((rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop()) {
                return true;
            }
        } else {
            if (!FocusDirection.m1319equalsimpl0(i10, companion.m1325getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if ((rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom()) {
                return true;
            }
        }
        return false;
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i10, Rect rect2) {
        float top2;
        float bottom;
        float top3;
        float bottom2;
        float f10;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m1319equalsimpl0(i10, companion.m1327getLeftdhqQ8s())) {
            if (FocusDirection.m1319equalsimpl0(i10, companion.m1331getRightdhqQ8s())) {
                top2 = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m1319equalsimpl0(i10, companion.m1332getUpdhqQ8s())) {
                top3 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m1319equalsimpl0(i10, companion.m1325getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                top2 = rect.getTop();
                bottom = rect2.getBottom();
            }
            f10 = top2 - bottom;
            return Math.max(0.0f, f10);
        }
        top3 = rect2.getLeft();
        bottom2 = rect.getRight();
        f10 = top3 - bottom2;
        return Math.max(0.0f, f10);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i10, Rect rect2) {
        float f10;
        float left;
        float left2;
        float width;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1327getLeftdhqQ8s()) ? true : FocusDirection.m1319equalsimpl0(i10, companion.m1331getRightdhqQ8s())) {
            f10 = 2;
            left = rect2.getTop() + (rect2.getHeight() / f10);
            left2 = rect.getTop();
            width = rect.getHeight();
        } else {
            if (!(FocusDirection.m1319equalsimpl0(i10, companion.m1332getUpdhqQ8s()) ? true : FocusDirection.m1319equalsimpl0(i10, companion.m1325getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f10 = 2;
            left = rect2.getLeft() + (rect2.getWidth() / f10);
            left2 = rect.getLeft();
            width = rect.getWidth();
        }
        return left - (left2 + (width / f10));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i10, Rect rect, Rect rect2) {
        long jAbs = (long) Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i10, rect));
        long jAbs2 = (long) Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i10, rect));
        return (((long) 13) * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m1347searchChildren4C6V_qg(FocusModifier focusModifier, FocusModifier focusModifier2, int i10, l<? super FocusModifier, Boolean> lVar) {
        FocusModifier focusModifierM1344findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(new FocusModifier[focusModifier.getChildren().getSize()], 0);
        mutableVector.addAll(mutableVector.getSize(), focusModifier.getChildren());
        while (mutableVector.isNotEmpty() && (focusModifierM1344findBestCandidate4WY_MpI = m1344findBestCandidate4WY_MpI(mutableVector, FocusTraversalKt.focusRect(focusModifier2), i10)) != null) {
            if (!focusModifierM1344findBestCandidate4WY_MpI.getFocusState().isDeactivated()) {
                return lVar.invoke(focusModifierM1344findBestCandidate4WY_MpI).booleanValue();
            }
            if (m1345generateAndSearchChildren4C6V_qg(focusModifierM1344findBestCandidate4WY_MpI, focusModifier2, i10, lVar)) {
                return true;
            }
            mutableVector.remove(focusModifierM1344findBestCandidate4WY_MpI);
        }
        return false;
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    /* JADX INFO: renamed from: twoDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m1348twoDimensionalFocusSearchOMvw8(@NotNull FocusModifier focusModifier, int i10, @NotNull l<? super FocusModifier, Boolean> lVar) {
        Rect rectBottomRight;
        p.k(focusModifier, "$this$twoDimensionalFocusSearch");
        p.k(lVar, "onFound");
        FocusStateImpl focusState = focusModifier.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[focusState.ordinal()]) {
            case 1:
            case 2:
                FocusModifier focusedChild = focusModifier.getFocusedChild();
                if (focusedChild == null) {
                    throw new IllegalStateException(NoActiveChild.toString());
                }
                switch (iArr[focusedChild.getFocusState().ordinal()]) {
                    case 1:
                    case 2:
                        return m1348twoDimensionalFocusSearchOMvw8(focusedChild, i10, lVar) || m1345generateAndSearchChildren4C6V_qg(focusModifier, activeNode(focusedChild), i10, lVar);
                    case 3:
                    case 4:
                        return m1345generateAndSearchChildren4C6V_qg(focusModifier, focusedChild, i10, lVar);
                    case 5:
                    case 6:
                        throw new IllegalStateException(NoActiveChild.toString());
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 3:
            case 4:
                MutableVector<FocusModifier> mutableVectorActivatedChildren = FocusTraversalKt.activatedChildren(focusModifier);
                if (mutableVectorActivatedChildren.getSize() <= 1) {
                    FocusModifier focusModifier2 = mutableVectorActivatedChildren.isEmpty() ? null : mutableVectorActivatedChildren.getContent()[0];
                    if (focusModifier2 != null) {
                        return lVar.invoke(focusModifier2).booleanValue();
                    }
                    return false;
                }
                FocusDirection.Companion companion = FocusDirection.INSTANCE;
                if (FocusDirection.m1319equalsimpl0(i10, companion.m1331getRightdhqQ8s()) ? true : FocusDirection.m1319equalsimpl0(i10, companion.m1325getDowndhqQ8s())) {
                    rectBottomRight = topLeft(FocusTraversalKt.focusRect(focusModifier));
                } else {
                    if (!(FocusDirection.m1319equalsimpl0(i10, companion.m1327getLeftdhqQ8s()) ? true : FocusDirection.m1319equalsimpl0(i10, companion.m1332getUpdhqQ8s()))) {
                        throw new IllegalStateException(InvalidFocusDirection.toString());
                    }
                    rectBottomRight = bottomRight(FocusTraversalKt.focusRect(focusModifier));
                }
                FocusModifier focusModifierM1344findBestCandidate4WY_MpI = m1344findBestCandidate4WY_MpI(mutableVectorActivatedChildren, rectBottomRight, i10);
                if (focusModifierM1344findBestCandidate4WY_MpI != null) {
                    return lVar.invoke(focusModifierM1344findBestCandidate4WY_MpI).booleanValue();
                }
                return false;
            case 5:
                return false;
            case 6:
                return lVar.invoke(focusModifier).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
