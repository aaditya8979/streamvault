package com.yandex.div.core.util.validator;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BaseValidator.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseValidator {
    private final boolean allowEmpty;

    public BaseValidator(boolean z10) {
        this.allowEmpty = z10;
    }

    public final boolean getAllowEmpty() {
        return this.allowEmpty;
    }

    public abstract boolean validate(@NotNull String str);
}
