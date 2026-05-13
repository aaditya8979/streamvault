package com.inmobi.media;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3476i4 f26611a = new C3476i4(new C3525k4(), new C3500j4(A9.f25147c));

    public static void a(String str, InterfaceC3724s4 interfaceC3724s4) {
        tn.p.k(str, "type");
        tn.p.k(interfaceC3724s4, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C3476i4 c3476i4 = f26611a;
        c3476i4.getClass();
        tn.p.k(str, "type");
        tn.p.k(interfaceC3724s4, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        LinkedHashMap linkedHashMap = c3476i4.f27329a.f27445c;
        Object concurrentLinkedQueue = linkedHashMap.get(str);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            linkedHashMap.put(str, concurrentLinkedQueue);
        }
        ((ConcurrentLinkedQueue) concurrentLinkedQueue).add(new WeakReference(interfaceC3724s4));
    }
}
