package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCircleShapeJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58887a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivFixedSize f58888b = new DivFixedSize(null, Expression.Companion.constant$default(Expression.Companion, 10L, null, 2, null), 1, null);

    /* JADX INFO: compiled from: DivCircleShapeJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivCircleShapeJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58889a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58889a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCircleShape deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "radius", this.f58889a.w3());
            if (divFixedSize == null) {
                divFixedSize = m0.f58888b;
            }
            return new DivCircleShape(optionalExpression, divFixedSize, (DivStroke) JsonPropertyParser.readOptional(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, this.f58889a.C7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivCircleShape divCircleShape) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_color", divCircleShape.f54743a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "radius", divCircleShape.f54744b, this.f58889a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divCircleShape.f54745c, this.f58889a.C7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "circle");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivCircleShapeJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58890a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58890a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCircleShapeTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivCircleShapeTemplate divCircleShapeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivCircleShapeTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divCircleShapeTemplate != null ? divCircleShapeTemplate.f54750a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "radius", allowPropertyOverride, divCircleShapeTemplate != null ? divCircleShapeTemplate.f54751b : null, this.f58890a.x3()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, divCircleShapeTemplate != null ? divCircleShapeTemplate.f54752c : null, this.f58890a.D7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivCircleShapeTemplate divCircleShapeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_color", divCircleShapeTemplate.f54750a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "radius", divCircleShapeTemplate.f54751b, this.f58890a.x3());
            JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divCircleShapeTemplate.f54752c, this.f58890a.D7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "circle");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivCircleShapeJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivCircleShapeTemplate, DivCircleShape> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58891a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58891a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCircleShape resolve(@NotNull ParsingContext parsingContext, @NotNull DivCircleShapeTemplate divCircleShapeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCircleShapeTemplate.f54750a, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divCircleShapeTemplate.f54751b, jSONObject, "radius", this.f58891a.y3(), this.f58891a.w3());
            if (divFixedSize == null) {
                divFixedSize = m0.f58888b;
            }
            return new DivCircleShape(expressionResolveOptionalExpression, divFixedSize, (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divCircleShapeTemplate.f54752c, jSONObject, VastAttributes.STROKE_COLOR, this.f58891a.E7(), this.f58891a.C7()));
        }
    }
}
