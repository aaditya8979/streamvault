package hc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.VideoBean;

/* JADX INFO: compiled from: ITEMVIDEOSETNUMVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class c3 extends np.c<VIDEOPLAYDETAILVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VideoBean f63163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<String> f63164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<Boolean> f63165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<Boolean> f63166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pp.b f63168g;

    public c3(@NonNull VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, VideoBean videoBean, int i10) {
        super(videoplaydetailviewmodel);
        this.f63164c = new ObservableField<>();
        this.f63165d = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f63166e = new ObservableField<>(bool);
        this.f63168g = new pp.b(new pp.a() { // from class: hc.b3
            @Override // pp.a
            public final void call() {
                this.f63145a.b();
            }
        });
        this.f63163b = videoBean;
        this.f63167f = i10;
        if (zp.o.b(videoBean.getVod_url())) {
            this.f63165d.set(Boolean.TRUE);
        } else {
            this.f63165d.set(bool);
        }
        this.f63164c.set(this.f63163b.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (zp.o.b(this.f63163b.getVod_url())) {
            return;
        }
        ((VIDEOPLAYDETAILVIEWMODEL) this.f75954a).X0(this.f63163b.position);
    }
}
