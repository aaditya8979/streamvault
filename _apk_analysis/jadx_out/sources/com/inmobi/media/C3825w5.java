package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3825w5 extends SuspendLambda implements sn.p {
    public C3825w5(hn.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3825w5(cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3825w5((hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        in.a.g();
        kotlin.c.b(obj);
        try {
            context = Ji.f25747a;
        } catch (Exception e10) {
            C3850x5 c3850x5 = C3850x5.f28483a;
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
        if (context == null) {
            return bn.r.f5635a;
        }
        Object systemService = context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null) {
            return bn.r.f5635a;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        C3850x5 c3850x52 = C3850x5.f28483a;
        C3850x5.f28495m = memoryInfo.lowMemory;
        return bn.r.f5635a;
    }
}
