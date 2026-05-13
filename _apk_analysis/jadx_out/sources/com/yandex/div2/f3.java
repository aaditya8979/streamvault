package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivRadialGradientRadius;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRadiusJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58774a;

    public f3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58774a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientRadius deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "fixed")) {
            return new DivRadialGradientRadius.b(this.f58774a.w3().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "relative")) {
            return new DivRadialGradientRadius.c(this.f58774a.u6().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivRadialGradientRadiusTemplate divRadialGradientRadiusTemplate = orThrow instanceof DivRadialGradientRadiusTemplate ? (DivRadialGradientRadiusTemplate) orThrow : null;
        if (divRadialGradientRadiusTemplate != null) {
            return this.f58774a.q6().getValue().resolve(parsingContext, divRadialGradientRadiusTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientRadius divRadialGradientRadius) throws ParsingException {
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.b) {
            return this.f58774a.w3().getValue().serialize(parsingContext, ((DivRadialGradientRadius.b) divRadialGradientRadius).c());
        }
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.c) {
            return this.f58774a.u6().getValue().serialize(parsingContext, ((DivRadialGradientRadius.c) divRadialGradientRadius).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
