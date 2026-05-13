package com.iab.omid.library.inmobi.walking;

import android.view.View;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f24502a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0345a> f24503b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f24504c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f24505d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f24506e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f24507f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f24508g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f24509h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f24510i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24511j;

    /* JADX INFO: renamed from: com.iab.omid.library.inmobi.walking.a$a, reason: collision with other inner class name */
    public static class C0345a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f24512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f24513b = new ArrayList<>();

        public C0345a(e eVar, String str) {
            this.f24512a = eVar;
            a(str);
        }

        public e a() {
            return this.f24512a;
        }

        public void a(String str) {
            this.f24513b.add(str);
        }

        public ArrayList<String> b() {
            return this.f24513b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f24510i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f24510i.containsKey(view)) {
            return this.f24510i.get(view);
        }
        Map<View, Boolean> map = this.f24510i;
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
        this.f24505d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.inmobi.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0345a c0345a = this.f24503b.get(view);
        if (c0345a != null) {
            c0345a.a(aVar.c());
        } else {
            this.f24503b.put(view, new C0345a(eVar, aVar.c()));
        }
    }

    public View a(String str) {
        return this.f24504c.get(str);
    }

    public void a() {
        this.f24502a.clear();
        this.f24503b.clear();
        this.f24504c.clear();
        this.f24505d.clear();
        this.f24506e.clear();
        this.f24507f.clear();
        this.f24508g.clear();
        this.f24511j = false;
        this.f24509h.clear();
    }

    public C0345a b(View view) {
        C0345a c0345a = this.f24503b.get(view);
        if (c0345a != null) {
            this.f24503b.remove(view);
        }
        return c0345a;
    }

    public String b(String str) {
        return this.f24508g.get(str);
    }

    public HashSet<String> b() {
        return this.f24507f;
    }

    public String c(View view) {
        if (this.f24502a.size() == 0) {
            return null;
        }
        String str = this.f24502a.get(view);
        if (str != null) {
            this.f24502a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f24506e;
    }

    public boolean c(String str) {
        return this.f24509h.contains(str);
    }

    public c d(View view) {
        return this.f24505d.contains(view) ? c.PARENT_VIEW : this.f24511j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f24511j = true;
    }

    public void e() {
        com.iab.omid.library.inmobi.internal.c cVarC = com.iab.omid.library.inmobi.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f24509h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f24506e.add(strC);
                            this.f24502a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f24507f.add(strC);
                            this.f24504c.put(strC, viewE);
                            this.f24508g.put(strC, strA);
                        }
                    } else {
                        this.f24507f.add(strC);
                        this.f24508g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f24510i.containsKey(view)) {
            return true;
        }
        this.f24510i.put(view, Boolean.TRUE);
        return false;
    }
}
