package ed;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.ui.mine.share.ExtensionShareActivity;
import com.pp.hls;
import com.safedk.android.utils.Logger;
import com.wangxiong.sdk.view.RewardVideoLoader;
import sd.c;
import td.a;

/* JADX INFO: compiled from: PopUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class a0 {

    /* JADX INFO: compiled from: PopUtil.java */
    public class a implements fd.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f60958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean[] f60959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean[] f60960c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sd.d f60961d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Handler f60962e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ fd.h f60963f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f60964g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f60965h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f60966i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f60967j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int[] f60968k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Activity f60969l;

        /* JADX INFO: renamed from: ed.a0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PopUtil.java */
        public class RunnableC0742a implements Runnable {
            public RunnableC0742a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                op.a.a().b(new ic.e(a.this.f60964g, false));
                a aVar = a.this;
                if (aVar.f60968k[0] == 1) {
                    aVar.f60969l.setRequestedOrientation(0);
                    a.this.f60969l.getWindow().getDecorView().setSystemUiVisibility(0);
                }
            }
        }

        public a(boolean[] zArr, boolean[] zArr2, boolean[] zArr3, sd.d dVar, Handler handler, fd.h hVar, boolean z10, AdInfoDetailEntry adInfoDetailEntry, int i10, int i11, int[] iArr, Activity activity) {
            this.f60958a = zArr;
            this.f60959b = zArr2;
            this.f60960c = zArr3;
            this.f60961d = dVar;
            this.f60962e = handler;
            this.f60963f = hVar;
            this.f60964g = z10;
            this.f60965h = adInfoDetailEntry;
            this.f60966i = i10;
            this.f60967j = i11;
            this.f60968k = iArr;
            this.f60969l = activity;
        }

        @Override // fd.i
        public void a(String str, String str2) {
            if (this.f60959b[0]) {
                this.f60961d.f79650d.stop();
                this.f60961d.dismiss();
            }
            this.f60962e.removeCallbacksAndMessages(null);
            fd.h hVar = this.f60963f;
            if (hVar != null) {
                hVar.a();
            }
            this.f60969l.runOnUiThread(new RunnableC0742a());
            if (this.f60964g) {
                ed.c.e(1, this.f60965h.getAd_type(), this.f60965h.getAd_source_id(), 13, this.f60965h.getAd_id(), 0, this.f60966i, this.f60967j);
            } else {
                ed.c.e(1, this.f60965h.getAd_type(), this.f60965h.getAd_source_id(), 4, this.f60965h.getAd_id(), 0, this.f60966i, this.f60967j);
            }
            ec.b.b("VIDEO_PLAY", "Video：报错了" + str + "---------------------" + str2 + "---------------------");
            ed.c.d("adposition:4 Ad_source_id:" + this.f60965h.getAd_source_id() + " +s:" + str + " s1:" + str2);
        }

        @Override // fd.i
        public void b() {
            if (this.f60964g) {
                ed.c.e(3, this.f60965h.getAd_type(), this.f60965h.getAd_source_id(), 13, this.f60965h.getAd_id(), 1, this.f60966i, this.f60967j);
            } else {
                ed.c.e(3, this.f60965h.getAd_type(), this.f60965h.getAd_source_id(), 4, this.f60965h.getAd_id(), 1, this.f60966i, this.f60967j);
            }
            ec.b.b("VIDEO_PLAY", "Video：---------------------广告被点击了---------------------");
        }

        @Override // fd.i
        public void c() {
            ec.b.b("VIDEO_PLAY", "Video：---------------------激励视频广告关闭---------------------");
            l0.Q0(l0.H() + 1);
            op.a.a().b(new ic.e(this.f60964g, true));
            op.a.a().b(new ic.c());
            l0.D0(1);
            l0.i1(0L);
            if (this.f60968k[0] == 1) {
                this.f60969l.setRequestedOrientation(0);
                this.f60969l.getWindow().getDecorView().setSystemUiVisibility(0);
            }
            if (this.f60964g) {
                AdNumShowDao.getInstance().updatePlayCenterTdNum(AdNumShowDao.getInstance().getNum(52) + 1);
                ed.c.e(5, this.f60965h.getAd_type(), this.f60965h.getAd_source_id(), 13, this.f60965h.getAd_id(), 1, this.f60966i, this.f60967j);
            } else {
                AdNumShowDao.getInstance().updatePlayTdNum(AdNumShowDao.getInstance().getNum(8) + 1);
                ed.c.e(5, this.f60965h.getAd_type(), this.f60965h.getAd_source_id(), 4, this.f60965h.getAd_id(), 1, this.f60966i, this.f60967j);
            }
            fd.h hVar = this.f60963f;
            if (hVar != null) {
                hVar.a();
            }
        }

        @Override // fd.i
        public void d() {
            this.f60958a[0] = true;
            if (this.f60959b[0] && !this.f60960c[0]) {
                AnimationDrawable animationDrawable = this.f60961d.f79650d;
                if (animationDrawable != null) {
                    animationDrawable.stop();
                }
                this.f60961d.dismiss();
                this.f60962e.removeCallbacksAndMessages(null);
                fd.h hVar = this.f60963f;
                if (hVar != null) {
                    hVar.f61659b.showAd();
                }
            }
            if (this.f60964g) {
                ed.c.e(4, this.f60965h.getAd_type(), this.f60965h.getAd_source_id(), 13, this.f60965h.getAd_id(), 1, this.f60966i, this.f60967j);
            } else {
                ed.c.e(4, this.f60965h.getAd_type(), this.f60965h.getAd_source_id(), 4, this.f60965h.getAd_id(), 1, this.f60966i, this.f60967j);
            }
            ec.b.b("VIDEO_PLAY", "Video：---------------------激励视频广告收到数据---------------------");
        }

        @Override // fd.i
        public void onAdShow() {
            if (this.f60964g) {
                ed.c.e(2, this.f60965h.getAd_type(), this.f60965h.getAd_source_id(), 13, this.f60965h.getAd_id(), 1, this.f60966i, this.f60967j);
            } else {
                ed.c.e(2, this.f60965h.getAd_type(), this.f60965h.getAd_source_id(), 4, this.f60965h.getAd_id(), 1, this.f60966i, this.f60967j);
            }
            ec.b.b("VIDEO_PLAY", "Video：---------------------激励视频广告展示---------------------");
        }

        @Override // fd.i
        public void onReward(String str) {
        }
    }

    /* JADX INFO: compiled from: PopUtil.java */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f60971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int[] f60972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f60973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f60974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f60975f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f60976g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ fd.h f60977h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean[] f60978i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean[] f60979j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ sd.d f60980k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f60981l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Handler f60982m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean[] f60983n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f60984o;

        /* JADX INFO: compiled from: PopUtil.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                sd.d dVar;
                ec.b.b("VIDEO_PLAY", "Video：---------------------预加载结果" + AppApplication.AdsInit + "---------------------");
                ec.b.b("VIDEO_PLAY", "Video：---------------------10秒超时了，关闭了广告---------------------");
                b bVar = b.this;
                bVar.f60979j[0] = true;
                if (!bVar.f60983n[0]) {
                    if (bVar.f60978i[0] && (dVar = bVar.f60980k) != null && dVar.isShowing()) {
                        b.this.f60980k.f79650d.stop();
                        b.this.f60980k.dismiss();
                    }
                    fd.h hVar = b.this.f60977h;
                    if (hVar != null) {
                        hVar.a();
                    }
                    b.this.f60982m.removeCallbacksAndMessages(null);
                    op.a.a().b(new ic.e(b.this.f60984o, false));
                    b bVar2 = b.this;
                    if (bVar2.f60972c[0] == 1) {
                        bVar2.f60971b.setRequestedOrientation(0);
                        b.this.f60971b.getWindow().getDecorView().setSystemUiVisibility(0);
                    }
                    b bVar3 = b.this;
                    if (bVar3.f60984o) {
                        int ad_type = bVar3.f60974e.getAd_type();
                        int ad_source_id = b.this.f60974e.getAd_source_id();
                        int ad_id = b.this.f60974e.getAd_id();
                        b bVar4 = b.this;
                        ed.c.e(6, ad_type, ad_source_id, 13, ad_id, 1, bVar4.f60975f, bVar4.f60976g);
                    } else {
                        int ad_type2 = bVar3.f60974e.getAd_type();
                        int ad_source_id2 = b.this.f60974e.getAd_source_id();
                        int ad_id2 = b.this.f60974e.getAd_id();
                        b bVar5 = b.this;
                        ed.c.e(6, ad_type2, ad_source_id2, 4, ad_id2, 1, bVar5.f60975f, bVar5.f60976g);
                    }
                }
                sd.d dVar2 = b.this.f60980k;
                if (dVar2 == null || !dVar2.isShowing()) {
                    return;
                }
                b.this.f60980k.f79650d.stop();
                b.this.f60980k.dismiss();
            }
        }

        public b(Activity activity, int[] iArr, String str, AdInfoDetailEntry adInfoDetailEntry, int i10, int i11, fd.h hVar, boolean[] zArr, boolean[] zArr2, sd.d dVar, int i12, Handler handler, boolean[] zArr3, boolean z10) {
            this.f60971b = activity;
            this.f60972c = iArr;
            this.f60973d = str;
            this.f60974e = adInfoDetailEntry;
            this.f60975f = i10;
            this.f60976g = i11;
            this.f60977h = hVar;
            this.f60978i = zArr;
            this.f60979j = zArr2;
            this.f60980k = dVar;
            this.f60981l = i12;
            this.f60982m = handler;
            this.f60983n = zArr3;
            this.f60984o = z10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (v.e.k(this.f60971b)) {
                this.f60972c[0] = 1;
                this.f60971b.setRequestedOrientation(1);
            }
            if (!zp.o.b(this.f60973d)) {
                new hls().exec("preload_mp4", this.f60973d, "0");
            }
            ec.b.b("VIDEO_PLAY", "Video：---------------------视频点击了播放广告---------------------");
            ed.c.e(7, this.f60974e.getAd_type(), this.f60974e.getAd_source_id(), 4, this.f60974e.getAd_id(), 0, this.f60975f, this.f60976g);
            if (this.f60977h.f61659b != null) {
                ec.b.b("VIDEO_PLAY", "Video：---------------------视频点击了播放广告后广告new不为空---------------------");
                this.f60977h.f61659b.loadAd();
            }
            this.f60978i[0] = true;
            this.f60979j[0] = false;
            this.f60980k.showAtLocation(view, 0, 0, 0);
            this.f60980k.f79650d.start();
            AdNumShowDao.getInstance().updatePlayIndex(this.f60981l);
            this.f60982m.postDelayed(new a(), 10000L);
        }
    }

    /* JADX INFO: compiled from: PopUtil.java */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f60986b;

        public c(Activity activity) {
            this.f60986b = activity;
        }

        public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity activity, Intent intent) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
            if (intent == null) {
                return;
            }
            activity.startActivity(intent);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.f60986b, new Intent(this.f60986b, (Class<?>) ExtensionShareActivity.class));
        }
    }

    /* JADX INFO: compiled from: PopUtil.java */
    public class d implements fd.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f60987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean[] f60988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean[] f60989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Handler f60990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ sd.c f60991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ fd.h f60992f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f60993g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f60994h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f60995i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean[] f60996j;

        public d(boolean[] zArr, boolean[] zArr2, boolean[] zArr3, Handler handler, sd.c cVar, fd.h hVar, AdInfoDetailEntry adInfoDetailEntry, int i10, int i11, boolean[] zArr4) {
            this.f60987a = zArr;
            this.f60988b = zArr2;
            this.f60989c = zArr3;
            this.f60990d = handler;
            this.f60991e = cVar;
            this.f60992f = hVar;
            this.f60993g = adInfoDetailEntry;
            this.f60994h = i10;
            this.f60995i = i11;
            this.f60996j = zArr4;
        }

        @Override // fd.i
        public void a(String str, String str2) {
            sd.c cVar = this.f60991e;
            if ((cVar == null || !cVar.f79640i.isRunning()) && !this.f60996j[0]) {
                if (l0.E() == 1) {
                    l0.N0(0);
                    Toast.makeText(zp.r.b(), zp.r.b().getResources().getString(R.string.str_download_ad_result, l0.e() + ""), 0).show();
                    l0.M0(l0.D() + l0.e());
                } else {
                    Toast.makeText(zp.r.b(), zp.r.b().getResources().getString(R.string.str_fail), 0).show();
                    l0.N0(l0.E() + 1);
                }
                this.f60991e.dismiss();
            }
            fd.h hVar = this.f60992f;
            if (hVar != null) {
                hVar.a();
            }
            ed.c.e(1, this.f60993g.getAd_type(), this.f60993g.getAd_source_id(), 5, this.f60993g.getAd_id(), 0, this.f60994h, this.f60995i);
            ed.c.d("adposition:5 Ad_source_id:" + this.f60993g.getAd_source_id() + " +s:" + str + " s1:" + str2);
        }

        @Override // fd.i
        public void b() {
            ed.c.e(3, this.f60993g.getAd_type(), this.f60993g.getAd_source_id(), 5, this.f60993g.getAd_id(), 1, this.f60994h, this.f60995i);
        }

        @Override // fd.i
        public void c() {
            l0.M0(l0.D() + l0.e());
            Toast.makeText(zp.r.b(), zp.r.b().getResources().getString(R.string.str_download_ad_result, l0.e() + ""), 0).show();
            AdNumShowDao.getInstance().updateDownloadTdNum(AdNumShowDao.getInstance().getNum(10) + 1);
            Log.i("wangyi", "激励视频广告关闭");
            fd.h hVar = this.f60992f;
            if (hVar != null) {
                hVar.a();
            }
            ed.c.e(5, this.f60993g.getAd_type(), this.f60993g.getAd_source_id(), 5, this.f60993g.getAd_id(), 1, this.f60994h, this.f60995i);
        }

        @Override // fd.i
        public void d() {
            this.f60987a[0] = true;
            if (this.f60988b[0] && !this.f60989c[0]) {
                this.f60990d.removeCallbacksAndMessages(null);
                AnimationDrawable animationDrawable = this.f60991e.f79640i;
                if (animationDrawable != null) {
                    animationDrawable.stop();
                }
                if (this.f60991e.isShowing()) {
                    this.f60992f.f61659b.showAd();
                    this.f60992f.f61659b = null;
                    this.f60991e.dismiss();
                }
            }
            ed.c.e(4, this.f60993g.getAd_type(), this.f60993g.getAd_source_id(), 5, this.f60993g.getAd_id(), 1, this.f60994h, this.f60995i);
        }

        @Override // fd.i
        public void onAdShow() {
            Log.i("wangyi", "onAdShow");
            ed.c.e(2, this.f60993g.getAd_type(), this.f60993g.getAd_source_id(), 5, this.f60993g.getAd_id(), 1, this.f60994h, this.f60995i);
        }

        @Override // fd.i
        public void onReward(String str) {
        }
    }

    /* JADX INFO: compiled from: PopUtil.java */
    public class e implements c.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f60997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fd.h f60998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sd.c f60999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean[] f61000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Handler f61001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean[] f61002f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean[] f61003g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f61004h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f61005i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f61006j;

        /* JADX INFO: compiled from: PopUtil.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f61002f[0] = true;
                eVar.f61003g[0] = true;
                if (!eVar.f60997a[0]) {
                    int ad_type = eVar.f61004h.getAd_type();
                    int ad_source_id = e.this.f61004h.getAd_source_id();
                    int ad_id = e.this.f61004h.getAd_id();
                    e eVar2 = e.this;
                    ed.c.e(6, ad_type, ad_source_id, 5, ad_id, 1, eVar2.f61005i, eVar2.f61006j);
                    if (l0.E() == 1) {
                        l0.N0(0);
                        Toast.makeText(zp.r.b(), zp.r.b().getResources().getString(R.string.str_download_ad_result, l0.e() + ""), 0).show();
                        l0.M0(l0.D() + l0.e());
                    } else {
                        l0.N0(l0.E() + 1);
                    }
                }
                sd.c cVar = e.this.f60999c;
                if (cVar != null && cVar.isShowing()) {
                    AnimationDrawable animationDrawable = e.this.f60999c.f79640i;
                    if (animationDrawable != null) {
                        animationDrawable.stop();
                    }
                    e.this.f60999c.dismiss();
                }
                fd.h hVar = e.this.f60998b;
                if (hVar != null) {
                    hVar.a();
                }
                Handler handler = e.this.f61001e;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            }
        }

        public e(boolean[] zArr, fd.h hVar, sd.c cVar, boolean[] zArr2, Handler handler, boolean[] zArr3, boolean[] zArr4, AdInfoDetailEntry adInfoDetailEntry, int i10, int i11) {
            this.f60997a = zArr;
            this.f60998b = hVar;
            this.f60999c = cVar;
            this.f61000d = zArr2;
            this.f61001e = handler;
            this.f61002f = zArr3;
            this.f61003g = zArr4;
            this.f61004h = adInfoDetailEntry;
            this.f61005i = i10;
            this.f61006j = i11;
        }

        @Override // sd.c.d
        public void a(boolean z10, RelativeLayout relativeLayout, LinearLayout linearLayout, Context context) {
            if (this.f60997a[0]) {
                if (this.f60998b.f61659b != null) {
                    this.f60999c.dismiss();
                    this.f60998b.f61659b.showAd();
                    this.f60998b.f61659b = null;
                    return;
                }
                return;
            }
            this.f61000d[0] = true;
            linearLayout.setVisibility(0);
            relativeLayout.setVisibility(8);
            AnimationDrawable animationDrawable = this.f60999c.f79640i;
            if (animationDrawable != null) {
                animationDrawable.start();
            }
            this.f61001e.postDelayed(new a(), 10000L);
        }
    }

    /* JADX INFO: compiled from: PopUtil.java */
    public class f implements fd.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f61008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean[] f61009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean[] f61010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Handler f61011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ td.a f61012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ fd.h f61013f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f61014g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f61015h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f61016i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Activity f61017j;

        /* JADX INFO: compiled from: PopUtil.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                op.a.a().b(new ic.b());
            }
        }

        public f(boolean[] zArr, boolean[] zArr2, boolean[] zArr3, Handler handler, td.a aVar, fd.h hVar, AdInfoDetailEntry adInfoDetailEntry, int i10, int i11, Activity activity) {
            this.f61008a = zArr;
            this.f61009b = zArr2;
            this.f61010c = zArr3;
            this.f61011d = handler;
            this.f61012e = aVar;
            this.f61013f = hVar;
            this.f61014g = adInfoDetailEntry;
            this.f61015h = i10;
            this.f61016i = i11;
            this.f61017j = activity;
        }

        @Override // fd.i
        public void a(String str, String str2) {
            if (this.f61009b[0]) {
                this.f61012e.f85231i.stop();
                this.f61012e.dismiss();
            }
            fd.h hVar = this.f61013f;
            if (hVar != null) {
                hVar.a();
            }
            this.f61017j.runOnUiThread(new a());
            fd.h hVar2 = this.f61013f;
            if (hVar2 != null) {
                hVar2.a();
            }
            ed.c.e(1, this.f61014g.getAd_type(), this.f61014g.getAd_source_id(), 21, this.f61014g.getAd_id(), 0, this.f61015h, this.f61016i);
            ed.c.d("adposition:21 Ad_source_id:" + this.f61014g.getAd_source_id() + " +s:" + str + " s1:" + str2);
        }

        @Override // fd.i
        public void b() {
            ed.c.e(3, this.f61014g.getAd_type(), this.f61014g.getAd_source_id(), 21, this.f61014g.getAd_id(), 1, this.f61015h, this.f61016i);
        }

        @Override // fd.i
        public void c() {
            op.a.a().b(new ic.b());
            AdNumShowDao.getInstance().updateClingRewardWxNum(AdNumShowDao.getInstance().getNum(109) + 1);
            Log.i("wangyi", "激励视频广告关闭");
            fd.h hVar = this.f61013f;
            if (hVar != null) {
                hVar.a();
            }
            ed.c.e(5, this.f61014g.getAd_type(), this.f61014g.getAd_source_id(), 21, this.f61014g.getAd_id(), 1, this.f61015h, this.f61016i);
        }

        @Override // fd.i
        public void d() {
            this.f61008a[0] = true;
            if (this.f61009b[0] && !this.f61010c[0]) {
                this.f61011d.removeCallbacksAndMessages(null);
                AnimationDrawable animationDrawable = this.f61012e.f85231i;
                if (animationDrawable != null) {
                    animationDrawable.stop();
                }
                if (this.f61012e.isShowing()) {
                    this.f61013f.f61659b.showAd();
                    this.f61013f.f61659b = null;
                    this.f61012e.dismiss();
                }
            }
            ed.c.e(4, this.f61014g.getAd_type(), this.f61014g.getAd_source_id(), 21, this.f61014g.getAd_id(), 1, this.f61015h, this.f61016i);
        }

        @Override // fd.i
        public void onAdShow() {
            Log.i("wangyi", "onAdShow");
            ed.c.e(2, this.f61014g.getAd_type(), this.f61014g.getAd_source_id(), 21, this.f61014g.getAd_id(), 1, this.f61015h, this.f61016i);
        }

        @Override // fd.i
        public void onReward(String str) {
        }
    }

    /* JADX INFO: compiled from: PopUtil.java */
    public class g implements a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f61019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fd.h f61020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ td.a f61021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean[] f61022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Handler f61023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean[] f61024f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean[] f61025g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f61026h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f61027i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f61028j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f61029k;

        /* JADX INFO: compiled from: PopUtil.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: ed.a0$g$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: PopUtil.java */
            public class RunnableC0743a implements Runnable {
                public RunnableC0743a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    op.a.a().b(new ic.b());
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                gVar.f61024f[0] = true;
                gVar.f61025g[0] = true;
                gVar.f61026h.runOnUiThread(new RunnableC0743a());
                td.a aVar = g.this.f61021c;
                if (aVar != null && aVar.isShowing()) {
                    AnimationDrawable animationDrawable = g.this.f61021c.f85231i;
                    if (animationDrawable != null) {
                        animationDrawable.stop();
                    }
                    g.this.f61021c.dismiss();
                }
                fd.h hVar = g.this.f61020b;
                if (hVar != null) {
                    hVar.a();
                }
                Handler handler = g.this.f61023e;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                int ad_type = g.this.f61027i.getAd_type();
                int ad_source_id = g.this.f61027i.getAd_source_id();
                int ad_id = g.this.f61027i.getAd_id();
                g gVar2 = g.this;
                ed.c.e(6, ad_type, ad_source_id, 21, ad_id, 1, gVar2.f61028j, gVar2.f61029k);
            }
        }

        public g(boolean[] zArr, fd.h hVar, td.a aVar, boolean[] zArr2, Handler handler, boolean[] zArr3, boolean[] zArr4, Activity activity, AdInfoDetailEntry adInfoDetailEntry, int i10, int i11) {
            this.f61019a = zArr;
            this.f61020b = hVar;
            this.f61021c = aVar;
            this.f61022d = zArr2;
            this.f61023e = handler;
            this.f61024f = zArr3;
            this.f61025g = zArr4;
            this.f61026h = activity;
            this.f61027i = adInfoDetailEntry;
            this.f61028j = i10;
            this.f61029k = i11;
        }

        @Override // td.a.d
        public void a(boolean z10, RelativeLayout relativeLayout, LinearLayout linearLayout, Context context) {
            if (this.f61019a[0]) {
                if (this.f61020b.f61659b != null) {
                    this.f61021c.dismiss();
                    this.f61020b.f61659b.showAd();
                    this.f61020b.f61659b = null;
                    return;
                }
                return;
            }
            this.f61022d[0] = true;
            linearLayout.setVisibility(0);
            relativeLayout.setVisibility(8);
            AnimationDrawable animationDrawable = this.f61021c.f85231i;
            if (animationDrawable != null) {
                animationDrawable.start();
            }
            this.f61023e.postDelayed(new a(), 10000L);
        }
    }

    public static void a(fd.h hVar, View view, AdInfoDetailEntry adInfoDetailEntry, sd.c cVar, Context context, int i10, int i11) {
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        boolean[] zArr3 = new boolean[1];
        boolean[] zArr4 = new boolean[1];
        Handler handler = new Handler();
        cVar.showAtLocation(view, 0, 0, 0);
        hVar.b(new d(zArr, zArr2, zArr3, handler, cVar, hVar, adInfoDetailEntry, i10, i11, zArr4));
        RewardVideoLoader rewardVideoLoader = hVar.f61659b;
        if (rewardVideoLoader != null) {
            rewardVideoLoader.loadAd();
            ed.c.e(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), 5, adInfoDetailEntry.getAd_id(), 1, i10, i11);
        }
        cVar.d(new e(zArr, hVar, cVar, zArr2, handler, zArr4, zArr3, adInfoDetailEntry, i10, i11));
    }

    public static void b(fd.h hVar, View view, AdInfoDetailEntry adInfoDetailEntry, td.a aVar, Activity activity, int i10, int i11) {
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        boolean[] zArr3 = new boolean[1];
        boolean[] zArr4 = new boolean[1];
        Handler handler = new Handler();
        aVar.showAtLocation(view, 0, 0, 0);
        hVar.b(new f(zArr, zArr2, zArr3, handler, aVar, hVar, adInfoDetailEntry, i10, i11, activity));
        RewardVideoLoader rewardVideoLoader = hVar.f61659b;
        if (rewardVideoLoader != null) {
            rewardVideoLoader.loadAd();
            ed.c.e(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), 21, adInfoDetailEntry.getAd_id(), 0, i10, i11);
        }
        aVar.d(new g(zArr, hVar, aVar, zArr2, handler, zArr4, zArr3, activity, adInfoDetailEntry, i10, i11));
    }

    public static void c(boolean z10, fd.h hVar, AdInfoDetailEntry adInfoDetailEntry, Activity activity, VideoPlayerView videoPlayerView, int i10, int i11, View view, Handler handler, int i12, String str) {
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        boolean[] zArr3 = new boolean[1];
        int[] iArr = {0};
        videoPlayerView.e(0);
        sd.d dVar = new sd.d(activity);
        ec.b.b("VIDEO_PLAY", "Video：---------------------预加载结果" + AppApplication.AdsInit + "---------------------");
        hVar.b(new a(zArr, zArr2, zArr3, dVar, handler, hVar, z10, adInfoDetailEntry, i10, i11, iArr, activity));
        activity.findViewById(R.id.iv_ad_click_player).setOnClickListener(new b(activity, iArr, str, adInfoDetailEntry, i10, i11, hVar, zArr2, zArr3, dVar, i12, handler, zArr, z10));
        activity.findViewById(R.id.iv_ad_share_click_player).setOnClickListener(new c(activity));
    }
}
