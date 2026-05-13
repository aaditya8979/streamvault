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

/* JADX INFO: compiled from: DivStrokeStyle.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivStrokeStyle implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f57290b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivStrokeStyle> f57291c = new sn.p<ParsingEnvironment, JSONObject, DivStrokeStyle>() { // from class: com.yandex.div2.DivStrokeStyle$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivStrokeStyle mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivStrokeStyle.f57290b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f57292a;

    /* JADX INFO: compiled from: DivStrokeStyle.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivStrokeStyle a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().I7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivStrokeStyle.kt */
    public static final class b extends DivStrokeStyle {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivStrokeStyleDashed f57293d;

        public b(@NotNull DivStrokeStyleDashed divStrokeStyleDashed) {
            super(null);
            this.f57293d = divStrokeStyleDashed;
        }

        @NotNull
        public final DivStrokeStyleDashed c() {
            return this.f57293d;
        }
    }

    /* JADX INFO: compiled from: DivStrokeStyle.kt */
    public static final class c extends DivStrokeStyle {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivStrokeStyleSolid f57294d;

        public c(@NotNull DivStrokeStyleSolid divStrokeStyleSolid) {
            super(null);
            this.f57294d = divStrokeStyleSolid;
        }

        @NotNull
        public final DivStrokeStyleSolid c() {
            return this.f57294d;
        }
    }

    public DivStrokeStyle() {
    }

    public /* synthetic */ DivStrokeStyle(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivStrokeStyle divStrokeStyle, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divStrokeStyle == null) {
            return false;
        }
        if (this instanceof c) {
            DivStrokeStyleSolid divStrokeStyleSolidC = ((c) this).c();
            Object objB = divStrokeStyle.b();
            return divStrokeStyleSolidC.a(objB instanceof DivStrokeStyleSolid ? (DivStrokeStyleSolid) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivStrokeStyleDashed divStrokeStyleDashedC = ((b) this).c();
        Object objB2 = divStrokeStyle.b();
        return divStrokeStyleDashedC.a(objB2 instanceof DivStrokeStyleDashed ? (DivStrokeStyleDashed) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f57292a;
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
        this.f57292a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().I7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
