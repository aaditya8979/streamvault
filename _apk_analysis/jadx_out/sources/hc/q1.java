package hc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.mgs.carparking.model.FEEDBACKVIEWMODEL;
import com.mgs.carparking.netbean.FeedbackTypeEntry;

/* JADX INFO: compiled from: ITEMFEEDBACKTYPEVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class q1 extends np.c<FEEDBACKVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FEEDBACKVIEWMODEL f63334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FeedbackTypeEntry f63335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<Boolean> f63336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableList<q1> f63337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pp.b f63338g;

    public q1(@NonNull FEEDBACKVIEWMODEL feedbackviewmodel, FeedbackTypeEntry feedbackTypeEntry, ObservableList<q1> observableList, int i10) {
        super(feedbackviewmodel);
        this.f63336e = new ObservableField<>(Boolean.FALSE);
        this.f63338g = new pp.b(new pp.a() { // from class: hc.p1
            @Override // pp.a
            public final void call() {
                this.f63310a.b();
            }
        });
        this.f63334c = feedbackviewmodel;
        this.f63335d = feedbackTypeEntry;
        this.f63333b = i10;
        this.f63337f = observableList;
        this.f63336e.set(Boolean.valueOf(feedbackTypeEntry.isFlag()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.f63336e.get().booleanValue()) {
            return;
        }
        this.f63336e.set(Boolean.TRUE);
        for (int i10 = 0; i10 < this.f63337f.size(); i10++) {
            if (i10 != this.f63333b) {
                this.f63337f.get(i10).f63336e.set(Boolean.FALSE);
            }
        }
    }
}
