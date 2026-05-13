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

/* JADX INFO: compiled from: DivPageTransformation.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivPageTransformation implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56288b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPageTransformation> f56289c = new sn.p<ParsingEnvironment, JSONObject, DivPageTransformation>() { // from class: com.yandex.div2.DivPageTransformation$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPageTransformation mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPageTransformation.f56288b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f56290a;

    /* JADX INFO: compiled from: DivPageTransformation.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivPageTransformation a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().q5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivPageTransformation.kt */
    public static final class b extends DivPageTransformation {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivPageTransformationOverlap f56291d;

        public b(@NotNull DivPageTransformationOverlap divPageTransformationOverlap) {
            super(null);
            this.f56291d = divPageTransformationOverlap;
        }

        @NotNull
        public final DivPageTransformationOverlap c() {
            return this.f56291d;
        }
    }

    /* JADX INFO: compiled from: DivPageTransformation.kt */
    public static final class c extends DivPageTransformation {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivPageTransformationSlide f56292d;

        public c(@NotNull DivPageTransformationSlide divPageTransformationSlide) {
            super(null);
            this.f56292d = divPageTransformationSlide;
        }

        @NotNull
        public final DivPageTransformationSlide c() {
            return this.f56292d;
        }
    }

    public DivPageTransformation() {
    }

    public /* synthetic */ DivPageTransformation(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivPageTransformation divPageTransformation, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divPageTransformation == null) {
            return false;
        }
        if (this instanceof c) {
            DivPageTransformationSlide divPageTransformationSlideC = ((c) this).c();
            Object objB = divPageTransformation.b();
            return divPageTransformationSlideC.a(objB instanceof DivPageTransformationSlide ? (DivPageTransformationSlide) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivPageTransformationOverlap divPageTransformationOverlapC = ((b) this).c();
        Object objB2 = divPageTransformation.b();
        return divPageTransformationOverlapC.a(objB2 instanceof DivPageTransformationOverlap ? (DivPageTransformationOverlap) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f56290a;
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
        this.f56290a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().q5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
