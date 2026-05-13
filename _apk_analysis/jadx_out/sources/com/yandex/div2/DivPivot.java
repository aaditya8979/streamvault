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

/* JADX INFO: compiled from: DivPivot.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivPivot implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56528b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPivot> f56529c = new sn.p<ParsingEnvironment, JSONObject, DivPivot>() { // from class: com.yandex.div2.DivPivot$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPivot mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPivot.f56528b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f56530a;

    /* JADX INFO: compiled from: DivPivot.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivPivot a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().T5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivPivot.kt */
    public static final class b extends DivPivot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivPivotFixed f56531d;

        public b(@NotNull DivPivotFixed divPivotFixed) {
            super(null);
            this.f56531d = divPivotFixed;
        }

        @NotNull
        public final DivPivotFixed c() {
            return this.f56531d;
        }
    }

    /* JADX INFO: compiled from: DivPivot.kt */
    public static final class c extends DivPivot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivPivotPercentage f56532d;

        public c(@NotNull DivPivotPercentage divPivotPercentage) {
            super(null);
            this.f56532d = divPivotPercentage;
        }

        @NotNull
        public final DivPivotPercentage c() {
            return this.f56532d;
        }
    }

    public DivPivot() {
    }

    public /* synthetic */ DivPivot(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivPivot divPivot, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divPivot == null) {
            return false;
        }
        if (this instanceof b) {
            DivPivotFixed divPivotFixedC = ((b) this).c();
            Object objB = divPivot.b();
            return divPivotFixedC.a(objB instanceof DivPivotFixed ? (DivPivotFixed) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivPivotPercentage divPivotPercentageC = ((c) this).c();
        Object objB2 = divPivot.b();
        return divPivotPercentageC.a(objB2 instanceof DivPivotPercentage ? (DivPivotPercentage) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f56530a;
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
        this.f56530a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().T5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
