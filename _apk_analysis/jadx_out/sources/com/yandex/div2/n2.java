package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivPageTransformation;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageTransformationJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class n2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58926a;

    public n2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58926a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPageTransformation deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "slide")) {
            return new DivPageTransformation.c(this.f58926a.w5().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "overlap")) {
            return new DivPageTransformation.b(this.f58926a.t5().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivPageTransformationTemplate divPageTransformationTemplate = orThrow instanceof DivPageTransformationTemplate ? (DivPageTransformationTemplate) orThrow : null;
        if (divPageTransformationTemplate != null) {
            return this.f58926a.s5().getValue().resolve(parsingContext, divPageTransformationTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPageTransformation divPageTransformation) throws ParsingException {
        if (divPageTransformation instanceof DivPageTransformation.c) {
            return this.f58926a.w5().getValue().serialize(parsingContext, ((DivPageTransformation.c) divPageTransformation).c());
        }
        if (divPageTransformation instanceof DivPageTransformation.b) {
            return this.f58926a.t5().getValue().serialize(parsingContext, ((DivPageTransformation.b) divPageTransformation).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
