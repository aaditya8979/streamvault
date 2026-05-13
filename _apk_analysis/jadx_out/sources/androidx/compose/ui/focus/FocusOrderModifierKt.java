package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: FocusOrderModifier.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u001a(\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007\u001a)\u0010\u000f\u001a\u00020\u0006*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusOrder;", "Lbn/r;", "focusOrderReceiver", "focusOrder", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusModifier;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class FocusOrderModifierKt {

    /* JADX INFO: compiled from: FocusOrderModifier.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final FocusRequester m1335customFocusSearchOMvw8(@NotNull FocusModifier focusModifier, int i10, @NotNull LayoutDirection layoutDirection) {
        FocusRequester end;
        p.k(focusModifier, "$this$customFocusSearch");
        p.k(layoutDirection, "layoutDirection");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1328getNextdhqQ8s())) {
            return focusModifier.getFocusProperties().getNext();
        }
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1330getPreviousdhqQ8s())) {
            return focusModifier.getFocusProperties().getPrevious();
        }
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1332getUpdhqQ8s())) {
            return focusModifier.getFocusProperties().getUp();
        }
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1325getDowndhqQ8s())) {
            return focusModifier.getFocusProperties().getDown();
        }
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1327getLeftdhqQ8s())) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i11 == 1) {
                end = focusModifier.getFocusProperties().getStart();
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = focusModifier.getFocusProperties().getEnd();
            }
            if (p.f(end, FocusRequester.INSTANCE.getDefault())) {
                end = null;
            }
            if (end == null) {
                return focusModifier.getFocusProperties().getLeft();
            }
        } else {
            if (!FocusDirection.m1319equalsimpl0(i10, companion.m1331getRightdhqQ8s())) {
                if (!FocusDirection.m1319equalsimpl0(i10, companion.m1326getIndhqQ8s()) && !FocusDirection.m1319equalsimpl0(i10, companion.m1329getOutdhqQ8s())) {
                    throw new IllegalStateException("invalid FocusDirection".toString());
                }
                return FocusRequester.INSTANCE.getDefault();
            }
            int i12 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i12 == 1) {
                end = focusModifier.getFocusProperties().getEnd();
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = focusModifier.getFocusProperties().getStart();
            }
            if (p.f(end, FocusRequester.INSTANCE.getDefault())) {
                end = null;
            }
            if (end == null) {
                return focusModifier.getFocusProperties().getRight();
            }
        }
        return end;
    }

    @NotNull
    public static final Modifier focusOrder(@NotNull Modifier modifier, @NotNull FocusRequester focusRequester) {
        p.k(modifier, "<this>");
        p.k(focusRequester, "focusRequester");
        return FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    @NotNull
    public static final Modifier focusOrder(@NotNull Modifier modifier, @NotNull FocusRequester focusRequester, @NotNull l<? super FocusOrder, r> lVar) {
        p.k(modifier, "<this>");
        p.k(focusRequester, "focusRequester");
        p.k(lVar, "focusOrderReceiver");
        return FocusPropertiesKt.focusProperties(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), new FocusOrderToProperties(lVar));
    }

    @NotNull
    public static final Modifier focusOrder(@NotNull Modifier modifier, @NotNull l<? super FocusOrder, r> lVar) {
        p.k(modifier, "<this>");
        p.k(lVar, "focusOrderReceiver");
        return FocusPropertiesKt.focusProperties(modifier, new FocusOrderToProperties(lVar));
    }
}
