package hc;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.model.DOWNLOADCOMPLETEVIEWMODEL;
import com.mgs.carparking.ui.mine.DownloadCompleteSecondActivity;
import com.mgs.carparking.ui.mine.DownloadVideoPlayActivity;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: ITEMDOWNLOADCOMPLETEVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class c1 extends np.c<DOWNLOADCOMPLETEVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ObservableField<Boolean> f63149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DOWNLOADCOMPLETEVIEWMODEL f63150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<VideoDownloadEntity> f63151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f63152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f63153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f63154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pp.b f63155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public pp.b f63156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public pp.b f63157j;

    public c1(@NonNull DOWNLOADCOMPLETEVIEWMODEL downloadcompleteviewmodel, List<VideoDownloadEntity> list) {
        super(downloadcompleteviewmodel);
        this.f63149b = new ObservableField<>(Boolean.FALSE);
        this.f63152e = new ObservableField<>("");
        this.f63153f = new ObservableField<>("");
        this.f63154g = new ObservableField<>("");
        this.f63155h = new pp.b(new pp.a() { // from class: hc.z0
            @Override // pp.a
            public final void call() {
                this.f63480a.d();
            }
        });
        this.f63156i = new pp.b(new pp.a() { // from class: hc.a1
            @Override // pp.a
            public final void call() {
                this.f63132a.e();
            }
        });
        this.f63157j = new pp.b(new pp.a() { // from class: hc.b1
            @Override // pp.a
            public final void call() {
                this.f63143a.f();
            }
        });
        this.f63150c = downloadcompleteviewmodel;
        this.f63151d = list;
        if (list.size() > 0) {
            if (list.size() == 1) {
                this.f63154g.set("");
                this.f63153f.set(list.get(0).getComplete_name());
            } else {
                this.f63154g.set(list.size() + zp.r.b().getResources().getString(R.string.text_colections));
                this.f63153f.set(list.get(0).getName());
            }
        }
        long size = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            size += list.get(i10).getSize();
        }
        this.f63152e.set(ed.g0.a(size));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f63151d.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        if (this.f63150c.f43910h.get()) {
            this.f63149b.set(Boolean.valueOf(!r0.get().booleanValue()));
            if (!this.f63149b.get().booleanValue()) {
                this.f63150c.f43913k.remove(this);
                this.f63150c.f43911i.set(zp.r.b().getResources().getString(R.string.text_all_select));
            } else {
                this.f63150c.f43913k.add(this);
                if (this.f63150c.f43914l.size() == this.f63150c.f43913k.size()) {
                    this.f63150c.f43911i.set(zp.r.b().getResources().getString(R.string.text_unall_select));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f63151d.size() > 1) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("entityList", (Serializable) this.f63151d);
            this.f63150c.startActivity(DownloadCompleteSecondActivity.class, bundle);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("videoDownloadEntry", this.f63151d.get(0));
            bundle2.putBoolean("flag", false);
            this.f63150c.startActivity(DownloadVideoPlayActivity.class, bundle2);
        }
    }
}
