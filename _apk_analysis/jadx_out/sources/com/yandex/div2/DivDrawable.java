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

/* JADX INFO: compiled from: DivDrawable.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivDrawable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f55185b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivDrawable> f55186c = new sn.p<ParsingEnvironment, JSONObject, DivDrawable>() { // from class: com.yandex.div2.DivDrawable$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDrawable mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivDrawable.f55185b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f55187a;

    /* JADX INFO: compiled from: DivDrawable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivDrawable a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().V2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivDrawable.kt */
    public static final class b extends DivDrawable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivShapeDrawable f55188d;

        public b(@NotNull DivShapeDrawable divShapeDrawable) {
            super(null);
            this.f55188d = divShapeDrawable;
        }

        @NotNull
        public final DivShapeDrawable c() {
            return this.f55188d;
        }
    }

    public DivDrawable() {
    }

    public /* synthetic */ DivDrawable(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivDrawable divDrawable, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divDrawable == null) {
            return false;
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivShapeDrawable divShapeDrawableC = ((b) this).c();
        Object objB = divDrawable.b();
        return divShapeDrawableC.a(objB instanceof DivShapeDrawable ? (DivShapeDrawable) objB : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final Object b() {
        if (this instanceof b) {
            return ((b) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55187a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        int iHash = iHashCode + ((b) this).c().hash();
        this.f55187a = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
