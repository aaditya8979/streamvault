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
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivTabsTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58794a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivFixedSize f58795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivFixedSize f58796c;

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58797a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58797a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabs.TabTitleDelimiter deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f58797a.w3());
            if (divFixedSize == null) {
                divFixedSize = g4.f58795b;
            }
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivFixedSize divFixedSize2 = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f58797a.w3());
            if (divFixedSize2 == null) {
                divFixedSize2 = g4.f58796c;
            }
            return new DivTabs.TabTitleDelimiter(divFixedSize, expression, divFixedSize2);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTabs.TabTitleDelimiter tabTitleDelimiter) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "height", tabTitleDelimiter.f57429a, this.f58797a.w3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "image_url", tabTitleDelimiter.f57430b, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", tabTitleDelimiter.f57431c, this.f58797a.w3());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58798a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58798a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabsTemplate.TabTitleDelimiterTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTabsTemplate.TabTitleDelimiterTemplate tabTitleDelimiterTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTabsTemplate.TabTitleDelimiterTemplate(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, tabTitleDelimiterTemplate != null ? tabTitleDelimiterTemplate.f57550a : null, this.f58798a.x3()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, tabTitleDelimiterTemplate != null ? tabTitleDelimiterTemplate.f57551b : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, tabTitleDelimiterTemplate != null ? tabTitleDelimiterTemplate.f57552c : null, this.f58798a.x3()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTabsTemplate.TabTitleDelimiterTemplate tabTitleDelimiterTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", tabTitleDelimiterTemplate.f57550a, this.f58798a.x3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "image_url", tabTitleDelimiterTemplate.f57551b, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", tabTitleDelimiterTemplate.f57552c, this.f58798a.x3());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTabsTemplate.TabTitleDelimiterTemplate, DivTabs.TabTitleDelimiter> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58799a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58799a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabs.TabTitleDelimiter resolve(@NotNull ParsingContext parsingContext, @NotNull DivTabsTemplate.TabTitleDelimiterTemplate tabTitleDelimiterTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, tabTitleDelimiterTemplate.f57550a, jSONObject, "height", this.f58799a.y3(), this.f58799a.w3());
            if (divFixedSize == null) {
                divFixedSize = g4.f58795b;
            }
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, tabTitleDelimiterTemplate.f57551b, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivFixedSize divFixedSize2 = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, tabTitleDelimiterTemplate.f57552c, jSONObject, "width", this.f58799a.y3(), this.f58799a.w3());
            if (divFixedSize2 == null) {
                divFixedSize2 = g4.f58796c;
            }
            return new DivTabs.TabTitleDelimiter(divFixedSize, expressionResolveExpression, divFixedSize2);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f58795b = new DivFixedSize(null, Expression.Companion.constant$default(companion, 12L, null, 2, null), 1, null);
        f58796c = new DivFixedSize(null, Expression.Companion.constant$default(companion, 12L, null, 2, null), 1, null);
    }
}
