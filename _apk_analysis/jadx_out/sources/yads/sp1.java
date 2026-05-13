package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class sp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f94911a;

    public /* synthetic */ sp1() {
        this(cn.w.p("AppOpenAd", "Banner", "Interstitial", "Rewarded", "Native"));
    }

    public sp1(List list) {
        this.f94911a = list;
    }

    public final e00 a(qq1 qq1Var) {
        Object next;
        String strM0 = bo.d0.M0(bo.d0.h1(qq1Var.f94111b, '.', null, 2, null), "Adapter");
        if (strM0.length() <= 0) {
            strM0 = null;
        }
        if (strM0 == null) {
            return null;
        }
        Iterator it = this.f94911a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (bo.a0.I(strM0, (String) next, false, 2, null)) {
                break;
            }
        }
        String str = (String) next;
        if (str == null) {
            return null;
        }
        d00 d00Var = e00.f89039c;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        d00Var.getClass();
        return d00.a(lowerCase);
    }

    public final String b(qq1 qq1Var) {
        Object next;
        String strM0 = bo.d0.M0(bo.d0.h1(qq1Var.f94111b, '.', null, 2, null), "Adapter");
        if (strM0.length() <= 0) {
            strM0 = null;
        }
        if (strM0 == null) {
            return null;
        }
        Iterator it = this.f94911a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (bo.a0.I(strM0, (String) next, false, 2, null)) {
                break;
            }
        }
        String str = (String) next;
        if (str == null) {
            return null;
        }
        String strM02 = bo.d0.M0(strM0, str);
        if (strM02.length() > 0) {
            return strM02;
        }
        return null;
    }
}
