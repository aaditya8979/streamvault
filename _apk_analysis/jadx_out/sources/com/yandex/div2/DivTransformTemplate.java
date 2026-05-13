package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivPivot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTransformTemplate.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivTransformTemplate implements JSONSerializable, JsonTemplate<DivTransform> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f58048d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final DivPivot.c f58049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final DivPivot.c f58050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTransformTemplate> f58051g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivPivotTemplate> f58052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivPivotTemplate> f58053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f58054c;

    /* JADX INFO: compiled from: DivTransformTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(50.0d);
        f58049e = new DivPivot.c(new DivPivotPercentage(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f58050f = new DivPivot.c(new DivPivotPercentage(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f58051g = new sn.p<ParsingEnvironment, JSONObject, DivTransformTemplate>() { // from class: com.yandex.div2.DivTransformTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTransformTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTransformTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivTransformTemplate(@NotNull Field<DivPivotTemplate> field, @NotNull Field<DivPivotTemplate> field2, @NotNull Field<Expression<Double>> field3) {
        this.f58052a = field;
        this.f58053b = field2;
        this.f58054c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTransformTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivTransformTemplate divTransformTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivTransformTemplate(ParsingEnvironment parsingEnvironment, DivTransformTemplate divTransformTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTransformTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().c9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
