package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivCollectionItemBuilderTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCollectionItemBuilderTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivCollectionItemBuilderTemplate implements JSONSerializable, JsonTemplate<DivCollectionItemBuilder> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54778d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f54779e = "it";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivCollectionItemBuilderTemplate> f54780f = new sn.p<ParsingEnvironment, JSONObject, DivCollectionItemBuilderTemplate>() { // from class: com.yandex.div2.DivCollectionItemBuilderTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCollectionItemBuilderTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivCollectionItemBuilderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<JSONArray>> f54781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<String> f54782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<List<PrototypeTemplate>> f54783c;

    /* JADX INFO: compiled from: DivCollectionItemBuilderTemplate.kt */
    public static final class PrototypeTemplate implements JSONSerializable, JsonTemplate<DivCollectionItemBuilder.Prototype> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f54784d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final Expression<Boolean> f54785e = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, PrototypeTemplate> f54786f = new sn.p<ParsingEnvironment, JSONObject, PrototypeTemplate>() { // from class: com.yandex.div2.DivCollectionItemBuilderTemplate$PrototypeTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivCollectionItemBuilderTemplate.PrototypeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivCollectionItemBuilderTemplate.PrototypeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<DivTemplate> f54787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f54788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<Expression<Boolean>> f54789c;

        /* JADX INFO: compiled from: DivCollectionItemBuilderTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public PrototypeTemplate(@NotNull Field<DivTemplate> field, @NotNull Field<Expression<String>> field2, @NotNull Field<Expression<Boolean>> field3) {
            this.f54787a = field;
            this.f54788b = field2;
            this.f54789c = field3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PrototypeTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable PrototypeTemplate prototypeTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ PrototypeTemplate(ParsingEnvironment parsingEnvironment, PrototypeTemplate prototypeTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : prototypeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().h2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilderTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivCollectionItemBuilderTemplate(@NotNull Field<Expression<JSONArray>> field, @NotNull Field<String> field2, @NotNull Field<List<PrototypeTemplate>> field3) {
        this.f54781a = field;
        this.f54782b = field2;
        this.f54783c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivCollectionItemBuilderTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivCollectionItemBuilderTemplate(ParsingEnvironment parsingEnvironment, DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divCollectionItemBuilderTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
