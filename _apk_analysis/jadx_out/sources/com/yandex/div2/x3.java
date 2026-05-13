package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivStateTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStateJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x3 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59051a;

    public x3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59051a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivStateTemplate.StateTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivStateTemplate.StateTemplate stateTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivStateTemplate.StateTemplate(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_in", allowPropertyOverride, stateTemplate != null ? stateTemplate.f57253a : null, this.f59051a.r1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_out", allowPropertyOverride, stateTemplate != null ? stateTemplate.f57254b : null, this.f59051a.r1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, stateTemplate != null ? stateTemplate.f57255c : null, this.f59051a.N4()), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "state_id", allowPropertyOverride, stateTemplate != null ? stateTemplate.f57256d : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "swipe_out_actions", allowPropertyOverride, stateTemplate != null ? stateTemplate.f57257e : null, this.f59051a.v0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivStateTemplate.StateTemplate stateTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "animation_in", stateTemplate.f57253a, this.f59051a.r1());
        JsonFieldParser.writeField(parsingContext, jSONObject, "animation_out", stateTemplate.f57254b, this.f59051a.r1());
        JsonFieldParser.writeField(parsingContext, jSONObject, "div", stateTemplate.f57255c, this.f59051a.N4());
        JsonFieldParser.writeField(parsingContext, jSONObject, "state_id", stateTemplate.f57256d);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "swipe_out_actions", stateTemplate.f57257e, this.f59051a.v0());
        return jSONObject;
    }
}
