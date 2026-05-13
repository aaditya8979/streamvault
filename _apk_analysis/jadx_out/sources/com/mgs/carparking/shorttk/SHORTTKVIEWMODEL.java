package com.mgs.carparking.shorttk;

import android.app.Application;
import androidx.annotation.NonNull;
import bm.b;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.netbean.TKBean;
import ed.c0;
import ed.e;
import hc.c;
import hc.l;
import java.util.HashMap;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import xl.u;

/* JADX INFO: loaded from: classes7.dex */
public class SHORTTKVIEWMODEL extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SingleLiveEvent<TKBean> f44390f;

    public class a implements u<BaseResponse<TKBean>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<TKBean> baseResponse) {
            if (baseResponse.getResult() != null) {
                SHORTTKVIEWMODEL.this.f44390f.setValue(baseResponse.getResult());
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(b bVar) {
            SHORTTKVIEWMODEL.this.b(bVar);
        }
    }

    public SHORTTKVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44390f = new SingleLiveEvent<>();
    }

    public void m(int i10, String str, String str2, int i11) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("cur_time", str);
        map.put("sign", str2);
        map.put(VideoDownloadEntity.AUDIO_TYPE, Integer.valueOf(i11));
        if (e.j() == 12) {
            map.put("vi", e.l());
        }
        ((yb.a) this.f74138b).b(map).k(new c0()).e(new l()).e(new c()).c(new a());
    }
}
