package com.mgs.carparking.ui.mine.share;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityExtensionShareBinding;
import com.mgs.carparking.model.EXTENSIONSHAREVIEWMODEL;
import com.mgs.carparking.netbean.ExtensionShareEntry;
import com.mgs.carparking.widgets.dialog.SimpleShareDialog;
import ed.j0;
import hh.a;
import me.goldze.mvvmhabit.base.BaseApplication;
import zp.n;
import zp.o;

/* JADX INFO: loaded from: classes6.dex */
public class ExtensionShareActivity extends BaseActivity<ActivityExtensionShareBinding, EXTENSIONSHAREVIEWMODEL> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SimpleShareDialog f44908t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ExtensionShareEntry f44909u;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Void r22) {
        if (this.f44909u != null) {
            if (this.f44908t == null) {
                this.f44908t = new SimpleShareDialog(this, this, this.f44909u);
            }
            this.f44908t.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(ExtensionShareEntry extensionShareEntry) {
        this.f44909u = extensionShareEntry;
        if (!o.b(extensionShareEntry.getWx_app_url())) {
            Bitmap bitmapA = a.a(extensionShareEntry.getWx_app_url(), j0.a(this, 180.0f), j0.a(this, 180.0f), BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
            ((ActivityExtensionShareBinding) this.f42500o).f42617d.setImageBitmap(bitmapA);
            ((ActivityExtensionShareBinding) this.f42500o).f42617d.setImageBitmap(bitmapA);
        }
        if (extensionShareEntry.getInvited_conf() == null || extensionShareEntry.getInvited_conf().size() <= 0) {
            return;
        }
        ((ActivityExtensionShareBinding) this.f42500o).f42618e.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        int i10 = R.layout.extension_share_tv;
        ViewGroup viewGroup = null;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.extension_share_tv, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.tv_name)).setText(getResources().getString(R.string.str_share_intro1, (((int) extensionShareEntry.getInvited_reward()) / 86400) + ""));
        ((ActivityExtensionShareBinding) this.f42500o).f42618e.addView(viewInflate);
        int i11 = 0;
        while (i11 < extensionShareEntry.getInvited_conf().size()) {
            View viewInflate2 = LayoutInflater.from(this).inflate(i10, viewGroup);
            TextView textView = (TextView) viewInflate2.findViewById(R.id.tv_name);
            if (extensionShareEntry.getInvited_conf().get(i11).getInvited_reward_vip() == 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11 + 2);
                sb2.append(".");
                sb2.append(getResources().getString(R.string.str_share_intro2, extensionShareEntry.getInvited_conf().get(i11).getInvited_user() + ""));
                textView.setText(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i11 + 2);
                sb3.append(".");
                sb3.append(getResources().getString(R.string.str_share_intro3, extensionShareEntry.getInvited_conf().get(i11).getInvited_user() + "", (((int) extensionShareEntry.getInvited_conf().get(i11).getInvited_reward_vip()) / 86400) + ""));
                textView.setText(sb3.toString());
            }
            ((ActivityExtensionShareBinding) this.f42500o).f42618e.addView(viewInflate2);
            i11++;
            i10 = R.layout.extension_share_tv;
            viewGroup = null;
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_extension_share;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        ((EXTENSIONSHAREVIEWMODEL) this.f42501p).p();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public EXTENSIONSHAREVIEWMODEL initViewModel() {
        return new EXTENSIONSHAREVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((EXTENSIONSHAREVIEWMODEL) this.f42501p).f43977p.observe(this, new Observer() { // from class: zc.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f98270b.p((Void) obj);
            }
        });
        ((EXTENSIONSHAREVIEWMODEL) this.f42501p).f43976o.observe(this, new Observer() { // from class: zc.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f98271b.q((ExtensionShareEntry) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
