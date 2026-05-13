package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
import com.yandex.div2.p0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58939a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final String f58940b = "it";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivCollectionItemBuilder.Prototype> f58941c = new ListValidator() { // from class: ah.l2
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return com.yandex.div2.o0.b(list);
        }
    };

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
        public final JsonParserComponent f58942a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58942a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCollectionItemBuilder deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "data_element_name");
            if (str == null) {
                str = o0.f58940b;
            }
            return new DivCollectionItemBuilder(expression, str, JsonPropertyParser.readList(parsingContext, jSONObject, "prototypes", this.f58942a.g2(), o0.f58941c));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivCollectionItemBuilder divCollectionItemBuilder) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "data", divCollectionItemBuilder.f54767a);
            JsonPropertyParser.write(parsingContext, jSONObject, "data_element_name", divCollectionItemBuilder.f54768b);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "prototypes", divCollectionItemBuilder.f54769c, this.f58942a.g2());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58943a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58943a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCollectionItemBuilderTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY, allowPropertyOverride, divCollectionItemBuilderTemplate != null ? divCollectionItemBuilderTemplate.f54781a : null);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "data_element_name", allowPropertyOverride, divCollectionItemBuilderTemplate != null ? divCollectionItemBuilderTemplate.f54782b : null);
            Field<List<DivCollectionItemBuilderTemplate.PrototypeTemplate>> field = divCollectionItemBuilderTemplate != null ? divCollectionItemBuilderTemplate.f54783c : null;
            bn.g<p0.c> gVarH2 = this.f58943a.h2();
            ListValidator<DivCollectionItemBuilder.Prototype> listValidator = o0.f58941c;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivCollectionItemBuilderTemplate(fieldWithExpression, optionalField, JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "prototypes", allowPropertyOverride, field, gVarH2, listValidator));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "data", divCollectionItemBuilderTemplate.f54781a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "data_element_name", divCollectionItemBuilderTemplate.f54782b);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "prototypes", divCollectionItemBuilderTemplate.f54783c, this.f58943a.h2());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivCollectionItemBuilderTemplate, DivCollectionItemBuilder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58944a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58944a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCollectionItemBuilder resolve(@NotNull ParsingContext parsingContext, @NotNull DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divCollectionItemBuilderTemplate.f54781a, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divCollectionItemBuilderTemplate.f54782b, jSONObject, "data_element_name");
            if (str == null) {
                str = o0.f58940b;
            }
            return new DivCollectionItemBuilder(expressionResolveExpression, str, JsonFieldResolver.resolveList(parsingContext, divCollectionItemBuilderTemplate.f54783c, jSONObject, "prototypes", this.f58944a.i2(), this.f58944a.g2(), o0.f58941c));
        }
    }

    public static final boolean b(List list) {
        return list.size() >= 1;
    }
}
