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

/* JADX INFO: compiled from: DivBackground.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DivBackground implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f54656b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivBackground> f54657c = new sn.p<ParsingEnvironment, JSONObject, DivBackground>() { // from class: com.yandex.div2.DivBackground$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivBackground mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivBackground.f54656b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f54658a;

    /* JADX INFO: compiled from: DivBackground.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivBackground a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().F1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivBackground.kt */
    public static final class b extends DivBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivImageBackground f54659d;

        public b(@NotNull DivImageBackground divImageBackground) {
            super(null);
            this.f54659d = divImageBackground;
        }

        @NotNull
        public final DivImageBackground c() {
            return this.f54659d;
        }
    }

    /* JADX INFO: compiled from: DivBackground.kt */
    public static final class c extends DivBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivLinearGradient f54660d;

        public c(@NotNull DivLinearGradient divLinearGradient) {
            super(null);
            this.f54660d = divLinearGradient;
        }

        @NotNull
        public final DivLinearGradient c() {
            return this.f54660d;
        }
    }

    /* JADX INFO: compiled from: DivBackground.kt */
    public static final class d extends DivBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivNinePatchBackground f54661d;

        public d(@NotNull DivNinePatchBackground divNinePatchBackground) {
            super(null);
            this.f54661d = divNinePatchBackground;
        }

        @NotNull
        public final DivNinePatchBackground c() {
            return this.f54661d;
        }
    }

    /* JADX INFO: compiled from: DivBackground.kt */
    public static final class e extends DivBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivRadialGradient f54662d;

        public e(@NotNull DivRadialGradient divRadialGradient) {
            super(null);
            this.f54662d = divRadialGradient;
        }

        @NotNull
        public final DivRadialGradient c() {
            return this.f54662d;
        }
    }

    /* JADX INFO: compiled from: DivBackground.kt */
    public static final class f extends DivBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivSolidBackground f54663d;

        public f(@NotNull DivSolidBackground divSolidBackground) {
            super(null);
            this.f54663d = divSolidBackground;
        }

        @NotNull
        public final DivSolidBackground c() {
            return this.f54663d;
        }
    }

    public DivBackground() {
    }

    public /* synthetic */ DivBackground(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivBackground divBackground, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divBackground == null) {
            return false;
        }
        if (this instanceof c) {
            DivLinearGradient divLinearGradientC = ((c) this).c();
            Object objB = divBackground.b();
            return divLinearGradientC.a(objB instanceof DivLinearGradient ? (DivLinearGradient) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof e) {
            DivRadialGradient divRadialGradientC = ((e) this).c();
            Object objB2 = divBackground.b();
            return divRadialGradientC.a(objB2 instanceof DivRadialGradient ? (DivRadialGradient) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            DivImageBackground divImageBackgroundC = ((b) this).c();
            Object objB3 = divBackground.b();
            return divImageBackgroundC.a(objB3 instanceof DivImageBackground ? (DivImageBackground) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            DivSolidBackground divSolidBackgroundC = ((f) this).c();
            Object objB4 = divBackground.b();
            return divSolidBackgroundC.a(objB4 instanceof DivSolidBackground ? (DivSolidBackground) objB4 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        DivNinePatchBackground divNinePatchBackgroundC = ((d) this).c();
        Object objB5 = divBackground.b();
        return divNinePatchBackgroundC.a(objB5 instanceof DivNinePatchBackground ? (DivNinePatchBackground) objB5 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f54658a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((d) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f54658a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().F1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
