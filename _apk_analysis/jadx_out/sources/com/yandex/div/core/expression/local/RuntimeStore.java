package com.yandex.div.core.expression.local;

import ah.e2;
import bn.r;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;

/* JADX INFO: compiled from: RuntimeStore.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface RuntimeStore {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: RuntimeStore.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final RuntimeStore EMPTY = new RuntimeStore() { // from class: com.yandex.div.core.expression.local.RuntimeStore$Companion$EMPTY$1
            private final Void throwException() {
                throw new IllegalStateException("Trying to use RuntimeStore before initializing.");
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void cleanupRuntimes(@NotNull DivViewFacade divViewFacade) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void clearBindings(@NotNull DivViewFacade divViewFacade) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime getOrCreateRuntime(DivStatePath divStatePath, Div div, ExpressionResolver expressionResolver) {
                return (ExpressionsRuntime) m7375getOrCreateRuntime(divStatePath, div, expressionResolver);
            }

            @NotNull
            /* JADX INFO: renamed from: getOrCreateRuntime, reason: collision with other method in class */
            public Void m7375getOrCreateRuntime(@NotNull DivStatePath divStatePath, @NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
                throw new IllegalStateException();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionResolver getOrPutItemBuilderResolver(String str, ExpressionResolver expressionResolver, a aVar) {
                return (ExpressionResolver) m7376getOrPutItemBuilderResolver(str, expressionResolver, (a<? extends ExpressionResolver>) aVar);
            }

            @NotNull
            /* JADX INFO: renamed from: getOrPutItemBuilderResolver, reason: collision with other method in class */
            public Void m7376getOrPutItemBuilderResolver(@NotNull String str, @NotNull ExpressionResolver expressionResolver, @NotNull a<? extends ExpressionResolver> aVar) {
                throwException();
                throw new KotlinNothingValueException();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            @NotNull
            public ExpressionsRuntime getRootRuntime() {
                throwException();
                throw new KotlinNothingValueException();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime getRuntimeWithOrNull(ExpressionResolver expressionResolver) {
                return (ExpressionsRuntime) m7377getRuntimeWithOrNull(expressionResolver);
            }

            @NotNull
            /* JADX INFO: renamed from: getRuntimeWithOrNull, reason: collision with other method in class */
            public Void m7377getRuntimeWithOrNull(@NotNull ExpressionResolver expressionResolver) {
                throwException();
                throw new KotlinNothingValueException();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            @NotNull
            public Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes() {
                throwException();
                throw new KotlinNothingValueException();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void onDetachedFromWindow(@NotNull DivViewFacade divViewFacade) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime resolveRuntimeWith(DivViewFacade divViewFacade, DivStatePath divStatePath, Div div, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
                return (ExpressionsRuntime) m7378resolveRuntimeWith(divViewFacade, divStatePath, div, expressionResolver, expressionResolver2);
            }

            @NotNull
            /* JADX INFO: renamed from: resolveRuntimeWith, reason: collision with other method in class */
            public Void m7378resolveRuntimeWith(@Nullable DivViewFacade divViewFacade, @NotNull DivStatePath divStatePath, @NotNull Div div, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
                throwException();
                throw new KotlinNothingValueException();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void traverseFrom(@NotNull ExpressionsRuntime expressionsRuntime, @NotNull DivStatePath divStatePath, @NotNull l<? super ExpressionsRuntime, r> lVar) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void updateSubscriptions() {
            }
        };

        private Companion() {
        }

        @NotNull
        public final RuntimeStore getEMPTY() {
            return EMPTY;
        }
    }

    void cleanupRuntimes(@NotNull DivViewFacade divViewFacade);

    void clearBindings(@NotNull DivViewFacade divViewFacade);

    @NotNull
    ExpressionsRuntime getOrCreateRuntime(@NotNull DivStatePath divStatePath, @NotNull Div div, @NotNull ExpressionResolver expressionResolver);

    @NotNull
    ExpressionResolver getOrPutItemBuilderResolver(@NotNull String str, @NotNull ExpressionResolver expressionResolver, @NotNull a<? extends ExpressionResolver> aVar);

    @NotNull
    ExpressionsRuntime getRootRuntime();

    @Nullable
    ExpressionsRuntime getRuntimeWithOrNull(@NotNull ExpressionResolver expressionResolver);

    @NotNull
    Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes();

    void onDetachedFromWindow(@NotNull DivViewFacade divViewFacade);

    @Nullable
    ExpressionsRuntime resolveRuntimeWith(@Nullable DivViewFacade divViewFacade, @NotNull DivStatePath divStatePath, @NotNull Div div, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2);

    default void showWarningIfNeeded(@NotNull e2 e2Var) {
    }

    void traverseFrom(@NotNull ExpressionsRuntime expressionsRuntime, @NotNull DivStatePath divStatePath, @NotNull l<? super ExpressionsRuntime, r> lVar);

    void updateSubscriptions();
}
