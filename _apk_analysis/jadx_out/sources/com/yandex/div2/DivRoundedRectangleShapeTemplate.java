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

/* JADX INFO: compiled from: DivRoundedRectangleShapeTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivRoundedRectangleShapeTemplate implements JSONSerializable, JsonTemplate<DivRoundedRectangleShape> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f56666f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f56667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f56668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f56669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivRoundedRectangleShapeTemplate> f56670j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f56671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivFixedSizeTemplate> f56672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<DivFixedSizeTemplate> f56673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<DivFixedSizeTemplate> f56674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<DivStrokeTemplate> f56675e;

    /* JADX INFO: compiled from: DivRoundedRectangleShapeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56667g = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f56668h = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f56669i = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f56670j = new sn.p<ParsingEnvironment, JSONObject, DivRoundedRectangleShapeTemplate>() { // from class: com.yandex.div2.DivRoundedRectangleShapeTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivRoundedRectangleShapeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivRoundedRectangleShapeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivRoundedRectangleShapeTemplate(@NotNull Field<Expression<Integer>> field, @NotNull Field<DivFixedSizeTemplate> field2, @NotNull Field<DivFixedSizeTemplate> field3, @NotNull Field<DivFixedSizeTemplate> field4, @NotNull Field<DivStrokeTemplate> field5) {
        this.f56671a = field;
        this.f56672b = field2;
        this.f56673c = field3;
        this.f56674d = field4;
        this.f56675e = field5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivRoundedRectangleShapeTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivRoundedRectangleShapeTemplate(ParsingEnvironment parsingEnvironment, DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divRoundedRectangleShapeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().y6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
