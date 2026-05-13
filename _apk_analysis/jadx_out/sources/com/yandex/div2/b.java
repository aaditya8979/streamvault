package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionCopyToClipboardContent;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardContentJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58713a;

    public b(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58713a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionCopyToClipboardContent deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "text")) {
            return new DivActionCopyToClipboardContent.b(this.f58713a.s().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "url")) {
            return new DivActionCopyToClipboardContent.c(this.f58713a.v().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivActionCopyToClipboardContentTemplate divActionCopyToClipboardContentTemplate = orThrow instanceof DivActionCopyToClipboardContentTemplate ? (DivActionCopyToClipboardContentTemplate) orThrow : null;
        if (divActionCopyToClipboardContentTemplate != null) {
            return this.f58713a.e0().getValue().resolve(parsingContext, divActionCopyToClipboardContentTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionCopyToClipboardContent divActionCopyToClipboardContent) throws ParsingException {
        if (divActionCopyToClipboardContent instanceof DivActionCopyToClipboardContent.b) {
            return this.f58713a.s().getValue().serialize(parsingContext, ((DivActionCopyToClipboardContent.b) divActionCopyToClipboardContent).c());
        }
        if (divActionCopyToClipboardContent instanceof DivActionCopyToClipboardContent.c) {
            return this.f58713a.v().getValue().serialize(parsingContext, ((DivActionCopyToClipboardContent.c) divActionCopyToClipboardContent).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
