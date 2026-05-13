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
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivCollectionItemBuilderTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58959a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f58960b = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58961a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58961a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCollectionItemBuilder.Prototype deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            Div div = (Div) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.f58961a.M4());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = p0.f58960b;
            Expression<Boolean> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selector", typeHelper, lVar, expression);
            if (optionalExpression2 != null) {
                expression = optionalExpression2;
            }
            return new DivCollectionItemBuilder.Prototype(div, optionalExpression, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivCollectionItemBuilder.Prototype prototype) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "div", prototype.f54774a, this.f58961a.M4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", prototype.f54775b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selector", prototype.f54776c);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58962a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58962a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCollectionItemBuilderTemplate.PrototypeTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivCollectionItemBuilderTemplate.PrototypeTemplate prototypeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivCollectionItemBuilderTemplate.PrototypeTemplate(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, prototypeTemplate != null ? prototypeTemplate.f54787a : null, this.f58962a.N4()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, prototypeTemplate != null ? prototypeTemplate.f54788b : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "selector", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, prototypeTemplate != null ? prototypeTemplate.f54789c : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivCollectionItemBuilderTemplate.PrototypeTemplate prototypeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "div", prototypeTemplate.f54787a, this.f58962a.N4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", prototypeTemplate.f54788b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selector", prototypeTemplate.f54789c);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivCollectionItemBuilderTemplate.PrototypeTemplate, DivCollectionItemBuilder.Prototype> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58963a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58963a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCollectionItemBuilder.Prototype resolve(@NotNull ParsingContext parsingContext, @NotNull DivCollectionItemBuilderTemplate.PrototypeTemplate prototypeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Div div = (Div) JsonFieldResolver.resolve(parsingContext, prototypeTemplate.f54787a, jSONObject, "div", this.f58963a.O4(), this.f58963a.M4());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, prototypeTemplate.f54788b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Boolean>> field = prototypeTemplate.f54789c;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = p0.f58960b;
            Expression<Boolean> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "selector", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression2 != null) {
                expression = expressionResolveOptionalExpression2;
            }
            return new DivCollectionItemBuilder.Prototype(div, expressionResolveOptionalExpression, expression);
        }
    }
}
