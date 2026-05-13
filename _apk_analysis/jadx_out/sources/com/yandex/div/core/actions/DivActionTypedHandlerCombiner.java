package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivActionTyped;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: DivActionTypedHandlerCombiner.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivActionTypedHandlerCombiner {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Set<DivActionTypedHandler> handlers;

    /* JADX INFO: compiled from: DivActionTypedHandlerCombiner.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DivActionTypedHandlerCombiner(@NotNull Set<DivActionTypedHandler> set) {
        this.handlers = set;
    }

    public final boolean handleAction(@Nullable String str, @NotNull DivActionTyped divActionTyped, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        Object next;
        Iterator<T> it = this.handlers.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DivActionTypedHandler) next).handleAction(str, divActionTyped, div2View, expressionResolver)) {
                break;
            }
        }
        boolean z10 = next != null;
        if (!z10) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.DEBUG)) {
                kLog.print(3, "DivTypedActionHandlerCombiner", "Unexpected " + divActionTyped.getClass() + " was not handled");
            }
        }
        return z10;
    }
}
