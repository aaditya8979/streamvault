package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRoundedRectangleShapeJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58832a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivFixedSize f58833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivFixedSize f58834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivFixedSize f58835d;

    /* JADX INFO: compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58836a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58836a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRoundedRectangleShape deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corner_radius", this.f58836a.w3());
            if (divFixedSize == null) {
                divFixedSize = i3.f58833b;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            DivFixedSize divFixedSize3 = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_height", this.f58836a.w3());
            if (divFixedSize3 == null) {
                divFixedSize3 = i3.f58834c;
            }
            DivFixedSize divFixedSize4 = divFixedSize3;
            DivFixedSize divFixedSize5 = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_width", this.f58836a.w3());
            if (divFixedSize5 == null) {
                divFixedSize5 = i3.f58835d;
            }
            return new DivRoundedRectangleShape(optionalExpression, divFixedSize2, divFixedSize4, divFixedSize5, (DivStroke) JsonPropertyParser.readOptional(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, this.f58836a.C7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivRoundedRectangleShape divRoundedRectangleShape) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_color", divRoundedRectangleShape.f56660a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "corner_radius", divRoundedRectangleShape.f56661b, this.f58836a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_height", divRoundedRectangleShape.f56662c, this.f58836a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_width", divRoundedRectangleShape.f56663d, this.f58836a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divRoundedRectangleShape.f56664e, this.f58836a.C7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58837a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58837a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRoundedRectangleShapeTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivRoundedRectangleShapeTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.f56671a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.f56672b : null, this.f58837a.x3()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_height", allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.f56673c : null, this.f58837a.x3()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_width", allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.f56674d : null, this.f58837a.x3()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.f56675e : null, this.f58837a.D7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_color", divRoundedRectangleShapeTemplate.f56671a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "corner_radius", divRoundedRectangleShapeTemplate.f56672b, this.f58837a.x3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_height", divRoundedRectangleShapeTemplate.f56673c, this.f58837a.x3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_width", divRoundedRectangleShapeTemplate.f56674d, this.f58837a.x3());
            JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divRoundedRectangleShapeTemplate.f56675e, this.f58837a.D7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivRoundedRectangleShapeTemplate, DivRoundedRectangleShape> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58838a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58838a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRoundedRectangleShape resolve(@NotNull ParsingContext parsingContext, @NotNull DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divRoundedRectangleShapeTemplate.f56671a, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divRoundedRectangleShapeTemplate.f56672b, jSONObject, "corner_radius", this.f58838a.y3(), this.f58838a.w3());
            if (divFixedSize == null) {
                divFixedSize = i3.f58833b;
            }
            DivFixedSize divFixedSize2 = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divRoundedRectangleShapeTemplate.f56673c, jSONObject, "item_height", this.f58838a.y3(), this.f58838a.w3());
            if (divFixedSize2 == null) {
                divFixedSize2 = i3.f58834c;
            }
            DivFixedSize divFixedSize3 = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divRoundedRectangleShapeTemplate.f56674d, jSONObject, "item_width", this.f58838a.y3(), this.f58838a.w3());
            if (divFixedSize3 == null) {
                divFixedSize3 = i3.f58835d;
            }
            return new DivRoundedRectangleShape(expressionResolveOptionalExpression, divFixedSize, divFixedSize2, divFixedSize3, (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divRoundedRectangleShapeTemplate.f56675e, jSONObject, VastAttributes.STROKE_COLOR, this.f58838a.E7(), this.f58838a.C7()));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f58833b = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f58834c = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f58835d = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
    }
}
