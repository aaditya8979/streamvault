package com.mgs.carparking.model;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.ironsource.Z7;
import com.mgs.carparking.db.VideoCollectionDao;
import com.mgs.carparking.db.VideoDownloadDao;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.BarrageListEntry;
import com.mgs.carparking.netbean.CollectionVideoEntry;
import com.mgs.carparking.netbean.CommentListVideoEntry;
import com.mgs.carparking.netbean.DownloadAddSuccessEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoBean;
import com.mgs.carparking.netbean.VideoComment1Entry;
import com.mgs.carparking.netbean.VideoShareDataEntry;
import ed.c0;
import ed.l0;
import ed.x;
import hc.a3;
import hc.c3;
import hc.e3;
import hc.s1;
import hc.u0;
import hc.y0;
import io.bidmachine.ads.networks.gam.GAMConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import okhttp3.Response;
import xl.u;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes8.dex */
public class VIDEOPLAYDETAILVIEWMODEL extends BaseViewModel<yb.a> {
    public ObservableField<Integer> A;
    public ObservableField<String> A0;
    public ObservableField<Drawable> B;
    public ObservableField<Boolean> B0;
    public ObservableField<Boolean> C;
    public ObservableField<Boolean> C0;
    public ObservableField<Boolean> D;
    public SingleLiveEvent<Integer> D0;
    public SingleLiveEvent<Void> E;
    public pp.b E0;
    public SingleLiveEvent<Integer> F;
    public pp.b F0;
    public SingleLiveEvent<Void> G;
    public pp.b G0;
    public SingleLiveEvent<Boolean> H;
    public pp.b H0;
    public SingleLiveEvent<Boolean> I;
    public pp.b I0;
    public SingleLiveEvent<Boolean> J;
    public pp.b J0;
    public ObservableField<Boolean> K;
    public pp.b K0;
    public ObservableField<Boolean> L;
    public pp.b L0;
    public SingleLiveEvent<Void> M;
    public pp.b M0;
    public SingleLiveEvent<Void> N;
    public pp.b N0;
    public SingleLiveEvent<Void> O;
    public pp.b O0;
    public SingleLiveEvent<Void> P;
    public pp.b P0;
    public SingleLiveEvent<Void> Q;
    public pp.b Q0;
    public SingleLiveEvent<View> R;
    public pp.b R0;
    public ObservableField<u0> S;
    public pp.b S0;
    public SingleLiveEvent<Void> T;
    public pp.b T0;
    public SingleLiveEvent<Void> U;
    public pp.b U0;
    public SingleLiveEvent<Void> V;
    public SingleLiveEvent<Boolean> V0;
    public SingleLiveEvent<Void> W;
    public pp.b W0;
    public SingleLiveEvent<Void> X;
    public pp.b X0;
    public SingleLiveEvent<Void> Y;
    public SingleLiveEvent<Boolean> Y0;
    public SingleLiveEvent<Void> Z;
    public SingleLiveEvent<Void> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f44186a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public pp.b f44187a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public SingleLiveEvent<Integer> f44188b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public pp.b f44189b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public SingleLiveEvent<VideoShareDataEntry> f44190c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public pp.b f44191c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public SingleLiveEvent<List<BarrageListEntry>> f44192d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public bm.b f44193d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public SingleLiveEvent<String> f44194e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44195f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public SingleLiveEvent<Integer> f44196f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44197g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public SingleLiveEvent<Integer> f44198g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44199h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public SingleLiveEvent<Void> f44200h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44201i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public SingleLiveEvent<Void> f44202i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f44203j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ObservableList<s1> f44204j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<String> f44205k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public aq.c<s1> f44206k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<Boolean> f44207l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ObservableList<y0> f44208l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f44209m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public aq.c<y0> f44210m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Integer> f44211n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ObservableList<c3> f44212n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<String> f44213o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public aq.c<c3> f44214o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f44215p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ObservableList<e3> f44216p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<String> f44217q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public aq.c<e3> f44218q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f44219r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public aq.c<a3> f44220r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableField<String> f44221s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ObservableList<a3> f44222s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableField<String> f44223t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ObservableField<String> f44224t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ObservableField<String> f44225u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ObservableField<Boolean> f44226u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableField<Boolean> f44227v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ObservableField<Boolean> f44228v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ObservableField<Boolean> f44229w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public SingleLiveEvent<Integer> f44230w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ObservableField f44231x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ObservableField<Boolean> f44232x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ObservableField<Boolean> f44233y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ObservableField<Boolean> f44234y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ObservableField<Boolean> f44235z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ObservableField<String> f44236z0;

    public class a implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f44237b;

