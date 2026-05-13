package com.mbridge.msdk.config.component.common.express.operator.parts;

import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.express.e;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: HighLevelFutureCallable.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f35860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f35861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.express.node.d f35862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f35863d;

    public b(d dVar, e eVar, com.mbridge.msdk.config.component.common.express.node.d dVar2, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f35862c = dVar2;
        this.f35860a = dVar;
        this.f35861b = eVar;
        this.f35863d = aVar;
    }

    public void a(Object obj) {
        this.f35863d.a("this", obj);
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        return this.f35862c.a(this.f35860a, this.f35861b, this.f35863d);
    }
}
