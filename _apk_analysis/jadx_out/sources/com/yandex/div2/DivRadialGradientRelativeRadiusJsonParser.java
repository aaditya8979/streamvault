package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivRadialGradientRelativeRadiusJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56633a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivRadialGradientRelativeRadius.Value> f56634b = TypeHelper.Companion.from(cn.r.W(DivRadialGradientRelativeRadius.Value.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadiusJsonParser$Companion$TYPE_HELPER_VALUE$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @NotNull
        public final Boolean invoke(@NotNull Object obj) {
            return Boolean.valueOf(obj instanceof DivRadialGradientRelativeRadius.Value);
        }
    });

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56635a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56635a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientRelativeRadius deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivRadialGradientRelativeRadius(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", DivRadialGradientRelativeRadiusJsonParser.f56634b, DivRadialGradientRelativeRadius.Value.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientRelativeRadius divRadialGradientRelativeRadius) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "relative");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divRadialGradientRelativeRadius.f56630a, DivRadialGradientRelativeRadius.Value.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56636a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56636a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientRelativeRadiusTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivRadialGradientRelativeRadiusTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", DivRadialGradientRelativeRadiusJsonParser.f56634b, parsingContext.getAllowPropertyOverride(), divRadialGradientRelativeRadiusTemplate != null ? divRadialGradientRelativeRadiusTemplate.f56640a : null, DivRadialGradientRelativeRadius.Value.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "relative");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divRadialGradientRelativeRadiusTemplate.f56640a, DivRadialGradientRelativeRadius.Value.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivRadialGradientRelativeRadiusTemplate, DivRadialGradientRelativeRadius> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56637a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56637a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientRelativeRadius resolve(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivRadialGradientRelativeRadius(JsonFieldResolver.resolveExpression(parsingContext, divRadialGradientRelativeRadiusTemplate.f56640a, jSONObject, "value", DivRadialGradientRelativeRadiusJsonParser.f56634b, DivRadialGradientRelativeRadius.Value.FROM_STRING));
        }
    }
}
