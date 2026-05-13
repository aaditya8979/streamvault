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

/* JADX INFO: compiled from: DivInputValidatorBaseTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivInputValidatorBaseTemplate implements JSONSerializable, JsonTemplate<DivInputValidatorBase> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f56130d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f56131e = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputValidatorBaseTemplate> f56132f = new sn.p<ParsingEnvironment, JSONObject, DivInputValidatorBaseTemplate>() { // from class: com.yandex.div2.DivInputValidatorBaseTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidatorBaseTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivInputValidatorBaseTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f56133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f56134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<String> f56135c;

    /* JADX INFO: compiled from: DivInputValidatorBaseTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivInputValidatorBaseTemplate(@NotNull Field<Expression<Boolean>> field, @NotNull Field<Expression<String>> field2, @NotNull Field<String> field3) {
        this.f56133a = field;
        this.f56134b = field2;
        this.f56135c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivInputValidatorBaseTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivInputValidatorBaseTemplate divInputValidatorBaseTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivInputValidatorBaseTemplate(ParsingEnvironment parsingEnvironment, DivInputValidatorBaseTemplate divInputValidatorBaseTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divInputValidatorBaseTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
