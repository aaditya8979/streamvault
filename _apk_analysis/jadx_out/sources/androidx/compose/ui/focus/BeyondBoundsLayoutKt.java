package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: BeyondBoundsLayout.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"T", "Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "block", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusModifier;ILsn/l;)Ljava/lang/Object;", "searchBeyondBounds", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class BeyondBoundsLayoutKt {
    @Nullable
    /* JADX INFO: renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m1315searchBeyondBoundsOMvw8(@NotNull FocusModifier focusModifier, int i10, @NotNull l<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> lVar) {
        int iM3098getBeforehoxUOeE;
        p.k(focusModifier, "$this$searchBeyondBounds");
        p.k(lVar, "block");
        BeyondBoundsLayout beyondBoundsLayoutParent = focusModifier.getBeyondBoundsLayoutParent();
        if (beyondBoundsLayoutParent == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1319equalsimpl0(i10, companion.m1332getUpdhqQ8s())) {
            iM3098getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3096getAbovehoxUOeE();
        } else if (FocusDirection.m1319equalsimpl0(i10, companion.m1325getDowndhqQ8s())) {
            iM3098getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3099getBelowhoxUOeE();
        } else if (FocusDirection.m1319equalsimpl0(i10, companion.m1327getLeftdhqQ8s())) {
            iM3098getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3100getLefthoxUOeE();
        } else if (FocusDirection.m1319equalsimpl0(i10, companion.m1331getRightdhqQ8s())) {
            iM3098getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3101getRighthoxUOeE();
        } else if (FocusDirection.m1319equalsimpl0(i10, companion.m1328getNextdhqQ8s())) {
            iM3098getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3097getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m1319equalsimpl0(i10, companion.m1330getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            iM3098getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3098getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent.mo521layouto7g1Pn8(iM3098getBeforehoxUOeE, lVar);
    }
}
