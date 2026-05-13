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

/* JADX INFO: compiled from: DivShadowTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivShadowTemplate implements JSONSerializable, JsonTemplate<DivShadow> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f56917e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f56918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f56919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Integer> f56920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivShadowTemplate> f56921i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f56924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<DivPointTemplate> f56925d;

    /* JADX INFO: compiled from: DivShadowTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56918f = Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        f56919g = Expression.Companion.constant$default(companion, 2L, null, 2, null);
        f56920h = Expression.Companion.constant$default(companion, 0, null, 2, null);
        f56921i = new sn.p<ParsingEnvironment, JSONObject, DivShadowTemplate>() { // from class: com.yandex.div2.DivShadowTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivShadowTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivShadowTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivShadowTemplate(@NotNull Field<Expression<Double>> field, @NotNull Field<Expression<Long>> field2, @NotNull Field<Expression<Integer>> field3, @NotNull Field<DivPointTemplate> field4) {
        this.f56922a = field;
        this.f56923b = field2;
        this.f56924c = field3;
        this.f56925d = field4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivShadowTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivShadowTemplate divShadowTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Integer>>) companion.nullField(false), (Field<DivPointTemplate>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivShadowTemplate(ParsingEnvironment parsingEnvironment, DivShadowTemplate divShadowTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divShadowTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Q6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
