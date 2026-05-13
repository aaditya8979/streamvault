package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTimer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivTimer implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f57959h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f57960i = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTimer> f57961j = new sn.p<ParsingEnvironment, JSONObject, DivTimer>() { // from class: com.yandex.div2.DivTimer$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTimer mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTimer.f57959h.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f57962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f57963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f57964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f57965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f57966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f57967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Integer f57968g;

    /* JADX INFO: compiled from: DivTimer.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTimer a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().M8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivTimer(@NotNull Expression<Long> expression, @Nullable List<DivAction> list, @NotNull String str, @Nullable List<DivAction> list2, @Nullable Expression<Long> expression2, @Nullable String str2) {
        this.f57962a = expression;
        this.f57963b = list;
        this.f57964c = str;
        this.f57965d = list2;
        this.f57966e = expression2;
        this.f57967f = str2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        Integer num = this.f57968g;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivTimer.class).hashCode() + this.f57962a.hashCode();
        List<DivAction> list = this.f57963b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int iHashCode2 = iHashCode + iHash + this.f57964c.hashCode();
        List<DivAction> list2 = this.f57965d;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivAction) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i10 = iHashCode2 + iHash2;
        Expression<Long> expression = this.f57966e;
        int iHashCode3 = i10 + (expression != null ? expression.hashCode() : 0);
        String str = this.f57967f;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.f57968g = Integer.valueOf(iHashCode4);
        return iHashCode4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
