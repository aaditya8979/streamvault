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

/* JADX INFO: compiled from: DivTextRangeMask.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivTextRangeMask implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f57800b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextRangeMask> f57801c = new sn.p<ParsingEnvironment, JSONObject, DivTextRangeMask>() { // from class: com.yandex.div2.DivTextRangeMask$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeMask mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeMask.f57800b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f57802a;

    /* JADX INFO: compiled from: DivTextRangeMask.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTextRangeMask a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().D8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMask.kt */
    public static final class b extends DivTextRangeMask {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivTextRangeMaskParticles f57803d;

        public b(@NotNull DivTextRangeMaskParticles divTextRangeMaskParticles) {
            super(null);
            this.f57803d = divTextRangeMaskParticles;
        }

        @NotNull
        public final DivTextRangeMaskParticles c() {
            return this.f57803d;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMask.kt */
    public static final class c extends DivTextRangeMask {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivTextRangeMaskSolid f57804d;

        public c(@NotNull DivTextRangeMaskSolid divTextRangeMaskSolid) {
            super(null);
            this.f57804d = divTextRangeMaskSolid;
        }

        @NotNull
        public final DivTextRangeMaskSolid c() {
            return this.f57804d;
        }
    }

    public DivTextRangeMask() {
    }

    public /* synthetic */ DivTextRangeMask(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivTextRangeMask divTextRangeMask, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divTextRangeMask == null) {
            return false;
        }
        if (this instanceof b) {
            DivTextRangeMaskParticles divTextRangeMaskParticlesC = ((b) this).c();
            Object objB = divTextRangeMask.b();
            return divTextRangeMaskParticlesC.a(objB instanceof DivTextRangeMaskParticles ? (DivTextRangeMaskParticles) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivTextRangeMaskSolid divTextRangeMaskSolidC = ((c) this).c();
        Object objB2 = divTextRangeMask.b();
        return divTextRangeMaskSolidC.a(objB2 instanceof DivTextRangeMaskSolid ? (DivTextRangeMaskSolid) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f57802a;
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
        this.f57802a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().D8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
