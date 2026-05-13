package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3767tm extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3667pl f28201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3667pl f28203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f28204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pe f28205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f28206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AdConfig.VastVideoConfig f28207g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3767tm(C3667pl c3667pl, double d10, Pe pe2, int i10, AdConfig.VastVideoConfig vastVideoConfig, hn.c cVar) {
        super(2, cVar);
        this.f28203c = c3667pl;
        this.f28204d = d10;
        this.f28205e = pe2;
        this.f28206f = i10;
        this.f28207g = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3767tm(this.f28203c, this.f28204d, this.f28205e, this.f28206f, this.f28207g, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3767tm) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C3667pl c3667pl;
        Object objG = in.a.g();
        int i10 = this.f28202b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3667pl c3667pl2 = this.f28203c;
            double d10 = this.f28204d;
            Pe pe2 = this.f28205e;
            int i11 = this.f28206f;
            AdConfig.VastVideoConfig vastVideoConfig = this.f28207g;
            this.f28201a = c3667pl2;
            this.f28202b = 1;
            Object objA = AbstractC3842wm.a(c3667pl2, d10, pe2, i11, vastVideoConfig, this);
            if (objA == objG) {
                return objG;
            }
            c3667pl = c3667pl2;
            obj = objA;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3667pl = this.f28201a;
            kotlin.c.b(obj);
        }
        return bn.h.a(c3667pl, obj);
    }
}
