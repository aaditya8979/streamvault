package com.inmobi.media;

import android.content.Context;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Mf extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mo.a f25959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f25960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f25963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mf(Context context, hn.c cVar) {
        super(2, cVar);
        this.f25963e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        Mf mf2 = new Mf(this.f25963e, cVar);
        mf2.f25962d = obj;
        return mf2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        Mf mf2 = new Mf(this.f25963e, (hn.c) obj2);
        mf2.f25962d = (p000do.l0) obj;
        return mf2.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mo.a aVar;
        Context context;
        WeakReference weakReference;
        Object objG = in.a.g();
        int i10 = this.f25961c;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f25962d;
            aVar = Qf.f26184b;
            Context context2 = this.f25963e;
            this.f25962d = l0Var;
            this.f25959a = aVar;
            this.f25960b = context2;
            this.f25961c = 1;
            if (aVar.c(null, this) == objG) {
                return objG;
            }
            context = context2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = this.f25960b;
            aVar = this.f25959a;
            kotlin.c.b(obj);
        }
        int i11 = 0;
        try {
            int size = Qf.f26185c.size();
            while (true) {
                if (i11 >= size) {
                    weakReference = null;
                    break;
                }
                ArrayList arrayList = Qf.f26185c;
                if (tn.p.f((Context) ((WeakReference) arrayList.get(i11)).get(), context)) {
                    weakReference = (WeakReference) arrayList.get(i11);
                    break;
                }
                i11++;
            }
            if (weakReference == null) {
                Qf.f26185c.add(new WeakReference(context));
            }
            Picasso picassoA = Qf.f26183a;
            if (picassoA == null) {
                Ji.a(context, Qf.f26186d);
                picassoA = Qf.a(context);
                Qf.f26183a = picassoA;
            }
            return picassoA;
        } finally {
            aVar.d(null);
        }
    }
}
