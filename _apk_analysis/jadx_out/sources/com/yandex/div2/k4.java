package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivTextGradient;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextGradientJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class k4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58861a;

    public k4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58861a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextGradient deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "gradient")) {
            return new DivTextGradient.b(this.f58861a.V4().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "radial_gradient")) {
            return new DivTextGradient.c(this.f58861a.l6().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivTextGradientTemplate divTextGradientTemplate = orThrow instanceof DivTextGradientTemplate ? (DivTextGradientTemplate) orThrow : null;
        if (divTextGradientTemplate != null) {
            return this.f58861a.i8().getValue().resolve(parsingContext, divTextGradientTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextGradient divTextGradient) throws ParsingException {
        if (divTextGradient instanceof DivTextGradient.b) {
            return this.f58861a.V4().getValue().serialize(parsingContext, ((DivTextGradient.b) divTextGradient).c());
        }
        if (divTextGradient instanceof DivTextGradient.c) {
            return this.f58861a.l6().getValue().serialize(parsingContext, ((DivTextGradient.c) divTextGradient).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
