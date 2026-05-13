package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f24226a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0336a> f24227b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f24228c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f24229d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f24230e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f24231f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f24232g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f24233h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24234i;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0336a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f24235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f24236b = new ArrayList<>();

        public C0336a(e eVar, String str) {
            this.f24235a = eVar;
            a(str);
        }

        public e a() {
            return this.f24235a;
        }

        public void a(String str) {
            this.f24236b.add(str);
        }

        public ArrayList<String> b() {
            return this.f24236b;
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
        this.f24229d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0336a c0336a = this.f24227b.get(view);
        if (c0336a != null) {
            c0336a.a(aVar.getAdSessionId());
        } else {
            this.f24227b.put(view, new C0336a(eVar, aVar.getAdSessionId()));
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f24233h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f24233h.containsKey(view)) {
            return this.f24233h.get(view);
        }
        Map<View, Boolean> map = this.f24233h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f24228c.get(str);
    }

    public void a() {
        this.f24226a.clear();
        this.f24227b.clear();
        this.f24228c.clear();
        this.f24229d.clear();
        this.f24230e.clear();
        this.f24231f.clear();
        this.f24232g.clear();
        this.f24234i = false;
    }

    public String b(String str) {
        return this.f24232g.get(str);
    }

    public HashSet<String> b() {
        return this.f24231f;
    }

    public C0336a c(View view) {
        C0336a c0336a = this.f24227b.get(view);
        if (c0336a != null) {
            this.f24227b.remove(view);
        }
        return c0336a;
    }

    public HashSet<String> c() {
        return this.f24230e;
    }

    public String d(View view) {
        if (this.f24226a.size() == 0) {
            return null;
        }
        String str = this.f24226a.get(view);
        if (str != null) {
            this.f24226a.remove(view);
        }
        return str;
    }

    public void d() {
        this.f24234i = true;
    }

    public c e(View view) {
        return this.f24229d.contains(view) ? c.PARENT_VIEW : this.f24234i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c cVarC = com.iab.omid.library.bytedance2.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f24230e.add(adSessionId);
                            this.f24226a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f24231f.add(adSessionId);
                            this.f24228c.put(adSessionId, viewC);
                            this.f24232g.put(adSessionId, strA);
                        }
                    } else {
                        this.f24231f.add(adSessionId);
                        this.f24232g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean f(View view) {
        if (!this.f24233h.containsKey(view)) {
            return true;
        }
        this.f24233h.put(view, Boolean.TRUE);
        return false;
    }
}
