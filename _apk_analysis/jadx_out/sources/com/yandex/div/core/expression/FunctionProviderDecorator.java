package com.yandex.div.core.expression;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionProvider;
import com.yandex.div.evaluable.LocalFunctionProvider;
import com.yandex.div.evaluable.MissingLocalFunctionException;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FunctionProviderDecorator.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class FunctionProviderDecorator implements FunctionProvider {

    @NotNull
    private final FunctionProvider provider;

    public FunctionProviderDecorator(@NotNull FunctionProvider functionProvider) {
        this.provider = functionProvider;
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function get(@NotNull String str, @NotNull List<? extends EvaluableType> list) {
        return this.provider.get(str, list);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function getMethod(@NotNull String str, @NotNull List<? extends EvaluableType> list) {
        return this.provider.getMethod(str, list);
    }

    @NotNull
    public final FunctionProviderDecorator plus(@NotNull List<? extends Function> list) {
        final LocalFunctionProvider localFunctionProvider = new LocalFunctionProvider(list);
        return new FunctionProviderDecorator(new FunctionProvider() { // from class: com.yandex.div.core.expression.FunctionProviderDecorator.plus.1
            @Override // com.yandex.div.evaluable.FunctionProvider
            @NotNull
            public Function get(@NotNull String str, @NotNull List<? extends EvaluableType> list2) {
                try {
                    return localFunctionProvider.get(str, list2);
                } catch (MissingLocalFunctionException unused) {
                    return this.provider.get(str, list2);
                }
            }

            @Override // com.yandex.div.evaluable.FunctionProvider
            @NotNull
            public Function getMethod(@NotNull String str, @NotNull List<? extends EvaluableType> list2) {
                try {
                    return localFunctionProvider.getMethod(str, list2);
                } catch (MissingLocalFunctionException unused) {
                    return this.provider.getMethod(str, list2);
                }
            }
        });
    }
}
