package com.mgs.carparking.model;

import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.ironsource.Z7;
import com.mgs.carparking.db.VideoLookHistoryDao;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoFreeEntry;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import ed.i;
import ed.i0;
import ed.l0;
import hc.c;
import hc.l;
import java.util.ArrayList;
import java.util.HashMap;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import pp.b;
import xl.u;
import zp.r;

/* JADX INFO: loaded from: classes8.dex */
public class MAINVIEWMODEL extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<VideoLookHistoryEntry> f44075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f44076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<Boolean> f44077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<Boolean> f44078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VideoLookHistoryEntry f44079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f44080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SingleLiveEvent<VideoFreeEntry> f44081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SingleLiveEvent<Void> f44082m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f44083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f44084o;

    public class a implements u<BaseResponse<RecommandVideosEntity>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<RecommandVideosEntity> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                l0.y0(1);
            } else {
                i.a();
                MAINVIEWMODEL.this.f44080k.setValue(baseResponse.getResult());
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            l0.y0(1);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            MAINVIEWMODEL.this.b(bVar);
        }
    }

    public MAINVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44076g = new ObservableField<>("");
        Boolean bool = Boolean.FALSE;
        this.f44077h = new ObservableField<>(bool);
        this.f44078i = new ObservableField<>(bool);
        this.f44080k = new SingleLiveEvent<>();
        this.f44081l = new SingleLiveEvent<>();
        this.f44082m = new SingleLiveEvent<>();
        this.f44083n = new b(new pp.a() { // from class: hc.v3
            @Override // pp.a
            public final void call() {
                this.f63410a.p();
            }
        });
        this.f44084o = new b(new pp.a() { // from class: hc.w3
            @Override // pp.a
            public final void call() {
                this.f63425a.q();
            }
        });
        ArrayList<VideoLookHistoryEntry> arrayListQueryHistory = VideoLookHistoryDao.getInstance().queryHistory();
        this.f44075f = arrayListQueryHistory;
        if (arrayListQueryHistory.size() <= 0) {
            this.f44077h.set(bool);
            return;
        }
        this.f44077h.set(Boolean.TRUE);
        VideoLookHistoryEntry videoLookHistoryEntry = this.f44075f.get(0);
        this.f44079j = videoLookHistoryEntry;
        if (videoLookHistoryEntry.getDuration() - this.f44079j.getContentPosition() <= 1000) {
            this.f44077h.set(bool);
            return;
        }
        this.f44076g.set(r.b().getResources().getString(R.string.str_last_look) + Z7.f30794r + this.f44079j.getName() + "  " + i0.b(this.f44079j.getContentPosition()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f44077h.set(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f44079j.getId());
        bundle.putInt("language_type", this.f44079j.getVideoType());
        startActivity(VideoPlayDetailActivity.class, bundle);
    }

    public void o(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("vod_id", str);
        map.put("cur_time", str2);
        map.put("sign", str3);
        ((yb.a) this.f74138b).j(map).e(new l()).e(new c()).c(new a());
    }
}