        public a(String str) {
            this.f44237b = str;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk()) {
                VIDEOPLAYDETAILVIEWMODEL.this.f44194e0.setValue(this.f44237b);
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public class b implements u<BaseResponse<String>> {
        public b() {
        }

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

    public class c implements u<BaseResponse<CollectionVideoEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VideoCollectionEntry f44240b;

        public c(VideoCollectionEntry videoCollectionEntry) {
            this.f44240b = videoCollectionEntry;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<CollectionVideoEntry> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            VideoCollectionDao.getInstance().insert(this.f44240b);
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public class d implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VideoCollectionEntry f44242b;

        public d(VideoCollectionEntry videoCollectionEntry) {
            this.f44242b = videoCollectionEntry;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            VideoCollectionDao.getInstance().delete(this.f44242b.getId());
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public class e implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f44244b;

        public e(int i10) {
            this.f44244b = i10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (this.f44244b == 1) {
                p.b(r.b().getResources().getString(R.string.str_success));
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            if (this.f44244b == 1) {
                p.b(r.b().getResources().getString(R.string.str_fail));
            }
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public class f implements u<BaseResponse<String>> {
        public f() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                VIDEOPLAYDETAILVIEWMODEL.this.D.set(Boolean.FALSE);
                VIDEOPLAYDETAILVIEWMODEL.this.f44231x.set(Boolean.TRUE);
            } else {
                l0.S0(baseResponse.getResult());
                VIDEOPLAYDETAILVIEWMODEL.this.f44202i0.call();
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            VIDEOPLAYDETAILVIEWMODEL.this.D.set(Boolean.FALSE);
            VIDEOPLAYDETAILVIEWMODEL.this.f44231x.set(Boolean.TRUE);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            VIDEOPLAYDETAILVIEWMODEL.this.b(bVar);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f44247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ VideoBean f44248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f44249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f44250e;

        public g(String str, VideoBean videoBean, RecommandVideosEntity recommandVideosEntity, int i10) {
            this.f44247b = str;
            this.f44248c = videoBean;
            this.f44249d = recommandVideosEntity;
            this.f44250e = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            VIDEOPLAYDETAILVIEWMODEL.this.U0(this.f44247b, this.f44248c, this.f44249d, this.f44250e);
        }
    }

    public class h implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VideoBean f44252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f44253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f44254c;

        public class a extends j8.a<DownloadAddSuccessEntry> {
            public a() {
            }
        }

        public h(VideoBean videoBean, RecommandVideosEntity recommandVideosEntity, int i10) {
            this.f44252a = videoBean;
            this.f44253b = recommandVideosEntity;
            this.f44254c = i10;
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
            l0.M0(l0.D() + 1);
        }

        @Override // ed.x.b
        public void b(Response response) {
            try {
                String strString = response.body().string();
                Log.i("wangyi", "get成功：" + strString + "--");
                VIDEOPLAYDETAILVIEWMODEL.this.g0(this.f44252a, this.f44253b, (DownloadAddSuccessEntry) ed.k.c(strString, new a().getType()), this.f44254c);
                if (l0.h() == 1 && l0.D() > 0 && l0.f() == 0) {
                    l0.i0(1);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public class i implements u<BaseResponse<RecommandVideosEntity>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f44257b;

        public i(int i10) {
            this.f44257b = i10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<RecommandVideosEntity> baseResponse) {
            if (baseResponse.getResult() == null) {
                VIDEOPLAYDETAILVIEWMODEL.this.D.set(Boolean.FALSE);
                VIDEOPLAYDETAILVIEWMODEL.this.f44231x.set(Boolean.TRUE);
                return;
            }
            ObservableField<Boolean> observableField = VIDEOPLAYDETAILVIEWMODEL.this.D;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            VIDEOPLAYDETAILVIEWMODEL.this.f44231x.set(bool);
            VIDEOPLAYDETAILVIEWMODEL.this.f44186a0.setValue(baseResponse.getResult());
            VIDEOPLAYDETAILVIEWMODEL.this.c1(this.f44257b, baseResponse.getResult().getVod_from_id());
            VIDEOPLAYDETAILVIEWMODEL.this.f44217q.set(baseResponse.getResult().getVod_name());
            VIDEOPLAYDETAILVIEWMODEL.this.f44221s.set(baseResponse.getResult().getVod_year());
            if (!zp.o.b(baseResponse.getResult().getUpload_user_name())) {
                VIDEOPLAYDETAILVIEWMODEL.this.f44213o.set(baseResponse.getResult().getUpload_user_name());
            }
            if (!zp.o.b(baseResponse.getResult().getUpload_user_head_img())) {
                VIDEOPLAYDETAILVIEWMODEL.this.f44215p.set(baseResponse.getResult().getUpload_user_head_img());
            }
            VIDEOPLAYDETAILVIEWMODEL.this.f44201i = baseResponse.getResult().getUpload_user_id();
            if (VideoCollectionDao.getInstance().isExist(baseResponse.getResult().getId())) {
                VIDEOPLAYDETAILVIEWMODEL.this.C.set(Boolean.TRUE);
                VIDEOPLAYDETAILVIEWMODEL.this.B.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_video_land_collection_select));
            } else {
                VIDEOPLAYDETAILVIEWMODEL.this.C.set(bool);
                VIDEOPLAYDETAILVIEWMODEL.this.B.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_video_land_collection));
            }
            if (baseResponse.getResult().getAudio_type() == 1) {
                VIDEOPLAYDETAILVIEWMODEL.this.B0.set(Boolean.TRUE);
                VIDEOPLAYDETAILVIEWMODEL.this.C0.set(bool);
            } else {
                VIDEOPLAYDETAILVIEWMODEL.this.B0.set(bool);
                VIDEOPLAYDETAILVIEWMODEL.this.C0.set(Boolean.TRUE);
            }
            if (baseResponse.getResult().getAudio_type_option() != null && baseResponse.getResult().getAudio_type_option().size() > 1) {
                ObservableField<Boolean> observableField2 = VIDEOPLAYDETAILVIEWMODEL.this.f44232x0;
                Boolean bool2 = Boolean.TRUE;
                observableField2.set(bool2);
                VIDEOPLAYDETAILVIEWMODEL.this.f44234y0.set(bool2);
                VIDEOPLAYDETAILVIEWMODEL.this.f44236z0.set(baseResponse.getResult().getAudio_type_option().get(0).getType_name());
                VIDEOPLAYDETAILVIEWMODEL.this.A0.set(baseResponse.getResult().getAudio_type_option().get(1).getType_name());
            } else if (baseResponse.getResult().getAudio_type_option() != null && baseResponse.getResult().getAudio_type_option().size() == 1) {
                if (baseResponse.getResult().getAudio_type_option().get(0).getType() == 1) {
                    VIDEOPLAYDETAILVIEWMODEL.this.f44236z0.set(baseResponse.getResult().getAudio_type_option().get(0).getType_name());
                    VIDEOPLAYDETAILVIEWMODEL.this.f44232x0.set(Boolean.TRUE);
                    VIDEOPLAYDETAILVIEWMODEL.this.f44234y0.set(bool);
                } else if (baseResponse.getResult().getAudio_type_option().get(0).getType() == 2) {
                    VIDEOPLAYDETAILVIEWMODEL.this.A0.set(baseResponse.getResult().getAudio_type_option().get(0).getType_name());
                    VIDEOPLAYDETAILVIEWMODEL.this.f44232x0.set(bool);
                    VIDEOPLAYDETAILVIEWMODEL.this.f44234y0.set(Boolean.TRUE);
                }
            }
            if (!zp.o.b(baseResponse.getResult().getVod_douban_score())) {
                VIDEOPLAYDETAILVIEWMODEL.this.f44223t.set(r.b().getResources().getString(R.string.str_score) + baseResponse.getResult().getVod_douban_score());
            }
            String vod_area = baseResponse.getResult().getVod_area();
            if (!zp.o.b(baseResponse.getResult().getVod_area())) {
                vod_area = vod_area + "  " + baseResponse.getResult().getVod_year();
            }
            if (!zp.o.b(baseResponse.getResult().getVod_tag())) {
                vod_area = vod_area + "  " + baseResponse.getResult().getVod_tag();
            }
            VIDEOPLAYDETAILVIEWMODEL.this.f44219r.set(vod_area);
            if (baseResponse.getResult().getType_pid() != 2 && baseResponse.getResult().getType_pid() != 4) {
                VIDEOPLAYDETAILVIEWMODEL.this.f44228v0.set(bool);
                return;
            }
            if (baseResponse.getResult().getSeries_info() == null || baseResponse.getResult().getSeries_info().size() <= 0) {
                VIDEOPLAYDETAILVIEWMODEL.this.f44228v0.set(bool);
                VIDEOPLAYDETAILVIEWMODEL.this.f44222s0.clear();
            } else {
                VIDEOPLAYDETAILVIEWMODEL.this.f44226u0.set(Boolean.TRUE);
                VIDEOPLAYDETAILVIEWMODEL.this.f44222s0.clear();
                for (int i10 = 0; i10 < baseResponse.getResult().getSeries_info().size(); i10++) {
                    if (baseResponse.getResult().getSeries_info().get(i10).getDefault().booleanValue()) {
                        VIDEOPLAYDETAILVIEWMODEL.this.f44224t0.set(baseResponse.getResult().getSeries_info().get(i10).getSeries());
                    }
                    VIDEOPLAYDETAILVIEWMODEL.this.f44222s0.add(new a3(VIDEOPLAYDETAILVIEWMODEL.this, baseResponse.getResult().getSeries_info().get(i10)));
                }
            }
            if (baseResponse.getResult().getVod_isend() == 1) {
                VIDEOPLAYDETAILVIEWMODEL.this.f44225u.set(baseResponse.getResult().getVod_total() + r.b().getResources().getString(R.string.text_colections));
            } else {
                VIDEOPLAYDETAILVIEWMODEL.this.f44225u.set(r.b().getResources().getString(R.string.text_up_colections, baseResponse.getResult().getVod_serial()));
            }
            VIDEOPLAYDETAILVIEWMODEL.this.f44228v0.set(Boolean.TRUE);
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            VIDEOPLAYDETAILVIEWMODEL.this.D.set(Boolean.FALSE);
            VIDEOPLAYDETAILVIEWMODEL.this.f44231x.set(Boolean.TRUE);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            VIDEOPLAYDETAILVIEWMODEL.this.b(bVar);
        }
    }

    public class j implements u<BaseResponse<VideoShareDataEntry>> {
        public j() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<VideoShareDataEntry> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            VIDEOPLAYDETAILVIEWMODEL.this.f44190c0.setValue(baseResponse.getResult());
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            VIDEOPLAYDETAILVIEWMODEL.this.b(bVar);
        }
    }

    public class k implements u<BaseResponse<String>> {
        public k() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk()) {
                p.c(baseResponse.getMessage());
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            VIDEOPLAYDETAILVIEWMODEL.this.b(bVar);
        }
    }

    public class l implements u<BaseResponse<VideoComment1Entry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f44261b;

        public l(boolean z10) {
            this.f44261b = z10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<VideoComment1Entry> baseResponse) {
            if (baseResponse.isOk()) {
                if (this.f44261b) {
                    VIDEOPLAYDETAILVIEWMODEL.this.f44208l0.clear();
                }
                ObservableField<Boolean> observableField = VIDEOPLAYDETAILVIEWMODEL.this.K;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                VIDEOPLAYDETAILVIEWMODEL.this.f44199h = baseResponse.getResult().getTotal_discuss_num();
                if (baseResponse.getResult().getList() == null || baseResponse.getResult().getList().size() <= 0) {
                    if (VIDEOPLAYDETAILVIEWMODEL.this.f44195f == 0) {
                        VIDEOPLAYDETAILVIEWMODEL.this.K.set(Boolean.TRUE);
                        VIDEOPLAYDETAILVIEWMODEL.this.L.set(bool);
                    }
                    VIDEOPLAYDETAILVIEWMODEL.this.M.call();
                } else {
                    VIDEOPLAYDETAILVIEWMODEL.this.L.set(Boolean.TRUE);
                    VIDEOPLAYDETAILVIEWMODEL.this.f0(baseResponse.getResult().getList());
                    VIDEOPLAYDETAILVIEWMODEL.this.f44195f = baseResponse.getResult().getList().get(baseResponse.getResult().getList().size() - 1).getId();
                }
                VIDEOPLAYDETAILVIEWMODEL.this.N.call();
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            VIDEOPLAYDETAILVIEWMODEL.this.f44208l0.clear();
            VIDEOPLAYDETAILVIEWMODEL.this.K.set(Boolean.TRUE);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            VIDEOPLAYDETAILVIEWMODEL.this.b(bVar);
        }
    }

    public class m implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0 f44263b;

        public m(y0 y0Var) {
            this.f44263b = y0Var;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (!baseResponse.isOk()) {
                p.b(r.b().getResources().getString(R.string.str_fail));
                return;
            }
            if (baseResponse.getResult() != null) {
                if (VIDEOPLAYDETAILVIEWMODEL.this.f44208l0.size() > 1) {
                    VIDEOPLAYDETAILVIEWMODEL.this.f44208l0.remove(this.f44263b);
                    VIDEOPLAYDETAILVIEWMODEL.this.f44199h--;
                } else {
                    VIDEOPLAYDETAILVIEWMODEL.this.P.call();
                }
                p.b(r.b().getResources().getString(R.string.str_success));
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            p.b(r.b().getResources().getString(R.string.str_fail));
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public class n implements u<BaseResponse<String>> {
        public n() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (!baseResponse.isOk()) {
                p.b(r.b().getResources().getString(R.string.str_fail));
                return;
            }
            if (baseResponse.getResult() != null) {
                VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel = VIDEOPLAYDETAILVIEWMODEL.this;
                videoplaydetailviewmodel.f44208l0.get(videoplaydetailviewmodel.S.get().f63392d).f63441f.remove(VIDEOPLAYDETAILVIEWMODEL.this.S.get());
                VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel2 = VIDEOPLAYDETAILVIEWMODEL.this;
                if (videoplaydetailviewmodel2.f44208l0.get(videoplaydetailviewmodel2.S.get().f63392d).f63441f.size() == 0) {
                    VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel3 = VIDEOPLAYDETAILVIEWMODEL.this;
                    ObservableField<Boolean> observableField = videoplaydetailviewmodel3.f44208l0.get(videoplaydetailviewmodel3.S.get().f63392d).f63450o;
                    Boolean bool = Boolean.FALSE;
                    observableField.set(bool);
                    VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel4 = VIDEOPLAYDETAILVIEWMODEL.this;
                    videoplaydetailviewmodel4.f44208l0.get(videoplaydetailviewmodel4.S.get().f63392d).f63451p.set(bool);
                }
                p.b(r.b().getResources().getString(R.string.str_success));
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            p.b(r.b().getResources().getString(R.string.str_fail));
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public class o implements u<BaseResponse<List<BarrageListEntry>>> {
        public o() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<BarrageListEntry>> baseResponse) {
            if (!baseResponse.isOk()) {
                VIDEOPLAYDETAILVIEWMODEL.this.f44192d0.setValue(new ArrayList());
            } else {
                if (baseResponse.getResult() == null || baseResponse.getResult().size() < 0) {
                    return;
                }
                VIDEOPLAYDETAILVIEWMODEL.this.f44192d0.setValue(baseResponse.getResult());
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            VIDEOPLAYDETAILVIEWMODEL.this.f44192d0.setValue(new ArrayList());
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            VIDEOPLAYDETAILVIEWMODEL.this.f44193d1 = bVar;
        }
    }

    public VIDEOPLAYDETAILVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44195f = 0;
        this.f44197g = 2;
        this.f44199h = 0;
        this.f44203j = new Handler();
        this.f44205k = new SingleLiveEvent<>();
        Boolean bool = Boolean.TRUE;
        this.f44207l = new ObservableField<>(bool);
        this.f44209m = new ObservableField<>(bool);
        this.f44211n = new SingleLiveEvent<>();
        this.f44213o = new ObservableField<>();
        this.f44215p = new ObservableField<>();
        this.f44217q = new ObservableField<>("");
        this.f44219r = new ObservableField<>("");
        this.f44221s = new ObservableField<>("");
        this.f44223t = new ObservableField<>("");
        this.f44225u = new ObservableField<>("");
        Boolean bool2 = Boolean.FALSE;
        this.f44227v = new ObservableField<>(bool2);
        this.f44229w = new ObservableField<>(bool2);
        this.f44231x = new ObservableField(bool2);
        this.f44233y = new ObservableField<>(bool2);
        this.f44235z = new ObservableField<>(bool2);
        this.A = new ObservableField<>(0);
        this.B = new ObservableField<>();
        this.C = new ObservableField<>(bool2);
        this.D = new ObservableField<>(bool);
        this.E = new SingleLiveEvent<>();
        this.F = new SingleLiveEvent<>();
        this.G = new SingleLiveEvent<>();
        this.K = new ObservableField<>(bool2);
        this.L = new ObservableField<>(bool2);
        this.M = new SingleLiveEvent<>();
        this.N = new SingleLiveEvent<>();
        this.O = new SingleLiveEvent<>();
        this.P = new SingleLiveEvent<>();
        this.Q = new SingleLiveEvent<>();
        this.R = new SingleLiveEvent<>();
        this.S = new ObservableField<>();
        this.T = new SingleLiveEvent<>();
        this.U = new SingleLiveEvent<>();
        this.V = new SingleLiveEvent<>();
        this.W = new SingleLiveEvent<>();
        this.X = new SingleLiveEvent<>();
        this.Y = new SingleLiveEvent<>();
        this.Z = new SingleLiveEvent<>();
        this.f44186a0 = new SingleLiveEvent<>();
        this.f44188b0 = new SingleLiveEvent<>();
        this.f44190c0 = new SingleLiveEvent<>();
        this.f44192d0 = new SingleLiveEvent<>();
        this.f44194e0 = new SingleLiveEvent<>();
        this.f44196f0 = new SingleLiveEvent<>();
        this.f44198g0 = new SingleLiveEvent<>();
        this.f44200h0 = new SingleLiveEvent<>();
        this.f44202i0 = new SingleLiveEvent<>();
        this.f44204j0 = new ObservableArrayList();
        this.f44206k0 = aq.c.d(new aq.d() { // from class: hc.n5
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_guss_video);
            }
        });
        this.f44208l0 = new ObservableArrayList();
        this.f44210m0 = aq.c.d(new aq.d() { // from class: hc.p5
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_video_commit_list);
            }
        });
        this.f44212n0 = new ObservableArrayList();
        this.f44214o0 = aq.c.d(new aq.d() { // from class: hc.x5
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_video_play_tv_set_num);
            }
        });
        this.f44216p0 = new ObservableArrayList();
        this.f44218q0 = aq.c.d(new aq.d() { // from class: hc.z5
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_video_play_variety_set_num);
            }
        });
        this.f44220r0 = aq.c.d(new aq.d() { // from class: hc.a6
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_video_season_item);
            }
        });
        this.f44222s0 = new ObservableArrayList();
        this.f44224t0 = new ObservableField<>("");
        this.f44226u0 = new ObservableField<>(bool2);
        this.f44228v0 = new ObservableField<>(bool2);
        this.f44230w0 = new SingleLiveEvent<>();
        this.f44232x0 = new ObservableField<>(bool2);
        this.f44234y0 = new ObservableField<>(bool2);
        this.f44236z0 = new ObservableField<>("");
        this.A0 = new ObservableField<>("");
        this.B0 = new ObservableField<>(bool);
        this.C0 = new ObservableField<>(bool2);
        this.D0 = new SingleLiveEvent<>();
        this.E0 = new pp.b(new pp.a() { // from class: hc.b6
            @Override // pp.a
            public final void call() {
                this.f63148a.F0();
            }
        });
        this.F0 = new pp.b(new pp.a() { // from class: hc.c6
            @Override // pp.a
            public final void call() {
                this.f63171a.G0();
            }
        });
        this.G0 = new pp.b(new pp.a() { // from class: hc.d6
            @Override // pp.a
            public final void call() {
                this.f63183a.H0();
            }
        });
        this.H0 = new pp.b(new pp.a() { // from class: hc.e6
            @Override // pp.a
            public final void call() {
                this.f63191a.I0();
            }
        });
        this.I0 = new pp.b(new pp.a() { // from class: hc.f6
            @Override // pp.a
            public final void call() {
                this.f63206a.J0();
            }
        });
        this.J0 = new pp.b(new pp.a() { // from class: hc.y5
            @Override // pp.a
            public final void call() {
                this.f63478a.l0();
            }
        });
        this.K0 = new pp.b(new pp.a() { // from class: hc.i6
            @Override // pp.a
            public final void call() {
                this.f63226a.m0();
            }
        });
        this.L0 = new pp.b(new pp.a() { // from class: hc.j6
            @Override // pp.a
            public final void call() {
                this.f63235a.n0();
            }
        });
        this.M0 = new pp.b(new pp.a() { // from class: hc.k6
            @Override // pp.a
            public final void call() {
                this.f63256a.o0();
            }
        });
        this.N0 = new pp.b(new pp.a() { // from class: hc.l6
            @Override // pp.a
            public final void call() {
                this.f63265a.p0();
            }
        });
        this.O0 = new pp.b(new pp.a() { // from class: hc.m6
            @Override // pp.a
            public final void call() {
                this.f63283a.q0();
            }
        });
        this.P0 = new pp.b(new pp.a() { // from class: hc.n6
            @Override // pp.a
            public final void call() {
                this.f63288a.r0();
            }
        });
        this.Q0 = new pp.b(new pp.a() { // from class: hc.o6
            @Override // pp.a
            public final void call() {
                this.f63303a.s0();
            }
        });
        this.R0 = new pp.b(new pp.a() { // from class: hc.p6
            @Override // pp.a
            public final void call() {
                this.f63328a.t0();
            }
        });
        this.S0 = new pp.b(new pp.a() { // from class: hc.o5
            @Override // pp.a
            public final void call() {
                this.f63302a.u0();
            }
        });
        this.T0 = new pp.b(new pp.a() { // from class: hc.q5
            @Override // pp.a
            public final void call() {
                this.f63341a.w0();
            }
        });
        this.U0 = new pp.b(new pp.a() { // from class: hc.r5
            @Override // pp.a
            public final void call() {
                this.f63348a.x0();
            }
        });
        this.V0 = new SingleLiveEvent<>();
        this.W0 = new pp.b(new pp.a() { // from class: hc.s5
            @Override // pp.a
            public final void call() {
                this.f63363a.y0();
            }
        });
        this.X0 = new pp.b(new pp.a() { // from class: hc.t5
            @Override // pp.a
            public final void call() {
                this.f63388a.z0();
            }
        });
        this.Y0 = new SingleLiveEvent<>();
        this.Z0 = new SingleLiveEvent<>();
        this.f44187a1 = new pp.b(new pp.a() { // from class: hc.u5
            @Override // pp.a
            public final void call() {
                this.f63401a.A0();
            }
        });
        this.f44189b1 = new pp.b(new pp.a() { // from class: hc.v5
            @Override // pp.a
            public final void call() {
                this.f63412a.B0();
            }
        });
        this.f44191c1 = new pp.b(new pp.a() { // from class: hc.w5
            @Override // pp.a
            public final void call() {
                this.f63427a.C0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0() {
        this.Y0.postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0() {
        this.Y0.postValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0() {
        this.Z0.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0() {
        this.G.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0() {
        if (!tp.b.a(getApplication())) {
            p.b(r.b().getResources().getString(R.string.text_toast_nonet));
        } else {
            if (ed.e.q()) {
                return;
            }
            this.f44231x.set(Boolean.FALSE);
            this.D.set(Boolean.TRUE);
            this.E.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0() {
        c0().setValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0() {
        d0().setValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() {
        b0().setValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(BaseResponse baseResponse) throws Exception {
        if (baseResponse.isOk()) {
            this.f44204j0.clear();
            if (baseResponse.getResult() == null || ((List) baseResponse.getResult()).size() <= 0) {
                this.f44227v.set(Boolean.FALSE);
                return;
            }
            this.f44227v.set(Boolean.TRUE);
            Iterator it = ((List) baseResponse.getResult()).iterator();
            while (it.hasNext()) {
                this.f44204j0.add(new s1(this, (RecommandVideosEntity) it.next()));
            }
        }
    }

    public static /* synthetic */ void i0(Throwable th2) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0() {
        this.f44200h0.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0() {
        this.U.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0() {
        this.Z.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0() {
        this.V.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0() {
        this.W.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0() {
        this.X.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0() {
        if (this.f44234y0.get().booleanValue()) {
            this.D0.setValue(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0() {
        if (this.f44232x0.get().booleanValue()) {
            this.D0.setValue(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0() {
        this.O.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0() {
        this.Y.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0() {
        this.Q.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0() {
        this.T.call();
        O0(this.S.get().f63390b.getId(), this.S.get().f63391c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0() {
        this.V0.postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0() {
        this.V0.postValue(Boolean.TRUE);
    }

    public void K0(int i10, int i11) {
        bm.b bVar = this.f44193d1;
        if (bVar != null && !bVar.isDisposed()) {
            this.f44193d1.dispose();
        }
        HashMap map = new HashMap();
        map.put("collection", Integer.valueOf(i11));
        map.put("vod_id", Integer.valueOf(i10));
        map.put("start_time", 0);
        map.put("end_time", 10000);
        ((yb.a) this.f74138b).K(map).e(new hc.l()).e(new hc.c()).c(new o());
    }

    public void L0(y0 y0Var, int i10) {
        HashMap map = new HashMap();
        map.put("discuss_id", Integer.valueOf(y0Var.f63438c.getId()));
        ((yb.a) this.f74138b).x(map).e(new hc.l()).e(new hc.c()).c(new m(y0Var));
    }

    public void M0(boolean z10, int i10) {
        if (z10) {
            this.f44195f = 0;
        }
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("last_discuss_id", Integer.valueOf(this.f44195f));
        ((yb.a) this.f74138b).D(map).e(new hc.l()).e(new hc.c()).c(new l(z10));
    }

    public void N0(y0 y0Var) {
        p.b(r.b().getResources().getString(R.string.str_success));
    }

    public void O(String str, VideoBean videoBean, RecommandVideosEntity recommandVideosEntity, int i10) {
        this.f44203j.postDelayed(new g(str, videoBean, recommandVideosEntity, i10), 0L);
    }

    public void O0(int i10, int i11) {
        HashMap map = new HashMap();
        map.put("discuss_id", Integer.valueOf(i10));
        ((yb.a) this.f74138b).x(map).e(new hc.l()).e(new hc.c()).c(new n());
    }

    public void P(int i10, String str, String str2, int i11, int i12, String str3) {
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(i10));
        map.put("content", str2);
        map.put("tags", str);
        map.put("vod_id", Integer.valueOf(i11));
        map.put("collection", Integer.valueOf(i12));
        map.put(GAMConfig.KEY_SCORE, str3);
        ((yb.a) this.f74138b).v(map).e(new hc.l()).e(new hc.c()).c(new e(i10));
    }

    public void P0(int i10, String str) {
        HashMap map = new HashMap();
        map.put("videoId", Integer.valueOf(i10));
        map.put("suggestContent", str);
        ((yb.a) this.f74138b).Y(map).e(new hc.l()).e(new hc.c()).c(new k());
    }

    public void Q0(int i10, String str, String str2) {
        HashMap map = new HashMap();
        map.put("type_id", Integer.valueOf(i10));
        map.put("type", str);
        map.put("psize", 6);
        map.put("area", str2);
        map.put("is_random", 1);
        b(((yb.a) this.f74138b).o(map).e(new hc.l()).e(new hc.c()).l(new dm.g() { // from class: hc.g6
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f63212b.h0((BaseResponse) obj);
            }
        }, new dm.g() { // from class: hc.h6
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                VIDEOPLAYDETAILVIEWMODEL.i0((Throwable) obj);
            }
        }));
    }

    public void R0(List<VideoBean> list, int i10, String str) {
        this.A.set(Integer.valueOf(i10));
        this.f44216p0.clear();
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.get(i11).position = i11;
            e3 e3Var = new e3(this, list.get(i11), i10, str);
            if (i10 == i11) {
                e3Var.f63188c.set(Boolean.TRUE);
            } else {
                e3Var.f63188c.set(Boolean.FALSE);
            }
            this.f44216p0.add(e3Var);
            this.f44188b0.setValue(Integer.valueOf(i10));
        }
    }

    public void S0(int i10, String str, String str2, int i11) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("cur_time", str);
        map.put("sign", str2);
        map.put(VideoDownloadEntity.AUDIO_TYPE, Integer.valueOf(i11));
        if (ed.e.j() == 12) {
            map.put("vi", ed.e.l());
        }
        ((yb.a) this.f74138b).j(map).k(new c0()).e(new hc.l()).e(new hc.c()).c(new i(i10));
    }

    public void T0(List<VideoBean> list, int i10) {
        this.A.set(Integer.valueOf(i10));
        this.f44212n0.clear();
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.get(i11).position = i11;
            c3 c3Var = new c3(this, list.get(i11), i10);
            if (i10 == i11) {
                c3Var.f63166e.set(Boolean.TRUE);
            } else {
                c3Var.f63166e.set(Boolean.FALSE);
            }
            this.f44212n0.add(c3Var);
            this.f44188b0.setValue(Integer.valueOf(i10));
        }
    }

    public void U0(String str, VideoBean videoBean, RecommandVideosEntity recommandVideosEntity, int i10) {
        String str2 = str + "&type=2";
        Log.i("wangyi", "下载地址为：" + str2);
        x.a(str2, new h(videoBean, recommandVideosEntity, i10));
    }

    public void V0(int i10) {
        this.f44230w0.setValue(Integer.valueOf(i10));
    }

    public void W0(int i10) {
        for (int i11 = 0; i11 < this.f44216p0.size(); i11++) {
            if (i10 == i11 && !this.f44216p0.get(i11).f63188c.get().booleanValue()) {
                this.A.set(Integer.valueOf(i10));
                this.f44216p0.get(i11).f63188c.set(Boolean.TRUE);
                this.F.setValue(Integer.valueOf(i10));
            } else if (i10 == i11) {
                return;
            } else {
                this.f44216p0.get(i11).f63188c.set(Boolean.FALSE);
            }
        }
    }

    public void X0(int i10) {
        for (int i11 = 0; i11 < this.f44212n0.size(); i11++) {
            if (i10 == i11 && !this.f44212n0.get(i11).f63166e.get().booleanValue()) {
                this.f44212n0.get(i11).f63166e.set(Boolean.TRUE);
                this.A.set(Integer.valueOf(i10));
                this.F.setValue(Integer.valueOf(i10));
            } else if (i10 == i11) {
                return;
            } else {
                this.f44212n0.get(i11).f63166e.set(Boolean.FALSE);
            }
        }
    }

    public void Y0(int i10, int i11) {
        int i12 = 0;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            if (this.f44212n0.size() > 0) {
                while (i12 < this.f44212n0.size()) {
                    if (i11 == i12) {
                        this.f44212n0.get(i12).f63166e.set(Boolean.TRUE);
                    } else {
                        this.f44212n0.get(i12).f63166e.set(Boolean.FALSE);
                    }
                    i12++;
                }
                this.f44188b0.setValue(Integer.valueOf(i11));
                return;
            }
            return;
        }
        if (i10 != 3 || this.f44216p0.size() <= 0) {
            return;
        }
        while (i12 < this.f44216p0.size()) {
            if (i11 == i12) {
                this.f44216p0.get(i12).f63188c.set(Boolean.TRUE);
            } else {
                this.f44216p0.get(i12).f63188c.set(Boolean.FALSE);
            }
            i12++;
        }
        this.f44188b0.setValue(Integer.valueOf(i11));
    }

    public void Z0(int i10) {
        this.f44196f0.setValue(Integer.valueOf(i10));
    }

    public void a0(int i10, int i11, String str, long j10) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("collection", Integer.valueOf(i11));
        map.put("content", str);
        map.put("send_time", Integer.valueOf((int) (j10 / 1000)));
        ((yb.a) this.f74138b).y(map).e(new hc.l()).e(new hc.c()).c(new a(str));
    }

    public void a1(VideoCollectionEntry videoCollectionEntry, int i10) {
        HashMap map = new HashMap();
        map.put("vod_ids", Integer.valueOf(videoCollectionEntry.getId()));
        ((yb.a) this.f74138b).V(map).e(new hc.l()).e(new hc.c()).c(new d(videoCollectionEntry));
    }

    public SingleLiveEvent<Boolean> b0() {
        if (this.H == null) {
            this.H = new SingleLiveEvent<>();
        }
        return this.H;
    }

    public void b1(VideoCollectionEntry videoCollectionEntry, int i10) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(videoCollectionEntry.getId()));
        map.put(VideoCollectionEntry.TYPE_PID, Integer.valueOf(videoCollectionEntry.getType_pid()));
        map.put("type_id", Integer.valueOf(i10));
        ((yb.a) this.f74138b).g(map).e(new hc.l()).e(new hc.c()).c(new c(videoCollectionEntry));
    }

    public SingleLiveEvent<Boolean> c0() {
        if (this.J == null) {
            this.J = new SingleLiveEvent<>();
        }
        return this.J;
    }

    public void c1(int i10, String str) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("vod_from_id", str);
        ((yb.a) this.f74138b).N(map).e(new hc.l()).e(new hc.c()).c(new j());
    }

    public SingleLiveEvent<Boolean> d0() {
        if (this.I == null) {
            this.I = new SingleLiveEvent<>();
        }
        return this.I;
    }

    public void d1(int i10, int i11, int i12, int i13, int i14) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("collection_id", Integer.valueOf(i11));
        map.put("view_time", Integer.valueOf(i12));
        map.put("total_time", Integer.valueOf(i13));
        map.put("vod_time", Integer.valueOf(i14));
        ((yb.a) this.f74138b).w(map).e(new hc.l()).e(new hc.c()).c(new b());
    }

    public void e0() {
        HashMap map = new HashMap();
        map.put("conf_key", "p2p_config");
        tb.a.a().i(map).k(new c0()).e(new hc.l()).e(new hc.c()).c(new f());
    }

    public void f0(List<CommentListVideoEntry> list) {
        int size = this.f44208l0.size();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f44208l0.add(new y0(this, list.get(i10), i10 + size));
        }
    }

    public void g0(VideoBean videoBean, RecommandVideosEntity recommandVideosEntity, DownloadAddSuccessEntry downloadAddSuccessEntry, int i10) {
        VideoDownloadEntity videoDownloadEntity = new VideoDownloadEntity();
        videoDownloadEntity.setComplete_name(recommandVideosEntity.getVod_name() + Z7.f30794r + videoBean.getTitle());
        videoDownloadEntity.setId(recommandVideosEntity.getId());
        videoDownloadEntity.setCoverUrl(recommandVideosEntity.getVod_pic());
        videoDownloadEntity.setName(recommandVideosEntity.getVod_name());
        videoDownloadEntity.setLastName(videoBean.getTitle());
        videoDownloadEntity.setVideoType(recommandVideosEntity.getType_pid());
        videoDownloadEntity.setCollection(videoBean.getCollection());
        videoDownloadEntity.setAudio_type(recommandVideosEntity.getAudio_type());
        if (videoBean.is_p2p() == 1) {
            videoDownloadEntity.setUrl(videoBean.getVod_url());
        } else {
            videoDownloadEntity.setUrl(videoBean.getOrginal_url());
        }
        if (i10 < 0) {
            i10 = 0;
        }
        videoDownloadEntity.setVideo_position(i10);
        videoDownloadEntity.setComplete(0);
        videoDownloadEntity.setSize(0L);
        videoDownloadEntity.setStreamid(downloadAddSuccessEntry.getResource());
        videoDownloadEntity.setStatus(downloadAddSuccessEntry.getStatus());
        videoDownloadEntity.setOrginal_url(videoBean.getOrginal_url());
        VideoDownloadDao.getInstance().insertHistory(videoDownloadEntity);
    }
}
