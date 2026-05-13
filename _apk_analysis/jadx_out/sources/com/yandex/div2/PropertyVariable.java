package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: PropertyVariable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PropertyVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f58635g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f58636h = "new_value";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, PropertyVariable> f58637i = new sn.p<ParsingEnvironment, JSONObject, PropertyVariable>() { // from class: com.yandex.div2.PropertyVariable$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final PropertyVariable mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return PropertyVariable.f58635g.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<String> f58638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f58639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f58640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f58641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Expression<DivEvaluableType> f58642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Integer f58643f;

    /* JADX INFO: compiled from: PropertyVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final PropertyVariable a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().X9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public PropertyVariable(@NotNull Expression<String> expression, @NotNull String str, @NotNull String str2, @Nullable List<DivAction> list, @NotNull Expression<DivEvaluableType> expression2) {
        this.f58638a = expression;
        this.f58639b = str;
        this.f58640c = str2;
        this.f58641d = list;
        this.f58642e = expression2;
    }

    public final boolean a(@Nullable PropertyVariable propertyVariable, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        if (propertyVariable == null || !tn.p.f(this.f58638a.evaluate(expressionResolver), propertyVariable.f58638a.evaluate(expressionResolver2)) || !tn.p.f(this.f58639b, propertyVariable.f58639b) || !tn.p.f(this.f58640c, propertyVariable.f58640c)) {
            return false;
        }
        List<DivAction> list = this.f58641d;
        if (list != null) {
            List<DivAction> list2 = propertyVariable.f58641d;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                    z10 = true;
                }
                z10 = false;
                break;
            }
            return false;
        }
        if (propertyVariable.f58641d != null) {
            z10 = false;
            break;
        }
        z10 = true;
        return z10 && this.f58642e.evaluate(expressionResolver) == propertyVariable.f58642e.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58643f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(PropertyVariable.class).hashCode() + this.f58638a.hashCode() + this.f58639b.hashCode() + this.f58640c.hashCode();
        List<DivAction> list = this.f58641d;
        int iHash = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        }
        int iHashCode2 = iHashCode + iHash + this.f58642e.hashCode();
        this.f58643f = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().X9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
