package yads;

import android.util.Log;
import android.view.View;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class v83 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        x83 x83Var = x83.f96665g;
        x83Var.getClass();
        x83Var.f96671b.clear();
        Iterator it = Collections.unmodifiableCollection(nw3.f93027c.f93029b).iterator();
        while (it.hasNext()) {
            ((wv3) it.next()).getClass();
        }
        x83Var.f96675f = System.nanoTime();
        x83Var.f96673d.a();
        long jNanoTime = System.nanoTime();
        kw3 kw3Var = x83Var.f96672c.f88634b;
        if (x83Var.f96673d.f95390f.size() > 0) {
            for (String str : x83Var.f96673d.f95390f) {
                JSONObject jSONObjectA = kw3Var.a(null);
                View view = (View) x83Var.f96673d.f95387c.get(str);
                sw3 sw3Var = x83Var.f96672c.f88633a;
                String str2 = (String) x83Var.f96673d.f95391g.get(str);
                if (str2 != null) {
                    JSONObject jSONObjectA2 = sw3Var.a(view);
                    try {
                        jSONObjectA2.put("adSessionId", str);
                    } catch (JSONException e10) {
                        tw3.a("Error with setting ad session id", e10);
                    }
                    try {
                        jSONObjectA2.put("notVisibleReason", str2);
                    } catch (JSONException e11) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e11);
                    }
                    lw3.a(jSONObjectA, jSONObjectA2);
                }
                lw3.a(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                fw3 fw3Var = x83Var.f96674e;
                fw3Var.f89713b.a(new zw3(fw3Var, hashSet, jSONObjectA, jNanoTime));
            }
        }
        if (x83Var.f96673d.f95389e.size() > 0) {
            JSONObject jSONObjectA3 = kw3Var.a(null);
            kw3Var.a(null, jSONObjectA3, x83Var, true, false);
            lw3.a(jSONObjectA3);
            fw3 fw3Var2 = x83Var.f96674e;
            fw3Var2.f89713b.a(new cx3(fw3Var2, x83Var.f96673d.f95389e, jSONObjectA3, jNanoTime));
        } else {
            fw3 fw3Var3 = x83Var.f96674e;
            fw3Var3.f89713b.a(new uw3(fw3Var3));
        }
        tv3 tv3Var = x83Var.f96673d;
        tv3Var.f95385a.clear();
        tv3Var.f95386b.clear();
        tv3Var.f95387c.clear();
        tv3Var.f95388d.clear();
        tv3Var.f95389e.clear();
        tv3Var.f95390f.clear();
        tv3Var.f95391g.clear();
        tv3Var.f95394j = false;
        tv3Var.f95392h.clear();
        long jNanoTime2 = System.nanoTime() - x83Var.f96675f;
        if (x83Var.f96670a.size() > 0) {
            Iterator it2 = x83Var.f96670a.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                throw null;
            }
        }
        lx3.f92168d.a();
    }
}
