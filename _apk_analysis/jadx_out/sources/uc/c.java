package uc;

import android.util.Log;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.db.VideoAdLookDao;
import com.mgs.carparking.db.VideoStayTimeDao;
import com.mgs.carparking.netbean.AdInfoEntry;
import com.mgs.carparking.netbean.ShortVideoSysConfEntry;
import com.vungle.ads.internal.signals.SignalManager;
import ed.c0;
import ed.e;
import ed.g;
import ed.l0;
import hc.l;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.http.BaseResponse;
import xl.u;
import zp.d;
import zp.k;
import zp.o;
import zp.r;

/* JADX INFO: compiled from: SplashImp.java */
/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tc.a f85627a;

    /* JADX INFO: compiled from: SplashImp.java */
    public class a implements u<BaseResponse<List<ShortVideoSysConfEntry>>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<ShortVideoSysConfEntry>> baseResponse) {
            Log.e("conftime", "conf完成:" + System.currentTimeMillis());
            Log.e("conftime", "resp.isOk():" + baseResponse.getCode());
            if (!baseResponse.isOk()) {
                if (c.this.f85627a != null) {
                    c.this.f85627a.isConf(false);
                    return;
                }
                return;
            }
            Log.e("conftime", "resp.getResult()" + baseResponse.getResult().size());
            if (baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                k.i(r.b()).j("key_vip_online_audit", false);
            } else {
                ShortVideoSysConfEntry shortVideoSysConfEntry = null;
                for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                    if (40000 == baseResponse.getResult().get(i10).getVersion()) {
                        shortVideoSysConfEntry = baseResponse.getResult().get(i10);
                    }
                }
                if (shortVideoSysConfEntry == null || !e.t(shortVideoSysConfEntry.getChannel(), e.f(BaseApplication.getInstance()))) {
                    k.i(r.b()).j("key_vip_online_audit", false);
                } else {
                    k.i(r.b()).j("key_vip_online_audit", true);
                }
            }
            if (c.this.f85627a != null) {
                c.this.f85627a.isConf(true);
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            Log.e("conftime", "conf完成:" + th2.toString());
            if (c.this.f85627a != null) {
                c.this.f85627a.isConf(false);
            }
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    /* JADX INFO: compiled from: SplashImp.java */
    public class b implements u<BaseResponse<AdInfoEntry>> {
        public b() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<AdInfoEntry> baseResponse) {
            if (baseResponse.isOk()) {
                if (c.this.f85627a != null) {
                    c.this.f85627a.setAdInfo(baseResponse.getResult());
                }
            } else if (c.this.f85627a != null) {
                c.this.f85627a.setAdInfo(null);
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            if (c.this.f85627a != null) {
                c.this.f85627a.setAdInfo(null);
            }
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public c(tc.a aVar) {
        this.f85627a = aVar;
        AdNumShowDao.getInstance().insertHistory();
        ed.c.j(false);
        h();
        if (l0.u() > 0) {
            if (System.currentTimeMillis() - l0.u() > 604800000) {
                l0.q0(1);
            } else {
                l0.q0(0);
            }
        }
        l0.A0(System.currentTimeMillis());
        if (o.b(l0.v())) {
            l0.B0(d.c());
        }
        if (!l0.v().equals(d.c())) {
            l0.s0(0);
            l0.N0(0);
            l0.B0(d.c());
            VideoStayTimeDao.getInstance().clearHistory();
            l0.i1(0L);
            l0.D0(0);
            l0.M0(0);
            l0.Q0(0);
            l0.j0(0);
            AdNumShowDao.getInstance().update();
            VideoAdLookDao.getInstance().clearHistory();
        }
        try {
            if (o.b(l0.t()) || System.currentTimeMillis() - d.a(l0.t()) <= SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                return;
            }
            if (o.b(l0.K())) {
                l0.V0(1);
            } else {
                if (l0.K().equals(d.c())) {
                    return;
                }
                l0.V0(1);
            }
        } catch (ParseException e10) {
            e10.printStackTrace();
        }
    }

    public static /* synthetic */ void f(BaseResponse baseResponse) throws Exception {
        if (baseResponse.isOk()) {
            g.f("CACHE_HOME_TITLE_LIST", (List) baseResponse.getResult());
        }
    }

    public static /* synthetic */ void g(Throwable th2) throws Exception {
    }

    public void d() {
        tb.a.a().getAdInfo().e(new l()).e(new hc.c()).k(new c0()).c(new b());
    }

    public void e() {
        Log.e("conftime", "conf开始:" + System.currentTimeMillis());
        HashMap map = new HashMap();
        map.put("conf_key", "conf_key1");
        tb.a.a().T(map).e(new l()).e(new hc.c()).k(new c0()).c(new a());
    }

    public final void h() {
        HashMap map = new HashMap();
        if (e.j() == 5) {
            map.put("cgl", e.l());
        }
        tb.a.a().e(map).e(new l()).e(new hc.c()).l(new dm.g() { // from class: uc.a
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                c.f((BaseResponse) obj);
            }
        }, new dm.g() { // from class: uc.b
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                c.g((Throwable) obj);
            }
        });
    }
}
