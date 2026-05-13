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

/* JADX INFO: compiled from: DivTextGradient.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DivTextGradient implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f57712b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextGradient> f57713c = new sn.p<ParsingEnvironment, JSONObject, DivTextGradient>() { // from class: com.yandex.div2.DivTextGradient$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextGradient mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextGradient.f57712b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f57714a;

    /* JADX INFO: compiled from: DivTextGradient.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTextGradient a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().g8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTextGradient.kt */
    public static final class b extends DivTextGradient {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivLinearGradient f57715d;

        public b(@NotNull DivLinearGradient divLinearGradient) {
            super(null);
            this.f57715d = divLinearGradient;
        }

        @NotNull
        public final DivLinearGradient c() {
            return this.f57715d;
        }
    }

    /* JADX INFO: compiled from: DivTextGradient.kt */
    public static final class c extends DivTextGradient {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivRadialGradient f57716d;

        public c(@NotNull DivRadialGradient divRadialGradient) {
            super(null);
            this.f57716d = divRadialGradient;
        }

        @NotNull
        public final DivRadialGradient c() {
            return this.f57716d;
        }
    }

    public DivTextGradient() {
    }

    public /* synthetic */ DivTextGradient(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivTextGradient divTextGradient, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divTextGradient == null) {
            return false;
        }
        if (this instanceof b) {
            DivLinearGradient divLinearGradientC = ((b) this).c();
            Object objB = divTextGradient.b();
            return divLinearGradientC.a(objB instanceof DivLinearGradient ? (DivLinearGradient) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivRadialGradient divRadialGradientC = ((c) this).c();
        Object objB2 = divTextGradient.b();
        return divRadialGradientC.a(objB2 instanceof DivRadialGradient ? (DivRadialGradient) objB2 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final Object b() {
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f57714a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f57714a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().g8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
