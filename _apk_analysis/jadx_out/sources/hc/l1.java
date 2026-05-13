package hc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.EXTENSIONRECORDVIEWMODEL;
import com.mgs.carparking.netbean.ExtensionRecordEntry;

/* JADX INFO: compiled from: ITEMEXTENSIONRECORDVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class l1 extends np.c<EXTENSIONRECORDVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExtensionRecordEntry.InvitedList f63258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<String> f63259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<String> f63260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f63261e;

    public l1(@NonNull EXTENSIONRECORDVIEWMODEL extensionrecordviewmodel, ExtensionRecordEntry.InvitedList invitedList) {
        super(extensionrecordviewmodel);
        this.f63259c = new ObservableField<>();
        this.f63260d = new ObservableField<>();
        this.f63261e = new ObservableField<>();
        this.f63258b = invitedList;
        this.f63259c.set(invitedList.getHead_img());
        this.f63260d.set(invitedList.getNickname());
        this.f63261e.set(zp.r.b().getResources().getString(R.string.str_extension_histroy_register_time) + invitedList.getCreate_at());
    }
}
