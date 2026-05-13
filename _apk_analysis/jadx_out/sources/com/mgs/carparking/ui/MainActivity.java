package com.mgs.carparking.ui;

import ab.l;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.mgs.carparking.androidupnp.service.ClingUpnpService;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityMainBinding;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.model.MAINVIEWMODEL;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.netbean.AdInfoEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.server.NetBroadcastReceiver;
import com.mgs.carparking.ui.MainActivity;
import com.mgs.carparking.ui.channelcontent.CategoryFragment;
import com.mgs.carparking.ui.homecontent.HomePageFragment;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.ui.mine.MineFragment;
import com.mgs.carparking.ui.mine.languageswitching.SetLanguageDialog;
import com.mgs.carparking.ui.ranklist.RankNumberNewFragment;
import com.mgs.carparking.ui.spiel.SpielFragment;
import com.mgs.carparking.widgets.tab.TabLayout;
import com.pp.hls;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.wangxiong.sdk.WxSDK;
import com.wangxiong.sdk.view.RewardVideoLoader;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainPreloadAdCallback;
import ed.d0;
import ed.g0;
import ed.l0;
import ed.x;
import ed.z;
import ic.b0;
import ic.i0;
import ic.j0;
import ic.k0;
import ic.n;
import ic.t;
import ic.u;
import ic.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.goldze.mvvmhabit.base.BaseApplication;
import okhttp3.Response;
import sd.f;
import zp.o;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes7.dex */
public class MainActivity extends BaseActivity<ActivityMainBinding, MAINVIEWMODEL> implements TabLayout.a {
    public static final String[] H = {"android.permission.READ_PHONE_STATE"};
    public static qb.a mBrowseRegistryListener = new qb.a();
    public static nb.a mClingPlayControl = null;
    public static d0 rxTimer = null;
    public fd.h D;
    public fd.d G;
    public BroadcastReceiver mTransportStateBroadcastReceiver;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public vd.a f44535t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public NetBroadcastReceiver f44539x;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f44536u = new Handler();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f44537v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f44538w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List<String> f44540y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f44541z = false;
    public boolean A = false;
    public boolean B = false;
    public AdInfoDetailEntry C = null;
    public long E = 0;
    public Handler mHandler = new i(this, null);
    public ServiceConnection F = new f();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MAINVIEWMODEL) MainActivity.this.f42501p).f44077h.set(Boolean.FALSE);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l0.z() || AppApplication.adInfoEntry.getAd_position_9() == null || AppApplication.adInfoEntry.getAd_position_9().size() <= 0) {
                return;
            }
            ed.b.b(MainActivity.this, AppApplication.adInfoEntry.getAd_position_9());
        }
    }

    public class c implements f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sd.f f44544a;

        public c(sd.f fVar) {
            this.f44544a = fVar;
        }

        @Override // sd.f.c
        public void a(int i10) {
            this.f44544a.dismiss();
            Bundle bundle = new Bundle();
            bundle.putInt("id", i10);
            MainActivity.this.startActivity(VideoPlayDetailActivity.class, bundle);
        }
    }

    public class d implements fd.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sd.d f44546a;

        public d(sd.d dVar) {
            this.f44546a = dVar;
        }

        @Override // fd.i
        public void a(String str, String str2) {
            op.a.a().b(new k0("{\"code\":10006}"));
            Log.e("WEB_AD", "---------------激励错误：" + str + "-----------------" + str2);
            MainActivity.this.f44536u.removeCallbacksAndMessages(null);
            if (MainActivity.this.D != null) {
                MainActivity.this.D.a();
                MainActivity.this.D = null;
            }
            ed.c.e(1, MainActivity.this.C.getAd_type(), MainActivity.this.C.getAd_source_id(), 27, MainActivity.this.C.getAd_id(), 0, 0, 0);
            ed.c.d("adposition:27 Ad_source_id:" + MainActivity.this.C.getAd_source_id() + " +s:" + str + " s1:" + str2);
            MainActivity.this.B = false;
            MainActivity.this.f44541z = false;
            MainActivity.this.A = false;
        }

        @Override // fd.i
        public void b() {
            Log.e("WEB_AD", "---------------激励点击----------------------");
            ed.c.e(3, MainActivity.this.C.getAd_type(), MainActivity.this.C.getAd_source_id(), 27, MainActivity.this.C.getAd_id(), 1, 0, 0);
        }

        @Override // fd.i
        public void c() {
            Log.e("WEB_AD", "---------------激励视频广告关闭----------------------");
            ed.c.c();
            AdNumShowDao.getInstance().updatePlayTdNum(AdNumShowDao.getInstance().getNum(8) + 1);
            ed.c.e(5, MainActivity.this.C.getAd_type(), MainActivity.this.C.getAd_source_id(), 27, MainActivity.this.C.getAd_id(), 1, 0, 0);
            if (MainActivity.this.D != null) {
                MainActivity.this.D.a();
                MainActivity.this.D = null;
            }
            MainActivity.this.B = false;
            MainActivity.this.f44541z = false;
        }

        @Override // fd.i
        public void d() {
            AnimationDrawable animationDrawable = this.f44546a.f79650d;
            if (animationDrawable != null) {
                animationDrawable.stop();
            }
            this.f44546a.dismiss();
            MainActivity.this.B = true;
            MainActivity.this.A = false;
            MainActivity.this.f44536u.removeCallbacksAndMessages(null);
            ed.c.e(4, MainActivity.this.C.getAd_type(), MainActivity.this.C.getAd_source_id(), 27, MainActivity.this.C.getAd_id(), 1, 0, 0);
            Log.e("WEB_AD", "---------------激励视频广告收到数据----------------------");
        }

        @Override // fd.i
        public void onAdShow() {
            op.a.a().b(new k0("{\"code\":10005}"));
            ed.c.e(2, MainActivity.this.C.getAd_type(), MainActivity.this.C.getAd_source_id(), 27, MainActivity.this.C.getAd_id(), 1, 0, 0);
            Log.e("WEB_AD", "---------------激励视频广告展示----------------------");
            MainActivity.this.f44541z = true;
        }

        @Override // fd.i
        public void onReward(String str) {
            Log.e("WEB_AD", "---------------上报领取奖励----------------------");
            MainActivity.this.f44541z = false;
        }
    }

    public class e implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f44549b;

        public e(String str, String str2) {
            this.f44548a = str;
            this.f44549b = str2;
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            try {
                ((MAINVIEWMODEL) MainActivity.this.f42501p).o(this.f44548a, this.f44549b, response.body().string());
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public class f implements ServiceConnection {
        public f() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.e("wangyi", "mUpnpServiceConnection onServiceConnected");
            ClingUpnpService clingUpnpServiceB = ((ClingUpnpService.a) iBinder).b();
            rb.a aVarC = rb.a.c();
            aVarC.i(clingUpnpServiceB);
            aVarC.h(new rb.b());
            aVarC.d().n(MainActivity.mBrowseRegistryListener);
            aVarC.g();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.e("wangyi", "mUpnpServiceConnection onServiceDisconnected");
            rb.a.c().i(null);
        }
    }

    public class g implements MainPreloadAdCallback {
        public g() {
        }

        @Override // com.yk.e.callBack.MainPreloadAdCallback
        public void onFailed() {
            AppApplication.AdsInit = false;
            Log.e("VIDEO_PLAY", "---------------------广告预加载失败:" + System.currentTimeMillis() + "---------------------");
        }

        @Override // com.yk.e.callBack.MainPreloadAdCallback
        public void onSucceeded() {
            AppApplication.AdsInit = true;
            Log.e("VIDEO_PLAY", "---------------------广告预加载成功:" + System.currentTimeMillis() + "---------------------");
        }
    }

    public class h implements MainPreloadAdCallback {
        public h() {
        }

        @Override // com.yk.e.callBack.MainPreloadAdCallback
        public void onFailed() {
            Log.i("wangyi", "预加载插屏广告失败！");
        }

        @Override // com.yk.e.callBack.MainPreloadAdCallback
        public void onSucceeded() {
            Log.i("wangyi", "预加载插屏广告成功！");
        }
    }

    public final class i extends Handler {
        public i() {
        }

        public /* synthetic */ i(MainActivity mainActivity, a aVar) {
            this();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 161:
                    Log.i("wangyi", "Execute PLAY_ACTION");
                    MainActivity.mClingPlayControl.a(1);
                    break;
                case 162:
                    Log.i("wangyi", "Execute PAUSE_ACTION");
                    MainActivity.mClingPlayControl.a(2);
                    break;
                case 163:
                    Log.i("wangyi", "Execute STOP_ACTION");
                    MainActivity.mClingPlayControl.a(3);
                    MainActivity.this.destroy();
                    break;
                case 164:
                    Log.i("wangyi", "Execute TRANSITIONING_ACTION");
                    break;
                case 165:
                    Log.e("wangyi", "Execute ERROR_ACTION");
                    break;
            }
        }
    }

    public class j extends BroadcastReceiver {
        public j() {
        }

        public /* synthetic */ j(MainActivity mainActivity, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Log.e("wangyi", "Receive playback intent:" + action);
            if ("com.mgs.carparking.androidupnp.action.playing".equals(action)) {
                MainActivity.this.mHandler.sendEmptyMessage(161);
                return;
            }
            if ("com.mgs.carparking.androidupnp.action.paused_playback".equals(action)) {
                MainActivity.this.mHandler.sendEmptyMessage(162);
            } else if ("com.mgs.carparking.androidupnp.action.stopped".equals(action)) {
                MainActivity.this.mHandler.sendEmptyMessage(163);
            } else if ("com.mgs.carparking.androidupnp.action.transitioning".equals(action)) {
                MainActivity.this.mHandler.sendEmptyMessage(164);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        z.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Boolean bool) throws Exception {
        if (!bool.booleanValue() && !l.g()) {
            gc.a aVarC = gc.a.c(new DialogInterface.OnClickListener() { // from class: kc.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f73058b.L(dialogInterface, i10);
                }
            });
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this, R.style.BDAlertDialog).setTitle(r.b().getResources().getString(R.string.str_tip)).setMessage(r.b().getResources().getString(R.string.str_stored_permissions_tip)).setPositiveButton(r.b().getResources().getString(R.string.text_mine_setting), aVarC).setCancelable(false).create();
            aVarC.b(alertDialogCreate);
            alertDialogCreate.show();
            return;
        }
        if (l0.g() == 0) {
            l0.k0(1);
            for (String str : H) {
                if (ContextCompat.checkSelfPermission(this, str) != 0) {
                    this.f44540y.add(str);
                    if (!this.f44540y.isEmpty()) {
                        List<String> list = this.f44540y;
                        ActivityCompat.requestPermissions(this, (String[]) list.toArray(new String[list.size()]), 1);
                    }
                }
            }
        }
        if (o.b(l0.J())) {
            return;
        }
        loadP2pSdk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(ic.h hVar) throws Exception {
        ((ActivityMainBinding) this.f42500o).f42689d.a(3).setUpData(new TabLayout.b(R.drawable.selector_tab_spiel, AppApplication.ex_tab_name, R.drawable.selector_tab_home_color, -1, SpielFragment.class, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(ic.a aVar) throws Exception {
        if (aVar.getType().equals("0")) {
            Log.e("OKT_SDK", "---------------WxSDK_onInitSuccess----------------------");
            a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(Void r12) {
        loadP2pSdk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(ic.z zVar) throws Exception {
        if (ed.e.v(this, "com.mgs.carparking.androidupnp.service.ClingUpnpService")) {
            return;
        }
        Log.i("wangyi", "初始化service");
        mClingPlayControl = new nb.a();
        bindServices();
        b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(y yVar) throws Exception {
        destroy();
    }

    public static /* synthetic */ void S(j0 j0Var) throws Exception {
        Log.e("WEB_AD", "---------------WebAddAdFreeDaysEvent----------------------");
        ed.c.a(j0Var.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(i0 i0Var) throws Exception {
        RewardVideoLoader rewardVideoLoader;
        Log.e("WEB_AD", "---------------" + i0Var.getType().toString() + "----------------------");
        if (this.f44541z) {
            Log.e("WEB_AD", "---------------激励视频广告正在播放----------------------");
            return;
        }
        if (!i0Var.getType().equals("2")) {
            if (!i0Var.getType().equals("1") || this.D == null) {
                return;
            }
            Log.e("WEB_AD", "---------------展示广告----------------------");
            this.D.f61659b.showAd();
            return;
        }
        fd.h hVar = this.D;
        if (hVar == null) {
            this.B = false;
        }
        if (hVar != null && ((rewardVideoLoader = hVar.f61659b) == null || rewardVideoLoader.isExpired())) {
            this.B = false;
        }
        Log.e("WEB_AD", "---------------isReady:" + this.B + "----------------------");
        if (this.B) {
            op.a.a().b(new k0("{\"code\":10007}"));
            return;
        }
        Log.e("WEB_AD", "---------------激励广告未准备成功重新loadAd----------------------");
        c0();
        AdInfoDetailEntry adInfoDetailEntry = this.C;
        if (adInfoDetailEntry != null) {
            ed.c.e(7, adInfoDetailEntry.getAd_type(), this.C.getAd_source_id(), 27, this.C.getAd_id(), 1, 0, 0);
        }
        op.a.a().b(new k0("{\"code\":10008}"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(b0 b0Var) throws Exception {
        ((ActivityMainBinding) this.f42500o).f42689d.setCurrentTab(b0Var.a() - 101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(n nVar) throws Exception {
        ((MAINVIEWMODEL) this.f42501p).f44078i.set(Boolean.valueOf(nVar.a()));
    }

    public static /* synthetic */ void W(u uVar) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(RecommandVideosEntity recommandVideosEntity) {
        if (isFinishing()) {
            return;
        }
        l0.y0(1);
        sd.f fVar = new sd.f(this, recommandVideosEntity);
        fVar.showAtLocation(((ActivityMainBinding) this.f42500o).f42687b, 0, 0, 0);
        fVar.a(new c(fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(ic.g gVar) throws Exception {
        appNotice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(t tVar) throws Exception {
        if (AppApplication.adInfoEntry.getAd_position_1() != null && AppApplication.adInfoEntry.getAd_position_1().size() > 0) {
            ed.b.B(this, AppApplication.adInfoEntry.getAd_position_1());
        }
        ed.c.b(false);
    }

    public final void a0() {
        WxSDK.initAdCache(this);
        Log.e("VIDEO_PLAY", "---------------------广告预加载开始:" + System.currentTimeMillis() + "---------------------");
        WxSDK.preloadRewardAd(new g());
        if (AppApplication.adInfoEntry.getAd_position_9() == null || AppApplication.adInfoEntry.getAd_position_9().size() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < AppApplication.adInfoEntry.getAd_position_9().size(); i10++) {
            WxSDK.preloadInterstitialAd(new h());
        }
    }

    public void appNotice() {
        if (AppApplication.adInfoEntry.getAd_position_7() == null || AppApplication.adInfoEntry.getAd_position_7().size() <= 0) {
            return;
        }
        AdInfoDetailEntry adInfoDetailEntry = AppApplication.adInfoEntry.getAd_position_7().get(0);
        if (adInfoDetailEntry.getAd_id() != l0.o()) {
            l0.t0(adInfoDetailEntry.getAd_id());
            l0.s0(0);
        }
        if (adInfoDetailEntry.getNum() == 0) {
            if (isFinishing()) {
                return;
            }
            new sd.e(this, adInfoDetailEntry).showAtLocation(((ActivityMainBinding) this.f42500o).f42689d, 0, 0, 0);
        } else {
            if (adInfoDetailEntry.getNum() <= l0.n() || isFinishing()) {
                return;
            }
            l0.s0(l0.n() + 1);
            new sd.e(this, adInfoDetailEntry).showAtLocation(((ActivityMainBinding) this.f42500o).f42689d, 0, 0, 0);
        }
    }

    public final void b0() {
        this.mTransportStateBroadcastReceiver = new j(this, null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.mgs.carparking.androidupnp.action.playing");
        intentFilter.addAction("com.mgs.carparking.androidupnp.action.paused_playback");
        intentFilter.addAction("com.mgs.carparking.androidupnp.action.stopped");
        intentFilter.addAction("com.mgs.carparking.androidupnp.action.transitioning");
        intentFilter.addAction("com.mgs.carparking.androidupnp.action.position_callback");
        if (Build.VERSION.SDK_INT >= 26) {
            registerReceiver(this.mTransportStateBroadcastReceiver, intentFilter, 4);
        }
    }

    public void bindServices() {
        bindService(new Intent(this, (Class<?>) ClingUpnpService.class), this.F, 1);
    }

    public final void c0() {
        if (this.A) {
            Log.e("WEB_AD", "---------------广告正在准备中----------------------");
            return;
        }
        this.A = true;
        Log.e("WEB_AD", "---------------showWebAd----------------------");
        AdInfoEntry adInfoEntry = AppApplication.adInfoEntry;
        if (adInfoEntry == null) {
            Log.e("WEB_AD", "---------------AdInfoDetailEntry==null----------------------");
            return;
        }
        if (adInfoEntry.getAd_position_27() == null) {
            Log.e("WEB_AD", "---------------AdInfoDetailEntry==null----------------------");
            return;
        }
        AdInfoDetailEntry adInfoDetailEntry = AppApplication.adInfoEntry.getAd_position_27().get(0);
        this.C = adInfoDetailEntry;
        if (adInfoDetailEntry == null) {
            Log.e("WEB_AD", "---------------AdInfoDetailEntry==null----------------------");
            return;
        }
        this.D = new fd.h(this, adInfoDetailEntry);
        this.D.b(new d(new sd.d(this)));
        fd.h hVar = this.D;
        if (hVar != null) {
            hVar.f61659b.loadAd();
            Log.e("WEB_AD", "---------------激励广告LoadAd----------------------");
            ed.c.e(7, this.C.getAd_type(), this.C.getAd_source_id(), 27, this.C.getAd_id(), 1, 0, 0);
        }
    }

    public void destroy() {
        if (this.mTransportStateBroadcastReceiver != null) {
            unbindService(this.F);
            unregisterReceiver(this.mTransportStateBroadcastReceiver);
            rb.a.c().a();
            pb.c.e().b();
            mClingPlayControl = null;
            this.mTransportStateBroadcastReceiver = null;
            gd.a.a();
            d0 d0Var = rxTimer;
            if (d0Var != null) {
                d0Var.b();
                rxTimer = null;
            }
        }
    }

    public void getPermissions() {
        k(new RxPermissions(this).request("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").subscribe(new dm.g() { // from class: kc.e
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f73057b.M((Boolean) obj);
            }
        }));
    }

    public void getSign(String str) {
        if (AppApplication.port > 0) {
            String str2 = System.currentTimeMillis() + "";
            x.a("http://127.0.0.1:" + AppApplication.port + "/control?msg=verify&device_id=" + ec.a.a(r.b()) + str + "&ts=" + str2, new e(str, str2));
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_main;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        ArrayList<TabLayout.b> arrayList = new ArrayList<>();
        arrayList.add(new TabLayout.b(R.drawable.selector_tab_home, getString(R.string.main_tab_home), R.drawable.selector_tab_home_color, -1, HomePageFragment.class, 0));
        arrayList.add(new TabLayout.b(R.drawable.selector_tab_rank, getString(R.string.main_tab_rank), R.drawable.selector_tab_home_color, -1, RankNumberNewFragment.class, 1));
        arrayList.add(new TabLayout.b(R.drawable.selector_tab_channel, getString(R.string.main_tab_channel), R.drawable.selector_tab_home_color, -1, CategoryFragment.class, 2));
        arrayList.add(new TabLayout.b(R.drawable.selector_tab_spiel, AppApplication.ex_tab_name, R.drawable.selector_tab_home_color, -1, SpielFragment.class, 3));
        arrayList.add(new TabLayout.b(R.drawable.selector_tab_mine, getString(R.string.main_tab_mine), R.drawable.selector_tab_home_color, -1, MineFragment.class, 4));
        k(op.a.a().d(ic.h.class).subscribe(new dm.g() { // from class: kc.a
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f73053b.N((ic.h) obj);
            }
        }));
        ((ActivityMainBinding) this.f42500o).f42689d.b(arrayList, this);
        if (!this.f44537v) {
            ((ActivityMainBinding) this.f42500o).f42689d.setCurrentTab(getIntent().getIntExtra("id", 0));
            this.f44537v = true;
        }
        if (g0.f61064a.d(false)) {
            new SetLanguageDialog(this).show();
        } else {
            new vc.j0().H(this, this, false);
        }
        this.f44536u.postDelayed(new a(), 5000L);
        this.f44536u.postDelayed(new b(), 500L);
        a0();
        if (this.D == null) {
            c0();
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public MAINVIEWMODEL initViewModel() {
        return new MAINVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        k(op.a.a().d(ic.a.class).subscribe(new dm.g() { // from class: kc.g
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f73059b.O((ic.a) obj);
            }
        }));
        k(op.a.a().d(j0.class).subscribe(new dm.g() { // from class: kc.j
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                MainActivity.S((j0) obj);
            }
        }));
        k(op.a.a().d(i0.class).subscribe(new dm.g() { // from class: kc.k
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f73062b.T((i0) obj);
            }
        }));
        k(op.a.a().d(b0.class).subscribe(new dm.g() { // from class: kc.l
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f73063b.U((b0) obj);
            }
        }));
        k(op.a.a().e(n.class).subscribe(new dm.g() { // from class: kc.m
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f73064b.V((ic.n) obj);
            }
        }));
        k(op.a.a().d(u.class).subscribe(new dm.g() { // from class: kc.n
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                MainActivity.W((u) obj);
            }
        }));
        ((MAINVIEWMODEL) this.f42501p).f44080k.observe(this, new Observer() { // from class: kc.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f73065b.X((RecommandVideosEntity) obj);
            }
        });
        k(op.a.a().d(ic.g.class).subscribe(new dm.g() { // from class: kc.b
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f73054b.Y((ic.g) obj);
            }
        }));
        k(op.a.a().d(t.class).subscribe(new dm.g() { // from class: kc.c
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f73055b.Z((t) obj);
            }
        }));
        ((MAINVIEWMODEL) this.f42501p).f44082m.observe(this, new Observer() { // from class: kc.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f73056b.P((Void) obj);
            }
        });
        k(op.a.a().d(ic.z.class).subscribe(new dm.g() { // from class: kc.h
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f73060b.Q((ic.z) obj);
            }
        }));
        k(op.a.a().d(y.class).subscribe(new dm.g() { // from class: kc.i
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f73061b.R((y) obj);
            }
        }));
    }

    public void loadAdFloatAdOnce(List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() <= 0) {
                AdNumShowDao.getInstance().updateFloatAdIndexNum(i10);
                loadFloatAdWX(adInfoDetailEntry);
            } else if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(103)) {
                AdNumShowDao.getInstance().updateFloatAdIndexNum(i10);
                loadFloatAdWX(adInfoDetailEntry);
            } else {
                int i11 = i10 + 1;
                if (i11 == list.size()) {
                    i11 = 0;
                }
                loadAdFloatAdOnce(list, i11);
            }
        }
    }

    public void loadAdFloatViewAd() {
        if (AppApplication.adInfoEntry.getAd_position_18() == null || AppApplication.adInfoEntry.getAd_position_18().size() <= 0) {
            return;
        }
        List<AdInfoDetailEntry> ad_position_18 = AppApplication.adInfoEntry.getAd_position_18();
        int num = AdNumShowDao.getInstance().getNum(102);
        if (num >= ad_position_18.size() - 1) {
            loadAdFloatAdOnce(ad_position_18, 0);
        } else {
            loadAdFloatAdOnce(ad_position_18, num + 1);
        }
    }

    public void loadFloatAdWX(AdInfoDetailEntry adInfoDetailEntry) {
        fd.d dVar = this.G;
        if (dVar != null) {
            dVar.d();
        }
        fd.d dVar2 = new fd.d(this);
        this.G = dVar2;
        dVar2.c(adInfoDetailEntry);
        AdNumShowDao.getInstance().updateWxFloatAdNum(AdNumShowDao.getInstance().getNum(103) + 1);
    }

    public void loadP2pSdk() {
        if (AppApplication.port <= 0) {
            hls hlsVar = new hls();
            ed.e.x("BE2FB29B23E42031B1900D85E0756B75+com.dramarush.shortin+63");
            Log.i("wangyi", "googlep2p2sign为：" + ed.e.x("BE2FB29B23E42031B1900D85E0756B75+com.dramarush.shortin+63"));
            Log.i("wangyi", "localp2p2sign为：" + ed.e.x("A21635498FB7F1E13648270050E1346E+com.dramarush.shortin+63"));
            String absolutePath = getExternalFilesDir("").getAbsolutePath();
            if (Environment.getExternalStorageDirectory() != null) {
                absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            }
            AppApplication.port = hlsVar.load("c456f75b75d7a1b0b2e0fa85833292a6", "com.dramarush.shortin", "63", absolutePath, getExternalFilesDir("").getAbsolutePath(), l0.J(), "1");
            Log.i("wangyi", "端口号为：" + AppApplication.port);
            if (!o.b(AppApplication.clipStr)) {
                Matcher matcher = Pattern.compile("#yingshi#(.+)#@#").matcher(AppApplication.clipStr);
                if (matcher.find() && !o.b(matcher.group(1))) {
                    getSign(AppApplication.clipStr);
                }
            }
        }
        ed.e.d();
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        r.g(this);
        super.onCreate(bundle);
        zp.n.a(this);
        this.f44539x = new NetBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.f44539x, intentFilter);
        MainSDK.getInstance().initAdCache(this);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f44536u;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f44536u = null;
        }
        Handler handler2 = this.mHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        try {
            unregisterReceiver(this.f44539x);
            destroy();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (System.currentTimeMillis() - this.E > 2000) {
            p.b(r.b().getResources().getString(R.string.text_toast_outapp));
            this.E = System.currentTimeMillis();
            return true;
        }
        destroy();
        finish();
        System.exit(0);
        return true;
    }

    public void onNetChange(int i10) {
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getPermissions();
    }

    @Override // com.mgs.carparking.widgets.tab.TabLayout.a
    public void onTabClick(TabLayout.b bVar) {
        try {
            vd.a aVarNewInstance = (vd.a) getSupportFragmentManager().findFragmentByTag(bVar.f45663f.getSimpleName());
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            if (aVarNewInstance == null) {
                aVarNewInstance = bVar.f45663f.newInstance();
                fragmentTransactionBeginTransaction.add(R.id.mFragmentContainerLayout, aVarNewInstance.getFragment(), bVar.f45663f.getSimpleName());
                vd.a aVar = this.f44535t;
                if (aVar != null) {
                    fragmentTransactionBeginTransaction.hide(aVar.getFragment());
                }
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            } else {
                fragmentTransactionBeginTransaction.show(aVarNewInstance.getFragment());
                vd.a aVar2 = this.f44535t;
                if (aVar2 != null) {
                    fragmentTransactionBeginTransaction.hide(aVar2.getFragment());
                }
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            }
            this.f44535t = aVarNewInstance;
            if (aVarNewInstance.getFragment().getClass().equals(HomePageFragment.class)) {
                fd.d dVar = this.G;
                if (dVar != null) {
                    dVar.d();
                }
                loadAdFloatViewAd();
                return;
            }
            if (this.f44535t.getFragment().getClass().equals(CategoryFragment.class)) {
                fd.d dVar2 = this.G;
                if (dVar2 != null) {
                    dVar2.d();
                }
                loadAdFloatViewAd();
                return;
            }
            if (this.f44535t.getFragment().getClass().equals(RankNumberNewFragment.class)) {
                fd.d dVar3 = this.G;
                if (dVar3 != null) {
                    dVar3.d();
                }
                loadAdFloatViewAd();
                return;
            }
            fd.d dVar4 = this.G;
            if (dVar4 != null) {
                dVar4.d();
            }
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InstantiationException e11) {
            e11.printStackTrace();
        }
    }
}
