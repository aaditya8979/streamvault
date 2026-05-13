package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivAnimator;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAnimatorJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59023a;

    public v(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59023a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivAnimator deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "color_animator")) {
            return new DivAnimator.a(this.f59023a.j2().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "number_animator")) {
            return new DivAnimator.c(this.f59023a.h5().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivAnimatorTemplate divAnimatorTemplate = orThrow instanceof DivAnimatorTemplate ? (DivAnimatorTemplate) orThrow : null;
        if (divAnimatorTemplate != null) {
            return this.f59023a.v1().getValue().resolve(parsingContext, divAnimatorTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAnimator divAnimator) throws ParsingException {
        if (divAnimator instanceof DivAnimator.a) {
            return this.f59023a.j2().getValue().serialize(parsingContext, ((DivAnimator.a) divAnimator).c());
        }
        if (divAnimator instanceof DivAnimator.c) {
            return this.f59023a.h5().getValue().serialize(parsingContext, ((DivAnimator.c) divAnimator).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
