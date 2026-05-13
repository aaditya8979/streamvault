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

/* JADX INFO: compiled from: DivDownloadCallbacks.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivDownloadCallbacks implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f55176d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivDownloadCallbacks> f55177e = new sn.p<ParsingEnvironment, JSONObject, DivDownloadCallbacks>() { // from class: com.yandex.div2.DivDownloadCallbacks$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDownloadCallbacks mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivDownloadCallbacks.f55176d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f55180c;

    /* JADX INFO: compiled from: DivDownloadCallbacks.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivDownloadCallbacks a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().S2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivDownloadCallbacks() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DivDownloadCallbacks(@Nullable List<DivAction> list, @Nullable List<DivAction> list2) {
        this.f55178a = list;
        this.f55179b = list2;
    }

    public /* synthetic */ DivDownloadCallbacks(List list, List list2, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2);
    }

    public final boolean a(@Nullable DivDownloadCallbacks divDownloadCallbacks, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        if (divDownloadCallbacks == null) {
            return false;
        }
        List<DivAction> list = this.f55178a;
        if (list != null) {
            List<DivAction> list2 = divDownloadCallbacks.f55178a;
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
        if (divDownloadCallbacks.f55178a != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        List<DivAction> list3 = this.f55179b;
        List<DivAction> list4 = divDownloadCallbacks.f55179b;
        if (list3 != null) {
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
        if (list4 != null) {
            z11 = false;
            break;
        }
        z11 = true;
        return z11;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f55180c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivDownloadCallbacks.class).hashCode();
        List<DivAction> list = this.f55178a;
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
        List<DivAction> list2 = this.f55179b;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                iHash2 += ((DivAction) it2.next()).hash();
            }
        }
        int i11 = i10 + iHash2;
        this.f55180c = Integer.valueOf(i11);
        return i11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().S2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
