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

/* JADX INFO: compiled from: DivAppearanceSetTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivAppearanceSetTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54628d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivAppearanceSetTransition> f54629e = new sn.p<ParsingEnvironment, JSONObject, DivAppearanceSetTransition>() { // from class: com.yandex.div2.DivAppearanceSetTransition$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAppearanceSetTransition mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivAppearanceSetTransition.f54628d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<DivAppearanceTransition> f54630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f54631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f54632c;

    /* JADX INFO: compiled from: DivAppearanceSetTransition.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivAppearanceSetTransition a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().w1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivAppearanceSetTransition(@NotNull List<? extends DivAppearanceTransition> list) {
        this.f54630a = list;
    }

    public final boolean a(@Nullable DivAppearanceSetTransition divAppearanceSetTransition, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divAppearanceSetTransition == null) {
            return false;
        }
        List<DivAppearanceTransition> list = this.f54630a;
        List<DivAppearanceTransition> list2 = divAppearanceSetTransition.f54630a;
        if (list.size() != list2.size()) {
            return false;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                cn.w.w();
            }
            if (!((DivAppearanceTransition) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54632c;
        if (num != null) {
            return num.intValue();
        }
        int iPropertiesHash = propertiesHash();
        int iHash = 0;
        Iterator<T> it = this.f54630a.iterator();
        while (it.hasNext()) {
            iHash += ((DivAppearanceTransition) it.next()).hash();
        }
        int i10 = iPropertiesHash + iHash;
        this.f54632c = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        Integer num = this.f54631b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivAppearanceSetTransition.class).hashCode();
        this.f54631b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
