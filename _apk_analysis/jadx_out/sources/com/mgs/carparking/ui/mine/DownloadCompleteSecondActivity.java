package com.mgs.carparking.ui.mine;

import android.os.Bundle;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityDownloadCompleteSecondBinding;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.model.DOWNLOADCOMPLETESECONDVIEWMODEL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import zp.n;

/* JADX INFO: loaded from: classes7.dex */
public class DownloadCompleteSecondActivity extends BaseActivity<ActivityDownloadCompleteSecondBinding, DOWNLOADCOMPLETESECONDVIEWMODEL> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List<VideoDownloadEntity> f44815t = new ArrayList();

    public class a implements Comparator<VideoDownloadEntity> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(VideoDownloadEntity videoDownloadEntity, VideoDownloadEntity videoDownloadEntity2) {
            return videoDownloadEntity.getVideo_position() - videoDownloadEntity2.getVideo_position();
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_download_complete_second;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        List<VideoDownloadEntity> list = (List) getIntent().getSerializableExtra("entityList");
        this.f44815t = list;
        Collections.sort(list, new a());
        ((DOWNLOADCOMPLETESECONDVIEWMODEL) this.f42501p).q(this.f44815t);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public DOWNLOADCOMPLETESECONDVIEWMODEL initViewModel() {
        return new DOWNLOADCOMPLETESECONDVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
