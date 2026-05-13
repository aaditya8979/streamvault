package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivActionScrollBy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollByTemplate.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivActionScrollByTemplate implements JSONSerializable, JsonTemplate<DivActionScrollBy> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f54346f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<DivActionScrollBy.Overflow> f54350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionScrollByTemplate> f54351k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f54352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivActionScrollBy.Overflow>> f54356e;

    /* JADX INFO: compiled from: DivActionScrollByTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54347g = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f54348h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54349i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54350j = Expression.Companion.constant$default(companion, DivActionScrollBy.Overflow.CLAMP, null, 2, null);
        f54351k = new sn.p<ParsingEnvironment, JSONObject, DivActionScrollByTemplate>() { // from class: com.yandex.div2.DivActionScrollByTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivActionScrollByTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivActionScrollByTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivActionScrollByTemplate(@NotNull Field<Expression<Boolean>> field, @NotNull Field<Expression<String>> field2, @NotNull Field<Expression<Long>> field3, @NotNull Field<Expression<Long>> field4, @NotNull Field<Expression<DivActionScrollBy.Overflow>> field5) {
        this.f54352a = field;
        this.f54353b = field2;
        this.f54354c = field3;
        this.f54355d = field4;
        this.f54356e = field5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionScrollByTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionScrollByTemplate divActionScrollByTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionScrollByTemplate(ParsingEnvironment parsingEnvironment, DivActionScrollByTemplate divActionScrollByTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionScrollByTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().B0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
