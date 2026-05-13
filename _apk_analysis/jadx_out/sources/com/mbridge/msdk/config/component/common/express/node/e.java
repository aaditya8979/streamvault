package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: FunctionCallNode.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f35817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<d> f35819c;

    public e(d dVar, String str, List<d> list) {
        this.f35817a = dVar;
        this.f35818b = str;
        this.f35819c = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.f35819c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (Arrays.asList("map", "filter", "sorted").contains(this.f35818b)) {
            arrayList.add(new com.mbridge.msdk.config.component.common.express.operator.parts.b(dVar, eVar, this.f35819c.get(0), aVar));
            for (int i10 = 1; i10 < this.f35819c.size(); i10++) {
                arrayList.add(this.f35819c.get(i10).a(dVar, eVar, aVar));
            }
        } else {
            Iterator<d> it = this.f35819c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(dVar, eVar, aVar));
            }
        }
        return dVar.a(this.f35817a.a(dVar, eVar, aVar), arrayList, this.f35818b, aVar);
    }
}
