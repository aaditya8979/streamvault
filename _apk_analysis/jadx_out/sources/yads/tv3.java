package yads;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class tv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f95385a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f95386b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f95387c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f95388d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f95389e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f95390f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f95391g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet f95392h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakHashMap f95393i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f95394j;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        Boolean bool;
        nw3 nw3Var = nw3.f93027c;
        if (nw3Var != null) {
            for (wv3 wv3Var : Collections.unmodifiableCollection(nw3Var.f93029b)) {
                View view = (View) wv3Var.f96535d.get();
                if (wv3Var.f96537f && !wv3Var.f96538g) {
                    String str = wv3Var.f96539h;
                    if (view != null) {
                        boolean zC = hx3.c(view);
                        if (zC) {
                            this.f95392h.add(str);
                        }
                        String str2 = null;
                        if (view.isAttachedToWindow()) {
                            if (view.hasWindowFocus()) {
                                this.f95393i.remove(view);
                                bool = Boolean.FALSE;
                            } else if (this.f95393i.containsKey(view)) {
                                bool = (Boolean) this.f95393i.get(view);
                            } else {
                                WeakHashMap weakHashMap = this.f95393i;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(view, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue() || zC) {
                                HashSet hashSet = new HashSet();
                                View view2 = view;
                                while (true) {
                                    if (view2 == null) {
                                        this.f95388d.addAll(hashSet);
                                        break;
                                    }
                                    String strA = hx3.a(view2);
                                    if (strA != null) {
                                        str2 = strA;
                                        break;
                                    } else {
                                        hashSet.add(view2);
                                        Object parent = view2.getParent();
                                        view2 = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str2 = "noWindowFocus";
                            }
                        } else {
                            str2 = "notAttached";
                        }
                        if (str2 == null) {
                            this.f95389e.add(str);
                            this.f95385a.put(view, str);
                            for (xw3 xw3Var : wv3Var.f96534c.f89022a) {
                                View view3 = (View) xw3Var.f96910a.get();
                                if (view3 != null) {
                                    mv3 mv3Var = (mv3) this.f95386b.get(view3);
                                    if (mv3Var != null) {
                                        mv3Var.f92585b.add(wv3Var.f96539h);
                                    } else {
                                        this.f95386b.put(view3, new mv3(xw3Var, wv3Var.f96539h));
                                    }
                                }
                            }
                        } else if (str2 != "noWindowFocus") {
                            this.f95390f.add(str);
                            this.f95387c.put(str, view);
                            this.f95391g.put(str, str2);
                        }
                    } else {
                        this.f95390f.add(str);
                        this.f95391g.put(str, "noAdView");
                    }
                }
            }
        }
    }
}
