package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class zf2 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zf2 f97561b = new zf2();

    public zf2() {
        super(0);
    }

    @Override // sn.a
    public final Object invoke() {
        Object next;
        Iterator<E> it = yf2.f97115d.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List list = ((yf2) next).f97116b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        Class.forName((String) it2.next());
                        break loop0;
                    } catch (ClassNotFoundException unused) {
                    } catch (Throwable unused2) {
                        boolean z10 = ad1.f87661a;
                    }
                }
            }
        }
        return (yf2) next;
    }
}
