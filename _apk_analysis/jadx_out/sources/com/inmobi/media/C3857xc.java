package com.inmobi.media;

import com.inmobi.media.C3857xc;
import com.inmobi.media.I2;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.inmobi.media.xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3857xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f28513a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f28514b;

    public C3857xc() {
        tn.p.k("MultiEventBus", "name");
        this.f28514b = Executors.newSingleThreadExecutor(new B9("MultiEventBus", false));
    }

    public static final void a(I2 i22, C3857xc c3857xc) {
        int i10 = i22.f25635a;
        c3857xc.a(i22);
    }

    public static final boolean a(int[] iArr, I2 i22) {
        tn.p.k(i22, "event");
        return cn.r.N(iArr, i22.f25635a);
    }

    public final void a(I2 i22) {
        sn.l lVar;
        Set<Map.Entry> setEntrySet = this.f28513a.entrySet();
        tn.p.j(setEntrySet, "<get-entries>(...)");
        for (Map.Entry entry : setEntrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.f28513a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> setEntrySet2 = this.f28513a.entrySet();
        tn.p.j(setEntrySet2, "<get-entries>(...)");
        for (Map.Entry entry2 : setEntrySet2) {
            tn.p.h(entry2);
            Object key = entry2.getKey();
            tn.p.j(key, "component1(...)");
            sn.l lVar2 = (sn.l) key;
            Object value = entry2.getValue();
            tn.p.j(value, "component2(...)");
            WeakReference weakReference = (WeakReference) value;
            try {
                if (((Boolean) lVar2.invoke(i22)).booleanValue() && (lVar = (sn.l) weakReference.get()) != null) {
                    lVar.invoke(i22);
                }
            } catch (Exception e10) {
                bn.g gVar = P9.f26117a;
                AbstractC3481i9.a(e10);
            }
        }
    }

    public final void a(sn.l lVar) {
        tn.p.k(lVar, "subscriber");
        Iterator it = this.f28513a.entrySet().iterator();
        while (it.hasNext()) {
            if (tn.p.f(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), lVar)) {
                it.remove();
            }
        }
    }

    public final void a(final int[] iArr, sn.l lVar) {
        tn.p.k(iArr, "eventIds");
        tn.p.k(lVar, "subscriber");
        this.f28513a.put(new sn.l() { // from class: n9.jc
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C3857xc.a(iArr, (I2) obj));
            }
        }, new WeakReference(lVar));
    }

    public final void b(final I2 i22) {
        tn.p.k(i22, "event");
        try {
            this.f28514b.execute(new Runnable() { // from class: n9.kc
                @Override // java.lang.Runnable
                public final void run() {
                    C3857xc.a(i22, this);
                }
            });
        } catch (InternalError unused) {
            int i10 = i22.f25635a;
            a(i22);
        }
    }
}
