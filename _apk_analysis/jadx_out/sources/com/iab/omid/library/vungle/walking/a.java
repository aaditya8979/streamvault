package com.iab.omid.library.vungle.walking;

import android.view.View;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f25041a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0362a> f25042b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f25043c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f25044d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f25045e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f25046f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f25047g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f25048h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f25049i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25050j;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.a$a, reason: collision with other inner class name */
    public static class C0362a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f25051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f25052b = new ArrayList<>();

        public C0362a(e eVar, String str) {
            this.f25051a = eVar;
            a(str);
        }

        public e a() {
            return this.f25051a;
        }

        public void a(String str) {
            this.f25052b.add(str);
        }

        public ArrayList<String> b() {
            return this.f25052b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f25049i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f25049i.containsKey(view)) {
            return this.f25049i.get(view);
        }
        Map<View, Boolean> map = this.f25049i;
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
        this.f25044d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.vungle.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.vungle.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0362a c0362a = this.f25042b.get(view);
        if (c0362a != null) {
            c0362a.a(aVar.c());
        } else {
            this.f25042b.put(view, new C0362a(eVar, aVar.c()));
        }
    }

    public View a(String str) {
        return this.f25043c.get(str);
    }

    public void a() {
        this.f25041a.clear();
        this.f25042b.clear();
        this.f25043c.clear();
        this.f25044d.clear();
        this.f25045e.clear();
        this.f25046f.clear();
        this.f25047g.clear();
        this.f25050j = false;
        this.f25048h.clear();
    }

    public C0362a b(View view) {
        C0362a c0362a = this.f25042b.get(view);
        if (c0362a != null) {
            this.f25042b.remove(view);
        }
        return c0362a;
    }

    public String b(String str) {
        return this.f25047g.get(str);
    }

    public HashSet<String> b() {
        return this.f25046f;
    }

    public String c(View view) {
        if (this.f25041a.size() == 0) {
            return null;
        }
        String str = this.f25041a.get(view);
        if (str != null) {
            this.f25041a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f25045e;
    }

    public boolean c(String str) {
        return this.f25048h.contains(str);
    }

    public c d(View view) {
        return this.f25044d.contains(view) ? c.PARENT_VIEW : this.f25050j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f25050j = true;
    }

    public void e() {
        com.iab.omid.library.vungle.internal.c cVarC = com.iab.omid.library.vungle.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f25048h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f25045e.add(strC);
                            this.f25041a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f25046f.add(strC);
                            this.f25043c.put(strC, viewE);
                            this.f25047g.put(strC, strA);
                        }
                    } else {
                        this.f25046f.add(strC);
                        this.f25047g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f25049i.containsKey(view)) {
            return true;
        }
        this.f25049i.put(view, Boolean.TRUE);
        return false;
    }
}
