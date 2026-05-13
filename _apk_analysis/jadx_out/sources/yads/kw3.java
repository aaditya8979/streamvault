package yads;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class kw3 implements qv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qv3 f91795a;

    public kw3(sw3 sw3Var) {
        this.f91795a = sw3Var;
    }

    @Override // yads.qv3
    public final JSONObject a(View view) {
        JSONObject jSONObjectA = lw3.a(0, 0, 0, 0);
        try {
            jSONObjectA.put("noOutputDevice", jw3.f91403a[hg0.a(sv3.a() != 1 ? 2 : yw3.f97316a)] == 1);
        } catch (JSONException e10) {
            Log.e("OMIDLIB", "Error with setting output device status", e10);
        }
        return jSONObjectA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.qv3
    public final void a(View view, JSONObject jSONObject, nv3 nv3Var, boolean z10, boolean z11) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        nw3 nw3Var = nw3.f93027c;
        if (nw3Var != null) {
            Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(nw3Var.f93029b);
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionUnmodifiableCollection.size() * 2) + 3);
            Iterator it = collectionUnmodifiableCollection.iterator();
            while (it.hasNext()) {
                View view2 = (View) ((wv3) it.next()).f96535d.get();
                if (view2 != null && hx3.d(view2) && (rootView = view2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fB = hx3.b(rootView);
                    int size = arrayList.size();
                    while (size > 0 && hx3.b((View) arrayList.get(size - 1)) > fB) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((x83) nv3Var).a((View) it2.next(), this.f91795a, jSONObject, z11);
        }
    }
}
