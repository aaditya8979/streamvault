package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;

/* JADX INFO: compiled from: MapKeyValueNode.java */
/* JADX INFO: loaded from: classes2.dex */
public class g extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f35822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f35823b;

    public g(d dVar, d dVar2) {
        this.f35822a = dVar;
        this.f35823b = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f35822a.a(dVar, eVar, aVar);
        Object objA2 = this.f35823b.a(dVar, eVar, aVar);
        HashMap map = new HashMap();
        map.put(objA, objA2);
        return map;
    }
}
