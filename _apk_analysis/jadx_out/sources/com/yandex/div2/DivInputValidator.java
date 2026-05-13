package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidator.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivInputValidator implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56118b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputValidator> f56119c = new sn.p<ParsingEnvironment, JSONObject, DivInputValidator>() { // from class: com.yandex.div2.DivInputValidator$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidator mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputValidator.f56118b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f56120a;

    /* JADX INFO: compiled from: DivInputValidator.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivInputValidator a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().G4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivInputValidator.kt */
    public static final class b extends DivInputValidator {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivInputValidatorExpression f56121d;

        public b(@NotNull DivInputValidatorExpression divInputValidatorExpression) {
            super(null);
            this.f56121d = divInputValidatorExpression;
        }

        @NotNull
        public final DivInputValidatorExpression c() {
            return this.f56121d;
        }
    }

    /* JADX INFO: compiled from: DivInputValidator.kt */
    public static final class c extends DivInputValidator {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivInputValidatorRegex f56122d;

        public c(@NotNull DivInputValidatorRegex divInputValidatorRegex) {
            super(null);
            this.f56122d = divInputValidatorRegex;
        }

        @NotNull
        public final DivInputValidatorRegex c() {
            return this.f56122d;
        }
    }

    public DivInputValidator() {
    }

    public /* synthetic */ DivInputValidator(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivInputValidator divInputValidator, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divInputValidator == null) {
            return false;
        }
        if (this instanceof c) {
            DivInputValidatorRegex divInputValidatorRegexC = ((c) this).c();
            Object objB = divInputValidator.b();
            return divInputValidatorRegexC.a(objB instanceof DivInputValidatorRegex ? (DivInputValidatorRegex) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivInputValidatorExpression divInputValidatorExpressionC = ((b) this).c();
        Object objB2 = divInputValidator.b();
        return divInputValidatorExpressionC.a(objB2 instanceof DivInputValidatorExpression ? (DivInputValidatorExpression) objB2 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f56120a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((b) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f56120a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().G4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
