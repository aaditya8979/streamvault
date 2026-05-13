package e1;

import android.text.TextUtils;
import com.digitalturbine.ignite.authenticator.events.c;
import com.digitalturbine.ignite.authenticator.events.d;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import f1.h;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f60024c;

    public b(i1.a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f60024c = arrayList;
        arrayList.add(aVar);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        l1.b.a("%s : unable to retrieve property: %s", "IgnitePropertyCallback", str);
        Iterator it = this.f60024c.iterator();
        while (it.hasNext()) {
            h hVar = ((i1.a) it.next()).f63685a;
            if (hVar != null) {
                l1.b.a("%s : on one dt error", "OneDTAuthenticator");
                hVar.f61431l.set(true);
                if (hVar.f61424e != null) {
                    l1.b.b("%s : on one dt error : %s", "IgniteManager", str);
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        l1.b.a("%s : property retrieved", "IgnitePropertyCallback");
        Iterator it = this.f60024c.iterator();
        while (it.hasNext()) {
            h hVar = ((i1.a) it.next()).f63685a;
            if (hVar != null) {
                if (TextUtils.isEmpty(str)) {
                    l1.b.a("%s : on one dt error", "OneDTAuthenticator");
                    hVar.f61431l.set(true);
                    if (hVar.f61424e != null) {
                        l1.b.b("%s : on one dt error : %s", "IgniteManager", "One DT is empty");
                    }
                    h1.b.b(d.RAW_ONE_DT_ERROR, "error_code", c.ONE_DT_EMPTY_ENTITY.a());
                } else {
                    hVar.f61425f.b(str);
                    hVar.f61426g.getClass();
                    d1.c cVarA = m1.b.a(str);
                    hVar.f61427h = cVarA;
                    d1.a aVar = hVar.f61424e;
                    if (aVar != null) {
                        l1.b.a("%s : setting one dt entity", "IgniteManager");
                        aVar.f59543b = cVarA;
                    }
                }
            }
        }
    }
}
