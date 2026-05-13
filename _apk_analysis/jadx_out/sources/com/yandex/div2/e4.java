package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivTabsTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e4 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58768a;

    public e4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58768a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTabsTemplate.ItemTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTabsTemplate.ItemTemplate itemTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivTabsTemplate.ItemTemplate(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, itemTemplate != null ? itemTemplate.f57543a : null, this.f58768a.N4()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "title", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, itemTemplate != null ? itemTemplate.f57544b : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "title_click_action", allowPropertyOverride, itemTemplate != null ? itemTemplate.f57545c : null, this.f58768a.v0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTabsTemplate.ItemTemplate itemTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "div", itemTemplate.f57543a, this.f58768a.N4());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "title", itemTemplate.f57544b);
        JsonFieldParser.writeField(parsingContext, jSONObject, "title_click_action", itemTemplate.f57545c, this.f58768a.v0());
        return jSONObject;
    }
}
