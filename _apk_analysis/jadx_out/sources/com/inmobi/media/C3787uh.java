package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3787uh extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ref$ObjectRef f28279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3812vh f28282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3787uh(C3812vh c3812vh, hn.c cVar) {
        super(2, cVar);
        this.f28282e = c3812vh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3787uh c3787uh = new C3787uh(this.f28282e, cVar);
        c3787uh.f28281d = obj;
        return c3787uh;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        C3787uh c3787uh = new C3787uh(this.f28282e, (hn.c) obj2);
        c3787uh.f28281d = (go.e) obj;
        return c3787uh.invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        go.e eVar;
        String str;
        Ref$ObjectRef ref$ObjectRef;
        Object objG = in.a.g();
        int i10 = this.f28280c;
        if (i10 == 0) {
            kotlin.c.b(obj);
            eVar = (go.e) this.f28281d;
            str = Ji.f25749c;
            if (str == null) {
                return bn.r.f5635a;
            }
            ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = C3812vh.a(this.f28282e);
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = this.f28279b;
            str = this.f28278a;
            eVar = (go.e) this.f28281d;
            kotlin.c.b(obj);
        }
        String str2 = str;
        go.e eVar2 = eVar;
        while (!((Collection) ref$ObjectRef.element).isEmpty()) {
            List list = (List) ref$ObjectRef.element;
            ref$ObjectRef.element = cn.w.m();
            Bh bh2 = (Bh) this.f28282e.f28372b.getValue();
            C3476i4 c3476i4 = Y3.f26611a;
            tn.p.k(RootConfig.class, "clazz");
            RootConfig rootConfig = (RootConfig) Y3.f26611a.a(RootConfig.class);
            bh2.getClass();
            tn.p.k(str2, "accountId");
            tn.p.k(rootConfig, "rootConfig");
            tn.p.k(list, "configRequestContexts");
            go.d dVarJ = go.f.j(new C3887yh(list, bh2, str2, rootConfig, null));
            C3762th c3762th = new C3762th(this.f28282e, eVar2, ref$ObjectRef);
            this.f28281d = eVar2;
            this.f28278a = str2;
            this.f28279b = ref$ObjectRef;
            this.f28280c = 1;
            if (dVarJ.collect(c3762th, this) == objG) {
                return objG;
            }
        }
        return bn.r.f5635a;
    }
}
