package hc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.VideoBean;

/* JADX INFO: compiled from: ITEMVIDEOVARIETYSETNUMVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class e3 extends np.c<VIDEOPLAYDETAILVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VideoBean f63187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<Boolean> f63188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pp.b f63189d;

    public e3(@NonNull VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, VideoBean videoBean, int i10, String str) {
        super(videoplaydetailviewmodel);
        this.f63188c = new ObservableField<>(Boolean.FALSE);
        this.f63189d = new pp.b(new pp.a() { // from class: hc.d3
            @Override // pp.a
            public final void call() {
                this.f63180a.b();
            }
        });
        this.f63187b = videoBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((VIDEOPLAYDETAILVIEWMODEL) this.f75954a).W0(this.f63187b.position);
    }
}
