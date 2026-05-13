package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivPivotTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPivotJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class y2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59068a;

    public y2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59068a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPivotTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String optionalString = JsonPropertyParser.readOptionalString(parsingContext, jSONObject, "type");
        if (optionalString == null) {
            optionalString = "pivot-fixed";
        }
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(optionalString);
        DivPivotTemplate divPivotTemplate = entityTemplate instanceof DivPivotTemplate ? (DivPivotTemplate) entityTemplate : null;
        if (divPivotTemplate != null && (type = divPivotTemplate.getType()) != null) {
            optionalString = type;
        }
        if (tn.p.f(optionalString, "pivot-fixed")) {
            return new DivPivotTemplate.b(this.f59068a.R5().getValue().deserialize(parsingContext, (DivPivotFixedTemplate) (divPivotTemplate != null ? divPivotTemplate.a() : null), jSONObject));
        }
        if (tn.p.f(optionalString, "pivot-percentage")) {
            return new DivPivotTemplate.c(this.f59068a.X5().getValue().deserialize(parsingContext, (DivPivotPercentageTemplate) (divPivotTemplate != null ? divPivotTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", optionalString);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPivotTemplate divPivotTemplate) throws ParsingException {
        if (divPivotTemplate instanceof DivPivotTemplate.b) {
            return this.f59068a.R5().getValue().serialize(parsingContext, ((DivPivotTemplate.b) divPivotTemplate).b());
        }
        if (divPivotTemplate instanceof DivPivotTemplate.c) {
            return this.f59068a.X5().getValue().serialize(parsingContext, ((DivPivotTemplate.c) divPivotTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
