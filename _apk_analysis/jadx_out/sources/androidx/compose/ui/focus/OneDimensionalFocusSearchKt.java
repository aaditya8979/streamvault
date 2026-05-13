package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import bn.r;
import fn.b;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;
import zn.i;

/* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a \u0010\t\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a \u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a=\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\r\u001a \u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a \u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a\f\u0010\u0013\u001a\u00020\u0004*\u00020\u0000H\u0002\u001aG\u0010\u0019\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0003H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aG\u0010\u001b\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0003H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u0012\u0010\u001c\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00000\u0015H\u0002\"\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusModifier;ILsn/l;)Z", "oneDimensionalFocusSearch", "forwardFocusSearch", "backwardFocusSearch", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusModifier;Landroidx/compose/ui/focus/FocusModifier;ILsn/l;)Z", "generateAndSearchChildren", "searchChildren-4C6V_qg", "searchChildren", "pickChildForForwardSearch", "pickChildForBackwardSearch", "isRoot", "T", "Landroidx/compose/runtime/collection/MutableVector;", "item", "Lbn/r;", "action", "forEachItemAfter", "(Landroidx/compose/runtime/collection/MutableVector;Ljava/lang/Object;Lsn/l;)V", "forEachItemBefore", "sort", "", "InvalidFocusDirection", "Ljava/lang/String;", "NoActiveChild", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class OneDimensionalFocusSearchKt {

    @NotNull
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";

    @NotNull
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
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

    private static final boolean backwardFocusSearch(FocusModifier focusModifier, l<? super FocusModifier, Boolean> lVar) {
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
                        if (!backwardFocusSearch(focusedChild, lVar) && !lVar.invoke(focusedChild).booleanValue()) {
                            return false;
                        }
                        break;
                    case 2:
                        if (!backwardFocusSearch(focusedChild, lVar) && !m1338generateAndSearchChildren4C6V_qg(focusModifier, focusedChild, FocusDirection.INSTANCE.m1330getPreviousdhqQ8s(), lVar)) {
                            return false;
                        }
                        break;
                    case 3:
                    case 4:
                        return m1338generateAndSearchChildren4C6V_qg(focusModifier, focusedChild, FocusDirection.INSTANCE.m1330getPreviousdhqQ8s(), lVar);
                    case 5:
                    case 6:
                        throw new IllegalStateException(NoActiveChild.toString());
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                break;
            case 3:
            case 4:
            case 5:
                return pickChildForBackwardSearch(focusModifier, lVar);
            case 6:
                if (!pickChildForBackwardSearch(focusModifier, lVar) && !lVar.invoke(focusModifier).booleanValue()) {
                    return false;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    private static final <T> void forEachItemAfter(MutableVector<T> mutableVector, T t10, l<? super T, r> lVar) {
        boolean z10 = false;
        i iVar = new i(0, mutableVector.getSize() - 1);
        int iF = iVar.f();
        int iG = iVar.g();
        if (iF > iG) {
            return;
        }
        while (true) {
            if (z10) {
                lVar.invoke(mutableVector.getContent()[iF]);
            }
            if (p.f(mutableVector.getContent()[iF], t10)) {
                z10 = true;
            }
            if (iF == iG) {
                return;
            } else {
                iF++;
            }
        }
    }

    private static final <T> void forEachItemBefore(MutableVector<T> mutableVector, T t10, l<? super T, r> lVar) {
        boolean z10 = false;
        i iVar = new i(0, mutableVector.getSize() - 1);
        int iF = iVar.f();
        int iG = iVar.g();
        if (iF > iG) {
            return;
        }
        while (true) {
            if (z10) {
                lVar.invoke(mutableVector.getContent()[iG]);
            }
            if (p.f(mutableVector.getContent()[iG], t10)) {
                z10 = true;
            }
            if (iG == iF) {
                return;
            } else {
                iG--;
            }
        }
    }

    private static final boolean forwardFocusSearch(FocusModifier focusModifier, l<? super FocusModifier, Boolean> lVar) {
        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
                FocusModifier focusedChild = focusModifier.getFocusedChild();
                if (focusedChild != null) {
                    return forwardFocusSearch(focusedChild, lVar) || m1338generateAndSearchChildren4C6V_qg(focusModifier, focusedChild, FocusDirection.INSTANCE.m1328getNextdhqQ8s(), lVar);
                }
                throw new IllegalStateException(NoActiveChild.toString());
            case 3:
            case 4:
            case 5:
                return pickChildForForwardSearch(focusModifier, lVar);
            case 6:
                return lVar.invoke(focusModifier).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m1338generateAndSearchChildren4C6V_qg(final FocusModifier focusModifier, final FocusModifier focusModifier2, final int i10, final l<? super FocusModifier, Boolean> lVar) {
        if (m1340searchChildren4C6V_qg(focusModifier, focusModifier2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m1315searchBeyondBoundsOMvw8(focusModifier, i10, new l<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            @Nullable
            public final Boolean invoke(@NotNull BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                p.k(beyondBoundsScope, "$this$searchBeyondBounds");
                Boolean boolValueOf = Boolean.valueOf(OneDimensionalFocusSearchKt.m1340searchChildren4C6V_qg(focusModifier, focusModifier2, i10, lVar));
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

    private static final boolean isRoot(FocusModifier focusModifier) {
        return focusModifier.getParent() == null;
    }

    /* JADX INFO: renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m1339oneDimensionalFocusSearchOMvw8(@NotNull FocusModifier focusModifier, int i10, @NotNull l<? super FocusModifier, Boolean> lVar) {
        p.k(focusModifier, "$this$oneDimensionalFocusSearch");
        p.k(lVar, "onFound");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1328getNextdhqQ8s())) {
            return forwardFocusSearch(focusModifier, lVar);
        }
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1330getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusModifier, lVar);
        }
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    private static final boolean pickChildForBackwardSearch(FocusModifier focusModifier, l<? super FocusModifier, Boolean> lVar) {
        sort(focusModifier.getChildren());
        MutableVector<FocusModifier> children = focusModifier.getChildren();
        int size = children.getSize();
        if (size <= 0) {
            return false;
        }
        int i10 = size - 1;
        FocusModifier[] content = children.getContent();
        do {
            FocusModifier focusModifier2 = content[i10];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusModifier2) && backwardFocusSearch(focusModifier2, lVar)) {
                return true;
            }
            i10--;
        } while (i10 >= 0);
        return false;
    }

    private static final boolean pickChildForForwardSearch(FocusModifier focusModifier, l<? super FocusModifier, Boolean> lVar) {
        sort(focusModifier.getChildren());
        MutableVector<FocusModifier> children = focusModifier.getChildren();
        int size = children.getSize();
        if (size > 0) {
            FocusModifier[] content = children.getContent();
            int i10 = 0;
            do {
                FocusModifier focusModifier2 = content[i10];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusModifier2) && forwardFocusSearch(focusModifier2, lVar)) {
                    return true;
                }
                i10++;
            } while (i10 < size);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m1340searchChildren4C6V_qg(FocusModifier focusModifier, FocusModifier focusModifier2, int i10, l<? super FocusModifier, Boolean> lVar) {
        if (!(focusModifier.getFocusState() == FocusStateImpl.ActiveParent || focusModifier.getFocusState() == FocusStateImpl.DeactivatedParent)) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        sort(focusModifier.getChildren());
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1328getNextdhqQ8s())) {
            MutableVector<FocusModifier> children = focusModifier.getChildren();
            i iVar = new i(0, children.getSize() - 1);
            int iF = iVar.f();
            int iG = iVar.g();
            if (iF <= iG) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        FocusModifier focusModifier3 = children.getContent()[iF];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusModifier3) && forwardFocusSearch(focusModifier3, lVar)) {
                            return true;
                        }
                    }
                    if (p.f(children.getContent()[iF], focusModifier2)) {
                        z10 = true;
                    }
                    if (iF == iG) {
                        break;
                    }
                    iF++;
                }
            }
        } else {
            if (!FocusDirection.m1319equalsimpl0(i10, companion.m1330getPreviousdhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            MutableVector<FocusModifier> children2 = focusModifier.getChildren();
            i iVar2 = new i(0, children2.getSize() - 1);
            int iF2 = iVar2.f();
            int iG2 = iVar2.g();
            if (iF2 <= iG2) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusModifier focusModifier4 = children2.getContent()[iG2];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusModifier4) && backwardFocusSearch(focusModifier4, lVar)) {
                            return true;
                        }
                    }
                    if (p.f(children2.getContent()[iG2], focusModifier2)) {
                        z11 = true;
                    }
                    if (iG2 == iF2) {
                        break;
                    }
                    iG2--;
                }
            }
        }
        if (FocusDirection.m1319equalsimpl0(i10, FocusDirection.INSTANCE.m1328getNextdhqQ8s()) || focusModifier.getFocusState() == FocusStateImpl.DeactivatedParent || isRoot(focusModifier)) {
            return false;
        }
        return lVar.invoke(focusModifier).booleanValue();
    }

    private static final void sort(MutableVector<FocusModifier> mutableVector) {
        mutableVector.sortWith(new Comparator() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$sort$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                LayoutNode layoutNode;
                LayoutNode layoutNode2;
                LayoutNodeWrapper layoutNodeWrapper = ((FocusModifier) t10).getLayoutNodeWrapper();
                Integer numValueOf = null;
                Integer numValueOf2 = (layoutNodeWrapper == null || (layoutNode2 = layoutNodeWrapper.getLayoutNode()) == null) ? null : Integer.valueOf(layoutNode2.getPlaceOrder());
                LayoutNodeWrapper layoutNodeWrapper2 = ((FocusModifier) t11).getLayoutNodeWrapper();
                if (layoutNodeWrapper2 != null && (layoutNode = layoutNodeWrapper2.getLayoutNode()) != null) {
                    numValueOf = Integer.valueOf(layoutNode.getPlaceOrder());
                }
                return b.d(numValueOf2, numValueOf);
            }
        });
    }
}
