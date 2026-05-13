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

/* JADX INFO: compiled from: DivPivotFixedTemplate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivPivotFixedTemplate implements JSONSerializable, JsonTemplate<DivPivotFixed> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f56545c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f56546d = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPivotFixedTemplate> f56547e = new sn.p<ParsingEnvironment, JSONObject, DivPivotFixedTemplate>() { // from class: com.yandex.div2.DivPivotFixedTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPivotFixedTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivPivotFixedTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivSizeUnit>> f56548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56549b;

    /* JADX INFO: compiled from: DivPivotFixedTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivPivotFixedTemplate(@NotNull Field<Expression<DivSizeUnit>> field, @NotNull Field<Expression<Long>> field2) {
        this.f56548a = field;
        this.f56549b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivPivotFixedTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivPivotFixedTemplate divPivotFixedTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivPivotFixedTemplate(ParsingEnvironment parsingEnvironment, DivPivotFixedTemplate divPivotFixedTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPivotFixedTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().R5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
