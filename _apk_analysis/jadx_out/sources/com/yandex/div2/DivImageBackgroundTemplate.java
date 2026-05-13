package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivImageBackgroundTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivImageBackgroundTemplate implements JSONSerializable, JsonTemplate<DivImageBackground> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f55752h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f55753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f55754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentVertical> f55755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<DivImageScale> f55757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivImageBackgroundTemplate> f55758n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f55759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f55760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f55761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFilterTemplate>> f55762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f55763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f55764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivImageScale>> f55765g;

    /* JADX INFO: compiled from: DivImageBackgroundTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f55753i = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f55754j = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        f55755k = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f55756l = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f55757m = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        f55758n = new sn.p<ParsingEnvironment, JSONObject, DivImageBackgroundTemplate>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivImageBackgroundTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivImageBackgroundTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivImageBackgroundTemplate(@NotNull Field<Expression<Double>> field, @NotNull Field<Expression<DivAlignmentHorizontal>> field2, @NotNull Field<Expression<DivAlignmentVertical>> field3, @NotNull Field<List<DivFilterTemplate>> field4, @NotNull Field<Expression<Uri>> field5, @NotNull Field<Expression<Boolean>> field6, @NotNull Field<Expression<DivImageScale>> field7) {
        this.f55759a = field;
        this.f55760b = field2;
        this.f55761c = field3;
        this.f55762d = field4;
        this.f55763e = field5;
        this.f55764f = field6;
        this.f55765g = field7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivImageBackgroundTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivImageBackgroundTemplate divImageBackgroundTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivImageBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivImageBackgroundTemplate divImageBackgroundTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divImageBackgroundTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
