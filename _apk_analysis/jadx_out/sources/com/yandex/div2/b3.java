package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivRadialGradientCenterTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientCenterJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58721a;

    public b3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58721a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientCenterTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivRadialGradientCenterTemplate divRadialGradientCenterTemplate = entityTemplate instanceof DivRadialGradientCenterTemplate ? (DivRadialGradientCenterTemplate) entityTemplate : null;
        if (divRadialGradientCenterTemplate != null && (type = divRadialGradientCenterTemplate.getType()) != null) {
            string = type;
        }
        if (tn.p.f(string, "fixed")) {
            return new DivRadialGradientCenterTemplate.b(this.f58721a.j6().getValue().deserialize(parsingContext, (DivRadialGradientFixedCenterTemplate) (divRadialGradientCenterTemplate != null ? divRadialGradientCenterTemplate.a() : null), jSONObject));
        }
        if (tn.p.f(string, "relative")) {
            return new DivRadialGradientCenterTemplate.c(this.f58721a.s6().getValue().deserialize(parsingContext, (DivRadialGradientRelativeCenterTemplate) (divRadialGradientCenterTemplate != null ? divRadialGradientCenterTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientCenterTemplate divRadialGradientCenterTemplate) throws ParsingException {
        if (divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.b) {
            return this.f58721a.j6().getValue().serialize(parsingContext, ((DivRadialGradientCenterTemplate.b) divRadialGradientCenterTemplate).b());
        }
        if (divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.c) {
            return this.f58721a.s6().getValue().serialize(parsingContext, ((DivRadialGradientCenterTemplate.c) divRadialGradientCenterTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
