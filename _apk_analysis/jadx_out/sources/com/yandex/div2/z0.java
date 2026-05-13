package com.yandex.div2;

import android.net.Uri;
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

/* JADX INFO: compiled from: DivDisappearActionJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f59078a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f59079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f59080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f59081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f59082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f59083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f59084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f59085h;

    /* JADX INFO: compiled from: DivDisappearActionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivDisappearActionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59086a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59086a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDisappearAction deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = z0.f59083f;
            Expression<Long> expression = z0.f59079b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "disappear_duration", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonPropertyParser.readOptional(parsingContext, jSONObject, "download_callbacks", this.f59086a.S2());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = z0.f59080c;
            Expression<Boolean> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper2, lVar2, expression2);
            Expression<Boolean> expression3 = optionalExpression2 == null ? expression2 : optionalExpression2;
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            ValueValidator<Long> valueValidator2 = z0.f59084g;
            Expression<Long> expression5 = z0.f59081d;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "log_limit", typeHelper, lVar, valueValidator2, expression5);
            if (optionalExpression3 != null) {
                expression5 = optionalExpression3;
            }
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "payload");
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            sn.l<Object, Uri> lVar3 = ParsingConvertersKt.ANY_TO_URI;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "referer", typeHelper3, lVar3);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "scope_id");
            DivActionTyped divActionTyped = (DivActionTyped) JsonPropertyParser.readOptional(parsingContext, jSONObject, "typed", this.f59086a.h1());
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "url", typeHelper3, lVar3);
            ValueValidator<Long> valueValidator3 = z0.f59085h;
            Expression<Long> expression6 = z0.f59082e;
            Expression<Long> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility_percentage", typeHelper, lVar, valueValidator3, expression6);
            if (optionalExpression6 != null) {
                expression6 = optionalExpression6;
            }
            return new DivDisappearAction(expression, divDownloadCallbacks, expression3, expression4, expression5, jSONObject2, optionalExpression4, str, divActionTyped, optionalExpression5, expression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivDisappearAction divDisappearAction) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "disappear_duration", divDisappearAction.f55147a);
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", divDisappearAction.a(), this.f59086a.S2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divDisappearAction.isEnabled());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", divDisappearAction.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_limit", divDisappearAction.c());
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", divDisappearAction.getPayload());
            Expression<Uri> expressionF = divDisappearAction.f();
            sn.l<Uri, String> lVar = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", expressionF, lVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", divDisappearAction.e());
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", divDisappearAction.d(), this.f59086a.h1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divDisappearAction.getUrl(), lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility_percentage", divDisappearAction.f55157k);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivDisappearActionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59087a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59087a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDisappearActionTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivDisappearActionTemplate divDisappearActionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divDisappearActionTemplate != null ? divDisappearActionTemplate.f55165a : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "disappear_duration", typeHelper, allowPropertyOverride, field, lVar, z0.f59083f);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f55166b : null, this.f59087a.T2());
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f55167c : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f55168d : null);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_limit", typeHelper, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f55169e : null, lVar, z0.f59084g);
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f55170f : null);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Field<Expression<Uri>> field2 = divDisappearActionTemplate != null ? divDisappearActionTemplate.f55171g : null;
            sn.l<Object, Uri> lVar2 = ParsingConvertersKt.ANY_TO_URI;
            return new DivDisappearActionTemplate(optionalFieldWithExpression, optionalField, optionalFieldWithExpression2, fieldWithExpression, optionalFieldWithExpression3, optionalField2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "referer", typeHelper2, allowPropertyOverride, field2, lVar2), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f55172h : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f55173i : null, this.f59087a.i1()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", typeHelper2, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f55174j : null, lVar2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility_percentage", typeHelper, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f55175k : null, lVar, z0.f59085h));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivDisappearActionTemplate divDisappearActionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "disappear_duration", divDisappearActionTemplate.f55165a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", divDisappearActionTemplate.f55166b, this.f59087a.T2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divDisappearActionTemplate.f55167c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", divDisappearActionTemplate.f55168d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_limit", divDisappearActionTemplate.f55169e);
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", divDisappearActionTemplate.f55170f);
            Field<Expression<Uri>> field = divDisappearActionTemplate.f55171g;
            sn.l<Uri, String> lVar = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", field, lVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", divDisappearActionTemplate.f55172h);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", divDisappearActionTemplate.f55173i, this.f59087a.i1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divDisappearActionTemplate.f55174j, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility_percentage", divDisappearActionTemplate.f55175k);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivDisappearActionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivDisappearActionTemplate, DivDisappearAction> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59088a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59088a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDisappearAction resolve(@NotNull ParsingContext parsingContext, @NotNull DivDisappearActionTemplate divDisappearActionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divDisappearActionTemplate.f55165a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = z0.f59083f;
            Expression<Long> expression = z0.f59079b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "disappear_duration", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonFieldResolver.resolveOptional(parsingContext, divDisappearActionTemplate.f55166b, jSONObject, "download_callbacks", this.f59088a.U2(), this.f59088a.S2());
            Field<Expression<Boolean>> field2 = divDisappearActionTemplate.f55167c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = z0.f59080c;
            Expression<Boolean> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "is_enabled", typeHelper2, lVar2, expression2);
            Expression<Boolean> expression3 = expressionResolveOptionalExpression2 == null ? expression2 : expressionResolveOptionalExpression2;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divDisappearActionTemplate.f55168d, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Long>> field3 = divDisappearActionTemplate.f55169e;
            ValueValidator<Long> valueValidator2 = z0.f59084g;
            Expression<Long> expression4 = z0.f59081d;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "log_limit", typeHelper, lVar, valueValidator2, expression4);
            if (expressionResolveOptionalExpression3 != null) {
                expression4 = expressionResolveOptionalExpression3;
            }
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divDisappearActionTemplate.f55170f, jSONObject, "payload");
            Field<Expression<Uri>> field4 = divDisappearActionTemplate.f55171g;
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            sn.l<Object, Uri> lVar3 = ParsingConvertersKt.ANY_TO_URI;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "referer", typeHelper3, lVar3);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divDisappearActionTemplate.f55172h, jSONObject, "scope_id");
            DivActionTyped divActionTyped = (DivActionTyped) JsonFieldResolver.resolveOptional(parsingContext, divDisappearActionTemplate.f55173i, jSONObject, "typed", this.f59088a.j1(), this.f59088a.h1());
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divDisappearActionTemplate.f55174j, jSONObject, "url", typeHelper3, lVar3);
            Field<Expression<Long>> field5 = divDisappearActionTemplate.f55175k;
            ValueValidator<Long> valueValidator3 = z0.f59085h;
            Expression<Long> expression5 = z0.f59082e;
            Expression<Long> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "visibility_percentage", typeHelper, lVar, valueValidator3, expression5);
            return new DivDisappearAction(expression, divDownloadCallbacks, expression3, expressionResolveExpression, expression4, jSONObject2, expressionResolveOptionalExpression4, str, divActionTyped, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6 == null ? expression5 : expressionResolveOptionalExpression6);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f59079b = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f59080c = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f59081d = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f59082e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f59083f = new ValueValidator() { // from class: ah.g3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.z0.d(((Long) obj).longValue());
            }
        };
        f59084g = new ValueValidator() { // from class: ah.h3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.z0.e(((Long) obj).longValue());
            }
        };
        f59085h = new ValueValidator() { // from class: ah.i3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.z0.f(((Long) obj).longValue());
            }
        };
    }

    public static final boolean d(long j10) {
        return j10 >= 0;
    }

    public static final boolean e(long j10) {
        return j10 >= 0;
    }

    public static final boolean f(long j10) {
        return j10 >= 0 && j10 < 100;
    }
}
