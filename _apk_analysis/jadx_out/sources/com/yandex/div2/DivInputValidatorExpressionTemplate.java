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

/* JADX INFO: compiled from: DivInputValidatorExpressionTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivInputValidatorExpressionTemplate implements JSONSerializable, JsonTemplate<DivInputValidatorExpression> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f56144e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f56145f = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputValidatorExpressionTemplate> f56146g = new sn.p<ParsingEnvironment, JSONObject, DivInputValidatorExpressionTemplate>() { // from class: com.yandex.div2.DivInputValidatorExpressionTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidatorExpressionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivInputValidatorExpressionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f56147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f56148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f56149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<String> f56150d;

    /* JADX INFO: compiled from: DivInputValidatorExpressionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivInputValidatorExpressionTemplate(@NotNull Field<Expression<Boolean>> field, @NotNull Field<Expression<Boolean>> field2, @NotNull Field<Expression<String>> field3, @NotNull Field<String> field4) {
        this.f56147a = field;
        this.f56148b = field2;
        this.f56149c = field3;
        this.f56150d = field4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivInputValidatorExpressionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Boolean>>) companion.nullField(false), (Field<Expression<Boolean>>) companion.nullField(false), (Field<Expression<String>>) companion.nullField(false), (Field<String>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivInputValidatorExpressionTemplate(ParsingEnvironment parsingEnvironment, DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divInputValidatorExpressionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().E4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
