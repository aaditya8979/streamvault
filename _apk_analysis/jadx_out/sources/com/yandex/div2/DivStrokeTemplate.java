package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivStrokeStyle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivStrokeTemplate implements JSONSerializable, JsonTemplate<DivStroke> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f57309e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final DivStrokeStyle.c f57310f = new DivStrokeStyle.c(new DivStrokeStyleSolid());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f57311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f57312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivStrokeTemplate> f57313i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f57314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivStrokeStyleTemplate> f57315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivSizeUnit>> f57316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f57317d;

    /* JADX INFO: compiled from: DivStrokeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f57311g = Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        f57312h = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f57313i = new sn.p<ParsingEnvironment, JSONObject, DivStrokeTemplate>() { // from class: com.yandex.div2.DivStrokeTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivStrokeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivStrokeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivStrokeTemplate(@NotNull Field<Expression<Integer>> field, @NotNull Field<DivStrokeStyleTemplate> field2, @NotNull Field<Expression<DivSizeUnit>> field3, @NotNull Field<Expression<Double>> field4) {
        this.f57314a = field;
        this.f57315b = field2;
        this.f57316c = field3;
        this.f57317d = field4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivStrokeTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivStrokeTemplate divStrokeTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Integer>>) companion.nullField(false), (Field<DivStrokeStyleTemplate>) companion.nullField(false), (Field<Expression<DivSizeUnit>>) companion.nullField(false), (Field<Expression<Double>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivStrokeTemplate(ParsingEnvironment parsingEnvironment, DivStrokeTemplate divStrokeTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divStrokeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().D7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
