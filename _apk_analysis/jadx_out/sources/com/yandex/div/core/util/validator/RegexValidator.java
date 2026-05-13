package com.yandex.div.core.util.validator;

import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RegexValidator.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class RegexValidator extends BaseValidator {

    @NotNull
    private final Regex regex;

    public RegexValidator(@NotNull Regex regex, boolean z10) {
        super(z10);
        this.regex = regex;
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
            int r0 = r4.length()
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 != 0) goto L1b
        L13:
            kotlin.text.Regex r0 = r3.regex
            boolean r4 = r0.matches(r4)
            if (r4 == 0) goto L1c
        L1b:
            r1 = r2
        L1c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.util.validator.RegexValidator.validate(java.lang.String):boolean");
    }
}
