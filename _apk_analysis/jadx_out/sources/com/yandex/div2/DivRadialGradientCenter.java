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

/* JADX INFO: compiled from: DivRadialGradientCenter.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivRadialGradientCenter implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56586b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivRadialGradientCenter> f56587c = new sn.p<ParsingEnvironment, JSONObject, DivRadialGradientCenter>() { // from class: com.yandex.div2.DivRadialGradientCenter$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientCenter mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientCenter.f56586b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f56588a;

    /* JADX INFO: compiled from: DivRadialGradientCenter.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivRadialGradientCenter a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().c6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientCenter.kt */
    public static final class b extends DivRadialGradientCenter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivRadialGradientFixedCenter f56589d;

        public b(@NotNull DivRadialGradientFixedCenter divRadialGradientFixedCenter) {
            super(null);
            this.f56589d = divRadialGradientFixedCenter;
        }

        @NotNull
        public final DivRadialGradientFixedCenter c() {
            return this.f56589d;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientCenter.kt */
    public static final class c extends DivRadialGradientCenter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivRadialGradientRelativeCenter f56590d;

        public c(@NotNull DivRadialGradientRelativeCenter divRadialGradientRelativeCenter) {
            super(null);
            this.f56590d = divRadialGradientRelativeCenter;
        }

        @NotNull
        public final DivRadialGradientRelativeCenter c() {
            return this.f56590d;
        }
    }

    public DivRadialGradientCenter() {
    }

    public /* synthetic */ DivRadialGradientCenter(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivRadialGradientCenter divRadialGradientCenter, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divRadialGradientCenter == null) {
            return false;
        }
        if (this instanceof b) {
            DivRadialGradientFixedCenter divRadialGradientFixedCenterC = ((b) this).c();
            Object objB = divRadialGradientCenter.b();
            return divRadialGradientFixedCenterC.a(objB instanceof DivRadialGradientFixedCenter ? (DivRadialGradientFixedCenter) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivRadialGradientRelativeCenter divRadialGradientRelativeCenterC = ((c) this).c();
        Object objB2 = divRadialGradientCenter.b();
        return divRadialGradientRelativeCenterC.a(objB2 instanceof DivRadialGradientRelativeCenter ? (DivRadialGradientRelativeCenter) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f56588a;
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
        this.f56588a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().c6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
