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

/* JADX INFO: compiled from: DivStretchIndicatorItemPlacementTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivStretchIndicatorItemPlacementTemplate implements JSONSerializable, JsonTemplate<DivStretchIndicatorItemPlacement> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f57265c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f57266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f57267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivStretchIndicatorItemPlacementTemplate> f57268f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivFixedSizeTemplate> f57269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57270b;

    /* JADX INFO: compiled from: DivStretchIndicatorItemPlacementTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f57266d = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f57267e = Expression.Companion.constant$default(companion, 10L, null, 2, null);
        f57268f = new sn.p<ParsingEnvironment, JSONObject, DivStretchIndicatorItemPlacementTemplate>() { // from class: com.yandex.div2.DivStretchIndicatorItemPlacementTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivStretchIndicatorItemPlacementTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivStretchIndicatorItemPlacementTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivStretchIndicatorItemPlacementTemplate(@NotNull Field<DivFixedSizeTemplate> field, @NotNull Field<Expression<Long>> field2) {
        this.f57269a = field;
        this.f57270b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivStretchIndicatorItemPlacementTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivStretchIndicatorItemPlacementTemplate(ParsingEnvironment parsingEnvironment, DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divStretchIndicatorItemPlacementTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
