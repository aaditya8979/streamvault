package nc;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.ui.channelcontent.SpecialDetailNewActivity;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeContentMultipleSpecialListItemViewModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class e1 extends np.c<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BlockListEntry f75764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pp.b f75767e;

    public e1(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, BlockListEntry blockListEntry, int i10, int i11) {
        super(homeContentMultipleListViewModel);
        this.f75767e = new pp.b(new pp.a() { // from class: nc.d1
            @Override // pp.a
            public final void call() {
                this.f75760a.b();
            }
        });
        this.f75764b = blockListEntry;
        this.f75765c = i10;
        this.f75766d = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f75764b.getTopic_id());
        ((HomeContentMultipleListViewModel) this.f75954a).startActivity(SpecialDetailNewActivity.class, bundle);
    }
}
