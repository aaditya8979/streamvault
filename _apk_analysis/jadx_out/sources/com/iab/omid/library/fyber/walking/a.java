package com.iab.omid.library.fyber.walking;

import android.view.View;
import com.iab.omid.library.fyber.internal.e;
import com.iab.omid.library.fyber.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f24361a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0340a> f24362b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f24363c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f24364d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f24365e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f24366f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f24367g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f24368h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f24369i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24370j;

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.a$a, reason: collision with other inner class name */
    public static class C0340a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f24371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f24372b = new ArrayList<>();

        public C0340a(e eVar, String str) {
            this.f24371a = eVar;
            a(str);
        }

        public e a() {
            return this.f24371a;
        }

        public void a(String str) {
            this.f24372b.add(str);
        }

        public ArrayList<String> b() {
            return this.f24372b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f24369i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f24369i.containsKey(view)) {
            return this.f24369i.get(view);
        }
        Map<View, Boolean> map = this.f24369i;
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
        this.f24364d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.fyber.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.fyber.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0340a c0340a = this.f24362b.get(view);
        if (c0340a != null) {
            c0340a.a(aVar.c());
        } else {
            this.f24362b.put(view, new C0340a(eVar, aVar.c()));
        }
    }

    public View a(String str) {
        return this.f24363c.get(str);
    }

    public void a() {
        this.f24361a.clear();
        this.f24362b.clear();
        this.f24363c.clear();
        this.f24364d.clear();
        this.f24365e.clear();
        this.f24366f.clear();
        this.f24367g.clear();
        this.f24370j = false;
        this.f24368h.clear();
    }

    public C0340a b(View view) {
        C0340a c0340a = this.f24362b.get(view);
        if (c0340a != null) {
            this.f24362b.remove(view);
        }
        return c0340a;
    }

    public String b(String str) {
        return this.f24367g.get(str);
    }

    public HashSet<String> b() {
        return this.f24366f;
    }

    public String c(View view) {
        if (this.f24361a.size() == 0) {
            return null;
        }
        String str = this.f24361a.get(view);
        if (str != null) {
            this.f24361a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f24365e;
    }

    public boolean c(String str) {
        return this.f24368h.contains(str);
    }

    public c d(View view) {
        return this.f24364d.contains(view) ? c.PARENT_VIEW : this.f24370j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f24370j = true;
    }

    public void e() {
        com.iab.omid.library.fyber.internal.c cVarC = com.iab.omid.library.fyber.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.fyber.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f24368h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f24365e.add(strC);
                            this.f24361a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f24366f.add(strC);
                            this.f24363c.put(strC, viewE);
                            this.f24367g.put(strC, strA);
                        }
                    } else {
                        this.f24366f.add(strC);
                        this.f24367g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f24369i.containsKey(view)) {
            return true;
        }
        this.f24369i.put(view, Boolean.TRUE);
        return false;
    }
}
