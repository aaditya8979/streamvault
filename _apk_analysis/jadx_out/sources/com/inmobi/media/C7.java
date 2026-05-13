package com.inmobi.media;

import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class C7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7 f25248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f25249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7(N7 n72, ArrayList arrayList, hn.c cVar) {
        super(2, cVar);
        this.f25248b = n72;
        this.f25249c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C7(this.f25248b, this.f25249c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C7(this.f25248b, this.f25249c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25247a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            N7 n72 = this.f25248b;
            if (!n72.f25997f.get()) {
                n72.f25997f.set(true);
                if (tn.p.f(Looper.myLooper(), Looper.getMainLooper())) {
                    n72.f26007p.addListener(n72.B);
                } else {
                    p000do.i.d(n72.f25994c, null, null, new C3727s7(null, n72), 3, null);
                }
            }
            this.f25248b.f26012u = System.currentTimeMillis();
            N7 n73 = this.f25248b;
            ExoPlayer exoPlayer = n73.f26007p;
            ArrayList arrayList = this.f25249c;
            InterfaceC3580m9 interfaceC3580m9 = n73.f25993b;
            K2 k22 = n73.f26014w;
            boolean zIsCache = n73.f25992a.isCache();
            this.f25247a = 1;
            obj = Mm.a(exoPlayer, arrayList, interfaceC3580m9, k22, zIsCache, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        this.f25248b.a((AbstractC3378e8) obj);
        return bn.r.f5635a;
    }
}
