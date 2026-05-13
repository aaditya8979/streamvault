package hc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.SeriesInfoEntry;

/* JADX INFO: compiled from: ITEMVIDEOSEASONVIEWMODEL.java */
/* JADX INFO: loaded from: classes12.dex */
public class a3 extends np.c<VIDEOPLAYDETAILVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SeriesInfoEntry f63137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<Boolean> f63138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pp.b f63139d;

    public a3(@NonNull VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, SeriesInfoEntry seriesInfoEntry) {
        super(videoplaydetailviewmodel);
        Boolean bool = Boolean.FALSE;
        this.f63138c = new ObservableField<>(bool);
        this.f63139d = new pp.b(new pp.a() { // from class: hc.z2
            @Override // pp.a
            public final void call() {
                this.f63482a.b();
            }
        });
        this.f63137b = seriesInfoEntry;
        if (seriesInfoEntry.getDefault().booleanValue()) {
            this.f63138c.set(Boolean.TRUE);
        } else {
            this.f63138c.set(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((VIDEOPLAYDETAILVIEWMODEL) this.f75954a).V0(this.f63137b.getVod_id());
    }
}
