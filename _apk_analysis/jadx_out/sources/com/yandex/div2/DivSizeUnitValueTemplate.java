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

/* JADX INFO: compiled from: DivSizeUnitValueTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivSizeUnitValueTemplate implements JSONSerializable, JsonTemplate<DivSizeUnitValue> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f56971c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f56972d = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSizeUnitValueTemplate> f56973e = new sn.p<ParsingEnvironment, JSONObject, DivSizeUnitValueTemplate>() { // from class: com.yandex.div2.DivSizeUnitValueTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivSizeUnitValueTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivSizeUnitValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivSizeUnit>> f56974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f56975b;

    /* JADX INFO: compiled from: DivSizeUnitValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivSizeUnitValueTemplate(@NotNull Field<Expression<DivSizeUnit>> field, @NotNull Field<Expression<Long>> field2) {
        this.f56974a = field;
        this.f56975b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivSizeUnitValueTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivSizeUnitValueTemplate divSizeUnitValueTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivSizeUnitValueTemplate(ParsingEnvironment parsingEnvironment, DivSizeUnitValueTemplate divSizeUnitValueTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divSizeUnitValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().c7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
