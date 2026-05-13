package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeSetTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58819a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivChangeTransition> f58820b = new ListValidator() { // from class: ah.j2
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return com.yandex.div2.i0.b(list);
        }
    };

    /* JADX INFO: compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58821a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58821a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivChangeSetTransition deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivChangeSetTransition(JsonPropertyParser.readList(parsingContext, jSONObject, "items", this.f58821a.U1(), i0.f58820b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivChangeSetTransition divChangeSetTransition) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divChangeSetTransition.f54725a, this.f58821a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58822a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58822a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivChangeSetTransitionTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivChangeSetTransitionTemplate divChangeSetTransitionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<List<DivChangeTransitionTemplate>> field = divChangeSetTransitionTemplate != null ? divChangeSetTransitionTemplate.f54730a : null;
            bn.g<k0> gVarV1 = this.f58822a.V1();
            ListValidator<DivChangeTransition> listValidator = i0.f58820b;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivChangeSetTransitionTemplate(JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, field, gVarV1, listValidator));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivChangeSetTransitionTemplate divChangeSetTransitionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divChangeSetTransitionTemplate.f54730a, this.f58822a.V1());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivChangeSetTransitionTemplate, DivChangeSetTransition> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58823a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58823a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivChangeSetTransition resolve(@NotNull ParsingContext parsingContext, @NotNull DivChangeSetTransitionTemplate divChangeSetTransitionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivChangeSetTransition(JsonFieldResolver.resolveList(parsingContext, divChangeSetTransitionTemplate.f54730a, jSONObject, "items", this.f58823a.W1(), this.f58823a.U1(), i0.f58820b));
        }
    }

    public static final boolean b(List list) {
        return list.size() >= 1;
    }
}
