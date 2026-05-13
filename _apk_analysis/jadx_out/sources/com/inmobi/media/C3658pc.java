package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3658pc extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3683qc f27862b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3658pc(C3683qc c3683qc, hn.c cVar) {
        super(2, cVar);
        this.f27862b = c3683qc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3658pc(this.f27862b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3658pc(this.f27862b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object objA;
        Object objG = in.a.g();
        int i10 = this.f27861a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3683qc c3683qc = this.f27862b;
            String str3 = c3683qc.f27963a;
            int i11 = c3683qc.f27964b;
            int i12 = c3683qc.f27965c;
            zn.i iVar = Se.f26314a;
            c3683qc.f27969g = new Je(str3, null, null, null, new Ai(i11, i12 * 1000, 0), false, 46);
            C3683qc c3683qc2 = this.f27862b;
            Je je2 = c3683qc2.f27969g;
            Context context = Ji.f25747a;
            if (context != null) {
                tn.p.k(context, GAMConfig.KEY_CONTEXT);
                tn.p.k("mraid_js_store", "sharePrefFile");
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea eaA = Da.a(context, "mraid_js_store");
                tn.p.k("last_ts", "key");
                long j10 = eaA.f25373a.getLong("last_ts", 0L);
                str = "key";
                str2 = "last_ts";
                if ((System.currentTimeMillis() / ((long) 1000)) - j10 > c3683qc2.f27966d && je2 != null) {
                    C3779u9 c3779u9 = (C3779u9) He.f25608c.getValue();
                    this.f27861a = 1;
                    objA = c3779u9.f28245a.a(je2, this);
                    if (objA == objG) {
                        return objG;
                    }
                }
            }
            return bn.r.f5635a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        objA = obj;
        str = "key";
        str2 = "last_ts";
        Ne ne2 = (Ne) objA;
        Context context2 = Ji.f25747a;
        if (!AbstractC3443gl.a(ne2)) {
            C3683qc c3683qc3 = this.f27862b;
            InterfaceC3580m9 interfaceC3580m9 = c3683qc3.f27967e;
            if (interfaceC3580m9 != null) {
                String str4 = c3683qc3.f27968f;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str4, "Getting MRAID Js from server failed.");
            }
        } else if (context2 != null) {
            tn.p.k(context2, GAMConfig.KEY_CONTEXT);
            tn.p.k("mraid_js_store", "sharePrefFile");
            ConcurrentHashMap concurrentHashMap2 = Ea.f25372b;
            Ea eaA2 = Da.a(context2, "mraid_js_store");
            zn.i iVar2 = Se.f26314a;
            tn.p.k(ne2, "<this>");
            String strString = ne2.d().string(bo.c.f5639b);
            tn.p.k("mraid_js_string", str);
            tn.p.k(strString, "value");
            eaA2.a("mraid_js_string", strString, false);
            eaA2.a(str2, System.currentTimeMillis() / ((long) 1000), false);
        }
        return bn.r.f5635a;
    }
}
