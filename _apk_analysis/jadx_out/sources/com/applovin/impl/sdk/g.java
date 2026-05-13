package com.applovin.impl.sdk;

import com.applovin.impl.l1;
import com.applovin.impl.y2;
import com.ironsource.C4157n2;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f10041b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10042c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f10043d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10044e = new Object();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f10048d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f10049e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f10050f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f10051g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f10052h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ArrayDeque f10053i;

        private b(y2 y2Var, c cVar) {
            this.f10053i = new ArrayDeque();
            this.f10045a = y2Var.getAdUnitId();
            this.f10046b = y2Var.getFormat().getLabel();
            this.f10047c = y2Var.c();
            this.f10048d = y2Var.b();
            this.f10049e = y2Var.z();
            this.f10050f = y2Var.B();
            this.f10051g = y2Var.getCreativeId();
            a(cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f10052h = System.currentTimeMillis();
            this.f10053i.add(cVar);
        }

        public String a() {
            return this.f10045a;
        }

        public String b() {
            return this.f10048d;
        }

        public String c() {
            return this.f10047c;
        }

        public String d() {
            return this.f10049e;
        }

        public String e() {
            return this.f10050f;
        }

        public String f() {
            return this.f10051g;
        }

        public String g() {
            return this.f10046b;
        }

        public String h() {
            return this.f10050f;
        }

        public c i() {
            return (c) this.f10053i.getLast();
        }

        public String toString() {
            return "AdInfo{state='" + i() + "', adUnitId='" + this.f10045a + "', format='" + this.f10046b + "', adapterName='" + this.f10047c + "', adapterClass='" + this.f10048d + "', adapterVersion='" + this.f10049e + "', bCode='" + this.f10050f + "', creativeId='" + this.f10051g + "', updated=" + this.f10052h + '}';
        }
    }

    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW(C4157n2.f33013v),
        HIDE("hide"),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10062a;

        c(String str) {
            this.f10062a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f10062a;
        }
    }

    public interface d {
        void a(b bVar);
    }

    public g(k kVar) {
        this.f10040a = kVar;
        a();
    }

    private Set a(c cVar) {
        synchronized (this.f10042c) {
            Set set = (Set) this.f10041b.get(cVar);
            if (l1.a(set)) {
                return set;
            }
            return new HashSet();
        }
    }

    private void a(b bVar, c cVar) {
        synchronized (this.f10042c) {
            Iterator it = a(cVar).iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(bVar);
            }
        }
    }

    public void a() {
        synchronized (this.f10042c) {
            for (c cVar : c.values()) {
                this.f10041b.put(cVar, new HashSet());
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f10042c) {
            Iterator it = this.f10041b.keySet().iterator();
            while (it.hasNext()) {
                a((c) it.next()).remove(dVar);
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.f10042c) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a((c) it.next()).add(dVar);
            }
        }
    }

    public void a(y2 y2Var, c cVar) {
        synchronized (this.f10044e) {
            String strB = y2Var.B();
            b bVar = (b) this.f10043d.get(strB);
            if (bVar == null) {
                if (cVar == c.DESTROY) {
                    return;
                }
                bVar = new b(y2Var, cVar);
                this.f10043d.put(strB, bVar);
            } else if (bVar.i() == cVar) {
                return;
            } else {
                bVar.a(cVar);
            }
            if (cVar == c.DESTROY) {
                this.f10043d.remove(strB);
            }
            a(bVar, cVar);
        }
    }
}
