package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import aq.c;
import com.dramarush.shortin.R;
import com.mgs.carparking.db.VideoLookHistoryDao;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import hc.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import pp.b;
import zp.r;

/* JADX INFO: loaded from: classes3.dex */
public class HISTORYVIEWMODEL extends ToolbarViewModel<yb.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableBoolean f44009o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f44010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<VideoLookHistoryEntry> f44011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<VideoLookHistoryEntry> f44012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableArrayList<v1> f44013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableArrayList<v1> f44014t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c<v1> f44015u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f44016v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f44017w;

    public HISTORYVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44009o = new ObservableBoolean(false);
        this.f44010p = new ObservableField<>(r.b().getResources().getString(R.string.text_all_select));
        this.f44011q = new SingleLiveEvent<>();
        this.f44012r = new ArrayList();
        this.f44013s = new ObservableArrayList<>();
        this.f44014t = new ObservableArrayList<>();
        this.f44015u = c.c(7, R.layout.item_mine_history);
        this.f44016v = new b(new pp.a() { // from class: hc.h0
            @Override // pp.a
            public final void call() {
                this.f63213a.q();
            }
        });
        this.f44017w = new b(new pp.a() { // from class: hc.i0
            @Override // pp.a
            public final void call() {
                this.f63221a.r();
            }
        });
        this.f44963g.set(r.b().getResources().getString(R.string.text_mine_history));
        this.f44965i.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        for (v1 v1Var : this.f44013s) {
            this.f44014t.remove(v1Var);
            VideoLookHistoryDao.getInstance().deleteHistory(v1Var.f63403b);
        }
        if (this.f44014t.size() == 0) {
            this.f44965i.set(false);
            this.f44009o.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (!this.f44010p.get().equals(r.b().getResources().getString(R.string.text_all_select))) {
            Iterator<v1> it = this.f44014t.iterator();
            while (it.hasNext()) {
                it.next().f63405d.set(Boolean.FALSE);
                this.f44013s.clear();
            }
            this.f44010p.set(r.b().getResources().getString(R.string.text_all_select));
            return;
        }
        for (v1 v1Var : this.f44014t) {
            v1Var.f63405d.set(Boolean.TRUE);
            this.f44013s.add(v1Var);
        }
        this.f44010p.set(r.b().getResources().getString(R.string.text_unall_select));
    }

    @Override // com.mgs.carparking.ui.toolbar.ToolbarViewModel
    public void m() {
        if (!this.f44009o.get()) {
            this.f44967k.set(ContextCompat.getDrawable(getApplication(), R.drawable.ic_edit_close));
            this.f44009o.set(true);
            return;
        }
        this.f44009o.set(false);
        this.f44013s.clear();
        this.f44967k.set(ContextCompat.getDrawable(getApplication(), R.drawable.ic_edits));
        Iterator<v1> it = this.f44014t.iterator();
        while (it.hasNext()) {
            it.next().f63405d.set(Boolean.FALSE);
        }
    }

    public void p(VideoLookHistoryEntry videoLookHistoryEntry) {
        this.f44011q.setValue(videoLookHistoryEntry);
    }

    public void s() {
        ArrayList<VideoLookHistoryEntry> arrayListQueryHistory = VideoLookHistoryDao.getInstance().queryHistory();
        this.f44012r = arrayListQueryHistory;
        if (arrayListQueryHistory.size() == 0) {
            this.f44965i.set(false);
        } else {
            this.f44965i.set(true);
            this.f44964h.set("");
            this.f44967k.set(ContextCompat.getDrawable(getApplication(), R.drawable.ic_edits));
        }
        this.f44014t.clear();
        Iterator<VideoLookHistoryEntry> it = this.f44012r.iterator();
        while (it.hasNext()) {
            this.f44014t.add(new v1(this, it.next()));
        }
    }
}
