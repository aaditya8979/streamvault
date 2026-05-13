package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: AssignmentNode.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<String> f35810d = cb.b.a(new Object[]{"=", "+=", "-=", "*=", "/=", "%="});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f35812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f35813c;

    public b(String str, d dVar, d dVar2) {
        this.f35811a = str;
        this.f35812b = dVar;
        this.f35813c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f35812b.a(dVar, com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT, aVar);
        Object objA2 = this.f35813c.a(dVar, eVar, aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(objA2);
        return dVar.a(objA, arrayList, this.f35811a, aVar);
    }
}
