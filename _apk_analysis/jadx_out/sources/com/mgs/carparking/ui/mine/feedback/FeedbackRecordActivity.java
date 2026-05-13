package com.mgs.carparking.ui.mine.feedback;

import android.os.Bundle;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityFeedbackRecordBinding;
import com.mgs.carparking.model.FEEDBACKRECORDVIEWMODEL;
import ed.a;
import me.goldze.mvvmhabit.base.BaseApplication;
import zp.n;

/* JADX INFO: loaded from: classes11.dex */
public class FeedbackRecordActivity extends BaseActivity<ActivityFeedbackRecordBinding, FEEDBACKRECORDVIEWMODEL> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(String str) {
        a.a(this, str);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_feedback_record;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        ((FEEDBACKRECORDVIEWMODEL) this.f42501p).r();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public FEEDBACKRECORDVIEWMODEL initViewModel() {
        return new FEEDBACKRECORDVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((FEEDBACKRECORDVIEWMODEL) this.f42501p).f43987r.observe(this, new Observer() { // from class: xc.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86899b.o((String) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
