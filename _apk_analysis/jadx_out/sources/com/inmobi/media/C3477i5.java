package com.inmobi.media;

import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3477i5 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3501j5 f27332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f27336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f27337g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3477i5(C3501j5 c3501j5, int i10, int i11, int i12, int i13, int i14, hn.c cVar) {
        super(2, cVar);
        this.f27332b = c3501j5;
        this.f27333c = i10;
        this.f27334d = i11;
        this.f27335e = i12;
        this.f27336f = i13;
        this.f27337g = i14;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3477i5 c3477i5 = new C3477i5(this.f27332b, this.f27333c, this.f27334d, this.f27335e, this.f27336f, this.f27337g, cVar);
        c3477i5.f27331a = obj;
        return c3477i5;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3477i5) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        Drawable drawable = ContextCompat.getDrawable(this.f27332b.getContext(), this.f27333c);
        if (drawable != null) {
            this.f27332b.a(drawable, this.f27334d, this.f27335e, this.f27336f, this.f27337g);
            return bn.r.f5635a;
        }
        C3501j5 c3501j5 = this.f27332b;
        InterfaceC3580m9 interfaceC3580m9 = c3501j5.f27383b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("CustomView", "CustomView drawable for " + ((int) c3501j5.f27382a) + " cannot be created");
        }
        return bn.r.f5635a;
    }
}
