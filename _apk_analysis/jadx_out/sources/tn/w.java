package tn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: SpreadBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Object> f85367a;

    public w(int i10) {
        this.f85367a = new ArrayList<>(i10);
    }

    public void a(Object obj) {
        this.f85367a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f85367a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f85367a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f85367a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f85367a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f85367a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f85367a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f85367a.toArray(objArr);
    }
}
