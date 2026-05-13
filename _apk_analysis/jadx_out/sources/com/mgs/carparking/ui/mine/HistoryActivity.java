package com.mgs.carparking.ui.mine;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityHistoryBinding;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.model.HISTORYVIEWMODEL;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import me.goldze.mvvmhabit.base.BaseApplication;
import tb.a;
import zp.n;

/* JADX INFO: loaded from: classes12.dex */
public class HistoryActivity extends BaseActivity<ActivityHistoryBinding, HISTORYVIEWMODEL> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(VideoLookHistoryEntry videoLookHistoryEntry) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", videoLookHistoryEntry.getId());
        bundle.putInt("language_type", videoLookHistoryEntry.getVideoType());
        startActivityForResult(VideoPlayDetailActivity.class, bundle);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_history;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        ((HISTORYVIEWMODEL) this.f42501p).s();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public HISTORYVIEWMODEL initViewModel() {
        return new HISTORYVIEWMODEL(BaseApplication.getInstance(), a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((HISTORYVIEWMODEL) this.f42501p).f44011q.observe(this, new Observer() { // from class: vc.p
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86017b.o((VideoLookHistoryEntry) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            ((HISTORYVIEWMODEL) this.f42501p).s();
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
