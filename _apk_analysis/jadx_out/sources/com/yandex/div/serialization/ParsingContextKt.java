package com.yandex.div.serialization;

import cn.w;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ParsingContext.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ParsingContextKt {
    @NotNull
    public static final ParsingContext collectingErrors(@NotNull ParsingContext parsingContext) {
        return parsingContext instanceof ErrorCollectingParsingContext ? parsingContext : new ErrorCollectingParsingContext(parsingContext);
    }

    @NotNull
    public static final List<Exception> getCollectedErrors(@NotNull ParsingContext parsingContext) {
        return parsingContext instanceof ErrorCollectingParsingContext ? ((ErrorCollectingParsingContext) parsingContext).getErrors() : parsingContext instanceof ParsingContextWrapper ? getCollectedErrors(((ParsingContextWrapper) parsingContext).getBaseContext()) : w.m();
    }

    @NotNull
    public static final ParsingContext restrictPropertyOverride(@NotNull ParsingContext parsingContext) {
        return parsingContext instanceof OverrideRestrictingParsingContext ? parsingContext : new OverrideRestrictingParsingContext(parsingContext);
    }
}
