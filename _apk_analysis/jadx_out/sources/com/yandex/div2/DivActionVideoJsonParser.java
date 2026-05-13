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
import com.yandex.div2.DivActionVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionVideoJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivActionVideoJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54563a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivActionVideo.Action> f54564b = TypeHelper.Companion.from(cn.r.W(DivActionVideo.Action.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivActionVideoJsonParser$Companion$TYPE_HELPER_ACTION$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @NotNull
        public final Boolean invoke(@NotNull Object obj) {
            return Boolean.valueOf(obj instanceof DivActionVideo.Action);
        }
    });

    /* JADX INFO: compiled from: DivActionVideoJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionVideoJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54565a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54565a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionVideo deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivActionVideo(JsonExpressionParser.readExpression(parsingContext, jSONObject, "action", DivActionVideoJsonParser.f54564b, DivActionVideo.Action.FROM_STRING), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionVideo divActionVideo) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "action", divActionVideo.f54559a, DivActionVideo.Action.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionVideo.f54560b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionVideoJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54566a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54566a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionVideoTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionVideoTemplate divActionVideoTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivActionVideoTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "action", DivActionVideoJsonParser.f54564b, allowPropertyOverride, divActionVideoTemplate != null ? divActionVideoTemplate.f54570a : null, DivActionVideo.Action.FROM_STRING), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionVideoTemplate != null ? divActionVideoTemplate.f54571b : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionVideoTemplate divActionVideoTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "action", divActionVideoTemplate.f54570a, DivActionVideo.Action.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionVideoTemplate.f54571b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionVideoJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionVideoTemplate, DivActionVideo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54567a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54567a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionVideo resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionVideoTemplate divActionVideoTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivActionVideo(JsonFieldResolver.resolveExpression(parsingContext, divActionVideoTemplate.f54570a, jSONObject, "action", DivActionVideoJsonParser.f54564b, DivActionVideo.Action.FROM_STRING), JsonFieldResolver.resolveExpression(parsingContext, divActionVideoTemplate.f54571b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }
    }
}
