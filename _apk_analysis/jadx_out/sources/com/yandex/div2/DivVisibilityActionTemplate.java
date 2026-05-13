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

/* JADX INFO: compiled from: DivVisibilityActionTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivVisibilityActionTemplate implements JSONSerializable, JsonTemplate<DivVisibilityAction> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a f58251l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f58252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f58253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f58254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f58255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> f58256q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivDownloadCallbacksTemplate> f58257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f58258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f58259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f58260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<JSONObject> f58261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f58262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<String> f58263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<DivActionTypedTemplate> f58264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f58265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f58266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f58267k;

    /* JADX INFO: compiled from: DivVisibilityActionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f58252m = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f58253n = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f58254o = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f58255p = Expression.Companion.constant$default(companion, 50L, null, 2, null);
        f58256q = new sn.p<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate>() { // from class: com.yandex.div2.DivVisibilityActionTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivVisibilityActionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivVisibilityActionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivVisibilityActionTemplate(@NotNull Field<DivDownloadCallbacksTemplate> field, @NotNull Field<Expression<Boolean>> field2, @NotNull Field<Expression<String>> field3, @NotNull Field<Expression<Long>> field4, @NotNull Field<JSONObject> field5, @NotNull Field<Expression<Uri>> field6, @NotNull Field<String> field7, @NotNull Field<DivActionTypedTemplate> field8, @NotNull Field<Expression<Uri>> field9, @NotNull Field<Expression<Long>> field10, @NotNull Field<Expression<Long>> field11) {
        this.f58257a = field;
        this.f58258b = field2;
        this.f58259c = field3;
        this.f58260d = field4;
        this.f58261e = field5;
        this.f58262f = field6;
        this.f58263g = field7;
        this.f58264h = field8;
        this.f58265i = field9;
        this.f58266j = field10;
        this.f58267k = field11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivVisibilityActionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivVisibilityActionTemplate divVisibilityActionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivVisibilityActionTemplate(ParsingEnvironment parsingEnvironment, DivVisibilityActionTemplate divVisibilityActionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divVisibilityActionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().x9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
