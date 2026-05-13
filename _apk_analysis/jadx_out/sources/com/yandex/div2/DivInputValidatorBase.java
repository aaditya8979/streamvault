package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidatorBase.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivInputValidatorBase implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f56123e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f56124f = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputValidatorBase> f56125g = new sn.p<ParsingEnvironment, JSONObject, DivInputValidatorBase>() { // from class: com.yandex.div2.DivInputValidatorBase$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidatorBase mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputValidatorBase.f56123e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f56126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<String> f56127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f56128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f56129d;

    /* JADX INFO: compiled from: DivInputValidatorBase.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivInputValidatorBase a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().B4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivInputValidatorBase() {
        this(null, null, null, 7, null);
    }

    public DivInputValidatorBase(@NotNull Expression<Boolean> expression, @Nullable Expression<String> expression2, @Nullable String str) {
        this.f56126a = expression;
        this.f56127b = expression2;
        this.f56128c = str;
    }

    public /* synthetic */ DivInputValidatorBase(Expression expression, Expression expression2, String str, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f56124f : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? null : str);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56129d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivInputValidatorBase.class).hashCode() + this.f56126a.hashCode();
        Expression<String> expression = this.f56127b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        String str = this.f56128c;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.f56129d = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().B4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
