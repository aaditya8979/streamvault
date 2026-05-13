package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextTemplate;
import io.bidmachine.unified.UnifiedMediationParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58928a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivText.Image.Accessibility.Type f58929b = DivText.Image.Accessibility.Type.AUTO;

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58930a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58930a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText.Image.Accessibility deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, TypeHelpersKt.TYPE_HELPER_STRING);
            DivText.Image.Accessibility.Type type = (DivText.Image.Accessibility.Type) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", DivText.Image.Accessibility.Type.FROM_STRING);
            if (type == null) {
                type = n4.f58929b;
            }
            return new DivText.Image.Accessibility(optionalExpression, type);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivText.Image.Accessibility accessibility) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, accessibility.f57679a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", accessibility.f57680b, (sn.l<DivText.Image.Accessibility.Type, R>) DivText.Image.Accessibility.Type.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58931a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58931a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextTemplate.ImageTemplate.AccessibilityTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTextTemplate.ImageTemplate.AccessibilityTemplate accessibilityTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTextTemplate.ImageTemplate.AccessibilityTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, accessibilityTemplate != null ? accessibilityTemplate.f57931a : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "type", allowPropertyOverride, accessibilityTemplate != null ? accessibilityTemplate.f57932b : null, DivText.Image.Accessibility.Type.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextTemplate.ImageTemplate.AccessibilityTemplate accessibilityTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, accessibilityTemplate.f57931a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "type", accessibilityTemplate.f57932b, DivText.Image.Accessibility.Type.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextTemplate.ImageTemplate.AccessibilityTemplate, DivText.Image.Accessibility> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58932a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58932a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText.Image.Accessibility resolve(@NotNull ParsingContext parsingContext, @NotNull DivTextTemplate.ImageTemplate.AccessibilityTemplate accessibilityTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, accessibilityTemplate.f57931a, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, TypeHelpersKt.TYPE_HELPER_STRING);
            DivText.Image.Accessibility.Type type = (DivText.Image.Accessibility.Type) JsonFieldResolver.resolveOptional(parsingContext, accessibilityTemplate.f57932b, jSONObject, "type", DivText.Image.Accessibility.Type.FROM_STRING);
            if (type == null) {
                type = n4.f58929b;
            }
            return new DivText.Image.Accessibility(expressionResolveOptionalExpression, type);
        }
    }
}
