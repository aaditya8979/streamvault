package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivShape;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShapeJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class n3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58927a;

    public n3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58927a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivShape deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "rounded_rectangle")) {
            return new DivShape.c(this.f58927a.x6().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "circle")) {
            return new DivShape.a(this.f58927a.X1().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivShapeTemplate divShapeTemplate = orThrow instanceof DivShapeTemplate ? (DivShapeTemplate) orThrow : null;
        if (divShapeTemplate != null) {
            return this.f58927a.X6().getValue().resolve(parsingContext, divShapeTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivShape divShape) throws ParsingException {
        if (divShape instanceof DivShape.c) {
            return this.f58927a.x6().getValue().serialize(parsingContext, ((DivShape.c) divShape).c());
        }
        if (divShape instanceof DivShape.a) {
            return this.f58927a.X1().getValue().serialize(parsingContext, ((DivShape.a) divShape).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
