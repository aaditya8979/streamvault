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

/* JADX INFO: compiled from: DivInputFilterExpressionTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivInputFilterExpressionTemplate implements JSONSerializable, JsonTemplate<DivInputFilterExpression> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56010b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputFilterExpressionTemplate> f56011c = new sn.p<ParsingEnvironment, JSONObject, DivInputFilterExpressionTemplate>() { // from class: com.yandex.div2.DivInputFilterExpressionTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputFilterExpressionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivInputFilterExpressionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f56012a;

    /* JADX INFO: compiled from: DivInputFilterExpressionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivInputFilterExpressionTemplate(@NotNull Field<Expression<Boolean>> field) {
        this.f56012a = field;
    }

    public DivInputFilterExpressionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivInputFilterExpressionTemplate divInputFilterExpressionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivInputFilterExpressionTemplate(ParsingEnvironment parsingEnvironment, DivInputFilterExpressionTemplate divInputFilterExpressionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divInputFilterExpressionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().k4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
