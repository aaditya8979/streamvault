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
import com.yandex.div2.DivColorAnimatorJsonParser;
import com.yandex.div2.DivCount;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivColorAnimatorJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivColorAnimatorJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54808a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAnimationDirection> f54809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAnimationInterpolator> f54810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivCount.b f54811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f54812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAnimationDirection> f54813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f54814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f54815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f54816i;

    /* JADX INFO: compiled from: DivColorAnimatorJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivColorAnimatorJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54817a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54817a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivColorAnimator deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "cancel_actions", this.f54817a.u0());
            TypeHelper<DivAnimationDirection> typeHelper = DivColorAnimatorJsonParser.f54813f;
            sn.l<String, DivAnimationDirection> lVar = DivAnimationDirection.FROM_STRING;
            Expression<DivAnimationDirection> expression = DivColorAnimatorJsonParser.f54809b;
            Expression<DivAnimationDirection> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", typeHelper, lVar, expression);
            Expression<DivAnimationDirection> expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression3 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "duration", typeHelper2, lVar2, DivColorAnimatorJsonParser.f54815h);
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.f54817a.u0());
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "end_value", typeHelper3, lVar3);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            TypeHelper<DivAnimationInterpolator> typeHelper4 = DivColorAnimatorJsonParser.f54814g;
            sn.l<String, DivAnimationInterpolator> lVar4 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression5 = DivColorAnimatorJsonParser.f54810c;
            Expression<DivAnimationInterpolator> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper4, lVar4, expression5);
            if (optionalExpression2 != null) {
                expression5 = optionalExpression2;
            }
            DivCount divCount = (DivCount) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", this.f54817a.v2());
            if (divCount == null) {
                divCount = DivColorAnimatorJsonParser.f54811d;
            }
            DivCount divCount2 = divCount;
            ValueValidator<Long> valueValidator = DivColorAnimatorJsonParser.f54816i;
            Expression<Long> expression6 = DivColorAnimatorJsonParser.f54812e;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, lVar2, valueValidator, expression6);
            if (optionalExpression3 != null) {
                expression6 = optionalExpression3;
            }
            return new DivColorAnimator(optionalList, expression2, expression3, optionalList2, expression4, str, expression5, divCount2, expression6, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper3, lVar3), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable_name"));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivColorAnimator divColorAnimator) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "cancel_actions", divColorAnimator.a(), this.f54817a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "direction", divColorAnimator.getDirection(), DivAnimationDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divColorAnimator.getDuration());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", divColorAnimator.d(), this.f54817a.u0());
            Expression<Integer> expression = divColorAnimator.f54800e;
            sn.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", expression, lVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divColorAnimator.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divColorAnimator.c(), DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", divColorAnimator.b(), this.f54817a.v2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divColorAnimator.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", divColorAnimator.f54805j, lVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "color_animator");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable_name", divColorAnimator.g());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivColorAnimatorJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54818a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54818a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivColorAnimatorTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivColorAnimatorTemplate divColorAnimatorTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "cancel_actions", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f54826a : null, this.f54818a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "direction", DivColorAnimatorJsonParser.f54813f, allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f54827b : null, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f54828c : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, DivColorAnimatorJsonParser.f54815h);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f54829d : null, this.f54818a.v0());
            TypeHelper<Integer> typeHelper2 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field2 = divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f54830e : null;
            sn.l<Object, Integer> lVar2 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            return new DivColorAnimatorTemplate(optionalListField, optionalFieldWithExpression, fieldWithExpression, optionalListField2, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field2, lVar2), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f54831f : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivColorAnimatorJsonParser.f54814g, allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f54832g : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f54833h : null, this.f54818a.w2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f54834i : null, lVar, DivColorAnimatorJsonParser.f54816i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f54835j : null, lVar2), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f54836k : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivColorAnimatorTemplate divColorAnimatorTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "cancel_actions", divColorAnimatorTemplate.f54826a, this.f54818a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "direction", divColorAnimatorTemplate.f54827b, DivAnimationDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divColorAnimatorTemplate.f54828c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", divColorAnimatorTemplate.f54829d, this.f54818a.v0());
            Field<Expression<Integer>> field = divColorAnimatorTemplate.f54830e;
            sn.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", field, lVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divColorAnimatorTemplate.f54831f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divColorAnimatorTemplate.f54832g, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", divColorAnimatorTemplate.f54833h, this.f54818a.w2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divColorAnimatorTemplate.f54834i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", divColorAnimatorTemplate.f54835j, lVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "color_animator");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable_name", divColorAnimatorTemplate.f54836k);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivColorAnimatorJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivColorAnimatorTemplate, DivColorAnimator> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54819a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54819a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivColorAnimator resolve(@NotNull ParsingContext parsingContext, @NotNull DivColorAnimatorTemplate divColorAnimatorTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divColorAnimatorTemplate.f54826a, jSONObject, "cancel_actions", this.f54819a.w0(), this.f54819a.u0());
            Field<Expression<DivAnimationDirection>> field = divColorAnimatorTemplate.f54827b;
            TypeHelper<DivAnimationDirection> typeHelper = DivColorAnimatorJsonParser.f54813f;
            sn.l<String, DivAnimationDirection> lVar = DivAnimationDirection.FROM_STRING;
            Expression<DivAnimationDirection> expression = DivColorAnimatorJsonParser.f54809b;
            Expression<DivAnimationDirection> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "direction", typeHelper, lVar, expression);
            Expression<DivAnimationDirection> expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Field<Expression<Long>> field2 = divColorAnimatorTemplate.f54828c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, "duration", typeHelper2, lVar2, DivColorAnimatorJsonParser.f54815h);
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divColorAnimatorTemplate.f54829d, jSONObject, "end_actions", this.f54819a.w0(), this.f54819a.u0());
            Field<Expression<Integer>> field3 = divColorAnimatorTemplate.f54830e;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expressionResolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, field3, jSONObject, "end_value", typeHelper3, lVar3);
            String str = (String) JsonFieldResolver.resolve(parsingContext, divColorAnimatorTemplate.f54831f, jSONObject, "id");
            Field<Expression<DivAnimationInterpolator>> field4 = divColorAnimatorTemplate.f54832g;
            TypeHelper<DivAnimationInterpolator> typeHelper4 = DivColorAnimatorJsonParser.f54814g;
            sn.l<String, DivAnimationInterpolator> lVar4 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = DivColorAnimatorJsonParser.f54810c;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "interpolator", typeHelper4, lVar4, expression3);
            if (expressionResolveOptionalExpression2 != null) {
                expression3 = expressionResolveOptionalExpression2;
            }
            DivCount divCount = (DivCount) JsonFieldResolver.resolveOptional(parsingContext, divColorAnimatorTemplate.f54833h, jSONObject, "repeat_count", this.f54819a.x2(), this.f54819a.v2());
            if (divCount == null) {
                divCount = DivColorAnimatorJsonParser.f54811d;
            }
            DivCount divCount2 = divCount;
            Field<Expression<Long>> field5 = divColorAnimatorTemplate.f54834i;
            ValueValidator<Long> valueValidator = DivColorAnimatorJsonParser.f54816i;
            Expression<Long> expression4 = DivColorAnimatorJsonParser.f54812e;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "start_delay", typeHelper2, lVar2, valueValidator, expression4);
            if (expressionResolveOptionalExpression3 != null) {
                expression4 = expressionResolveOptionalExpression3;
            }
            return new DivColorAnimator(listResolveOptionalList, expression2, expressionResolveExpression, listResolveOptionalList2, expressionResolveExpression2, str, expression3, divCount2, expression4, JsonFieldResolver.resolveOptionalExpression(parsingContext, divColorAnimatorTemplate.f54835j, jSONObject, "start_value", typeHelper3, lVar3), (String) JsonFieldResolver.resolve(parsingContext, divColorAnimatorTemplate.f54836k, jSONObject, "variable_name"));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivAnimationDirection divAnimationDirection = DivAnimationDirection.NORMAL;
        f54809b = Expression.Companion.constant$default(companion, divAnimationDirection, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
        f54810c = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        f54811d = new DivCount.b(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f54812e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f54813f = companion2.from(divAnimationDirection, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivColorAnimatorJsonParser$Companion$TYPE_HELPER_DIRECTION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationDirection);
            }
        });
        f54814g = companion2.from(divAnimationInterpolator, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivColorAnimatorJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f54815h = new ValueValidator() { // from class: ah.m2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivColorAnimatorJsonParser.c(((Long) obj).longValue());
            }
        };
        f54816i = new ValueValidator() { // from class: ah.n2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivColorAnimatorJsonParser.d(((Long) obj).longValue());
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
