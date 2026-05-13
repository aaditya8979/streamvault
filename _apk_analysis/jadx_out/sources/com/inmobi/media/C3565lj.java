package com.inmobi.media;

import android.graphics.Bitmap;
import com.inmobi.media.C3565lj;
import com.squareup.picasso.Picasso;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3565lj extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Cj f27577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3615nj f27578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bitmap.Config f27580e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3565lj(Cj cj2, C3615nj c3615nj, String str, Bitmap.Config config, hn.c cVar) {
        super(2, cVar);
        this.f27577b = cj2;
        this.f27578c = c3615nj;
        this.f27579d = str;
        this.f27580e = config;
    }

    public static final void a(Cj cj2, Bitmap bitmap) {
        cj2.setImageBitmap(bitmap);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3565lj c3565lj = new C3565lj(this.f27577b, this.f27578c, this.f27579d, this.f27580e, cVar);
        c3565lj.f27576a = obj;
        return c3565lj;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3565lj) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws C3331cc {
        Object objM7534constructorimpl;
        C3605n9 c3605n9;
        in.a.g();
        kotlin.c.b(obj);
        C3615nj c3615nj = this.f27578c;
        String str = this.f27579d;
        Bitmap.Config config = this.f27580e;
        try {
            Result.a aVar = Result.Companion;
            Picasso picasso = Qf.f26183a;
            objM7534constructorimpl = Result.m7534constructorimpl(Qf.b(c3615nj.f27702a).load(str).tag(c3615nj.f27704c).transform(new Lf(config)).get());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        C3615nj c3615nj2 = this.f27578c;
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl != null && (c3605n9 = c3615nj2.f27703b) != null) {
            c3605n9.b("StaticCompanionLoader", "Companion Load Exception: " + thM7537exceptionOrNullimpl.getMessage());
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        final Bitmap bitmap = (Bitmap) objM7534constructorimpl;
        if (bitmap == null) {
            throw new C3331cc("Companion Load Error");
        }
        final Cj cj2 = this.f27577b;
        return jn.a.a(cj2.post(new Runnable() { // from class: n9.m9
            @Override // java.lang.Runnable
            public final void run() {
                C3565lj.a(cj2, bitmap);
            }
        }));
    }
}
