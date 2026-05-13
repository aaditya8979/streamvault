package yads;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f93068a;

    public o1(Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.f93068a = arrayList;
        if (activity != null) {
            arrayList.add(new WeakReference(activity));
        }
    }

    public final void a(Activity activity) {
        synchronized (this) {
            ArrayList arrayList = this.f93068a;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (tn.p.f(((WeakReference) it.next()).get(), activity)) {
                        break;
                    }
                }
            }
            this.f93068a.add(new WeakReference(activity));
            Objects.toString(activity);
            boolean z10 = ad1.f87661a;
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void b(Activity activity) {
        Object next;
        synchronized (this) {
            Iterator it = this.f93068a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (tn.p.f(((WeakReference) next).get(), activity)) {
                        break;
                    }
                }
            }
            WeakReference weakReference = (WeakReference) next;
            if (weakReference != null) {
                this.f93068a.remove(weakReference);
                Objects.toString(activity);
                boolean z10 = ad1.f87661a;
            }
            bn.r rVar = bn.r.f5635a;
        }
    }
}
