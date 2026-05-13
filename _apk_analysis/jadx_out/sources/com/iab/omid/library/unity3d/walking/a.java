package com.iab.omid.library.unity3d.walking;

import android.view.View;
import com.iab.omid.library.unity3d.internal.e;
import com.iab.omid.library.unity3d.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f24901a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0357a> f24902b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f24903c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f24904d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f24905e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f24906f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f24907g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f24908h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24909i;

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.a$a, reason: collision with other inner class name */
    public static class C0357a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f24910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f24911b = new ArrayList<>();

        public C0357a(e eVar, String str) {
            this.f24910a = eVar;
            a(str);
        }

        public e a() {
            return this.f24910a;
        }

        public void a(String str) {
            this.f24911b.add(str);
        }

        public ArrayList<String> b() {
            return this.f24911b;
        }
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
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
        this.f24904d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.unity3d.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.unity3d.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0357a c0357a = this.f24902b.get(view);
        if (c0357a != null) {
            c0357a.a(aVar.getAdSessionId());
        } else {
            this.f24902b.put(view, new C0357a(eVar, aVar.getAdSessionId()));
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f24908h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f24908h.containsKey(view)) {
            return this.f24908h.get(view);
        }
        Map<View, Boolean> map = this.f24908h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f24903c.get(str);
    }

    public void a() {
        this.f24901a.clear();
        this.f24902b.clear();
        this.f24903c.clear();
        this.f24904d.clear();
        this.f24905e.clear();
        this.f24906f.clear();
        this.f24907g.clear();
        this.f24909i = false;
    }

    public String b(String str) {
        return this.f24907g.get(str);
    }

    public HashSet<String> b() {
        return this.f24906f;
    }

    public C0357a c(View view) {
        C0357a c0357a = this.f24902b.get(view);
        if (c0357a != null) {
            this.f24902b.remove(view);
        }
        return c0357a;
    }

    public HashSet<String> c() {
        return this.f24905e;
    }

    public String d(View view) {
        if (this.f24901a.size() == 0) {
            return null;
        }
        String str = this.f24901a.get(view);
        if (str != null) {
            this.f24901a.remove(view);
        }
        return str;
    }

    public void d() {
        this.f24909i = true;
    }

    public c e(View view) {
        return this.f24904d.contains(view) ? c.PARENT_VIEW : this.f24909i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.unity3d.internal.c cVarC = com.iab.omid.library.unity3d.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.unity3d.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f24905e.add(adSessionId);
                            this.f24901a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f24906f.add(adSessionId);
                            this.f24903c.put(adSessionId, viewC);
                            this.f24907g.put(adSessionId, strA);
                        }
                    } else {
                        this.f24906f.add(adSessionId);
                        this.f24907g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean f(View view) {
        if (!this.f24908h.containsKey(view)) {
            return true;
        }
        this.f24908h.put(view, Boolean.TRUE);
        return false;
    }
}
