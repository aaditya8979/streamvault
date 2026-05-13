package com.yandex.div.core.util.validator;

import org.jetbrains.annotations.NotNull;
import sn.a;

/* JADX INFO: compiled from: ExpressionValidator.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExpressionValidator extends BaseValidator {

    @NotNull
    private final a<Boolean> calculateExpression;

    public ExpressionValidator(boolean z10, @NotNull a<Boolean> aVar) {
        super(z10);
        this.calculateExpression = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // com.yandex.div.core.util.validator.BaseValidator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean validate(@org.jetbrains.annotations.NotNull java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.getAllowEmpty()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L13
            int r4 = r4.length()
            if (r4 != 0) goto L10
            r4 = r2
            goto L11
        L10:
            r4 = r1
        L11:
            if (r4 != 0) goto L21
        L13:
            sn.a<java.lang.Boolean> r4 = r3.calculateExpression
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L22
        L21:
            r1 = r2
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.util.validator.ExpressionValidator.validate(java.lang.String):boolean");
    }
}
