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

/* JADX INFO: compiled from: DivIndicatorItemPlacement.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivIndicatorItemPlacement implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f55872b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivIndicatorItemPlacement> f55873c = new sn.p<ParsingEnvironment, JSONObject, DivIndicatorItemPlacement>() { // from class: com.yandex.div2.DivIndicatorItemPlacement$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivIndicatorItemPlacement mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivIndicatorItemPlacement.f55872b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f55874a;

    /* JADX INFO: compiled from: DivIndicatorItemPlacement.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivIndicatorItemPlacement a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().a4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivIndicatorItemPlacement.kt */
    public static final class b extends DivIndicatorItemPlacement {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivDefaultIndicatorItemPlacement f55875d;

        public b(@NotNull DivDefaultIndicatorItemPlacement divDefaultIndicatorItemPlacement) {
            super(null);
            this.f55875d = divDefaultIndicatorItemPlacement;
        }

        @NotNull
        public final DivDefaultIndicatorItemPlacement c() {
            return this.f55875d;
        }
    }

    /* JADX INFO: compiled from: DivIndicatorItemPlacement.kt */
    public static final class c extends DivIndicatorItemPlacement {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivStretchIndicatorItemPlacement f55876d;

        public c(@NotNull DivStretchIndicatorItemPlacement divStretchIndicatorItemPlacement) {
            super(null);
            this.f55876d = divStretchIndicatorItemPlacement;
        }

        @NotNull
        public final DivStretchIndicatorItemPlacement c() {
            return this.f55876d;
        }
    }

    public DivIndicatorItemPlacement() {
    }

    public /* synthetic */ DivIndicatorItemPlacement(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivIndicatorItemPlacement divIndicatorItemPlacement, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divIndicatorItemPlacement == null) {
            return false;
        }
        if (this instanceof b) {
            DivDefaultIndicatorItemPlacement divDefaultIndicatorItemPlacementC = ((b) this).c();
            Object objB = divIndicatorItemPlacement.b();
            return divDefaultIndicatorItemPlacementC.a(objB instanceof DivDefaultIndicatorItemPlacement ? (DivDefaultIndicatorItemPlacement) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivStretchIndicatorItemPlacement divStretchIndicatorItemPlacementC = ((c) this).c();
        Object objB2 = divIndicatorItemPlacement.b();
        return divStretchIndicatorItemPlacementC.a(objB2 instanceof DivStretchIndicatorItemPlacement ? (DivStretchIndicatorItemPlacement) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f55874a;
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
        this.f55874a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().a4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
