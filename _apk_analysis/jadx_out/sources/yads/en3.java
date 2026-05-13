package yads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes7.dex */
public final class en3 implements no2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f89325a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bq2 f89326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tr f89327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockingQueue f89328d;

    public en3(tr trVar, PriorityBlockingQueue priorityBlockingQueue, bq2 bq2Var) {
        this.f89326b = bq2Var;
        this.f89327c = trVar;
        this.f89328d = priorityBlockingQueue;
    }

    public final void a(po2 po2Var, vp2 vp2Var) {
        List list;
        lr lrVar = vp2Var.f96162b;
        if (lrVar != null) {
            if (lrVar.f92068e >= System.currentTimeMillis()) {
                String strC = po2Var.c();
                synchronized (this) {
                    list = (List) this.f89325a.remove(strC);
                }
                if (list != null) {
                    if (lm3.f92036a) {
                        list.size();
                        boolean z10 = ad1.f87661a;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((gn0) this.f89326b).a((po2) it.next(), vp2Var, null);
                    }
                    return;
                }
                return;
            }
        }
        b(po2Var);
    }

    public final synchronized boolean a(po2 po2Var) {
        String strC = po2Var.c();
        if (!this.f89325a.containsKey(strC)) {
            this.f89325a.put(strC, null);
            po2Var.a((no2) this);
            if (lm3.f92036a) {
                boolean z10 = ad1.f87661a;
            }
            return false;
        }
        List arrayList = (List) this.f89325a.get(strC);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        po2Var.a("waiting-for-response");
        arrayList.add(po2Var);
        this.f89325a.put(strC, arrayList);
        if (lm3.f92036a) {
            boolean z11 = ad1.f87661a;
        }
        return true;
    }

    public final synchronized void b(po2 po2Var) {
        BlockingQueue blockingQueue;
        String strC = po2Var.c();
        List list = (List) this.f89325a.remove(strC);
        if (list != null && !list.isEmpty()) {
            if (lm3.f92036a) {
                list.size();
                boolean z10 = ad1.f87661a;
            }
            po2 po2Var2 = (po2) list.remove(0);
            this.f89325a.put(strC, list);
            po2Var2.a((no2) this);
            if (this.f89327c != null && (blockingQueue = this.f89328d) != null) {
                try {
                    blockingQueue.put(po2Var2);
                } catch (InterruptedException unused) {
                    boolean z11 = ad1.f87661a;
                    Thread.currentThread().interrupt();
                    tr trVar = this.f89327c;
                    trVar.f95329f = true;
                    trVar.interrupt();
                }
            }
        }
    }
}
