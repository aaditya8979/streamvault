package com.yandex.div.json;

import com.yandex.div.internal.util.JsonNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: ParsingException.kt */
/* JADX INFO: loaded from: classes6.dex */
public class ParsingException extends RuntimeException {

    @Nullable
    private final String jsonSummary;

    @NotNull
    private final ParsingExceptionReason reason;

    @Nullable
    private final JsonNode source;

    public ParsingException(@NotNull ParsingExceptionReason parsingExceptionReason, @NotNull String str, @Nullable Throwable th2, @Nullable JsonNode jsonNode, @Nullable String str2) {
        super(str, th2);
        this.reason = parsingExceptionReason;
        this.source = jsonNode;
        this.jsonSummary = str2;
    }

    public /* synthetic */ ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th2, JsonNode jsonNode, String str2, int i10, i iVar) {
        this(parsingExceptionReason, str, (i10 & 4) != 0 ? null : th2, (i10 & 8) != 0 ? null : jsonNode, (i10 & 16) != 0 ? null : str2);
    }

    @Nullable
    public String getJsonSummary() {
        return this.jsonSummary;
    }

    @NotNull
    public ParsingExceptionReason getReason() {
        return this.reason;
    }

    @Nullable
    public JsonNode getSource() {
        return this.source;
    }
}
