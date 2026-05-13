package ed;

import android.util.Log;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.netbean.ApiconfEntry;
import ed.x;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import okhttp3.Response;

/* JADX INFO: compiled from: RetryWithDelay.java */
/* JADX INFO: loaded from: classes12.dex */
public class c0 implements dm.o<xl.e<Throwable>, ms.a<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f61049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f61050e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f61051f = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61047b = 6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61048c = 1000;

    /* JADX INFO: compiled from: RetryWithDelay.java */
    public class a implements dm.o<Throwable, ms.a<?>> {
        public a() {
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ms.a<?> apply(Throwable th2) throws Exception {
            if (tp.b.a(BaseApplication.getInstance())) {
                if (AppApplication.apiList.size() > 0) {
                    if (!c0.this.f61051f) {
                        c0 c0Var = c0.this;
                        c0Var.f(AppApplication.apiList, c0Var.f61050e);
                        Log.i("wangyi", "get error, it will try after " + c0.this.f61048c + " millisecond, retry count " + c0.this.f61049d);
                        return xl.e.p(c0.this.f61048c, TimeUnit.MILLISECONDS);
                    }
                } else if (!c0.this.f61051f) {
                    c0.this.g();
                    Log.i("wangyi", "get net error, it will try after " + c0.this.f61048c + " millisecond, retry count " + c0.this.f61049d);
                    return xl.e.p(c0.this.f61048c, TimeUnit.MILLISECONDS);
                }
            }
            return xl.e.d(th2);
        }
    }

    /* JADX INFO: compiled from: RetryWithDelay.java */
    public class b implements x.b {
        public b() {
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
        }

        @Override // ed.x.b
        public void b(Response response) {
            try {
                String strTrim = response.body().string().trim();
                l0.u0(strTrim);
                RetrofitUrlManager.getInstance().setGlobalDomain(strTrim);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // dm.o
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ms.a<?> apply(xl.e<Throwable> eVar) throws Exception {
        return eVar.f(new a());
    }

    public void f(List<ApiconfEntry> list, int i10) {
        int i11 = i10 + 1;
        if (i11 >= list.size()) {
            g();
            return;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (i12 == i11) {
                if (list.get(i12).is_open() == 1 || l0.l() == 1) {
                    l0.u0(list.get(i12).getApi());
                    this.f61050e = i12;
                    RetrofitUrlManager.getInstance().setGlobalDomain(l0.p());
                    return;
                }
                i11++;
                this.f61050e = i12;
            }
        }
    }

    public void g() {
        Log.i("wangyi", "进入了");
        this.f61051f = true;
        x.a("https://filmin.h3x2.com/error.png", new b());
    }
}
