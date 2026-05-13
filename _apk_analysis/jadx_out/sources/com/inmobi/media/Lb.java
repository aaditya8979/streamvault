package com.inmobi.media;

import com.ironsource.Y5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Lb {
    public static ArrayList a() {
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f25950a;
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = Mb.f25950a.iterator();
            while (it.hasNext()) {
                Gh gh2 = (Gh) ((WeakReference) it.next()).get();
                if (gh2 != null) {
                    arrayList.add(gh2);
                }
            }
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mb.f25950a;
        arrayList.toString();
        return arrayList;
    }

    public static void a(Gh gh2) {
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f25950a;
        Objects.toString(gh2);
        if (gh2 == null) {
            return;
        }
        try {
            Iterator it = Mb.f25950a.iterator();
            tn.p.j(it, "iterator(...)");
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || tn.p.f(weakReference.get(), gh2)) {
                    Mb.f25950a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    public static boolean a(String str) {
        tn.p.k(str, Y5.c.f30724b);
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f25950a;
        try {
            Iterator it = Mb.f25950a.iterator();
            while (it.hasNext()) {
                Gh gh2 = (Gh) ((WeakReference) it.next()).get();
                if (tn.p.f(gh2 != null ? gh2.f25541j : null, str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
            return false;
        }
    }

    public static void b(Gh gh2) {
        tn.p.k(gh2, "logger");
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f25950a;
        Objects.toString(gh2);
        Mb.f25950a.add(new WeakReference(gh2));
    }
}
