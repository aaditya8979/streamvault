package com.iab.omid.library.mmadbridge.walking;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f24772a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0353a> f24773b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f24774c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f24775d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f24776e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f24777f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f24778g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f24779h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f24780i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24781j;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.a$a, reason: collision with other inner class name */
    public static class C0353a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f24782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f24783b = new ArrayList<>();

        public C0353a(e eVar, String str) {
            this.f24782a = eVar;
            a(str);
        }

        public e a() {
            return this.f24782a;
        }

        public void a(String str) {
            this.f24783b.add(str);
        }

        public ArrayList<String> b() {
            return this.f24783b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f24780i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f24780i.containsKey(view)) {
            return this.f24780i.get(view);
        }
        Map<View, Boolean> map = this.f24780i;
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
        this.f24775d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.mmadbridge.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0353a c0353a = this.f24773b.get(view);
        if (c0353a != null) {
            c0353a.a(aVar.getAdSessionId());
        } else {
            this.f24773b.put(view, new C0353a(eVar, aVar.getAdSessionId()));
        }
    }

    public View a(String str) {
        return this.f24774c.get(str);
    }

    public void a() {
        this.f24772a.clear();
        this.f24773b.clear();
        this.f24774c.clear();
        this.f24775d.clear();
        this.f24776e.clear();
        this.f24777f.clear();
        this.f24778g.clear();
        this.f24781j = false;
        this.f24779h.clear();
    }

    public C0353a b(View view) {
        C0353a c0353a = this.f24773b.get(view);
        if (c0353a != null) {
            this.f24773b.remove(view);
        }
        return c0353a;
    }

    public String b(String str) {
        return this.f24778g.get(str);
    }

    public HashSet<String> b() {
        return this.f24777f;
    }

    public String c(View view) {
        if (this.f24772a.size() == 0) {
            return null;
        }
        String str = this.f24772a.get(view);
        if (str != null) {
            this.f24772a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f24776e;
    }

    @VisibleForTesting
    public boolean c(String str) {
        return this.f24779h.contains(str);
    }

    public c d(View view) {
        return this.f24775d.contains(view) ? c.PARENT_VIEW : this.f24781j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f24781j = true;
    }

    public void e() {
        com.iab.omid.library.mmadbridge.internal.c cVarC = com.iab.omid.library.mmadbridge.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.mmadbridge.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f24779h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f24776e.add(adSessionId);
                            this.f24772a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f24777f.add(adSessionId);
                            this.f24774c.put(adSessionId, viewC);
                            this.f24778g.put(adSessionId, strA);
                        }
                    } else {
                        this.f24777f.add(adSessionId);
                        this.f24778g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f24780i.containsKey(view)) {
            return true;
        }
        this.f24780i.put(view, Boolean.TRUE);
        return false;
    }
}
