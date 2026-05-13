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

/* JADX INFO: compiled from: DivMatchParentSizeTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivMatchParentSizeTemplate implements JSONSerializable, JsonTemplate<DivMatchParentSize> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f56208d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivMatchParentSizeTemplate> f56209e = new sn.p<ParsingEnvironment, JSONObject, DivMatchParentSizeTemplate>() { // from class: com.yandex.div2.DivMatchParentSizeTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivMatchParentSizeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivMatchParentSizeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeUnitValueTemplate> f56210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeUnitValueTemplate> f56211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56212c;

    /* JADX INFO: compiled from: DivMatchParentSizeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivMatchParentSizeTemplate(@NotNull Field<DivSizeUnitValueTemplate> field, @NotNull Field<DivSizeUnitValueTemplate> field2, @NotNull Field<Expression<Double>> field3) {
        this.f56210a = field;
        this.f56211b = field2;
        this.f56212c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivMatchParentSizeTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivMatchParentSizeTemplate divMatchParentSizeTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivMatchParentSizeTemplate(ParsingEnvironment parsingEnvironment, DivMatchParentSizeTemplate divMatchParentSizeTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divMatchParentSizeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Z4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
