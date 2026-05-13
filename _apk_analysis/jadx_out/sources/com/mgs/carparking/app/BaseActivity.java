package com.mgs.carparking.app;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.mgs.carparking.ui.login.splash.SplashActivity;
import com.safedk.android.utils.Logger;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.ContainerActivity;
import me.goldze.mvvmhabit.widget.CustomProgressDialog;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseActivity<V extends ViewDataBinding, VM extends BaseViewModel> extends RxAppCompatActivity {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public V f42500o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public VM f42501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f42502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CustomProgressDialog f42503r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public bm.a f42504s;

    public class a implements Observer<String> {
        public a() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable String str) {
            BaseActivity.this.showDialog(str);
        }
    }

    public class b implements Observer<Void> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void r12) {
            BaseActivity.this.dismissDialog();
        }
    }

    public class c implements Observer<Map<String, Object>> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Map<String, Object> map) {
            BaseActivity.this.startActivity((Class<?>) map.get(BaseViewModel.a.f74149a), (Bundle) map.get(BaseViewModel.a.f74151c));
        }
    }

    public class d implements Observer<Map<String, Object>> {
        public d() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Map<String, Object> map) {
            BaseActivity.this.startContainerActivity((String) map.get(BaseViewModel.a.f74150b), (Bundle) map.get(BaseViewModel.a.f74151c));
        }
    }

    public class e implements Observer<Void> {
        public e() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void r12) {
            BaseActivity.this.finish();
        }
    }

    public class f implements Observer<Void> {
        public f() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void r12) {
            BaseActivity.this.onBackPressed();
        }
    }

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity componentActivity, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        componentActivity.startActivityForResult(intent, i10);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }

    public <T extends ViewModel> T createViewModel(FragmentActivity fragmentActivity, Class<T> cls) {
        return (T) ViewModelProviders.of(fragmentActivity).get(cls);
    }

    public void dismissDialog() {
        CustomProgressDialog customProgressDialog = this.f42503r;
        if (customProgressDialog == null || !customProgressDialog.isShowing()) {
            return;
        }
        this.f42503r.dismiss();
    }

    public abstract int initContentView(Bundle bundle);

    public void initData() {
    }

    public void initParam() {
    }

    public abstract int initVariableId();

    public VM initViewModel() {
        return null;
    }

    public void initViewObservable() {
    }

    public void k(bm.b bVar) {
        if (this.f42504s == null) {
            this.f42504s = new bm.a();
        }
        this.f42504s.a(bVar);
    }

    public final void l(Bundle bundle) {
        this.f42500o = (V) DataBindingUtil.setContentView(this, initContentView(bundle));
        this.f42502q = initVariableId();
        VM vm2 = (VM) initViewModel();
        this.f42501p = vm2;
        if (vm2 == null) {
            Type genericSuperclass = getClass().getGenericSuperclass();
            this.f42501p = (VM) createViewModel(this, genericSuperclass instanceof ParameterizedType ? (Class) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1] : BaseViewModel.class);
        }
        this.f42500o.setVariable(this.f42502q, this.f42501p);
        getLifecycle().addObserver(this.f42501p);
        this.f42501p.f(this);
    }

    public void m() {
        this.f42501p.e().k().observe(this, new a());
        this.f42501p.e().h().observe(this, new b());
        this.f42501p.e().l().observe(this, new c());
        this.f42501p.e().m().observe(this, new d());
        this.f42501p.e().i().observe(this, new e());
        this.f42501p.e().j().observe(this, new f());
    }

    @Override // android.app.Activity
    public boolean moveTaskToBack(boolean z10) {
        return super.moveTaskToBack(true);
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle = null;
        }
        super.onCreate(bundle);
        this.f42504s = new bm.a();
        if (np.b.b().a() == 0) {
            Intent intent = new Intent(this, (Class<?>) SplashActivity.class);
            intent.setFlags(32768);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            finish();
            return;
        }
        initParam();
        l(bundle);
        m();
        initData();
        initViewObservable();
        this.f42501p.h();
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        np.d.c().d(this.f42501p);
        VM vm2 = this.f42501p;
        if (vm2 != null) {
            vm2.i();
        }
        V v10 = this.f42500o;
        if (v10 != null) {
            v10.unbind();
        }
        this.f42504s.dispose();
    }

    public void refreshLayout() {
        VM vm2 = this.f42501p;
        if (vm2 != null) {
            this.f42500o.setVariable(this.f42502q, vm2);
        }
    }

    public void setstatusBarMargin(View view) {
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = zp.e.a(this);
        view.setLayoutParams(layoutParams);
    }

    public void showDialog(String str) {
        CustomProgressDialog customProgressDialog = this.f42503r;
        if (customProgressDialog != null) {
            customProgressDialog.show();
            return;
        }
        CustomProgressDialog customProgressDialog2 = CustomProgressDialog.getInstance(this, str, true, null);
        this.f42503r = customProgressDialog2;
        customProgressDialog2.show();
    }

    public void startActivity(Class<?> cls) {
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, new Intent(this, cls));
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void startActivity(Class<?> cls, Bundle bundle) {
        Intent intent = new Intent(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void startActivityForResult(Class<?> cls, Bundle bundle) {
        Intent intent = new Intent(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, intent, 1);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void startActivityForResult(Class<?> cls, Bundle bundle, int i10) {
        Intent intent = new Intent(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, intent, i10);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void startContainerActivity(String str) {
        startContainerActivity(str, null);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void startContainerActivity(String str, Bundle bundle) {
        Intent intent = new Intent(this, (Class<?>) ContainerActivity.class);
        intent.putExtra(ContainerActivity.FRAGMENT, str);
        if (bundle != null) {
            intent.putExtra(ContainerActivity.BUNDLE, bundle);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
