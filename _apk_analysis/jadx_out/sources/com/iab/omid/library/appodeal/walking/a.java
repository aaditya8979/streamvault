package com.iab.omid.library.appodeal.walking;

import android.view.View;
import com.iab.omid.library.appodeal.internal.e;
import com.iab.omid.library.appodeal.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f23975a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0329a> f23976b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f23977c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f23978d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f23979e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f23980f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f23981g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f23982h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f23983i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23984j;

    /* JADX INFO: renamed from: com.iab.omid.library.appodeal.walking.a$a, reason: collision with other inner class name */
    public static class C0329a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f23985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f23986b = new ArrayList<>();

        public C0329a(e eVar, String str) {
            this.f23985a = eVar;
            a(str);
        }

        public e a() {
            return this.f23985a;
        }

        public void a(String str) {
            this.f23986b.add(str);
        }

        public ArrayList<String> b() {
            return this.f23986b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f23983i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f23983i.containsKey(view)) {
            return this.f23983i.get(view);
        }
        Map<View, Boolean> map = this.f23983i;
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
        this.f23978d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.appodeal.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.appodeal.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0329a c0329a = this.f23976b.get(view);
        if (c0329a != null) {
            c0329a.a(aVar.c());
        } else {
            this.f23976b.put(view, new C0329a(eVar, aVar.c()));
        }
    }

    public View a(String str) {
        return this.f23977c.get(str);
    }

    public void a() {
        this.f23975a.clear();
        this.f23976b.clear();
        this.f23977c.clear();
        this.f23978d.clear();
        this.f23979e.clear();
        this.f23980f.clear();
        this.f23981g.clear();
        this.f23984j = false;
        this.f23982h.clear();
    }

    public C0329a b(View view) {
        C0329a c0329a = this.f23976b.get(view);
        if (c0329a != null) {
            this.f23976b.remove(view);
        }
        return c0329a;
    }

    public String b(String str) {
        return this.f23981g.get(str);
    }

    public HashSet<String> b() {
        return this.f23980f;
    }

    public String c(View view) {
        if (this.f23975a.size() == 0) {
            return null;
        }
        String str = this.f23975a.get(view);
        if (str != null) {
            this.f23975a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f23979e;
    }

    public boolean c(String str) {
        return this.f23982h.contains(str);
    }

    public c d(View view) {
        return this.f23978d.contains(view) ? c.PARENT_VIEW : this.f23984j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f23984j = true;
    }

    public void e() {
        com.iab.omid.library.appodeal.internal.c cVarC = com.iab.omid.library.appodeal.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.appodeal.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f23982h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f23979e.add(strC);
                            this.f23975a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f23980f.add(strC);
                            this.f23977c.put(strC, viewE);
                            this.f23981g.put(strC, strA);
                        }
                    } else {
                        this.f23980f.add(strC);
                        this.f23981g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f23983i.containsKey(view)) {
            return true;
        }
        this.f23983i.put(view, Boolean.TRUE);
        return false;
    }
}
