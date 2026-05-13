package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f59091a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivFixedSize f59092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f59093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f59094d;

    /* JADX INFO: compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59095a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59095a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStretchIndicatorItemPlacement deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_spacing", this.f59095a.w3());
            if (divFixedSize == null) {
                divFixedSize = z3.f59092b;
            }
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = z3.f59094d;
            Expression<Long> expression = z3.f59093c;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_visible_items", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivStretchIndicatorItemPlacement(divFixedSize, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivStretchIndicatorItemPlacement divStretchIndicatorItemPlacement) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "item_spacing", divStretchIndicatorItemPlacement.f57262a, this.f59095a.w3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_visible_items", divStretchIndicatorItemPlacement.f57263b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "stretch");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59096a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59096a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStretchIndicatorItemPlacementTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivStretchIndicatorItemPlacementTemplate(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", allowPropertyOverride, divStretchIndicatorItemPlacementTemplate != null ? divStretchIndicatorItemPlacementTemplate.f57269a : null, this.f59096a.x3()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_visible_items", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divStretchIndicatorItemPlacementTemplate != null ? divStretchIndicatorItemPlacementTemplate.f57270b : null, ParsingConvertersKt.NUMBER_TO_INT, z3.f59094d));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_spacing", divStretchIndicatorItemPlacementTemplate.f57269a, this.f59096a.x3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_visible_items", divStretchIndicatorItemPlacementTemplate.f57270b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "stretch");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivStretchIndicatorItemPlacementTemplate, DivStretchIndicatorItemPlacement> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59097a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59097a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStretchIndicatorItemPlacement resolve(@NotNull ParsingContext parsingContext, @NotNull DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divStretchIndicatorItemPlacementTemplate.f57269a, jSONObject, "item_spacing", this.f59097a.y3(), this.f59097a.w3());
            if (divFixedSize == null) {
                divFixedSize = z3.f59092b;
            }
            Field<Expression<Long>> field = divStretchIndicatorItemPlacementTemplate.f57270b;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = z3.f59094d;
            Expression<Long> expression = z3.f59093c;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "max_visible_items", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivStretchIndicatorItemPlacement(divFixedSize, expression);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f59092b = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f59093c = Expression.Companion.constant$default(companion, 10L, null, 2, null);
        f59094d = new ValueValidator() { // from class: ah.u9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.z3.b(((Long) obj).longValue());
            }
        };
    }

    public static final boolean b(long j10) {
        return j10 > 0;
    }
}
