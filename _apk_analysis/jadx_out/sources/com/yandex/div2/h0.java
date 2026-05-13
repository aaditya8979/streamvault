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
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivBorderJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58802a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f58803b = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58804c = new ValueValidator() { // from class: ah.g2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.h0.b(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivBorderJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivBorderJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58805a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58805a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivBorder deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, h0.f58804c);
            DivCornersRadius divCornersRadius = (DivCornersRadius) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corners_radius", this.f58805a.s2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = h0.f58803b;
            Expression<Boolean> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "has_shadow", typeHelper, lVar, expression);
            if (optionalExpression2 == null) {
                optionalExpression2 = expression;
            }
            return new DivBorder(optionalExpression, divCornersRadius, optionalExpression2, (DivShadow) JsonPropertyParser.readOptional(parsingContext, jSONObject, "shadow", this.f58805a.P6()), (DivStroke) JsonPropertyParser.readOptional(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, this.f58805a.C7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivBorder divBorder) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", divBorder.f54682a);
            JsonPropertyParser.write(parsingContext, jSONObject, "corners_radius", divBorder.f54683b, this.f58805a.s2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "has_shadow", divBorder.f54684c);
            JsonPropertyParser.write(parsingContext, jSONObject, "shadow", divBorder.f54685d, this.f58805a.P6());
            JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divBorder.f54686e, this.f58805a.C7());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivBorderJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58806a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58806a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivBorderTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivBorderTemplate divBorderTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivBorderTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.f54691a : null, ParsingConvertersKt.NUMBER_TO_INT, h0.f58804c), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "corners_radius", allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.f54692b : null, this.f58806a.t2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "has_shadow", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.f54693c : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "shadow", allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.f54694d : null, this.f58806a.Q6()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.f54695e : null, this.f58806a.D7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivBorderTemplate divBorderTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", divBorderTemplate.f54691a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "corners_radius", divBorderTemplate.f54692b, this.f58806a.t2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "has_shadow", divBorderTemplate.f54693c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "shadow", divBorderTemplate.f54694d, this.f58806a.Q6());
            JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divBorderTemplate.f54695e, this.f58806a.D7());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivBorderJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivBorderTemplate, DivBorder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58807a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58807a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivBorder resolve(@NotNull ParsingContext parsingContext, @NotNull DivBorderTemplate divBorderTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divBorderTemplate.f54691a, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, h0.f58804c);
            DivCornersRadius divCornersRadius = (DivCornersRadius) JsonFieldResolver.resolveOptional(parsingContext, divBorderTemplate.f54692b, jSONObject, "corners_radius", this.f58807a.u2(), this.f58807a.s2());
            Field<Expression<Boolean>> field = divBorderTemplate.f54693c;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = h0.f58803b;
            Expression<Boolean> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "has_shadow", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression2 != null) {
                expression = expressionResolveOptionalExpression2;
            }
            return new DivBorder(expressionResolveOptionalExpression, divCornersRadius, expression, (DivShadow) JsonFieldResolver.resolveOptional(parsingContext, divBorderTemplate.f54694d, jSONObject, "shadow", this.f58807a.R6(), this.f58807a.P6()), (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divBorderTemplate.f54695e, jSONObject, VastAttributes.STROKE_COLOR, this.f58807a.E7(), this.f58807a.C7()));
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
