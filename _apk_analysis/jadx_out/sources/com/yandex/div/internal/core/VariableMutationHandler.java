package com.yandex.div.internal.core;

import bn.r;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;

/* JADX INFO: compiled from: VariableMutationHandler.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class VariableMutationHandler {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: VariableMutationHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private final VariableMutationException createAndReportError(Throwable th2, Div2View div2View, String str) {
            VariableMutationException variableMutationException = new VariableMutationException(str, th2);
            DivActionTypedUtilsKt.logError(div2View, variableMutationException);
            return variableMutationException;
        }

        private final Variable findVariable(String str, ExpressionResolver expressionResolver) {
            VariableController variableController = UtilsKt.getVariableController(expressionResolver);
            if (variableController != null) {
                return variableController.getMutableVariable(str);
            }
            return null;
        }

        @Nullable
        public final <T extends Variable> VariableMutationException setVariable(@NotNull Div2View div2View, @NotNull String str, @NotNull ExpressionResolver expressionResolver, @NotNull l<? super T, ? extends T> lVar) {
            Object objM7534constructorimpl;
            Variable variableFindVariable = findVariable(str, expressionResolver);
            if (variableFindVariable == null) {
                return createAndReportError(null, div2View, "Variable '" + str + "' not defined!");
            }
            try {
                Result.a aVar = Result.Companion;
                variableFindVariable.setValue(lVar.invoke(variableFindVariable));
                objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
            }
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
            if (thM7537exceptionOrNullimpl == null) {
                return null;
            }
            return VariableMutationHandler.Companion.createAndReportError(thM7537exceptionOrNullimpl, div2View, "Variable '" + str + "' mutation failed!");
        }

        @Nullable
        public final VariableMutationException setVariable(@NotNull Div2View div2View, @NotNull String str, @NotNull String str2, @NotNull ExpressionResolver expressionResolver) {
            Object objM7534constructorimpl;
            Variable variableFindVariable = findVariable(str, expressionResolver);
            if (variableFindVariable == null) {
                return createAndReportError(null, div2View, "Variable '" + str + "' not defined!");
            }
            try {
                Result.a aVar = Result.Companion;
                variableFindVariable.set(str2);
                objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
            }
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
            if (thM7537exceptionOrNullimpl == null) {
                return null;
            }
            return VariableMutationHandler.Companion.createAndReportError(thM7537exceptionOrNullimpl, div2View, "Variable '" + str + "' mutation failed!");
        }
    }

    @Nullable
    public static final VariableMutationException setVariable(@NotNull Div2View div2View, @NotNull String str, @NotNull String str2, @NotNull ExpressionResolver expressionResolver) {
        return Companion.setVariable(div2View, str, str2, expressionResolver);
    }
}
