package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskSolidTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivTextRangeMaskSolidTemplate implements JSONSerializable, JsonTemplate<DivTextRangeMaskSolid> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f57843c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57844d = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskSolidTemplate> f57845e = new sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskSolidTemplate>() { // from class: com.yandex.div2.DivTextRangeMaskSolidTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeMaskSolidTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivTextRangeMaskSolidTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f57846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57847b;

    /* JADX INFO: compiled from: DivTextRangeMaskSolidTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivTextRangeMaskSolidTemplate(@NotNull Field<Expression<Integer>> field, @NotNull Field<Expression<Boolean>> field2) {
        this.f57846a = field;
        this.f57847b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTextRangeMaskSolidTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivTextRangeMaskSolidTemplate divTextRangeMaskSolidTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivTextRangeMaskSolidTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeMaskSolidTemplate divTextRangeMaskSolidTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTextRangeMaskSolidTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().K8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
