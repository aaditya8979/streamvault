package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivTextTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class i4 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58839a;

    public i4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58839a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextTemplate.EllipsisTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTextTemplate.EllipsisTemplate ellipsisTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivTextTemplate.EllipsisTemplate((Field<List<DivActionTemplate>>) JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, ellipsisTemplate != null ? ellipsisTemplate.f57906a : null, this.f58839a.v0()), (Field<List<DivTextTemplate.ImageTemplate>>) JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "images", allowPropertyOverride, ellipsisTemplate != null ? ellipsisTemplate.f57907b : null, this.f58839a.n8()), (Field<List<DivTextTemplate.RangeTemplate>>) JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, ellipsisTemplate != null ? ellipsisTemplate.f57908c : null, this.f58839a.z8()), (Field<Expression<String>>) JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, ellipsisTemplate != null ? ellipsisTemplate.f57909d : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextTemplate.EllipsisTemplate ellipsisTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", ellipsisTemplate.f57906a, this.f58839a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "images", ellipsisTemplate.f57907b, this.f58839a.n8());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", ellipsisTemplate.f57908c, this.f58839a.z8());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", ellipsisTemplate.f57909d);
        return jSONObject;
    }
}
