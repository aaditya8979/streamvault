package pb;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: ClingDeviceList.java */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f77164b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection<b> f77165a = new ArrayList();

    public static c e() {
        if (sb.c.b(f77164b)) {
            f77164b = new c();
        }
        return f77164b;
    }

    public void a(b bVar) {
        Collection<b> collection;
        if (!sb.c.a(bVar) || (collection = this.f77165a) == null) {
            return;
        }
        collection.add(bVar);
    }

    public void b() {
        this.f77165a = null;
        f77164b = null;
    }

    @Nullable
    public b c(qr.a aVar) {
        Collection<b> collection = this.f77165a;
        if (collection == null) {
            return null;
        }
        for (b bVar : collection) {
            qr.a device = bVar.getDevice();
            if (device != null && device.equals(aVar)) {
                return bVar;
            }
        }
        return null;
    }

    @Nullable
    public Collection<b> d() {
        return this.f77165a;
    }

    public void f(b bVar) {
        Collection<b> collection;
        if (!sb.c.a(bVar) || (collection = this.f77165a) == null) {
            return;
        }
        collection.remove(bVar);
    }
}
