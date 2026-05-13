package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifier;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: FocusTraversal.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a=\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000e\u0010\u000b\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u001a\f\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0000\u001a\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f*\u00020\u0000H\u0000\u001a\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0000H\u0000\u001a\u001a\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0002\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u0019\u001a\u00020\u0006*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/Function1;", "", "onFound", "focusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusModifier;ILandroidx/compose/ui/unit/LayoutDirection;Lsn/l;)Z", "focusSearch", "findActiveFocusNode", "findActiveParent", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "Landroidx/compose/runtime/collection/MutableVector;", "activatedChildren", "Landroidx/compose/ui/input/key/KeyInputModifier;", "findLastKeyInputModifier", "one", "two", "lastOf", "", "invalidFocusDirection", "Ljava/lang/String;", "isEligibleForFocusSearch", "(Landroidx/compose/ui/focus/FocusModifier;)Z", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class FocusTraversalKt {

    @NotNull
    private static final String invalidFocusDirection = "Invalid FocusDirection";

    /* JADX INFO: compiled from: FocusTraversal.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Rtl.ordinal()] = 1;
            iArr[LayoutDirection.Ltr.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            iArr2[FocusStateImpl.Active.ordinal()] = 1;
            iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr2[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr2[FocusStateImpl.Inactive.ordinal()] = 5;
            iArr2[FocusStateImpl.Deactivated.ordinal()] = 6;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final MutableVector<FocusModifier> activatedChildren(@NotNull FocusModifier focusModifier) {
        boolean z10;
        p.k(focusModifier, "<this>");
        MutableVector<FocusModifier> children = focusModifier.getChildren();
        int size = children.getSize();
        int i10 = 0;
        if (size <= 0) {
            z10 = false;
            break;
        }
        FocusModifier[] content = children.getContent();
        int i11 = 0;
        while (!content[i11].getFocusState().isDeactivated()) {
            i11++;
            if (i11 >= size) {
                z10 = false;
                break;
            }
        }
        z10 = true;
        if (!z10) {
            return focusModifier.getChildren();
        }
        MutableVector<FocusModifier> mutableVector = new MutableVector<>(new FocusModifier[16], 0);
        MutableVector<FocusModifier> children2 = focusModifier.getChildren();
        int size2 = children2.getSize();
        if (size2 > 0) {
            FocusModifier[] content2 = children2.getContent();
            do {
                FocusModifier focusModifier2 = content2[i10];
                if (focusModifier2.getFocusState().isDeactivated()) {
                    mutableVector.addAll(mutableVector.getSize(), activatedChildren(focusModifier2));
                } else {
                    mutableVector.add(focusModifier2);
                }
                i10++;
            } while (i10 < size2);
        }
        return mutableVector;
    }

    @Nullable
    public static final FocusModifier findActiveFocusNode(@NotNull FocusModifier focusModifier) {
        p.k(focusModifier, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
                return focusModifier;
            case 3:
            case 4:
                FocusModifier focusedChild = focusModifier.getFocusedChild();
                if (focusedChild != null) {
                    return findActiveFocusNode(focusedChild);
                }
                break;
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    @Nullable
    public static final FocusModifier findActiveParent(@NotNull FocusModifier focusModifier) {
        p.k(focusModifier, "<this>");
        FocusModifier parent = focusModifier.getParent();
        if (parent == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$1[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return findActiveParent(parent);
            case 3:
                return focusModifier;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Nullable
    public static final KeyInputModifier findLastKeyInputModifier(@NotNull FocusModifier focusModifier) {
        LayoutNode layoutNode;
        p.k(focusModifier, "<this>");
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.getLayoutNodeWrapper();
        KeyInputModifier keyInputModifierLastOf = null;
        if (layoutNodeWrapper == null || (layoutNode = layoutNodeWrapper.getLayoutNode()) == null) {
            return null;
        }
        MutableVector<KeyInputModifier> keyInputChildren = focusModifier.getKeyInputChildren();
        int size = keyInputChildren.getSize();
        if (size > 0) {
            int i10 = 0;
            KeyInputModifier[] content = keyInputChildren.getContent();
            do {
                KeyInputModifier keyInputModifier = content[i10];
                if (p.f(keyInputModifier.getLayoutNode(), layoutNode)) {
                    keyInputModifierLastOf = lastOf(keyInputModifier, keyInputModifierLastOf);
                }
                i10++;
            } while (i10 < size);
        }
        return keyInputModifierLastOf != null ? keyInputModifierLastOf : focusModifier.getKeyInputModifier();
    }

    @NotNull
    public static final Rect focusRect(@NotNull FocusModifier focusModifier) {
        Rect rectLocalBoundingBoxOf;
        p.k(focusModifier, "<this>");
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.getLayoutNodeWrapper();
        return (layoutNodeWrapper == null || (rectLocalBoundingBoxOf = LayoutCoordinatesKt.findRoot(layoutNodeWrapper).localBoundingBoxOf(layoutNodeWrapper, false)) == null) ? Rect.INSTANCE.getZero() : rectLocalBoundingBoxOf;
    }

    /* JADX INFO: renamed from: focusSearch-sMXa3k8, reason: not valid java name */
    public static final boolean m1336focusSearchsMXa3k8(@NotNull FocusModifier focusModifier, int i10, @NotNull LayoutDirection layoutDirection, @NotNull l<? super FocusModifier, Boolean> lVar) {
        int iM1327getLeftdhqQ8s;
        p.k(focusModifier, "$this$focusSearch");
        p.k(layoutDirection, "layoutDirection");
        p.k(lVar, "onFound");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1328getNextdhqQ8s()) ? true : FocusDirection.m1319equalsimpl0(i10, companion.m1330getPreviousdhqQ8s())) {
            return OneDimensionalFocusSearchKt.m1339oneDimensionalFocusSearchOMvw8(focusModifier, i10, lVar);
        }
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1327getLeftdhqQ8s()) ? true : FocusDirection.m1319equalsimpl0(i10, companion.m1331getRightdhqQ8s()) ? true : FocusDirection.m1319equalsimpl0(i10, companion.m1332getUpdhqQ8s()) ? true : FocusDirection.m1319equalsimpl0(i10, companion.m1325getDowndhqQ8s())) {
            return TwoDimensionalFocusSearchKt.m1348twoDimensionalFocusSearchOMvw8(focusModifier, i10, lVar);
        }
        if (!FocusDirection.m1319equalsimpl0(i10, companion.m1326getIndhqQ8s())) {
            if (!FocusDirection.m1319equalsimpl0(i10, companion.m1329getOutdhqQ8s())) {
                throw new IllegalStateException(invalidFocusDirection.toString());
            }
            FocusModifier focusModifierFindActiveFocusNode = findActiveFocusNode(focusModifier);
            FocusModifier focusModifierFindActiveParent = focusModifierFindActiveFocusNode != null ? findActiveParent(focusModifierFindActiveFocusNode) : null;
            if (p.f(focusModifierFindActiveParent, focusModifier) || focusModifierFindActiveParent == null) {
                return false;
            }
            return lVar.invoke(focusModifierFindActiveParent).booleanValue();
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i11 == 1) {
            iM1327getLeftdhqQ8s = companion.m1327getLeftdhqQ8s();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iM1327getLeftdhqQ8s = companion.m1331getRightdhqQ8s();
        }
        FocusModifier focusModifierFindActiveFocusNode2 = findActiveFocusNode(focusModifier);
        if (focusModifierFindActiveFocusNode2 != null) {
            return TwoDimensionalFocusSearchKt.m1348twoDimensionalFocusSearchOMvw8(focusModifierFindActiveFocusNode2, iM1327getLeftdhqQ8s, lVar);
        }
        return false;
    }

    public static final boolean isEligibleForFocusSearch(@NotNull FocusModifier focusModifier) {
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        p.k(focusModifier, "<this>");
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.getLayoutNodeWrapper();
        if ((layoutNodeWrapper == null || (layoutNode2 = layoutNodeWrapper.getLayoutNode()) == null || !layoutNode2.getIsPlaced()) ? false : true) {
            LayoutNodeWrapper layoutNodeWrapper2 = focusModifier.getLayoutNodeWrapper();
            if ((layoutNodeWrapper2 == null || (layoutNode = layoutNodeWrapper2.getLayoutNode()) == null || !layoutNode.isAttached()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private static final KeyInputModifier lastOf(KeyInputModifier keyInputModifier, KeyInputModifier keyInputModifier2) {
        if (keyInputModifier2 == null) {
            return keyInputModifier;
        }
        LayoutNode layoutNode = keyInputModifier.getLayoutNode();
        KeyInputModifier parent = keyInputModifier2;
        while (!p.f(parent, keyInputModifier)) {
            parent = parent.getParent();
            if (parent == null || !p.f(parent.getLayoutNode(), layoutNode)) {
                return keyInputModifier;
            }
        }
        return keyInputModifier2;
    }
}
