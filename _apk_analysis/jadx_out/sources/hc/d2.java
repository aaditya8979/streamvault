package hc;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.ORDERLISTVIEWMODEL;
import com.mgs.carparking.netbean.OrderListEntry;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: ITEMORDERLISTVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class d2 extends np.c<ORDERLISTVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OrderListEntry f63174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<String> f63175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<String> f63176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f63177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f63178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f63179g;

    public d2(@NonNull ORDERLISTVIEWMODEL orderlistviewmodel, OrderListEntry orderListEntry) {
        super(orderlistviewmodel);
        this.f63175c = new ObservableField<>();
        this.f63176d = new ObservableField<>();
        this.f63177e = new ObservableField<>();
        this.f63178f = new ObservableField<>();
        this.f63179g = new ObservableField<>();
        this.f63174b = orderListEntry;
        if (orderListEntry.getPay_status().equals("1")) {
            this.f63177e.set(zp.r.b().getResources().getString(R.string.str_order_status1));
        } else {
            this.f63177e.set(zp.r.b().getResources().getString(R.string.str_order_status));
        }
        this.f63179g.set(orderListEntry.getTitle());
        this.f63178f.set(orderListEntry.getPrice());
        this.f63176d.set(zp.r.b().getResources().getString(R.string.str_order_id) + StringUtils.PROCESS_POSTFIX_DELIMITER + String.valueOf(orderListEntry.getId()));
    }
}
