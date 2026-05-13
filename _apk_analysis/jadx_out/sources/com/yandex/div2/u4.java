package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivTextRangeMaskTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59022a;

    public u4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59022a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextRangeMaskTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivTextRangeMaskTemplate divTextRangeMaskTemplate = entityTemplate instanceof DivTextRangeMaskTemplate ? (DivTextRangeMaskTemplate) entityTemplate : null;
        if (divTextRangeMaskTemplate != null && (type = divTextRangeMaskTemplate.getType()) != null) {
            string = type;
        }
        if (tn.p.f(string, "particles")) {
            return new DivTextRangeMaskTemplate.b(this.f59022a.H8().getValue().deserialize(parsingContext, (DivTextRangeMaskParticlesTemplate) (divTextRangeMaskTemplate != null ? divTextRangeMaskTemplate.a() : null), jSONObject));
        }
        if (tn.p.f(string, "solid")) {
            return new DivTextRangeMaskTemplate.c(this.f59022a.K8().getValue().deserialize(parsingContext, (DivTextRangeMaskSolidTemplate) (divTextRangeMaskTemplate != null ? divTextRangeMaskTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeMaskTemplate divTextRangeMaskTemplate) throws ParsingException {
        if (divTextRangeMaskTemplate instanceof DivTextRangeMaskTemplate.b) {
            return this.f59022a.H8().getValue().serialize(parsingContext, ((DivTextRangeMaskTemplate.b) divTextRangeMaskTemplate).b());
        }
        if (divTextRangeMaskTemplate instanceof DivTextRangeMaskTemplate.c) {
            return this.f59022a.K8().getValue().serialize(parsingContext, ((DivTextRangeMaskTemplate.c) divTextRangeMaskTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
