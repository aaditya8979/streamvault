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

/* JADX INFO: compiled from: DivAnimator.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivAnimator implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f54619b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivAnimator> f54620c = new sn.p<ParsingEnvironment, JSONObject, DivAnimator>() { // from class: com.yandex.div2.DivAnimator$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAnimator mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivAnimator.f54619b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f54621a;

    /* JADX INFO: compiled from: DivAnimator.kt */
    public static final class a extends DivAnimator {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivColorAnimator f54622d;

        public a(@NotNull DivColorAnimator divColorAnimator) {
            super(null);
            this.f54622d = divColorAnimator;
        }

        @NotNull
        public final DivColorAnimator c() {
            return this.f54622d;
        }
    }

    /* JADX INFO: compiled from: DivAnimator.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivAnimator a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().t1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivAnimator.kt */
    public static final class c extends DivAnimator {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivNumberAnimator f54623d;

        public c(@NotNull DivNumberAnimator divNumberAnimator) {
            super(null);
            this.f54623d = divNumberAnimator;
        }

        @NotNull
        public final DivNumberAnimator c() {
            return this.f54623d;
        }
    }

    public DivAnimator() {
    }

    public /* synthetic */ DivAnimator(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivAnimator divAnimator, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divAnimator == null) {
            return false;
        }
        if (this instanceof a) {
            DivColorAnimator divColorAnimatorC = ((a) this).c();
            ah.b2 b2VarB = divAnimator.b();
            return divColorAnimatorC.f(b2VarB instanceof DivColorAnimator ? (DivColorAnimator) b2VarB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivNumberAnimator divNumberAnimatorC = ((c) this).c();
        ah.b2 b2VarB2 = divAnimator.b();
        return divNumberAnimatorC.f(b2VarB2 instanceof DivNumberAnimator ? (DivNumberAnimator) b2VarB2 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final ah.b2 b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f54621a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof a) {
            iHash = ((a) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f54621a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().t1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
