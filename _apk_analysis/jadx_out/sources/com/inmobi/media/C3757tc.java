package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3757tc extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3782uc f28180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3832wc f28181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3757tc(C3782uc c3782uc, C3832wc c3832wc, boolean z10, hn.c cVar) {
        super(2, cVar);
        this.f28180a = c3782uc;
        this.f28181b = c3832wc;
        this.f28182c = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3757tc(this.f28180a, this.f28181b, this.f28182c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3757tc) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        Context context = this.f28180a.f28253b;
        if (context != null) {
            Object systemService = context.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    C3782uc c3782uc = this.f28180a;
                    if (streamVolume != c3782uc.f28254c) {
                        c3782uc.f28254c = streamVolume;
                        InterfaceC3580m9 interfaceC3580m9 = this.f28181b.f28430b;
                        if (interfaceC3580m9 != null) {
                            ((C3605n9) interfaceC3580m9).a("MraidMediaProcessor", "volume change detected - " + this.f28182c);
                        }
                        this.f28181b.a(this.f28180a.f28252a, streamVolume);
                    }
                } catch (Exception e10) {
                    InterfaceC3580m9 interfaceC3580m92 = this.f28181b.f28430b;
                    if (interfaceC3580m92 != null) {
                        ((C3605n9) interfaceC3580m92).a("MraidMediaProcessor", "Unexpected error in volume listener", e10);
                    }
                }
            }
        }
        return bn.r.f5635a;
    }
}
