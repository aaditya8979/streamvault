package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class sh2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qq1 f94824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediatedAdapterPrefetcher f94825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xh2 f94827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cs1 f94828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f94829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e00 f94830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f94831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a03 f94832j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh2(xh2 xh2Var, cs1 cs1Var, Context context, e00 e00Var, long j10, a03 a03Var, hn.c cVar) {
        super(2, cVar);
        this.f94827e = xh2Var;
        this.f94828f = cs1Var;
        this.f94829g = context;
        this.f94830h = e00Var;
        this.f94831i = j10;
        this.f94832j = a03Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new sh2(this.f94827e, this.f94828f, this.f94829g, this.f94830h, this.f94831i, this.f94832j, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((sh2) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2 A[Catch: all -> 0x001a, Exception -> 0x00d1, TRY_LEAVE, TryCatch #3 {all -> 0x001a, blocks: (B:6:0x0012, B:28:0x00a9, B:30:0x00c2, B:38:0x00d9), top: B:47:0x0012 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.sh2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
