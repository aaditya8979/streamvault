package androidx.compose.foundation.text;

import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: KeyboardActions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Lbn/r;", "onAny", "Landroidx/compose/foundation/text/KeyboardActions;", "KeyboardActions", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class KeyboardActionsKt {
    @NotNull
    public static final KeyboardActions KeyboardActions(@NotNull l<? super KeyboardActionScope, r> lVar) {
        p.k(lVar, "onAny");
        return new KeyboardActions(lVar, lVar, lVar, lVar, lVar, lVar);
    }
}
