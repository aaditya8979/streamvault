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

/* JADX INFO: compiled from: DivAbsoluteEdgeInsetsTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivAbsoluteEdgeInsetsTemplate implements JSONSerializable, JsonTemplate<DivAbsoluteEdgeInsets> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54127e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivAbsoluteEdgeInsetsTemplate> f54132j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54136d;

    /* JADX INFO: compiled from: DivAbsoluteEdgeInsetsTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54128f = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54129g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54130h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54131i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54132j = new sn.p<ParsingEnvironment, JSONObject, DivAbsoluteEdgeInsetsTemplate>() { // from class: com.yandex.div2.DivAbsoluteEdgeInsetsTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAbsoluteEdgeInsetsTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivAbsoluteEdgeInsetsTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivAbsoluteEdgeInsetsTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<Expression<Long>> field2, @NotNull Field<Expression<Long>> field3, @NotNull Field<Expression<Long>> field4) {
        this.f54133a = field;
        this.f54134b = field2;
        this.f54135c = field3;
        this.f54136d = field4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivAbsoluteEdgeInsetsTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivAbsoluteEdgeInsetsTemplate(ParsingEnvironment parsingEnvironment, DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divAbsoluteEdgeInsetsTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().F().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
