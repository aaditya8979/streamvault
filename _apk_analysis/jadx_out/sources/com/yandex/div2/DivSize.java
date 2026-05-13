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

/* JADX INFO: compiled from: DivSize.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56946b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSize> f56947c = new sn.p<ParsingEnvironment, JSONObject, DivSize>() { // from class: com.yandex.div2.DivSize$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivSize mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivSize.f56946b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f56948a;

    /* JADX INFO: compiled from: DivSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivSize a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().Y6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivSize.kt */
    public static final class b extends DivSize {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivFixedSize f56949d;

        public b(@NotNull DivFixedSize divFixedSize) {
            super(null);
            this.f56949d = divFixedSize;
        }

        @NotNull
        public final DivFixedSize c() {
            return this.f56949d;
        }
    }

    /* JADX INFO: compiled from: DivSize.kt */
    public static final class c extends DivSize {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivMatchParentSize f56950d;

        public c(@NotNull DivMatchParentSize divMatchParentSize) {
            super(null);
            this.f56950d = divMatchParentSize;
        }

        @NotNull
        public final DivMatchParentSize c() {
            return this.f56950d;
        }
    }

    /* JADX INFO: compiled from: DivSize.kt */
    public static final class d extends DivSize {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivWrapContentSize f56951d;

        public d(@NotNull DivWrapContentSize divWrapContentSize) {
            super(null);
            this.f56951d = divWrapContentSize;
        }

        @NotNull
        public final DivWrapContentSize c() {
            return this.f56951d;
        }
    }

    public DivSize() {
    }

    public /* synthetic */ DivSize(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivSize divSize, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divSize == null) {
            return false;
        }
        if (this instanceof b) {
            DivFixedSize divFixedSizeC = ((b) this).c();
            Object objB = divSize.b();
            return divFixedSizeC.a(objB instanceof DivFixedSize ? (DivFixedSize) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            DivMatchParentSize divMatchParentSizeC = ((c) this).c();
            Object objB2 = divSize.b();
            return divMatchParentSizeC.a(objB2 instanceof DivMatchParentSize ? (DivMatchParentSize) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        DivWrapContentSize divWrapContentSizeC = ((d) this).c();
        Object objB3 = divSize.b();
        return divWrapContentSizeC.a(objB3 instanceof DivWrapContentSize ? (DivWrapContentSize) objB3 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final Object b() {
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f56948a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((d) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f56948a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Y6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
