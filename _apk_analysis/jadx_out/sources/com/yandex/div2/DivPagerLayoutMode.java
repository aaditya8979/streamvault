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

/* JADX INFO: compiled from: DivPagerLayoutMode.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivPagerLayoutMode implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56440b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPagerLayoutMode> f56441c = new sn.p<ParsingEnvironment, JSONObject, DivPagerLayoutMode>() { // from class: com.yandex.div2.DivPagerLayoutMode$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPagerLayoutMode mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPagerLayoutMode.f56440b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f56442a;

    /* JADX INFO: compiled from: DivPagerLayoutMode.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivPagerLayoutMode a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().C5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivPagerLayoutMode.kt */
    public static final class b extends DivPagerLayoutMode {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivNeighbourPageSize f56443d;

        public b(@NotNull DivNeighbourPageSize divNeighbourPageSize) {
            super(null);
            this.f56443d = divNeighbourPageSize;
        }

        @NotNull
        public final DivNeighbourPageSize c() {
            return this.f56443d;
        }
    }

    /* JADX INFO: compiled from: DivPagerLayoutMode.kt */
    public static final class c extends DivPagerLayoutMode {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivPageContentSize f56444d;

        public c(@NotNull DivPageContentSize divPageContentSize) {
            super(null);
            this.f56444d = divPageContentSize;
        }

        @NotNull
        public final DivPageContentSize c() {
            return this.f56444d;
        }
    }

    /* JADX INFO: compiled from: DivPagerLayoutMode.kt */
    public static final class d extends DivPagerLayoutMode {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivPageSize f56445d;

        public d(@NotNull DivPageSize divPageSize) {
            super(null);
            this.f56445d = divPageSize;
        }

        @NotNull
        public final DivPageSize c() {
            return this.f56445d;
        }
    }

    public DivPagerLayoutMode() {
    }

    public /* synthetic */ DivPagerLayoutMode(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivPagerLayoutMode divPagerLayoutMode, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divPagerLayoutMode == null) {
            return false;
        }
        if (this instanceof d) {
            DivPageSize divPageSizeC = ((d) this).c();
            Object objB = divPagerLayoutMode.b();
            return divPageSizeC.a(objB instanceof DivPageSize ? (DivPageSize) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            DivNeighbourPageSize divNeighbourPageSizeC = ((b) this).c();
            Object objB2 = divPagerLayoutMode.b();
            return divNeighbourPageSizeC.a(objB2 instanceof DivNeighbourPageSize ? (DivNeighbourPageSize) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivPageContentSize divPageContentSizeC = ((c) this).c();
        Object objB3 = divPagerLayoutMode.b();
        return divPageContentSizeC.a(objB3 instanceof DivPageContentSize ? (DivPageContentSize) objB3 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
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
        Integer num = this.f56442a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f56442a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
