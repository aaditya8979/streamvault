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

/* JADX INFO: compiled from: DivActionScrollDestination.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivActionScrollDestination implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f54357b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionScrollDestination> f54358c = new sn.p<ParsingEnvironment, JSONObject, DivActionScrollDestination>() { // from class: com.yandex.div2.DivActionScrollDestination$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionScrollDestination mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionScrollDestination.f54357b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f54359a;

    /* JADX INFO: compiled from: DivActionScrollDestination.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionScrollDestination a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().D0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestination.kt */
    public static final class b extends DivActionScrollDestination {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final EndDestination f54360d;

        public b(@NotNull EndDestination endDestination) {
            super(null);
            this.f54360d = endDestination;
        }

        @NotNull
        public final EndDestination c() {
            return this.f54360d;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestination.kt */
    public static final class c extends DivActionScrollDestination {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final IndexDestination f54361d;

        public c(@NotNull IndexDestination indexDestination) {
            super(null);
            this.f54361d = indexDestination;
        }

        @NotNull
        public final IndexDestination c() {
            return this.f54361d;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestination.kt */
    public static final class d extends DivActionScrollDestination {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final OffsetDestination f54362d;

        public d(@NotNull OffsetDestination offsetDestination) {
            super(null);
            this.f54362d = offsetDestination;
        }

        @NotNull
        public final OffsetDestination c() {
            return this.f54362d;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestination.kt */
    public static final class e extends DivActionScrollDestination {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final StartDestination f54363d;

        public e(@NotNull StartDestination startDestination) {
            super(null);
            this.f54363d = startDestination;
        }

        @NotNull
        public final StartDestination c() {
            return this.f54363d;
        }
    }

    public DivActionScrollDestination() {
    }

    public /* synthetic */ DivActionScrollDestination(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivActionScrollDestination divActionScrollDestination, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divActionScrollDestination == null) {
            return false;
        }
        if (this instanceof d) {
            OffsetDestination offsetDestinationC = ((d) this).c();
            Object objB = divActionScrollDestination.b();
            return offsetDestinationC.a(objB instanceof OffsetDestination ? (OffsetDestination) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            IndexDestination indexDestinationC = ((c) this).c();
            Object objB2 = divActionScrollDestination.b();
            return indexDestinationC.a(objB2 instanceof IndexDestination ? (IndexDestination) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof e) {
            StartDestination startDestinationC = ((e) this).c();
            Object objB3 = divActionScrollDestination.b();
            return startDestinationC.a(objB3 instanceof StartDestination ? (StartDestination) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        EndDestination endDestinationC = ((b) this).c();
        Object objB4 = divActionScrollDestination.b();
        return endDestinationC.a(objB4 instanceof EndDestination ? (EndDestination) objB4 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f54359a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else {
            if (!(this instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((b) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f54359a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().D0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
