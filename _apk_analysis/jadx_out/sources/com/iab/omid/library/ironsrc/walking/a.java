package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f24637a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0349a> f24638b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f24639c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f24640d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f24641e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f24642f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f24643g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f24644h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f24645i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24646j;

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.a$a, reason: collision with other inner class name */
    public static class C0349a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f24647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f24648b = new ArrayList<>();

        public C0349a(e eVar, String str) {
            this.f24647a = eVar;
            a(str);
        }

        public e a() {
            return this.f24647a;
        }

        public void a(String str) {
            this.f24648b.add(str);
        }

        public ArrayList<String> b() {
            return this.f24648b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f24645i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f24645i.containsKey(view)) {
            return this.f24645i.get(view);
        }
        Map<View, Boolean> map = this.f24645i;
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
        this.f24640d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.ironsrc.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0349a c0349a = this.f24638b.get(view);
        if (c0349a != null) {
            c0349a.a(aVar.getAdSessionId());
        } else {
            this.f24638b.put(view, new C0349a(eVar, aVar.getAdSessionId()));
        }
    }

    public View a(String str) {
        return this.f24639c.get(str);
    }

    public void a() {
        this.f24637a.clear();
        this.f24638b.clear();
        this.f24639c.clear();
        this.f24640d.clear();
        this.f24641e.clear();
        this.f24642f.clear();
        this.f24643g.clear();
        this.f24646j = false;
        this.f24644h.clear();
    }

    public C0349a b(View view) {
        C0349a c0349a = this.f24638b.get(view);
        if (c0349a != null) {
            this.f24638b.remove(view);
        }
        return c0349a;
    }

    public String b(String str) {
        return this.f24643g.get(str);
    }

    public HashSet<String> b() {
        return this.f24642f;
    }

    public String c(View view) {
        if (this.f24637a.size() == 0) {
            return null;
        }
        String str = this.f24637a.get(view);
        if (str != null) {
            this.f24637a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f24641e;
    }

    public boolean c(String str) {
        return this.f24644h.contains(str);
    }

    public c d(View view) {
        return this.f24640d.contains(view) ? c.PARENT_VIEW : this.f24646j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f24646j = true;
    }

    public void e() {
        com.iab.omid.library.ironsrc.internal.c cVarC = com.iab.omid.library.ironsrc.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f24644h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f24641e.add(adSessionId);
                            this.f24637a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f24642f.add(adSessionId);
                            this.f24639c.put(adSessionId, viewC);
                            this.f24643g.put(adSessionId, strA);
                        }
                    } else {
                        this.f24642f.add(adSessionId);
                        this.f24643g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f24645i.containsKey(view)) {
            return true;
        }
        this.f24645i.put(view, Boolean.TRUE);
        return false;
    }
}
