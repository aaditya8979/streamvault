package com.yandex.div.internal.parser;

import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ParsingValidators.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ParsingValidatorsKt {
    public static final boolean doesMatch(@NotNull String str, @NotNull String str2) {
        return Pattern.matches(str2, str);
    }
}
