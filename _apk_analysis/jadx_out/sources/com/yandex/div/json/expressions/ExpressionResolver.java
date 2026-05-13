package com.yandex.div.json.expressions;

import bn.r;
import com.yandex.div.core.Disposable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;

/* JADX INFO: compiled from: ExpressionResolver.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface ExpressionResolver {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final ExpressionResolver EMPTY = new ExpressionResolver() { // from class: com.yandex.div.json.expressions.ExpressionResolver$Companion$EMPTY$1
        @Override // com.yandex.div.json.expressions.ExpressionResolver
        @Nullable
        public <R, T> T get(@NotNull String str, @NotNull String str2, @NotNull Evaluable evaluable, @Nullable l<? super R, ? extends T> lVar, @NotNull ValueValidator<T> valueValidator, @NotNull TypeHelper<T> typeHelper, @NotNull ParsingErrorLogger parsingErrorLogger) {
            return null;
        }

        @Override // com.yandex.div.json.expressions.ExpressionResolver
        @NotNull
        public Disposable subscribeToExpression(@NotNull String str, @NotNull List<String> list, @NotNull a<r> aVar) {
            return Disposable.NULL;
        }
    };

    /* JADX INFO: compiled from: ExpressionResolver.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Nullable
    <R, T> T get(@NotNull String str, @NotNull String str2, @NotNull Evaluable evaluable, @Nullable l<? super R, ? extends T> lVar, @NotNull ValueValidator<T> valueValidator, @NotNull TypeHelper<T> typeHelper, @NotNull ParsingErrorLogger parsingErrorLogger);

    default void notifyResolveFailed(@NotNull ParsingException parsingException) {
    }

    @NotNull
    Disposable subscribeToExpression(@NotNull String str, @NotNull List<String> list, @NotNull a<r> aVar);
}
