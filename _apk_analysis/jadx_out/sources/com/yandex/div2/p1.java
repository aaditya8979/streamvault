package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivIndicatorItemPlacement;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class p1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58964a;

    public p1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58964a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivIndicatorItemPlacement deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "default")) {
            return new DivIndicatorItemPlacement.b(this.f58964a.J2().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "stretch")) {
            return new DivIndicatorItemPlacement.c(this.f58964a.z7().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivIndicatorItemPlacementTemplate divIndicatorItemPlacementTemplate = orThrow instanceof DivIndicatorItemPlacementTemplate ? (DivIndicatorItemPlacementTemplate) orThrow : null;
        if (divIndicatorItemPlacementTemplate != null) {
            return this.f58964a.c4().getValue().resolve(parsingContext, divIndicatorItemPlacementTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivIndicatorItemPlacement divIndicatorItemPlacement) throws ParsingException {
        if (divIndicatorItemPlacement instanceof DivIndicatorItemPlacement.b) {
            return this.f58964a.J2().getValue().serialize(parsingContext, ((DivIndicatorItemPlacement.b) divIndicatorItemPlacement).c());
        }
        if (divIndicatorItemPlacement instanceof DivIndicatorItemPlacement.c) {
            return this.f58964a.z7().getValue().serialize(parsingContext, ((DivIndicatorItemPlacement.c) divIndicatorItemPlacement).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
