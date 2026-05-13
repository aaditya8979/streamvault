package ed;

import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.db.SpecialCollectionDao;
import com.mgs.carparking.db.VideoCollectionDao;
import com.mgs.carparking.dbtable.SpecialCollectionEntry;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.netbean.AdInfoEntry;
import com.mgs.carparking.netbean.AdSysConfEntry;
import com.mgs.carparking.netbean.UserDeviceEntity;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.vungle.ads.internal.signals.SignalManager;
import ed.x;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import okhttp3.Response;

/* JADX INFO: compiled from: ApiRequestUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class a implements xl.u<BaseResponse<String>> {
        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class b implements x.b {
        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            Log.i("wangyi", "get成功：");
        }
    }

    /* JADX INFO: renamed from: ed.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class C0744c implements xl.u<BaseResponse<String>> {
        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class d implements xl.u<BaseResponse<String>> {
        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class e implements xl.u<BaseResponse<String>> {
        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            op.a.a().b(new ic.k0(tq.a.n(baseResponse)));
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class f implements xl.u<BaseResponse<UserDeviceEntity>> {
        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<UserDeviceEntity> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            if (baseResponse.getResult().getUser_info() != null) {
                l0.h1(baseResponse.getResult().getUser_info().getSvip_validity());
                l0.e1(baseResponse.getResult().getUser_info().is_svip());
                l0.d1(baseResponse.getResult().getUser_info().getUser_id());
                l0.a1(baseResponse.getResult().getUser_info().getToken());
                l0.K0(baseResponse.getResult().getUser_info().getLogin_type());
                if (baseResponse.getResult().getUser_info().is_vip() == 1) {
                    l0.F0(true);
                } else {
                    l0.F0(false);
                }
                if (zp.o.b(l0.t()) && !zp.o.b(baseResponse.getResult().getUser_info().getCreate_time())) {
                    l0.z0(baseResponse.getResult().getUser_info().getCreate_time());
                    try {
                        if (System.currentTimeMillis() - zp.d.a(baseResponse.getResult().getUser_info().getCreate_time()) > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                            l0.V0(1);
                        } else {
                            l0.V0(0);
                        }
                    } catch (ParseException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            if (baseResponse.getResult().getSys_conf() != null) {
                if (baseResponse.getResult().getSys_conf() != null && baseResponse.getResult().getSys_conf().getApi_conf() != null) {
                    AppApplication.apiList = baseResponse.getResult().getSys_conf().getApi_conf();
                    AppApplication.ex_tab_name = baseResponse.getResult().getSys_conf().getEx_tab_name();
                    zp.k.i(zp.r.b()).p("CACHE_DOMAIN_LIST", baseResponse.getResult().getSys_conf().getApi_conf());
                    op.a.a().b(new ic.h());
                }
                if (!zp.o.b(baseResponse.getResult().getSys_conf().getApi_url2()) && !l0.p().equals(baseResponse.getResult().getSys_conf().getApi_url2())) {
                    l0.u0(baseResponse.getResult().getSys_conf().getApi_url2());
                    RetrofitUrlManager.getInstance().setGlobalDomain(baseResponse.getResult().getSys_conf().getApi_url2());
                }
                if (!zp.o.c(baseResponse.getResult().getSys_conf().getExternal_h5_url())) {
                    l0.Y0(baseResponse.getResult().getSys_conf().getExternal_h5_url());
                }
                if (!zp.o.c(baseResponse.getResult().getSys_conf().getUser_h5_url())) {
                    l0.O0(baseResponse.getResult().getSys_conf().getUser_h5_url());
                }
                l0.T0(baseResponse.getResult().getSys_conf().getShare_content());
                l0.I0(baseResponse.getResult().getSys_conf().is_projection());
                l0.k1(baseResponse.getResult().getSys_conf().getWebsite());
                l0.L0(baseResponse.getResult().getSys_conf().getMax_view_num());
                l0.o0(baseResponse.getResult().getSys_conf().getAd_view_time() * 1000);
                l0.g0(baseResponse.getResult().getSys_conf().getShow_ad_time() * 1000);
                l0.Z0(baseResponse.getResult().getSys_conf().getToday_view_ad());
                l0.h0(baseResponse.getResult().getSys_conf().getAd_download_num());
                l0.m0(baseResponse.getResult().getSys_conf().getNetCineVarShort_play_ad_freq());
                if (!zp.o.b(baseResponse.getResult().getSys_conf().getHide_ad())) {
                    l0.n0(Integer.parseInt(baseResponse.getResult().getSys_conf().getHide_ad()));
                }
                l0.C0(baseResponse.getResult().getSys_conf().getFeedback_tags());
                if (!zp.o.b(baseResponse.getResult().getSys_conf().getVod_feedback_tags())) {
                    l0.j1(baseResponse.getResult().getSys_conf().getVod_feedback_tags());
                }
                if (baseResponse.getResult().getSys_conf().getShow_open_screen_ad_time() > 0) {
                    l0.l1(baseResponse.getResult().getSys_conf().getShow_open_screen_ad_time());
                }
                l0.m1(baseResponse.getResult().getSys_conf().getPrivacy_url());
                l0.w0(baseResponse.getResult().getSys_conf().getCustomer_service_url());
                l0.P0(baseResponse.getResult().getSys_conf().getIos_p_card_list());
                l0.x0(baseResponse.getResult().getSys_conf().getNetCineVarApp_language_options());
            }
            c.g(1);
            c.f(2);
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            Log.i("wangyi", "错误为：" + th2.toString());
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class g implements xl.u<BaseResponse<List<VideoCollectionEntry>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f61041b;

        public g(int i10) {
            this.f61041b = i10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<VideoCollectionEntry>> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null || baseResponse.getResult().size() <= 0 || this.f61041b != 1) {
                return;
            }
            VideoCollectionDao.getInstance().clearHistory();
            Iterator<VideoCollectionEntry> it = baseResponse.getResult().iterator();
            while (it.hasNext()) {
                VideoCollectionDao.getInstance().insert(it.next());
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class h implements xl.u<BaseResponse<List<SpecialCollectionEntry>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f61042b;

        public h(int i10) {
            this.f61042b = i10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<SpecialCollectionEntry>> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null || baseResponse.getResult().size() <= 0 || this.f61042b != 2) {
                return;
            }
            SpecialCollectionDao.getInstance().clearHistory();
            Iterator<SpecialCollectionEntry> it = baseResponse.getResult().iterator();
            while (it.hasNext()) {
                SpecialCollectionDao.getInstance().insert(it.next());
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class i implements xl.u<BaseResponse<String>> {
        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class j implements xl.u<BaseResponse<AdInfoEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f61043b;

        public j(boolean z10) {
            this.f61043b = z10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<AdInfoEntry> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            zp.k.i(zp.r.b()).n(baseResponse.getResult());
            AppApplication.adInfoEntry = baseResponse.getResult();
            c.k(this.f61043b, false);
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class k implements xl.u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f61044b;

        public k(boolean z10) {
            this.f61044b = z10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            l0.S0(baseResponse.getResult());
            if (this.f61044b) {
                AppApplication.loadP2pSdk();
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class l implements xl.u<BaseResponse<AdSysConfEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f61045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f61046c;

        public l(boolean z10, boolean z11) {
            this.f61045b = z10;
            this.f61046c = z11;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<AdSysConfEntry> baseResponse) {
            Log.e("conftime", "AppApplicationconf结束:" + System.currentTimeMillis());
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                if (this.f61045b) {
                    AppApplication.loadAdConf(l0.b(), l0.c(), l0.a());
                    return;
                }
                return;
            }
            if (this.f61045b) {
                AppApplication.loadAdConf(baseResponse.getResult().getSdk_4(), baseResponse.getResult().getSdk_2(), baseResponse.getResult().getSdk_2_key());
            } else if (!this.f61046c && (!l0.b().equals(baseResponse.getResult().getSdk_4()) || !l0.c().equals(baseResponse.getResult().getSdk_2()))) {
                AppApplication.loadAdConf(baseResponse.getResult().getSdk_4(), baseResponse.getResult().getSdk_2(), baseResponse.getResult().getSdk_2_key());
            }
            l0.e0(baseResponse.getResult().getSdk_4());
            l0.f0(baseResponse.getResult().getSdk_2());
            l0.d0(baseResponse.getResult().getSdk_2_key());
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            if (this.f61045b) {
                AppApplication.loadAdConf(l0.b(), l0.c(), l0.a());
            }
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public static void a(String str) {
        HashMap map = new HashMap();
        map.put("data", str);
        tb.a.a().c(map).e(new hc.l()).e(new hc.c()).c(new e());
    }

    public static void b(boolean z10) {
        tb.a.a().getAdInfo().e(new hc.l()).e(new hc.c()).k(new c0()).c(new j(z10));
    }

    public static void c() {
        tb.a.a().k(new HashMap()).e(new hc.l()).e(new hc.c()).c(new d());
    }

    public static void d(String str) {
        HashMap map = new HashMap();
        map.put("type", 5);
        map.put("content", str);
        tb.a.a().v(map).e(new hc.l()).e(new hc.c()).c(new C0744c());
    }

    public static void e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        HashMap map = new HashMap();
        map.put("log_type", Integer.valueOf(i10));
        map.put("ad_type", Integer.valueOf(i11));
        map.put(CampaignEx.JSON_KEY_AD_SOURCE_ID, Integer.valueOf(i12));
        map.put("ad_position", Integer.valueOf(i13));
        map.put(CreativeInfo.f52474c, Integer.valueOf(i14));
        map.put("is_success", Integer.valueOf(i15));
        map.put("vod_id", Integer.valueOf(i16));
        map.put("collection", Integer.valueOf(i17));
        tb.a.a().l(map).e(new hc.l()).e(new hc.c()).c(new a());
    }

    public static void f(int i10) {
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(i10));
        if (ed.e.j() == 18) {
            map.put("uvgl", ed.e.l());
        }
        tb.a.a().f(map).e(new hc.l()).e(new hc.c()).c(new h(i10));
    }

    public static void g(int i10) {
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(i10));
        if (ed.e.j() == 18) {
            map.put("uvgl", ed.e.l());
        }
        tb.a.a().L(map).e(new hc.l()).e(new hc.c()).c(new g(i10));
    }

    public static void h(String str) {
        HashMap map = new HashMap();
        map.put("invited_by", str);
        map.put("is_install", ed.e.p() ? "1" : "0");
        tb.a.a().I(map).k(new c0()).e(new hc.l()).e(new hc.c()).c(new f());
    }

    public static void i(int i10) {
        x.a("http://127.0.0.1:" + AppApplication.port + "/control?msg=net_info&nettype=" + i10, new b());
    }

    public static void j(boolean z10) {
        HashMap map = new HashMap();
        map.put("conf_key", "p2p_config");
        tb.a.a().i(map).e(new hc.l()).e(new hc.c()).k(new c0()).c(new k(z10));
    }

    public static void k(boolean z10, boolean z11) {
        Log.e("conftime", "AppApplicationconf开始:" + System.currentTimeMillis());
        HashMap map = new HashMap();
        map.put("conf_key", "ad_appid");
        tb.a.a().Q(map).e(new hc.l()).e(new hc.c()).k(new c0()).c(new l(z10, z11));
    }

    public static void l(String str, int i10, int i11, int i12, int i13, int i14) {
        HashMap map = new HashMap();
        map.put("tj_code", str);
        map.put("type", Integer.valueOf(i10));
        map.put("data_id", Integer.valueOf(i11));
        map.put("data_pid", Integer.valueOf(i12));
        map.put("user_id", l0.T() + "");
        map.put("vod_id", Integer.valueOf(i13));
        map.put("user_id", Integer.valueOf(i14));
        tb.a.a().A(map).e(new hc.l()).e(new hc.c()).c(new i());
    }
}
