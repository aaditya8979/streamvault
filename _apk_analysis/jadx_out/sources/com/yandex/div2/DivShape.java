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

/* JADX INFO: compiled from: DivShape.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DivShape implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f56926b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivShape> f56927c = new sn.p<ParsingEnvironment, JSONObject, DivShape>() { // from class: com.yandex.div2.DivShape$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivShape mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivShape.f56926b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f56928a;

    /* JADX INFO: compiled from: DivShape.kt */
    public static final class a extends DivShape {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivCircleShape f56929d;

        public a(@NotNull DivCircleShape divCircleShape) {
            super(null);
            this.f56929d = divCircleShape;
        }

        @NotNull
        public final DivCircleShape c() {
            return this.f56929d;
        }
    }

    /* JADX INFO: compiled from: DivShape.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivShape a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().V6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivShape.kt */
    public static final class c extends DivShape {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivRoundedRectangleShape f56930d;

        public c(@NotNull DivRoundedRectangleShape divRoundedRectangleShape) {
            super(null);
            this.f56930d = divRoundedRectangleShape;
        }

        @NotNull
        public final DivRoundedRectangleShape c() {
            return this.f56930d;
        }
    }

    public DivShape() {
    }

    public /* synthetic */ DivShape(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivShape divShape, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divShape == null) {
            return false;
        }
        if (this instanceof c) {
            DivRoundedRectangleShape divRoundedRectangleShapeC = ((c) this).c();
            Object objB = divShape.b();
            return divRoundedRectangleShapeC.a(objB instanceof DivRoundedRectangleShape ? (DivRoundedRectangleShape) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        DivCircleShape divCircleShapeC = ((a) this).c();
        Object objB2 = divShape.b();
        return divCircleShapeC.a(objB2 instanceof DivCircleShape ? (DivCircleShape) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f56928a;
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
        this.f56928a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
