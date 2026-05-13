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
import com.yandex.div2.DivCount;
import com.yandex.div2.DivNumberAnimatorJsonParser;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNumberAnimatorJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivNumberAnimatorJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56247a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAnimationDirection> f56248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAnimationInterpolator> f56249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivCount.b f56250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f56251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAnimationDirection> f56252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f56253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56255i;

    /* JADX INFO: compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56256a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56256a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivNumberAnimator deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "cancel_actions", this.f56256a.u0());
            TypeHelper<DivAnimationDirection> typeHelper = DivNumberAnimatorJsonParser.f56252f;
            sn.l<String, DivAnimationDirection> lVar = DivAnimationDirection.FROM_STRING;
            Expression<DivAnimationDirection> expression = DivNumberAnimatorJsonParser.f56248b;
            Expression<DivAnimationDirection> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", typeHelper, lVar, expression);
            Expression<DivAnimationDirection> expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression3 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "duration", typeHelper2, lVar2, DivNumberAnimatorJsonParser.f56254h);
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.f56256a.u0());
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "end_value", typeHelper3, lVar3);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            TypeHelper<DivAnimationInterpolator> typeHelper4 = DivNumberAnimatorJsonParser.f56253g;
            sn.l<String, DivAnimationInterpolator> lVar4 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression5 = DivNumberAnimatorJsonParser.f56249c;
            Expression<DivAnimationInterpolator> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper4, lVar4, expression5);
            if (optionalExpression2 != null) {
                expression5 = optionalExpression2;
            }
            DivCount divCount = (DivCount) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", this.f56256a.v2());
            if (divCount == null) {
                divCount = DivNumberAnimatorJsonParser.f56250d;
            }
            DivCount divCount2 = divCount;
            ValueValidator<Long> valueValidator = DivNumberAnimatorJsonParser.f56255i;
            Expression<Long> expression6 = DivNumberAnimatorJsonParser.f56251e;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, lVar2, valueValidator, expression6);
            if (optionalExpression3 != null) {
                expression6 = optionalExpression3;
            }
            return new DivNumberAnimator(optionalList, expression2, expression3, optionalList2, expression4, str, expression5, divCount2, expression6, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper3, lVar3), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable_name"));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivNumberAnimator divNumberAnimator) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "cancel_actions", divNumberAnimator.a(), this.f56256a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "direction", divNumberAnimator.getDirection(), DivAnimationDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divNumberAnimator.getDuration());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", divNumberAnimator.d(), this.f56256a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", divNumberAnimator.f56239e);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divNumberAnimator.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divNumberAnimator.c(), DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", divNumberAnimator.b(), this.f56256a.v2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divNumberAnimator.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", divNumberAnimator.f56244j);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "number_animator");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable_name", divNumberAnimator.g());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56257a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56257a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivNumberAnimatorTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivNumberAnimatorTemplate divNumberAnimatorTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "cancel_actions", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f56265a : null, this.f56257a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "direction", DivNumberAnimatorJsonParser.f56252f, allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f56266b : null, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f56267c : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, DivNumberAnimatorJsonParser.f56254h);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f56268d : null, this.f56257a.v0());
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field2 = divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f56269e : null;
            sn.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivNumberAnimatorTemplate(optionalListField, optionalFieldWithExpression, fieldWithExpression, optionalListField2, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field2, lVar2), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f56270f : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivNumberAnimatorJsonParser.f56253g, allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f56271g : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f56272h : null, this.f56257a.w2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f56273i : null, lVar, DivNumberAnimatorJsonParser.f56255i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f56274j : null, lVar2), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f56275k : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivNumberAnimatorTemplate divNumberAnimatorTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "cancel_actions", divNumberAnimatorTemplate.f56265a, this.f56257a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "direction", divNumberAnimatorTemplate.f56266b, DivAnimationDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divNumberAnimatorTemplate.f56267c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", divNumberAnimatorTemplate.f56268d, this.f56257a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", divNumberAnimatorTemplate.f56269e);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divNumberAnimatorTemplate.f56270f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divNumberAnimatorTemplate.f56271g, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", divNumberAnimatorTemplate.f56272h, this.f56257a.w2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divNumberAnimatorTemplate.f56273i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", divNumberAnimatorTemplate.f56274j);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "number_animator");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable_name", divNumberAnimatorTemplate.f56275k);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivNumberAnimatorTemplate, DivNumberAnimator> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56258a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56258a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivNumberAnimator resolve(@NotNull ParsingContext parsingContext, @NotNull DivNumberAnimatorTemplate divNumberAnimatorTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divNumberAnimatorTemplate.f56265a, jSONObject, "cancel_actions", this.f56258a.w0(), this.f56258a.u0());
            Field<Expression<DivAnimationDirection>> field = divNumberAnimatorTemplate.f56266b;
            TypeHelper<DivAnimationDirection> typeHelper = DivNumberAnimatorJsonParser.f56252f;
            sn.l<String, DivAnimationDirection> lVar = DivAnimationDirection.FROM_STRING;
            Expression<DivAnimationDirection> expression = DivNumberAnimatorJsonParser.f56248b;
            Expression<DivAnimationDirection> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "direction", typeHelper, lVar, expression);
            Expression<DivAnimationDirection> expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Field<Expression<Long>> field2 = divNumberAnimatorTemplate.f56267c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, "duration", typeHelper2, lVar2, DivNumberAnimatorJsonParser.f56254h);
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divNumberAnimatorTemplate.f56268d, jSONObject, "end_actions", this.f56258a.w0(), this.f56258a.u0());
            Field<Expression<Double>> field3 = divNumberAnimatorTemplate.f56269e;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expressionResolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, field3, jSONObject, "end_value", typeHelper3, lVar3);
            String str = (String) JsonFieldResolver.resolve(parsingContext, divNumberAnimatorTemplate.f56270f, jSONObject, "id");
            Field<Expression<DivAnimationInterpolator>> field4 = divNumberAnimatorTemplate.f56271g;
            TypeHelper<DivAnimationInterpolator> typeHelper4 = DivNumberAnimatorJsonParser.f56253g;
            sn.l<String, DivAnimationInterpolator> lVar4 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = DivNumberAnimatorJsonParser.f56249c;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "interpolator", typeHelper4, lVar4, expression3);
            if (expressionResolveOptionalExpression2 != null) {
                expression3 = expressionResolveOptionalExpression2;
            }
            DivCount divCount = (DivCount) JsonFieldResolver.resolveOptional(parsingContext, divNumberAnimatorTemplate.f56272h, jSONObject, "repeat_count", this.f56258a.x2(), this.f56258a.v2());
            if (divCount == null) {
                divCount = DivNumberAnimatorJsonParser.f56250d;
            }
            DivCount divCount2 = divCount;
            Field<Expression<Long>> field5 = divNumberAnimatorTemplate.f56273i;
            ValueValidator<Long> valueValidator = DivNumberAnimatorJsonParser.f56255i;
            Expression<Long> expression4 = DivNumberAnimatorJsonParser.f56251e;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "start_delay", typeHelper2, lVar2, valueValidator, expression4);
            if (expressionResolveOptionalExpression3 != null) {
                expression4 = expressionResolveOptionalExpression3;
            }
            return new DivNumberAnimator(listResolveOptionalList, expression2, expressionResolveExpression, listResolveOptionalList2, expressionResolveExpression2, str, expression3, divCount2, expression4, JsonFieldResolver.resolveOptionalExpression(parsingContext, divNumberAnimatorTemplate.f56274j, jSONObject, "start_value", typeHelper3, lVar3), (String) JsonFieldResolver.resolve(parsingContext, divNumberAnimatorTemplate.f56275k, jSONObject, "variable_name"));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivAnimationDirection divAnimationDirection = DivAnimationDirection.NORMAL;
        f56248b = Expression.Companion.constant$default(companion, divAnimationDirection, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
        f56249c = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        f56250d = new DivCount.b(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f56251e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f56252f = companion2.from(divAnimationDirection, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivNumberAnimatorJsonParser$Companion$TYPE_HELPER_DIRECTION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationDirection);
            }
        });
        f56253g = companion2.from(divAnimationInterpolator, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivNumberAnimatorJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f56254h = new ValueValidator() { // from class: ah.u6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivNumberAnimatorJsonParser.c(((Long) obj).longValue());
            }
        };
        f56255i = new ValueValidator() { // from class: ah.v6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivNumberAnimatorJsonParser.d(((Long) obj).longValue());
            }
        };
    }

    public static final boolean c(long j10) {
        return j10 >= 0;
    }

    public static final boolean d(long j10) {
        return j10 >= 0;
    }
}
