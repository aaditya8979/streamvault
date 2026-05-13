package com.mgs.carparking.shorttk;

import android.app.Application;
import androidx.annotation.NonNull;
import com.mgs.carparking.db.VideoCollectionDao;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.netbean.CollectionVideoEntry;
import com.mgs.carparking.netbean.TKBean;
import ed.c0;
import hc.l;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import xl.u;

/* JADX INFO: loaded from: classes8.dex */
public class TKFragmentViewModel extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SingleLiveEvent<List<TKBean>> f44449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f44450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SingleLiveEvent<Void> f44452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SingleLiveEvent<Void> f44453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f44454k;

    public class a implements u<BaseResponse<List<TKBean>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f44455b;

        public a(boolean z10) {
            this.f44455b = z10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<TKBean>> baseResponse) {
            if (baseResponse.isOk()) {
                TKFragmentViewModel.m(TKFragmentViewModel.this);
                if (baseResponse.getResult() != null) {
                    if (this.f44455b) {
                        TKFragmentViewModel.this.f44449f.setValue(baseResponse.getResult());
                        TKFragmentViewModel.this.f44452i.call();
                    } else {
                        List<TKBean> value = TKFragmentViewModel.this.f44449f.getValue();
                        if (value != null) {
                            value.addAll(baseResponse.getResult());
                            TKFragmentViewModel.this.f44449f.setValue(value);
                            TKFragmentViewModel.this.f44453j.call();
                        }
                    }
                    TKFragmentViewModel.this.f44450g.setValue(Boolean.valueOf(this.f44455b));
                }
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            TKFragmentViewModel.this.b(bVar);
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
        public final /* synthetic */ VideoCollectionEntry f44458b;

        public c(VideoCollectionEntry videoCollectionEntry) {
            this.f44458b = videoCollectionEntry;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<CollectionVideoEntry> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            VideoCollectionDao.getInstance().insert(this.f44458b);
            TKFragmentViewModel.this.f44454k.setValue(Boolean.TRUE);
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            TKFragmentViewModel.this.f44454k.setValue(Boolean.FALSE);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public class d implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VideoCollectionEntry f44460b;

        public d(VideoCollectionEntry videoCollectionEntry) {
            this.f44460b = videoCollectionEntry;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            VideoCollectionDao.getInstance().delete(this.f44460b.getId());
            TKFragmentViewModel.this.f44454k.setValue(Boolean.FALSE);
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public TKFragmentViewModel(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44449f = new SingleLiveEvent<>();
        this.f44450g = new SingleLiveEvent<>();
        this.f44451h = 1;
        this.f44452i = new SingleLiveEvent<>();
        this.f44453j = new SingleLiveEvent<>();
        this.f44454k = new SingleLiveEvent<>();
    }

    public static /* synthetic */ int m(TKFragmentViewModel tKFragmentViewModel) {
        int i10 = tKFragmentViewModel.f44451h;
        tKFragmentViewModel.f44451h = i10 + 1;
        return i10;
    }

    public void n(boolean z10) {
        if (z10) {
            this.f44451h = 1;
        }
        HashMap map = new HashMap();
        map.put("pn", Integer.valueOf(this.f44451h));
        ((yb.a) this.f74138b).F(map).e(new l()).e(new hc.c()).k(new c0()).c(new a(z10));
    }

    public void o(VideoCollectionEntry videoCollectionEntry, int i10) {
        HashMap map = new HashMap();
        map.put("vod_ids", Integer.valueOf(videoCollectionEntry.getId()));
        ((yb.a) this.f74138b).V(map).e(new l()).e(new hc.c()).c(new d(videoCollectionEntry));
    }

    public void p(VideoCollectionEntry videoCollectionEntry, int i10) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(videoCollectionEntry.getId()));
        map.put(VideoCollectionEntry.TYPE_PID, Integer.valueOf(videoCollectionEntry.getType_pid()));
        map.put("type_id", Integer.valueOf(i10));
        ((yb.a) this.f74138b).g(map).e(new l()).e(new hc.c()).c(new c(videoCollectionEntry));
    }

    public void q(int i10, int i11, int i12, int i13, int i14) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("collection_id", Integer.valueOf(i11));
        map.put("view_time", Integer.valueOf(i12));
        map.put("total_time", Integer.valueOf(i13));
        map.put("vod_time", Integer.valueOf(i14));
        map.put("type", 12);
        ((yb.a) this.f74138b).w(map).e(new l()).e(new hc.c()).c(new b());
    }
}
