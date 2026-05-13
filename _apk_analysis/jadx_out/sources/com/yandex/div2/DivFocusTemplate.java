package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFocusTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivFocusTemplate implements JSONSerializable, JsonTemplate<DivFocus> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f55363f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFocusTemplate> f55364g = new sn.p<ParsingEnvironment, JSONObject, DivFocusTemplate>() { // from class: com.yandex.div2.DivFocusTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFocusTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivFocusTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f55365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivBorderTemplate> f55366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<NextFocusIdsTemplate> f55367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55369e;

    /* JADX INFO: compiled from: DivFocusTemplate.kt */
    public static final class NextFocusIdsTemplate implements JSONSerializable, JsonTemplate<DivFocus.NextFocusIds> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final a f55370f = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, NextFocusIdsTemplate> f55371g = new sn.p<ParsingEnvironment, JSONObject, NextFocusIdsTemplate>() { // from class: com.yandex.div2.DivFocusTemplate$NextFocusIdsTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivFocusTemplate.NextFocusIdsTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivFocusTemplate.NextFocusIdsTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f55372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f55373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f55374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f55375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Field<Expression<String>> f55376e;

        /* JADX INFO: compiled from: DivFocusTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public NextFocusIdsTemplate(@NotNull Field<Expression<String>> field, @NotNull Field<Expression<String>> field2, @NotNull Field<Expression<String>> field3, @NotNull Field<Expression<String>> field4, @NotNull Field<Expression<String>> field5) {
            this.f55372a = field;
            this.f55373b = field2;
            this.f55374c = field3;
            this.f55375d = field4;
            this.f55376e = field5;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public NextFocusIdsTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable NextFocusIdsTemplate nextFocusIdsTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ NextFocusIdsTemplate(ParsingEnvironment parsingEnvironment, NextFocusIdsTemplate nextFocusIdsTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : nextFocusIdsTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().D3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivFocusTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivFocusTemplate(@NotNull Field<List<DivBackgroundTemplate>> field, @NotNull Field<DivBorderTemplate> field2, @NotNull Field<NextFocusIdsTemplate> field3, @NotNull Field<List<DivActionTemplate>> field4, @NotNull Field<List<DivActionTemplate>> field5) {
        this.f55365a = field;
        this.f55366b = field2;
        this.f55367c = field3;
        this.f55368d = field4;
        this.f55369e = field5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivFocusTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivFocusTemplate divFocusTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivFocusTemplate(ParsingEnvironment parsingEnvironment, DivFocusTemplate divFocusTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFocusTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
