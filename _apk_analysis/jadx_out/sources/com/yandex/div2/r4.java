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
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeBorderJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58992a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58993b = new ValueValidator() { // from class: ah.bb
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.r4.b(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58994a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58994a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeBorder deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivTextRangeBorder(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, r4.f58993b), (DivStroke) JsonPropertyParser.readOptional(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, this.f58994a.C7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeBorder divTextRangeBorder) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", divTextRangeBorder.f57775a);
            JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divTextRangeBorder.f57776b, this.f58994a.C7());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58995a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58995a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeBorderTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTextRangeBorderTemplate divTextRangeBorderTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTextRangeBorderTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divTextRangeBorderTemplate != null ? divTextRangeBorderTemplate.f57780a : null, ParsingConvertersKt.NUMBER_TO_INT, r4.f58993b), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, divTextRangeBorderTemplate != null ? divTextRangeBorderTemplate.f57781b : null, this.f58995a.D7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeBorderTemplate divTextRangeBorderTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", divTextRangeBorderTemplate.f57780a);
            JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divTextRangeBorderTemplate.f57781b, this.f58995a.D7());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextRangeBorderTemplate, DivTextRangeBorder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58996a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58996a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeBorder resolve(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeBorderTemplate divTextRangeBorderTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivTextRangeBorder(JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextRangeBorderTemplate.f57780a, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, r4.f58993b), (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divTextRangeBorderTemplate.f57781b, jSONObject, VastAttributes.STROKE_COLOR, this.f58996a.E7(), this.f58996a.C7()));
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
