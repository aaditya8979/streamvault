package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivRadialGradientCenter;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientCenterJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58710a;

    public a3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58710a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientCenter deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "fixed")) {
            return new DivRadialGradientCenter.b(this.f58710a.i6().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "relative")) {
            return new DivRadialGradientCenter.c(this.f58710a.r6().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivRadialGradientCenterTemplate divRadialGradientCenterTemplate = orThrow instanceof DivRadialGradientCenterTemplate ? (DivRadialGradientCenterTemplate) orThrow : null;
        if (divRadialGradientCenterTemplate != null) {
            return this.f58710a.e6().getValue().resolve(parsingContext, divRadialGradientCenterTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientCenter divRadialGradientCenter) throws ParsingException {
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.b) {
            return this.f58710a.i6().getValue().serialize(parsingContext, ((DivRadialGradientCenter.b) divRadialGradientCenter).c());
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.c) {
            return this.f58710a.r6().getValue().serialize(parsingContext, ((DivRadialGradientCenter.c) divRadialGradientCenter).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
