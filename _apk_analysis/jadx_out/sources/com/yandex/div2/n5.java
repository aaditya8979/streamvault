package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: IndexDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58933a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58934b = new ValueValidator() { // from class: ah.kc
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.n5.b(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: IndexDestinationJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: IndexDestinationJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58935a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58935a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndexDestination deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new IndexDestination(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, n5.f58934b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull IndexDestination indexDestination) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "index");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", indexDestination.f58286a);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: IndexDestinationJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58936a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58936a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndexDestinationTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable IndexDestinationTemplate indexDestinationTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new IndexDestinationTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), indexDestinationTemplate != null ? indexDestinationTemplate.f58290a : null, ParsingConvertersKt.NUMBER_TO_INT, n5.f58934b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull IndexDestinationTemplate indexDestinationTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "index");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", indexDestinationTemplate.f58290a);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: IndexDestinationJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, IndexDestinationTemplate, IndexDestination> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58937a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58937a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndexDestination resolve(@NotNull ParsingContext parsingContext, @NotNull IndexDestinationTemplate indexDestinationTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new IndexDestination(JsonFieldResolver.resolveExpression(parsingContext, indexDestinationTemplate.f58290a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, n5.f58934b));
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
