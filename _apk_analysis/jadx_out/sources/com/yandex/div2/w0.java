package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivDataTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDataJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59030a;

    public w0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59030a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivDataTemplate.StateTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivDataTemplate.StateTemplate stateTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivDataTemplate.StateTemplate(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, stateTemplate != null ? stateTemplate.f55113a : null, this.f59030a.N4()), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "state_id", allowPropertyOverride, stateTemplate != null ? stateTemplate.f55114b : null, ParsingConvertersKt.NUMBER_TO_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivDataTemplate.StateTemplate stateTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "div", stateTemplate.f55113a, this.f59030a.N4());
        JsonFieldParser.writeField(parsingContext, jSONObject, "state_id", stateTemplate.f55114b);
        return jSONObject;
    }
}
