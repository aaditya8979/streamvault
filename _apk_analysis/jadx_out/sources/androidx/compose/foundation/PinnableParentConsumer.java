package androidx.compose.foundation;

import androidx.compose.foundation.lazy.layout.PinnableParent;
import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes6.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R%\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/PinnableParentConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "Lbn/r;", "onModifierLocalsUpdated", "", "other", "", "equals", "", "hashCode", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/PinnableParent;", "onPinnableParentAvailable", "Lsn/l;", "getOnPinnableParentAvailable", "()Lsn/l;", "<init>", "(Lsn/l;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
final class PinnableParentConsumer implements ModifierLocalConsumer {

    @NotNull
    private final l<PinnableParent, r> onPinnableParentAvailable;

    /* JADX WARN: Multi-variable type inference failed */
    public PinnableParentConsumer(@NotNull l<? super PinnableParent, r> lVar) {
        p.k(lVar, "onPinnableParentAvailable");
        this.onPinnableParentAvailable = lVar;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof PinnableParentConsumer) && p.f(((PinnableParentConsumer) other).onPinnableParentAvailable, this.onPinnableParentAvailable);
    }

    @NotNull
    public final l<PinnableParent, r> getOnPinnableParentAvailable() {
        return this.onPinnableParentAvailable;
    }

    public int hashCode() {
        return this.onPinnableParentAvailable.hashCode();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope modifierLocalReadScope) {
        p.k(modifierLocalReadScope, "scope");
        this.onPinnableParentAvailable.invoke((PinnableParent) modifierLocalReadScope.getCurrent(PinnableParentKt.getModifierLocalPinnableParent()));
    }
}
