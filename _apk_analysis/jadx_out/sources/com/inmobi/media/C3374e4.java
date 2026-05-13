package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.inmobi.media.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3374e4 implements go.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3476i4 f27086a;

    public C3374e4(C3476i4 c3476i4) {
        this.f27086a = c3476i4;
    }

    @Override // go.e
    public final Object emit(Object obj, hn.c cVar) {
        Config config = (Config) obj;
        this.f27086a.f27329a.f27444b.put(config.getType(), config);
        C3476i4 c3476i4 = this.f27086a;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c3476i4.f27329a.f27445c.get(config.getType());
        if (concurrentLinkedQueue != null) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                InterfaceC3724s4 interfaceC3724s4 = (InterfaceC3724s4) ((WeakReference) it.next()).get();
                if (interfaceC3724s4 != null) {
                    interfaceC3724s4.a(config);
                }
            }
        }
        c3476i4.f27329a.f27445c.remove(config.getType());
        return bn.r.f5635a;
    }
}
