package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionCopyToClipboardContentTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardContentJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58724a;

    public c(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58724a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionCopyToClipboardContentTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivActionCopyToClipboardContentTemplate divActionCopyToClipboardContentTemplate = entityTemplate instanceof DivActionCopyToClipboardContentTemplate ? (DivActionCopyToClipboardContentTemplate) entityTemplate : null;
        if (divActionCopyToClipboardContentTemplate != null && (type = divActionCopyToClipboardContentTemplate.getType()) != null) {
            string = type;
        }
        if (tn.p.f(string, "text")) {
            return new DivActionCopyToClipboardContentTemplate.b(this.f58724a.t().getValue().deserialize(parsingContext, (ContentTextTemplate) (divActionCopyToClipboardContentTemplate != null ? divActionCopyToClipboardContentTemplate.a() : null), jSONObject));
        }
        if (tn.p.f(string, "url")) {
            return new DivActionCopyToClipboardContentTemplate.c(this.f58724a.w().getValue().deserialize(parsingContext, (ContentUrlTemplate) (divActionCopyToClipboardContentTemplate != null ? divActionCopyToClipboardContentTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionCopyToClipboardContentTemplate divActionCopyToClipboardContentTemplate) throws ParsingException {
        if (divActionCopyToClipboardContentTemplate instanceof DivActionCopyToClipboardContentTemplate.b) {
            return this.f58724a.t().getValue().serialize(parsingContext, ((DivActionCopyToClipboardContentTemplate.b) divActionCopyToClipboardContentTemplate).b());
        }
        if (divActionCopyToClipboardContentTemplate instanceof DivActionCopyToClipboardContentTemplate.c) {
            return this.f58724a.w().getValue().serialize(parsingContext, ((DivActionCopyToClipboardContentTemplate.c) divActionCopyToClipboardContentTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
