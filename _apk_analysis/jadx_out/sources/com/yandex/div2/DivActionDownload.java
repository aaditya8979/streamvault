package com.yandex.div2;

import android.net.Uri;
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

/* JADX INFO: compiled from: DivActionDownload.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionDownload implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54293e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionDownload> f54294f = new sn.p<ParsingEnvironment, JSONObject, DivActionDownload>() { // from class: com.yandex.div2.DivActionDownload$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionDownload mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionDownload.f54293e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f54295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f54296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Uri> f54297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f54298d;

    /* JADX INFO: compiled from: DivActionDownload.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionDownload a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().l0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionDownload(@Nullable List<DivAction> list, @Nullable List<DivAction> list2, @NotNull Expression<Uri> expression) {
        this.f54295a = list;
        this.f54296b = list2;
        this.f54297c = expression;
    }

    public final boolean a(@Nullable DivActionDownload divActionDownload, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        if (divActionDownload == null) {
            return false;
        }
        List<DivAction> list = this.f54295a;
        if (list != null) {
            List<DivAction> list2 = divActionDownload.f54295a;
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
        if (divActionDownload.f54295a != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        List<DivAction> list3 = this.f54296b;
        if (list3 != null) {
            List<DivAction> list4 = divActionDownload.f54296b;
            if (list4 != null) {
                if (list3.size() == list4.size()) {
                    int i12 = 0;
                    for (Object obj2 : list3) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj2).a(list4.get(i12), expressionResolver, expressionResolver2)) {
                            i12 = i13;
                        }
                    }
                    z11 = true;
                }
                z11 = false;
                break;
            }
            return false;
        }
        if (divActionDownload.f54296b != null) {
            z11 = false;
            break;
        }
        z11 = true;
        return z11 && tn.p.f(this.f54297c.evaluate(expressionResolver), divActionDownload.f54297c.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f54298d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionDownload.class).hashCode();
        List<DivAction> list = this.f54295a;
        int iHash2 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode + iHash;
        List<DivAction> list2 = this.f54296b;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                iHash2 += ((DivAction) it2.next()).hash();
            }
        }
        int iHashCode2 = i10 + iHash2 + this.f54297c.hashCode();
        this.f54298d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().l0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
