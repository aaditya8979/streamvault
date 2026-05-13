package com.yandex.div2;

import androidx.appcompat.widget.ActivityChooserModel;
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

/* JADX INFO: compiled from: DivMatchParentSizeJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58893a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f58894b = new ValueValidator() { // from class: ah.n6
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.m2.b(((Double) obj).doubleValue());
        }
    };

    /* JADX INFO: compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58895a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58895a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivMatchParentSize deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivMatchParentSize((DivSizeUnitValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "max_size", this.f58895a.b7()), (DivSizeUnitValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "min_size", this.f58895a.b7()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ActivityChooserModel.ATTRIBUTE_WEIGHT, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, m2.f58894b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivMatchParentSize divMatchParentSize) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "max_size", divMatchParentSize.f56204a, this.f58895a.b7());
            JsonPropertyParser.write(parsingContext, jSONObject, "min_size", divMatchParentSize.f56205b, this.f58895a.b7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "match_parent");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ActivityChooserModel.ATTRIBUTE_WEIGHT, divMatchParentSize.f56206c);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58896a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58896a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivMatchParentSizeTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivMatchParentSizeTemplate divMatchParentSizeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivMatchParentSizeTemplate(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "max_size", allowPropertyOverride, divMatchParentSizeTemplate != null ? divMatchParentSizeTemplate.f56210a : null, this.f58896a.c7()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "min_size", allowPropertyOverride, divMatchParentSizeTemplate != null ? divMatchParentSizeTemplate.f56211b : null, this.f58896a.c7()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ActivityChooserModel.ATTRIBUTE_WEIGHT, TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divMatchParentSizeTemplate != null ? divMatchParentSizeTemplate.f56212c : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, m2.f58894b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivMatchParentSizeTemplate divMatchParentSizeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "max_size", divMatchParentSizeTemplate.f56210a, this.f58896a.c7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "min_size", divMatchParentSizeTemplate.f56211b, this.f58896a.c7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "match_parent");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ActivityChooserModel.ATTRIBUTE_WEIGHT, divMatchParentSizeTemplate.f56212c);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivMatchParentSizeTemplate, DivMatchParentSize> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58897a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58897a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivMatchParentSize resolve(@NotNull ParsingContext parsingContext, @NotNull DivMatchParentSizeTemplate divMatchParentSizeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivMatchParentSize((DivSizeUnitValue) JsonFieldResolver.resolveOptional(parsingContext, divMatchParentSizeTemplate.f56210a, jSONObject, "max_size", this.f58897a.d7(), this.f58897a.b7()), (DivSizeUnitValue) JsonFieldResolver.resolveOptional(parsingContext, divMatchParentSizeTemplate.f56211b, jSONObject, "min_size", this.f58897a.d7(), this.f58897a.b7()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divMatchParentSizeTemplate.f56212c, jSONObject, ActivityChooserModel.ATTRIBUTE_WEIGHT, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, m2.f58894b));
        }
    }

    public static final boolean b(double d10) {
        return d10 > 0.0d;
    }
}
