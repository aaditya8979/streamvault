package com.iab.omid.library.bigosg.walking;

import android.view.View;
import com.iab.omid.library.bigosg.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f24098a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0332a> f24099b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f24100c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f24101d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f24102e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f24103f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f24104g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24105h;

    /* JADX INFO: renamed from: com.iab.omid.library.bigosg.walking.a$a, reason: collision with other inner class name */
    public static class C0332a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.bigosg.b.c f24106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f24107b = new ArrayList<>();

        public C0332a(com.iab.omid.library.bigosg.b.c cVar, String str) {
            this.f24106a = cVar;
            a(str);
        }

        public com.iab.omid.library.bigosg.b.c a() {
            return this.f24106a;
        }

        public void a(String str) {
            this.f24107b.add(str);
        }

        public ArrayList<String> b() {
            return this.f24107b;
        }
    }

    private void a(com.iab.omid.library.bigosg.adsession.a aVar) {
        Iterator<com.iab.omid.library.bigosg.b.c> it = aVar.a().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.bigosg.b.c cVar, com.iab.omid.library.bigosg.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0332a c0332a = this.f24099b.get(view);
        if (c0332a != null) {
            c0332a.a(aVar.getAdSessionId());
        } else {
            this.f24099b.put(view, new C0332a(cVar, aVar.getAdSessionId()));
        }
    }

    private String d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strE = f.e(view);
            if (strE != null) {
                return strE;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f24101d.addAll(hashSet);
        return null;
    }

    public String a(View view) {
        if (this.f24098a.size() == 0) {
            return null;
        }
        String str = this.f24098a.get(view);
        if (str != null) {
            this.f24098a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.f24104g.get(str);
    }

    public HashSet<String> a() {
        return this.f24102e;
    }

    public View b(String str) {
        return this.f24100c.get(str);
    }

    public C0332a b(View view) {
        C0332a c0332a = this.f24099b.get(view);
        if (c0332a != null) {
            this.f24099b.remove(view);
        }
        return c0332a;
    }

    public HashSet<String> b() {
        return this.f24103f;
    }

    public c c(View view) {
        return this.f24101d.contains(view) ? c.PARENT_VIEW : this.f24105h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.bigosg.b.a aVarA = com.iab.omid.library.bigosg.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.bigosg.adsession.a aVar : aVarA.c()) {
                View viewD = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewD != null) {
                        String strD = d(viewD);
                        if (strD == null) {
                            this.f24102e.add(adSessionId);
                            this.f24098a.put(viewD, adSessionId);
                            a(aVar);
                        } else {
                            this.f24103f.add(adSessionId);
                            this.f24100c.put(adSessionId, viewD);
                            this.f24104g.put(adSessionId, strD);
                        }
                    } else {
                        this.f24103f.add(adSessionId);
                        this.f24104g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f24098a.clear();
        this.f24099b.clear();
        this.f24100c.clear();
        this.f24101d.clear();
        this.f24102e.clear();
        this.f24103f.clear();
        this.f24104g.clear();
        this.f24105h = false;
    }

    public void e() {
        this.f24105h = true;
    }
}
