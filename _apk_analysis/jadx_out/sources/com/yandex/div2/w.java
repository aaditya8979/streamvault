package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivAnimatorTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAnimatorJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59029a;

    public w(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59029a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivAnimatorTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivAnimatorTemplate divAnimatorTemplate = entityTemplate instanceof DivAnimatorTemplate ? (DivAnimatorTemplate) entityTemplate : null;
        if (divAnimatorTemplate != null && (type = divAnimatorTemplate.getType()) != null) {
            string = type;
        }
        if (tn.p.f(string, "color_animator")) {
            return new DivAnimatorTemplate.a(this.f59029a.k2().getValue().deserialize(parsingContext, (DivColorAnimatorTemplate) (divAnimatorTemplate != null ? divAnimatorTemplate.a() : null), jSONObject));
        }
        if (tn.p.f(string, "number_animator")) {
            return new DivAnimatorTemplate.c(this.f59029a.i5().getValue().deserialize(parsingContext, (DivNumberAnimatorTemplate) (divAnimatorTemplate != null ? divAnimatorTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAnimatorTemplate divAnimatorTemplate) throws ParsingException {
        if (divAnimatorTemplate instanceof DivAnimatorTemplate.a) {
            return this.f59029a.k2().getValue().serialize(parsingContext, ((DivAnimatorTemplate.a) divAnimatorTemplate).b());
        }
        if (divAnimatorTemplate instanceof DivAnimatorTemplate.c) {
            return this.f59029a.i5().getValue().serialize(parsingContext, ((DivAnimatorTemplate.c) divAnimatorTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
