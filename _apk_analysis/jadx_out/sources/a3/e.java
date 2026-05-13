package a3;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import cn.f0;
import cn.k0;
import com.facebook.GraphRequest;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.j0;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.t;
import k2.z;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;
import z2.j;
import zn.n;

/* JADX INFO: compiled from: ANRHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"La3/e;", "", "Lbn/r;", "c", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f3485a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final AtomicBoolean enabled = new AtomicBoolean(false);

    public static final synchronized void c() {
        if (c3.a.d(e.class)) {
            return;
        }
        try {
            if (enabled.getAndSet(true)) {
                return;
            }
            if (t.p()) {
                d();
            }
            b.d();
            return;
        } catch (Throwable th2) {
            c3.a.b(th2, e.class);
            return;
        }
    }

    @VisibleForTesting
    public static final void d() {
        if (c3.a.d(e.class)) {
            return;
        }
        try {
            if (j0.U()) {
                return;
            }
            File[] fileArrL = j.l();
            ArrayList arrayList = new ArrayList(fileArrL.length);
            for (File file : fileArrL) {
                arrayList.add(InstrumentData.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            final List listX0 = f0.X0(arrayList2, new Comparator() { // from class: a3.c
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return e.e((InstrumentData) obj2, (InstrumentData) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = n.v(0, Math.min(listX0.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listX0.get(((k0) it).nextInt()));
            }
            j jVar = j.f98188a;
            j.s("anr_reports", jSONArray, new GraphRequest.b() { // from class: a3.d
                @Override // com.facebook.GraphRequest.b
                public final void a(z zVar) {
                    e.f(listX0, zVar);
                }
            });
        } catch (Throwable th2) {
            c3.a.b(th2, e.class);
        }
    }

    public static final int e(InstrumentData instrumentData, InstrumentData instrumentData2) {
        if (c3.a.d(e.class)) {
            return 0;
        }
        try {
            p.j(instrumentData2, "o2");
            return instrumentData.b(instrumentData2);
        } catch (Throwable th2) {
            c3.a.b(th2, e.class);
            return 0;
        }
    }

    public static final void f(List list, z zVar) {
        if (c3.a.d(e.class)) {
            return;
        }
        try {
            p.k(list, "$validReports");
            p.k(zVar, "response");
            try {
                if (zVar.getError() == null) {
                    JSONObject jsonObject = zVar.getJsonObject();
                    if (p.f(jsonObject == null ? null : Boolean.valueOf(jsonObject.getBoolean("success")), Boolean.TRUE)) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((InstrumentData) it.next()).a();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            c3.a.b(th2, e.class);
        }
    }
}
