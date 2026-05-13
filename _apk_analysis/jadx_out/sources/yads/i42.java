package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class i42 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p000do.p0 f90667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f90669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d4 f90670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j42 f90671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f90672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ry1 f90673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z30 f90674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ mi2 f90675j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i42(d4 d4Var, j42 j42Var, Context context, ry1 ry1Var, z30 z30Var, mi2 mi2Var, hn.c cVar) {
        super(2, cVar);
        this.f90670e = d4Var;
        this.f90671f = j42Var;
        this.f90672g = context;
        this.f90673h = ry1Var;
        this.f90674i = z30Var;
        this.f90675j = mi2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        i42 i42Var = new i42(this.f90670e, this.f90671f, this.f90672g, this.f90673h, this.f90674i, this.f90675j, cVar);
        i42Var.f90669d = obj;
        return i42Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((i42) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r14.f90668c
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L3a
            if (r1 == r5) goto L30
            if (r1 == r4) goto L27
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            kotlin.c.b(r15)
            goto Lbf
        L1a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L22:
            kotlin.c.b(r15)
            goto La9
        L27:
            java.lang.Object r1 = r14.f90669d
            do.p0 r1 = (p000do.p0) r1
            kotlin.c.b(r15)
            goto L9e
        L30:
            do.p0 r1 = r14.f90667b
            java.lang.Object r2 = r14.f90669d
            kotlinx.coroutines.g r2 = (kotlinx.coroutines.g) r2
            kotlin.c.b(r15)
            goto L91
        L3a:
            kotlin.c.b(r15)
            java.lang.Object r15 = r14.f90669d
            do.l0 r15 = (p000do.l0) r15
            yads.d4 r1 = r14.f90670e
            boolean r1 = r1.f88752m
            if (r1 == 0) goto Laa
            yads.f42 r10 = new yads.f42
            yads.j42 r1 = r14.f90671f
            yads.ry1 r2 = r14.f90673h
            yads.mi2 r7 = r14.f90675j
            r10.<init>(r1, r2, r7, r6)
            r8 = 0
            r9 = 0
            r11 = 3
            r12 = 0
            r7 = r15
            kotlinx.coroutines.g r1 = p000do.g.d(r7, r8, r9, r10, r11, r12)
            yads.h42 r10 = new yads.h42
            yads.j42 r2 = r14.f90671f
            android.content.Context r7 = r14.f90672g
            yads.ry1 r8 = r14.f90673h
            r10.<init>(r2, r7, r8, r6)
            r8 = 0
            r7 = r15
            kotlinx.coroutines.g r2 = p000do.g.d(r7, r8, r9, r10, r11, r12)
            yads.g42 r13 = new yads.g42
            yads.j42 r8 = r14.f90671f
            android.content.Context r9 = r14.f90672g
            yads.ry1 r10 = r14.f90673h
            yads.z30 r11 = r14.f90674i
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r8 = 0
            r9 = 0
            r11 = 3
            r7 = r15
            r10 = r13
            do.p0 r15 = p000do.g.b(r7, r8, r9, r10, r11, r12)
            r14.f90669d = r2
            r14.f90667b = r15
            r14.f90668c = r5
            java.lang.Object r1 = r1.C(r14)
            if (r1 != r0) goto L90
            return r0
        L90:
            r1 = r15
        L91:
            r14.f90669d = r1
            r14.f90667b = r6
            r14.f90668c = r4
            java.lang.Object r15 = r2.C(r14)
            if (r15 != r0) goto L9e
            return r0
        L9e:
            r14.f90669d = r6
            r14.f90668c = r3
            java.lang.Object r15 = r1.N(r14)
            if (r15 != r0) goto La9
            return r0
        La9:
            return r15
        Laa:
            yads.j42 r15 = r14.f90671f
            yads.h62 r3 = r15.f91095c
            android.content.Context r5 = r14.f90672g
            yads.ry1 r6 = r14.f90673h
            yads.z30 r7 = r14.f90674i
            r14.f90668c = r2
            r4 = 0
            r8 = r14
            java.lang.Object r15 = r3.a(r4, r5, r6, r7, r8)
            if (r15 != r0) goto Lbf
            return r0
        Lbf:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.i42.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
