package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.g;

/* JADX INFO: renamed from: com.inmobi.media.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3502j6 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3552l6 f27385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f27386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f27387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3502j6(C3552l6 c3552l6, boolean z10, Ref$ObjectRef ref$ObjectRef, hn.c cVar) {
        super(1, cVar);
        this.f27385b = c3552l6;
        this.f27386c = z10;
        this.f27387d = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3502j6(this.f27385b, this.f27386c, this.f27387d, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ((C3502j6) create((hn.c) obj)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27384a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                C3552l6 c3552l6 = this.f27385b;
                boolean z10 = this.f27386c;
                this.f27384a = 1;
                if (C3552l6.a(c3552l6, z10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
        } catch (Exception unused) {
            kotlinx.coroutines.g gVar = (kotlinx.coroutines.g) this.f27387d.element;
            if (gVar != null) {
                g.a.a(gVar, null, 1, null);
            }
        }
        return bn.r.f5635a;
    }
}
