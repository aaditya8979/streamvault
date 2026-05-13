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

/* JADX INFO: compiled from: DivBlurJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58778a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58779b = new ValueValidator() { // from class: ah.f2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.g0.b(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivBlurJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivBlurJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58780a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58780a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivBlur deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivBlur(JsonExpressionParser.readExpression(parsingContext, jSONObject, "radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, g0.f58779b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivBlur divBlur) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "radius", divBlur.f54674a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "blur");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivBlurJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58781a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58781a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivBlurTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivBlurTemplate divBlurTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivBlurTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "radius", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), divBlurTemplate != null ? divBlurTemplate.f54678a : null, ParsingConvertersKt.NUMBER_TO_INT, g0.f58779b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivBlurTemplate divBlurTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "radius", divBlurTemplate.f54678a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "blur");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivBlurJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivBlurTemplate, DivBlur> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58782a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58782a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivBlur resolve(@NotNull ParsingContext parsingContext, @NotNull DivBlurTemplate divBlurTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivBlur(JsonFieldResolver.resolveExpression(parsingContext, divBlurTemplate.f54678a, jSONObject, "radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, g0.f58779b));
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
