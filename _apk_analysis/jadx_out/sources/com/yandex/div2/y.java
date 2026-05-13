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

/* JADX INFO: compiled from: DivAppearanceSetTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f59057a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivAppearanceTransition> f59058b = new ListValidator() { // from class: ah.c2
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return com.yandex.div2.y.b(list);
        }
    };

    /* JADX INFO: compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59059a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59059a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAppearanceSetTransition deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivAppearanceSetTransition(JsonPropertyParser.readList(parsingContext, jSONObject, "items", this.f59059a.z1(), y.f59058b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAppearanceSetTransition divAppearanceSetTransition) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divAppearanceSetTransition.f54630a, this.f59059a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59060a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59060a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAppearanceSetTransitionTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<List<DivAppearanceTransitionTemplate>> field = divAppearanceSetTransitionTemplate != null ? divAppearanceSetTransitionTemplate.f54635a : null;
            bn.g<a0> gVarA1 = this.f59060a.A1();
            ListValidator<DivAppearanceTransition> listValidator = y.f59058b;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivAppearanceSetTransitionTemplate(JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, field, gVarA1, listValidator));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divAppearanceSetTransitionTemplate.f54635a, this.f59060a.A1());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivAppearanceSetTransitionTemplate, DivAppearanceSetTransition> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59061a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59061a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAppearanceSetTransition resolve(@NotNull ParsingContext parsingContext, @NotNull DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivAppearanceSetTransition(JsonFieldResolver.resolveList(parsingContext, divAppearanceSetTransitionTemplate.f54635a, jSONObject, "items", this.f59061a.B1(), this.f59061a.z1(), y.f59058b));
        }
    }

    public static final boolean b(List list) {
        return list.size() >= 1;
    }
}
