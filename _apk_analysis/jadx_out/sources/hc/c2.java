package hc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.LOOKCHANNELVIEWMODEL;

/* JADX INFO: compiled from: ITEMLOOKCHANNELTYPECOMMONVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class c2 extends np.c<LOOKCHANNELVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f63158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<Boolean> f63159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pp.b f63162f;

    public c2(@NonNull LOOKCHANNELVIEWMODEL lookchannelviewmodel, String str, int i10, int i11) {
        super(lookchannelviewmodel);
        this.f63159c = new ObservableField<>(Boolean.FALSE);
        this.f63162f = new pp.b(new pp.a() { // from class: hc.b2
            @Override // pp.a
            public final void call() {
                this.f63144a.b();
            }
        });
        this.f63158b = str;
        this.f63160d = i10;
        this.f63161e = i11;
        if (i10 == 0) {
            this.f63159c.set(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        int i10 = this.f63161e;
        if (i10 == 1) {
            ((LOOKCHANNELVIEWMODEL) this.f75954a).A(this.f63160d, this.f63158b);
            return;
        }
        if (i10 == 2) {
            ((LOOKCHANNELVIEWMODEL) this.f75954a).B(this.f63160d, this.f63158b);
        } else if (i10 == 3) {
            ((LOOKCHANNELVIEWMODEL) this.f75954a).C(this.f63160d, this.f63158b);
        } else if (i10 == 4) {
            ((LOOKCHANNELVIEWMODEL) this.f75954a).D(this.f63160d, this.f63158b);
        }
    }
}
