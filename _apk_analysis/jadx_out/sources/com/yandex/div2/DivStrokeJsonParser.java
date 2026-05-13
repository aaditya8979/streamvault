package com.yandex.div2;

import com.ironsource.Ne;
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
import com.yandex.div2.DivStrokeJsonParser;
import com.yandex.div2.DivStrokeStyle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStrokeJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57281a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivStrokeStyle.c f57282b = new DivStrokeStyle.c(new DivStrokeStyleSolid());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivSizeUnit> f57283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f57284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivSizeUnit> f57285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f57286f;

    /* JADX INFO: compiled from: DivStrokeJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivStrokeJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57287a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57287a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStroke deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivStrokeStyle divStrokeStyle = (DivStrokeStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "style", this.f57287a.I7());
            if (divStrokeStyle == null) {
                divStrokeStyle = DivStrokeJsonParser.f57282b;
            }
            DivStrokeStyle divStrokeStyle2 = divStrokeStyle;
            TypeHelper<DivSizeUnit> typeHelper = DivStrokeJsonParser.f57285e;
            sn.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression2 = DivStrokeJsonParser.f57283c;
            Expression<DivSizeUnit> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Ne.f29954n1, typeHelper, lVar, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivStrokeJsonParser.f57286f;
            Expression<Double> expression3 = DivStrokeJsonParser.f57284d;
            Expression<Double> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "width", typeHelper2, lVar2, valueValidator, expression3);
            if (optionalExpression2 != null) {
                expression3 = optionalExpression2;
            }
            return new DivStroke(expression, divStrokeStyle2, expression2, expression3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivStroke divStroke) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divStroke.f57276a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "style", divStroke.f57277b, this.f57287a.I7());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Ne.f29954n1, divStroke.f57278c, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "width", divStroke.f57279d);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivStrokeJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57288a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57288a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStrokeTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivStrokeTemplate divStrokeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            c cVar;
            Field<DivStrokeStyleTemplate> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divStrokeTemplate != null ? divStrokeTemplate.f57314a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            if (divStrokeTemplate != null) {
                cVar = this;
                field = divStrokeTemplate.f57315b;
            } else {
                cVar = this;
                field = null;
            }
            return new DivStrokeTemplate((Field<Expression<Integer>>) fieldWithExpression, (Field<DivStrokeStyleTemplate>) JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "style", allowPropertyOverride, field, cVar.f57288a.J7()), (Field<Expression<DivSizeUnit>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Ne.f29954n1, DivStrokeJsonParser.f57285e, allowPropertyOverride, divStrokeTemplate != null ? divStrokeTemplate.f57316c : null, DivSizeUnit.FROM_STRING), (Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "width", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divStrokeTemplate != null ? divStrokeTemplate.f57317d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivStrokeJsonParser.f57286f));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivStrokeTemplate divStrokeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divStrokeTemplate.f57314a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "style", divStrokeTemplate.f57315b, this.f57288a.J7());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Ne.f29954n1, divStrokeTemplate.f57316c, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "width", divStrokeTemplate.f57317d);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivStrokeJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivStrokeTemplate, DivStroke> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57289a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57289a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStroke resolve(@NotNull ParsingContext parsingContext, @NotNull DivStrokeTemplate divStrokeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divStrokeTemplate.f57314a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivStrokeStyle divStrokeStyle = (DivStrokeStyle) JsonFieldResolver.resolveOptional(parsingContext, divStrokeTemplate.f57315b, jSONObject, "style", this.f57289a.K7(), this.f57289a.I7());
            if (divStrokeStyle == null) {
                divStrokeStyle = DivStrokeJsonParser.f57282b;
            }
            Field<Expression<DivSizeUnit>> field = divStrokeTemplate.f57316c;
            TypeHelper<DivSizeUnit> typeHelper = DivStrokeJsonParser.f57285e;
            sn.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivStrokeJsonParser.f57283c;
            Expression<DivSizeUnit> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, Ne.f29954n1, typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Double>> field2 = divStrokeTemplate.f57317d;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivStrokeJsonParser.f57286f;
            Expression<Double> expression2 = DivStrokeJsonParser.f57284d;
            Expression<Double> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "width", typeHelper2, lVar2, valueValidator, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            return new DivStroke(expressionResolveExpression, divStrokeStyle, expression, expression2);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        f57283c = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f57284d = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f57285e = TypeHelper.Companion.from(divSizeUnit, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivStrokeJsonParser$Companion$TYPE_HELPER_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f57286f = new ValueValidator() { // from class: ah.v9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivStrokeJsonParser.b(((Double) obj).doubleValue());
            }
        };
    }

    public static final boolean b(double d10) {
        return d10 >= 0.0d;
    }
}
