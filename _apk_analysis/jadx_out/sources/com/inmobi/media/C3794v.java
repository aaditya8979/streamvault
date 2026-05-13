package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3794v extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3819w f28298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Cj f28300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3794v(C3819w c3819w, String str, Cj cj2, hn.c cVar) {
        super(2, cVar);
        this.f28298b = c3819w;
        this.f28299c = str;
        this.f28300d = cj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3794v(this.f28298b, this.f28299c, this.f28300d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3794v) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28297a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return obj;
        }
        kotlin.c.b(obj);
        C3819w c3819w = this.f28298b;
        String str = this.f28299c;
        Cj cj2 = this.f28300d;
        this.f28297a = 1;
        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(this), 1);
        cVar.K();
        cVar.P(new C3744t(c3819w));
        Picasso picasso = Qf.f26183a;
        Qf.b(c3819w.f28397a).load(str).tag(c3819w.f28401e).transform(new Lf(Bitmap.Config.RGB_565)).into(cj2, new C3769u(c3819w, cVar));
        Object objB = cVar.B();
        if (objB == in.a.g()) {
            jn.f.c(this);
        }
        return objB == objG ? objG : objB;
    }
}
