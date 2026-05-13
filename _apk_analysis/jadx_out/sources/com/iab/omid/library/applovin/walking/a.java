package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f23840a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0325a> f23841b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f23842c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f23843d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f23844e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f23845f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f23846g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f23847h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f23848i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23849j;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0325a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f23850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f23851b = new ArrayList<>();

        public C0325a(e eVar, String str) {
            this.f23850a = eVar;
            a(str);
        }

        public e a() {
            return this.f23850a;
        }

        public void a(String str) {
            this.f23851b.add(str);
        }

        public ArrayList<String> b() {
            return this.f23851b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f23848i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f23848i.containsKey(view)) {
            return this.f23848i.get(view);
        }
        Map<View, Boolean> map = this.f23848i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    private String a(View view, boolean z10) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z10) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f23843d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0325a c0325a = this.f23841b.get(view);
        if (c0325a != null) {
            c0325a.a(aVar.c());
        } else {
            this.f23841b.put(view, new C0325a(eVar, aVar.c()));
        }
    }

    public View a(String str) {
        return this.f23842c.get(str);
    }

    public void a() {
        this.f23840a.clear();
        this.f23841b.clear();
        this.f23842c.clear();
        this.f23843d.clear();
        this.f23844e.clear();
        this.f23845f.clear();
        this.f23846g.clear();
        this.f23849j = false;
        this.f23847h.clear();
    }

    public C0325a b(View view) {
        C0325a c0325a = this.f23841b.get(view);
        if (c0325a != null) {
            this.f23841b.remove(view);
        }
        return c0325a;
    }

    public String b(String str) {
        return this.f23846g.get(str);
    }

    public HashSet<String> b() {
        return this.f23845f;
    }

    public String c(View view) {
        if (this.f23840a.size() == 0) {
            return null;
        }
        String str = this.f23840a.get(view);
        if (str != null) {
            this.f23840a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f23844e;
    }

    public boolean c(String str) {
        return this.f23847h.contains(str);
    }

    public c d(View view) {
        return this.f23843d.contains(view) ? c.PARENT_VIEW : this.f23849j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f23849j = true;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f23847h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f23844e.add(strC);
                            this.f23840a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f23845f.add(strC);
                            this.f23842c.put(strC, viewE);
                            this.f23846g.put(strC, strA);
                        }
                    } else {
                        this.f23845f.add(strC);
                        this.f23846g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f23848i.containsKey(view)) {
            return true;
        }
        this.f23848i.put(view, Boolean.TRUE);
        return false;
    }
}
