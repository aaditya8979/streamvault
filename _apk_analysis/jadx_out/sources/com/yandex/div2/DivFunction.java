package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunction.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivFunction implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f55378f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFunction> f55379g = new sn.p<ParsingEnvironment, JSONObject, DivFunction>() { // from class: com.yandex.div2.DivFunction$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFunction mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFunction.f55378f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<DivFunctionArgument> f55380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f55381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f55382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DivEvaluableType f55383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Integer f55384e;

    /* JADX INFO: compiled from: DivFunction.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivFunction a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().I3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivFunction(@NotNull List<DivFunctionArgument> list, @NotNull String str, @NotNull String str2, @NotNull DivEvaluableType divEvaluableType) {
        this.f55380a = list;
        this.f55381b = str;
        this.f55382c = str2;
        this.f55383d = divEvaluableType;
    }

    public final boolean a(@Nullable DivFunction divFunction, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divFunction == null) {
            return false;
        }
        List<DivFunctionArgument> list = this.f55380a;
        List<DivFunctionArgument> list2 = divFunction.f55380a;
        if (list.size() != list2.size()) {
            z10 = false;
            break;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                cn.w.w();
            }
            if (!((DivFunctionArgument) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                z10 = false;
                break;
            }
            i10 = i11;
        }
        z10 = true;
        return z10 && tn.p.f(this.f55381b, divFunction.f55381b) && tn.p.f(this.f55382c, divFunction.f55382c) && this.f55383d == divFunction.f55383d;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55384e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivFunction.class).hashCode();
        int iHash = 0;
        Iterator<T> it = this.f55380a.iterator();
        while (it.hasNext()) {
            iHash += ((DivFunctionArgument) it.next()).hash();
        }
        int iHashCode2 = iHashCode + iHash + this.f55381b.hashCode() + this.f55382c.hashCode() + this.f55383d.hashCode();
        this.f55384e = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().I3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
