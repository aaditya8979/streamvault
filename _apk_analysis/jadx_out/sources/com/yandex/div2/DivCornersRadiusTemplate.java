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

/* JADX INFO: compiled from: DivCornersRadiusTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivCornersRadiusTemplate implements JSONSerializable, JsonTemplate<DivCornersRadius> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54986e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivCornersRadiusTemplate> f54987f = new sn.p<ParsingEnvironment, JSONObject, DivCornersRadiusTemplate>() { // from class: com.yandex.div2.DivCornersRadiusTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCornersRadiusTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivCornersRadiusTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54991d;

    /* JADX INFO: compiled from: DivCornersRadiusTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivCornersRadiusTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<Expression<Long>> field2, @NotNull Field<Expression<Long>> field3, @NotNull Field<Expression<Long>> field4) {
        this.f54988a = field;
        this.f54989b = field2;
        this.f54990c = field3;
        this.f54991d = field4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivCornersRadiusTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivCornersRadiusTemplate divCornersRadiusTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivCornersRadiusTemplate(ParsingEnvironment parsingEnvironment, DivCornersRadiusTemplate divCornersRadiusTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divCornersRadiusTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().t2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
