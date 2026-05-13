package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivTextGradientTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextGradientJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class l4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58879a;

    public l4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58879a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextGradientTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivTextGradientTemplate divTextGradientTemplate = entityTemplate instanceof DivTextGradientTemplate ? (DivTextGradientTemplate) entityTemplate : null;
        if (divTextGradientTemplate != null && (type = divTextGradientTemplate.getType()) != null) {
            string = type;
        }
        if (tn.p.f(string, "gradient")) {
            return new DivTextGradientTemplate.b(this.f58879a.W4().getValue().deserialize(parsingContext, (DivLinearGradientTemplate) (divTextGradientTemplate != null ? divTextGradientTemplate.a() : null), jSONObject));
        }
        if (tn.p.f(string, "radial_gradient")) {
            return new DivTextGradientTemplate.c(this.f58879a.m6().getValue().deserialize(parsingContext, (DivRadialGradientTemplate) (divTextGradientTemplate != null ? divTextGradientTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextGradientTemplate divTextGradientTemplate) throws ParsingException {
        if (divTextGradientTemplate instanceof DivTextGradientTemplate.b) {
            return this.f58879a.W4().getValue().serialize(parsingContext, ((DivTextGradientTemplate.b) divTextGradientTemplate).b());
        }
        if (divTextGradientTemplate instanceof DivTextGradientTemplate.c) {
            return this.f58879a.m6().getValue().serialize(parsingContext, ((DivTextGradientTemplate.c) divTextGradientTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
