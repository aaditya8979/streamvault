package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonTemplateParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class JsonTemplateParserKt {
    public static final void suppressMissingValueOrThrow(@NotNull ParsingException parsingException) {
        if (parsingException.getReason() != ParsingExceptionReason.MISSING_VALUE) {
            throw parsingException;
        }
    }
}
