package com.mgs.carparking.ui.mine.share;

import android.os.Bundle;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityExtensionRecordBinding;
import com.mgs.carparking.model.EXTENSIONRECORDVIEWMODEL;
import me.goldze.mvvmhabit.base.BaseApplication;
import tb.a;
import zp.n;

/* JADX INFO: loaded from: classes4.dex */
public class ExtensionRecordActivity extends BaseActivity<ActivityExtensionRecordBinding, EXTENSIONRECORDVIEWMODEL> {
    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_extension_record;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        ((EXTENSIONRECORDVIEWMODEL) this.f42501p).q();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public EXTENSIONRECORDVIEWMODEL initViewModel() {
        return new EXTENSIONRECORDVIEWMODEL(BaseApplication.getInstance(), a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
