package com.yandex.div2;

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
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContainerTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivContainerJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58969a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f58970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f58971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f58972d;

    /* JADX INFO: compiled from: DivContainerJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivContainerJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58973a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58973a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivContainer.Separator deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f58973a.Y2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = q0.f58970b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_at_end", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            Expression<Boolean> expression2 = q0.f58971c;
            Expression<Boolean> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_at_start", typeHelper, lVar, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            Expression<Boolean> expression3 = q0.f58972d;
            Expression<Boolean> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_between", typeHelper, lVar, expression3);
            if (optionalExpression3 != null) {
                expression3 = optionalExpression3;
            }
            return new DivContainer.Separator(divEdgeInsets, expression, expression2, expression3, (DivDrawable) JsonPropertyParser.read(parsingContext, jSONObject, "style", this.f58973a.V2()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivContainer.Separator separator) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", separator.f54889a, this.f58973a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_at_end", separator.f54890b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_at_start", separator.f54891c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_between", separator.f54892d);
            JsonPropertyParser.write(parsingContext, jSONObject, "style", separator.f54893e, this.f58973a.V2());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivContainerJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58974a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58974a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivContainerTemplate.SeparatorTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivContainerTemplate.SeparatorTemplate separatorTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, separatorTemplate != null ? separatorTemplate.f54972a : null, this.f58974a.Z2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = separatorTemplate != null ? separatorTemplate.f54973b : null;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new DivContainerTemplate.SeparatorTemplate(optionalField, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "show_at_end", typeHelper, allowPropertyOverride, field, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "show_at_start", typeHelper, allowPropertyOverride, separatorTemplate != null ? separatorTemplate.f54974c : null, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "show_between", typeHelper, allowPropertyOverride, separatorTemplate != null ? separatorTemplate.f54975d : null, lVar), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "style", allowPropertyOverride, separatorTemplate != null ? separatorTemplate.f54976e : null, this.f58974a.W2()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivContainerTemplate.SeparatorTemplate separatorTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", separatorTemplate.f54972a, this.f58974a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_at_end", separatorTemplate.f54973b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_at_start", separatorTemplate.f54974c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_between", separatorTemplate.f54975d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "style", separatorTemplate.f54976e, this.f58974a.W2());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivContainerJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivContainerTemplate.SeparatorTemplate, DivContainer.Separator> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58975a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58975a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivContainer.Separator resolve(@NotNull ParsingContext parsingContext, @NotNull DivContainerTemplate.SeparatorTemplate separatorTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, separatorTemplate.f54972a, jSONObject, "margins", this.f58975a.a3(), this.f58975a.Y2());
            Field<Expression<Boolean>> field = separatorTemplate.f54973b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = q0.f58970b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "show_at_end", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Boolean>> field2 = separatorTemplate.f54974c;
            Expression<Boolean> expression2 = q0.f58971c;
            Expression<Boolean> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "show_at_start", typeHelper, lVar, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Boolean>> field3 = separatorTemplate.f54975d;
            Expression<Boolean> expression3 = q0.f58972d;
            Expression<Boolean> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "show_between", typeHelper, lVar, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            return new DivContainer.Separator(divEdgeInsets, expression, expression2, expression3, (DivDrawable) JsonFieldResolver.resolve(parsingContext, separatorTemplate.f54976e, jSONObject, "style", this.f58975a.X2(), this.f58975a.V2()));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Boolean bool = Boolean.FALSE;
        f58970b = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f58971c = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f58972d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
    }
}
