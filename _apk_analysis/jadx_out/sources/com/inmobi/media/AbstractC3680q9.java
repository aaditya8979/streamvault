package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3680q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f27953a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f27954b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3630o9 f27955c = new C3630o9();

    public static void a(Jb jb2) {
        tn.p.k(jb2, "finishListener");
        if (!f27954b.getAndSet(true)) {
            AbstractC3492il.a(new C3655p9(null));
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = f27953a;
        copyOnWriteArrayList.add(new WeakReference(jb2));
        try {
            for (WeakReference weakReference : copyOnWriteArrayList) {
                if (weakReference.get() == null) {
                    f27953a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }
}
