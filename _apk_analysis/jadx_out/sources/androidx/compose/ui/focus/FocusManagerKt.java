package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: FocusManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Lbn/r;", "updateProperties", "findActiveItem", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class FocusManagerKt {

    /* JADX INFO: compiled from: FocusManager.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FocusModifier findActiveItem(FocusModifier focusModifier) {
        FocusModifier focusModifierFindActiveItem;
        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
                return focusModifier;
            case 3:
            case 4:
                FocusModifier focusedChild = focusModifier.getFocusedChild();
                if (focusedChild == null || (focusModifierFindActiveItem = findActiveItem(focusedChild)) == null) {
                    throw new IllegalStateException("no child".toString());
                }
                return focusModifierFindActiveItem;
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateProperties(FocusModifier focusModifier) {
        FocusPropertiesKt.refreshFocusProperties(focusModifier);
        MutableVector<FocusModifier> children = focusModifier.getChildren();
        int size = children.getSize();
        if (size > 0) {
            int i10 = 0;
            FocusModifier[] content = children.getContent();
            do {
                updateProperties(content[i10]);
                i10++;
            } while (i10 < size);
        }
    }
}
