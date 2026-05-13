package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3595n extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3580m9 f27653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3495j f27654b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3595n(InterfaceC3580m9 interfaceC3580m9, InterfaceC3495j interfaceC3495j, hn.c cVar) {
        super(2, cVar);
        this.f27653a = interfaceC3580m9;
        this.f27654b = interfaceC3495j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3595n(this.f27653a, this.f27654b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3595n(this.f27653a, this.f27654b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        InterfaceC3580m9 interfaceC3580m9 = this.f27653a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("AdAudioTracker", "Removing audio volume change listener");
        }
        CopyOnWriteArraySet<WeakReference> copyOnWriteArraySet = C3670q.f27920h;
        InterfaceC3495j interfaceC3495j = this.f27654b;
        for (WeakReference weakReference : copyOnWriteArraySet) {
            if (tn.p.f(weakReference.get(), interfaceC3495j)) {
                C3670q.f27920h.remove(weakReference);
            }
        }
        if (C3670q.f27920h.isEmpty()) {
            InterfaceC3580m9 interfaceC3580m92 = this.f27653a;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).c("AdAudioTracker", "Stopping audio volume change listener");
            }
            InterfaceC3580m9 interfaceC3580m93 = this.f27653a;
            Context context = Ji.f25747a;
            if (context == null) {
                if (interfaceC3580m93 != null) {
                    ((C3605n9) interfaceC3580m93).b("AdAudioTracker", "Context is null. Cannot stop audio volume tracking");
                }
                C3670q.a((Float) null);
            } else if (C3670q.f27916d.compareAndSet(true, false)) {
                if (interfaceC3580m93 != null) {
                    ((C3605n9) interfaceC3580m93).c("AdAudioTracker", "Stopping audio volume tracking");
                }
                C3670q.a(context, interfaceC3580m93);
            } else if (interfaceC3580m93 != null) {
                ((C3605n9) interfaceC3580m93).c("AdAudioTracker", "Audio volume tracking is already stopped");
            }
        }
        return bn.r.f5635a;
    }
}
