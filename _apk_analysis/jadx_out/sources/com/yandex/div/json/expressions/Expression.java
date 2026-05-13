package com.yandex.div.json.expressions;

import bn.r;
import bo.d0;
import cn.f0;
import cn.v;
import cn.w;
import com.yandex.div.core.CompositeDisposable;
import com.yandex.div.core.CompositeDisposableKt;
import com.yandex.div.core.Disposable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.internal.LiteralsEscaper;
import com.yandex.div.internal.parser.JsonParsers;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Expression.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Expression<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: Expression.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ Expression constant$default(Companion companion, Object obj, ParsingErrorLogger parsingErrorLogger, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                parsingErrorLogger = ParsingErrorLogger.LOG;
            }
            return companion.constant(obj, parsingErrorLogger);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final <T> Expression<T> constant(@NotNull T t10, @NotNull ParsingErrorLogger parsingErrorLogger) {
            return t10 instanceof String ? new StringConstantExpression((String) t10, null, parsingErrorLogger, 2, null) : new ConstantExpression(t10);
        }

        public final boolean mayBeExpression(@Nullable Object obj) {
            return (obj instanceof String) && d0.c0((CharSequence) obj, "@{", false, 2, null);
        }
    }

    /* JADX INFO: compiled from: Expression.kt */
    public static class ConstantExpression<T> extends Expression<T> {

        @NotNull
        private final T value;

        public ConstantExpression(@NotNull T t10) {
            this.value = t10;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public T evaluate(@NotNull ExpressionResolver expressionResolver) {
            return this.value;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public Object getRawValue() {
            T t10 = this.value;
            p.i(t10, "null cannot be cast to non-null type kotlin.Any");
            return t10;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public Disposable observe(@NotNull ExpressionResolver expressionResolver, @NotNull l<? super T, r> lVar) {
            return Disposable.NULL;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public Disposable observeAndGet(@NotNull ExpressionResolver expressionResolver, @NotNull l<? super T, r> lVar) {
            lVar.invoke(this.value);
            return Disposable.NULL;
        }
    }

    /* JADX INFO: compiled from: Expression.kt */
    public static final class MutableExpression<R, T> extends Expression<T> {

        @Nullable
        private final l<R, T> converter;

        @Nullable
        private Evaluable evaluable;

        @NotNull
        private final String expressionKey;

        @Nullable
        private final Expression<T> fieldDefaultValue;

        @Nullable
        private T lastValidValue;

        @NotNull
        private final ParsingErrorLogger logger;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final String rawValue;

        @NotNull
        private final TypeHelper<T> typeHelper;

        @NotNull
        private final ValueValidator<T> validator;

        /* JADX WARN: Multi-variable type inference failed */
        public MutableExpression(@NotNull String str, @NotNull String str2, @Nullable l<? super R, ? extends T> lVar, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull TypeHelper<T> typeHelper, @Nullable Expression<T> expression) {
            this.expressionKey = str;
            this.rawExpression = str2;
            this.converter = lVar;
            this.validator = valueValidator;
            this.logger = parsingErrorLogger;
            this.typeHelper = typeHelper;
            this.fieldDefaultValue = expression;
            this.rawValue = str2;
        }

        private final List<Evaluable> getDynamicVariables() {
            Object objM7534constructorimpl;
            try {
                Result.a aVar = Result.Companion;
                Evaluable evaluable = this.evaluable;
                objM7534constructorimpl = Result.m7534constructorimpl(evaluable != null ? evaluable.getDynamicVariables() : null);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
            }
            return (List) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
        }

        private final Evaluable getEvaluable() {
            Evaluable evaluable = this.evaluable;
            if (evaluable != null) {
                return evaluable;
            }
            try {
                Evaluable evaluableLazy = Evaluable.Companion.lazy(this.rawExpression);
                this.evaluable = evaluableLazy;
                return evaluableLazy;
            } catch (EvaluableException e10) {
                throw ParsingExceptionKt.resolveFailed(this.expressionKey, this.rawExpression, e10);
            }
        }

        private final List<String> getVariables(ExpressionResolver expressionResolver) {
            try {
                return getEvaluable().getVariables();
            } catch (Exception e10) {
                logError(ParsingExceptionKt.resolveFailed(this.expressionKey, this.rawExpression, e10), expressionResolver);
                return w.m();
            }
        }

        private final void logError(ParsingException parsingException, ExpressionResolver expressionResolver) {
            this.logger.logError(parsingException);
            expressionResolver.notifyResolveFailed(parsingException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Disposable observe(Evaluable evaluable, ExpressionResolver expressionResolver, a<r> aVar) {
            String strResolveVariableName = resolveVariableName(evaluable, expressionResolver);
            return strResolveVariableName == null ? Disposable.NULL : expressionResolver.subscribeToExpression(this.rawExpression, v.e(strResolveVariableName), aVar);
        }

        private final Disposable observe(List<? extends Evaluable> list, ExpressionResolver expressionResolver, a<r> aVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String strResolveVariableName = resolveVariableName((Evaluable) it.next(), expressionResolver);
                if (strResolveVariableName != null) {
                    arrayList.add(strResolveVariableName);
                }
            }
            return arrayList.isEmpty() ? Disposable.NULL : expressionResolver.subscribeToExpression(this.rawExpression, arrayList, aVar);
        }

        private final String resolveVariableName(Evaluable evaluable, ExpressionResolver expressionResolver) {
            return (String) expressionResolver.get(this.expressionKey, evaluable.toString(), evaluable, JsonParsers.doNotConvert(), JsonParsers.alwaysValid(), TypeHelpersKt.TYPE_HELPER_STRING, this.logger);
        }

        private final T tryResolve(ExpressionResolver expressionResolver) {
            T t10 = (T) expressionResolver.get(this.expressionKey, this.rawExpression, getEvaluable(), this.converter, this.validator, this.typeHelper, this.logger);
            if (t10 == null) {
                throw ParsingExceptionKt.resolveFailed$default(this.expressionKey, this.rawExpression, null, 4, null);
            }
            if (this.typeHelper.isTypeValid(t10)) {
                return t10;
            }
            throw ParsingExceptionKt.typeMismatch$default(this.expressionKey, this.rawExpression, t10, null, 8, null);
        }

        private final T tryResolveOrUseLast(ExpressionResolver expressionResolver) {
            T tEvaluate;
            try {
                T tTryResolve = tryResolve(expressionResolver);
                this.lastValidValue = tTryResolve;
                return tTryResolve;
            } catch (ParsingException e10) {
                String message = e10.getMessage();
                if (!(message == null || message.length() == 0)) {
                    logError(e10, expressionResolver);
                }
                T t10 = this.lastValidValue;
                if (t10 != null) {
                    return t10;
                }
                try {
                    Expression<T> expression = this.fieldDefaultValue;
                    if (expression == null || (tEvaluate = expression.evaluate(expressionResolver)) == null) {
                        return this.typeHelper.getTypeDefault();
                    }
                    this.lastValidValue = tEvaluate;
                    return tEvaluate;
                } catch (ParsingException e11) {
                    logError(e11, expressionResolver);
                    throw e11;
                }
            }
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public T evaluate(@NotNull ExpressionResolver expressionResolver) {
            return tryResolveOrUseLast(expressionResolver);
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public String getRawValue() {
            return this.rawValue;
        }

        @NotNull
        public final List<String> getVariablesName(@NotNull ExpressionResolver expressionResolver) {
            ArrayList arrayList;
            List<String> variables = getVariables(expressionResolver);
            List<Evaluable> dynamicVariables = getDynamicVariables();
            if (dynamicVariables != null) {
                arrayList = new ArrayList();
                Iterator<T> it = dynamicVariables.iterator();
                while (it.hasNext()) {
                    String strResolveVariableName = resolveVariableName((Evaluable) it.next(), expressionResolver);
                    if (strResolveVariableName != null) {
                        arrayList.add(strResolveVariableName);
                    }
                }
            } else {
                arrayList = null;
            }
            return arrayList == null || arrayList.isEmpty() ? variables : f0.O0(variables, arrayList);
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public Disposable observe(@NotNull final ExpressionResolver expressionResolver, @NotNull final l<? super T, r> lVar) {
            List<String> variables = getVariables(expressionResolver);
            List<Evaluable> dynamicVariables = getDynamicVariables();
            if (variables.isEmpty()) {
                if (dynamicVariables == null || dynamicVariables.isEmpty()) {
                    return Disposable.NULL;
                }
            }
            final a<r> aVar = new a<r>() { // from class: com.yandex.div.json.expressions.Expression$MutableExpression$observe$callbackWithValue$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f5635a;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    lVar.invoke((T) this.evaluate(expressionResolver));
                }
            };
            Disposable disposableSubscribeToExpression = expressionResolver.subscribeToExpression(this.rawExpression, variables, aVar);
            if (dynamicVariables == null || dynamicVariables.isEmpty()) {
                return disposableSubscribeToExpression;
            }
            final CompositeDisposable compositeDisposable = new CompositeDisposable();
            CompositeDisposableKt.plusAssign(compositeDisposable, disposableSubscribeToExpression);
            CompositeDisposableKt.plusAssign(compositeDisposable, observe(dynamicVariables, expressionResolver, aVar));
            for (final Evaluable evaluable : dynamicVariables) {
                a<r> aVar2 = new a<r>() { // from class: com.yandex.div.json.expressions.Expression$MutableExpression$observe$1$dynamicVarCallback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // sn.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        CompositeDisposableKt.plusAssign(compositeDisposable, this.observe(evaluable, expressionResolver, (a<r>) aVar));
                    }
                };
                CompositeDisposableKt.plusAssign(compositeDisposable, expressionResolver.subscribeToExpression(evaluable.toString(), evaluable.getVariables(), aVar2));
                CompositeDisposableKt.plusAssign(compositeDisposable, observe(evaluable.getDynamicVariables(), expressionResolver, aVar2));
            }
            return compositeDisposable;
        }
    }

    /* JADX INFO: compiled from: Expression.kt */
    public static final class StringConstantExpression extends ConstantExpression<String> {

        @Nullable
        private String cachedValue;

        @NotNull
        private final String defaultValue;

        @NotNull
        private final ParsingErrorLogger logger;

        @NotNull
        private final String value;

        public StringConstantExpression(@NotNull String str, @NotNull String str2, @NotNull ParsingErrorLogger parsingErrorLogger) {
            super(str);
            this.value = str;
            this.defaultValue = str2;
            this.logger = parsingErrorLogger;
        }

        public /* synthetic */ StringConstantExpression(String str, String str2, ParsingErrorLogger parsingErrorLogger, int i10, i iVar) {
            this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? ParsingErrorLogger.LOG : parsingErrorLogger);
        }

        @Override // com.yandex.div.json.expressions.Expression.ConstantExpression, com.yandex.div.json.expressions.Expression
        @NotNull
        public String evaluate(@NotNull ExpressionResolver expressionResolver) {
            String str = this.cachedValue;
            if (str != null) {
                return str;
            }
            try {
                String strProcess$default = LiteralsEscaper.process$default(LiteralsEscaper.INSTANCE, this.value, null, 2, null);
                this.cachedValue = strProcess$default;
                return strProcess$default;
            } catch (EvaluableException e10) {
                this.logger.logError(e10);
                String str2 = this.defaultValue;
                this.cachedValue = str2;
                return str2;
            }
        }
    }

    @NotNull
    public static final <T> Expression<T> constant(@NotNull T t10, @NotNull ParsingErrorLogger parsingErrorLogger) {
        return Companion.constant(t10, parsingErrorLogger);
    }

    public static final boolean mayBeExpression(@Nullable Object obj) {
        return Companion.mayBeExpression(obj);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Expression) {
            return p.f(getRawValue(), ((Expression) obj).getRawValue());
        }
        return false;
    }

    @NotNull
    public abstract T evaluate(@NotNull ExpressionResolver expressionResolver);

    @NotNull
    public abstract Object getRawValue();

    public int hashCode() {
        return getRawValue().hashCode() * 16;
    }

    @NotNull
    public abstract Disposable observe(@NotNull ExpressionResolver expressionResolver, @NotNull l<? super T, r> lVar);

    @NotNull
    public Disposable observeAndGet(@NotNull ExpressionResolver expressionResolver, @NotNull l<? super T, r> lVar) {
        T tEvaluate;
        try {
            tEvaluate = evaluate(expressionResolver);
        } catch (ParsingException unused) {
            tEvaluate = null;
        }
        if (tEvaluate != null) {
            lVar.invoke(tEvaluate);
        }
        return observe(expressionResolver, lVar);
    }
}
