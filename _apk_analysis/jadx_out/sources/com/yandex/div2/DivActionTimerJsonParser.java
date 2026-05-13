package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionTimer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTimerJsonParser.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivActionTimerJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54490a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivActionTimer.Action> f54491b = TypeHelper.Companion.from(cn.r.W(DivActionTimer.Action.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivActionTimerJsonParser$Companion$TYPE_HELPER_ACTION$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @NotNull
        public final Boolean invoke(@NotNull Object obj) {
            return Boolean.valueOf(obj instanceof DivActionTimer.Action);
        }
    });

    /* JADX INFO: compiled from: DivActionTimerJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionTimerJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54492a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54492a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionTimer deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivActionTimer(JsonExpressionParser.readExpression(parsingContext, jSONObject, "action", DivActionTimerJsonParser.f54491b, DivActionTimer.Action.FROM_STRING), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionTimer divActionTimer) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "action", divActionTimer.f54486a, DivActionTimer.Action.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionTimer.f54487b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "timer");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionTimerJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54493a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54493a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionTimerTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionTimerTemplate divActionTimerTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivActionTimerTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "action", DivActionTimerJsonParser.f54491b, allowPropertyOverride, divActionTimerTemplate != null ? divActionTimerTemplate.f54497a : null, DivActionTimer.Action.FROM_STRING), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionTimerTemplate != null ? divActionTimerTemplate.f54498b : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionTimerTemplate divActionTimerTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "action", divActionTimerTemplate.f54497a, DivActionTimer.Action.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionTimerTemplate.f54498b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "timer");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionTimerJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionTimerTemplate, DivActionTimer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54494a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54494a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionTimer resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionTimerTemplate divActionTimerTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivActionTimer(JsonFieldResolver.resolveExpression(parsingContext, divActionTimerTemplate.f54497a, jSONObject, "action", DivActionTimerJsonParser.f54491b, DivActionTimer.Action.FROM_STRING), JsonFieldResolver.resolveExpression(parsingContext, divActionTimerTemplate.f54498b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }
    }
}
