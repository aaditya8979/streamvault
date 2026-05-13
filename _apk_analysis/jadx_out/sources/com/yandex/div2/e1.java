package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivFilterTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilterJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58757a;

    public e1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58757a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFilterTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivFilterTemplate divFilterTemplate = entityTemplate instanceof DivFilterTemplate ? (DivFilterTemplate) entityTemplate : null;
        if (divFilterTemplate != null && (type = divFilterTemplate.getType()) != null) {
            string = type;
        }
        if (tn.p.f(string, "blur")) {
            return new DivFilterTemplate.a(this.f58757a.J1().getValue().deserialize(parsingContext, (DivBlurTemplate) (divFilterTemplate != null ? divFilterTemplate.a() : null), jSONObject));
        }
        if (tn.p.f(string, "rtl_mirror")) {
            return new DivFilterTemplate.c(this.f58757a.l3().getValue().deserialize(parsingContext, (DivFilterRtlMirrorTemplate) (divFilterTemplate != null ? divFilterTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFilterTemplate divFilterTemplate) throws ParsingException {
        if (divFilterTemplate instanceof DivFilterTemplate.a) {
            return this.f58757a.J1().getValue().serialize(parsingContext, ((DivFilterTemplate.a) divFilterTemplate).b());
        }
        if (divFilterTemplate instanceof DivFilterTemplate.c) {
            return this.f58757a.l3().getValue().serialize(parsingContext, ((DivFilterTemplate.c) divFilterTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
