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

/* JADX INFO: compiled from: DivEdgeInsetsTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivEdgeInsetsTemplate implements JSONSerializable, JsonTemplate<DivEdgeInsets> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f55223h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f55228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> f55229n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivSizeUnit>> f55236g;

    /* JADX INFO: compiled from: DivEdgeInsetsTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f55224i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55225j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55226k = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55227l = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55228m = Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        f55229n = new sn.p<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate>() { // from class: com.yandex.div2.DivEdgeInsetsTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivEdgeInsetsTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivEdgeInsetsTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivEdgeInsetsTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<Expression<Long>> field2, @NotNull Field<Expression<Long>> field3, @NotNull Field<Expression<Long>> field4, @NotNull Field<Expression<Long>> field5, @NotNull Field<Expression<Long>> field6, @NotNull Field<Expression<DivSizeUnit>> field7) {
        this.f55230a = field;
        this.f55231b = field2;
        this.f55232c = field3;
        this.f55233d = field4;
        this.f55234e = field5;
        this.f55235f = field6;
        this.f55236g = field7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivEdgeInsetsTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivEdgeInsetsTemplate divEdgeInsetsTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivEdgeInsetsTemplate(ParsingEnvironment parsingEnvironment, DivEdgeInsetsTemplate divEdgeInsetsTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divEdgeInsetsTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Z2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
