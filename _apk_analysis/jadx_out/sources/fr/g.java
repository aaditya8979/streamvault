package fr;

import java.util.List;
import org.fourthline.cling.model.types.Datatype;
import qr.m;
import qr.n;
import qr.o;
import qr.p;

/* JADX INFO: compiled from: MutableStateVariable.java */
/* JADX INFO: loaded from: classes11.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f61873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Datatype f61874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f61875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f61876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f61877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f61878f;

    public m a() {
        String[] strArr;
        String str = this.f61873a;
        Datatype datatype = this.f61874b;
        String str2 = this.f61875c;
        List<String> list = this.f61876d;
        if (list == null || list.size() == 0) {
            strArr = null;
        } else {
            List<String> list2 = this.f61876d;
            strArr = (String[]) list2.toArray(new String[list2.size()]);
        }
        return new m(str, new p(datatype, str2, strArr, this.f61877e != null ? new n(this.f61877e.f61838a.longValue(), this.f61877e.f61839b.longValue(), this.f61877e.f61840c.longValue()) : null), this.f61878f);
    }
}
