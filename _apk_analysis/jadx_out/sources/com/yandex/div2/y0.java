package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f59062a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivFixedSize f59063b = new DivFixedSize(null, Expression.Companion.constant$default(Expression.Companion, 15L, null, 2, null), 1, null);

    /* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59064a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59064a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDefaultIndicatorItemPlacement deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "space_between_centers", this.f59064a.w3());
            if (divFixedSize == null) {
                divFixedSize = y0.f59063b;
            }
            return new DivDefaultIndicatorItemPlacement(divFixedSize);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivDefaultIndicatorItemPlacement divDefaultIndicatorItemPlacement) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "space_between_centers", divDefaultIndicatorItemPlacement.f55118a, this.f59064a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "default");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59065a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59065a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDefaultIndicatorItemPlacementTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivDefaultIndicatorItemPlacementTemplate(JsonFieldParser.readOptionalField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "space_between_centers", parsingContext.getAllowPropertyOverride(), divDefaultIndicatorItemPlacementTemplate != null ? divDefaultIndicatorItemPlacementTemplate.f55123a : null, this.f59065a.x3()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "space_between_centers", divDefaultIndicatorItemPlacementTemplate.f55123a, this.f59065a.x3());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "default");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivDefaultIndicatorItemPlacementTemplate, DivDefaultIndicatorItemPlacement> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59066a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59066a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDefaultIndicatorItemPlacement resolve(@NotNull ParsingContext parsingContext, @NotNull DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divDefaultIndicatorItemPlacementTemplate.f55123a, jSONObject, "space_between_centers", this.f59066a.y3(), this.f59066a.w3());
            if (divFixedSize == null) {
                divFixedSize = y0.f59063b;
            }
            return new DivDefaultIndicatorItemPlacement(divFixedSize);
        }
    }
}
