package com.yandex.div.core.util.inputfilter;

import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RegexInputFilter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RegexInputFilter implements BaseInputFilter {

    @NotNull
    private final Regex regex;

    public RegexInputFilter(@NotNull String str) {
        this.regex = new Regex(str);
    }

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(@NotNull String str) {
        return this.regex.matches(str);
    }
}
