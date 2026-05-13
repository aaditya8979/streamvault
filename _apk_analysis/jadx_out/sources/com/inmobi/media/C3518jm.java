package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3518jm extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3643om f27430c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3518jm(C3643om c3643om, hn.c cVar) {
        super(2, cVar);
        this.f27430c = c3643om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3518jm c3518jm = new C3518jm(this.f27430c, cVar);
        c3518jm.f27429b = obj;
        return c3518jm;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        C3518jm c3518jm = new C3518jm(this.f27430c, (hn.c) obj2);
        c3518jm.f27429b = (Rl) obj;
        return c3518jm.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objG = in.a.g();
        int i10 = this.f27428a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            Rl rl2 = (Rl) this.f27429b;
            go.k kVar = this.f27430c.f27807d;
            this.f27429b = rl2;
            this.f27428a = 1;
            if (kVar.emit(rl2, this) == objG) {
                return objG;
            }
            obj2 = rl2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = (Rl) this.f27429b;
            kotlin.c.b(obj);
        }
        C3694qn c3694qn = this.f27430c.f27806c.f27898g;
        tn.p.k(obj2, "mediaEvent");
        if (obj2 instanceof Bm) {
            Map mapA = AbstractC3491ik.a(c3694qn.f28000a);
            Wj wj2 = Wj.f26549a;
            Wj.b("VideoLoadStarted", mapA, EnumC3287ak.f26805a);
        } else if (obj2 instanceof Em) {
            Map mapA2 = AbstractC3491ik.a(c3694qn.f28000a);
            Wj wj3 = Wj.f26549a;
            Wj.b("VideoLoadSuccess", mapA2, EnumC3287ak.f26805a);
        } else if (obj2 instanceof C3544kn) {
            boolean[] zArr = c3694qn.f28001b;
            if (!zArr[0]) {
                zArr[0] = true;
                Map mapA3 = AbstractC3491ik.a(c3694qn.f28000a);
                Wj wj4 = Wj.f26549a;
                Wj.b("VideoStart", mapA3, EnumC3287ak.f26805a);
            }
        } else if (obj2 instanceof C3867xm) {
            boolean[] zArr2 = c3694qn.f28001b;
            if (!zArr2[1]) {
                zArr2[1] = true;
                Map mapA4 = AbstractC3491ik.a(c3694qn.f28000a);
                Wj wj5 = Wj.f26549a;
                Wj.b("VideoFirstQuartile", mapA4, EnumC3287ak.f26805a);
            }
        } else if (obj2 instanceof C3494in) {
            boolean[] zArr3 = c3694qn.f28001b;
            if (!zArr3[2]) {
                zArr3[2] = true;
                Map mapA5 = AbstractC3491ik.a(c3694qn.f28000a);
                Wj wj6 = Wj.f26549a;
                Wj.b("VideoSecondQuartile", mapA5, EnumC3287ak.f26805a);
            }
        } else if (obj2 instanceof C3718rn) {
            boolean[] zArr4 = c3694qn.f28001b;
            if (!zArr4[3]) {
                zArr4[3] = true;
                Map mapA6 = AbstractC3491ik.a(c3694qn.f28000a);
                Wj wj7 = Wj.f26549a;
                Wj.b("VideoThirdQuartile", mapA6, EnumC3287ak.f26805a);
            }
        } else if (obj2 instanceof Pl) {
            boolean[] zArr5 = c3694qn.f28001b;
            if (!zArr5[4]) {
                zArr5[4] = true;
                Map mapA7 = AbstractC3491ik.a(c3694qn.f28000a);
                Wj wj8 = Wj.f26549a;
                Wj.b("VideoComplete", mapA7, EnumC3287ak.f26805a);
            }
        } else if (obj2 instanceof Ql) {
            ((Ql) obj2).getClass();
            Map mapC = kotlin.collections.a.C(AbstractC3491ik.a(c3694qn.f28000a));
            mapC.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 66);
            Wj wj9 = Wj.f26549a;
            Wj.b("VideoLoadFailure", mapC, EnumC3287ak.f26805a);
        }
        Ml ml2 = this.f27430c.f27806c.f27897f;
        tn.p.k(obj2, "mediaEvent");
        if (obj2 instanceof Em) {
            ml2.f25975a.f25954d = AbstractC3468hl.a(((Em) obj2).f25403a);
            ml2.f25976b.f25900f.a(Te.f26356a);
        } else if (obj2 instanceof Ql) {
            ((Ql) obj2).getClass();
            ml2.f25976b.f25906l.a(new Fo(cn.p0.g(bn.h.a("[ERRORCODE]", String.valueOf(405))), null, 2));
        } else if (obj2 instanceof C3544kn) {
            ml2.f25976b.f25901g.a(Te.f26356a);
        } else if (obj2 instanceof C3470hn) {
            ml2.f25976b.f25905k.a(Te.f26356a);
        } else if (obj2 instanceof Om) {
            ml2.f25976b.f25904j.a(Te.f26356a);
        } else if (obj2 instanceof C3867xm) {
            ml2.f25976b.f25896b.a(Te.f26356a);
        } else if (obj2 instanceof C3494in) {
            ml2.f25976b.f25897c.a(Te.f26356a);
        } else if (obj2 instanceof C3718rn) {
            ml2.f25976b.f25898d.a(Te.f26356a);
        } else if (obj2 instanceof Pl) {
            ml2.f25976b.f25899e.a(Te.f26356a);
        } else if (obj2 instanceof Xm) {
            ml2.f25975a.f25955e = ((Xm) obj2).f26602a;
            ml2.f25976b.f25907m.a(Te.f26356a);
        } else if (obj2 instanceof S1) {
            if (((S1) obj2).f26272a) {
                ml2.f25976b.f25902h.a(Te.f26356a);
            } else {
                ml2.f25976b.f25903i.a(Te.f26356a);
            }
        } else if (obj2 instanceof W3) {
            ml2.f25976b.f25908n.a(new Fo(null, ((W3) obj2).f26519a, 1));
        }
        return bn.r.f5635a;
    }
}
