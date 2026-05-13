package com.yandex.div2;

import androidx.constraintlayout.motion.widget.Key;
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
import com.yandex.div2.DivPivot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTransformJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58738a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivPivot.c f58739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivPivot.c f58740c;

    /* JADX INFO: compiled from: DivTransformJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTransformJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58741a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58741a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTransform deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivPivot divPivot = (DivPivot) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pivot_x", this.f58741a.T5());
            if (divPivot == null) {
                divPivot = c5.f58739b;
            }
            DivPivot divPivot2 = (DivPivot) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pivot_y", this.f58741a.T5());
            if (divPivot2 == null) {
                divPivot2 = c5.f58740c;
            }
            return new DivTransform(divPivot, divPivot2, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Key.ROTATION, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTransform divTransform) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "pivot_x", divTransform.f58044a, this.f58741a.T5());
            JsonPropertyParser.write(parsingContext, jSONObject, "pivot_y", divTransform.f58045b, this.f58741a.T5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Key.ROTATION, divTransform.f58046c);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTransformJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58742a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58742a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTransformTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTransformTemplate divTransformTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTransformTemplate(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "pivot_x", allowPropertyOverride, divTransformTemplate != null ? divTransformTemplate.f58052a : null, this.f58742a.U5()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "pivot_y", allowPropertyOverride, divTransformTemplate != null ? divTransformTemplate.f58053b : null, this.f58742a.U5()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Key.ROTATION, TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divTransformTemplate != null ? divTransformTemplate.f58054c : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTransformTemplate divTransformTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "pivot_x", divTransformTemplate.f58052a, this.f58742a.U5());
            JsonFieldParser.writeField(parsingContext, jSONObject, "pivot_y", divTransformTemplate.f58053b, this.f58742a.U5());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Key.ROTATION, divTransformTemplate.f58054c);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTransformJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTransformTemplate, DivTransform> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58743a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58743a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTransform resolve(@NotNull ParsingContext parsingContext, @NotNull DivTransformTemplate divTransformTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivPivot divPivot = (DivPivot) JsonFieldResolver.resolveOptional(parsingContext, divTransformTemplate.f58052a, jSONObject, "pivot_x", this.f58743a.V5(), this.f58743a.T5());
            if (divPivot == null) {
                divPivot = c5.f58739b;
            }
            DivPivot divPivot2 = (DivPivot) JsonFieldResolver.resolveOptional(parsingContext, divTransformTemplate.f58053b, jSONObject, "pivot_y", this.f58743a.V5(), this.f58743a.T5());
            if (divPivot2 == null) {
                divPivot2 = c5.f58740c;
            }
            return new DivTransform(divPivot, divPivot2, JsonFieldResolver.resolveOptionalExpression(parsingContext, divTransformTemplate.f58054c, jSONObject, Key.ROTATION, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(50.0d);
        f58739b = new DivPivot.c(new DivPivotPercentage(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f58740c = new DivPivot.c(new DivPivotPercentage(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
    }
}
