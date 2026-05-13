package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivPatch;
import com.yandex.div2.DivPatchTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPatchTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivPatchTemplate implements JSONSerializable, JsonTemplate<DivPatch> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f56503e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Expression<DivPatch.Mode> f56504f = Expression.Companion.constant$default(Expression.Companion, DivPatch.Mode.PARTIAL, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPatchTemplate> f56505g = new sn.p<ParsingEnvironment, JSONObject, DivPatchTemplate>() { // from class: com.yandex.div2.DivPatchTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPatchTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivPatchTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<List<ChangeTemplate>> f56506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivPatch.Mode>> f56507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f56508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f56509d;

    /* JADX INFO: compiled from: DivPatchTemplate.kt */
    public static final class ChangeTemplate implements JSONSerializable, JsonTemplate<DivPatch.Change> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f56510c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, ChangeTemplate> f56511d = new sn.p<ParsingEnvironment, JSONObject, ChangeTemplate>() { // from class: com.yandex.div2.DivPatchTemplate$ChangeTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPatchTemplate.ChangeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivPatchTemplate.ChangeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Field<String> f56512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Field<List<DivTemplate>> f56513b;

        /* JADX INFO: compiled from: DivPatchTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public ChangeTemplate(@NotNull Field<String> field, @NotNull Field<List<DivTemplate>> field2) {
            this.f56512a = field;
            this.f56513b = field2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ChangeTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable ChangeTemplate changeTemplate, boolean z10, @NotNull JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        public /* synthetic */ ChangeTemplate(ParsingEnvironment parsingEnvironment, ChangeTemplate changeTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : changeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().G5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivPatchTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivPatchTemplate(@NotNull Field<List<ChangeTemplate>> field, @NotNull Field<Expression<DivPatch.Mode>> field2, @NotNull Field<List<DivActionTemplate>> field3, @NotNull Field<List<DivActionTemplate>> field4) {
        this.f56506a = field;
        this.f56507b = field2;
        this.f56508c = field3;
        this.f56509d = field4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivPatchTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivPatchTemplate divPatchTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<List<ChangeTemplate>>) companion.nullField(false), (Field<Expression<DivPatch.Mode>>) companion.nullField(false), (Field<List<DivActionTemplate>>) companion.nullField(false), (Field<List<DivActionTemplate>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivPatchTemplate(ParsingEnvironment parsingEnvironment, DivPatchTemplate divPatchTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPatchTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
