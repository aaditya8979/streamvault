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
import com.yandex.div2.DivActionAnimatorStartJsonParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionAnimatorStartJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionAnimatorStartJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54205a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAnimationDirection> f54206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAnimationInterpolator> f54207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f54208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f54209e;

    /* JADX INFO: compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54210a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54210a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionAnimatorStart deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "animator_id");
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", DivActionAnimatorStartJsonParser.f54206b, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivActionAnimatorStart(str, optionalExpression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, lVar, DivActionAnimatorStartJsonParser.f54208d), (DivTypedValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "end_value", this.f54210a.h9()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", DivActionAnimatorStartJsonParser.f54207c, DivAnimationInterpolator.FROM_STRING), (DivCount) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", this.f54210a.v2()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, lVar, DivActionAnimatorStartJsonParser.f54209e), (DivTypedValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "start_value", this.f54210a.h9()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionAnimatorStart divActionAnimatorStart) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "animator_id", divActionAnimatorStart.f54196a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "direction", divActionAnimatorStart.f54197b, DivAnimationDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divActionAnimatorStart.f54198c);
            JsonPropertyParser.write(parsingContext, jSONObject, "end_value", divActionAnimatorStart.f54199d, this.f54210a.h9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divActionAnimatorStart.f54200e, DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", divActionAnimatorStart.f54201f, this.f54210a.v2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divActionAnimatorStart.f54202g);
            JsonPropertyParser.write(parsingContext, jSONObject, "start_value", divActionAnimatorStart.f54203h, this.f54210a.h9());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_start");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54211a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54211a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionAnimatorStartTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionAnimatorStartTemplate divActionAnimatorStartTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field field = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "animator_id", allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f54215a : null);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "direction", DivActionAnimatorStartJsonParser.f54206b, allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f54216b : null, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f54217c : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivActionAnimatorStartTemplate(field, optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field2, lVar, DivActionAnimatorStartJsonParser.f54208d), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "end_value", allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f54218d : null, this.f54211a.i9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivActionAnimatorStartJsonParser.f54207c, allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f54219e : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f54220f : null, this.f54211a.w2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f54221g : null, lVar, DivActionAnimatorStartJsonParser.f54209e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "start_value", allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f54222h : null, this.f54211a.i9()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionAnimatorStartTemplate divActionAnimatorStartTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "animator_id", divActionAnimatorStartTemplate.f54215a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "direction", divActionAnimatorStartTemplate.f54216b, DivAnimationDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divActionAnimatorStartTemplate.f54217c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "end_value", divActionAnimatorStartTemplate.f54218d, this.f54211a.i9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divActionAnimatorStartTemplate.f54219e, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", divActionAnimatorStartTemplate.f54220f, this.f54211a.w2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divActionAnimatorStartTemplate.f54221g);
            JsonFieldParser.writeField(parsingContext, jSONObject, "start_value", divActionAnimatorStartTemplate.f54222h, this.f54211a.i9());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_start");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionAnimatorStartTemplate, DivActionAnimatorStart> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54212a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54212a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionAnimatorStart resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionAnimatorStartTemplate divActionAnimatorStartTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            String str = (String) JsonFieldResolver.resolve(parsingContext, divActionAnimatorStartTemplate.f54215a, jSONObject, "animator_id");
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionAnimatorStartTemplate.f54216b, jSONObject, "direction", DivActionAnimatorStartJsonParser.f54206b, DivAnimationDirection.FROM_STRING);
            Field<Expression<Long>> field = divActionAnimatorStartTemplate.f54217c;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivActionAnimatorStart(str, expressionResolveOptionalExpression, JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, lVar, DivActionAnimatorStartJsonParser.f54208d), (DivTypedValue) JsonFieldResolver.resolveOptional(parsingContext, divActionAnimatorStartTemplate.f54218d, jSONObject, "end_value", this.f54212a.j9(), this.f54212a.h9()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionAnimatorStartTemplate.f54219e, jSONObject, "interpolator", DivActionAnimatorStartJsonParser.f54207c, DivAnimationInterpolator.FROM_STRING), (DivCount) JsonFieldResolver.resolveOptional(parsingContext, divActionAnimatorStartTemplate.f54220f, jSONObject, "repeat_count", this.f54212a.x2(), this.f54212a.v2()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionAnimatorStartTemplate.f54221g, jSONObject, "start_delay", typeHelper, lVar, DivActionAnimatorStartJsonParser.f54209e), (DivTypedValue) JsonFieldResolver.resolveOptional(parsingContext, divActionAnimatorStartTemplate.f54222h, jSONObject, "start_value", this.f54212a.j9(), this.f54212a.h9()));
        }
    }

    static {
        TypeHelper.Companion companion = TypeHelper.Companion;
        f54206b = companion.from(cn.r.W(DivAnimationDirection.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivActionAnimatorStartJsonParser$Companion$TYPE_HELPER_DIRECTION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationDirection);
            }
        });
        f54207c = companion.from(cn.r.W(DivAnimationInterpolator.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivActionAnimatorStartJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f54208d = new ValueValidator() { // from class: ah.i0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivActionAnimatorStartJsonParser.c(((Long) obj).longValue());
            }
        };
        f54209e = new ValueValidator() { // from class: ah.j0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivActionAnimatorStartJsonParser.d(((Long) obj).longValue());
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
