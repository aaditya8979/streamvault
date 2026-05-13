package ds;

import org.fourthline.cling.support.lastchange.LastChangeParser;

/* JADX INFO: compiled from: LastChange.java */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f59987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LastChangeParser f59988b;

    public k(LastChangeParser lastChangeParser) {
        this(lastChangeParser, new a());
    }

    public k(LastChangeParser lastChangeParser, a aVar) {
        this.f59988b = lastChangeParser;
        this.f59987a = aVar;
    }

    public synchronized void a(org.fourthline.cling.model.types.b bVar, b... bVarArr) {
        for (b bVar2 : bVarArr) {
            if (bVar2 != null) {
                this.f59987a.c(bVar, bVar2);
            }
        }
    }

    public synchronized String toString() {
        if (!this.f59987a.b()) {
            return "";
        }
        try {
            return this.f59988b.j(this.f59987a);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
