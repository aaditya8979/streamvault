package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C3978d4;
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
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTooltipJsonParser;
import com.yandex.div2.DivTooltipMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivTooltipJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57996a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f57997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f57998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivTooltipMode.b f57999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivTooltip.Position> f58000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58001f;

    /* JADX INFO: compiled from: DivTooltipJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTooltipJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58002a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58002a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTooltip deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_in", this.f58002a.q1());
            DivAnimation divAnimation2 = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_out", this.f58002a.q1());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = DivTooltipJsonParser.f57997b;
            Expression<Boolean> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "close_by_tap_outside", typeHelper, lVar, expression);
            Expression<Boolean> expression2 = optionalExpression2 == null ? expression : optionalExpression2;
            Div div = (Div) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.f58002a.M4());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivTooltipJsonParser.f58001f;
            Expression<Long> expression3 = DivTooltipJsonParser.f57998c;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper2, lVar2, valueValidator, expression3);
            Expression<Long> expression4 = optionalExpression3 == null ? expression3 : optionalExpression3;
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            DivTooltipMode divTooltipMode = (DivTooltipMode) JsonPropertyParser.readOptional(parsingContext, jSONObject, C3978d4.a.f31224t, this.f58002a.S8());
            if (divTooltipMode == null) {
                divTooltipMode = DivTooltipJsonParser.f57999d;
            }
            return new DivTooltip(divAnimation, divAnimation2, optionalExpression, expression2, div, expression4, str, divTooltipMode, (DivPoint) JsonPropertyParser.readOptional(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, this.f58002a.Z5()), JsonExpressionParser.readExpression(parsingContext, jSONObject, C3978d4.i.L, DivTooltipJsonParser.f58000e, DivTooltip.Position.FROM_STRING), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tap_outside_actions", this.f58002a.u0()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTooltip divTooltip) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "animation_in", divTooltip.f57983a, this.f58002a.q1());
            JsonPropertyParser.write(parsingContext, jSONObject, "animation_out", divTooltip.f57984b, this.f58002a.q1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_accessibility_description", divTooltip.f57985c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "close_by_tap_outside", divTooltip.f57986d);
            JsonPropertyParser.write(parsingContext, jSONObject, "div", divTooltip.f57987e, this.f58002a.M4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divTooltip.f57988f);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divTooltip.f57989g);
            JsonPropertyParser.write(parsingContext, jSONObject, C3978d4.a.f31224t, divTooltip.f57990h, this.f58002a.S8());
            JsonPropertyParser.write(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, divTooltip.f57991i, this.f58002a.Z5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3978d4.i.L, divTooltip.f57992j, DivTooltip.Position.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tap_outside_actions", divTooltip.f57993k, this.f58002a.u0());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTooltipJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58003a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58003a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTooltipTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTooltipTemplate divTooltipTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTooltipTemplate(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_in", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f58029a : null, this.f58003a.r1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_out", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f58030b : null, this.f58003a.r1()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f58031c : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "close_by_tap_outside", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f58032d : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f58033e : null, this.f58003a.N4()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f58034f : null, ParsingConvertersKt.NUMBER_TO_INT, DivTooltipJsonParser.f58001f), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f58035g : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, C3978d4.a.f31224t, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f58036h : null, this.f58003a.T8()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f58037i : null, this.f58003a.a6()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3978d4.i.L, DivTooltipJsonParser.f58000e, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f58038j : null, DivTooltip.Position.FROM_STRING), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tap_outside_actions", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f58039k : null, this.f58003a.v0()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTooltipTemplate divTooltipTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "animation_in", divTooltipTemplate.f58029a, this.f58003a.r1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "animation_out", divTooltipTemplate.f58030b, this.f58003a.r1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_accessibility_description", divTooltipTemplate.f58031c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "close_by_tap_outside", divTooltipTemplate.f58032d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "div", divTooltipTemplate.f58033e, this.f58003a.N4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divTooltipTemplate.f58034f);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divTooltipTemplate.f58035g);
            JsonFieldParser.writeField(parsingContext, jSONObject, C3978d4.a.f31224t, divTooltipTemplate.f58036h, this.f58003a.T8());
            JsonFieldParser.writeField(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, divTooltipTemplate.f58037i, this.f58003a.a6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3978d4.i.L, divTooltipTemplate.f58038j, DivTooltip.Position.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tap_outside_actions", divTooltipTemplate.f58039k, this.f58003a.v0());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTooltipJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTooltipTemplate, DivTooltip> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58004a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58004a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTooltip resolve(@NotNull ParsingContext parsingContext, @NotNull DivTooltipTemplate divTooltipTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divTooltipTemplate.f58029a, jSONObject, "animation_in", this.f58004a.s1(), this.f58004a.q1());
            DivAnimation divAnimation2 = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divTooltipTemplate.f58030b, jSONObject, "animation_out", this.f58004a.s1(), this.f58004a.q1());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTooltipTemplate.f58031c, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Boolean>> field = divTooltipTemplate.f58032d;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = DivTooltipJsonParser.f57997b;
            Expression<Boolean> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "close_by_tap_outside", typeHelper, lVar, expression);
            Expression<Boolean> expression2 = expressionResolveOptionalExpression2 == null ? expression : expressionResolveOptionalExpression2;
            Div div = (Div) JsonFieldResolver.resolve(parsingContext, divTooltipTemplate.f58033e, jSONObject, "div", this.f58004a.O4(), this.f58004a.M4());
            Field<Expression<Long>> field2 = divTooltipTemplate.f58034f;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivTooltipJsonParser.f58001f;
            Expression<Long> expression3 = DivTooltipJsonParser.f57998c;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "duration", typeHelper2, lVar2, valueValidator, expression3);
            Expression<Long> expression4 = expressionResolveOptionalExpression3 == null ? expression3 : expressionResolveOptionalExpression3;
            String str = (String) JsonFieldResolver.resolve(parsingContext, divTooltipTemplate.f58035g, jSONObject, "id");
            DivTooltipMode divTooltipMode = (DivTooltipMode) JsonFieldResolver.resolveOptional(parsingContext, divTooltipTemplate.f58036h, jSONObject, C3978d4.a.f31224t, this.f58004a.U8(), this.f58004a.S8());
            if (divTooltipMode == null) {
                divTooltipMode = DivTooltipJsonParser.f57999d;
            }
            return new DivTooltip(divAnimation, divAnimation2, expressionResolveOptionalExpression, expression2, div, expression4, str, divTooltipMode, (DivPoint) JsonFieldResolver.resolveOptional(parsingContext, divTooltipTemplate.f58037i, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, this.f58004a.b6(), this.f58004a.Z5()), JsonFieldResolver.resolveExpression(parsingContext, divTooltipTemplate.f58038j, jSONObject, C3978d4.i.L, DivTooltipJsonParser.f58000e, DivTooltip.Position.FROM_STRING), JsonFieldResolver.resolveOptionalList(parsingContext, divTooltipTemplate.f58039k, jSONObject, "tap_outside_actions", this.f58004a.w0(), this.f58004a.u0()));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f57997b = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f57998c = Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        f57999d = new DivTooltipMode.b(new DivTooltipModeModal());
        f58000e = TypeHelper.Companion.from(cn.r.W(DivTooltip.Position.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTooltipJsonParser$Companion$TYPE_HELPER_POSITION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTooltip.Position);
            }
        });
        f58001f = new ValueValidator() { // from class: ah.lb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTooltipJsonParser.b(((Long) obj).longValue());
            }
        };
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
