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

/* JADX INFO: compiled from: DivCircleShapeTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivCircleShapeTemplate implements JSONSerializable, JsonTemplate<DivCircleShape> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54747d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f54748e = new DivFixedSize(null, Expression.Companion.constant$default(Expression.Companion, 10L, null, 2, null), 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivCircleShapeTemplate> f54749f = new sn.p<ParsingEnvironment, JSONObject, DivCircleShapeTemplate>() { // from class: com.yandex.div2.DivCircleShapeTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCircleShapeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivCircleShapeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f54750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivFixedSizeTemplate> f54751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<DivStrokeTemplate> f54752c;

    /* JADX INFO: compiled from: DivCircleShapeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivCircleShapeTemplate(@NotNull Field<Expression<Integer>> field, @NotNull Field<DivFixedSizeTemplate> field2, @NotNull Field<DivStrokeTemplate> field3) {
        this.f54750a = field;
        this.f54751b = field2;
        this.f54752c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivCircleShapeTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivCircleShapeTemplate divCircleShapeTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivCircleShapeTemplate(ParsingEnvironment parsingEnvironment, DivCircleShapeTemplate divCircleShapeTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divCircleShapeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Y1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
