package com.yandex.div2;

import ah.f6;
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

/* JADX INFO: compiled from: DivInputMask.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DivInputMask implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56053b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputMask> f56054c = new sn.p<ParsingEnvironment, JSONObject, DivInputMask>() { // from class: com.yandex.div2.DivInputMask$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputMask mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputMask.f56053b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f56055a;

    /* JADX INFO: compiled from: DivInputMask.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivInputMask a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().v4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivInputMask.kt */
    public static final class b extends DivInputMask {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivCurrencyInputMask f56056d;

        public b(@NotNull DivCurrencyInputMask divCurrencyInputMask) {
            super(null);
            this.f56056d = divCurrencyInputMask;
        }

        @NotNull
        public final DivCurrencyInputMask c() {
            return this.f56056d;
        }
    }

    /* JADX INFO: compiled from: DivInputMask.kt */
    public static final class c extends DivInputMask {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivFixedLengthInputMask f56057d;

        public c(@NotNull DivFixedLengthInputMask divFixedLengthInputMask) {
            super(null);
            this.f56057d = divFixedLengthInputMask;
        }

        @NotNull
        public final DivFixedLengthInputMask c() {
            return this.f56057d;
        }
    }

    /* JADX INFO: compiled from: DivInputMask.kt */
    public static final class d extends DivInputMask {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivPhoneInputMask f56058d;

        public d(@NotNull DivPhoneInputMask divPhoneInputMask) {
            super(null);
            this.f56058d = divPhoneInputMask;
        }

        @NotNull
        public final DivPhoneInputMask c() {
            return this.f56058d;
        }
    }

    public DivInputMask() {
    }

    public /* synthetic */ DivInputMask(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivInputMask divInputMask, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divInputMask == null) {
            return false;
        }
        if (this instanceof c) {
            DivFixedLengthInputMask divFixedLengthInputMaskC = ((c) this).c();
            f6 f6VarB = divInputMask.b();
            return divFixedLengthInputMaskC.b(f6VarB instanceof DivFixedLengthInputMask ? (DivFixedLengthInputMask) f6VarB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            DivCurrencyInputMask divCurrencyInputMaskC = ((b) this).c();
            f6 f6VarB2 = divInputMask.b();
            return divCurrencyInputMaskC.b(f6VarB2 instanceof DivCurrencyInputMask ? (DivCurrencyInputMask) f6VarB2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        DivPhoneInputMask divPhoneInputMaskC = ((d) this).c();
        f6 f6VarB3 = divInputMask.b();
        return divPhoneInputMaskC.b(f6VarB3 instanceof DivPhoneInputMask ? (DivPhoneInputMask) f6VarB3 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final f6 b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f56055a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((d) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f56055a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().v4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
