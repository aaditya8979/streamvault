package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: FocusManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u001d\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\bJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/focus/FocusManagerImpl;", "Landroidx/compose/ui/focus/FocusManager;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "", "wrapAroundFocus-3ESFkO8", "(I)Z", "wrapAroundFocus", "Lbn/r;", "takeFocus", "releaseFocus", "force", "clearFocus", "moveFocus-3ESFkO8", "moveFocus", "fetchUpdatedFocusProperties", "Landroidx/compose/ui/focus/FocusModifier;", "getActiveFocusModifier$ui_release", "()Landroidx/compose/ui/focus/FocusModifier;", "getActiveFocusModifier", "focusModifier", "Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<init>", "(Landroidx/compose/ui/focus/FocusModifier;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class FocusManagerImpl implements FocusManager {

    @NotNull
    private final FocusModifier focusModifier;
    public LayoutDirection layoutDirection;

    @NotNull
    private final Modifier modifier;

    /* JADX INFO: compiled from: FocusManager.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 4;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusManagerImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public FocusManagerImpl(@NotNull FocusModifier focusModifier) {
        p.k(focusModifier, "focusModifier");
        this.focusModifier = focusModifier;
        this.modifier = FocusModifierKt.focusTarget(Modifier.INSTANCE, focusModifier);
    }

    public /* synthetic */ FocusManagerImpl(FocusModifier focusModifier, int i10, i iVar) {
        this((i10 & 1) != 0 ? new FocusModifier(FocusStateImpl.Inactive, null, 2, null) : focusModifier);
    }

    /* JADX INFO: renamed from: wrapAroundFocus-3ESFkO8, reason: not valid java name */
    private final boolean m1334wrapAroundFocus3ESFkO8(int focusDirection) {
        if (this.focusModifier.getFocusState().getHasFocus() && !this.focusModifier.getFocusState().isFocused()) {
            FocusDirection.Companion companion = FocusDirection.INSTANCE;
            if (FocusDirection.m1319equalsimpl0(focusDirection, companion.m1328getNextdhqQ8s()) ? true : FocusDirection.m1319equalsimpl0(focusDirection, companion.m1330getPreviousdhqQ8s())) {
                clearFocus(false);
                if (this.focusModifier.getFocusState().isFocused()) {
                    return mo1333moveFocus3ESFkO8(focusDirection);
                }
                return false;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean z10) {
        FocusStateImpl focusStateImpl;
        FocusStateImpl focusState = this.focusModifier.getFocusState();
        if (FocusTransactionsKt.clearFocus(this.focusModifier, z10)) {
            FocusModifier focusModifier = this.focusModifier;
            switch (WhenMappings.$EnumSwitchMapping$0[focusState.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    focusStateImpl = FocusStateImpl.Active;
                    break;
                case 4:
                case 5:
                    focusStateImpl = FocusStateImpl.Deactivated;
                    break;
                case 6:
                    focusStateImpl = FocusStateImpl.Inactive;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            focusModifier.setFocusState(focusStateImpl);
        }
    }

    public final void fetchUpdatedFocusProperties() {
        FocusManagerKt.updateProperties(this.focusModifier);
    }

    @Nullable
    public final FocusModifier getActiveFocusModifier$ui_release() {
        return FocusManagerKt.findActiveItem(this.focusModifier);
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        p.C("layoutDirection");
        return null;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    /* JADX INFO: renamed from: moveFocus-3ESFkO8 */
    public boolean mo1333moveFocus3ESFkO8(int focusDirection) {
        final FocusModifier focusModifierFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.focusModifier);
        if (focusModifierFindActiveFocusNode == null) {
            return false;
        }
        FocusRequester focusRequesterM1335customFocusSearchOMvw8 = FocusOrderModifierKt.m1335customFocusSearchOMvw8(focusModifierFindActiveFocusNode, focusDirection, getLayoutDirection());
        if (p.f(focusRequesterM1335customFocusSearchOMvw8, FocusRequester.INSTANCE.getDefault())) {
            return FocusTraversalKt.m1336focusSearchsMXa3k8(this.focusModifier, focusDirection, getLayoutDirection(), new l<FocusModifier, Boolean>() { // from class: androidx.compose.ui.focus.FocusManagerImpl$moveFocus$1
                {
                    super(1);
                }

                @Override // sn.l
                @NotNull
                public final Boolean invoke(@NotNull FocusModifier focusModifier) {
                    p.k(focusModifier, "destination");
                    if (p.f(focusModifier, focusModifierFindActiveFocusNode)) {
                        return Boolean.FALSE;
                    }
                    if (focusModifier.getParent() == null) {
                        throw new IllegalStateException("Move focus landed at the root.".toString());
                    }
                    FocusTransactionsKt.requestFocus(focusModifier);
                    return Boolean.TRUE;
                }
            }) || m1334wrapAroundFocus3ESFkO8(focusDirection);
        }
        focusRequesterM1335customFocusSearchOMvw8.requestFocus();
        return true;
    }

    public final void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.focusModifier, true);
    }

    public final void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        p.k(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void takeFocus() {
        if (this.focusModifier.getFocusState() == FocusStateImpl.Inactive) {
            this.focusModifier.setFocusState(FocusStateImpl.Active);
        }
    }
}
