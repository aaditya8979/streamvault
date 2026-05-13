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

/* JADX INFO: compiled from: DivTextRangeBackground.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivTextRangeBackground implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f57764b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextRangeBackground> f57765c = new sn.p<ParsingEnvironment, JSONObject, DivTextRangeBackground>() { // from class: com.yandex.div2.DivTextRangeBackground$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeBackground mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeBackground.f57764b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f57766a;

    /* JADX INFO: compiled from: DivTextRangeBackground.kt */
    public static final class a extends DivTextRangeBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivCloudBackground f57767d;

        public a(@NotNull DivCloudBackground divCloudBackground) {
            super(null);
            this.f57767d = divCloudBackground;
        }

        @NotNull
        public final DivCloudBackground c() {
            return this.f57767d;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeBackground.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTextRangeBackground a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().s8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTextRangeBackground.kt */
    public static final class c extends DivTextRangeBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivSolidBackground f57768d;

        public c(@NotNull DivSolidBackground divSolidBackground) {
            super(null);
            this.f57768d = divSolidBackground;
        }

        @NotNull
        public final DivSolidBackground c() {
            return this.f57768d;
        }
    }

    public DivTextRangeBackground() {
    }

    public /* synthetic */ DivTextRangeBackground(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivTextRangeBackground divTextRangeBackground, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divTextRangeBackground == null) {
            return false;
        }
        if (this instanceof c) {
            DivSolidBackground divSolidBackgroundC = ((c) this).c();
            Object objB = divTextRangeBackground.b();
            return divSolidBackgroundC.a(objB instanceof DivSolidBackground ? (DivSolidBackground) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        DivCloudBackground divCloudBackgroundC = ((a) this).c();
        Object objB2 = divTextRangeBackground.b();
        return divCloudBackgroundC.a(objB2 instanceof DivCloudBackground ? (DivCloudBackground) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f57766a;
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
        this.f57766a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().s8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
