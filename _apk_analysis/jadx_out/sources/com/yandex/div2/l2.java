package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivLinearGradientTemplate;
import com.yandex.div2.k2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58870a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f58871b = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58872c = new ValueValidator() { // from class: ah.k6
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.l2.d(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<Integer> f58873d = new ListValidator() { // from class: ah.l6
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return com.yandex.div2.l2.e(list);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivLinearGradient.ColorPoint> f58874e = new ListValidator() { // from class: ah.m6
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return com.yandex.div2.l2.f(list);
        }
    };

    /* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58875a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58875a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivLinearGradient deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = l2.f58872c;
            Expression<Long> expression = l2.f58871b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "angle", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivLinearGradient(expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "color_map", this.f58875a.S4(), l2.f58874e), JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, l2.f58873d));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivLinearGradient divLinearGradient) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "angle", divLinearGradient.f56183a);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "color_map", divLinearGradient.f56184b, this.f58875a.S4());
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, "colors", divLinearGradient.f56185c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gradient");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58876a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58876a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivLinearGradientTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivLinearGradientTemplate divLinearGradientTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            c cVar;
            Field<List<DivLinearGradientTemplate.ColorPointTemplate>> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "angle", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divLinearGradientTemplate != null ? divLinearGradientTemplate.f56195a : null, ParsingConvertersKt.NUMBER_TO_INT, l2.f58872c);
            if (divLinearGradientTemplate != null) {
                cVar = this;
                field = divLinearGradientTemplate.f56196b;
            } else {
                cVar = this;
                field = null;
            }
            bn.g<k2.c> gVarT4 = cVar.f58876a.T4();
            ListValidator<DivLinearGradient.ColorPoint> listValidator = l2.f58874e;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "color_map", allowPropertyOverride, field, gVarT4, listValidator);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<ExpressionList<Integer>> field2 = divLinearGradientTemplate != null ? divLinearGradientTemplate.f56197c : null;
            sn.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            ListValidator<Integer> listValidator2 = l2.f58873d;
            tn.p.i(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivLinearGradientTemplate(optionalFieldWithExpression, optionalListField, JsonFieldParser.readOptionalExpressionListField(parsingContextRestrictPropertyOverride, jSONObject, "colors", typeHelper, allowPropertyOverride, field2, lVar, listValidator2));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivLinearGradientTemplate divLinearGradientTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "angle", divLinearGradientTemplate.f56195a);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "color_map", divLinearGradientTemplate.f56196b, this.f58876a.T4());
            JsonFieldParser.writeExpressionListField(parsingContext, jSONObject, "colors", divLinearGradientTemplate.f56197c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gradient");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivLinearGradientTemplate, DivLinearGradient> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58877a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58877a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivLinearGradient resolve(@NotNull ParsingContext parsingContext, @NotNull DivLinearGradientTemplate divLinearGradientTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divLinearGradientTemplate.f56195a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = l2.f58872c;
            Expression<Long> expression = l2.f58871b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "angle", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivLinearGradient(expression, JsonFieldResolver.resolveOptionalList(parsingContext, divLinearGradientTemplate.f56196b, jSONObject, "color_map", this.f58877a.U4(), this.f58877a.S4(), l2.f58874e), JsonFieldResolver.resolveOptionalExpressionList(parsingContext, divLinearGradientTemplate.f56197c, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, l2.f58873d));
        }
    }

    public static final boolean d(long j10) {
        return j10 >= 0 && j10 <= 360;
    }

    public static final boolean e(List list) {
        return list.size() >= 2;
    }

    public static final boolean f(List list) {
        return list.size() >= 2;
    }
}
