package hc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.model.HISTORYVIEWMODEL;

/* JADX INFO: compiled from: ITEMHISTORYVIEWMODEL.java */
/* JADX INFO: loaded from: classes3.dex */
public class v1 extends np.c<HISTORYVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VideoLookHistoryEntry f63403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<String> f63404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<Boolean> f63405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HISTORYVIEWMODEL f63406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pp.b f63407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pp.b f63408g;

    public v1(@NonNull HISTORYVIEWMODEL historyviewmodel, VideoLookHistoryEntry videoLookHistoryEntry) {
        super(historyviewmodel);
        this.f63404c = new ObservableField<>("");
        this.f63405d = new ObservableField<>(Boolean.FALSE);
        this.f63407f = new pp.b(new pp.a() { // from class: hc.t1
            @Override // pp.a
            public final void call() {
                this.f63366a.c();
            }
        });
        this.f63408g = new pp.b(new pp.a() { // from class: hc.u1
            @Override // pp.a
            public final void call() {
                this.f63397a.d();
            }
        });
        this.f63406e = historyviewmodel;
        this.f63403b = videoLookHistoryEntry;
        if (videoLookHistoryEntry.getDuration() - videoLookHistoryEntry.getContentPosition() > 100) {
            this.f63404c.set(zp.r.b().getResources().getString(R.string.str_leave) + ed.i0.b(videoLookHistoryEntry.getDuration() - videoLookHistoryEntry.getContentPosition()));
            return;
        }
        if (videoLookHistoryEntry.getDuration() - videoLookHistoryEntry.getContentPosition() == 0) {
            this.f63404c.set("0% " + zp.r.b().getResources().getString(R.string.str_look_time));
            return;
        }
        this.f63404c.set("100% " + zp.r.b().getResources().getString(R.string.str_look_time));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (this.f63406e.f44009o.get()) {
            this.f63405d.set(Boolean.valueOf(!r0.get().booleanValue()));
            if (!this.f63405d.get().booleanValue()) {
                this.f63406e.f44013s.remove(this);
                this.f63406e.f44010p.set(zp.r.b().getResources().getString(R.string.text_all_select));
            } else {
                this.f63406e.f44013s.add(this);
                if (this.f63406e.f44014t.size() == this.f63406e.f44013s.size()) {
                    this.f63406e.f44010p.set(zp.r.b().getResources().getString(R.string.text_unall_select));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        if (this.f63406e.f44009o.get()) {
            return;
        }
        this.f63406e.p(this.f63403b);
    }
}
