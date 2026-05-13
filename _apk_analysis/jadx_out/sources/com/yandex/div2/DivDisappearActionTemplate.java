package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDisappearActionTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivDisappearActionTemplate implements JSONSerializable, JsonTemplate<DivDisappearAction> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a f55159l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivDisappearActionTemplate> f55164q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivDownloadCallbacksTemplate> f55166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f55167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f55168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<JSONObject> f55170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f55171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<String> f55172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<DivActionTypedTemplate> f55173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f55174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55175k;

    /* JADX INFO: compiled from: DivDisappearActionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f55160m = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f55161n = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f55162o = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f55163p = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55164q = new sn.p<ParsingEnvironment, JSONObject, DivDisappearActionTemplate>() { // from class: com.yandex.div2.DivDisappearActionTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivDisappearActionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivDisappearActionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivDisappearActionTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<DivDownloadCallbacksTemplate> field2, @NotNull Field<Expression<Boolean>> field3, @NotNull Field<Expression<String>> field4, @NotNull Field<Expression<Long>> field5, @NotNull Field<JSONObject> field6, @NotNull Field<Expression<Uri>> field7, @NotNull Field<String> field8, @NotNull Field<DivActionTypedTemplate> field9, @NotNull Field<Expression<Uri>> field10, @NotNull Field<Expression<Long>> field11) {
        this.f55165a = field;
        this.f55166b = field2;
        this.f55167c = field3;
        this.f55168d = field4;
        this.f55169e = field5;
        this.f55170f = field6;
        this.f55171g = field7;
        this.f55172h = field8;
        this.f55173i = field9;
        this.f55174j = field10;
        this.f55175k = field11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivDisappearActionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivDisappearActionTemplate divDisappearActionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivDisappearActionTemplate(ParsingEnvironment parsingEnvironment, DivDisappearActionTemplate divDisappearActionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divDisappearActionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Q2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
