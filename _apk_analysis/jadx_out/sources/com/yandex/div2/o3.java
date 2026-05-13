package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivShapeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShapeJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class o3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58951a;

    public o3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58951a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivShapeTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivShapeTemplate divShapeTemplate = entityTemplate instanceof DivShapeTemplate ? (DivShapeTemplate) entityTemplate : null;
        if (divShapeTemplate != null && (type = divShapeTemplate.getType()) != null) {
            string = type;
        }
        if (tn.p.f(string, "rounded_rectangle")) {
            return new DivShapeTemplate.c(this.f58951a.y6().getValue().deserialize(parsingContext, (DivRoundedRectangleShapeTemplate) (divShapeTemplate != null ? divShapeTemplate.a() : null), jSONObject));
        }
        if (tn.p.f(string, "circle")) {
            return new DivShapeTemplate.a(this.f58951a.Y1().getValue().deserialize(parsingContext, (DivCircleShapeTemplate) (divShapeTemplate != null ? divShapeTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivShapeTemplate divShapeTemplate) throws ParsingException {
        if (divShapeTemplate instanceof DivShapeTemplate.c) {
            return this.f58951a.y6().getValue().serialize(parsingContext, ((DivShapeTemplate.c) divShapeTemplate).b());
        }
        if (divShapeTemplate instanceof DivShapeTemplate.a) {
            return this.f58951a.Y1().getValue().serialize(parsingContext, ((DivShapeTemplate.a) divShapeTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
