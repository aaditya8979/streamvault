package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivData;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivData.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivData implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f55077j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<DivTransitionSelector> f55078k = Expression.Companion.constant$default(Expression.Companion, DivTransitionSelector.NONE, null, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivData> f55079l = new sn.p<ParsingEnvironment, JSONObject, DivData>() { // from class: com.yandex.div2.DivData$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivData mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivData.f55077j.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f55080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f55081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<State> f55082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivTimer> f55083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Expression<DivTransitionSelector> f55084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final List<DivTrigger> f55085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final List<DivVariable> f55086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final List<Exception> f55087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Integer f55088i;

    /* JADX INFO: compiled from: DivData.kt */
    public static final class State implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f55089d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, State> f55090e = new sn.p<ParsingEnvironment, JSONObject, State>() { // from class: com.yandex.div2.DivData$State$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivData.State mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivData.State.f55089d.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Div f55091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f55092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f55093c;

        /* JADX INFO: compiled from: DivData.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final State a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().G2().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public State(@NotNull Div div, long j10) {
            this.f55091a = div;
            this.f55092b = j10;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f55093c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(State.class).hashCode() + this.f55091a.hash() + Long.hashCode(this.f55092b);
            this.f55093c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().G2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivData.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivData a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().E2().getValue().a(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivData(@Nullable List<DivFunction> list, @NotNull String str, @NotNull List<State> list2, @Nullable List<DivTimer> list3, @NotNull Expression<DivTransitionSelector> expression, @Nullable List<DivTrigger> list4, @Nullable List<? extends DivVariable> list5, @Nullable List<? extends Exception> list6) {
        this.f55080a = list;
        this.f55081b = str;
        this.f55082c = list2;
        this.f55083d = list3;
        this.f55084e = expression;
        this.f55085f = list4;
        this.f55086g = list5;
        this.f55087h = list6;
    }

    public /* synthetic */ DivData(List list, String str, List list2, List list3, Expression expression, List list4, List list5, List list6, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : list, str, list2, (i10 & 8) != 0 ? null : list3, (i10 & 16) != 0 ? f55078k : expression, (i10 & 32) != 0 ? null : list4, (i10 & 64) != 0 ? null : list5, (i10 & 128) != 0 ? null : list6);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        int iHash3;
        Integer num = this.f55088i;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivData.class).hashCode();
        List<DivFunction> list = this.f55080a;
        int iHash4 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivFunction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int iHashCode2 = iHashCode + iHash + this.f55081b.hashCode();
        Iterator<T> it2 = this.f55082c.iterator();
        int iHash5 = 0;
        while (it2.hasNext()) {
            iHash5 += ((State) it2.next()).hash();
        }
        int i10 = iHashCode2 + iHash5;
        List<DivTimer> list2 = this.f55083d;
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            iHash2 = 0;
            while (it3.hasNext()) {
                iHash2 += ((DivTimer) it3.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int iHashCode3 = i10 + iHash2 + this.f55084e.hashCode();
        List<DivTrigger> list3 = this.f55085f;
        if (list3 != null) {
            Iterator<T> it4 = list3.iterator();
            iHash3 = 0;
            while (it4.hasNext()) {
                iHash3 += ((DivTrigger) it4.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i11 = iHashCode3 + iHash3;
        List<DivVariable> list4 = this.f55086g;
        if (list4 != null) {
            Iterator<T> it5 = list4.iterator();
            while (it5.hasNext()) {
                iHash4 += ((DivVariable) it5.next()).hash();
            }
        }
        int i12 = i11 + iHash4;
        this.f55088i = Integer.valueOf(i12);
        return i12;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().E2().getValue().b(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
