package com.yandex.div.core.expression.variables;

import com.yandex.div.evaluable.VariableProvider;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConstantsProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ConstantsProvider implements VariableProvider {

    @NotNull
    private final Map<String, Object> constants;

    public ConstantsProvider(@NotNull Map<String, ? extends Object> map) {
        this.constants = map;
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    @Nullable
    public Object get(@NotNull String str) {
        return this.constants.get(str);
    }
}
