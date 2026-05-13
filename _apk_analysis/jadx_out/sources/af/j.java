package af;

import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: ScarAdapterBase.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class j implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public df.c f3754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, cf.a> f3755b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cf.a f3756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c<l> f3757d;

    /* JADX INFO: compiled from: ScarAdapterBase.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f3758b;

        public a(Activity activity) {
            this.f3758b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f3756c.show(this.f3758b);
        }
    }

    public j(c<l> cVar) {
        this.f3757d = cVar;
    }

    @Override // af.e
    public void a(Context context, String str, UnityAdFormat unityAdFormat, df.b bVar) {
        this.f3754a.a(context, str, unityAdFormat, bVar);
    }

    @Override // af.e
    public void b(Context context, boolean z10, df.b bVar) {
        this.f3754a.b(context, z10, bVar);
    }

    @Override // af.e
    public void c(Context context, List<UnityAdFormat> list, df.b bVar) {
        this.f3754a.c(context, list, bVar);
    }

    @Override // af.e
    public void d(Activity activity, String str, String str2) {
        cf.a aVar = this.f3755b.get(str2);
        if (aVar != null) {
            this.f3756c = aVar;
            k.a(new a(activity));
            return;
        }
        this.f3757d.handleError(b.f(str2, str, "Could not find ad for placement '" + str2 + "'."));
    }
}
