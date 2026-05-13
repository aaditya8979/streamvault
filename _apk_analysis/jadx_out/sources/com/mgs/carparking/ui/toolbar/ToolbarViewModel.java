package com.mgs.carparking.ui.toolbar;

import android.app.Application;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import me.goldze.mvvmhabit.base.BaseViewModel;
import pp.b;
import tp.a;
import zp.r;

/* JADX INFO: loaded from: classes10.dex */
public class ToolbarViewModel<M extends a> extends BaseViewModel<M> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f44962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f44963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f44964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableBoolean f44965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableBoolean f44966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<Drawable> f44967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f44968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f44969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ToolbarViewModel f44970n;

    public ToolbarViewModel(@NonNull Application application) {
        super(application);
        this.f44962f = new ObservableField<>("");
        this.f44963g = new ObservableField<>("");
        this.f44964h = new ObservableField<>(r.b().getResources().getString(R.string.str_edit));
        this.f44965i = new ObservableBoolean(false);
        this.f44966j = new ObservableBoolean(true);
        this.f44967k = new ObservableField<>();
        this.f44968l = new b(new pp.a() { // from class: cd.a
            @Override // pp.a
            public final void call() {
                this.f6553a.l();
            }
        });
        this.f44969m = new b(new pp.a() { // from class: cd.b
            @Override // pp.a
            public final void call() {
                this.f6554a.m();
            }
        });
        this.f44970n = this;
    }

    public ToolbarViewModel(@NonNull Application application, M m10) {
        super(application, m10);
        this.f44962f = new ObservableField<>("");
        this.f44963g = new ObservableField<>("");
        this.f44964h = new ObservableField<>(r.b().getResources().getString(R.string.str_edit));
        this.f44965i = new ObservableBoolean(false);
        this.f44966j = new ObservableBoolean(true);
        this.f44967k = new ObservableField<>();
        this.f44968l = new b(new pp.a() { // from class: cd.a
            @Override // pp.a
            public final void call() {
                this.f6553a.l();
            }
        });
        this.f44969m = new b(new pp.a() { // from class: cd.b
            @Override // pp.a
            public final void call() {
                this.f6554a.m();
            }
        });
        this.f44970n = this;
    }

    public void l() {
        g();
    }

    public void m() {
    }
}
