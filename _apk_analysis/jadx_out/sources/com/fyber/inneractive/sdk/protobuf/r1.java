package com.fyber.inneractive.sdk.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class r1 extends t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f19217c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public static List a(Object obj, long j10, int i10) {
        List list;
        List list2 = (List) x3.e(obj, j10);
        if (list2.isEmpty()) {
            List p1Var = list2 instanceof q1 ? new p1(i10) : ((list2 instanceof n2) && (list2 instanceof k1)) ? ((k1) list2).b(i10) : new ArrayList(i10);
            x3.a(j10, obj, p1Var);
            return p1Var;
        }
        if (f19217c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i10);
            arrayList.addAll(list2);
            x3.a(j10, obj, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof r3)) {
                if (!(list2 instanceof n2) || !(list2 instanceof k1)) {
                    return list2;
                }
                k1 k1Var = (k1) list2;
                if (((c) k1Var).f19106a) {
                    return list2;
                }
                k1 k1VarB = k1Var.b(list2.size() + i10);
                x3.a(j10, obj, k1VarB);
                return k1VarB;
            }
            p1 p1Var2 = new p1(list2.size() + i10);
            p1Var2.addAll((r3) list2);
            x3.a(j10, obj, p1Var2);
            list = p1Var2;
        }
        return list;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(long j10, Object obj, Object obj2) {
        List list = (List) x3.e(obj2, j10);
        List listA = a(obj, j10, list.size());
        int size = listA.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listA.addAll(list);
        }
        if (size > 0) {
            list = listA;
        }
        x3.a(j10, obj, list);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) x3.e(obj, j10);
        if (list instanceof q1) {
            objUnmodifiableList = ((q1) list).a();
        } else {
            if (f19217c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof n2) && (list instanceof k1)) {
                c cVar = (c) ((k1) list);
                if (cVar.f19106a) {
                    cVar.f19106a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        x3.a(j10, obj, objUnmodifiableList);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final List b(Object obj, long j10) {
        return a(obj, j10, 10);
    }
}
