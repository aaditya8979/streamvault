package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivActionTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58770a;

    public f(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58770a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionTemplate.MenuItemTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionTemplate.MenuItemTemplate menuItemTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionTemplate.MenuItemTemplate(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, menuItemTemplate != null ? menuItemTemplate.f54481a : null, this.f58770a.v0()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, menuItemTemplate != null ? menuItemTemplate.f54482b : null, this.f58770a.v0()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, menuItemTemplate != null ? menuItemTemplate.f54483c : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionTemplate.MenuItemTemplate menuItemTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "action", menuItemTemplate.f54481a, this.f58770a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", menuItemTemplate.f54482b, this.f58770a.v0());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", menuItemTemplate.f54483c);
        return jSONObject;
    }
}
