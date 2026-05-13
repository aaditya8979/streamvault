package com.yandex.div2;

import com.ironsource.C3978d4;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivAccessibility;
import io.bidmachine.unified.UnifiedMediationParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAccessibilityJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivAccessibilityJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54152a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAccessibility.Mode> f54153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f54154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivAccessibility.Type f54155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAccessibility.Mode> f54156e;

    /* JADX INFO: compiled from: DivAccessibilityJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivAccessibilityJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54157a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54157a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAccessibility deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, typeHelper);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint", typeHelper);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_checked", typeHelper2, lVar);
            TypeHelper<DivAccessibility.Mode> typeHelper3 = DivAccessibilityJsonParser.f54156e;
            sn.l<String, DivAccessibility.Mode> lVar2 = DivAccessibility.Mode.FROM_STRING;
            Expression<DivAccessibility.Mode> expression = DivAccessibilityJsonParser.f54153b;
            Expression<DivAccessibility.Mode> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3978d4.a.f31224t, typeHelper3, lVar2, expression);
            if (optionalExpression4 != null) {
                expression = optionalExpression4;
            }
            Expression<Boolean> expression2 = DivAccessibilityJsonParser.f54154c;
            Expression<Boolean> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "mute_after_action", typeHelper2, lVar, expression2);
            Expression<Boolean> expression3 = optionalExpression5 == null ? expression2 : optionalExpression5;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "state_description", typeHelper);
            DivAccessibility.Type type = (DivAccessibility.Type) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", DivAccessibility.Type.FROM_STRING);
            if (type == null) {
                type = DivAccessibilityJsonParser.f54155d;
            }
            return new DivAccessibility(optionalExpression, optionalExpression2, optionalExpression3, expression, expression3, optionalExpression6, type);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAccessibility divAccessibility) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, divAccessibility.f54142a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint", divAccessibility.f54143b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_checked", divAccessibility.f54144c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3978d4.a.f31224t, divAccessibility.f54145d, DivAccessibility.Mode.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "mute_after_action", divAccessibility.f54146e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "state_description", divAccessibility.f54147f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", divAccessibility.f54148g, (sn.l<DivAccessibility.Type, R>) DivAccessibility.Type.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivAccessibilityJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54158a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54158a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAccessibilityTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivAccessibilityTemplate divAccessibilityTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, typeHelper, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.f54165a : null);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint", typeHelper, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.f54166b : null);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = divAccessibilityTemplate != null ? divAccessibilityTemplate.f54167c : null;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new DivAccessibilityTemplate(optionalFieldWithExpression, optionalFieldWithExpression2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_checked", typeHelper2, allowPropertyOverride, field, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3978d4.a.f31224t, DivAccessibilityJsonParser.f54156e, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.f54168d : null, DivAccessibility.Mode.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "mute_after_action", typeHelper2, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.f54169e : null, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "state_description", typeHelper, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.f54170f : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "type", allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.f54171g : null, DivAccessibility.Type.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAccessibilityTemplate divAccessibilityTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, divAccessibilityTemplate.f54165a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint", divAccessibilityTemplate.f54166b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_checked", divAccessibilityTemplate.f54167c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3978d4.a.f31224t, divAccessibilityTemplate.f54168d, DivAccessibility.Mode.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "mute_after_action", divAccessibilityTemplate.f54169e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "state_description", divAccessibilityTemplate.f54170f);
            JsonFieldParser.writeField(parsingContext, jSONObject, "type", divAccessibilityTemplate.f54171g, DivAccessibility.Type.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivAccessibilityJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivAccessibilityTemplate, DivAccessibility> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54159a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54159a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAccessibility resolve(@NotNull ParsingContext parsingContext, @NotNull DivAccessibilityTemplate divAccessibilityTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<String>> field = divAccessibilityTemplate.f54165a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, typeHelper);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divAccessibilityTemplate.f54166b, jSONObject, "hint", typeHelper);
            Field<Expression<Boolean>> field2 = divAccessibilityTemplate.f54167c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "is_checked", typeHelper2, lVar);
            Field<Expression<DivAccessibility.Mode>> field3 = divAccessibilityTemplate.f54168d;
            TypeHelper<DivAccessibility.Mode> typeHelper3 = DivAccessibilityJsonParser.f54156e;
            sn.l<String, DivAccessibility.Mode> lVar2 = DivAccessibility.Mode.FROM_STRING;
            Expression<DivAccessibility.Mode> expression = DivAccessibilityJsonParser.f54153b;
            Expression<DivAccessibility.Mode> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, C3978d4.a.f31224t, typeHelper3, lVar2, expression);
            if (expressionResolveOptionalExpression4 != null) {
                expression = expressionResolveOptionalExpression4;
            }
            Field<Expression<Boolean>> field4 = divAccessibilityTemplate.f54169e;
            Expression<Boolean> expression2 = DivAccessibilityJsonParser.f54154c;
            Expression<Boolean> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "mute_after_action", typeHelper2, lVar, expression2);
            Expression<Boolean> expression3 = expressionResolveOptionalExpression5 == null ? expression2 : expressionResolveOptionalExpression5;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divAccessibilityTemplate.f54170f, jSONObject, "state_description", typeHelper);
            DivAccessibility.Type type = (DivAccessibility.Type) JsonFieldResolver.resolveOptional(parsingContext, divAccessibilityTemplate.f54171g, jSONObject, "type", DivAccessibility.Type.FROM_STRING);
            if (type == null) {
                type = DivAccessibilityJsonParser.f54155d;
            }
            return new DivAccessibility(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, expression, expression3, expressionResolveOptionalExpression6, type);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivAccessibility.Mode mode = DivAccessibility.Mode.DEFAULT;
        f54153b = Expression.Companion.constant$default(companion, mode, null, 2, null);
        f54154c = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f54155d = DivAccessibility.Type.AUTO;
        f54156e = TypeHelper.Companion.from(mode, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivAccessibilityJsonParser$Companion$TYPE_HELPER_MODE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAccessibility.Mode);
            }
        });
    }
}
