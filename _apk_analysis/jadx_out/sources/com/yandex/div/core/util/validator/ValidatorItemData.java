package com.yandex.div.core.util.validator;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ValidatorItemData.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ValidatorItemData {

    @NotNull
    private final String labelId;

    @NotNull
    private final BaseValidator validator;

    @NotNull
    private final String variableName;

    public ValidatorItemData(@NotNull BaseValidator baseValidator, @NotNull String str, @NotNull String str2) {
        this.validator = baseValidator;
        this.variableName = str;
        this.labelId = str2;
    }

    @NotNull
    public final String getLabelId() {
        return this.labelId;
    }

    @NotNull
    public final BaseValidator getValidator() {
        return this.validator;
    }

    @NotNull
    public final String getVariableName() {
        return this.variableName;
    }
}
