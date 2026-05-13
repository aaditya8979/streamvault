package com.inmobi.media;

import java.nio.charset.Charset;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okio.ByteString;

/* JADX INFO: renamed from: com.inmobi.media.fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3420fo extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3580m9 f27195c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3420fo(String str, InterfaceC3580m9 interfaceC3580m9, hn.c cVar) {
        super(2, cVar);
        this.f27194b = str;
        this.f27195c = interfaceC3580m9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3420fo(this.f27194b, this.f27195c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3420fo(this.f27194b, this.f27195c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C3317bo c3317bo;
        Object objG = in.a.g();
        int i10 = this.f27193a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            jo joVar = jo.f27432a;
            p000do.p0 p0VarA = jo.a(this.f27194b, this.f27195c);
            this.f27193a = 1;
            obj = p0VarA.N(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        Ne ne2 = (Ne) obj;
        jo joVar2 = jo.f27432a;
        if (ne2 != null && AbstractC3443gl.a(ne2)) {
            ByteString byteStringD = ne2.d();
            Charset charset = bo.c.f5639b;
            if (byteStringD.string(charset).length() > 0 && (c3317bo = jo.f27434c) != null) {
                String str = this.f27194b;
                zn.i iVar = Se.f26314a;
                tn.p.k(ne2, "<this>");
                String strString = ne2.d().string(charset);
                InterfaceC3580m9 interfaceC3580m9 = this.f27195c;
                String str2 = this.f27194b;
                if (interfaceC3580m9 != null) {
                    ((C3605n9) interfaceC3580m9).c("WebResourceHandler", "downloadResourceAndSaveToCache() response received: " + str2);
                }
                bn.r rVar = bn.r.f5635a;
                jn.a.a(c3317bo.a(str, strString, this.f27195c));
            }
        }
        return ne2;
    }
}
