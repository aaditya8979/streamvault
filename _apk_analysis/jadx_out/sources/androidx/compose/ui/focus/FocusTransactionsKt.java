package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: FocusTransactions.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0000H\u0000\u001a\u0016\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0005H\u0000\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u0014\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0002\u001a\f\u0010\r\u001a\u00020\u0005*\u00020\u0000H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0002\u001a\f\u0010\u000f\u001a\u00020\u0005*\u00020\u0000H\u0002\u001a\f\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Lbn/r;", "requestFocus", "activateNode", "deactivateNode", "", "captureFocus", "freeFocus", "forcedClear", "clearFocus", "grantFocus", "childNode", "grantFocusToChild", "clearChildFocus", "requestFocusForChild", "requestFocusForOwner", "sendOnFocusEvent", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class FocusTransactionsKt {

    /* JADX INFO: compiled from: FocusTransactions.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void activateNode(@NotNull FocusModifier focusModifier) {
        p.k(focusModifier, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()];
        if (i10 == 3) {
            focusModifier.setFocusState(FocusStateImpl.Inactive);
        } else {
            if (i10 != 4) {
                return;
            }
            focusModifier.setFocusState(FocusStateImpl.ActiveParent);
        }
    }

    public static final boolean captureFocus(@NotNull FocusModifier focusModifier) {
        p.k(focusModifier, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()]) {
            case 1:
                focusModifier.setFocusState(FocusStateImpl.Captured);
                return true;
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean clearChildFocus(FocusModifier focusModifier) {
        FocusModifier focusedChild = focusModifier.getFocusedChild();
        if (focusedChild == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (!clearFocus$default(focusedChild, false, 1, null)) {
            return false;
        }
        focusModifier.setFocusedChild(null);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean clearFocus(@NotNull FocusModifier focusModifier, boolean z10) {
        p.k(focusModifier, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()]) {
            case 1:
                focusModifier.setFocusState(FocusStateImpl.Inactive);
                return true;
            case 2:
                if (!z10) {
                    return z10;
                }
                focusModifier.setFocusState(FocusStateImpl.Inactive);
                return z10;
            case 3:
            case 6:
                return true;
            case 4:
                if (clearChildFocus(focusModifier)) {
                    focusModifier.setFocusState(FocusStateImpl.Deactivated);
                    return true;
                }
                return false;
            case 5:
                if (clearChildFocus(focusModifier)) {
                    focusModifier.setFocusState(FocusStateImpl.Inactive);
                    return true;
                }
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ boolean clearFocus$default(FocusModifier focusModifier, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return clearFocus(focusModifier, z10);
    }

    public static final void deactivateNode(@NotNull FocusModifier focusModifier) {
        LayoutNode layoutNode$ui_release;
        Owner owner$ui_release;
        FocusManager focusManager;
        p.k(focusModifier, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 5) {
                focusModifier.setFocusState(FocusStateImpl.DeactivatedParent);
                return;
            } else {
                if (i10 != 6) {
                    return;
                }
                focusModifier.setFocusState(FocusStateImpl.Deactivated);
                return;
            }
        }
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.getLayoutNodeWrapper();
        if (layoutNodeWrapper != null && (layoutNode$ui_release = layoutNodeWrapper.getLayoutNode()) != null && (owner$ui_release = layoutNode$ui_release.getOwner()) != null && (focusManager = owner$ui_release.getFocusManager()) != null) {
            focusManager.clearFocus(true);
        }
        focusModifier.setFocusState(FocusStateImpl.Deactivated);
    }

    public static final boolean freeFocus(@NotNull FocusModifier focusModifier) {
        p.k(focusModifier, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()]) {
            case 1:
                return true;
            case 2:
                focusModifier.setFocusState(FocusStateImpl.Active);
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final void grantFocus(FocusModifier focusModifier) {
        FocusStateImpl focusStateImpl;
        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 5:
            case 6:
                focusStateImpl = FocusStateImpl.Active;
                break;
            case 2:
                focusStateImpl = FocusStateImpl.Captured;
                break;
            case 3:
            case 4:
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        focusModifier.setFocusState(focusStateImpl);
    }

    private static final boolean grantFocusToChild(FocusModifier focusModifier, FocusModifier focusModifier2) {
        focusModifier.setFocusedChild(focusModifier2);
        grantFocus(focusModifier2);
        return true;
    }

    public static final void requestFocus(@NotNull FocusModifier focusModifier) {
        LayoutNode layoutNode$ui_release;
        p.k(focusModifier, "<this>");
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.getLayoutNodeWrapper();
        if (((layoutNodeWrapper == null || (layoutNode$ui_release = layoutNodeWrapper.getLayoutNode()) == null) ? null : layoutNode$ui_release.getOwner()) == null) {
            focusModifier.setFocusRequestedOnPlaced(true);
        }
        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                sendOnFocusEvent(focusModifier);
                break;
            case 5:
                if (clearChildFocus(focusModifier)) {
                    grantFocus(focusModifier);
                }
                break;
            case 6:
                FocusModifier parent = focusModifier.getParent();
                if (parent != null) {
                    requestFocusForChild(parent, focusModifier);
                } else if (requestFocusForOwner(focusModifier)) {
                    grantFocus(focusModifier);
                }
                break;
        }
    }

    private static final boolean requestFocusForChild(FocusModifier focusModifier, FocusModifier focusModifier2) {
        if (!focusModifier.getChildren().contains(focusModifier2)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()]) {
            case 1:
                focusModifier.setFocusState(FocusStateImpl.ActiveParent);
                return grantFocusToChild(focusModifier, focusModifier2);
            case 2:
                return false;
            case 3:
                activateNode(focusModifier);
                boolean zRequestFocusForChild = requestFocusForChild(focusModifier, focusModifier2);
                deactivateNode(focusModifier);
                return zRequestFocusForChild;
            case 4:
                if (focusModifier.getFocusedChild() == null || clearChildFocus(focusModifier)) {
                    return grantFocusToChild(focusModifier, focusModifier2);
                }
                return false;
            case 5:
                if (clearChildFocus(focusModifier)) {
                    return grantFocusToChild(focusModifier, focusModifier2);
                }
                return false;
            case 6:
                FocusModifier parent = focusModifier.getParent();
                if (parent == null && requestFocusForOwner(focusModifier)) {
                    focusModifier.setFocusState(FocusStateImpl.Active);
                    return requestFocusForChild(focusModifier, focusModifier2);
                }
                if (parent == null || !requestFocusForChild(parent, focusModifier)) {
                    return false;
                }
                return requestFocusForChild(focusModifier, focusModifier2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean requestFocusForOwner(FocusModifier focusModifier) {
        LayoutNode layoutNode$ui_release;
        Owner owner$ui_release;
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.getLayoutNodeWrapper();
        if (layoutNodeWrapper == null || (layoutNode$ui_release = layoutNodeWrapper.getLayoutNode()) == null || (owner$ui_release = layoutNode$ui_release.getOwner()) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return owner$ui_release.requestFocus();
    }

    public static final void sendOnFocusEvent(@NotNull FocusModifier focusModifier) {
        p.k(focusModifier, "<this>");
        FocusEventModifierLocal focusEventListener = focusModifier.getFocusEventListener();
        if (focusEventListener != null) {
            focusEventListener.propagateFocusEvent();
        }
    }
}
