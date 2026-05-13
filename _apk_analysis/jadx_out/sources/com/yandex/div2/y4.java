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
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTimerJsonParser.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f59070a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f59071b = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f59072c = new ValueValidator() { // from class: ah.jb
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.y4.c(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f59073d = new ValueValidator() { // from class: ah.kb
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.y4.d(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivTimerJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTimerJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59074a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59074a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTimer deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = y4.f59072c;
            Expression<Long> expression = y4.f59071b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivTimer(expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.f59074a.u0()), (String) JsonPropertyParser.read(parsingContext, jSONObject, "id"), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tick_actions", this.f59074a.u0()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tick_interval", typeHelper, lVar, y4.f59073d), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "value_variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTimer divTimer) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divTimer.f57962a);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", divTimer.f57963b, this.f59074a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divTimer.f57964c);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tick_actions", divTimer.f57965d, this.f59074a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tick_interval", divTimer.f57966e);
            JsonPropertyParser.write(parsingContext, jSONObject, "value_variable", divTimer.f57967f);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTimerJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59075a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59075a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTimerTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTimerTemplate divTimerTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divTimerTemplate != null ? divTimerTemplate.f57972a : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivTimerTemplate((Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, y4.f59072c), (Field<List<DivActionTemplate>>) JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.f57973b : null, this.f59075a.v0()), (Field<String>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.f57974c : null), (Field<List<DivActionTemplate>>) JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tick_actions", allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.f57975d : null, this.f59075a.v0()), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tick_interval", typeHelper, allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.f57976e : null, lVar, y4.f59073d), (Field<String>) JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "value_variable", allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.f57977f : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTimerTemplate divTimerTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divTimerTemplate.f57972a);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", divTimerTemplate.f57973b, this.f59075a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divTimerTemplate.f57974c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tick_actions", divTimerTemplate.f57975d, this.f59075a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tick_interval", divTimerTemplate.f57976e);
            JsonFieldParser.writeField(parsingContext, jSONObject, "value_variable", divTimerTemplate.f57977f);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTimerJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTimerTemplate, DivTimer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59076a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59076a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTimer resolve(@NotNull ParsingContext parsingContext, @NotNull DivTimerTemplate divTimerTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divTimerTemplate.f57972a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = y4.f59072c;
            Expression<Long> expression = y4.f59071b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivTimer(expression, JsonFieldResolver.resolveOptionalList(parsingContext, divTimerTemplate.f57973b, jSONObject, "end_actions", this.f59076a.w0(), this.f59076a.u0()), (String) JsonFieldResolver.resolve(parsingContext, divTimerTemplate.f57974c, jSONObject, "id"), JsonFieldResolver.resolveOptionalList(parsingContext, divTimerTemplate.f57975d, jSONObject, "tick_actions", this.f59076a.w0(), this.f59076a.u0()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divTimerTemplate.f57976e, jSONObject, "tick_interval", typeHelper, lVar, y4.f59073d), (String) JsonFieldResolver.resolveOptional(parsingContext, divTimerTemplate.f57977f, jSONObject, "value_variable"));
        }
    }

    public static final boolean c(long j10) {
        return j10 >= 0;
    }

    public static final boolean d(long j10) {
        return j10 > 0;
    }
}
