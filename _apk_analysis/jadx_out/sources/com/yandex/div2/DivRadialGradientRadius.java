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

/* JADX INFO: compiled from: DivRadialGradientRadius.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivRadialGradientRadius implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56612b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivRadialGradientRadius> f56613c = new sn.p<ParsingEnvironment, JSONObject, DivRadialGradientRadius>() { // from class: com.yandex.div2.DivRadialGradientRadius$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientRadius mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientRadius.f56612b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f56614a;

    /* JADX INFO: compiled from: DivRadialGradientRadius.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivRadialGradientRadius a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().o6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRadius.kt */
    public static final class b extends DivRadialGradientRadius {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivFixedSize f56615d;

        public b(@NotNull DivFixedSize divFixedSize) {
            super(null);
            this.f56615d = divFixedSize;
        }

        @NotNull
        public final DivFixedSize c() {
            return this.f56615d;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRadius.kt */
    public static final class c extends DivRadialGradientRadius {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivRadialGradientRelativeRadius f56616d;

        public c(@NotNull DivRadialGradientRelativeRadius divRadialGradientRelativeRadius) {
            super(null);
            this.f56616d = divRadialGradientRelativeRadius;
        }

        @NotNull
        public final DivRadialGradientRelativeRadius c() {
            return this.f56616d;
        }
    }

    public DivRadialGradientRadius() {
    }

    public /* synthetic */ DivRadialGradientRadius(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivRadialGradientRadius divRadialGradientRadius, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divRadialGradientRadius == null) {
            return false;
        }
        if (this instanceof b) {
            DivFixedSize divFixedSizeC = ((b) this).c();
            Object objB = divRadialGradientRadius.b();
            return divFixedSizeC.a(objB instanceof DivFixedSize ? (DivFixedSize) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivRadialGradientRelativeRadius divRadialGradientRelativeRadiusC = ((c) this).c();
        Object objB2 = divRadialGradientRadius.b();
        return divRadialGradientRelativeRadiusC.a(objB2 instanceof DivRadialGradientRelativeRadius ? (DivRadialGradientRelativeRadius) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f56614a;
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
        this.f56614a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().o6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
