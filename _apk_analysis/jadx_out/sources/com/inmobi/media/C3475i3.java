package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3475i3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3475i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3549l3 f27328a;

    public C3475i3(InterfaceC3549l3 interfaceC3549l3) {
        tn.p.k(interfaceC3549l3, "mEventHandler");
        this.f27328a = interfaceC3549l3;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, com.inmobi.media.mo] */
    public static final void a(final S2 s22, C3475i3 c3475i3) {
        Je je2 = new Je(s22.f26275b, C3823w3.a(s22), null, null, null, false, 60);
        int pingTimeout = C3823w3.c().getPingTimeout();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? moVar = new mo(je2, new C3450h3(new AtomicBoolean(false), ref$ObjectRef, c3475i3, s22), pingTimeout * 1000, new sn.a() { // from class: n9.z7
            @Override // sn.a
            public final Object invoke() {
                return C3475i3.b(s22);
            }
        });
        ref$ObjectRef.element = moVar;
        moVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AtomicBoolean atomicBoolean, Ref$ObjectRef ref$ObjectRef, C3475i3 c3475i3, S2 s22, boolean z10) {
        if (atomicBoolean.compareAndSet(false, true)) {
            mo moVar = (mo) ref$ObjectRef.element;
            if (moVar != null) {
                moVar.a();
            }
            if (z10) {
                c3475i3.f27328a.a(s22);
            } else {
                c3475i3.f27328a.a(s22, EnumC3273a6.f26744d);
            }
        }
    }

    public static final bn.r b(S2 s22) {
        C3823w3 c3823w3 = C3823w3.f28406a;
        tn.p.j("w3", "access$getTAG$p(...)");
        String str = s22.f26275b;
        return bn.r.f5635a;
    }

    public final void a(final S2 s22) {
        tn.p.k(s22, "click");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: n9.y7
            @Override // java.lang.Runnable
            public final void run() {
                C3475i3.a(s22, this);
            }
        });
    }
}
