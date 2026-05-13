package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivPivot;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPivotJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59050a;

    public x2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59050a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPivot deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String optionalString = JsonPropertyParser.readOptionalString(parsingContext, jSONObject, "type");
        if (optionalString == null) {
            optionalString = "pivot-fixed";
        }
        if (tn.p.f(optionalString, "pivot-fixed")) {
            return new DivPivot.b(this.f59050a.Q5().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(optionalString, "pivot-percentage")) {
            return new DivPivot.c(this.f59050a.W5().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(optionalString, jSONObject);
        DivPivotTemplate divPivotTemplate = orThrow instanceof DivPivotTemplate ? (DivPivotTemplate) orThrow : null;
        if (divPivotTemplate != null) {
            return this.f59050a.V5().getValue().resolve(parsingContext, divPivotTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", optionalString);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPivot divPivot) throws ParsingException {
        if (divPivot instanceof DivPivot.b) {
            return this.f59050a.Q5().getValue().serialize(parsingContext, ((DivPivot.b) divPivot).c());
        }
        if (divPivot instanceof DivPivot.c) {
            return this.f59050a.W5().getValue().serialize(parsingContext, ((DivPivot.c) divPivot).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
