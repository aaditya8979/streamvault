package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import pp.b;
import zp.r;

/* JADX INFO: loaded from: classes12.dex */
public class DOWNLOADVIEWMODEL extends ToolbarViewModel<yb.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<String> f43945o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f43946p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f43947q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<Boolean> f43948r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableBoolean f43949s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableBoolean f43950t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<Void> f43951u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SingleLiveEvent<Void> f43952v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f43953w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f43954x;

    public DOWNLOADVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f43945o = new ObservableField<>(r.b().getResources().getString(R.string.str_edit));
        this.f43946p = new ObservableField<>(r.b().getResources().getString(R.string.str_edit));
        this.f43947q = new ObservableField<>(Boolean.TRUE);
        this.f43948r = new ObservableField<>(Boolean.FALSE);
        this.f43949s = new ObservableBoolean(false);
        this.f43950t = new ObservableBoolean(false);
        this.f43951u = new SingleLiveEvent<>();
        this.f43952v = new SingleLiveEvent<>();
        this.f43953w = new b(new pp.a() { // from class: hc.u
            @Override // pp.a
            public final void call() {
                this.f63389a.p();
            }
        });
        this.f43954x = new b(new pp.a() { // from class: hc.v
            @Override // pp.a
            public final void call() {
                this.f63402a.q();
            }
        });
        this.f44963g.set(r.b().getResources().getString(R.string.text_mine_download));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        if (this.f43949s.get()) {
            this.f43945o.set(r.b().getResources().getString(R.string.str_edit));
            this.f43949s.set(false);
        } else {
            this.f43945o.set(r.b().getResources().getString(R.string.text_cannel));
            this.f43949s.set(true);
        }
        this.f43951u.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f43950t.get()) {
            this.f43946p.set(r.b().getResources().getString(R.string.str_edit));
            this.f43950t.set(false);
        } else {
            this.f43946p.set(r.b().getResources().getString(R.string.text_cannel));
            this.f43950t.set(true);
        }
        this.f43952v.call();
    }
}
