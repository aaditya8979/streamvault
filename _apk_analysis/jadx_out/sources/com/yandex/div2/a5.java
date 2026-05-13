package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivTooltipModeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a5 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58712a;

    public a5(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58712a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTooltipModeTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivTooltipModeTemplate divTooltipModeTemplate = entityTemplate instanceof DivTooltipModeTemplate ? (DivTooltipModeTemplate) entityTemplate : null;
        if (divTooltipModeTemplate != null && (type = divTooltipModeTemplate.getType()) != null) {
            string = type;
        }
        if (tn.p.f(string, "non_modal")) {
            return new DivTooltipModeTemplate.c(this.f58712a.Z8().getValue().deserialize(parsingContext, (DivTooltipModeNonModalTemplate) (divTooltipModeTemplate != null ? divTooltipModeTemplate.a() : null), jSONObject));
        }
        if (tn.p.f(string, "modal")) {
            return new DivTooltipModeTemplate.b(this.f58712a.W8().getValue().deserialize(parsingContext, (DivTooltipModeModalTemplate) (divTooltipModeTemplate != null ? divTooltipModeTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTooltipModeTemplate divTooltipModeTemplate) throws ParsingException {
        if (divTooltipModeTemplate instanceof DivTooltipModeTemplate.c) {
            return this.f58712a.Z8().getValue().serialize(parsingContext, ((DivTooltipModeTemplate.c) divTooltipModeTemplate).b());
        }
        if (divTooltipModeTemplate instanceof DivTooltipModeTemplate.b) {
            return this.f58712a.W8().getValue().serialize(parsingContext, ((DivTooltipModeTemplate.b) divTooltipModeTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
