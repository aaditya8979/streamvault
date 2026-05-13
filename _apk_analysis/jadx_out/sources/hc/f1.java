package hc;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.model.DOWNLOADCOMPLETESECONDVIEWMODEL;
import com.mgs.carparking.ui.mine.DownloadVideoPlayActivity;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: ITEMDOWNLOADCONPLETESECONDVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class f1 extends np.c<DOWNLOADCOMPLETESECONDVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DOWNLOADCOMPLETESECONDVIEWMODEL f63193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<VideoDownloadEntity> f63194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VideoDownloadEntity f63195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f63196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<Boolean> f63197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pp.b f63198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pp.b f63199h;

    public f1(@NonNull DOWNLOADCOMPLETESECONDVIEWMODEL downloadcompletesecondviewmodel, VideoDownloadEntity videoDownloadEntity, List<VideoDownloadEntity> list) {
        super(downloadcompletesecondviewmodel);
        this.f63196e = new ObservableField<>("");
        this.f63197f = new ObservableField<>(Boolean.FALSE);
        this.f63198g = new pp.b(new pp.a() { // from class: hc.d1
            @Override // pp.a
            public final void call() {
                this.f63173a.c();
            }
        });
        this.f63199h = new pp.b(new pp.a() { // from class: hc.e1
            @Override // pp.a
            public final void call() {
                this.f63185a.d();
            }
        });
        this.f63193b = downloadcompletesecondviewmodel;
        this.f63194c = list;
        this.f63195d = videoDownloadEntity;
        this.f63196e.set(ed.g0.a(videoDownloadEntity.getSize()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (this.f63193b.f43900o.get()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("videoDownloadEntry", this.f63195d);
        bundle.putSerializable("videoDownloadList", (Serializable) this.f63194c);
        bundle.putSerializable("flag", Boolean.TRUE);
        this.f63193b.startActivity(DownloadVideoPlayActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        if (this.f63193b.f43900o.get()) {
            this.f63197f.set(Boolean.valueOf(!r0.get().booleanValue()));
            if (this.f63197f.get().booleanValue()) {
                this.f63193b.f43901p.add(this);
            } else {
                this.f63193b.f43901p.remove(this);
            }
        }
    }
}
