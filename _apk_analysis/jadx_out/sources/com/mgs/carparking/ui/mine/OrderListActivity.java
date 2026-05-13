package com.mgs.carparking.ui.mine;

import android.os.Bundle;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityOrderListBinding;
import com.mgs.carparking.model.ORDERLISTVIEWMODEL;
import me.goldze.mvvmhabit.base.BaseApplication;
import tb.a;
import zp.n;

/* JADX INFO: loaded from: classes2.dex */
public class OrderListActivity extends BaseActivity<ActivityOrderListBinding, ORDERLISTVIEWMODEL> {
    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_order_list;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        ((ORDERLISTVIEWMODEL) this.f42501p).q();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public ORDERLISTVIEWMODEL initViewModel() {
        return new ORDERLISTVIEWMODEL(BaseApplication.getInstance(), a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
