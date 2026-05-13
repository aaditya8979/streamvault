package qq;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: HashSessionIdManager.java */
/* JADX INFO: loaded from: classes8.dex */
public class d extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map<String, Set<WeakReference<an.e>>> f78406p = new HashMap();

    @Override // mq.s
    public void A(String str) {
        Set<WeakReference<an.e>> setRemove;
        synchronized (this) {
            setRemove = this.f78406p.remove(str);
        }
        if (setRemove != null) {
            Iterator<WeakReference<an.e>> it = setRemove.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next().get();
                if (aVar != null && aVar.v()) {
                    aVar.invalidate();
                }
            }
            setRemove.clear();
        }
    }

    @Override // mq.s
    public String F(String str, an.a aVar) {
        String str2 = aVar == null ? null : (String) aVar.getAttribute("org.eclipse.jetty.ajp.JVMRoute");
        if (str2 != null) {
            return str + '.' + str2;
        }
        if (this.f78387m == null) {
            return str;
        }
        return str + '.' + this.f78387m;
    }

    @Override // mq.s
    public boolean J(String str) {
        boolean zContainsKey;
        synchronized (this) {
            zContainsKey = this.f78406p.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // mq.s
    public void Q(an.e eVar) {
        String strC0 = c0(eVar.getId());
        WeakReference<an.e> weakReference = new WeakReference<>(eVar);
        synchronized (this) {
            Set<WeakReference<an.e>> hashSet = this.f78406p.get(strC0);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.f78406p.put(strC0, hashSet);
            }
            hashSet.add(weakReference);
        }
    }

    @Override // mq.s
    public void X(an.e eVar) {
        String strC0 = c0(eVar.getId());
        synchronized (this) {
            Set<WeakReference<an.e>> set = this.f78406p.get(strC0);
            if (set != null) {
                Iterator<WeakReference<an.e>> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    an.e eVar2 = it.next().get();
                    if (eVar2 == null) {
                        it.remove();
                    } else if (eVar2 == eVar) {
                        it.remove();
                        break;
                    }
                }
                if (set.isEmpty()) {
                    this.f78406p.remove(strC0);
                }
            }
        }
    }

    @Override // mq.s
    public String c0(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
    }

    @Override // qq.b, uq.a
    public void d0() throws Exception {
        super.d0();
    }

    @Override // qq.b, uq.a
    public void e0() throws Exception {
        this.f78406p.clear();
        super.e0();
    }
}
