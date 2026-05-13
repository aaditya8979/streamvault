package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.billing.impl.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4636b implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f64448a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4636b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C4636b(@NotNull i iVar) {
        this.f64448a = iVar;
    }

    public /* synthetic */ C4636b(i iVar, int i10, tn.i iVar2) {
        this((i10 & 1) != 0 ? new i() : iVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4635a toModel(@NotNull d dVar) {
        c[] cVarArr = dVar.f64459a;
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            arrayList.add(this.f64448a.toModel(cVar));
        }
        return new C4635a(arrayList, dVar.f64460b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d fromModel(@NotNull C4635a c4635a) {
        d dVar = new d();
        List list = c4635a.f64446a;
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f64448a.fromModel((BillingInfo) it.next()));
        }
        Object[] array = arrayList.toArray(new c[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        dVar.f64459a = (c[]) array;
        dVar.f64460b = c4635a.f64447b;
        return dVar;
    }
}
