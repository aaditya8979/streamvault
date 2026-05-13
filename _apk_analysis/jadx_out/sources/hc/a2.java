package hc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.LOOKCHANNELVIEWMODEL;
import com.mgs.carparking.netbean.ChannnelFilterEntry;

/* JADX INFO: compiled from: ITEMLOOKCHANNELTYPECHANNELVIEWMODEL.java */
/* JADX INFO: loaded from: classes2.dex */
public class a2 extends np.c<LOOKCHANNELVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ChannnelFilterEntry f63133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<Boolean> f63135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pp.b f63136e;

    public a2(@NonNull LOOKCHANNELVIEWMODEL lookchannelviewmodel, ChannnelFilterEntry channnelFilterEntry, int i10, int i11) {
        super(lookchannelviewmodel);
        this.f63135d = new ObservableField<>(Boolean.FALSE);
        this.f63136e = new pp.b(new pp.a() { // from class: hc.z1
            @Override // pp.a
            public final void call() {
                this.f63481a.b();
            }
        });
        this.f63133b = channnelFilterEntry;
        this.f63134c = i10;
        if (i10 == 0) {
            this.f63135d.set(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((LOOKCHANNELVIEWMODEL) this.f75954a).z(this.f63134c, this.f63133b);
    }
}
