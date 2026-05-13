package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3545l extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3580m9 f27502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3495j f27503b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3545l(InterfaceC3580m9 interfaceC3580m9, InterfaceC3495j interfaceC3495j, hn.c cVar) {
        super(2, cVar);
        this.f27502a = interfaceC3580m9;
        this.f27503b = interfaceC3495j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3545l(this.f27502a, this.f27503b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3545l(this.f27502a, this.f27503b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        InterfaceC3580m9 interfaceC3580m9 = this.f27502a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("AdAudioTracker", "Adding audio volume change listener. Existing listeners - " + C3670q.f27920h.size());
        }
        for (WeakReference weakReference : C3670q.f27920h) {
            if (weakReference.get() == null) {
                C3670q.f27920h.remove(weakReference);
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = C3670q.f27920h;
        boolean zIsEmpty = copyOnWriteArraySet.isEmpty();
        copyOnWriteArraySet.add(new WeakReference(this.f27503b));
        InterfaceC3495j interfaceC3495j = this.f27503b;
        Float f10 = (Float) C3670q.f27917e.get();
        ((Ph) interfaceC3495j).a(f10 != null ? jn.a.c(F3.a(f10.floatValue() * 100.0f)) : null);
        if (zIsEmpty) {
            InterfaceC3580m9 interfaceC3580m92 = this.f27502a;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).c("AdAudioTracker", "Starting audio volume change listener");
            }
            C3670q.a(this.f27502a);
        } else {
            InterfaceC3580m9 interfaceC3580m93 = this.f27502a;
            if (interfaceC3580m93 != null) {
                ((C3605n9) interfaceC3580m93).c("AdAudioTracker", "Resuming audio volume change listener");
            }
        }
        return bn.r.f5635a;
    }
}
