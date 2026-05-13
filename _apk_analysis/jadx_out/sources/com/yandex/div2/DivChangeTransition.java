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

/* JADX INFO: compiled from: DivChangeTransition.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivChangeTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f54731b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivChangeTransition> f54732c = new sn.p<ParsingEnvironment, JSONObject, DivChangeTransition>() { // from class: com.yandex.div2.DivChangeTransition$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivChangeTransition mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivChangeTransition.f54731b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f54733a;

    /* JADX INFO: compiled from: DivChangeTransition.kt */
    public static final class a extends DivChangeTransition {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivChangeBoundsTransition f54734d;

        public a(@NotNull DivChangeBoundsTransition divChangeBoundsTransition) {
            super(null);
            this.f54734d = divChangeBoundsTransition;
        }

        @NotNull
        public final DivChangeBoundsTransition c() {
            return this.f54734d;
        }
    }

    /* JADX INFO: compiled from: DivChangeTransition.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivChangeTransition a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().U1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivChangeTransition.kt */
    public static final class c extends DivChangeTransition {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivChangeSetTransition f54735d;

        public c(@NotNull DivChangeSetTransition divChangeSetTransition) {
            super(null);
            this.f54735d = divChangeSetTransition;
        }

        @NotNull
        public final DivChangeSetTransition c() {
            return this.f54735d;
        }
    }

    public DivChangeTransition() {
    }

    public /* synthetic */ DivChangeTransition(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivChangeTransition divChangeTransition, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divChangeTransition == null) {
            return false;
        }
        if (this instanceof c) {
            DivChangeSetTransition divChangeSetTransitionC = ((c) this).c();
            Object objB = divChangeTransition.b();
            return divChangeSetTransitionC.a(objB instanceof DivChangeSetTransition ? (DivChangeSetTransition) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        DivChangeBoundsTransition divChangeBoundsTransitionC = ((a) this).c();
        Object objB2 = divChangeTransition.b();
        return divChangeBoundsTransitionC.a(objB2 instanceof DivChangeBoundsTransition ? (DivChangeBoundsTransition) objB2 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f54733a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((a) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f54733a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().U1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
