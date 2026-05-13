package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivIndicatorItemPlacementTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58976a;

    public q1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58976a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivIndicatorItemPlacementTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivIndicatorItemPlacementTemplate divIndicatorItemPlacementTemplate = entityTemplate instanceof DivIndicatorItemPlacementTemplate ? (DivIndicatorItemPlacementTemplate) entityTemplate : null;
        if (divIndicatorItemPlacementTemplate != null && (type = divIndicatorItemPlacementTemplate.getType()) != null) {
            string = type;
        }
        if (tn.p.f(string, "default")) {
            return new DivIndicatorItemPlacementTemplate.b(this.f58976a.K2().getValue().deserialize(parsingContext, (DivDefaultIndicatorItemPlacementTemplate) (divIndicatorItemPlacementTemplate != null ? divIndicatorItemPlacementTemplate.a() : null), jSONObject));
        }
        if (tn.p.f(string, "stretch")) {
            return new DivIndicatorItemPlacementTemplate.c(this.f58976a.A7().getValue().deserialize(parsingContext, (DivStretchIndicatorItemPlacementTemplate) (divIndicatorItemPlacementTemplate != null ? divIndicatorItemPlacementTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivIndicatorItemPlacementTemplate divIndicatorItemPlacementTemplate) throws ParsingException {
        if (divIndicatorItemPlacementTemplate instanceof DivIndicatorItemPlacementTemplate.b) {
            return this.f58976a.K2().getValue().serialize(parsingContext, ((DivIndicatorItemPlacementTemplate.b) divIndicatorItemPlacementTemplate).b());
        }
        if (divIndicatorItemPlacementTemplate instanceof DivIndicatorItemPlacementTemplate.c) {
            return this.f58976a.A7().getValue().serialize(parsingContext, ((DivIndicatorItemPlacementTemplate.c) divIndicatorItemPlacementTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
