package hc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.CHANNELVIEWMODEL;

/* JADX INFO: compiled from: ITEMCHANNELTYPECOMMONVIEWMODEL.java */
/* JADX INFO: loaded from: classes3.dex */
public class s0 extends np.c<CHANNELVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f63350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<Boolean> f63351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pp.b f63354f;

    public s0(@NonNull CHANNELVIEWMODEL channelviewmodel, String str, int i10, int i11) {
        super(channelviewmodel);
        this.f63351c = new ObservableField<>(Boolean.FALSE);
        this.f63354f = new pp.b(new pp.a() { // from class: hc.r0
            @Override // pp.a
            public final void call() {
                this.f63343a.b();
            }
        });
        this.f63350b = str;
        this.f63352d = i10;
        this.f63353e = i11;
        if (i11 == 1 || i10 != 0) {
            return;
        }
        this.f63351c.set(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        int i10 = this.f63353e;
        if (i10 == 1) {
            ((CHANNELVIEWMODEL) this.f75954a).y(this.f63352d, this.f63350b);
            return;
        }
        if (i10 == 2) {
            ((CHANNELVIEWMODEL) this.f75954a).z(this.f63352d, this.f63350b);
        } else if (i10 == 3) {
            ((CHANNELVIEWMODEL) this.f75954a).A(this.f63352d, this.f63350b);
        } else if (i10 == 4) {
            ((CHANNELVIEWMODEL) this.f75954a).B(this.f63352d, this.f63350b);
        }
    }
}
