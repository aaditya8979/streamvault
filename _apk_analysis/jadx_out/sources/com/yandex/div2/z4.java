package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivTooltipMode;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59098a;

    public z4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59098a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTooltipMode deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "non_modal")) {
            return new DivTooltipMode.c(this.f59098a.Y8().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "modal")) {
            return new DivTooltipMode.b(this.f59098a.V8().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivTooltipModeTemplate divTooltipModeTemplate = orThrow instanceof DivTooltipModeTemplate ? (DivTooltipModeTemplate) orThrow : null;
        if (divTooltipModeTemplate != null) {
            return this.f59098a.U8().getValue().resolve(parsingContext, divTooltipModeTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTooltipMode divTooltipMode) throws ParsingException {
        if (divTooltipMode instanceof DivTooltipMode.c) {
            return this.f59098a.Y8().getValue().serialize(parsingContext, ((DivTooltipMode.c) divTooltipMode).c());
        }
        if (divTooltipMode instanceof DivTooltipMode.b) {
            return this.f59098a.V8().getValue().serialize(parsingContext, ((DivTooltipMode.b) divTooltipMode).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
