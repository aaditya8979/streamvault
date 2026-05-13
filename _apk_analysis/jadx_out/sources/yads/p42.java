package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes12.dex */
public final class p42 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p000do.p0 f93423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f93424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f93425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f93426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hz1 f93427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jz1 f93428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q42 f93429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d4 f93430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ry1 f93431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z30 f93432k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p42(Context context, hz1 hz1Var, jz1 jz1Var, q42 q42Var, d4 d4Var, ry1 ry1Var, z30 z30Var, hn.c cVar) {
        super(2, cVar);
        this.f93426e = context;
        this.f93427f = hz1Var;
        this.f93428g = jz1Var;
        this.f93429h = q42Var;
        this.f93430i = d4Var;
        this.f93431j = ry1Var;
        this.f93432k = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        p42 p42Var = new p42(this.f93426e, this.f93427f, this.f93428g, this.f93429h, this.f93430i, this.f93431j, this.f93432k, cVar);
        p42Var.f93425d = obj;
        return p42Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((p42) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r14.f93424c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r0 = r14.f93425d
            yads.mi2 r0 = (yads.mi2) r0
            kotlin.c.b(r15)
            r3 = r0
            goto L80
        L18:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L20:
            do.p0 r1 = r14.f93423b
            java.lang.Object r3 = r14.f93425d
            yads.mi2 r3 = (yads.mi2) r3
            kotlin.c.b(r15)
            r11 = r1
            r1 = r3
            goto L72
        L2c:
            kotlin.c.b(r15)
            java.lang.Object r15 = r14.f93425d
            do.l0 r15 = (p000do.l0) r15
            yads.mi2 r1 = new yads.mi2
            android.content.Context r5 = r14.f93426e
            r1.<init>(r5)
            yads.o42 r13 = new yads.o42
            yads.q42 r6 = r14.f93429h
            yads.d4 r7 = r14.f93430i
            android.content.Context r8 = r14.f93426e
            yads.ry1 r9 = r14.f93431j
            yads.z30 r11 = r14.f93432k
            r12 = 0
            r5 = r13
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r6 = 0
            r7 = 0
            r9 = 3
            r10 = 0
            r5 = r15
            r8 = r13
            do.p0 r11 = p000do.g.b(r5, r6, r7, r8, r9, r10)
            yads.n42 r8 = new yads.n42
            yads.q42 r5 = r14.f93429h
            yads.ry1 r6 = r14.f93431j
            r8.<init>(r5, r6, r4)
            r6 = 0
            r5 = r15
            kotlinx.coroutines.g r15 = p000do.g.d(r5, r6, r7, r8, r9, r10)
            r14.f93425d = r1
            r14.f93423b = r11
            r14.f93424c = r3
            java.lang.Object r15 = r15.C(r14)
            if (r15 != r0) goto L72
            return r0
        L72:
            r14.f93425d = r1
            r14.f93423b = r4
            r14.f93424c = r2
            java.lang.Object r15 = r11.N(r14)
            if (r15 != r0) goto L7f
            return r0
        L7f:
            r3 = r1
        L80:
            r2 = r15
            yads.ry1 r2 = (yads.ry1) r2
            if (r2 != 0) goto L8d
            yads.hz1 r15 = r14.f93427f
            yads.l4 r0 = yads.h9.f90304w
            r15.a(r0)
            goto Lab
        L8d:
            yads.jz1 r5 = r14.f93428g
            yads.w5 r15 = r5.f91431b
            yads.v5 r0 = yads.v5.f95935n
            r15.a(r0)
            yads.kz1 r4 = r5.f91432c
            yads.mz1 r1 = r4.f91811g
            do.l0 r15 = r1.f92662d
            yads.iz1 r9 = new yads.iz1
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7 = 0
            r8 = 0
            r10 = 3
            r11 = 0
            r6 = r15
            p000do.g.d(r6, r7, r8, r9, r10, r11)
        Lab:
            bn.r r15 = bn.r.f5635a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.p42.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
