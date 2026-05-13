package me.goldze.mvvmhabit.base;

import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import bm.b;
import com.trello.rxlifecycle2.LifecycleProvider;
import dm.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import me.goldze.mvvmhabit.R$string;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import tp.a;
import zp.r;

/* JADX INFO: loaded from: classes11.dex */
public class BaseViewModel<M extends tp.a> extends AndroidViewModel implements IBaseViewModel, g<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M f74138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseViewModel<M>.UIChangeLiveData f74139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference<LifecycleProvider> f74140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bm.a f74141e;

    public final class UIChangeLiveData extends SingleLiveEvent {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SingleLiveEvent<String> f74142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SingleLiveEvent<Void> f74143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SingleLiveEvent<Map<String, Object>> f74144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public SingleLiveEvent<Map<String, Object>> f74145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SingleLiveEvent<Void> f74146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public SingleLiveEvent<Void> f74147g;

        public UIChangeLiveData() {
        }

        public final SingleLiveEvent g(SingleLiveEvent singleLiveEvent) {
            return singleLiveEvent == null ? new SingleLiveEvent() : singleLiveEvent;
        }

        public SingleLiveEvent<Void> h() {
            SingleLiveEvent<Void> singleLiveEventG = g(this.f74143c);
            this.f74143c = singleLiveEventG;
            return singleLiveEventG;
        }

        public SingleLiveEvent<Void> i() {
            SingleLiveEvent<Void> singleLiveEventG = g(this.f74146f);
            this.f74146f = singleLiveEventG;
            return singleLiveEventG;
        }

        public SingleLiveEvent<Void> j() {
            SingleLiveEvent<Void> singleLiveEventG = g(this.f74147g);
            this.f74147g = singleLiveEventG;
            return singleLiveEventG;
        }

        public SingleLiveEvent<String> k() {
            SingleLiveEvent<String> singleLiveEventG = g(this.f74142b);
            this.f74142b = singleLiveEventG;
            return singleLiveEventG;
        }

        public SingleLiveEvent<Map<String, Object>> l() {
            SingleLiveEvent<Map<String, Object>> singleLiveEventG = g(this.f74144d);
            this.f74144d = singleLiveEventG;
            return singleLiveEventG;
        }

        public SingleLiveEvent<Map<String, Object>> m() {
            SingleLiveEvent<Map<String, Object>> singleLiveEventG = g(this.f74145e);
            this.f74145e = singleLiveEventG;
            return singleLiveEventG;
        }

        @Override // me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent, androidx.lifecycle.LiveData
        public void observe(LifecycleOwner lifecycleOwner, Observer observer) {
            super.observe(lifecycleOwner, observer);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static String f74149a = "CLASS";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static String f74150b = "CANONICAL_NAME";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static String f74151c = "BUNDLE";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static String f74152d = "FROM_CLASS";
    }

    public BaseViewModel(@NonNull Application application) {
        this(application, null);
    }

    public BaseViewModel(@NonNull Application application, M m10) {
        super(application);
        this.f74138b = m10;
        this.f74141e = new bm.a();
    }

    @Override // dm.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(b bVar) throws Exception {
        b(bVar);
    }

    public void b(b bVar) {
        if (this.f74141e == null) {
            this.f74141e = new bm.a();
        }
        this.f74141e.a(bVar);
    }

    public void c() {
        this.f74139c.f74143c.call();
    }

    public void d() {
        this.f74139c.f74146f.call();
    }

    public BaseViewModel<M>.UIChangeLiveData e() {
        if (this.f74139c == null) {
            this.f74139c = new UIChangeLiveData();
        }
        return this.f74139c;
    }

    public void f(LifecycleProvider lifecycleProvider) {
        this.f74140d = new WeakReference<>(lifecycleProvider);
    }

    public void g() {
        this.f74139c.f74147g.call();
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
        k(r.b().getResources().getString(R$string.str_wait));
    }

    public void k(String str) {
        this.f74139c.f74142b.postValue(str);
    }

    @Override // me.goldze.mvvmhabit.base.IBaseViewModel
    public void onAny(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        zp.g.a("onCleared");
        M m10 = this.f74138b;
        if (m10 != null) {
            m10.Z();
        }
        bm.a aVar = this.f74141e;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // me.goldze.mvvmhabit.base.IBaseViewModel
    public void onCreate() {
        zp.g.a("onCreate");
    }

    public void onDestroy() {
        zp.g.a("onDestroy:" + getClass().getName());
        onCleared();
    }

    @Override // me.goldze.mvvmhabit.base.IBaseViewModel
    public void onPause() {
    }

    @Override // me.goldze.mvvmhabit.base.IBaseViewModel
    public void onResume() {
    }

    @Override // me.goldze.mvvmhabit.base.IBaseViewModel
    public void onStart() {
    }

    @Override // me.goldze.mvvmhabit.base.IBaseViewModel
    public void onStop() {
    }

    public void startActivity(Class<?> cls) {
        startActivity(cls, new Bundle());
    }

    public void startActivity(Class<?> cls, Bundle bundle) {
        HashMap map = new HashMap();
        map.put(a.f74149a, cls);
        if (bundle != null) {
            bundle.putString(a.f74152d, getClass().getName());
            map.put(a.f74151c, bundle);
        }
        this.f74139c.f74144d.postValue(map);
    }
}
